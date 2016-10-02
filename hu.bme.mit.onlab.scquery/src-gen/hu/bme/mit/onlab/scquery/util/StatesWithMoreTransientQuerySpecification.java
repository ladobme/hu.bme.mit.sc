/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.StatesWithMoreTransientMatch;
import hu.bme.mit.onlab.scquery.StatesWithMoreTransientMatcher;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

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
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static StatesWithMoreTransientQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected StatesWithMoreTransientMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StatesWithMoreTransientMatcher.on(engine);
  }
  
  @Override
  public StatesWithMoreTransientMatcher instantiate() throws ViatraQueryException {
    return StatesWithMoreTransientMatcher.create();
  }
  
  @Override
  public StatesWithMoreTransientMatch newEmptyMatch() {
    return StatesWithMoreTransientMatch.newEmptyMatch();
  }
  
  @Override
  public StatesWithMoreTransientMatch newMatch(final Object... parameters) {
    return StatesWithMoreTransientMatch.newMatch((sc.stateChart.State) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link StatesWithMoreTransientQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link StatesWithMoreTransientQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static StatesWithMoreTransientQuerySpecification INSTANCE = new StatesWithMoreTransientQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static StatesWithMoreTransientQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pState = new PParameter("state", "sc.stateChart.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/stateChart", "State")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pState);
    
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
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, Collections.<String,Object>emptyMap()));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_state = body.getOrCreateVariableByName("state");
      		PVariable var_t1 = body.getOrCreateVariableByName("t1");
      		PVariable var_t2 = body.getOrCreateVariableByName("t2");
      		new TypeConstraint(body, new FlatTuple(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_state, parameter_pState)
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
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
