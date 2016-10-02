/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.EntryPointMatch;
import hu.bme.mit.onlab.scquery.util.EntryPointQuerySpecification;
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
import sc.stateChart.PseudoState;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.entryPoint pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EntryPointMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern entryPoint(ep) = {
 * 	PseudoState.PseudoStateType(ep, PseudoStateType::EntryPoint);
 * }
 * </pre></code>
 * 
 * @see EntryPointMatch
 * @see EntryPointProcessor
 * @see EntryPointQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EntryPointMatcher extends BaseMatcher<EntryPointMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EntryPointMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EntryPointMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (EntryPointMatcher)engine.getMatcher(querySpecification());
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
  public static EntryPointMatcher create() throws ViatraQueryException {
    return new EntryPointMatcher();
  }
  
  private final static int POSITION_EP = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EntryPointMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EntryPointMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @return matches represented as a EntryPointMatch object.
   * 
   */
  public Collection<EntryPointMatch> getAllMatches(final PseudoState pEp) {
    return rawGetAllMatches(new Object[]{pEp});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @return a match represented as a EntryPointMatch object, or null if no match is found.
   * 
   */
  public EntryPointMatch getOneArbitraryMatch(final PseudoState pEp) {
    return rawGetOneArbitraryMatch(new Object[]{pEp});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final PseudoState pEp) {
    return rawHasMatch(new Object[]{pEp});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final PseudoState pEp) {
    return rawCountMatches(new Object[]{pEp});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final PseudoState pEp, final IMatchProcessor<? super EntryPointMatch> processor) {
    rawForEachMatch(new Object[]{pEp}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final PseudoState pEp, final IMatchProcessor<? super EntryPointMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEp}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EntryPointMatch newMatch(final PseudoState pEp) {
    return EntryPointMatch.newMatch(pEp);
  }
  
  /**
   * Retrieve the set of values that occur in matches for ep.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<PseudoState> rawAccumulateAllValuesOfep(final Object[] parameters) {
    Set<PseudoState> results = new HashSet<PseudoState>();
    rawAccumulateAllValues(POSITION_EP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ep.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PseudoState> getAllValuesOfep() {
    return rawAccumulateAllValuesOfep(emptyArray());
  }
  
  @Override
  protected EntryPointMatch tupleToMatch(final Tuple t) {
    try {
    	return EntryPointMatch.newMatch((PseudoState) t.get(POSITION_EP));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntryPointMatch arrayToMatch(final Object[] match) {
    try {
    	return EntryPointMatch.newMatch((PseudoState) match[POSITION_EP]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntryPointMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EntryPointMatch.newMutableMatch((PseudoState) match[POSITION_EP]);
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
  public static IQuerySpecification<EntryPointMatcher> querySpecification() throws ViatraQueryException {
    return EntryPointQuerySpecification.instance();
  }
}
