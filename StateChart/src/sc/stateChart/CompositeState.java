/**
 */
package sc.stateChart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.CompositeState#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see sc.stateChart.StateChartPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link sc.stateChart.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see sc.stateChart.StateChartPackage#getCompositeState_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getElement();

} // CompositeState
