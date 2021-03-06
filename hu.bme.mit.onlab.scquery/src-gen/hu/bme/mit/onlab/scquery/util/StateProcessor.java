/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/generatedQuery.vql
 */
package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.StateMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import sc.stateChart.State;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.State pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class StateProcessor implements IMatchProcessor<StateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pState the value of pattern parameter state in the currently processed match
   * @param pAttrib the value of pattern parameter attrib in the currently processed match
   * 
   */
  public abstract void process(final State pState, final Boolean pAttrib);
  
  @Override
  public void process(final StateMatch match) {
    process(match.getState(), match.getAttrib());
  }
}
