/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.EntryPointInRegionQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import sc.stateChart.PseudoState;
import sc.stateChart.Region;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.entryPointInRegion pattern,
 * to be used in conjunction with {@link EntryPointInRegionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EntryPointInRegionMatcher
 * @see EntryPointInRegionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EntryPointInRegionMatch extends BasePatternMatch {
  private Region fRegion;
  
  private PseudoState fEpoints;
  
  private static List<String> parameterNames = makeImmutableList("region", "epoints");
  
  private EntryPointInRegionMatch(final Region pRegion, final PseudoState pEpoints) {
    this.fRegion = pRegion;
    this.fEpoints = pEpoints;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("region".equals(parameterName)) return this.fRegion;
    if ("epoints".equals(parameterName)) return this.fEpoints;
    return null;
  }
  
  public Region getRegion() {
    return this.fRegion;
  }
  
  public PseudoState getEpoints() {
    return this.fEpoints;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("region".equals(parameterName) ) {
    	this.fRegion = (Region) newValue;
    	return true;
    }
    if ("epoints".equals(parameterName) ) {
    	this.fEpoints = (PseudoState) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRegion(final Region pRegion) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRegion = pRegion;
  }
  
  public void setEpoints(final PseudoState pEpoints) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEpoints = pEpoints;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.entryPointInRegion";
  }
  
  @Override
  public List<String> parameterNames() {
    return EntryPointInRegionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRegion, fEpoints};
  }
  
  @Override
  public EntryPointInRegionMatch toImmutable() {
    return isMutable() ? newMatch(fRegion, fEpoints) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"region\"=" + prettyPrintValue(fRegion) + ", ");
    
    result.append("\"epoints\"=" + prettyPrintValue(fEpoints)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRegion == null) ? 0 : fRegion.hashCode());
    result = prime * result + ((fEpoints == null) ? 0 : fEpoints.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EntryPointInRegionMatch)) { // this should be infrequent
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
    EntryPointInRegionMatch other = (EntryPointInRegionMatch) obj;
    if (fRegion == null) {if (other.fRegion != null) return false;}
    else if (!fRegion.equals(other.fRegion)) return false;
    if (fEpoints == null) {if (other.fEpoints != null) return false;}
    else if (!fEpoints.equals(other.fEpoints)) return false;
    return true;
  }
  
  @Override
  public EntryPointInRegionQuerySpecification specification() {
    try {
    	return EntryPointInRegionQuerySpecification.instance();
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
  public static EntryPointInRegionMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EntryPointInRegionMatch newMutableMatch(final Region pRegion, final PseudoState pEpoints) {
    return new Mutable(pRegion, pEpoints);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRegion the fixed value of pattern parameter region, or null if not bound.
   * @param pEpoints the fixed value of pattern parameter epoints, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EntryPointInRegionMatch newMatch(final Region pRegion, final PseudoState pEpoints) {
    return new Immutable(pRegion, pEpoints);
  }
  
  private static final class Mutable extends EntryPointInRegionMatch {
    Mutable(final Region pRegion, final PseudoState pEpoints) {
      super(pRegion, pEpoints);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EntryPointInRegionMatch {
    Immutable(final Region pRegion, final PseudoState pEpoints) {
      super(pRegion, pEpoints);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
