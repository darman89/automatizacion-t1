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

import talleruno.Conexion;
import talleruno.GramaticaPackage;
import talleruno.Recurso;
import talleruno.TamanioServidor;
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
 *   <li>{@link talleruno.impl.RecursoImpl#getTamanio <em>Tamanio</em>}</li>
 *   <li>{@link talleruno.impl.RecursoImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RecursoImpl extends MinimalEObjectImpl.Container
		implements Recurso {
	/**
	 * The cached value of the '{@link #getConexiones() <em>Conexiones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexiones()
	 * @generated
	 * @ordered
	 */
	protected EList<Conexion> conexiones;

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
	 * The default value of the '{@link #getTamanio() <em>Tamanio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanio()
	 * @generated
	 * @ordered
	 */
	protected static final TamanioServidor TAMANIO_EDEFAULT = TamanioServidor.MICRO;

	/**
	 * The cached value of the '{@link #getTamanio() <em>Tamanio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanio()
	 * @generated
	 * @ordered
	 */
	protected TamanioServidor tamanio = TAMANIO_EDEFAULT;

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
		return GramaticaPackage.Literals.RECURSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Conexion> getConexiones() {
		if (conexiones == null) {
			conexiones = new EObjectWithInverseResolvingEList.ManyInverse<Conexion>(
					Conexion.class, this, GramaticaPackage.RECURSO__CONEXIONES,
					GramaticaPackage.CONEXION__RECURSOS);
		}
		return conexiones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.RECURSO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TamanioServidor getTamanio() {
		return tamanio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTamanio(TamanioServidor newTamanio) {
		TamanioServidor oldTamanio = tamanio;
		tamanio = newTamanio == null ? TAMANIO_EDEFAULT : newTamanio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.RECURSO__TAMANIO, oldTamanio, tamanio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VPC getVpc() {
		if (vpc != null && vpc.eIsProxy()) {
			InternalEObject oldVpc = (InternalEObject) vpc;
			vpc = (VPC) eResolveProxy(oldVpc);
			if (vpc != oldVpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GramaticaPackage.RECURSO__VPC, oldVpc, vpc));
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
	@Override
	public void setVpc(VPC newVpc) {
		VPC oldVpc = vpc;
		vpc = newVpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.RECURSO__VPC, oldVpc, vpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GramaticaPackage.RECURSO__CONEXIONES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConexiones())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case GramaticaPackage.RECURSO__CONEXIONES:
			return ((InternalEList<?>) getConexiones()).basicRemove(otherEnd,
					msgs);
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
		case GramaticaPackage.RECURSO__CONEXIONES:
			return getConexiones();
		case GramaticaPackage.RECURSO__NOMBRE:
			return getNombre();
		case GramaticaPackage.RECURSO__TAMANIO:
			return getTamanio();
		case GramaticaPackage.RECURSO__VPC:
			if (resolve)
				return getVpc();
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
		case GramaticaPackage.RECURSO__CONEXIONES:
			getConexiones().clear();
			getConexiones().addAll((Collection<? extends Conexion>) newValue);
			return;
		case GramaticaPackage.RECURSO__NOMBRE:
			setNombre((String) newValue);
			return;
		case GramaticaPackage.RECURSO__TAMANIO:
			setTamanio((TamanioServidor) newValue);
			return;
		case GramaticaPackage.RECURSO__VPC:
			setVpc((VPC) newValue);
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
		case GramaticaPackage.RECURSO__CONEXIONES:
			getConexiones().clear();
			return;
		case GramaticaPackage.RECURSO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case GramaticaPackage.RECURSO__TAMANIO:
			setTamanio(TAMANIO_EDEFAULT);
			return;
		case GramaticaPackage.RECURSO__VPC:
			setVpc((VPC) null);
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
		case GramaticaPackage.RECURSO__CONEXIONES:
			return conexiones != null && !conexiones.isEmpty();
		case GramaticaPackage.RECURSO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case GramaticaPackage.RECURSO__TAMANIO:
			return tamanio != TAMANIO_EDEFAULT;
		case GramaticaPackage.RECURSO__VPC:
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", tamanio: ");
		result.append(tamanio);
		result.append(')');
		return result.toString();
	}

} //RecursoImpl
