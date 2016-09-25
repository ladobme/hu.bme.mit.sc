package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import sc.stateChart.State;
import sc.stateChart.Transient;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.activeState pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ActiveStateProcessor implements IMatchProcessor<ActiveStateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pActive the value of pattern parameter active in the currently processed match
   * @param pTransient the value of pattern parameter transient in the currently processed match
   * 
   */
  public abstract void process(final State pActive, final Transient pTransient);
  
  @Override
  public void process(final ActiveStateMatch match) {
    process(match.getActive(), match.getTransient());
  }
}
