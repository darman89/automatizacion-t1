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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import talleruno.Conexión;
import talleruno.Recurso;
import talleruno.TallerunoPackage;
import talleruno.TamañoServidor;
import talleruno.VPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.RecursoImpl#getConexiones <em>Conexiones</em>}</li>
 *   <li>{@link talleruno.impl.RecursoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.impl.RecursoImpl#getTamaño <em>Tamaño</em>}</li>
 *   <li>{@link talleruno.impl.RecursoImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RecursoImpl extends MinimalEObjectImpl.Container implements Recurso {
	/**
	 * The cached value of the '{@link #getConexiones() <em>Conexiones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexiones()
	 * @generated
	 * @ordered
	 */
	protected EList<Conexión> conexiones;

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
	 * The default value of the '{@link #getTamaño() <em>Tamaño</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamaño()
	 * @generated
	 * @ordered
	 */
	protected static final TamañoServidor TAMAÑO_EDEFAULT = TamañoServidor.MICRO;

	/**
	 * The cached value of the '{@link #getTamaño() <em>Tamaño</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamaño()
	 * @generated
	 * @ordered
	 */
	protected TamañoServidor tamaño = TAMAÑO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected VPC vpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecursoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.RECURSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conexión> getConexiones() {
		if (conexiones == null) {
			conexiones = new EObjectWithInverseResolvingEList.ManyInverse<Conexión>(Conexión.class, this, TallerunoPackage.RECURSO__CONEXIONES, TallerunoPackage.CONEXIÓN__RECURSOS);
		}
		return conexiones;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.RECURSO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamañoServidor getTamaño() {
		return tamaño;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamaño(TamañoServidor newTamaño) {
		TamañoServidor oldTamaño = tamaño;
		tamaño = newTamaño == null ? TAMAÑO_EDEFAULT : newTamaño;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.RECURSO__TAMAÑO, oldTamaño, tamaño));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC getVpc() {
		if (vpc != null && vpc.eIsProxy()) {
			InternalEObject oldVpc = (InternalEObject)vpc;
			vpc = (VPC)eResolveProxy(oldVpc);
			if (vpc != oldVpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TallerunoPackage.RECURSO__VPC, oldVpc, vpc));
			}
		}
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC basicGetVpc() {
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVpc(VPC newVpc, NotificationChain msgs) {
		VPC oldVpc = vpc;
		vpc = newVpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TallerunoPackage.RECURSO__VPC, oldVpc, newVpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpc(VPC newVpc) {
		if (newVpc != vpc) {
			NotificationChain msgs = null;
			if (vpc != null)
				msgs = ((InternalEObject)vpc).eInverseRemove(this, TallerunoPackage.VPC__RECURSO, VPC.class, msgs);
			if (newVpc != null)
				msgs = ((InternalEObject)newVpc).eInverseAdd(this, TallerunoPackage.VPC__RECURSO, VPC.class, msgs);
			msgs = basicSetVpc(newVpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.RECURSO__VPC, newVpc, newVpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TallerunoPackage.RECURSO__CONEXIONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConexiones()).basicAdd(otherEnd, msgs);
			case TallerunoPackage.RECURSO__VPC:
				if (vpc != null)
					msgs = ((InternalEObject)vpc).eInverseRemove(this, TallerunoPackage.VPC__RECURSO, VPC.class, msgs);
				return basicSetVpc((VPC)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TallerunoPackage.RECURSO__CONEXIONES:
				return ((InternalEList<?>)getConexiones()).basicRemove(otherEnd, msgs);
			case TallerunoPackage.RECURSO__VPC:
				return basicSetVpc(null, msgs);
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
			case TallerunoPackage.RECURSO__CONEXIONES:
				return getConexiones();
			case TallerunoPackage.RECURSO__NOMBRE:
				return getNombre();
			case TallerunoPackage.RECURSO__TAMAÑO:
				return getTamaño();
			case TallerunoPackage.RECURSO__VPC:
				if (resolve) return getVpc();
				return basicGetVpc();
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
			case TallerunoPackage.RECURSO__CONEXIONES:
				getConexiones().clear();
				getConexiones().addAll((Collection<? extends Conexión>)newValue);
				return;
			case TallerunoPackage.RECURSO__NOMBRE:
				setNombre((String)newValue);
				return;
			case TallerunoPackage.RECURSO__TAMAÑO:
				setTamaño((TamañoServidor)newValue);
				return;
			case TallerunoPackage.RECURSO__VPC:
				setVpc((VPC)newValue);
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
			case TallerunoPackage.RECURSO__CONEXIONES:
				getConexiones().clear();
				return;
			case TallerunoPackage.RECURSO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case TallerunoPackage.RECURSO__TAMAÑO:
				setTamaño(TAMAÑO_EDEFAULT);
				return;
			case TallerunoPackage.RECURSO__VPC:
				setVpc((VPC)null);
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
			case TallerunoPackage.RECURSO__CONEXIONES:
				return conexiones != null && !conexiones.isEmpty();
			case TallerunoPackage.RECURSO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case TallerunoPackage.RECURSO__TAMAÑO:
				return tamaño != TAMAÑO_EDEFAULT;
			case TallerunoPackage.RECURSO__VPC:
				return vpc != null;
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
		result.append(", tamaño: ");
		result.append(tamaño);
		result.append(')');
		return result.toString();
	}

} //RecursoImpl
