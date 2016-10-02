/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.TransientTriggersMatch;
import hu.bme.mit.onlab.scquery.util.TransientTriggersQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sc.stateChart.Transient;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.transientTriggers pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TransientTriggersMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern transientTriggers(type, trigger) = {
 * 	Transient(type);
 * 	Transient.trigger(type,trigger);
 * 	trigger!="";
 * }
 * </pre></code>
 * 
 * @see TransientTriggersMatch
 * @see TransientTriggersProcessor
 * @see TransientTriggersQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TransientTriggersMatcher extends BaseMatcher<TransientTriggersMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TransientTriggersMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TransientTriggersMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (TransientTriggersMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TransientTriggersMatcher create() throws ViatraQueryException {
    return new TransientTriggersMatcher();
  }
  
  private final static int POSITION_TYPE = 0;
  
  private final static int POSITION_TRIGGER = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TransientTriggersMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TransientTriggersMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return matches represented as a TransientTriggersMatch object.
   * 
   */
  public Collection<TransientTriggersMatch> getAllMatches(final Transient pType, final String pTrigger) {
    return rawGetAllMatches(new Object[]{pType, pTrigger});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return a match represented as a TransientTriggersMatch object, or null if no match is found.
   * 
   */
  public TransientTriggersMatch getOneArbitraryMatch(final Transient pType, final String pTrigger) {
    return rawGetOneArbitraryMatch(new Object[]{pType, pTrigger});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Transient pType, final String pTrigger) {
    return rawHasMatch(new Object[]{pType, pTrigger});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Transient pType, final String pTrigger) {
    return rawCountMatches(new Object[]{pType, pTrigger});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Transient pType, final String pTrigger, final IMatchProcessor<? super TransientTriggersMatch> processor) {
    rawForEachMatch(new Object[]{pType, pTrigger}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Transient pType, final String pTrigger, final IMatchProcessor<? super TransientTriggersMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pType, pTrigger}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TransientTriggersMatch newMatch(final Transient pType, final String pTrigger) {
    return TransientTriggersMatch.newMatch(pType, pTrigger);
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Transient> rawAccumulateAllValuesOftype(final Object[] parameters) {
    Set<Transient> results = new HashSet<Transient>();
    rawAccumulateAllValues(POSITION_TYPE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transient> getAllValuesOftype() {
    return rawAccumulateAllValuesOftype(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transient> getAllValuesOftype(final TransientTriggersMatch partialMatch) {
    return rawAccumulateAllValuesOftype(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for type.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transient> getAllValuesOftype(final String pTrigger) {
    return rawAccumulateAllValuesOftype(new Object[]{
    null, 
    pTrigger
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOftrigger(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_TRIGGER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOftrigger() {
    return rawAccumulateAllValuesOftrigger(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOftrigger(final TransientTriggersMatch partialMatch) {
    return rawAccumulateAllValuesOftrigger(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOftrigger(final Transient pType) {
    return rawAccumulateAllValuesOftrigger(new Object[]{
    pType, 
    null
    });
  }
  
  @Override
  protected TransientTriggersMatch tupleToMatch(final Tuple t) {
    try {
    	return TransientTriggersMatch.newMatch((Transient) t.get(POSITION_TYPE), (String) t.get(POSITION_TRIGGER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TransientTriggersMatch arrayToMatch(final Object[] match) {
    try {
    	return TransientTriggersMatch.newMatch((Transient) match[POSITION_TYPE], (String) match[POSITION_TRIGGER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TransientTriggersMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TransientTriggersMatch.newMutableMatch((Transient) match[POSITION_TYPE], (String) match[POSITION_TRIGGER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<TransientTriggersMatcher> querySpecification() throws ViatraQueryException {
    return TransientTriggersQuerySpecification.instance();
  }
}
