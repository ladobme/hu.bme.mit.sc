/**
 */
package sc.stateChart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.Region#getName <em>Name</em>}</li>
 *   <li>{@link sc.stateChart.Region#getNote <em>Note</em>}</li>
 *   <li>{@link sc.stateChart.Region#getTransient <em>Transient</em>}</li>
 *   <li>{@link sc.stateChart.Region#getVertex <em>Vertex</em>}</li>
 * </ul>
 *
 * @see sc.stateChart.StateChartPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
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
	 * @see sc.stateChart.StateChartPackage#getRegion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sc.stateChart.Region#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see sc.stateChart.StateChartPackage#getRegion_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link sc.stateChart.Region#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' containment reference list.
	 * The list contents are of type {@link sc.stateChart.Transient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' containment reference list.
	 * @see sc.stateChart.StateChartPackage#getRegion_Transient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transient> getTransient();

	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' containment reference list.
	 * The list contents are of type {@link sc.stateChart.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' containment reference list.
	 * @see sc.stateChart.StateChartPackage#getRegion_Vertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getVertex();

} // Region
