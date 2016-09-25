package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.StatesWithMoreTransientMatch;
import hu.bme.mit.onlab.scquery.StatesWithMoreTransientMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate StatesWithMoreTransientMatcher in a type-safe way.
 * 
 * @see StatesWithMoreTransientMatcher
 * @see StatesWithMoreTransientMatch
 * 
 */
@SuppressWarnings("all")
public final class StatesWithMoreTransientQuerySpecification extends BaseGeneratedEMFQuerySpecification<StatesWithMoreTransientMatcher> {
  private StatesWithMoreTransientQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static StatesWithMoreTransientQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected StatesWithMoreTransientMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return StatesWithMoreTransientMatcher.on(engine);
  }
  
  @Override
  public StatesWithMoreTransientMatch newEmptyMatch() {
    return StatesWithMoreTransientMatch.newEmptyMatch();
  }
  
  @Override
  public StatesWithMoreTransientMatch newMatch(final Object... parameters) {
    return StatesWithMoreTransientMatch.newMatch((sc.stateChart.State) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static StatesWithMoreTransientQuerySpecification INSTANCE = make();
    
    public static StatesWithMoreTransientQuerySpecification make() {
      return new StatesWithMoreTransientQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static StatesWithMoreTransientQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.statesWithMoreTransient";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("state", "sc.stateChart.State"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_state = body.getOrCreateVariableByName("state");
      		PVariable var_t1 = body.getOrCreateVariableByName("t1");
      		PVariable var_t2 = body.getOrCreateVariableByName("t2");
      		new TypeConstraint(body, new FlatTuple(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_state, "state")
      		));
      		// 	Transient.source(t1, state)
      		new TypeConstraint(body, new FlatTuple(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_t1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "source")));
      		new Equality(body, var__virtual_0_, var_state);
      		// 	Transient.source(t2, state)
      		new TypeConstraint(body, new FlatTuple(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_t2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "source")));
      		new Equality(body, var__virtual_1_, var_state);
      		// 	t1!=t2
      		new Inequality(body, var_t1, var_t2);
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
