package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.AllItemMatch;
import hu.bme.mit.onlab.scquery.util.AllItemQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.onlab.scquery.allItem pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllItemMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allItem(EObject)= {
 * 	EObject(EObject);
 * }
 * </pre></code>
 * 
 * @see AllItemMatch
 * @see AllItemProcessor
 * @see AllItemQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllItemMatcher extends BaseMatcher<AllItemMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllItemMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    AllItemMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new AllItemMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_EOBJECT = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(AllItemMatcher.class);
  
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
  public AllItemMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AllItemMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @return matches represented as a AllItemMatch object.
   * 
   */
  public Collection<AllItemMatch> getAllMatches(final EObject pEObject) {
    return rawGetAllMatches(new Object[]{pEObject});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @return a match represented as a AllItemMatch object, or null if no match is found.
   * 
   */
  public AllItemMatch getOneArbitraryMatch(final EObject pEObject) {
    return rawGetOneArbitraryMatch(new Object[]{pEObject});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pEObject) {
    return rawHasMatch(new Object[]{pEObject});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pEObject) {
    return rawCountMatches(new Object[]{pEObject});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pEObject, final IMatchProcessor<? super AllItemMatch> processor) {
    rawForEachMatch(new Object[]{pEObject}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pEObject, final IMatchProcessor<? super AllItemMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEObject}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AllItemMatch newMatch(final EObject pEObject) {
    return AllItemMatch.newMatch(pEObject);
  }
  
  /**
   * Retrieve the set of values that occur in matches for EObject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfEObject(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_EOBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for EObject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfEObject() {
    return rawAccumulateAllValuesOfEObject(emptyArray());
  }
  
  @Override
  protected AllItemMatch tupleToMatch(final Tuple t) {
    try {
    	return AllItemMatch.newMatch((org.eclipse.emf.ecore.EObject) t.get(POSITION_EOBJECT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllItemMatch arrayToMatch(final Object[] match) {
    try {
    	return AllItemMatch.newMatch((org.eclipse.emf.ecore.EObject) match[POSITION_EOBJECT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllItemMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AllItemMatch.newMutableMatch((org.eclipse.emf.ecore.EObject) match[POSITION_EOBJECT]);
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
  public static IQuerySpecification<AllItemMatcher> querySpecification() throws IncQueryException {
    return AllItemQuerySpecification.instance();
  }
}
