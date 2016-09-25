package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.HardObjectMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import sc.stateChart.State;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.hardObject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class HardObjectProcessor implements IMatchProcessor<HardObjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pShutdown the value of pattern parameter shutdown in the currently processed match
   * 
   */
  public abstract void process(final State pShutdown);
  
  @Override
  public void process(final HardObjectMatch match) {
    process(match.getShutdown());
  }
}
