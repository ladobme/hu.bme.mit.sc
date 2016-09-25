package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.NeighbourStateMatch;
import hu.bme.mit.onlab.scquery.NeighbourStateMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

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
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NeighbourStateQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NeighbourStateMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NeighbourStateMatcher.on(engine);
  }
  
  @Override
  public NeighbourStateMatch newEmptyMatch() {
    return NeighbourStateMatch.newEmptyMatch();
  }
  
  @Override
  public NeighbourStateMatch newMatch(final Object... parameters) {
    return NeighbourStateMatch.newMatch((sc.stateChart.Vertex) parameters[0], (sc.stateChart.State) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static NeighbourStateQuerySpecification INSTANCE = make();
    
    public static NeighbourStateQuerySpecification make() {
      return new NeighbourStateQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NeighbourStateQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
      return Arrays.asList(new PParameter("s1", "sc.stateChart.Vertex"),new PParameter("s2", "sc.stateChart.State"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_s1 = body.getOrCreateVariableByName("s1");
      		PVariable var_s2 = body.getOrCreateVariableByName("s2");
      		PVariable var_t = body.getOrCreateVariableByName("t");
      		new TypeConstraint(body, new FlatTuple(var_s2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "State")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_s1, "s1"),
      		   new ExportedParameter(body, var_s2, "s2")
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
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
