package hu.bme.mit.onlab.java;

import hu.bme.mit.onlab.scquery.util.ActiveStateProcessor;
import sc.stateChart.State;
import sc.stateChart.Transient;

public class ChangeState extends ActiveStateProcessor{

	@Override
	public void process(State pActivestate, Transient pTransient) {
		// TODO Auto-generated method stub
		System.out.println("State: "+ pActivestate + " Transient: " + pTransient);
	}
}
