/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.EntryPointInRegionMatch;
import hu.bme.mit.onlab.scquery.EntryPointInRegionMatcher;
import hu.bme.mit.onlab.scquery.util.EntryPointQuerySpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EntryPointInRegionMatcher in a type-safe way.
 * 
 * @see EntryPointInRegionMatcher
 * @see EntryPointInRegionMatch
 * 
 */
@SuppressWarnings("all")
public final class EntryPointInRegionQuerySpecification extends BaseGeneratedEMFQuerySpecification<EntryPointInRegionMatcher> {
  private EntryPointInRegionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntryPointInRegionQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntryPointInRegionMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntryPointInRegionMatcher.on(engine);
  }
  
  @Override
  public EntryPointInRegionMatcher instantiate() throws ViatraQueryException {
    return EntryPointInRegionMatcher.create();
  }
  
  @Override
  public EntryPointInRegionMatch newEmptyMatch() {
    return EntryPointInRegionMatch.newEmptyMatch();
  }
  
  @Override
  public EntryPointInRegionMatch newMatch(final Object... parameters) {
    return EntryPointInRegionMatch.newMatch((sc.stateChart.Region) parameters[0], (sc.stateChart.PseudoState) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EntryPointInRegionQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link EntryPointInRegionQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EntryPointInRegionQuerySpecification INSTANCE = new EntryPointInRegionQuerySpecification();
    
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
    private final static EntryPointInRegionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pRegion = new PParameter("region", "sc.stateChart.Region", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pEpoints = new PParameter("epoints", "sc.stateChart.PseudoState", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pRegion, parameter_pEpoints);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.entryPointInRegion";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("region","epoints");
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
      		PVariable var_region = body.getOrCreateVariableByName("region");
      		PVariable var_epoints = body.getOrCreateVariableByName("epoints");
      		PVariable var_velement = body.getOrCreateVariableByName("velement");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_region, parameter_pRegion),
      		   new ExportedParameter(body, var_epoints, parameter_pEpoints)
      		));
      		// 	Region.vertex(region,velement)
      		new TypeConstraint(body, new FlatTuple(var_region), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Region")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_region, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Region", "vertex")));
      		new Equality(body, var__virtual_0_, var_velement);
      		// 	find entryPoint(epoints)
      		new PositivePatternCall(body, new FlatTuple(var_epoints), EntryPointQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	velement == epoints
      		new Equality(body, var_velement, var_epoints);
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
