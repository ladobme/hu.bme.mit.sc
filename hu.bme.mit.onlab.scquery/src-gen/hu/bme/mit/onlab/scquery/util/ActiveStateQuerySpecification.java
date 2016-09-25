package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import hu.bme.mit.onlab.scquery.ActiveStateMatcher;
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
 * A pattern-specific query specification that can instantiate ActiveStateMatcher in a type-safe way.
 * 
 * @see ActiveStateMatcher
 * @see ActiveStateMatch
 * 
 */
@SuppressWarnings("all")
public final class ActiveStateQuerySpecification extends BaseGeneratedEMFQuerySpecification<ActiveStateMatcher> {
  private ActiveStateQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ActiveStateQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ActiveStateMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ActiveStateMatcher.on(engine);
  }
  
  @Override
  public ActiveStateMatch newEmptyMatch() {
    return ActiveStateMatch.newEmptyMatch();
  }
  
  @Override
  public ActiveStateMatch newMatch(final Object... parameters) {
    return ActiveStateMatch.newMatch((sc.stateChart.State) parameters[0], (sc.stateChart.Transient) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ActiveStateQuerySpecification INSTANCE = make();
    
    public static ActiveStateQuerySpecification make() {
      return new ActiveStateQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ActiveStateQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.activeState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("active","transient");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("active", "sc.stateChart.State"),new PParameter("transient", "sc.stateChart.Transient"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_active = body.getOrCreateVariableByName("active");
      		PVariable var_transient = body.getOrCreateVariableByName("transient");
      		new TypeConstraint(body, new FlatTuple(var_active), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		new TypeConstraint(body, new FlatTuple(var_transient), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_active, "active"),
      		   new ExportedParameter(body, var_transient, "transient")
      		));
      		// 	State.isActive(active, true)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, true);
      		new TypeConstraint(body, new FlatTuple(var_active), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_active, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Vertex", "isActive")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	Transient.source(transient, active)
      		new TypeConstraint(body, new FlatTuple(var_transient), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_transient, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "source")));
      		new Equality(body, var__virtual_2_, var_active);
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
