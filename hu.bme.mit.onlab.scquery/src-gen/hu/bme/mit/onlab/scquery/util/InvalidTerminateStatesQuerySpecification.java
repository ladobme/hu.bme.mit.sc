package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.InvalidTerminateStatesMatch;
import hu.bme.mit.onlab.scquery.InvalidTerminateStatesMatcher;
import hu.bme.mit.onlab.scquery.util.NeighbourStateQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate InvalidTerminateStatesMatcher in a type-safe way.
 * 
 * @see InvalidTerminateStatesMatcher
 * @see InvalidTerminateStatesMatch
 * 
 */
@SuppressWarnings("all")
public final class InvalidTerminateStatesQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvalidTerminateStatesMatcher> {
  private InvalidTerminateStatesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvalidTerminateStatesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvalidTerminateStatesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return InvalidTerminateStatesMatcher.on(engine);
  }
  
  @Override
  public InvalidTerminateStatesMatch newEmptyMatch() {
    return InvalidTerminateStatesMatch.newEmptyMatch();
  }
  
  @Override
  public InvalidTerminateStatesMatch newMatch(final Object... parameters) {
    return InvalidTerminateStatesMatch.newMatch((sc.stateChart.PseudoState) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static InvalidTerminateStatesQuerySpecification INSTANCE = make();
    
    public static InvalidTerminateStatesQuerySpecification make() {
      return new InvalidTerminateStatesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static InvalidTerminateStatesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.invalidTerminateStates";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("state", "sc.stateChart.PseudoState"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_state = body.getOrCreateVariableByName("state");
      		PVariable var__s = body.getOrCreateVariableByName("_s");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_state, "state")
      		));
      		// 	PseudoState(state)
      		new TypeConstraint(body, new FlatTuple(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "PseudoState")));
      		// 	PseudoState.PseudoStateType(state, PseudoStateType::Terminate)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/stateChart", "PseudoStateType", "Terminate").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "PseudoState")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_state, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "PseudoState", "PseudoStateType")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	find neighbourState(state, _s)
      		new PositivePatternCall(body, new FlatTuple(var_state, var__s), NeighbourStateQuerySpecification.instance().getInternalQueryRepresentation());
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
