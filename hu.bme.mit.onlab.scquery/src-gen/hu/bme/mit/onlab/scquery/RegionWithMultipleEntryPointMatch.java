/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.RegionWithMultipleEntryPointQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import sc.stateChart.Region;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.regionWithMultipleEntryPoint pattern,
 * to be used in conjunction with {@link RegionWithMultipleEntryPointMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RegionWithMultipleEntryPointMatcher
 * @see RegionWithMultipleEntryPointProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RegionWithMultipleEntryPointMatch extends BasePatternMatch {
  private Region fName;
  
  private static List<String> parameterNames = makeImmutableList("name");
  
  private RegionWithMultipleEntryPointMatch(final Region pName) {
    this.fName = pName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("name".equals(parameterName)) return this.fName;
    return null;
  }
  
  public Region getName() {
    return this.fName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("name".equals(parameterName) ) {
    	this.fName = (Region) newValue;
    	return true;
    }
    return false;
  }
  
  public void setName(final Region pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.regionWithMultipleEntryPoint";
  }
  
  @Override
  public List<String> parameterNames() {
    return RegionWithMultipleEntryPointMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fName};
  }
  
  @Override
  public RegionWithMultipleEntryPointMatch toImmutable() {
    return isMutable() ? newMatch(fName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"name\"=" + prettyPrintValue(fName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RegionWithMultipleEntryPointMatch)) { // this should be infrequent
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
    RegionWithMultipleEntryPointMatch other = (RegionWithMultipleEntryPointMatch) obj;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public RegionWithMultipleEntryPointQuerySpecification specification() {
    try {
    	return RegionWithMultipleEntryPointQuerySpecification.instance();
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
  public static RegionWithMultipleEntryPointMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RegionWithMultipleEntryPointMatch newMutableMatch(final Region pName) {
    return new Mutable(pName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RegionWithMultipleEntryPointMatch newMatch(final Region pName) {
    return new Immutable(pName);
  }
  
  private static final class Mutable extends RegionWithMultipleEntryPointMatch {
    Mutable(final Region pName) {
      super(pName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RegionWithMultipleEntryPointMatch {
    Immutable(final Region pName) {
      super(pName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
