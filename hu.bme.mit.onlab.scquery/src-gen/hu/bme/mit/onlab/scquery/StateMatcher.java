/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/generatedQuery.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.StateMatch;
import hu.bme.mit.onlab.scquery.util.StateQuerySpecification;
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

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.State pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link StateMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern State(state:State, attrib)= {
 * 	State(state);
 * 	State.isActive(state, attrib);
 * }
 * </pre></code>
 * 
 * @see StateMatch
 * @see StateProcessor
 * @see StateQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class StateMatcher extends BaseMatcher<StateMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static StateMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    StateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (StateMatcher)engine.getMatcher(querySpecification());
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
  public static StateMatcher create() throws ViatraQueryException {
    return new StateMatcher();
  }
  
  private final static int POSITION_STATE = 0;
  
  private final static int POSITION_ATTRIB = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(StateMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private StateMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @return matches represented as a StateMatch object.
   * 
   */
  public Collection<StateMatch> getAllMatches(final State pState, final Boolean pAttrib) {
    return rawGetAllMatches(new Object[]{pState, pAttrib});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @return a match represented as a StateMatch object, or null if no match is found.
   * 
   */
  public StateMatch getOneArbitraryMatch(final State pState, final Boolean pAttrib) {
    return rawGetOneArbitraryMatch(new Object[]{pState, pAttrib});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final State pState, final Boolean pAttrib) {
    return rawHasMatch(new Object[]{pState, pAttrib});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final State pState, final Boolean pAttrib) {
    return rawCountMatches(new Object[]{pState, pAttrib});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final State pState, final Boolean pAttrib, final IMatchProcessor<? super StateMatch> processor) {
    rawForEachMatch(new Object[]{pState, pAttrib}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final State pState, final Boolean pAttrib, final IMatchProcessor<? super StateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pState, pAttrib}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public StateMatch newMatch(final State pState, final Boolean pAttrib) {
    return StateMatch.newMatch(pState, pAttrib);
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
  
  /**
   * Retrieve the set of values that occur in matches for state.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfstate(final StateMatch partialMatch) {
    return rawAccumulateAllValuesOfstate(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for state.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfstate(final Boolean pAttrib) {
    return rawAccumulateAllValuesOfstate(new Object[]{
    null, 
    pAttrib
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for attrib.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Boolean> rawAccumulateAllValuesOfattrib(final Object[] parameters) {
    Set<Boolean> results = new HashSet<Boolean>();
    rawAccumulateAllValues(POSITION_ATTRIB, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for attrib.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfattrib() {
    return rawAccumulateAllValuesOfattrib(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attrib.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfattrib(final StateMatch partialMatch) {
    return rawAccumulateAllValuesOfattrib(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for attrib.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfattrib(final State pState) {
    return rawAccumulateAllValuesOfattrib(new Object[]{
    pState, 
    null
    });
  }
  
  @Override
  protected StateMatch tupleToMatch(final Tuple t) {
    try {
    	return StateMatch.newMatch((State) t.get(POSITION_STATE), (Boolean) t.get(POSITION_ATTRIB));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected StateMatch arrayToMatch(final Object[] match) {
    try {
    	return StateMatch.newMatch((State) match[POSITION_STATE], (Boolean) match[POSITION_ATTRIB]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected StateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return StateMatch.newMutableMatch((State) match[POSITION_STATE], (Boolean) match[POSITION_ATTRIB]);
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
  public static IQuerySpecification<StateMatcher> querySpecification() throws ViatraQueryException {
    return StateQuerySpecification.instance();
  }
}
