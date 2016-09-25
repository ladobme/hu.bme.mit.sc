package hu.bme.mit.onlab.scdse;

import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Objectives;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.api.strategy.impl.DepthFirstStrategy;
//import org.eclipse.viatra.dse.api.strategy.impl.ParallelBFSStrategy;
//import org.eclipse.viatra.dse.objectives.impl.ModelQueriesHardObjective;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory;
import org.junit.Test;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import hu.bme.mit.onlab.scquery.ActiveStateMatcher;
import hu.bme.mit.onlab.scquery.util.ActiveStateProcessor;
import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification;
import hu.bme.mit.onlab.scquery.util.HardObjectQuerySpecification;
import sc.stateChart.State;
import sc.stateChart.StateMachine;
import sc.stateChart.Transient;

public class StateChartExample {
	
	private DSETransformationRule<?, ?> activeStateRule;
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
	        .createFileURI("D:\\Lado\\OnLab\\StateChart\\runtime-EclipseApplication\\SCProject\\hu.bme.mit.onlab.statechart"), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    root = (StateMachine) resource.getContents().get(0);
	    
	    dse = new DesignSpaceExplorer();
	    dse.setInitialModel(root);
	    dse.addMetaModelPackage(root.eClass().getEPackage());
	    dse.setStateCoderFactory(new StateChartCoderFactory());
	    //dse.setStateCoderFactory(new SimpleStateCoderFactory(dse.getMetaModelPackages()));
	    
	    Logger.getLogger(ParallelBFSStrategy.class).setLevel(Level.DEBUG);
	    
	    activeStateRule = new DSETransformationRule<ActiveStateMatch, ActiveStateMatcher>(
	    		ActiveStateQuerySpecification.instance(), new ActiveStateProcessor() {

					@Override
					public void process(State pActivestate, Transient pTransient) {
						// TODO Auto-generated method stub
						pActivestate.setIsActive(false);
						pTransient.getTarget().setIsActive(true);
					}
	            });
	    dse.addTransformationRule(activeStateRule);
	    
	    /*dse.addObjective(new BaseObjective("MyHardObjective")
	    	    .withConstraint(HardObjectQuerySpecification.instance()));*/
	    dse.addObjective(Objectives.createConstraintsObjective("MyHardObjective")
	    		.withHardConstraint(/*???*/);
	    
	    dse.startExploration(Strategies.createBFSStrategy());
	    System.out.println(dse.toStringSolutions());
	    
	}
}
