/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.RegionWithMultipleEntryPointMatch;
import hu.bme.mit.onlab.scquery.util.RegionWithMultipleEntryPointQuerySpecification;
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
import sc.stateChart.Region;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.regionWithMultipleEntryPoint pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RegionWithMultipleEntryPointMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern regionWithMultipleEntryPoint(name) = {
 * 	Region(name);
 * 	N == count find entryPointInRegion(name, _epoints);
 * 	check (N {@literal >} 1);
 * }
 * </pre></code>
 * 
 * @see RegionWithMultipleEntryPointMatch
 * @see RegionWithMultipleEntryPointProcessor
 * @see RegionWithMultipleEntryPointQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RegionWithMultipleEntryPointMatcher extends BaseMatcher<RegionWithMultipleEntryPointMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RegionWithMultipleEntryPointMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    RegionWithMultipleEntryPointMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (RegionWithMultipleEntryPointMatcher)engine.getMatcher(querySpecification());
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
  public static RegionWithMultipleEntryPointMatcher create() throws ViatraQueryException {
    return new RegionWithMultipleEntryPointMatcher();
  }
  
  private final static int POSITION_NAME = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RegionWithMultipleEntryPointMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private RegionWithMultipleEntryPointMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return matches represented as a RegionWithMultipleEntryPointMatch object.
   * 
   */
  public Collection<RegionWithMultipleEntryPointMatch> getAllMatches(final Region pName) {
    return rawGetAllMatches(new Object[]{pName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return a match represented as a RegionWithMultipleEntryPointMatch object, or null if no match is found.
   * 
   */
  public RegionWithMultipleEntryPointMatch getOneArbitraryMatch(final Region pName) {
    return rawGetOneArbitraryMatch(new Object[]{pName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Region pName) {
    return rawHasMatch(new Object[]{pName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Region pName) {
    return rawCountMatches(new Object[]{pName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Region pName, final IMatchProcessor<? super RegionWithMultipleEntryPointMatch> processor) {
    rawForEachMatch(new Object[]{pName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Region pName, final IMatchProcessor<? super RegionWithMultipleEntryPointMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RegionWithMultipleEntryPointMatch newMatch(final Region pName) {
    return RegionWithMultipleEntryPointMatch.newMatch(pName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Region> rawAccumulateAllValuesOfname(final Object[] parameters) {
    Set<Region> results = new HashSet<Region>();
    rawAccumulateAllValues(POSITION_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Region> getAllValuesOfname() {
    return rawAccumulateAllValuesOfname(emptyArray());
  }
  
  @Override
  protected RegionWithMultipleEntryPointMatch tupleToMatch(final Tuple t) {
    try {
    	return RegionWithMultipleEntryPointMatch.newMatch((Region) t.get(POSITION_NAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RegionWithMultipleEntryPointMatch arrayToMatch(final Object[] match) {
    try {
    	return RegionWithMultipleEntryPointMatch.newMatch((Region) match[POSITION_NAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RegionWithMultipleEntryPointMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RegionWithMultipleEntryPointMatch.newMutableMatch((Region) match[POSITION_NAME]);
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
  public static IQuerySpecification<RegionWithMultipleEntryPointMatcher> querySpecification() throws ViatraQueryException {
    return RegionWithMultipleEntryPointQuerySpecification.instance();
  }
}
