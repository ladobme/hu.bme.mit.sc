package hu.bme.mit.onlab.scdse;

import java.util.Collection;
import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;

public interface ElementContainer {
	
	public String getName(); //Elem típusa
	public void setComparator(Comparator<EObject> comparator); //Sorrendezéshez
	public boolean modelElement(); //Csak felirat, vagy modellbõl vett elem
	public String getQueryName(); //Ha meg van adva ezt használjuk, ha nincs akkor generálunk az elem típusa alapján
	public String getComparatorAsString(); //Nem biztos hogy kell
	public String getElementStateCode(EObject o); //Állapotkód elõállítása
}
