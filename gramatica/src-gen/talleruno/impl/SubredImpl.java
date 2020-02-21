/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import talleruno.GramaticaPackage;
import talleruno.Subred;
import talleruno.VPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subred</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.SubredImpl#getCIDR <em>CIDR</em>}</li>
 *   <li>{@link talleruno.impl.SubredImpl#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 *   <li>{@link talleruno.impl.SubredImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubredImpl extends MecanismoSeguridadImpl implements Subred {
	/**
	 * The default value of the '{@link #getCIDR() <em>CIDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIDR()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCIDR() <em>CIDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIDR()
	 * @generated
	 * @ordered
	 */
	protected String cidr = CIDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getZonaDisponibilidad() <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaDisponibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONA_DISPONIBILIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZonaDisponibilidad() <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaDisponibilidad()
	 * @generated
	 * @ordered
	 */
	protected String zonaDisponibilidad = ZONA_DISPONIBILIDAD_EDEFAULT;

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
	protected SubredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GramaticaPackage.Literals.SUBRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCIDR() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIDR(String newCIDR) {
		String oldCIDR = cidr;
		cidr = newCIDR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.SUBRED__CIDR, oldCIDR, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZonaDisponibilidad() {
		return zonaDisponibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZonaDisponibilidad(String newZonaDisponibilidad) {
		String oldZonaDisponibilidad = zonaDisponibilidad;
		zonaDisponibilidad = newZonaDisponibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.SUBRED__ZONA_DISPONIBILIDAD,
					oldZonaDisponibilidad, zonaDisponibilidad));
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
							GramaticaPackage.SUBRED__VPC, oldVpc, vpc));
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
					GramaticaPackage.SUBRED__VPC, oldVpc, vpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GramaticaPackage.SUBRED__CIDR:
			return getCIDR();
		case GramaticaPackage.SUBRED__ZONA_DISPONIBILIDAD:
			return getZonaDisponibilidad();
		case GramaticaPackage.SUBRED__VPC:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GramaticaPackage.SUBRED__CIDR:
			setCIDR((String) newValue);
			return;
		case GramaticaPackage.SUBRED__ZONA_DISPONIBILIDAD:
			setZonaDisponibilidad((String) newValue);
			return;
		case GramaticaPackage.SUBRED__VPC:
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
		case GramaticaPackage.SUBRED__CIDR:
			setCIDR(CIDR_EDEFAULT);
			return;
		case GramaticaPackage.SUBRED__ZONA_DISPONIBILIDAD:
			setZonaDisponibilidad(ZONA_DISPONIBILIDAD_EDEFAULT);
			return;
		case GramaticaPackage.SUBRED__VPC:
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
		case GramaticaPackage.SUBRED__CIDR:
			return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT
					.equals(cidr);
		case GramaticaPackage.SUBRED__ZONA_DISPONIBILIDAD:
			return ZONA_DISPONIBILIDAD_EDEFAULT == null ? zonaDisponibilidad != null
					: !ZONA_DISPONIBILIDAD_EDEFAULT.equals(zonaDisponibilidad);
		case GramaticaPackage.SUBRED__VPC:
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
		result.append(" (CIDR: ");
		result.append(cidr);
		result.append(", zonaDisponibilidad: ");
		result.append(zonaDisponibilidad);
		result.append(')');
		return result.toString();
	}

} //SubredImpl
