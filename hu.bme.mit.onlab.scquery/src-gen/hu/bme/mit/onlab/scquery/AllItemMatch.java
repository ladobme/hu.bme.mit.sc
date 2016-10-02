/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.util.AllItemQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.onlab.scquery.allItem pattern,
 * to be used in conjunction with {@link AllItemMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllItemMatcher
 * @see AllItemProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllItemMatch extends BasePatternMatch {
  private EObject fEObject;
  
  private static List<String> parameterNames = makeImmutableList("EObject");
  
  private AllItemMatch(final EObject pEObject) {
    this.fEObject = pEObject;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("EObject".equals(parameterName)) return this.fEObject;
    return null;
  }
  
  public EObject getEObject() {
    return this.fEObject;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("EObject".equals(parameterName) ) {
    	this.fEObject = (EObject) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEObject(final EObject pEObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEObject = pEObject;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.onlab.scquery.allItem";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllItemMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEObject};
  }
  
  @Override
  public AllItemMatch toImmutable() {
    return isMutable() ? newMatch(fEObject) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"EObject\"=" + prettyPrintValue(fEObject)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEObject == null) ? 0 : fEObject.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AllItemMatch)) { // this should be infrequent
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
    AllItemMatch other = (AllItemMatch) obj;
    if (fEObject == null) {if (other.fEObject != null) return false;}
    else if (!fEObject.equals(other.fEObject)) return false;
    return true;
  }
  
  @Override
  public AllItemQuerySpecification specification() {
    try {
    	return AllItemQuerySpecification.instance();
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
  public static AllItemMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllItemMatch newMutableMatch(final EObject pEObject) {
    return new Mutable(pEObject);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEObject the fixed value of pattern parameter EObject, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllItemMatch newMatch(final EObject pEObject) {
    return new Immutable(pEObject);
  }
  
  private static final class Mutable extends AllItemMatch {
    Mutable(final EObject pEObject) {
      super(pEObject);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllItemMatch {
    Immutable(final EObject pEObject) {
      super(pEObject);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
