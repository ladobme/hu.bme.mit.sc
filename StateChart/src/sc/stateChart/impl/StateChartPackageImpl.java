/**
 */
package sc.stateChart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sc.stateChart.CompositeState;
import sc.stateChart.FinalState;
import sc.stateChart.PseudoState;
import sc.stateChart.PseudoStateType;
import sc.stateChart.Region;
import sc.stateChart.SimpleState;
import sc.stateChart.State;
import sc.stateChart.StateChartFactory;
import sc.stateChart.StateChartPackage;
import sc.stateChart.StateMachine;
import sc.stateChart.Transient;
import sc.stateChart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateChartPackageImpl extends EPackageImpl implements StateChartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pseudoStateTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sc.stateChart.StateChartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateChartPackageImpl() {
		super(eNS_URI, StateChartFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StateChartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateChartPackage init() {
		if (isInited) return (StateChartPackage)EPackage.Registry.INSTANCE.getEPackage(StateChartPackage.eNS_URI);

		// Obtain or create and register package
		StateChartPackageImpl theStateChartPackage = (StateChartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateChartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateChartPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStateChartPackage.createPackageContents();

		// Initialize created meta-data
		theStateChartPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStateChartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateChartPackage.eNS_URI, theStateChartPackage);
		return theStateChartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Note() {
		return (EAttribute)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Name() {
		return (EAttribute)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_IsActive() {
		return (EAttribute)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudoState() {
		return pseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudoState_PseudoStateType() {
		return (EAttribute)pseudoStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Entry() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Exit() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Action() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleState() {
		return simpleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Name() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Note() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transient() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Vertex() {
		return (EReference)regionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransient() {
		return transientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransient_Name() {
		return (EAttribute)transientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransient_Trigger() {
		return (EAttribute)transientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransient_Guard() {
		return (EAttribute)transientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransient_Effect() {
		return (EAttribute)transientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransient_Source() {
		return (EReference)transientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransient_Target() {
		return (EReference)transientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransient_Priority() {
		return (EAttribute)transientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_MainRegion() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateMachine_Name() {
		return (EAttribute)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeState() {
		return compositeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeState_Element() {
		return (EReference)compositeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPseudoStateType() {
		return pseudoStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateChartFactory getStateChartFactory() {
		return (StateChartFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vertexEClass = createEClass(VERTEX);
		createEAttribute(vertexEClass, VERTEX__NOTE);
		createEAttribute(vertexEClass, VERTEX__NAME);
		createEAttribute(vertexEClass, VERTEX__IS_ACTIVE);

		pseudoStateEClass = createEClass(PSEUDO_STATE);
		createEAttribute(pseudoStateEClass, PSEUDO_STATE__PSEUDO_STATE_TYPE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__ENTRY);
		createEAttribute(stateEClass, STATE__EXIT);
		createEAttribute(stateEClass, STATE__ACTION);

		simpleStateEClass = createEClass(SIMPLE_STATE);

		finalStateEClass = createEClass(FINAL_STATE);

		regionEClass = createEClass(REGION);
		createEAttribute(regionEClass, REGION__NAME);
		createEAttribute(regionEClass, REGION__NOTE);
		createEReference(regionEClass, REGION__TRANSIENT);
		createEReference(regionEClass, REGION__VERTEX);

		transientEClass = createEClass(TRANSIENT);
		createEAttribute(transientEClass, TRANSIENT__NAME);
		createEAttribute(transientEClass, TRANSIENT__TRIGGER);
		createEAttribute(transientEClass, TRANSIENT__GUARD);
		createEAttribute(transientEClass, TRANSIENT__EFFECT);
		createEReference(transientEClass, TRANSIENT__SOURCE);
		createEReference(transientEClass, TRANSIENT__TARGET);
		createEAttribute(transientEClass, TRANSIENT__PRIORITY);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__MAIN_REGION);
		createEAttribute(stateMachineEClass, STATE_MACHINE__NAME);

		compositeStateEClass = createEClass(COMPOSITE_STATE);
		createEReference(compositeStateEClass, COMPOSITE_STATE__ELEMENT);

		// Create enums
		pseudoStateTypeEEnum = createEEnum(PSEUDO_STATE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pseudoStateEClass.getESuperTypes().add(this.getVertex());
		stateEClass.getESuperTypes().add(this.getVertex());
		simpleStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());
		compositeStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertex_Note(), ecorePackage.getEString(), "note", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertex_Name(), ecorePackage.getEString(), "name", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertex_IsActive(), ecorePackage.getEBoolean(), "isActive", "false", 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pseudoStateEClass, PseudoState.class, "PseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPseudoState_PseudoStateType(), this.getPseudoStateType(), "PseudoStateType", null, 0, 1, PseudoState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Entry(), ecorePackage.getEString(), "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Exit(), ecorePackage.getEString(), "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Action(), ecorePackage.getEString(), "action", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleStateEClass, SimpleState.class, "SimpleState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegion_Note(), ecorePackage.getEString(), "note", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Transient(), this.getTransient(), null, "transient", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Vertex(), this.getVertex(), null, "vertex", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transientEClass, Transient.class, "Transient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransient_Trigger(), ecorePackage.getEString(), "trigger", null, 0, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransient_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransient_Effect(), ecorePackage.getEString(), "effect", null, 0, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransient_Source(), this.getVertex(), null, "source", null, 1, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransient_Target(), this.getVertex(), null, "target", null, 1, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransient_Priority(), ecorePackage.getEInt(), "priority", "0", 0, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_MainRegion(), this.getRegion(), null, "mainRegion", null, 1, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeStateEClass, CompositeState.class, "CompositeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeState_Element(), this.getRegion(), null, "element", null, 0, -1, CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pseudoStateTypeEEnum, PseudoStateType.class, "PseudoStateType");
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.INITIAL);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.TERMINATE);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.ENTRY_POINT);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.EXIT_POINT);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.CHOICE);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.JOIN);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.FORK);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.JUNCTION);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.SHADOW_HISTORY);
		addEEnumLiteral(pseudoStateTypeEEnum, PseudoStateType.DEEP_HISTORY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (pseudoStateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PseudoStateType"
		   });
	}

} //StateChartPackageImpl
