/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/generatedQuery.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.StateQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import sc.stateChart.State;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.State pattern,
 * to be used in conjunction with {@link StateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StateMatcher
 * @see StateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class StateMatch extends BasePatternMatch {
  private State fState;
  
  private Boolean fAttrib;
  
  private static List<String> parameterNames = makeImmutableList("state", "attrib");
  
  private StateMatch(final State pState, final Boolean pAttrib) {
    this.fState = pState;
    this.fAttrib = pAttrib;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("state".equals(parameterName)) return this.fState;
    if ("attrib".equals(parameterName)) return this.fAttrib;
    return null;
  }
  
  public State getState() {
    return this.fState;
  }
  
  public Boolean getAttrib() {
    return this.fAttrib;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("state".equals(parameterName) ) {
    	this.fState = (State) newValue;
    	return true;
    }
    if ("attrib".equals(parameterName) ) {
    	this.fAttrib = (Boolean) newValue;
    	return true;
    }
    return false;
  }
  
  public void setState(final State pState) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fState = pState;
  }
  
  public void setAttrib(final Boolean pAttrib) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAttrib = pAttrib;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.State";
  }
  
  @Override
  public List<String> parameterNames() {
    return StateMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fState, fAttrib};
  }
  
  @Override
  public StateMatch toImmutable() {
    return isMutable() ? newMatch(fState, fAttrib) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"state\"=" + prettyPrintValue(fState) + ", ");
    
    result.append("\"attrib\"=" + prettyPrintValue(fAttrib)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fState == null) ? 0 : fState.hashCode());
    result = prime * result + ((fAttrib == null) ? 0 : fAttrib.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof StateMatch)) { // this should be infrequent
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
    StateMatch other = (StateMatch) obj;
    if (fState == null) {if (other.fState != null) return false;}
    else if (!fState.equals(other.fState)) return false;
    if (fAttrib == null) {if (other.fAttrib != null) return false;}
    else if (!fAttrib.equals(other.fAttrib)) return false;
    return true;
  }
  
  @Override
  public StateQuerySpecification specification() {
    try {
    	return StateQuerySpecification.instance();
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
  public static StateMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pState the fixed value of pattern parameter state, or null if not bound.
   * @param pAttrib the fixed value of pattern parameter attrib, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static StateMatch newMutableMatch(final State pState, final Boolean pAttrib) {
    return new Mutable(pState, pAttrib);
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
  public static StateMatch newMatch(final State pState, final Boolean pAttrib) {
    return new Immutable(pState, pAttrib);
  }
  
  private static final class Mutable extends StateMatch {
    Mutable(final State pState, final Boolean pAttrib) {
      super(pState, pAttrib);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends StateMatch {
    Immutable(final State pState, final Boolean pAttrib) {
      super(pState, pAttrib);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
