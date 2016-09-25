package hu.bme.mit.onlab.scdse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import sc.stateChart.State;
import sc.stateChart.StateMachine;
import sc.stateChart.Transient;
import sc.stateChart.Vertex;

public class StateChartCoder implements IStateCoder {
	
	private StateMachine model;
	private ArrayList <State> sortedStates;
	private ArrayList <Transient> sortedTransients;

	@Override
	public void init(Notifier notifier) {
		model = (StateMachine) notifier;
		
		sortedStates = new ArrayList<State>();		
		for (Vertex state : model.getMainRegion().getVertex()){
			sortedStates.add((State)state);
		}
		Collections.sort(sortedStates, new Comparator<State>(){

			@Override
			public int compare(State s1, State s2) {
				return s1.getName().compareTo(s2.getName());
				}
		});
		sortedTransients = new ArrayList<Transient>();
		for (Transient tr : model.getMainRegion().getTransient()){
			sortedTransients.add(tr);
		}
		Collections.sort(sortedTransients, new Comparator<Transient>(){

			@Override
			public int compare(Transient t1, Transient t2) {
				return t1.getName().compareTo(t2.getName());
			}
		});
	}

	@Override
	public Object createStateCode() {
		StringBuilder sb = new StringBuilder();
		sb.append("Active states: ");
		for (State state : sortedStates){
			if (state.isIsActive()){
				sb.append(state.getName());
				sb.append(",");
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
