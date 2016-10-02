package hu.bme.mit.onlab.scdse

class StateChartCoderGenerator {
	char separator=';';
	boolean sort=true;
	boolean listAllState=false;
	
	def public void listAllState(boolean listAll){
		listAllState=listAll;
	}
	
	def public void setSeparator(char c){
		separator=c;
	}
	
	def public void setSort(boolean s){
		sort=s;
	}
	
	def public String createCoder(String name){
		'''
			public class �name� implements IStateCoder {
			
			private StateMachine model;
			private ArrayList <State> states;
			private ArrayList <Transient> transients;

			@Override
			public void init(Notifier notifier) {
				model = (StateMachine) notifier;
				
				states = new ArrayList<State>();		
				for (Vertex state : model.getMainRegion().getVertex()){
					states.add((State)state);
				}
				�IF sort�Collections.sort(sortedStates, new Comparator<State>(){

					@Override
					public int compare(State s1, State s2) {
						return s1.getName().compareTo(s2.getName());
						}
				});�ENDIF�
				transients = new ArrayList<Transient>();
				for (Transient tr : model.getMainRegion().getTransient()){
					transients.add(tr);
				}
				�IF sort�Collections.sort(sortedTransients, new Comparator<Transient>(){
					@Override
					public int compare(Transient t1, Transient t2) {
						return t1.getName().compareTo(t2.getName());
					}
				});�ENDIF�
			}
		
			@Override
			public Object createStateCode() {
				StringBuilder sb = new StringBuilder();
				sb.append("Active states: ");
				for (State state : states){
					if (state.isIsActive()){
						sb.append(state.getName());
						sb.append(�separator�);
					}
				}
				�IF listAllState�
				sb.append("Inactive states: ");
				for (State state : states){
					if (!state.isIsActive()){
						sb.append(state.getName());
						sb.append(�separator�);
					}
				}
				�ENDIF�
				return sb.toString();
			}
		
			@Override
			public Object createActivationCode(IPatternMatch match) {
				if (match instanceof ActiveStateMatch){
					ActiveStateMatch asm = (ActiveStateMatch) match;
					return asm.getTransient().getName();
				} else
					throw new DSEException ("Unsupported rule.");
			}
		}
		'''
	}
}