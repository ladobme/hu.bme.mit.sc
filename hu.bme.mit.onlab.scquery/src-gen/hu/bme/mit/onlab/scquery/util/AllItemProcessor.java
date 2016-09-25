package hu.bme.mit.onlab.scquery.util;

import hu.bme.mit.onlab.scquery.AllItemMatch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.onlab.scquery.allItem pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllItemProcessor implements IMatchProcessor<AllItemMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEObject the value of pattern parameter EObject in the currently processed match
   * 
   */
  public abstract void process(final EObject pEObject);
  
  @Override
  public void process(final AllItemMatch match) {
    process(match.getEObject());
  }
}
