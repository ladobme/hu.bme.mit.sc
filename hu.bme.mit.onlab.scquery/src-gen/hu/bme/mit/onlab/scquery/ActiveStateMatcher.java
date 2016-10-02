/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification;
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
import sc.stateChart.State;
import sc.stateChart.Transient;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.activeState pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ActiveStateMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern activeState(active:State, transient : Transient) = {
 * 	State.isActive(active, true);
 * 	Transient.source(transient, active);
 * //	neg find higherPriorityTransient(active, _tx, transient);	
 * }
 * </pre></code>
 * 
 * @see ActiveStateMatch
 * @see ActiveStateProcessor
 * @see ActiveStateQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ActiveStateMatcher extends BaseMatcher<ActiveStateMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ActiveStateMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ActiveStateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (ActiveStateMatcher)engine.getMatcher(querySpecification());
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
  public static ActiveStateMatcher create() throws ViatraQueryException {
    return new ActiveStateMatcher();
  }
  
  private final static int POSITION_ACTIVE = 0;
  
  private final static int POSITION_TRANSIENT = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ActiveStateMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ActiveStateMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @return matches represented as a ActiveStateMatch object.
   * 
   */
  public Collection<ActiveStateMatch> getAllMatches(final State pActive, final Transient pTransient) {
    return rawGetAllMatches(new Object[]{pActive, pTransient});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @return a match represented as a ActiveStateMatch object, or null if no match is found.
   * 
   */
  public ActiveStateMatch getOneArbitraryMatch(final State pActive, final Transient pTransient) {
    return rawGetOneArbitraryMatch(new Object[]{pActive, pTransient});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final State pActive, final Transient pTransient) {
    return rawHasMatch(new Object[]{pActive, pTransient});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final State pActive, final Transient pTransient) {
    return rawCountMatches(new Object[]{pActive, pTransient});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final State pActive, final Transient pTransient, final IMatchProcessor<? super ActiveStateMatch> processor) {
    rawForEachMatch(new Object[]{pActive, pTransient}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final State pActive, final Transient pTransient, final IMatchProcessor<? super ActiveStateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pActive, pTransient}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ActiveStateMatch newMatch(final State pActive, final Transient pTransient) {
    return ActiveStateMatch.newMatch(pActive, pTransient);
  }
  
  /**
   * Retrieve the set of values that occur in matches for active.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<State> rawAccumulateAllValuesOfactive(final Object[] parameters) {
    Set<State> results = new HashSet<State>();
    rawAccumulateAllValues(POSITION_ACTIVE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for active.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfactive() {
    return rawAccumulateAllValuesOfactive(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for active.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfactive(final ActiveStateMatch partialMatch) {
    return rawAccumulateAllValuesOfactive(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for active.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfactive(final Transient pTransient) {
    return rawAccumulateAllValuesOfactive(new Object[]{
    null, 
    pTransient
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for transient.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Transient> rawAccumulateAllValuesOftransient(final Object[] parameters) {
    Set<Transient> results = new HashSet<Transient>();
    rawAccumulateAllValues(POSITION_TRANSIENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for transient.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transient> getAllValuesOftransient() {
    return rawAccumulateAllValuesOftransient(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for transient.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transient> getAllValuesOftransient(final ActiveStateMatch partialMatch) {
    return rawAccumulateAllValuesOftransient(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for transient.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transient> getAllValuesOftransient(final State pActive) {
    return rawAccumulateAllValuesOftransient(new Object[]{
    pActive, 
    null
    });
  }
  
  @Override
  protected ActiveStateMatch tupleToMatch(final Tuple t) {
    try {
    	return ActiveStateMatch.newMatch((State) t.get(POSITION_ACTIVE), (Transient) t.get(POSITION_TRANSIENT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ActiveStateMatch arrayToMatch(final Object[] match) {
    try {
    	return ActiveStateMatch.newMatch((State) match[POSITION_ACTIVE], (Transient) match[POSITION_TRANSIENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ActiveStateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ActiveStateMatch.newMutableMatch((State) match[POSITION_ACTIVE], (Transient) match[POSITION_TRANSIENT]);
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
  public static IQuerySpecification<ActiveStateMatcher> querySpecification() throws ViatraQueryException {
    return ActiveStateQuerySpecification.instance();
  }
}
