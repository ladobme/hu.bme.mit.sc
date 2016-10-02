/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.EntryPointMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import sc.stateChart.PseudoState;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.entryPoint pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EntryPointProcessor implements IMatchProcessor<EntryPointMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEp the value of pattern parameter ep in the currently processed match
   * 
   */
  public abstract void process(final PseudoState pEp);
  
  @Override
  public void process(final EntryPointMatch match) {
    process(match.getEp());
  }
}
