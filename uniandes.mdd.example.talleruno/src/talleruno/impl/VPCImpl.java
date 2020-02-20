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

import talleruno.GrupoSeguridad;
import talleruno.InternetGateway;
import talleruno.Recurso;
import talleruno.Subred;
import talleruno.TallerunoPackage;
import talleruno.VPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.VPCImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.impl.VPCImpl#getRecurso <em>Recurso</em>}</li>
 *   <li>{@link talleruno.impl.VPCImpl#getGruposeguridad <em>Gruposeguridad</em>}</li>
 *   <li>{@link talleruno.impl.VPCImpl#getSubred <em>Subred</em>}</li>
 *   <li>{@link talleruno.impl.VPCImpl#getInternetgateway <em>Internetgateway</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VPCImpl extends MinimalEObjectImpl.Container implements VPC {
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
	 * The cached value of the '{@link #getRecurso() <em>Recurso</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso()
	 * @generated
	 * @ordered
	 */
	protected EList<Recurso> recurso;

	/**
	 * The cached value of the '{@link #getGruposeguridad() <em>Gruposeguridad</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruposeguridad()
	 * @generated
	 * @ordered
	 */
	protected EList<GrupoSeguridad> gruposeguridad;

	/**
	 * The cached value of the '{@link #getSubred() <em>Subred</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubred()
	 * @generated
	 * @ordered
	 */
	protected EList<Subred> subred;

	/**
	 * The cached value of the '{@link #getInternetgateway() <em>Internetgateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternetgateway()
	 * @generated
	 * @ordered
	 */
	protected InternetGateway internetgateway;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.VPC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.VPC__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recurso> getRecurso() {
		if (recurso == null) {
			recurso = new EObjectWithInverseResolvingEList<Recurso>(Recurso.class, this, TallerunoPackage.VPC__RECURSO, TallerunoPackage.RECURSO__VPC);
		}
		return recurso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrupoSeguridad> getGruposeguridad() {
		if (gruposeguridad == null) {
			gruposeguridad = new EObjectWithInverseResolvingEList<GrupoSeguridad>(GrupoSeguridad.class, this, TallerunoPackage.VPC__GRUPOSEGURIDAD, TallerunoPackage.GRUPO_SEGURIDAD__VPC);
		}
		return gruposeguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subred> getSubred() {
		if (subred == null) {
			subred = new EObjectWithInverseResolvingEList<Subred>(Subred.class, this, TallerunoPackage.VPC__SUBRED, TallerunoPackage.SUBRED__VPC);
		}
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternetGateway getInternetgateway() {
		if (internetgateway != null && internetgateway.eIsProxy()) {
			InternalEObject oldInternetgateway = (InternalEObject)internetgateway;
			internetgateway = (InternetGateway)eResolveProxy(oldInternetgateway);
			if (internetgateway != oldInternetgateway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TallerunoPackage.VPC__INTERNETGATEWAY, oldInternetgateway, internetgateway));
			}
		}
		return internetgateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternetGateway basicGetInternetgateway() {
		return internetgateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternetgateway(InternetGateway newInternetgateway, NotificationChain msgs) {
		InternetGateway oldInternetgateway = internetgateway;
		internetgateway = newInternetgateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TallerunoPackage.VPC__INTERNETGATEWAY, oldInternetgateway, newInternetgateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternetgateway(InternetGateway newInternetgateway) {
		if (newInternetgateway != internetgateway) {
			NotificationChain msgs = null;
			if (internetgateway != null)
				msgs = ((InternalEObject)internetgateway).eInverseRemove(this, TallerunoPackage.INTERNET_GATEWAY__VPC, InternetGateway.class, msgs);
			if (newInternetgateway != null)
				msgs = ((InternalEObject)newInternetgateway).eInverseAdd(this, TallerunoPackage.INTERNET_GATEWAY__VPC, InternetGateway.class, msgs);
			msgs = basicSetInternetgateway(newInternetgateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.VPC__INTERNETGATEWAY, newInternetgateway, newInternetgateway));
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
			case TallerunoPackage.VPC__RECURSO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecurso()).basicAdd(otherEnd, msgs);
			case TallerunoPackage.VPC__GRUPOSEGURIDAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGruposeguridad()).basicAdd(otherEnd, msgs);
			case TallerunoPackage.VPC__SUBRED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubred()).basicAdd(otherEnd, msgs);
			case TallerunoPackage.VPC__INTERNETGATEWAY:
				if (internetgateway != null)
					msgs = ((InternalEObject)internetgateway).eInverseRemove(this, TallerunoPackage.INTERNET_GATEWAY__VPC, InternetGateway.class, msgs);
				return basicSetInternetgateway((InternetGateway)otherEnd, msgs);
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
			case TallerunoPackage.VPC__RECURSO:
				return ((InternalEList<?>)getRecurso()).basicRemove(otherEnd, msgs);
			case TallerunoPackage.VPC__GRUPOSEGURIDAD:
				return ((InternalEList<?>)getGruposeguridad()).basicRemove(otherEnd, msgs);
			case TallerunoPackage.VPC__SUBRED:
				return ((InternalEList<?>)getSubred()).basicRemove(otherEnd, msgs);
			case TallerunoPackage.VPC__INTERNETGATEWAY:
				return basicSetInternetgateway(null, msgs);
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
			case TallerunoPackage.VPC__NOMBRE:
				return getNombre();
			case TallerunoPackage.VPC__RECURSO:
				return getRecurso();
			case TallerunoPackage.VPC__GRUPOSEGURIDAD:
				return getGruposeguridad();
			case TallerunoPackage.VPC__SUBRED:
				return getSubred();
			case TallerunoPackage.VPC__INTERNETGATEWAY:
				if (resolve) return getInternetgateway();
				return basicGetInternetgateway();
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
			case TallerunoPackage.VPC__NOMBRE:
				setNombre((String)newValue);
				return;
			case TallerunoPackage.VPC__RECURSO:
				getRecurso().clear();
				getRecurso().addAll((Collection<? extends Recurso>)newValue);
				return;
			case TallerunoPackage.VPC__GRUPOSEGURIDAD:
				getGruposeguridad().clear();
				getGruposeguridad().addAll((Collection<? extends GrupoSeguridad>)newValue);
				return;
			case TallerunoPackage.VPC__SUBRED:
				getSubred().clear();
				getSubred().addAll((Collection<? extends Subred>)newValue);
				return;
			case TallerunoPackage.VPC__INTERNETGATEWAY:
				setInternetgateway((InternetGateway)newValue);
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
			case TallerunoPackage.VPC__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case TallerunoPackage.VPC__RECURSO:
				getRecurso().clear();
				return;
			case TallerunoPackage.VPC__GRUPOSEGURIDAD:
				getGruposeguridad().clear();
				return;
			case TallerunoPackage.VPC__SUBRED:
				getSubred().clear();
				return;
			case TallerunoPackage.VPC__INTERNETGATEWAY:
				setInternetgateway((InternetGateway)null);
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
			case TallerunoPackage.VPC__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case TallerunoPackage.VPC__RECURSO:
				return recurso != null && !recurso.isEmpty();
			case TallerunoPackage.VPC__GRUPOSEGURIDAD:
				return gruposeguridad != null && !gruposeguridad.isEmpty();
			case TallerunoPackage.VPC__SUBRED:
				return subred != null && !subred.isEmpty();
			case TallerunoPackage.VPC__INTERNETGATEWAY:
				return internetgateway != null;
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

} //VPCImpl
