/**
 */
package sc.stateChart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.StateMachine#getMainRegion <em>Main Region</em>}</li>
 *   <li>{@link sc.stateChart.StateMachine#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sc.stateChart.StateChartPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Region</em>' containment reference.
	 * @see #setMainRegion(Region)
	 * @see sc.stateChart.StateChartPackage#getStateMachine_MainRegion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Region getMainRegion();

	/**
	 * Sets the value of the '{@link sc.stateChart.StateMachine#getMainRegion <em>Main Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Region</em>' containment reference.
	 * @see #getMainRegion()
	 * @generated
	 */
	void setMainRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sc.stateChart.StateChartPackage#getStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sc.stateChart.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StateMachine
