package hu.bme.mit.onlab.scdse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;

import sc.stateChart.StateChartPackage;

public class XtendGen {
	
	@Test
	public void genFile(){
		boolean genCoder = false;
		boolean genQuery = true;
		if(genCoder){
			//Xtend -> File
		    StateChartCoderGenerator gen = new StateChartCoderGenerator();
		    gen.listAllState(true);
		    gen.setSeparator(';');
		    try {
				File file = new File("test2.txt");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(gen.createCoder("TestCoderTwo"));
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(genQuery){
			QueryGenerator gen = new QueryGenerator();
		    try {
				File file = new File("query_with_attribute.txt");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(gen.createQuery(StateChartPackage.eNS_URI,StateChartPackage.Literals.STATE, StateChartPackage.Literals.VERTEX__IS_ACTIVE));
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

