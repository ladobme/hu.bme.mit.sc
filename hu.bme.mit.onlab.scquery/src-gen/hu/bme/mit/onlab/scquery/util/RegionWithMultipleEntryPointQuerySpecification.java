/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.RegionWithMultipleEntryPointMatch;
import hu.bme.mit.onlab.scquery.RegionWithMultipleEntryPointMatcher;
import hu.bme.mit.onlab.scquery.util.EntryPointInRegionQuerySpecification;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RegionWithMultipleEntryPointMatcher in a type-safe way.
 * 
 * @see RegionWithMultipleEntryPointMatcher
 * @see RegionWithMultipleEntryPointMatch
 * 
 */
@SuppressWarnings("all")
public final class RegionWithMultipleEntryPointQuerySpecification extends BaseGeneratedEMFQuerySpecification<RegionWithMultipleEntryPointMatcher> {
  private RegionWithMultipleEntryPointQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static RegionWithMultipleEntryPointQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RegionWithMultipleEntryPointMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RegionWithMultipleEntryPointMatcher.on(engine);
  }
  
  @Override
  public RegionWithMultipleEntryPointMatcher instantiate() throws ViatraQueryException {
    return RegionWithMultipleEntryPointMatcher.create();
  }
  
  @Override
  public RegionWithMultipleEntryPointMatch newEmptyMatch() {
    return RegionWithMultipleEntryPointMatch.newEmptyMatch();
  }
  
  @Override
  public RegionWithMultipleEntryPointMatch newMatch(final Object... parameters) {
    return RegionWithMultipleEntryPointMatch.newMatch((sc.stateChart.Region) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RegionWithMultipleEntryPointQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link RegionWithMultipleEntryPointQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RegionWithMultipleEntryPointQuerySpecification INSTANCE = new RegionWithMultipleEntryPointQuerySpecification();
    
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
    private final static RegionWithMultipleEntryPointQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pName = new PParameter("name", "sc.stateChart.Region", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pName);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.regionWithMultipleEntryPoint";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("name");
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
      		PVariable var_name = body.getOrCreateVariableByName("name");
      		PVariable var_N = body.getOrCreateVariableByName("N");
      		PVariable var__epoints = body.getOrCreateVariableByName("_epoints");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_name, parameter_pName)
      		));
      		// 	Region(name)
      		new TypeConstraint(body, new FlatTuple(var_name), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Region")));
      		// 	N == count find entryPointInRegion(name, _epoints)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new PatternMatchCounter(body, new FlatTuple(var_name, var__epoints), EntryPointInRegionQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      		new Equality(body, var_N, var__virtual_0_);
      		// 	check (N > 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern regionWithMultipleEntryPoint";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("N");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer N = (Integer) provider.getValue("N");
      		        return evaluateExpression_1_1(N);
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
  
  private static boolean evaluateExpression_1_1(final Integer N) {
    return ((N).intValue() > 1);
  }
}
