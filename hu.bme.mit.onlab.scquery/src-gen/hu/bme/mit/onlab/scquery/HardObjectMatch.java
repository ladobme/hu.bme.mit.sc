/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.HardObjectQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import sc.stateChart.State;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.hardObject pattern,
 * to be used in conjunction with {@link HardObjectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see HardObjectMatcher
 * @see HardObjectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class HardObjectMatch extends BasePatternMatch {
  private State fShutdown;
  
  private static List<String> parameterNames = makeImmutableList("shutdown");
  
  private HardObjectMatch(final State pShutdown) {
    this.fShutdown = pShutdown;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("shutdown".equals(parameterName)) return this.fShutdown;
    return null;
  }
  
  public State getShutdown() {
    return this.fShutdown;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("shutdown".equals(parameterName) ) {
    	this.fShutdown = (State) newValue;
    	return true;
    }
    return false;
  }
  
  public void setShutdown(final State pShutdown) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fShutdown = pShutdown;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.hardObject";
  }
  
  @Override
  public List<String> parameterNames() {
    return HardObjectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fShutdown};
  }
  
  @Override
  public HardObjectMatch toImmutable() {
    return isMutable() ? newMatch(fShutdown) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"shutdown\"=" + prettyPrintValue(fShutdown)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fShutdown == null) ? 0 : fShutdown.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof HardObjectMatch)) { // this should be infrequent
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
    HardObjectMatch other = (HardObjectMatch) obj;
    if (fShutdown == null) {if (other.fShutdown != null) return false;}
    else if (!fShutdown.equals(other.fShutdown)) return false;
    return true;
  }
  
  @Override
  public HardObjectQuerySpecification specification() {
    try {
    	return HardObjectQuerySpecification.instance();
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
  public static HardObjectMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static HardObjectMatch newMutableMatch(final State pShutdown) {
    return new Mutable(pShutdown);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pShutdown the fixed value of pattern parameter shutdown, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static HardObjectMatch newMatch(final State pShutdown) {
    return new Immutable(pShutdown);
  }
  
  private static final class Mutable extends HardObjectMatch {
    Mutable(final State pShutdown) {
      super(pShutdown);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends HardObjectMatch {
    Immutable(final State pShutdown) {
      super(pShutdown);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
