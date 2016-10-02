/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.EntryPointInRegionMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import sc.stateChart.PseudoState;
import sc.stateChart.Region;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.entryPointInRegion pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EntryPointInRegionProcessor implements IMatchProcessor<EntryPointInRegionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRegion the value of pattern parameter region in the currently processed match
   * @param pEpoints the value of pattern parameter epoints in the currently processed match
   * 
   */
  public abstract void process(final Region pRegion, final PseudoState pEpoints);
  
  @Override
  public void process(final EntryPointInRegionMatch match) {
    process(match.getRegion(), match.getEpoints());
  }
}
