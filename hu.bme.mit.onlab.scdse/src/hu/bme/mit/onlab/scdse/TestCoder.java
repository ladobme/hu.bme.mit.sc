package hu.bme.mit.onlab.scdse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import hu.bme.mit.onlab.scquery.StateMatch;
import hu.bme.mit.onlab.scquery.StateMatcher;
import sc.stateChart.*;


	public class TestCoder implements IStateCoder {
	
	private StateMachine model;
	private ArrayList <State> states;
	private ArrayList <Transient> transients;
	private ArrayList <ElementContainer> elements;
	ViatraQueryEngine engine;

	@Override
	public void init(Notifier notifier) {
		model = (StateMachine) notifier;
	    StateMatcher matcher;
	    states = new ArrayList<State>();
		try {
			engine = getQueryEngine();
			matcher = StateMatcher.on(engine);
			Collection<StateMatch> matches = matcher.getAllMatches();
			for (StateMatch m : matches){
				states.add(m.getState());
			}
			Collections.sort(states, new Comparator<State>(){

				@Override
				public int compare(State s1, State s2) {
					return s1.getName().compareTo(s2.getName());
					}
			});
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		transients = new ArrayList<Transient>();
		for (Transient tr : model.getMainRegion().getTransient()){
			transients.add(tr);
		}
		Collections.sort(transients, new Comparator<Transient>(){
			@Override
			public int compare(Transient t1, Transient t2) {
				return t1.getName().compareTo(t2.getName());
			}
		});
	}
	
	private ViatraQueryEngine getQueryEngine () throws ViatraQueryException{
		ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(model.eResource()));
		return engine;
	}

	@Override
	public Object createStateCode() {
		StringBuilder sb = new StringBuilder();
		sb.append("Active states: ");
		for (State state : states){
			if (state.isIsActive()){
				sb.append(state.getName());
				sb.append('÷');
			}
		}
		sb.append("Inactive states: ");
		for (State state : states){
			if (!state.isIsActive()){
				sb.append(state.getName());
				sb.append('÷');
			}
		}
		return sb.toString();
	}

	@Override
	public Object createActivationCode(IPatternMatch match) {
		if (match instanceof ActiveStateMatch){
			ActiveStateMatch asm = (ActiveStateMatch) match;
			return asm.getTransient().getName();
		} else
			throw new DSEException ("Unsupported rule.");
	}
}
