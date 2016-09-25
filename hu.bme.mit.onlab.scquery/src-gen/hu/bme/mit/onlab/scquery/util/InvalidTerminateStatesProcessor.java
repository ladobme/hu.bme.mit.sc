package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.InvalidTerminateStatesMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import sc.stateChart.PseudoState;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.invalidTerminateStates pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class InvalidTerminateStatesProcessor implements IMatchProcessor<InvalidTerminateStatesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pState the value of pattern parameter state in the currently processed match
   * 
   */
  public abstract void process(final PseudoState pState);
  
  @Override
  public void process(final InvalidTerminateStatesMatch match) {
    process(match.getState());
  }
}
