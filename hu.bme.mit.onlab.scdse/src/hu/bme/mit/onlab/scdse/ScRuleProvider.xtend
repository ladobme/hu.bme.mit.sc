package hu.bme.mit.onlab.scdse

import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification

class ScRuleProvider {
	private extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory
	
	public BatchTransformationRule<?, ?> activeStateRule;
   

    new() {
        activeStateRule = createRule
            .name("ActiveStateRule")
            .precondition(ActiveStateQuerySpecification.instance())
            .action[
                active.setIsActive(false);
	    		transient.getTarget().setIsActive(true);
            ]
            .build
    }
}