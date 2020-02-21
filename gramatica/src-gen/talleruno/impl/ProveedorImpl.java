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
import talleruno.GramaticaPackage;
import talleruno.ParametroConexion;
import talleruno.Proveedor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proveedor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.ProveedorImpl#getParametroConexion <em>Parametro Conexion</em>}</li>
 *   <li>{@link talleruno.impl.ProveedorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.impl.ProveedorImpl#getAmbientesDespliegue <em>Ambientes Despliegue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProveedorImpl extends MinimalEObjectImpl.Container implements
		Proveedor {
	/**
	 * The cached value of the '{@link #getParametroConexion() <em>Parametro Conexion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametroConexion()
	 * @generated
	 * @ordered
	 */
	protected ParametroConexion parametroConexion;

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
		return GramaticaPackage.Literals.PROVEEDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametroConexion getParametroConexion() {
		return parametroConexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametroConexion(
			ParametroConexion newParametroConexion, NotificationChain msgs) {
		ParametroConexion oldParametroConexion = parametroConexion;
		parametroConexion = newParametroConexion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION,
					oldParametroConexion, newParametroConexion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametroConexion(ParametroConexion newParametroConexion) {
		if (newParametroConexion != parametroConexion) {
			NotificationChain msgs = null;
			if (parametroConexion != null)
				msgs = ((InternalEObject) parametroConexion)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION,
								null, msgs);
			if (newParametroConexion != null)
				msgs = ((InternalEObject) newParametroConexion)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION,
								null, msgs);
			msgs = basicSetParametroConexion(newParametroConexion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION,
					newParametroConexion, newParametroConexion));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.PROVEEDOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmbienteDespliegue> getAmbientesDespliegue() {
		if (ambientesDespliegue == null) {
			ambientesDespliegue = new EObjectContainmentEList<AmbienteDespliegue>(
					AmbienteDespliegue.class, this,
					GramaticaPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE);
		}
		return ambientesDespliegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION:
			return basicSetParametroConexion(null, msgs);
		case GramaticaPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
			return ((InternalEList<?>) getAmbientesDespliegue()).basicRemove(
					otherEnd, msgs);
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
		case GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION:
			return getParametroConexion();
		case GramaticaPackage.PROVEEDOR__NOMBRE:
			return getNombre();
		case GramaticaPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
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
		case GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION:
			setParametroConexion((ParametroConexion) newValue);
			return;
		case GramaticaPackage.PROVEEDOR__NOMBRE:
			setNombre((String) newValue);
			return;
		case GramaticaPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
			getAmbientesDespliegue().clear();
			getAmbientesDespliegue().addAll(
					(Collection<? extends AmbienteDespliegue>) newValue);
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
		case GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION:
			setParametroConexion((ParametroConexion) null);
			return;
		case GramaticaPackage.PROVEEDOR__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case GramaticaPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
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
		case GramaticaPackage.PROVEEDOR__PARAMETRO_CONEXION:
			return parametroConexion != null;
		case GramaticaPackage.PROVEEDOR__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case GramaticaPackage.PROVEEDOR__AMBIENTES_DESPLIEGUE:
			return ambientesDespliegue != null
					&& !ambientesDespliegue.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ProveedorImpl
