/**
 * Generated from platform:/resource/hu.bme.mit.onlab.scquery/src/hu/bme/mit/onlab/scquery/querys.vql
 */
package hu.bme.mit.onlab.scquery;

import hu.bme.mit.onlab.scquery.ActiveStateMatcher;
import hu.bme.mit.onlab.scquery.AllItemMatcher;
import hu.bme.mit.onlab.scquery.EntryPointInRegionMatcher;
import hu.bme.mit.onlab.scquery.EntryPointMatcher;
import hu.bme.mit.onlab.scquery.HardObjectMatcher;
import hu.bme.mit.onlab.scquery.HigherPriorityTransientMatcher;
import hu.bme.mit.onlab.scquery.InvalidTerminateStatesMatcher;
import hu.bme.mit.onlab.scquery.NeighbourStateMatcher;
import hu.bme.mit.onlab.scquery.RegionWithMultipleEntryPointMatcher;
import hu.bme.mit.onlab.scquery.StatesWithMoreTransientMatcher;
import hu.bme.mit.onlab.scquery.TransientTriggersMatcher;
import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification;
import hu.bme.mit.onlab.scquery.util.AllItemQuerySpecification;
import hu.bme.mit.onlab.scquery.util.EntryPointInRegionQuerySpecification;
import hu.bme.mit.onlab.scquery.util.EntryPointQuerySpecification;
import hu.bme.mit.onlab.scquery.util.HardObjectQuerySpecification;
import hu.bme.mit.onlab.scquery.util.HigherPriorityTransientQuerySpecification;
import hu.bme.mit.onlab.scquery.util.InvalidTerminateStatesQuerySpecification;
import hu.bme.mit.onlab.scquery.util.NeighbourStateQuerySpecification;
import hu.bme.mit.onlab.scquery.util.RegionWithMultipleEntryPointQuerySpecification;
import hu.bme.mit.onlab.scquery.util.StatesWithMoreTransientQuerySpecification;
import hu.bme.mit.onlab.scquery.util.TransientTriggersQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in querys.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file querys.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.onlab.scquery, the group contains the definition of the following patterns: <ul>
 * <li>allItem</li>
 * <li>transientTriggers</li>
 * <li>statesWithMoreTransient</li>
 * <li>neighbourState</li>
 * <li>invalidTerminateStates</li>
 * <li>entryPoint</li>
 * <li>entryPointInRegion</li>
 * <li>regionWithMultipleEntryPoint</li>
 * <li>higherPriorityTransient</li>
 * <li>activeState</li>
 * <li>hardObject</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Querys extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Querys instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Querys();
    }
    return INSTANCE;
  }
  
  private static Querys INSTANCE;
  
  private Querys() throws ViatraQueryException {
    querySpecifications.add(AllItemQuerySpecification.instance());
    querySpecifications.add(TransientTriggersQuerySpecification.instance());
    querySpecifications.add(StatesWithMoreTransientQuerySpecification.instance());
    querySpecifications.add(NeighbourStateQuerySpecification.instance());
    querySpecifications.add(InvalidTerminateStatesQuerySpecification.instance());
    querySpecifications.add(EntryPointQuerySpecification.instance());
    querySpecifications.add(EntryPointInRegionQuerySpecification.instance());
    querySpecifications.add(RegionWithMultipleEntryPointQuerySpecification.instance());
    querySpecifications.add(HigherPriorityTransientQuerySpecification.instance());
    querySpecifications.add(ActiveStateQuerySpecification.instance());
    querySpecifications.add(HardObjectQuerySpecification.instance());
  }
  
  public AllItemQuerySpecification getAllItem() throws ViatraQueryException {
    return AllItemQuerySpecification.instance();
  }
  
  public AllItemMatcher getAllItem(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllItemMatcher.on(engine);
  }
  
  public TransientTriggersQuerySpecification getTransientTriggers() throws ViatraQueryException {
    return TransientTriggersQuerySpecification.instance();
  }
  
  public TransientTriggersMatcher getTransientTriggers(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TransientTriggersMatcher.on(engine);
  }
  
  public StatesWithMoreTransientQuerySpecification getStatesWithMoreTransient() throws ViatraQueryException {
    return StatesWithMoreTransientQuerySpecification.instance();
  }
  
  public StatesWithMoreTransientMatcher getStatesWithMoreTransient(final ViatraQueryEngine engine) throws ViatraQueryException {
    return StatesWithMoreTransientMatcher.on(engine);
  }
  
  public NeighbourStateQuerySpecification getNeighbourState() throws ViatraQueryException {
    return NeighbourStateQuerySpecification.instance();
  }
  
  public NeighbourStateMatcher getNeighbourState(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NeighbourStateMatcher.on(engine);
  }
  
  public InvalidTerminateStatesQuerySpecification getInvalidTerminateStates() throws ViatraQueryException {
    return InvalidTerminateStatesQuerySpecification.instance();
  }
  
  public InvalidTerminateStatesMatcher getInvalidTerminateStates(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InvalidTerminateStatesMatcher.on(engine);
  }
  
  public EntryPointQuerySpecification getEntryPoint() throws ViatraQueryException {
    return EntryPointQuerySpecification.instance();
  }
  
  public EntryPointMatcher getEntryPoint(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntryPointMatcher.on(engine);
  }
  
  public EntryPointInRegionQuerySpecification getEntryPointInRegion() throws ViatraQueryException {
    return EntryPointInRegionQuerySpecification.instance();
  }
  
  public EntryPointInRegionMatcher getEntryPointInRegion(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntryPointInRegionMatcher.on(engine);
  }
  
  public RegionWithMultipleEntryPointQuerySpecification getRegionWithMultipleEntryPoint() throws ViatraQueryException {
    return RegionWithMultipleEntryPointQuerySpecification.instance();
  }
  
  public RegionWithMultipleEntryPointMatcher getRegionWithMultipleEntryPoint(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RegionWithMultipleEntryPointMatcher.on(engine);
  }
  
  public HigherPriorityTransientQuerySpecification getHigherPriorityTransient() throws ViatraQueryException {
    return HigherPriorityTransientQuerySpecification.instance();
  }
  
  public HigherPriorityTransientMatcher getHigherPriorityTransient(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HigherPriorityTransientMatcher.on(engine);
  }
  
  public ActiveStateQuerySpecification getActiveState() throws ViatraQueryException {
    return ActiveStateQuerySpecification.instance();
  }
  
  public ActiveStateMatcher getActiveState(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ActiveStateMatcher.on(engine);
  }
  
  public HardObjectQuerySpecification getHardObject() throws ViatraQueryException {
    return HardObjectQuerySpecification.instance();
  }
  
  public HardObjectMatcher getHardObject(final ViatraQueryEngine engine) throws ViatraQueryException {
    return HardObjectMatcher.on(engine);
  }
}
