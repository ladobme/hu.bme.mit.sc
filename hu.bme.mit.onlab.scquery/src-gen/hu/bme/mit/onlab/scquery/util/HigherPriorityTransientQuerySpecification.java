/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.HigherPriorityTransientMatch;
import hu.bme.mit.onlab.scquery.HigherPriorityTransientMatcher;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate HigherPriorityTransientMatcher in a type-safe way.
 * 
 * @see HigherPriorityTransientMatcher
 * @see HigherPriorityTransientMatch
 * 
 */
@SuppressWarnings("all")
public final class HigherPriorityTransientQuerySpecification extends BaseGeneratedEMFQuerySpecification<HigherPriorityTransientMatcher> {
  private HigherPriorityTransientQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static HigherPriorityTransientQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected HigherPriorityTransientMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HigherPriorityTransientMatcher.on(engine);
  }
  
  @Override
  public HigherPriorityTransientMatcher instantiate() throws ViatraQueryException {
    return HigherPriorityTransientMatcher.create();
  }
  
  @Override
  public HigherPriorityTransientMatch newEmptyMatch() {
    return HigherPriorityTransientMatch.newEmptyMatch();
  }
  
  @Override
  public HigherPriorityTransientMatch newMatch(final Object... parameters) {
    return HigherPriorityTransientMatch.newMatch((sc.stateChart.State) parameters[0], (sc.stateChart.Transient) parameters[1], (sc.stateChart.Transient) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link HigherPriorityTransientQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link HigherPriorityTransientQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static HigherPriorityTransientQuerySpecification INSTANCE = new HigherPriorityTransientQuerySpecification();
    
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
    private final static HigherPriorityTransientQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pState = new PParameter("state", "sc.stateChart.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/stateChart", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pT1 = new PParameter("t1", "sc.stateChart.Transient", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/stateChart", "Transient")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pT2 = new PParameter("t2", "sc.stateChart.Transient", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/stateChart", "Transient")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pState, parameter_pT1, parameter_pT2);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.higherPriorityTransient";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state","t1","t2");
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
      		PVariable var_p1 = body.getOrCreateVariableByName("p1");
      		PVariable var_p2 = body.getOrCreateVariableByName("p2");
      		new TypeConstraint(body, new FlatTuple(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		new TypeConstraint(body, new FlatTuple(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		new TypeConstraint(body, new FlatTuple(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_state, parameter_pState),
      		   new ExportedParameter(body, var_t1, parameter_pT1),
      		   new ExportedParameter(body, var_t2, parameter_pT2)
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
      		// 	Transient.priority(t1, p1)
      		new TypeConstraint(body, new FlatTuple(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_t1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "priority")));
      		new Equality(body, var__virtual_2_, var_p1);
      		// 	Transient.priority(t2, p2)
      		new TypeConstraint(body, new FlatTuple(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_t2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "priority")));
      		new Equality(body, var__virtual_3_, var_p2);
      		// 	check (p1 > p2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern higherPriorityTransient";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("p1", "p2");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer p1 = (Integer) provider.getValue("p1");
      		        Integer p2 = (Integer) provider.getValue("p2");
      		        return evaluateExpression_1_1(p1, p2);
      		    }
      		},  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer p1, final Integer p2) {
    boolean _greaterThan = (p1.compareTo(p2) > 0);
    return _greaterThan;
  }
}
