/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import talleruno.Infraestructura;
import talleruno.Proveedor;
import talleruno.TallerunoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infraestructura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.InfraestructuraImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.impl.InfraestructuraImpl#getProveedor <em>Proveedor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfraestructuraImpl extends MinimalEObjectImpl.Container implements Infraestructura {
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
	 * The cached value of the '{@link #getProveedor() <em>Proveedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProveedor()
	 * @generated
	 * @ordered
	 */
	protected Proveedor proveedor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfraestructuraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.INFRAESTRUCTURA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.INFRAESTRUCTURA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proveedor getProveedor() {
		if (proveedor != null && proveedor.eIsProxy()) {
			InternalEObject oldProveedor = (InternalEObject)proveedor;
			proveedor = (Proveedor)eResolveProxy(oldProveedor);
			if (proveedor != oldProveedor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TallerunoPackage.INFRAESTRUCTURA__PROVEEDOR, oldProveedor, proveedor));
			}
		}
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proveedor basicGetProveedor() {
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProveedor(Proveedor newProveedor) {
		Proveedor oldProveedor = proveedor;
		proveedor = newProveedor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.INFRAESTRUCTURA__PROVEEDOR, oldProveedor, proveedor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TallerunoPackage.INFRAESTRUCTURA__NOMBRE:
				return getNombre();
			case TallerunoPackage.INFRAESTRUCTURA__PROVEEDOR:
				if (resolve) return getProveedor();
				return basicGetProveedor();
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
			case TallerunoPackage.INFRAESTRUCTURA__NOMBRE:
				setNombre((String)newValue);
				return;
			case TallerunoPackage.INFRAESTRUCTURA__PROVEEDOR:
				setProveedor((Proveedor)newValue);
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
			case TallerunoPackage.INFRAESTRUCTURA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case TallerunoPackage.INFRAESTRUCTURA__PROVEEDOR:
				setProveedor((Proveedor)null);
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
			case TallerunoPackage.INFRAESTRUCTURA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case TallerunoPackage.INFRAESTRUCTURA__PROVEEDOR:
				return proveedor != null;
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

} //InfraestructuraImpl
