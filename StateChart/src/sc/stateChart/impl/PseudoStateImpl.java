/**
 */
package sc.stateChart.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sc.stateChart.PseudoState;
import sc.stateChart.PseudoStateType;
import sc.stateChart.StateChartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.impl.PseudoStateImpl#getPseudoStateType <em>Pseudo State Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PseudoStateImpl extends VertexImpl implements PseudoState {
	/**
	 * The default value of the '{@link #getPseudoStateType() <em>Pseudo State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudoStateType()
	 * @generated
	 * @ordered
	 */
	protected static final PseudoStateType PSEUDO_STATE_TYPE_EDEFAULT = PseudoStateType.INITIAL;

	/**
	 * The cached value of the '{@link #getPseudoStateType() <em>Pseudo State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudoStateType()
	 * @generated
	 * @ordered
	 */
	protected PseudoStateType pseudoStateType = PSEUDO_STATE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudoStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartPackage.Literals.PSEUDO_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoStateType getPseudoStateType() {
		return pseudoStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudoStateType(PseudoStateType newPseudoStateType) {
		PseudoStateType oldPseudoStateType = pseudoStateType;
		pseudoStateType = newPseudoStateType == null ? PSEUDO_STATE_TYPE_EDEFAULT : newPseudoStateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartPackage.PSEUDO_STATE__PSEUDO_STATE_TYPE, oldPseudoStateType, pseudoStateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateChartPackage.PSEUDO_STATE__PSEUDO_STATE_TYPE:
				return getPseudoStateType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateChartPackage.PSEUDO_STATE__PSEUDO_STATE_TYPE:
				setPseudoStateType((PseudoStateType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StateChartPackage.PSEUDO_STATE__PSEUDO_STATE_TYPE:
				setPseudoStateType(PSEUDO_STATE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateChartPackage.PSEUDO_STATE__PSEUDO_STATE_TYPE:
				return pseudoStateType != PSEUDO_STATE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PseudoStateType: ");
		result.append(pseudoStateType);
		result.append(')');
		return result.toString();
	}

} //PseudoStateImpl
