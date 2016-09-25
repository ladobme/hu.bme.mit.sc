package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.RegionWithMultipleEntryPointMatch;
import hu.bme.mit.onlab.scquery.RegionWithMultipleEntryPointMatcher;
import hu.bme.mit.onlab.scquery.util.EntryPointInRegionQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

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
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RegionWithMultipleEntryPointQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RegionWithMultipleEntryPointMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RegionWithMultipleEntryPointMatcher.on(engine);
  }
  
  @Override
  public RegionWithMultipleEntryPointMatch newEmptyMatch() {
    return RegionWithMultipleEntryPointMatch.newEmptyMatch();
  }
  
  @Override
  public RegionWithMultipleEntryPointMatch newMatch(final Object... parameters) {
    return RegionWithMultipleEntryPointMatch.newMatch((sc.stateChart.Region) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static RegionWithMultipleEntryPointQuerySpecification INSTANCE = make();
    
    public static RegionWithMultipleEntryPointQuerySpecification make() {
      return new RegionWithMultipleEntryPointQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RegionWithMultipleEntryPointQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
      return Arrays.asList(new PParameter("name", "sc.stateChart.Region"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_name = body.getOrCreateVariableByName("name");
      		PVariable var_N = body.getOrCreateVariableByName("N");
      		PVariable var__epoints = body.getOrCreateVariableByName("_epoints");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_name, "name")
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
      		                                return Arrays.asList("N");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer N = (java.lang.Integer) provider.getValue("N");
      		                                    return evaluateExpression_1_1(N);
      		                                }
      		
      		                        },  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer N) {
    return ((N).intValue() > 1);
  }
}
