/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.NeighbourStateMatch;
import hu.bme.mit.onlab.scquery.NeighbourStateMatcher;
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
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NeighbourStateMatcher in a type-safe way.
 * 
 * @see NeighbourStateMatcher
 * @see NeighbourStateMatch
 * 
 */
@SuppressWarnings("all")
public final class NeighbourStateQuerySpecification extends BaseGeneratedEMFQuerySpecification<NeighbourStateMatcher> {
  private NeighbourStateQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static NeighbourStateQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NeighbourStateMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NeighbourStateMatcher.on(engine);
  }
  
  @Override
  public NeighbourStateMatcher instantiate() throws ViatraQueryException {
    return NeighbourStateMatcher.create();
  }
  
  @Override
  public NeighbourStateMatch newEmptyMatch() {
    return NeighbourStateMatch.newEmptyMatch();
  }
  
  @Override
  public NeighbourStateMatch newMatch(final Object... parameters) {
    return NeighbourStateMatch.newMatch((sc.stateChart.Vertex) parameters[0], (sc.stateChart.State) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NeighbourStateQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link NeighbourStateQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static NeighbourStateQuerySpecification INSTANCE = new NeighbourStateQuerySpecification();
    
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
    private final static NeighbourStateQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pS1 = new PParameter("s1", "sc.stateChart.Vertex", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pS2 = new PParameter("s2", "sc.stateChart.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/stateChart", "State")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pS1, parameter_pS2);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.neighbourState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s1","s2");
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
      		PVariable var_s1 = body.getOrCreateVariableByName("s1");
      		PVariable var_s2 = body.getOrCreateVariableByName("s2");
      		PVariable var_t = body.getOrCreateVariableByName("t");
      		new TypeConstraint(body, new FlatTuple(var_s2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_s1, parameter_pS1),
      		   new ExportedParameter(body, var_s2, parameter_pS2)
      		));
      		// 	Transient.source(t,s1)
      		new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_t, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "source")));
      		new Equality(body, var__virtual_0_, var_s1);
      		// 	Transient.target(t,s2)
      		new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_t, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "target")));
      		new Equality(body, var__virtual_1_, var_s2);
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
