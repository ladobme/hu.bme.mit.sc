package hu.bme.mit.onlab.java;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.emf.*;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import org.junit.Test;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import hu.bme.mit.onlab.scquery.ActiveStateMatcher;
import hu.bme.mit.onlab.scquery.AllItemMatch;
import hu.bme.mit.onlab.scquery.AllItemMatcher;
import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification;
import hu.bme.mit.onlab.scquery.util.AllItemProcessor;
import hu.bme.mit.onlab.scquery.util.AllItemQuerySpecification;
import sc.stateChart.StateMachine;


public class SimulateModel {
	
	private class Proc extends AllItemProcessor{

		@Override
		public void process(EObject pEObject) {
			System.out.println(pEObject);
			}
		}
	@Test
	public void validResource() throws ViatraQueryException{

		// Register the XMI resource factory for the .website extension

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
	    StateMachine root = (StateMachine) resource.getContents().get(0);
		
		EMFScope model = new EMFScope(root);
		ViatraQueryEngine engine = ViatraQueryEngine.on(model);
		//AllItemMatcher matcher = engine.getMatcher(AllItemQuerySpecification.instance());
		ActiveStateMatcher statematcher = engine.getMatcher(ActiveStateQuerySpecification.instance());
		
		// get all matches of the pattern
		//Collection<AllItemMatch> matches = matcher.getAllMatches();
		//Collection<ActiveStateMatch> statematches = statematcher.getAllMatches();
		// process matches, produce some output
		//System.out.println(matcher.countMatches());
		//matcher.forEachMatch(new Proc());
		System.out.println(statematcher.countMatches());
		statematcher.forEachMatch(new ChangeState());
		/*for (AllItemMatch match : matches) {
			System.out.println(match.prettyPrint()); 
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			new SimulateModel().validResource();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
