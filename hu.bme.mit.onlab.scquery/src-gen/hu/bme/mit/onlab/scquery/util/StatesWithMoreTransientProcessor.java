/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.StatesWithMoreTransientMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import sc.stateChart.State;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.statesWithMoreTransient pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class StatesWithMoreTransientProcessor implements IMatchProcessor<StatesWithMoreTransientMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pState the value of pattern parameter state in the currently processed match
   * 
   */
  public abstract void process(final State pState);
  
  @Override
  public void process(final StatesWithMoreTransientMatch match) {
    process(match.getState());
  }
}
