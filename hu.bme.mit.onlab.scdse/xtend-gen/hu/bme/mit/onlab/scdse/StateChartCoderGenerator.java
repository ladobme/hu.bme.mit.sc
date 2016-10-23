package hu.bme.mit.onlab.scdse;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class StateChartCoderGenerator {
  private char separator = ';';
  
  private boolean sort = true;
  
  private boolean listAllState = false;
  
  private String nameOfActivationMatch;
  
  public void listAllState(final boolean listAll) {
    this.listAllState = listAll;
  }
  
  public void setSeparator(final char c) {
    this.separator = c;
  }
  
  public void setSort(final boolean s) {
    this.sort = s;
  }
  
  public void setUsedActivationMatch(final String match) {
    this.nameOfActivationMatch = match;
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
    _builder.append("import sc.stateChart.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    _builder.append(name, "\t");
    _builder.append(" implements IStateCoder {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private StateMachine model;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ArrayList <State> states;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ArrayList <Transient> transients;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void init(Notifier notifier) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("model = (StateMachine) notifier;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("states = new ArrayList<State>();\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (Vertex state : model.getMainRegion().getVertex()){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("states.add((State)state);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    {
      if (this.sort) {
        _builder.append("Collections.sort(states, new Comparator<State>(){");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("public int compare(State s1, State s2) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return s1.getName().compareTo(s2.getName());");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("});");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("transients = new ArrayList<Transient>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (Transient tr : model.getMainRegion().getTransient()){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("transients.add(tr);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    {
      if (this.sort) {
        _builder.append("Collections.sort(transients, new Comparator<Transient>(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("public int compare(Transient t1, Transient t2) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return t1.getName().compareTo(t2.getName());");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("});");
      }
    }
    _builder.newLineIfNotEmpty();
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
    _builder.append("sb.append(\"Active states: \");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (State state : states){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (state.isIsActive()){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("sb.append(state.getName());");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("sb.append(\'");
    _builder.append(this.separator, "\t\t\t\t");
    _builder.append("\');");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    {
      if (this.listAllState) {
        _builder.append("\t\t");
        _builder.append("sb.append(\"Inactive states: \");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("for (State state : states){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("if (!state.isIsActive()){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("sb.append(state.getName());");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("sb.append(\'");
        _builder.append(this.separator, "\t\t\t\t");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
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
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
