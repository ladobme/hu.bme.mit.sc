/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.EntryPointInRegionMatch;
import hu.bme.mit.onlab.scquery.util.EntryPointInRegionQuerySpecification;
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
import sc.stateChart.Region;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.entryPointInRegion pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EntryPointInRegionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern entryPointInRegion(region, epoints) = {
 * 	Region.vertex(region,velement);
 * 	find entryPoint(epoints);
 * 	velement == epoints;
 * }
 * </pre></code>
 * 
 * @see EntryPointInRegionMatch
 * @see EntryPointInRegionProcessor
 * @see EntryPointInRegionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EntryPointInRegionMatcher extends BaseMatcher<EntryPointInRegionMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EntryPointInRegionMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EntryPointInRegionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (EntryPointInRegionMatcher)engine.getMatcher(querySpecification());
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
  public static EntryPointInRegionMatcher create() throws ViatraQueryException {
    return new EntryPointInRegionMatcher();
  }
  
  private final static int POSITION_REGION = 0;
  
  private final static int POSITION_EPOINTS = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EntryPointInRegionMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EntryPointInRegionMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @return matches represented as a EntryPointInRegionMatch object.
   * 
   */
  public Collection<EntryPointInRegionMatch> getAllMatches(final Region pRegion, final PseudoState pEpoints) {
    return rawGetAllMatches(new Object[]{pRegion, pEpoints});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @return a match represented as a EntryPointInRegionMatch object, or null if no match is found.
   * 
   */
  public EntryPointInRegionMatch getOneArbitraryMatch(final Region pRegion, final PseudoState pEpoints) {
    return rawGetOneArbitraryMatch(new Object[]{pRegion, pEpoints});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Region pRegion, final PseudoState pEpoints) {
    return rawHasMatch(new Object[]{pRegion, pEpoints});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Region pRegion, final PseudoState pEpoints) {
    return rawCountMatches(new Object[]{pRegion, pEpoints});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Region pRegion, final PseudoState pEpoints, final IMatchProcessor<? super EntryPointInRegionMatch> processor) {
    rawForEachMatch(new Object[]{pRegion, pEpoints}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Region pRegion, final PseudoState pEpoints, final IMatchProcessor<? super EntryPointInRegionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRegion, pEpoints}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EntryPointInRegionMatch newMatch(final Region pRegion, final PseudoState pEpoints) {
    return EntryPointInRegionMatch.newMatch(pRegion, pEpoints);
  }
  
  /**
   * Retrieve the set of values that occur in matches for region.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Region> rawAccumulateAllValuesOfregion(final Object[] parameters) {
    Set<Region> results = new HashSet<Region>();
    rawAccumulateAllValues(POSITION_REGION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for region.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Region> getAllValuesOfregion() {
    return rawAccumulateAllValuesOfregion(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for region.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Region> getAllValuesOfregion(final EntryPointInRegionMatch partialMatch) {
    return rawAccumulateAllValuesOfregion(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for region.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Region> getAllValuesOfregion(final PseudoState pEpoints) {
    return rawAccumulateAllValuesOfregion(new Object[]{
    null, 
    pEpoints
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for epoints.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<PseudoState> rawAccumulateAllValuesOfepoints(final Object[] parameters) {
    Set<PseudoState> results = new HashSet<PseudoState>();
    rawAccumulateAllValues(POSITION_EPOINTS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for epoints.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PseudoState> getAllValuesOfepoints() {
    return rawAccumulateAllValuesOfepoints(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for epoints.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PseudoState> getAllValuesOfepoints(final EntryPointInRegionMatch partialMatch) {
    return rawAccumulateAllValuesOfepoints(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for epoints.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PseudoState> getAllValuesOfepoints(final Region pRegion) {
    return rawAccumulateAllValuesOfepoints(new Object[]{
    pRegion, 
    null
    });
  }
  
  @Override
  protected EntryPointInRegionMatch tupleToMatch(final Tuple t) {
    try {
    	return EntryPointInRegionMatch.newMatch((Region) t.get(POSITION_REGION), (PseudoState) t.get(POSITION_EPOINTS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntryPointInRegionMatch arrayToMatch(final Object[] match) {
    try {
    	return EntryPointInRegionMatch.newMatch((Region) match[POSITION_REGION], (PseudoState) match[POSITION_EPOINTS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntryPointInRegionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EntryPointInRegionMatch.newMutableMatch((Region) match[POSITION_REGION], (PseudoState) match[POSITION_EPOINTS]);
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
  public static IQuerySpecification<EntryPointInRegionMatcher> querySpecification() throws ViatraQueryException {
    return EntryPointInRegionQuerySpecification.instance();
  }
}
