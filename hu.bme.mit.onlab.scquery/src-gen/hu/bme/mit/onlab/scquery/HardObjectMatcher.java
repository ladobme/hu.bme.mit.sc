/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.HardObjectMatch;
import hu.bme.mit.onlab.scquery.util.HardObjectQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.hardObject pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link HardObjectMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern hardObject(shutdown:State) = {
 * 	State.name(shutdown, "Shut down");
 * 	State.isActive(shutdown, true);
 * }
 * </pre></code>
 * 
 * @see HardObjectMatch
 * @see HardObjectProcessor
 * @see HardObjectQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class HardObjectMatcher extends BaseMatcher<HardObjectMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static HardObjectMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    HardObjectMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (HardObjectMatcher)engine.getMatcher(querySpecification());
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
  public static HardObjectMatcher create() throws ViatraQueryException {
    return new HardObjectMatcher();
  }
  
  private final static int POSITION_SHUTDOWN = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(HardObjectMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private HardObjectMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @return matches represented as a HardObjectMatch object.
   * 
   */
  public Collection<HardObjectMatch> getAllMatches(final State pShutdown) {
    return rawGetAllMatches(new Object[]{pShutdown});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @return a match represented as a HardObjectMatch object, or null if no match is found.
   * 
   */
  public HardObjectMatch getOneArbitraryMatch(final State pShutdown) {
    return rawGetOneArbitraryMatch(new Object[]{pShutdown});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final State pShutdown) {
    return rawHasMatch(new Object[]{pShutdown});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final State pShutdown) {
    return rawCountMatches(new Object[]{pShutdown});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final State pShutdown, final IMatchProcessor<? super HardObjectMatch> processor) {
    rawForEachMatch(new Object[]{pShutdown}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final State pShutdown, final IMatchProcessor<? super HardObjectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pShutdown}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public HardObjectMatch newMatch(final State pShutdown) {
    return HardObjectMatch.newMatch(pShutdown);
  }
  
  /**
   * Retrieve the set of values that occur in matches for shutdown.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<State> rawAccumulateAllValuesOfshutdown(final Object[] parameters) {
    Set<State> results = new HashSet<State>();
    rawAccumulateAllValues(POSITION_SHUTDOWN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for shutdown.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfshutdown() {
    return rawAccumulateAllValuesOfshutdown(emptyArray());
  }
  
  @Override
  protected HardObjectMatch tupleToMatch(final Tuple t) {
    try {
    	return HardObjectMatch.newMatch((State) t.get(POSITION_SHUTDOWN));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HardObjectMatch arrayToMatch(final Object[] match) {
    try {
    	return HardObjectMatch.newMatch((State) match[POSITION_SHUTDOWN]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected HardObjectMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return HardObjectMatch.newMutableMatch((State) match[POSITION_SHUTDOWN]);
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
  public static IQuerySpecification<HardObjectMatcher> querySpecification() throws ViatraQueryException {
    return HardObjectQuerySpecification.instance();
  }
}
