package hu.bme.mit.onlab.java;

import org.eclipse.emf.ecore.EObject;

public class CodeContainer {
	private ContainerType type = ContainerType.STRING;
	private String simpleString;
	private String uri;
	private EObject object; 
	private String objectName;
	private String queryName;
	
	public boolean setString(String s){
		switch (type){
		case EMPTY:
			type = ContainerType.STRING;
		case STRING:
			simpleString = s;
			break;
		default:
			return false;
		}
		return true;
	}
	
	public boolean setObject(String ensuri, EObject obj, String name, String query){
		if (ensuri == "" || obj == null || name == "" || query == "")
			return false;
		switch (type){
		case EMPTY:
			type = ContainerType.EOBJECT;
		case EOBJECT:
			uri = ensuri;
			object = obj;
			objectName = name;
			queryName = query;
			break;
		default:
			return false;
		}
		return true;
	}
	
	public String getName(){
		if (type == ContainerType.EOBJECT){
			return objectName;
		}
		return "";
	}
	
}
