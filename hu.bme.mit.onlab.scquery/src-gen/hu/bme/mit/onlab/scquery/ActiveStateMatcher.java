package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import sc.stateChart.State;
import sc.stateChart.Transient;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.activeState pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
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
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ActiveStateMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ActiveStateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ActiveStateMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ACTIVE = 0;
  
  private final static int POSITION_TRANSIENT = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ActiveStateMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public ActiveStateMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public ActiveStateMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
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
    	return ActiveStateMatch.newMatch((sc.stateChart.State) t.get(POSITION_ACTIVE), (sc.stateChart.Transient) t.get(POSITION_TRANSIENT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ActiveStateMatch arrayToMatch(final Object[] match) {
    try {
    	return ActiveStateMatch.newMatch((sc.stateChart.State) match[POSITION_ACTIVE], (sc.stateChart.Transient) match[POSITION_TRANSIENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ActiveStateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ActiveStateMatch.newMutableMatch((sc.stateChart.State) match[POSITION_ACTIVE], (sc.stateChart.Transient) match[POSITION_TRANSIENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ActiveStateMatcher> querySpecification() throws IncQueryException {
    return ActiveStateQuerySpecification.instance();
  }
}
