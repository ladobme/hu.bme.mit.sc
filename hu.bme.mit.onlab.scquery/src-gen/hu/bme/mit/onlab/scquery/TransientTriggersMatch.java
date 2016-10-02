/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.TransientTriggersQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import sc.stateChart.Transient;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.transientTriggers pattern,
 * to be used in conjunction with {@link TransientTriggersMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TransientTriggersMatcher
 * @see TransientTriggersProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TransientTriggersMatch extends BasePatternMatch {
  private Transient fType;
  
  private String fTrigger;
  
  private static List<String> parameterNames = makeImmutableList("type", "trigger");
  
  private TransientTriggersMatch(final Transient pType, final String pTrigger) {
    this.fType = pType;
    this.fTrigger = pTrigger;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("type".equals(parameterName)) return this.fType;
    if ("trigger".equals(parameterName)) return this.fTrigger;
    return null;
  }
  
  public Transient getType() {
    return this.fType;
  }
  
  public String getTrigger() {
    return this.fTrigger;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("type".equals(parameterName) ) {
    	this.fType = (Transient) newValue;
    	return true;
    }
    if ("trigger".equals(parameterName) ) {
    	this.fTrigger = (String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setType(final Transient pType) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fType = pType;
  }
  
  public void setTrigger(final String pTrigger) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrigger = pTrigger;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.transientTriggers";
  }
  
  @Override
  public List<String> parameterNames() {
    return TransientTriggersMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fType, fTrigger};
  }
  
  @Override
  public TransientTriggersMatch toImmutable() {
    return isMutable() ? newMatch(fType, fTrigger) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"type\"=" + prettyPrintValue(fType) + ", ");
    
    result.append("\"trigger\"=" + prettyPrintValue(fTrigger)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fType == null) ? 0 : fType.hashCode());
    result = prime * result + ((fTrigger == null) ? 0 : fTrigger.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TransientTriggersMatch)) { // this should be infrequent
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
    TransientTriggersMatch other = (TransientTriggersMatch) obj;
    if (fType == null) {if (other.fType != null) return false;}
    else if (!fType.equals(other.fType)) return false;
    if (fTrigger == null) {if (other.fTrigger != null) return false;}
    else if (!fTrigger.equals(other.fTrigger)) return false;
    return true;
  }
  
  @Override
  public TransientTriggersQuerySpecification specification() {
    try {
    	return TransientTriggersQuerySpecification.instance();
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
  public static TransientTriggersMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TransientTriggersMatch newMutableMatch(final Transient pType, final String pTrigger) {
    return new Mutable(pType, pTrigger);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pType the fixed value of pattern parameter type, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TransientTriggersMatch newMatch(final Transient pType, final String pTrigger) {
    return new Immutable(pType, pTrigger);
  }
  
  private static final class Mutable extends TransientTriggersMatch {
    Mutable(final Transient pType, final String pTrigger) {
      super(pType, pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TransientTriggersMatch {
    Immutable(final Transient pType, final String pTrigger) {
      super(pType, pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
