package hu.bme.mit.onlab.scdse;

import hu.bme.mit.onlab.scquery.ActiveStateMatch;
import hu.bme.mit.onlab.scquery.ActiveStateMatcher;
import hu.bme.mit.onlab.scquery.util.ActiveStateQuerySpecification;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import sc.stateChart.State;
import sc.stateChart.Transient;
import sc.stateChart.Vertex;

@SuppressWarnings("all")
public class ScRuleProvider {
  @Extension
  private BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory();
  
  public BatchTransformationRule<?, ?> activeStateRule;
  
  public ScRuleProvider() {
    try {
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<ActiveStateMatch, ActiveStateMatcher> _createRule = this.factory.<ActiveStateMatch, ActiveStateMatcher>createRule();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<ActiveStateMatch, ActiveStateMatcher> _name = _createRule.name("ActiveStateRule");
      ActiveStateQuerySpecification _instance = ActiveStateQuerySpecification.instance();
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<ActiveStateMatch, ActiveStateMatcher> _precondition = _name.precondition(_instance);
      final IMatchProcessor<ActiveStateMatch> _function = new IMatchProcessor<ActiveStateMatch>() {
        @Override
        public void process(final ActiveStateMatch it) {
          State _active = it.getActive();
          _active.setIsActive(false);
          Transient _transient = it.getTransient();
          Vertex _target = _transient.getTarget();
          _target.setIsActive(true);
        }
      };
      BatchTransformationRuleFactory.BatchTransformationRuleBuilder<ActiveStateMatch, ActiveStateMatcher> _action = _precondition.action(_function);
      BatchTransformationRule<ActiveStateMatch, ActiveStateMatcher> _build = _action.build();
      this.activeStateRule = _build;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
