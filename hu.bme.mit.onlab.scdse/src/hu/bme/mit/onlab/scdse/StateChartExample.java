package hu.bme.mit.onlab.scdse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Objectives;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.junit.Test;

import hu.bme.mit.onlab.scquery.StateMatch;
import hu.bme.mit.onlab.scquery.StateMatcher;
import hu.bme.mit.onlab.scquery.util.HardObjectQuerySpecification;
import sc.stateChart.State;
import sc.stateChart.StateChartPackage;
import sc.stateChart.StateMachine;

public class StateChartExample {
	
	private BatchTransformationRuleFactory activeStateRule;
	private DesignSpaceExplorer dse;
	private EObject root;
	
	@Test
	public void setUp () throws ViatraQueryException{
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("statechart", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createFileURI("C:\\Repository\\hu.bme.mit.sc\\runtime-EclipseApplication\\SCProject\\hu.bme.mit.onlab.statechart"), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    
	    root = (StateMachine) resource.getContents().get(0);
	    
	    // VQuery block
	    /*ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(resource));
	    StateMatcher matcher = StateMatcher.on(engine);
	    Collection<StateMatch> matches = matcher.getAllMatches();
	    ArrayList<State> states = new ArrayList<State>();
	    for(StateMatch match : matches){
	    	states.add(match.getState());
	    }
	    for(State s : states){
	    	if(s.isIsActive())
	    		System.out.println("Active:"+ s.getName());
	    	else
	    		System.out.println("Inactive:" + s.getName());
	    }*/
	    
	    //DSE block
 		dse = new DesignSpaceExplorer();
	    dse.setInitialModel(root);
	    dse.addMetaModelPackage(root.eClass().getEPackage());
	    dse.setStateCoderFactory(new TestCoderFactory());	 
	    dse.addTransformationRule(new ScRuleProvider().activeStateRule);
	    
	    dse.addObjective(Objectives.createConstraintsObjective("MyHardObjective")
	    		.withHardConstraint(HardObjectQuerySpecification.instance()));
	    
	    dse.startExploration(Strategies.createBfsStrategy());
	    System.out.println(dse.toStringSolutions());
	    
	}
}
