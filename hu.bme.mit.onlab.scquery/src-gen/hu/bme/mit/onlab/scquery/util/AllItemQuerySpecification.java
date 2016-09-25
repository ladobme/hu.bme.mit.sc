package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.AllItemMatch;
import hu.bme.mit.onlab.scquery.AllItemMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AllItemMatcher in a type-safe way.
 * 
 * @see AllItemMatcher
 * @see AllItemMatch
 * 
 */
@SuppressWarnings("all")
public final class AllItemQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllItemMatcher> {
  private AllItemQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllItemQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllItemMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllItemMatcher.on(engine);
  }
  
  @Override
  public AllItemMatch newEmptyMatch() {
    return AllItemMatch.newEmptyMatch();
  }
  
  @Override
  public AllItemMatch newMatch(final Object... parameters) {
    return AllItemMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static AllItemQuerySpecification INSTANCE = make();
    
    public static AllItemQuerySpecification make() {
      return new AllItemQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllItemQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.allItem";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("EObject");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("EObject", "org.eclipse.emf.ecore.EObject"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_EObject = body.getOrCreateVariableByName("EObject");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_EObject, "EObject")
      		));
      		// 	EObject(EObject)
      		new TypeConstraint(body, new FlatTuple(var_EObject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
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
