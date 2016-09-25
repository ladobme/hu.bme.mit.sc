package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.EntryPointInRegionMatch;
import hu.bme.mit.onlab.scquery.EntryPointInRegionMatcher;
import hu.bme.mit.onlab.scquery.util.EntryPointQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

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
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntryPointInRegionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntryPointInRegionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EntryPointInRegionMatcher.on(engine);
  }
  
  @Override
  public EntryPointInRegionMatch newEmptyMatch() {
    return EntryPointInRegionMatch.newEmptyMatch();
  }
  
  @Override
  public EntryPointInRegionMatch newMatch(final Object... parameters) {
    return EntryPointInRegionMatch.newMatch((sc.stateChart.Region) parameters[0], (sc.stateChart.PseudoState) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static EntryPointInRegionQuerySpecification INSTANCE = make();
    
    public static EntryPointInRegionQuerySpecification make() {
      return new EntryPointInRegionQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EntryPointInRegionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
      return Arrays.asList(new PParameter("region", "sc.stateChart.Region"),new PParameter("epoints", "sc.stateChart.PseudoState"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_region = body.getOrCreateVariableByName("region");
      		PVariable var_epoints = body.getOrCreateVariableByName("epoints");
      		PVariable var_velement = body.getOrCreateVariableByName("velement");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_region, "region"),
      		   new ExportedParameter(body, var_epoints, "epoints")
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
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
