package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.EntryPointInRegionMatch;
import hu.bme.mit.onlab.scquery.util.EntryPointInRegionQuerySpecification;
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
import sc.stateChart.PseudoState;
import sc.stateChart.Region;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.entryPointInRegion pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
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
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EntryPointInRegionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EntryPointInRegionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EntryPointInRegionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REGION = 0;
  
  private final static int POSITION_EPOINTS = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EntryPointInRegionMatcher.class);
  
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
  public EntryPointInRegionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EntryPointInRegionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
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
    	return EntryPointInRegionMatch.newMatch((sc.stateChart.Region) t.get(POSITION_REGION), (sc.stateChart.PseudoState) t.get(POSITION_EPOINTS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntryPointInRegionMatch arrayToMatch(final Object[] match) {
    try {
    	return EntryPointInRegionMatch.newMatch((sc.stateChart.Region) match[POSITION_REGION], (sc.stateChart.PseudoState) match[POSITION_EPOINTS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EntryPointInRegionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EntryPointInRegionMatch.newMutableMatch((sc.stateChart.Region) match[POSITION_REGION], (sc.stateChart.PseudoState) match[POSITION_EPOINTS]);
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
  public static IQuerySpecification<EntryPointInRegionMatcher> querySpecification() throws IncQueryException {
    return EntryPointInRegionQuerySpecification.instance();
  }
}
