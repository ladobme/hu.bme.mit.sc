package hu.bme.mit.onlab.scdse;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class QueryGenerator {
  public String createQuery(final String uri, final EClass eClass) {
    String _xblockexpression = null;
    {
      final String name = eClass.getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package hu.bme.mit.onlab.scquery");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import \"http://www.eclipse.org/emf/2002/Ecore\";");
      _builder.newLine();
      _builder.append("import \"");
      _builder.append(uri, "");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("pattern ");
      _builder.append(name, "");
      _builder.append("(");
      String _firstLower = StringExtensions.toFirstLower(name);
      _builder.append(_firstLower, "");
      _builder.append(":");
      _builder.append(name, "");
      _builder.append(")= {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append(name, "\t");
      _builder.append("(");
      String _firstLower_1 = StringExtensions.toFirstLower(name);
      _builder.append(_firstLower_1, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
