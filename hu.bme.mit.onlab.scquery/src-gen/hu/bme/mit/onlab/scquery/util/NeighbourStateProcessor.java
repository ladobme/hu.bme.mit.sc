package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.NeighbourStateMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import sc.stateChart.State;
import sc.stateChart.Vertex;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.neighbourState pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NeighbourStateProcessor implements IMatchProcessor<NeighbourStateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1 the value of pattern parameter s1 in the currently processed match
   * @param pS2 the value of pattern parameter s2 in the currently processed match
   * 
   */
  public abstract void process(final Vertex pS1, final State pS2);
  
  @Override
  public void process(final NeighbourStateMatch match) {
    process(match.getS1(), match.getS2());
  }
}
