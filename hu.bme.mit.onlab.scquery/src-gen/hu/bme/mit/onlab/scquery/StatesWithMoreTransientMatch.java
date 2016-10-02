/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.StatesWithMoreTransientQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import sc.stateChart.State;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.statesWithMoreTransient pattern,
 * to be used in conjunction with {@link StatesWithMoreTransientMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StatesWithMoreTransientMatcher
 * @see StatesWithMoreTransientProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class StatesWithMoreTransientMatch extends BasePatternMatch {
  private State fState;
  
  private static List<String> parameterNames = makeImmutableList("state");
  
  private StatesWithMoreTransientMatch(final State pState) {
    this.fState = pState;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("state".equals(parameterName)) return this.fState;
    return null;
  }
  
  public State getState() {
    return this.fState;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("state".equals(parameterName) ) {
    	this.fState = (State) newValue;
    	return true;
    }
    return false;
  }
  
  public void setState(final State pState) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fState = pState;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.statesWithMoreTransient";
  }
  
  @Override
  public List<String> parameterNames() {
    return StatesWithMoreTransientMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fState};
  }
  
  @Override
  public StatesWithMoreTransientMatch toImmutable() {
    return isMutable() ? newMatch(fState) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"state\"=" + prettyPrintValue(fState)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fState == null) ? 0 : fState.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof StatesWithMoreTransientMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    StatesWithMoreTransientMatch other = (StatesWithMoreTransientMatch) obj;
    if (fState == null) {if (other.fState != null) return false;}
    else if (!fState.equals(other.fState)) return false;
    return true;
  }
  
  @Override
  public StatesWithMoreTransientQuerySpecification specification() {
    try {
    	return StatesWithMoreTransientQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static StatesWithMoreTransientMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static StatesWithMoreTransientMatch newMutableMatch(final State pState) {
    return new Mutable(pState);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static StatesWithMoreTransientMatch newMatch(final State pState) {
    return new Immutable(pState);
  }
  
  private static final class Mutable extends StatesWithMoreTransientMatch {
    Mutable(final State pState) {
      super(pState);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends StatesWithMoreTransientMatch {
    Immutable(final State pState) {
      super(pState);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
