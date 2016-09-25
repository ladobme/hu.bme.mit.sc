package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.EntryPointMatch;
import hu.bme.mit.onlab.scquery.EntryPointMatcher;
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
 * A pattern-specific query specification that can instantiate EntryPointMatcher in a type-safe way.
 * 
 * @see EntryPointMatcher
 * @see EntryPointMatch
 * 
 */
@SuppressWarnings("all")
public final class EntryPointQuerySpecification extends BaseGeneratedEMFQuerySpecification<EntryPointMatcher> {
  private EntryPointQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntryPointQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntryPointMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EntryPointMatcher.on(engine);
  }
  
  @Override
  public EntryPointMatch newEmptyMatch() {
    return EntryPointMatch.newEmptyMatch();
  }
  
  @Override
  public EntryPointMatch newMatch(final Object... parameters) {
    return EntryPointMatch.newMatch((sc.stateChart.PseudoState) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EntryPointQuerySpecification INSTANCE = make();
    
    public static EntryPointQuerySpecification make() {
      return new EntryPointQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EntryPointQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.entryPoint";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ep");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("ep", "sc.stateChart.PseudoState"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_ep = body.getOrCreateVariableByName("ep");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_ep, "ep")
      		));
      		// 	PseudoState.PseudoStateType(ep, PseudoStateType::EntryPoint)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/stateChart", "PseudoStateType", "EntryPoint").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_ep), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "PseudoState")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_ep, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "PseudoState", "PseudoStateType")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
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
