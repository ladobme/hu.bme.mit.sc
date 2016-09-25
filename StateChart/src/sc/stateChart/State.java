/**
 */
package sc.stateChart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link sc.stateChart.State#getExit <em>Exit</em>}</li>
 *   <li>{@link sc.stateChart.State#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see sc.stateChart.StateChartPackage#getState()
 * @model abstract="true"
 * @generated
 */
public interface State extends Vertex {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' attribute.
	 * @see #setEntry(String)
	 * @see sc.stateChart.StateChartPackage#getState_Entry()
	 * @model
	 * @generated
	 */
	String getEntry();

	/**
	 * Sets the value of the '{@link sc.stateChart.State#getEntry <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' attribute.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(String value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' attribute.
	 * @see #setExit(String)
	 * @see sc.stateChart.StateChartPackage#getState_Exit()
	 * @model
	 * @generated
	 */
	String getExit();

	/**
	 * Sets the value of the '{@link sc.stateChart.State#getExit <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' attribute.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see sc.stateChart.StateChartPackage#getState_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link sc.stateChart.State#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

} // State
