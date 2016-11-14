package hu.bme.mit.onlab.scdse;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class StateChartCoderGenerator {
  public static class StateCodeElement {
    private EClass clazz;
    
    private List<EAttribute> attributes = new ArrayList<EAttribute>();
    
    private String queryName;
    
    public String getClassName() {
      return this.clazz.getName();
    }
    
    public String getQueryName() {
      return this.queryName;
    }
    
    public List<EAttribute> getAttributes() {
      return this.attributes;
    }
    
    public EClass setClass(final EClass eClass) {
      return this.clazz = eClass;
    }
    
    public boolean addAttribute(final EAttribute attrib) {
      return this.attributes.add(attrib);
    }
    
    public String setQueryName(final String name) {
      return this.queryName = name;
    }
  }
  
  private char separator = ';';
  
  private boolean sort = true;
  
  private String nameOfActivationMatch;
  
  private EClass rootElement;
  
  private String rootPackage = "";
  
  private List<StateChartCoderGenerator.StateCodeElement> stateCodeElements = new ArrayList<StateChartCoderGenerator.StateCodeElement>();
  
  public void setSeparator(final char c) {
    this.separator = c;
  }
  
  public void setSort(final boolean s) {
    this.sort = s;
  }
  
  public void setUsedActivationMatch(final String match) {
    this.nameOfActivationMatch = match;
  }
  
  public void setRootElement(final EClass root) {
    this.rootElement = root;
  }
  
  public void setPackage(final String setpackage) {
    this.rootPackage = setpackage;
  }
  
  public void addStateCodeElementList(final List<StateChartCoderGenerator.StateCodeElement> list) {
    this.stateCodeElements = list;
  }
  
  public String createCoder(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Collections;");
    _builder.newLine();
    _builder.append("import java.util.Comparator;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.notify.Notifier;");
    _builder.newLine();
    _builder.append("import org.eclipse.viatra.dse.api.DSEException;");
    _builder.newLine();
    _builder.append("import org.eclipse.viatra.dse.statecode.IStateCoder;");
    _builder.newLine();
    _builder.append("import org.eclipse.viatra.query.runtime.api.IPatternMatch;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import hu.bme.mit.onlab.scquery.ActiveStateMatch;");
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.rootPackage, "");
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    _builder.append(name, "\t");
    _builder.append(" implements IStateCoder {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(this.rootElement, "\t");
    _builder.append(" model;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ViatraQueryEngine engine;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void init(Notifier notifier) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("model = (");
    _builder.append(this.rootElement, "\t\t");
    _builder.append(") notifier;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("engine = getQueryEngine();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Object createStateCode() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("StringBuilder sb = new StringBuilder();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("StringBuilder temp = new StringBuilder();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("////");
    _builder.newLine();
    {
      for(final StateChartCoderGenerator.StateCodeElement element : this.stateCodeElements) {
        _builder.append("\t\t");
        _builder.append("ArrayList<String> ");
        CharSequence _stringArrayName = this.getStringArrayName(element);
        _builder.append(_stringArrayName, "\t\t");
        _builder.append(" = new ArrayList<String>();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _queryName = element.getQueryName();
        _builder.append(_queryName, "\t\t");
        _builder.append("Matcher ");
        String _queryName_1 = element.getQueryName();
        String _firstLower = StringExtensions.toFirstLower(_queryName_1);
        _builder.append(_firstLower, "\t\t");
        _builder.append("Matcher = ");
        String _queryName_2 = element.getQueryName();
        _builder.append(_queryName_2, "\t\t");
        _builder.append("Matcher.on(engine); ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("for(");
        String _className = element.getClassName();
        _builder.append(_className, "\t\t");
        _builder.append(" object : ");
        String _queryName_3 = element.getQueryName();
        String _firstLower_1 = StringExtensions.toFirstLower(_queryName_3);
        _builder.append(_firstLower_1, "\t\t");
        _builder.append("Matcher.getAllMatches()) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("temp = \"\";");
        _builder.newLine();
        {
          List<EAttribute> _attributes = element.getAttributes();
          for(final EAttribute attrib : _attributes) {
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("temp.append(object.get");
            String _name = attrib.getName();
            _builder.append(_name, "\t\t\t");
            _builder.append("());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("temp.append(\'-\');");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("temp.deleteCharAt(temp.length()-1);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        CharSequence _stringArrayName_1 = this.getStringArrayName(element);
        _builder.append(_stringArrayName_1, "\t\t\t");
        _builder.append(".add(temp);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        {
          if (this.sort) {
            _builder.append("\t\t");
            _builder.append("Collections.sort(");
            CharSequence _stringArrayName_2 = this.getStringArrayName(element);
            _builder.append(_stringArrayName_2, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      for(final StateChartCoderGenerator.StateCodeElement element_1 : this.stateCodeElements) {
        _builder.append("\t\t");
        _builder.append("for (String s : ");
        CharSequence _stringArrayName_3 = this.getStringArrayName(element_1);
        _builder.append(_stringArrayName_3, "\t\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("sb.append(s);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("sb.append(\'");
        _builder.append(this.separator, "\t\t\t");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("return sb.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Object createActivationCode(IPatternMatch match) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (match instanceof ");
    _builder.append(this.nameOfActivationMatch, "\t\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(this.nameOfActivationMatch, "\t\t\t");
    _builder.append(" asm = (");
    _builder.append(this.nameOfActivationMatch, "\t\t\t");
    _builder.append(") match;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return asm.getTransient().getName();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new DSEException (\"Unsupported rule.\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ViatraQueryEngine getQueryEngine () throws ViatraQueryException{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(model.eResource()));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return engine;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ArrayList<String> sort(ArrayList<String> array){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Collections.sort(array, new Comparator<String>() {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t    ");
    _builder.append("public int compare(String str1, String str2) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t        ");
    _builder.append("int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t        ");
    _builder.append("if (res == 0) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t            ");
    _builder.append("res = str1.compareTo(str2);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t        ");
    _builder.append("return res;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t    ");
    _builder.append("}});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private CharSequence getStringArrayName(final StateChartCoderGenerator.StateCodeElement element) {
    StringConcatenation _builder = new StringConcatenation();
    String _className = element.getClassName();
    _builder.append(_className, "");
    _builder.append("codes");
    return _builder;
  }
}
