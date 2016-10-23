/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/generatedQuery.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.StateMatcher;
import hu.bme.mit.onlab.scquery.util.StateQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in generatedQuery.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file generatedQuery.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.onlab.scquery, the group contains the definition of the following patterns: <ul>
 * <li>State</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class GeneratedQuery extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static GeneratedQuery instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new GeneratedQuery();
    }
    return INSTANCE;
  }
  
  private static GeneratedQuery INSTANCE;
  
  private GeneratedQuery() throws ViatraQueryException {
    querySpecifications.add(StateQuerySpecification.instance());
  }
  
  public StateQuerySpecification getState() throws ViatraQueryException {
    return StateQuerySpecification.instance();
  }
  
  public StateMatcher getState(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StateMatcher.on(engine);
  }
}
