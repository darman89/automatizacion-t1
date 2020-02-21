/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import talleruno.GramaticaPackage;
import talleruno.Infraestructura;
import talleruno.Proveedor;

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
public class InfraestructuraImpl extends MinimalEObjectImpl.Container implements
		Infraestructura {
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
	 * The cached value of the '{@link #getProveedor() <em>Proveedor</em>}' containment reference.
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
		return GramaticaPackage.Literals.INFRAESTRUCTURA;
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
					GramaticaPackage.INFRAESTRUCTURA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProveedor(Proveedor newProveedor,
			NotificationChain msgs) {
		Proveedor oldProveedor = proveedor;
		proveedor = newProveedor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR, oldProveedor,
					newProveedor);
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
	public void setProveedor(Proveedor newProveedor) {
		if (newProveedor != proveedor) {
			NotificationChain msgs = null;
			if (proveedor != null)
				msgs = ((InternalEObject) proveedor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR,
						null, msgs);
			if (newProveedor != null)
				msgs = ((InternalEObject) newProveedor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR,
						null, msgs);
			msgs = basicSetProveedor(newProveedor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR, newProveedor,
					newProveedor));
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
		case GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR:
			return basicSetProveedor(null, msgs);
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
		case GramaticaPackage.INFRAESTRUCTURA__NOMBRE:
			return getNombre();
		case GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR:
			return getProveedor();
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
		case GramaticaPackage.INFRAESTRUCTURA__NOMBRE:
			setNombre((String) newValue);
			return;
		case GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR:
			setProveedor((Proveedor) newValue);
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
		case GramaticaPackage.INFRAESTRUCTURA__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR:
			setProveedor((Proveedor) null);
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
		case GramaticaPackage.INFRAESTRUCTURA__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case GramaticaPackage.INFRAESTRUCTURA__PROVEEDOR:
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //InfraestructuraImpl
