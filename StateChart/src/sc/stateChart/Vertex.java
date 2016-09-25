/**
 */
package sc.stateChart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.Vertex#getNote <em>Note</em>}</li>
 *   <li>{@link sc.stateChart.Vertex#getName <em>Name</em>}</li>
 *   <li>{@link sc.stateChart.Vertex#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see sc.stateChart.StateChartPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see sc.stateChart.StateChartPackage#getVertex_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link sc.stateChart.Vertex#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

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
	 * @see sc.stateChart.StateChartPackage#getVertex_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sc.stateChart.Vertex#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see sc.stateChart.StateChartPackage#getVertex_IsActive()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link sc.stateChart.Vertex#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

} // Vertex
