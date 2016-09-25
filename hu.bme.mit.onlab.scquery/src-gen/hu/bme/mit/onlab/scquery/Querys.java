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
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in querys.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file querys.eiq,
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
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Querys instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Querys();
    }
    return INSTANCE;
  }
  
  private static Querys INSTANCE;
  
  private Querys() throws IncQueryException {
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
  
  public AllItemQuerySpecification getAllItem() throws IncQueryException {
    return AllItemQuerySpecification.instance();
  }
  
  public AllItemMatcher getAllItem(final IncQueryEngine engine) throws IncQueryException {
    return AllItemMatcher.on(engine);
  }
  
  public TransientTriggersQuerySpecification getTransientTriggers() throws IncQueryException {
    return TransientTriggersQuerySpecification.instance();
  }
  
  public TransientTriggersMatcher getTransientTriggers(final IncQueryEngine engine) throws IncQueryException {
    return TransientTriggersMatcher.on(engine);
  }
  
  public StatesWithMoreTransientQuerySpecification getStatesWithMoreTransient() throws IncQueryException {
    return StatesWithMoreTransientQuerySpecification.instance();
  }
  
  public StatesWithMoreTransientMatcher getStatesWithMoreTransient(final IncQueryEngine engine) throws IncQueryException {
    return StatesWithMoreTransientMatcher.on(engine);
  }
  
  public NeighbourStateQuerySpecification getNeighbourState() throws IncQueryException {
    return NeighbourStateQuerySpecification.instance();
  }
  
  public NeighbourStateMatcher getNeighbourState(final IncQueryEngine engine) throws IncQueryException {
    return NeighbourStateMatcher.on(engine);
  }
  
  public InvalidTerminateStatesQuerySpecification getInvalidTerminateStates() throws IncQueryException {
    return InvalidTerminateStatesQuerySpecification.instance();
  }
  
  public InvalidTerminateStatesMatcher getInvalidTerminateStates(final IncQueryEngine engine) throws IncQueryException {
    return InvalidTerminateStatesMatcher.on(engine);
  }
  
  public EntryPointQuerySpecification getEntryPoint() throws IncQueryException {
    return EntryPointQuerySpecification.instance();
  }
  
  public EntryPointMatcher getEntryPoint(final IncQueryEngine engine) throws IncQueryException {
    return EntryPointMatcher.on(engine);
  }
  
  public EntryPointInRegionQuerySpecification getEntryPointInRegion() throws IncQueryException {
    return EntryPointInRegionQuerySpecification.instance();
  }
  
  public EntryPointInRegionMatcher getEntryPointInRegion(final IncQueryEngine engine) throws IncQueryException {
    return EntryPointInRegionMatcher.on(engine);
  }
  
  public RegionWithMultipleEntryPointQuerySpecification getRegionWithMultipleEntryPoint() throws IncQueryException {
    return RegionWithMultipleEntryPointQuerySpecification.instance();
  }
  
  public RegionWithMultipleEntryPointMatcher getRegionWithMultipleEntryPoint(final IncQueryEngine engine) throws IncQueryException {
    return RegionWithMultipleEntryPointMatcher.on(engine);
  }
  
  public HigherPriorityTransientQuerySpecification getHigherPriorityTransient() throws IncQueryException {
    return HigherPriorityTransientQuerySpecification.instance();
  }
  
  public HigherPriorityTransientMatcher getHigherPriorityTransient(final IncQueryEngine engine) throws IncQueryException {
    return HigherPriorityTransientMatcher.on(engine);
  }
  
  public ActiveStateQuerySpecification getActiveState() throws IncQueryException {
    return ActiveStateQuerySpecification.instance();
  }
  
  public ActiveStateMatcher getActiveState(final IncQueryEngine engine) throws IncQueryException {
    return ActiveStateMatcher.on(engine);
  }
  
  public HardObjectQuerySpecification getHardObject() throws IncQueryException {
    return HardObjectQuerySpecification.instance();
  }
  
  public HardObjectMatcher getHardObject(final IncQueryEngine engine) throws IncQueryException {
    return HardObjectMatcher.on(engine);
  }
}
