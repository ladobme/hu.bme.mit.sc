package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.HigherPriorityTransientMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import sc.stateChart.State;
import sc.stateChart.Transient;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.higherPriorityTransient pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class HigherPriorityTransientProcessor implements IMatchProcessor<HigherPriorityTransientMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pState the value of pattern parameter state in the currently processed match
   * @param pT1 the value of pattern parameter t1 in the currently processed match
   * @param pT2 the value of pattern parameter t2 in the currently processed match
   * 
   */
  public abstract void process(final State pState, final Transient pT1, final Transient pT2);
  
  @Override
  public void process(final HigherPriorityTransientMatch match) {
    process(match.getState(), match.getT1(), match.getT2());
  }
}
