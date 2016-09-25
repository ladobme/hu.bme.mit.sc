package hu.bme.mit.onlab.scdse;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;

public class StateChartCoderFactory implements IStateCoderFactory {

	@Override
	public IStateCoder createStateCoder() {
		return new StateChartCoder();
	}

}
