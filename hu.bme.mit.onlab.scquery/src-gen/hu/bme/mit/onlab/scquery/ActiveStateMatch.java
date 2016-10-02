/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import sc.stateChart.State;
import sc.stateChart.Transient;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.activeState pattern,
 * to be used in conjunction with {@link ActiveStateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ActiveStateMatcher
 * @see ActiveStateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ActiveStateMatch extends BasePatternMatch {
  private State fActive;
  
  private Transient fTransient;
  
  private static List<String> parameterNames = makeImmutableList("active", "transient");
  
  private ActiveStateMatch(final State pActive, final Transient pTransient) {
    this.fActive = pActive;
    this.fTransient = pTransient;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("active".equals(parameterName)) return this.fActive;
    if ("transient".equals(parameterName)) return this.fTransient;
    return null;
  }
  
  public State getActive() {
    return this.fActive;
  }
  
  public Transient getTransient() {
    return this.fTransient;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("active".equals(parameterName) ) {
    	this.fActive = (State) newValue;
    	return true;
    }
    if ("transient".equals(parameterName) ) {
    	this.fTransient = (Transient) newValue;
    	return true;
    }
    return false;
  }
  
  public void setActive(final State pActive) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fActive = pActive;
  }
  
  public void setTransient(final Transient pTransient) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTransient = pTransient;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.activeState";
  }
  
  @Override
  public List<String> parameterNames() {
    return ActiveStateMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fActive, fTransient};
  }
  
  @Override
  public ActiveStateMatch toImmutable() {
    return isMutable() ? newMatch(fActive, fTransient) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"active\"=" + prettyPrintValue(fActive) + ", ");
    
    result.append("\"transient\"=" + prettyPrintValue(fTransient)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fActive == null) ? 0 : fActive.hashCode());
    result = prime * result + ((fTransient == null) ? 0 : fTransient.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ActiveStateMatch)) { // this should be infrequent
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
    ActiveStateMatch other = (ActiveStateMatch) obj;
    if (fActive == null) {if (other.fActive != null) return false;}
    else if (!fActive.equals(other.fActive)) return false;
    if (fTransient == null) {if (other.fTransient != null) return false;}
    else if (!fTransient.equals(other.fTransient)) return false;
    return true;
  }
  
  @Override
  public ActiveStateQuerySpecification specification() {
    try {
    	return ActiveStateQuerySpecification.instance();
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
  public static ActiveStateMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ActiveStateMatch newMutableMatch(final State pActive, final Transient pTransient) {
    return new Mutable(pActive, pTransient);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pActive the fixed value of pattern parameter active, or null if not bound.
   * @param pTransient the fixed value of pattern parameter transient, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ActiveStateMatch newMatch(final State pActive, final Transient pTransient) {
    return new Immutable(pActive, pTransient);
  }
  
  private static final class Mutable extends ActiveStateMatch {
    Mutable(final State pActive, final Transient pTransient) {
      super(pActive, pTransient);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ActiveStateMatch {
    Immutable(final State pActive, final Transient pTransient) {
      super(pActive, pTransient);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
