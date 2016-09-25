/**
 */
package sc.stateChart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.PseudoState#getPseudoStateType <em>Pseudo State Type</em>}</li>
 * </ul>
 *
 * @see sc.stateChart.StateChartPackage#getPseudoState()
 * @model
 * @generated
 */
public interface PseudoState extends Vertex {
	/**
	 * Returns the value of the '<em><b>Pseudo State Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sc.stateChart.PseudoStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudo State Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo State Type</em>' attribute.
	 * @see sc.stateChart.PseudoStateType
	 * @see #setPseudoStateType(PseudoStateType)
	 * @see sc.stateChart.StateChartPackage#getPseudoState_PseudoStateType()
	 * @model
	 * @generated
	 */
	PseudoStateType getPseudoStateType();

	/**
	 * Sets the value of the '{@link sc.stateChart.PseudoState#getPseudoStateType <em>Pseudo State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo State Type</em>' attribute.
	 * @see sc.stateChart.PseudoStateType
	 * @see #getPseudoStateType()
	 * @generated
	 */
	void setPseudoStateType(PseudoStateType value);

} // PseudoState
