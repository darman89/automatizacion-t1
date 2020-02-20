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

import talleruno.GrupoSeguridad;
import talleruno.Regla;
import talleruno.TallerunoPackage;
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
 *   <li>{@link talleruno.impl.GrupoSeguridadImpl#getDescripción <em>Descripción</em>}</li>
 *   <li>{@link talleruno.impl.GrupoSeguridadImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrupoSeguridadImpl extends MecanismoSeguridadImpl implements GrupoSeguridad {
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
	 * The default value of the '{@link #getDescripción() <em>Descripción</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripción()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCIÓN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripción() <em>Descripción</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripción()
	 * @generated
	 * @ordered
	 */
	protected String descripción = DESCRIPCIÓN_EDEFAULT;

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
		return TallerunoPackage.Literals.GRUPO_SEGURIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regla> getReglasEntrada() {
		if (reglasEntrada == null) {
			reglasEntrada = new EObjectContainmentEList<Regla>(Regla.class, this, TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA);
		}
		return reglasEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regla> getReglasSalida() {
		if (reglasSalida == null) {
			reglasSalida = new EObjectContainmentEList<Regla>(Regla.class, this, TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA);
		}
		return reglasSalida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripción() {
		return descripción;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripción(String newDescripción) {
		String oldDescripción = descripción;
		descripción = newDescripción;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.GRUPO_SEGURIDAD__DESCRIPCIÓN, oldDescripción, descripción));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TallerunoPackage.GRUPO_SEGURIDAD__VPC, oldVpc, vpc));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TallerunoPackage.GRUPO_SEGURIDAD__VPC, oldVpc, newVpc);
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
				msgs = ((InternalEObject)vpc).eInverseRemove(this, TallerunoPackage.VPC__GRUPOSEGURIDAD, VPC.class, msgs);
			if (newVpc != null)
				msgs = ((InternalEObject)newVpc).eInverseAdd(this, TallerunoPackage.VPC__GRUPOSEGURIDAD, VPC.class, msgs);
			msgs = basicSetVpc(newVpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.GRUPO_SEGURIDAD__VPC, newVpc, newVpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TallerunoPackage.GRUPO_SEGURIDAD__VPC:
				if (vpc != null)
					msgs = ((InternalEObject)vpc).eInverseRemove(this, TallerunoPackage.VPC__GRUPOSEGURIDAD, VPC.class, msgs);
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
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				return ((InternalEList<?>)getReglasEntrada()).basicRemove(otherEnd, msgs);
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				return ((InternalEList<?>)getReglasSalida()).basicRemove(otherEnd, msgs);
			case TallerunoPackage.GRUPO_SEGURIDAD__VPC:
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
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				return getReglasEntrada();
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				return getReglasSalida();
			case TallerunoPackage.GRUPO_SEGURIDAD__DESCRIPCIÓN:
				return getDescripción();
			case TallerunoPackage.GRUPO_SEGURIDAD__VPC:
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
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				getReglasEntrada().clear();
				getReglasEntrada().addAll((Collection<? extends Regla>)newValue);
				return;
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				getReglasSalida().clear();
				getReglasSalida().addAll((Collection<? extends Regla>)newValue);
				return;
			case TallerunoPackage.GRUPO_SEGURIDAD__DESCRIPCIÓN:
				setDescripción((String)newValue);
				return;
			case TallerunoPackage.GRUPO_SEGURIDAD__VPC:
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
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				getReglasEntrada().clear();
				return;
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				getReglasSalida().clear();
				return;
			case TallerunoPackage.GRUPO_SEGURIDAD__DESCRIPCIÓN:
				setDescripción(DESCRIPCIÓN_EDEFAULT);
				return;
			case TallerunoPackage.GRUPO_SEGURIDAD__VPC:
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
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				return reglasEntrada != null && !reglasEntrada.isEmpty();
			case TallerunoPackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				return reglasSalida != null && !reglasSalida.isEmpty();
			case TallerunoPackage.GRUPO_SEGURIDAD__DESCRIPCIÓN:
				return DESCRIPCIÓN_EDEFAULT == null ? descripción != null : !DESCRIPCIÓN_EDEFAULT.equals(descripción);
			case TallerunoPackage.GRUPO_SEGURIDAD__VPC:
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
		result.append(" (descripción: ");
		result.append(descripción);
		result.append(')');
		return result.toString();
	}

} //GrupoSeguridadImpl
