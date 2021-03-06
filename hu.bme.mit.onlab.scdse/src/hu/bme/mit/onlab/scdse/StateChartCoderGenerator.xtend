package hu.bme.mit.onlab.scdse

import org.eclipse.emf.ecore.EClass
import java.util.ArrayList
import org.eclipse.emf.ecore.EAttribute
import java.util.List

class StateChartCoderGenerator {
	char separator=';';
	boolean sort=true;
	String nameOfActivationMatch;
	EClass rootElement;
	String rootPackage = "";
	List<StateCodeElement> stateCodeElements = new ArrayList<StateCodeElement>;
	
	def public void setSeparator(char c){
		separator=c;
	}
	
	def public void setSort(boolean s){
		sort=s;
	}
	
	def public void setUsedActivationMatch(String match){
		nameOfActivationMatch = match;
	}
	
	def public void setRootElement(EClass root){
		rootElement = root;
	}
	
	def public void setPackage(String setpackage){
		rootPackage = setpackage;
	}
	
	def public void addStateCodeElementList(List<StateCodeElement> list){
		stateCodeElements = list;
	}
	
	
	///
	public static class StateCodeElement {
		EClass clazz;
		List<EAttribute> attributes = new ArrayList<EAttribute>();
		String queryName;
		def getClassName() {
			clazz.name
		}
		def getQueryName(){
			queryName;
		}
		def getAttributes(){
			attributes;
		}
		
		def setClass(EClass eClass){
			clazz = eClass;
		}
		
		def addAttribute(EAttribute attrib){
			attributes.add(attrib);
		}
		
		def setQueryName(String name){
			queryName = name;
		}
	}
	///
	
	def public String createCoder(String name){
		'''
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.Comparator;
		
		import org.eclipse.emf.common.notify.Notifier;
		import org.eclipse.viatra.dse.api.DSEException;
		import org.eclipse.viatra.dse.statecode.IStateCoder;
		import org.eclipse.viatra.query.runtime.api.IPatternMatch;
		
		import hu.bme.mit.onlab.scquery.ActiveStateMatch;
		import �rootPackage�.*;
		
			public class �name� implements IStateCoder {
			
			private �rootElement� model;
			private ViatraQueryEngine engine;


			@Override
			public void init(Notifier notifier) {
				model = (�rootElement�) notifier;
				engine = getQueryEngine();
			}
		
			@Override
			public Object createStateCode() {
				StringBuilder sb = new StringBuilder();
				StringBuilder temp = new StringBuilder();
				////
				�FOR element : stateCodeElements�
					ArrayList<String> �element.stringArrayName� = new ArrayList<String>();
					�element.getQueryName()�Matcher �element.getQueryName().toFirstLower�Matcher = �element.getQueryName()�Matcher.on(engine); 
					for(�element.className� object : �element.getQueryName().toFirstLower�Matcher.getAllMatches()) {
						temp = "";
						�FOR attrib : element.getAttributes()�
							temp.append(object.get�attrib.name�());
							temp.append('-');
						�ENDFOR�
						temp.deleteCharAt(temp.length()-1);
						�element.stringArrayName�.add(temp);
					}
					�IF sort�
					Collections.sort(�element.stringArrayName�);
					�ENDIF�
				�ENDFOR�

				�FOR element : stateCodeElements�
					for (String s : �element.stringArrayName�){
						sb.append(s);
						sb.append('�separator�');
					}
				�ENDFOR�
				return sb.toString();
			}
		
			@Override
			public Object createActivationCode(IPatternMatch match) {
				if (match instanceof �nameOfActivationMatch�){
					�nameOfActivationMatch� asm = (�nameOfActivationMatch�) match;
					return asm.getTransient().getName();
				} else
					throw new DSEException ("Unsupported rule.");
			}
			
			private ViatraQueryEngine getQueryEngine () throws ViatraQueryException{
					ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(model.eResource()));
					return engine;
				}
				
			private ArrayList<String> sort(ArrayList<String> array){
				Collections.sort(array, new Comparator<String>() {
									    public int compare(String str1, String str2) {
									        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
									        if (res == 0) {
									            res = str1.compareTo(str2);
									        }
									        return res;
									    }});
				}
		}
		'''
	}
	
	private def getStringArrayName(StateCodeElement element) {
		'''�element.className�codes'''
	}
}