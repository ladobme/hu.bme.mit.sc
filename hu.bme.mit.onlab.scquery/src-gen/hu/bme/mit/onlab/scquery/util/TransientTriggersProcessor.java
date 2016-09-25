package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.TransientTriggersMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import sc.stateChart.Transient;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.transientTriggers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TransientTriggersProcessor implements IMatchProcessor<TransientTriggersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pType the value of pattern parameter type in the currently processed match
   * @param pTrigger the value of pattern parameter trigger in the currently processed match
   * 
   */
  public abstract void process(final Transient pType, final String pTrigger);
  
  @Override
  public void process(final TransientTriggersMatch match) {
    process(match.getType(), match.getTrigger());
  }
}
