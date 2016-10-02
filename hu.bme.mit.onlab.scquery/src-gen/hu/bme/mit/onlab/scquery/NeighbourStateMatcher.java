/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.NeighbourStateMatch;
import hu.bme.mit.onlab.scquery.util.NeighbourStateQuerySpecification;
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
import sc.stateChart.Vertex;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.neighbourState pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NeighbourStateMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern neighbourState(s1,s2:State) = {
 * 	Transient.source(t,s1);
 * 	Transient.target(t,s2);
 * }
 * </pre></code>
 * 
 * @see NeighbourStateMatch
 * @see NeighbourStateProcessor
 * @see NeighbourStateQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NeighbourStateMatcher extends BaseMatcher<NeighbourStateMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NeighbourStateMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    NeighbourStateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (NeighbourStateMatcher)engine.getMatcher(querySpecification());
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
  public static NeighbourStateMatcher create() throws ViatraQueryException {
    return new NeighbourStateMatcher();
  }
  
  private final static int POSITION_S1 = 0;
  
  private final static int POSITION_S2 = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NeighbourStateMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private NeighbourStateMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return matches represented as a NeighbourStateMatch object.
   * 
   */
  public Collection<NeighbourStateMatch> getAllMatches(final Vertex pS1, final State pS2) {
    return rawGetAllMatches(new Object[]{pS1, pS2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return a match represented as a NeighbourStateMatch object, or null if no match is found.
   * 
   */
  public NeighbourStateMatch getOneArbitraryMatch(final Vertex pS1, final State pS2) {
    return rawGetOneArbitraryMatch(new Object[]{pS1, pS2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Vertex pS1, final State pS2) {
    return rawHasMatch(new Object[]{pS1, pS2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Vertex pS1, final State pS2) {
    return rawCountMatches(new Object[]{pS1, pS2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Vertex pS1, final State pS2, final IMatchProcessor<? super NeighbourStateMatch> processor) {
    rawForEachMatch(new Object[]{pS1, pS2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Vertex pS1, final State pS2, final IMatchProcessor<? super NeighbourStateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS1, pS2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NeighbourStateMatch newMatch(final Vertex pS1, final State pS2) {
    return NeighbourStateMatch.newMatch(pS1, pS2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Vertex> rawAccumulateAllValuesOfs1(final Object[] parameters) {
    Set<Vertex> results = new HashSet<Vertex>();
    rawAccumulateAllValues(POSITION_S1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Vertex> getAllValuesOfs1() {
    return rawAccumulateAllValuesOfs1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Vertex> getAllValuesOfs1(final NeighbourStateMatch partialMatch) {
    return rawAccumulateAllValuesOfs1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Vertex> getAllValuesOfs1(final State pS2) {
    return rawAccumulateAllValuesOfs1(new Object[]{
    null, 
    pS2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<State> rawAccumulateAllValuesOfs2(final Object[] parameters) {
    Set<State> results = new HashSet<State>();
    rawAccumulateAllValues(POSITION_S2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfs2() {
    return rawAccumulateAllValuesOfs2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfs2(final NeighbourStateMatch partialMatch) {
    return rawAccumulateAllValuesOfs2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<State> getAllValuesOfs2(final Vertex pS1) {
    return rawAccumulateAllValuesOfs2(new Object[]{
    pS1, 
    null
    });
  }
  
  @Override
  protected NeighbourStateMatch tupleToMatch(final Tuple t) {
    try {
    	return NeighbourStateMatch.newMatch((Vertex) t.get(POSITION_S1), (State) t.get(POSITION_S2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NeighbourStateMatch arrayToMatch(final Object[] match) {
    try {
    	return NeighbourStateMatch.newMatch((Vertex) match[POSITION_S1], (State) match[POSITION_S2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NeighbourStateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NeighbourStateMatch.newMutableMatch((Vertex) match[POSITION_S1], (State) match[POSITION_S2]);
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
  public static IQuerySpecification<NeighbourStateMatcher> querySpecification() throws ViatraQueryException {
    return NeighbourStateQuerySpecification.instance();
  }
}
