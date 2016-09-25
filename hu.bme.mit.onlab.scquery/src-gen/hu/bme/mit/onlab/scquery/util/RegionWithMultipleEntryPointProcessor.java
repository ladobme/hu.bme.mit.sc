package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.RegionWithMultipleEntryPointMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import sc.stateChart.Region;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.regionWithMultipleEntryPoint pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RegionWithMultipleEntryPointProcessor implements IMatchProcessor<RegionWithMultipleEntryPointMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pName the value of pattern parameter name in the currently processed match
   * 
   */
  public abstract void process(final Region pName);
  
  @Override
  public void process(final RegionWithMultipleEntryPointMatch match) {
    process(match.getName());
  }
}
