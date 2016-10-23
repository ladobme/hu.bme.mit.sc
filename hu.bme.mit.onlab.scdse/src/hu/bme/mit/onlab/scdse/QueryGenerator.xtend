package hu.bme.mit.onlab.scdse

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EAttribute;

class QueryGenerator {
	
	def public String createQuery(String uri, EClass eClass, EAttribute attrib){
		val name = eClass.getName();
		val attribName = attrib.getName();

		'''
		package hu.bme.mit.onlab.scquery
		
		import "http://www.eclipse.org/emf/2002/Ecore";
		import "«uri»";
		
		pattern «name»(«name.toFirstLower()»:«name», attrib)= {
			«name»(«name.toFirstLower()»);
			«name».«attribName»(«name.toFirstLower()», attrib);
		}
		'''
	}
}