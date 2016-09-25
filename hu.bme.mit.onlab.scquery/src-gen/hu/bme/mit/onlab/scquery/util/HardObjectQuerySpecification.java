package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.HardObjectMatch;
import hu.bme.mit.onlab.scquery.HardObjectMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate HardObjectMatcher in a type-safe way.
 * 
 * @see HardObjectMatcher
 * @see HardObjectMatch
 * 
 */
@SuppressWarnings("all")
public final class HardObjectQuerySpecification extends BaseGeneratedEMFQuerySpecification<HardObjectMatcher> {
  private HardObjectQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static HardObjectQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected HardObjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return HardObjectMatcher.on(engine);
  }
  
  @Override
  public HardObjectMatch newEmptyMatch() {
    return HardObjectMatch.newEmptyMatch();
  }
  
  @Override
  public HardObjectMatch newMatch(final Object... parameters) {
    return HardObjectMatch.newMatch((sc.stateChart.State) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static HardObjectQuerySpecification INSTANCE = make();
    
    public static HardObjectQuerySpecification make() {
      return new HardObjectQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static HardObjectQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.hardObject";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("shutdown");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("shutdown", "sc.stateChart.State"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_shutdown = body.getOrCreateVariableByName("shutdown");
      		new TypeConstraint(body, new FlatTuple(var_shutdown), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_shutdown, "shutdown")
      		));
      		// 	State.name(shutdown, "Shut down")
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, "Shut down");
      		new TypeConstraint(body, new FlatTuple(var_shutdown), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_shutdown, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Vertex", "name")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	State.isActive(shutdown, true)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new ConstantValue(body, var__virtual_2_, true);
      		new TypeConstraint(body, new FlatTuple(var_shutdown), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_shutdown, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Vertex", "isActive")));
      		new Equality(body, var__virtual_3_, var__virtual_2_);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
