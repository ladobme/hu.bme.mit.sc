/**
 */
package sc.stateChart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pseudo State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sc.stateChart.StateChartPackage#getPseudoStateType()
 * @model extendedMetaData="name='PseudoStateType'"
 * @generated
 */
public enum PseudoStateType implements Enumerator {
	/**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL(0, "Initial", "Initial"),

	/**
	 * The '<em><b>Terminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATE_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINATE(1, "Terminate", "Terminate"),

	/**
	 * The '<em><b>Entry Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRY_POINT(2, "EntryPoint", "EntryPoint"),

	/**
	 * The '<em><b>Exit Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT_POINT(3, "ExitPoint", "ExitPoint"),

	/**
	 * The '<em><b>Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	CHOICE(4, "Choice", "Choice"),

	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN(5, "Join", "Join"),

	/**
	 * The '<em><b>Fork</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK_VALUE
	 * @generated
	 * @ordered
	 */
	FORK(6, "Fork", "Fork"),

	/**
	 * The '<em><b>Junction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	JUNCTION(7, "Junction", "Junction"),

	/**
	 * The '<em><b>Shadow History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADOW_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	SHADOW_HISTORY(8, "ShadowHistory", "ShadowHistory"),

	/**
	 * The '<em><b>Deep History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEEP_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	DEEP_HISTORY(9, "DeepHistory", "DeepHistory");

	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @model name="Initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_VALUE = 0;

	/**
	 * The '<em><b>Terminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terminate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINATE
	 * @model name="Terminate"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATE_VALUE = 1;

	/**
	 * The '<em><b>Entry Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entry Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT
	 * @model name="EntryPoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_POINT_VALUE = 2;

	/**
	 * The '<em><b>Exit Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exit Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXIT_POINT
	 * @model name="ExitPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_POINT_VALUE = 3;

	/**
	 * The '<em><b>Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Choice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHOICE
	 * @model name="Choice"
	 * @generated
	 * @ordered
	 */
	public static final int CHOICE_VALUE = 4;

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @model name="Join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_VALUE = 5;

	/**
	 * The '<em><b>Fork</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fork</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORK
	 * @model name="Fork"
	 * @generated
	 * @ordered
	 */
	public static final int FORK_VALUE = 6;

	/**
	 * The '<em><b>Junction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Junction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUNCTION
	 * @model name="Junction"
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION_VALUE = 7;

	/**
	 * The '<em><b>Shadow History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shadow History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADOW_HISTORY
	 * @model name="ShadowHistory"
	 * @generated
	 * @ordered
	 */
	public static final int SHADOW_HISTORY_VALUE = 8;

	/**
	 * The '<em><b>Deep History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deep History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEEP_HISTORY
	 * @model name="DeepHistory"
	 * @generated
	 * @ordered
	 */
	public static final int DEEP_HISTORY_VALUE = 9;

	/**
	 * An array of all the '<em><b>Pseudo State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PseudoStateType[] VALUES_ARRAY =
		new PseudoStateType[] {
			INITIAL,
			TERMINATE,
			ENTRY_POINT,
			EXIT_POINT,
			CHOICE,
			JOIN,
			FORK,
			JUNCTION,
			SHADOW_HISTORY,
			DEEP_HISTORY,
		};

	/**
	 * A public read-only list of all the '<em><b>Pseudo State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PseudoStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pseudo State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PseudoStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PseudoStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pseudo State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PseudoStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PseudoStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pseudo State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PseudoStateType get(int value) {
		switch (value) {
			case INITIAL_VALUE: return INITIAL;
			case TERMINATE_VALUE: return TERMINATE;
			case ENTRY_POINT_VALUE: return ENTRY_POINT;
			case EXIT_POINT_VALUE: return EXIT_POINT;
			case CHOICE_VALUE: return CHOICE;
			case JOIN_VALUE: return JOIN;
			case FORK_VALUE: return FORK;
			case JUNCTION_VALUE: return JUNCTION;
			case SHADOW_HISTORY_VALUE: return SHADOW_HISTORY;
			case DEEP_HISTORY_VALUE: return DEEP_HISTORY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PseudoStateType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PseudoStateType
