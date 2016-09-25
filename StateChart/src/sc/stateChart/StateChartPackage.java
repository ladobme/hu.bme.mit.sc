/**
 */
package sc.stateChart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sc.stateChart.StateChartFactory
 * @model kind="package"
 * @generated
 */
public interface StateChartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateChart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/stateChart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stateChart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateChartPackage eINSTANCE = sc.stateChart.impl.StateChartPackageImpl.init();

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.VertexImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NOTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__IS_ACTIVE = 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.PseudoStateImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getPseudoState()
	 * @generated
	 */
	int PSEUDO_STATE = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__NOTE = VERTEX__NOTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__IS_ACTIVE = VERTEX__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Pseudo State Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__PSEUDO_STATE_TYPE = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.StateImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NOTE = VERTEX__NOTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_ACTIVE = VERTEX__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTION = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.SimpleStateImpl <em>Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.SimpleStateImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getSimpleState()
	 * @generated
	 */
	int SIMPLE_STATE = 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__NOTE = STATE__NOTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__IS_ACTIVE = STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE__ACTION = STATE__ACTION;

	/**
	 * The number of structural features of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.FinalStateImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NOTE = STATE__NOTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_ACTIVE = STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ACTION = STATE__ACTION;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.RegionImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NOTE = 1;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSIENT = 2;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__VERTEX = 3;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.TransientImpl <em>Transient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.TransientImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getTransient()
	 * @generated
	 */
	int TRANSIENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__GUARD = 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__PRIORITY = 6;

	/**
	 * The number of structural features of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.StateMachineImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 7;

	/**
	 * The feature id for the '<em><b>Main Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__MAIN_REGION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.impl.CompositeStateImpl
	 * @see sc.stateChart.impl.StateChartPackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 8;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__NOTE = STATE__NOTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__IS_ACTIVE = STATE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ACTION = STATE__ACTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ELEMENT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sc.stateChart.PseudoStateType <em>Pseudo State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sc.stateChart.PseudoStateType
	 * @see sc.stateChart.impl.StateChartPackageImpl#getPseudoStateType()
	 * @generated
	 */
	int PSEUDO_STATE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link sc.stateChart.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see sc.stateChart.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Vertex#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see sc.stateChart.Vertex#getNote()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Note();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Vertex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sc.stateChart.Vertex#getName()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Name();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Vertex#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see sc.stateChart.Vertex#isIsActive()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_IsActive();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.PseudoState <em>Pseudo State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo State</em>'.
	 * @see sc.stateChart.PseudoState
	 * @generated
	 */
	EClass getPseudoState();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.PseudoState#getPseudoStateType <em>Pseudo State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo State Type</em>'.
	 * @see sc.stateChart.PseudoState#getPseudoStateType()
	 * @see #getPseudoState()
	 * @generated
	 */
	EAttribute getPseudoState_PseudoStateType();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see sc.stateChart.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry</em>'.
	 * @see sc.stateChart.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Entry();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit</em>'.
	 * @see sc.stateChart.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Exit();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.State#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see sc.stateChart.State#getAction()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Action();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.SimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State</em>'.
	 * @see sc.stateChart.SimpleState
	 * @generated
	 */
	EClass getSimpleState();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see sc.stateChart.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see sc.stateChart.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sc.stateChart.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Region#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see sc.stateChart.Region#getNote()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link sc.stateChart.Region#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient</em>'.
	 * @see sc.stateChart.Region#getTransient()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transient();

	/**
	 * Returns the meta object for the containment reference list '{@link sc.stateChart.Region#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertex</em>'.
	 * @see sc.stateChart.Region#getVertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Vertex();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.Transient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient</em>'.
	 * @see sc.stateChart.Transient
	 * @generated
	 */
	EClass getTransient();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Transient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sc.stateChart.Transient#getName()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Name();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Transient#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see sc.stateChart.Transient#getTrigger()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Transient#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see sc.stateChart.Transient#getGuard()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Guard();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Transient#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see sc.stateChart.Transient#getEffect()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Effect();

	/**
	 * Returns the meta object for the reference '{@link sc.stateChart.Transient#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sc.stateChart.Transient#getSource()
	 * @see #getTransient()
	 * @generated
	 */
	EReference getTransient_Source();

	/**
	 * Returns the meta object for the reference '{@link sc.stateChart.Transient#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sc.stateChart.Transient#getTarget()
	 * @see #getTransient()
	 * @generated
	 */
	EReference getTransient_Target();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.Transient#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see sc.stateChart.Transient#getPriority()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Priority();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see sc.stateChart.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference '{@link sc.stateChart.StateMachine#getMainRegion <em>Main Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Region</em>'.
	 * @see sc.stateChart.StateMachine#getMainRegion()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_MainRegion();

	/**
	 * Returns the meta object for the attribute '{@link sc.stateChart.StateMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sc.stateChart.StateMachine#getName()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_Name();

	/**
	 * Returns the meta object for class '{@link sc.stateChart.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see sc.stateChart.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for the containment reference list '{@link sc.stateChart.CompositeState#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see sc.stateChart.CompositeState#getElement()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_Element();

	/**
	 * Returns the meta object for enum '{@link sc.stateChart.PseudoStateType <em>Pseudo State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pseudo State Type</em>'.
	 * @see sc.stateChart.PseudoStateType
	 * @generated
	 */
	EEnum getPseudoStateType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateChartFactory getStateChartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.VertexImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__NOTE = eINSTANCE.getVertex_Note();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__NAME = eINSTANCE.getVertex_Name();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__IS_ACTIVE = eINSTANCE.getVertex_IsActive();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.PseudoStateImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getPseudoState()
		 * @generated
		 */
		EClass PSEUDO_STATE = eINSTANCE.getPseudoState();

		/**
		 * The meta object literal for the '<em><b>Pseudo State Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDO_STATE__PSEUDO_STATE_TYPE = eINSTANCE.getPseudoState_PseudoStateType();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.StateImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ACTION = eINSTANCE.getState_Action();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.SimpleStateImpl <em>Simple State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.SimpleStateImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getSimpleState()
		 * @generated
		 */
		EClass SIMPLE_STATE = eINSTANCE.getSimpleState();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.FinalStateImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.RegionImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NOTE = eINSTANCE.getRegion_Note();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSIENT = eINSTANCE.getRegion_Transient();

		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__VERTEX = eINSTANCE.getRegion_Vertex();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.TransientImpl <em>Transient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.TransientImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getTransient()
		 * @generated
		 */
		EClass TRANSIENT = eINSTANCE.getTransient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIENT__NAME = eINSTANCE.getTransient_Name();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIENT__TRIGGER = eINSTANCE.getTransient_Trigger();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIENT__GUARD = eINSTANCE.getTransient_Guard();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIENT__EFFECT = eINSTANCE.getTransient_Effect();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT__SOURCE = eINSTANCE.getTransient_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT__TARGET = eINSTANCE.getTransient_Target();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIENT__PRIORITY = eINSTANCE.getTransient_Priority();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.StateMachineImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Main Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__MAIN_REGION = eINSTANCE.getStateMachine_MainRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

		/**
		 * The meta object literal for the '{@link sc.stateChart.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.impl.CompositeStateImpl
		 * @see sc.stateChart.impl.StateChartPackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__ELEMENT = eINSTANCE.getCompositeState_Element();

		/**
		 * The meta object literal for the '{@link sc.stateChart.PseudoStateType <em>Pseudo State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sc.stateChart.PseudoStateType
		 * @see sc.stateChart.impl.StateChartPackageImpl#getPseudoStateType()
		 * @generated
		 */
		EEnum PSEUDO_STATE_TYPE = eINSTANCE.getPseudoStateType();

	}

} //StateChartPackage
