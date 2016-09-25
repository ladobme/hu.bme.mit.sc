package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.EntryPointQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import sc.stateChart.PseudoState;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.entryPoint pattern,
 * to be used in conjunction with {@link EntryPointMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EntryPointMatcher
 * @see EntryPointProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EntryPointMatch extends BasePatternMatch {
  private PseudoState fEp;
  
  private static List<String> parameterNames = makeImmutableList("ep");
  
  private EntryPointMatch(final PseudoState pEp) {
    this.fEp = pEp;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ep".equals(parameterName)) return this.fEp;
    return null;
  }
  
  public PseudoState getEp() {
    return this.fEp;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ep".equals(parameterName) ) {
    	this.fEp = (sc.stateChart.PseudoState) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEp(final PseudoState pEp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEp = pEp;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.entryPoint";
  }
  
  @Override
  public List<String> parameterNames() {
    return EntryPointMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEp};
  }
  
  @Override
  public EntryPointMatch toImmutable() {
    return isMutable() ? newMatch(fEp) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ep\"=" + prettyPrintValue(fEp)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEp == null) ? 0 : fEp.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EntryPointMatch)) { // this should be infrequent
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
    EntryPointMatch other = (EntryPointMatch) obj;
    if (fEp == null) {if (other.fEp != null) return false;}
    else if (!fEp.equals(other.fEp)) return false;
    return true;
  }
  
  @Override
  public EntryPointQuerySpecification specification() {
    try {
    	return EntryPointQuerySpecification.instance();
    } catch (IncQueryException ex) {
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
  public static EntryPointMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EntryPointMatch newMutableMatch(final PseudoState pEp) {
    return new Mutable(pEp);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEp the fixed value of pattern parameter ep, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EntryPointMatch newMatch(final PseudoState pEp) {
    return new Immutable(pEp);
  }
  
  private static final class Mutable extends EntryPointMatch {
    Mutable(final PseudoState pEp) {
      super(pEp);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EntryPointMatch {
    Immutable(final PseudoState pEp) {
      super(pEp);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
