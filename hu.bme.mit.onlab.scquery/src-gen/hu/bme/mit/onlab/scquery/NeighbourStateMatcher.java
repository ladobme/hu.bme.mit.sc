package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.NeighbourStateMatch;
import hu.bme.mit.onlab.scquery.util.NeighbourStateQuerySpecification;
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
import sc.stateChart.Vertex;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.neighbourState pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
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
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NeighbourStateMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NeighbourStateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NeighbourStateMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_S1 = 0;
  
  private final static int POSITION_S2 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NeighbourStateMatcher.class);
  
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
  public NeighbourStateMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NeighbourStateMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
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
    	return NeighbourStateMatch.newMatch((sc.stateChart.Vertex) t.get(POSITION_S1), (sc.stateChart.State) t.get(POSITION_S2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NeighbourStateMatch arrayToMatch(final Object[] match) {
    try {
    	return NeighbourStateMatch.newMatch((sc.stateChart.Vertex) match[POSITION_S1], (sc.stateChart.State) match[POSITION_S2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NeighbourStateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NeighbourStateMatch.newMutableMatch((sc.stateChart.Vertex) match[POSITION_S1], (sc.stateChart.State) match[POSITION_S2]);
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
  public static IQuerySpecification<NeighbourStateMatcher> querySpecification() throws IncQueryException {
    return NeighbourStateQuerySpecification.instance();
  }
}
