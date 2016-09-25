package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.StatesWithMoreTransientMatch;
import hu.bme.mit.onlab.scquery.util.StatesWithMoreTransientQuerySpecification;
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

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.statesWithMoreTransient pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link StatesWithMoreTransientMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern statesWithMoreTransient(state:State) = {
 * 	Transient.source(t1, state);
 * 	Transient.source(t2, state);
 * 	t1!=t2;
 * }
 * </pre></code>
 * 
 * @see StatesWithMoreTransientMatch
 * @see StatesWithMoreTransientProcessor
 * @see StatesWithMoreTransientQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class StatesWithMoreTransientMatcher extends BaseMatcher<StatesWithMoreTransientMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static StatesWithMoreTransientMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    StatesWithMoreTransientMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new StatesWithMoreTransientMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_STATE = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(StatesWithMoreTransientMatcher.class);
  
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
  public StatesWithMoreTransientMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public StatesWithMoreTransientMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @return matches represented as a StatesWithMoreTransientMatch object.
   * 
   */
  public Collection<StatesWithMoreTransientMatch> getAllMatches(final State pState) {
    return rawGetAllMatches(new Object[]{pState});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @return a match represented as a StatesWithMoreTransientMatch object, or null if no match is found.
   * 
   */
  public StatesWithMoreTransientMatch getOneArbitraryMatch(final State pState) {
    return rawGetOneArbitraryMatch(new Object[]{pState});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final State pState) {
    return rawHasMatch(new Object[]{pState});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final State pState) {
    return rawCountMatches(new Object[]{pState});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final State pState, final IMatchProcessor<? super StatesWithMoreTransientMatch> processor) {
    rawForEachMatch(new Object[]{pState}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final State pState, final IMatchProcessor<? super StatesWithMoreTransientMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pState}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StatesWithMoreTransientMatch newMatch(final State pState) {
    return StatesWithMoreTransientMatch.newMatch(pState);
  }
  
  /**
   * Retrieve the set of values that occur in matches for state.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<State> rawAccumulateAllValuesOfstate(final Object[] parameters) {
    Set<State> results = new HashSet<State>();
    rawAccumulateAllValues(POSITION_STATE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for state.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfstate() {
    return rawAccumulateAllValuesOfstate(emptyArray());
  }
  
  @Override
  protected StatesWithMoreTransientMatch tupleToMatch(final Tuple t) {
    try {
    	return StatesWithMoreTransientMatch.newMatch((sc.stateChart.State) t.get(POSITION_STATE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected StatesWithMoreTransientMatch arrayToMatch(final Object[] match) {
    try {
    	return StatesWithMoreTransientMatch.newMatch((sc.stateChart.State) match[POSITION_STATE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected StatesWithMoreTransientMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return StatesWithMoreTransientMatch.newMutableMatch((sc.stateChart.State) match[POSITION_STATE]);
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
  public static IQuerySpecification<StatesWithMoreTransientMatcher> querySpecification() throws IncQueryException {
    return StatesWithMoreTransientQuerySpecification.instance();
  }
}
