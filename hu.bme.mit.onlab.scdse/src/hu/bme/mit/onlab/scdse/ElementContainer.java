package hu.bme.mit.onlab.scdse;

import java.util.Collection;
import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;

public interface ElementContainer {
	
	public String getName(); //Elem t�pusa
	public void setComparator(Comparator<EObject> comparator); //Sorrendez�shez
	public boolean modelElement(); //Csak felirat, vagy modellb�l vett elem
	public String getQueryName(); //Ha meg van adva ezt haszn�ljuk, ha nincs akkor gener�lunk az elem t�pusa alapj�n
	public String getComparatorAsString(); //Nem biztos hogy kell
	public String getElementStateCode(EObject o); //�llapotk�d el��ll�t�sa
}
