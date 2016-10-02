package hu.bme.mit.onlab.scdse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.junit.Test;

import hu.bme.mit.onlab.scquery.util.HardObjectQuerySpecification;
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
	        .createFileURI("D:\\Lado\\OnLab\\StateChart\\runtime-EclipseApplication\\SCProject\\hu.bme.mit.onlab.statechart"), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    root = (StateMachine) resource.getContents().get(0);
	    
	    dse = new DesignSpaceExplorer();
	    dse.setInitialModel(root);
	    dse.addMetaModelPackage(root.eClass().getEPackage());
	    dse.setStateCoderFactory(new StateChartCoderFactory());
	    
	    StateChartCoderGenerator gen = new StateChartCoderGenerator();
	    gen.listAllState(false);
	    gen.setSeparator('-');
	    try {
			PrintWriter out = new PrintWriter("teszt.txt");
			out.println(gen.createCoder("GeneratedCoder"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	    /* - old activeStateRule
	     * activeStateRule = new DSETransformationRule<ActiveStateMatch, ActiveStateMatcher>(
	    		ActiveStateQuerySpecification.instance(), new ActiveStateProcessor() {

					@Override
					public void process(State pActivestate, Transient pTransient) {
						// TODO Auto-generated method stub
						pActivestate.setIsActive(false);
						pTransient.getTarget().setIsActive(true);
					}
	            });*/
	    		 
	    dse.addTransformationRule(new ScRuleProvider().activeStateRule);
	    
	    /*dse.addObjective(new BaseObjective("MyHardObjective")
	    	    .withConstraint(HardObjectQuerySpecification.instance()));*/
	    dse.addObjective(Objectives.createConstraintsObjective("MyHardObjective")
	    		.withHardConstraint(HardObjectQuerySpecification.instance()));
	    
	    dse.startExploration(Strategies.createBfsStrategy());
	    System.out.println(dse.toStringSolutions());
	    
	}
}
