/**
 */
package talleruno.impl;

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

import talleruno.AmbienteDespliegue;
import talleruno.Par�metroConexi�n;
import talleruno.Proveedor;
import talleruno.TallerunoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proveedor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.ProveedorImpl#getPar�metroConexi�n <em>Par�metro Conexi�n</em>}</li>
 *   <li>{@link talleruno.impl.ProveedorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.impl.ProveedorImpl#getAmbientesDespliegue <em>Ambientes Despliegue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProveedorImpl extends MinimalEObjectImpl.Container implements Proveedor {
	/**
	 * The cached value of the '{@link #getPar�metroConexi�n() <em>Par�metro Conexi�n</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar�metroConexi�n()
	 * @generated
	 * @ordered
	 */
	protected Par�metroConexi�n par�metroConexi�n;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAmbientesDespliegue() <em>Ambientes Despliegue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientesDespliegue()
	 * @generated
	 * @ordered
	 */
	protected EList<AmbienteDespliegue> ambientesDespliegue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProveedorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.PROVEEDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Par�metroConexi�n getPar�metroConexi�n() {
		return par�metroConexi�n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPar�metroConexi�n(Par�metroConexi�n newPar�metroConexi�n, NotificationChain msgs) {
		Par�metroConexi�n oldPar�metroConexi�n = par�metroConexi�n;
		par�metroConexi�n = newPar�metroConexi�n;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N, oldPar�metroConexi�n, newPar�metroConexi�n);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPar�metroConexi�n(Par�metroConexi�n newPar�metroConexi�n) {
		if (newPar�metroConexi�n != par�metroConexi�n) {
			NotificationChain msgs = null;
			if (par�metroConexi�n != null)
				msgs = ((InternalEObject)par�metroConexi�n).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N, null, msgs);
			if (newPar�metroConexi�n != null)
				msgs = ((InternalEObject)newPar�metroConexi�n).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N, null, msgs);
			msgs = basicSetPar�metroConexi�n(newPar�metroConexi�n, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N, newPar�metroConexi�n, newPar�metroConexi�n));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.PROVEEDOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmbienteDespliegue> getAmbientesDespliegue() {
		if (ambientesDespliegue == null) {
			ambientesDespliegue = new EObjectContainmentEList<AmbienteDespliegue>(AmbienteDespliegue.class, this, TallerunoPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE);
		}
		return ambientesDespliegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N:
				return basicSetPar�metroConexi�n(null, msgs);
			case TallerunoPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
				return ((InternalEList<?>)getAmbientesDespliegue()).basicRemove(otherEnd, msgs);
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
			case TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N:
				return getPar�metroConexi�n();
			case TallerunoPackage.PROVEEDOR__NOMBRE:
				return getNombre();
			case TallerunoPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
				return getAmbientesDespliegue();
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
			case TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N:
				setPar�metroConexi�n((Par�metroConexi�n)newValue);
				return;
			case TallerunoPackage.PROVEEDOR__NOMBRE:
				setNombre((String)newValue);
				return;
			case TallerunoPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
				getAmbientesDespliegue().clear();
				getAmbientesDespliegue().addAll((Collection<? extends AmbienteDespliegue>)newValue);
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
			case TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N:
				setPar�metroConexi�n((Par�metroConexi�n)null);
				return;
			case TallerunoPackage.PROVEEDOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case TallerunoPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
				getAmbientesDespliegue().clear();
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
			case TallerunoPackage.PROVEEDOR__PAR�METRO_CONEXI�N:
				return par�metroConexi�n != null;
			case TallerunoPackage.PROVEEDOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case TallerunoPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
				return ambientesDespliegue != null && !ambientesDespliegue.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ProveedorImpl
