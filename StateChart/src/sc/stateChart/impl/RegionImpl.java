/**
 */
package sc.stateChart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sc.stateChart.Region;
import sc.stateChart.StateChartPackage;
import sc.stateChart.Transient;
import sc.stateChart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.stateChart.impl.RegionImpl#getName <em>Name</em>}</li>
 *   <li>{@link sc.stateChart.impl.RegionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link sc.stateChart.impl.RegionImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link sc.stateChart.impl.RegionImpl#getVertex <em>Vertex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected EList<Transient> transient_;

	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartPackage.Literals.REGION;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartPackage.REGION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartPackage.REGION__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transient> getTransient() {
		if (transient_ == null) {
			transient_ = new EObjectContainmentEList<Transient>(Transient.class, this, StateChartPackage.REGION__TRANSIENT);
		}
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertex() {
		if (vertex == null) {
			vertex = new EObjectContainmentEList<Vertex>(Vertex.class, this, StateChartPackage.REGION__VERTEX);
		}
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateChartPackage.REGION__TRANSIENT:
				return ((InternalEList<?>)getTransient()).basicRemove(otherEnd, msgs);
			case StateChartPackage.REGION__VERTEX:
				return ((InternalEList<?>)getVertex()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateChartPackage.REGION__NAME:
				return getName();
			case StateChartPackage.REGION__NOTE:
				return getNote();
			case StateChartPackage.REGION__TRANSIENT:
				return getTransient();
			case StateChartPackage.REGION__VERTEX:
				return getVertex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateChartPackage.REGION__NAME:
				setName((String)newValue);
				return;
			case StateChartPackage.REGION__NOTE:
				setNote((String)newValue);
				return;
			case StateChartPackage.REGION__TRANSIENT:
				getTransient().clear();
				getTransient().addAll((Collection<? extends Transient>)newValue);
				return;
			case StateChartPackage.REGION__VERTEX:
				getVertex().clear();
				getVertex().addAll((Collection<? extends Vertex>)newValue);
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
			case StateChartPackage.REGION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StateChartPackage.REGION__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case StateChartPackage.REGION__TRANSIENT:
				getTransient().clear();
				return;
			case StateChartPackage.REGION__VERTEX:
				getVertex().clear();
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
			case StateChartPackage.REGION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StateChartPackage.REGION__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case StateChartPackage.REGION__TRANSIENT:
				return transient_ != null && !transient_.isEmpty();
			case StateChartPackage.REGION__VERTEX:
				return vertex != null && !vertex.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", note: ");
		result.append(note);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
