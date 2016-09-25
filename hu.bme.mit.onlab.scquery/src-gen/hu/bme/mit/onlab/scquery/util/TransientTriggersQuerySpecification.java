package hu.bme.mit.onlab.scquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.onlab.scquery.TransientTriggersMatch;
import hu.bme.mit.onlab.scquery.TransientTriggersMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate TransientTriggersMatcher in a type-safe way.
 * 
 * @see TransientTriggersMatcher
 * @see TransientTriggersMatch
 * 
 */
@SuppressWarnings("all")
public final class TransientTriggersQuerySpecification extends BaseGeneratedEMFQuerySpecification<TransientTriggersMatcher> {
  private TransientTriggersQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TransientTriggersQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TransientTriggersMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TransientTriggersMatcher.on(engine);
  }
  
  @Override
  public TransientTriggersMatch newEmptyMatch() {
    return TransientTriggersMatch.newEmptyMatch();
  }
  
  @Override
  public TransientTriggersMatch newMatch(final Object... parameters) {
    return TransientTriggersMatch.newMatch((sc.stateChart.Transient) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TransientTriggersQuerySpecification INSTANCE = make();
    
    public static TransientTriggersQuerySpecification make() {
      return new TransientTriggersQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TransientTriggersQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.onlab.scquery.transientTriggers";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("type","trigger");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("type", "sc.stateChart.Transient"),new PParameter("trigger", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_type = body.getOrCreateVariableByName("type");
      		PVariable var_trigger = body.getOrCreateVariableByName("trigger");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_type, "type"),
      		   new ExportedParameter(body, var_trigger, "trigger")
      		));
      		// 	Transient(type)
      		new TypeConstraint(body, new FlatTuple(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		// 	Transient.trigger(type,trigger)
      		new TypeConstraint(body, new FlatTuple(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/stateChart", "Transient")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_type, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/stateChart", "Transient", "trigger")));
      		new Equality(body, var__virtual_0_, var_trigger);
      		// 	trigger!=""
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, "");
      		new Inequality(body, var_trigger, var__virtual_1_);
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
