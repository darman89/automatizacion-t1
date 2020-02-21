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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import talleruno.GramaticaPackage;
import talleruno.GrupoSeguridad;
import talleruno.Regla;
import talleruno.VPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grupo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.GrupoSeguridadImpl#getReglasEntrada <em>Reglas Entrada</em>}</li>
 *   <li>{@link talleruno.impl.GrupoSeguridadImpl#getReglasSalida <em>Reglas Salida</em>}</li>
 *   <li>{@link talleruno.impl.GrupoSeguridadImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link talleruno.impl.GrupoSeguridadImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrupoSeguridadImpl extends MecanismoSeguridadImpl implements
		GrupoSeguridad {
	/**
	 * The cached value of the '{@link #getReglasEntrada() <em>Reglas Entrada</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasEntrada()
	 * @generated
	 * @ordered
	 */
	protected EList<Regla> reglasEntrada;

	/**
	 * The cached value of the '{@link #getReglasSalida() <em>Reglas Salida</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasSalida()
	 * @generated
	 * @ordered
	 */
	protected EList<Regla> reglasSalida;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

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
	protected GrupoSeguridadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GramaticaPackage.Literals.GRUPO_SEGURIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regla> getReglasEntrada() {
		if (reglasEntrada == null) {
			reglasEntrada = new EObjectContainmentEList<Regla>(Regla.class,
					this, GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA);
		}
		return reglasEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regla> getReglasSalida() {
		if (reglasSalida == null) {
			reglasSalida = new EObjectContainmentEList<Regla>(Regla.class,
					this, GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA);
		}
		return reglasSalida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.GRUPO_SEGURIDAD__DESCRIPCION,
					oldDescripcion, descripcion));
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
							GramaticaPackage.GRUPO_SEGURIDAD__VPC, oldVpc, vpc));
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
					GramaticaPackage.GRUPO_SEGURIDAD__VPC, oldVpc, vpc));
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
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
			return ((InternalEList<?>) getReglasEntrada()).basicRemove(
					otherEnd, msgs);
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
			return ((InternalEList<?>) getReglasSalida()).basicRemove(otherEnd,
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
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
			return getReglasEntrada();
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
			return getReglasSalida();
		case GramaticaPackage.GRUPO_SEGURIDAD__DESCRIPCION:
			return getDescripcion();
		case GramaticaPackage.GRUPO_SEGURIDAD__VPC:
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
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
			getReglasEntrada().clear();
			getReglasEntrada().addAll((Collection<? extends Regla>) newValue);
			return;
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
			getReglasSalida().clear();
			getReglasSalida().addAll((Collection<? extends Regla>) newValue);
			return;
		case GramaticaPackage.GRUPO_SEGURIDAD__DESCRIPCION:
			setDescripcion((String) newValue);
			return;
		case GramaticaPackage.GRUPO_SEGURIDAD__VPC:
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
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
			getReglasEntrada().clear();
			return;
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
			getReglasSalida().clear();
			return;
		case GramaticaPackage.GRUPO_SEGURIDAD__DESCRIPCION:
			setDescripcion(DESCRIPCION_EDEFAULT);
			return;
		case GramaticaPackage.GRUPO_SEGURIDAD__VPC:
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
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
			return reglasEntrada != null && !reglasEntrada.isEmpty();
		case GramaticaPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
			return reglasSalida != null && !reglasSalida.isEmpty();
		case GramaticaPackage.GRUPO_SEGURIDAD__DESCRIPCION:
			return DESCRIPCION_EDEFAULT == null ? descripcion != null
					: !DESCRIPCION_EDEFAULT.equals(descripcion);
		case GramaticaPackage.GRUPO_SEGURIDAD__VPC:
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
		result.append(" (descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //GrupoSeguridadImpl
