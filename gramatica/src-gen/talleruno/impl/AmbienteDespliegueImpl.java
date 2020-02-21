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
import talleruno.Conexion;
import talleruno.GramaticaPackage;
import talleruno.MecanismoSeguridad;
import talleruno.NombreAmbiente;
import talleruno.Recurso;
import talleruno.VPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ambiente Despliegue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.AmbienteDespliegueImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.impl.AmbienteDespliegueImpl#getRecursos <em>Recursos</em>}</li>
 *   <li>{@link talleruno.impl.AmbienteDespliegueImpl#getConexiones <em>Conexiones</em>}</li>
 *   <li>{@link talleruno.impl.AmbienteDespliegueImpl#getSeguridad <em>Seguridad</em>}</li>
 *   <li>{@link talleruno.impl.AmbienteDespliegueImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AmbienteDespliegueImpl extends MinimalEObjectImpl.Container
		implements AmbienteDespliegue {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final NombreAmbiente NOMBRE_EDEFAULT = NombreAmbiente.DESARROLLO;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected NombreAmbiente nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecursos() <em>Recursos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursos()
	 * @generated
	 * @ordered
	 */
	protected EList<Recurso> recursos;

	/**
	 * The cached value of the '{@link #getConexiones() <em>Conexiones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexiones()
	 * @generated
	 * @ordered
	 */
	protected EList<Conexion> conexiones;

	/**
	 * The cached value of the '{@link #getSeguridad() <em>Seguridad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeguridad()
	 * @generated
	 * @ordered
	 */
	protected EList<MecanismoSeguridad> seguridad;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected EList<VPC> vpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmbienteDespliegueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GramaticaPackage.Literals.AMBIENTE_DESPLIEGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NombreAmbiente getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(NombreAmbiente newNombre) {
		NombreAmbiente oldNombre = nombre;
		nombre = newNombre == null ? NOMBRE_EDEFAULT : newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.AMBIENTE_DESPLIEGUE__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Recurso> getRecursos() {
		if (recursos == null) {
			recursos = new EObjectContainmentEList<Recurso>(Recurso.class,
					this, GramaticaPackage.AMBIENTE_DESPLIEGUE__RECURSOS);
		}
		return recursos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Conexion> getConexiones() {
		if (conexiones == null) {
			conexiones = new EObjectContainmentEList<Conexion>(Conexion.class,
					this, GramaticaPackage.AMBIENTE_DESPLIEGUE__CONEXIONES);
		}
		return conexiones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MecanismoSeguridad> getSeguridad() {
		if (seguridad == null) {
			seguridad = new EObjectContainmentEList<MecanismoSeguridad>(
					MecanismoSeguridad.class, this,
					GramaticaPackage.AMBIENTE_DESPLIEGUE__SEGURIDAD);
		}
		return seguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VPC> getVpc() {
		if (vpc == null) {
			vpc = new EObjectContainmentEList<VPC>(VPC.class, this,
					GramaticaPackage.AMBIENTE_DESPLIEGUE__VPC);
		}
		return vpc;
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
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__RECURSOS:
			return ((InternalEList<?>) getRecursos()).basicRemove(otherEnd,
					msgs);
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__CONEXIONES:
			return ((InternalEList<?>) getConexiones()).basicRemove(otherEnd,
					msgs);
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__SEGURIDAD:
			return ((InternalEList<?>) getSeguridad()).basicRemove(otherEnd,
					msgs);
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__VPC:
			return ((InternalEList<?>) getVpc()).basicRemove(otherEnd, msgs);
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
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__NOMBRE:
			return getNombre();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__RECURSOS:
			return getRecursos();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__CONEXIONES:
			return getConexiones();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__SEGURIDAD:
			return getSeguridad();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__VPC:
			return getVpc();
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
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__NOMBRE:
			setNombre((NombreAmbiente) newValue);
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__RECURSOS:
			getRecursos().clear();
			getRecursos().addAll((Collection<? extends Recurso>) newValue);
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__CONEXIONES:
			getConexiones().clear();
			getConexiones().addAll((Collection<? extends Conexion>) newValue);
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__SEGURIDAD:
			getSeguridad().clear();
			getSeguridad().addAll(
					(Collection<? extends MecanismoSeguridad>) newValue);
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__VPC:
			getVpc().clear();
			getVpc().addAll((Collection<? extends VPC>) newValue);
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
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__RECURSOS:
			getRecursos().clear();
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__CONEXIONES:
			getConexiones().clear();
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__SEGURIDAD:
			getSeguridad().clear();
			return;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__VPC:
			getVpc().clear();
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
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__NOMBRE:
			return nombre != NOMBRE_EDEFAULT;
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__RECURSOS:
			return recursos != null && !recursos.isEmpty();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__CONEXIONES:
			return conexiones != null && !conexiones.isEmpty();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__SEGURIDAD:
			return seguridad != null && !seguridad.isEmpty();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE__VPC:
			return vpc != null && !vpc.isEmpty();
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

} //AmbienteDespliegueImpl
