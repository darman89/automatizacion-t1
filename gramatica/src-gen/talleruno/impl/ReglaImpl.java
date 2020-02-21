/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import talleruno.GramaticaPackage;
import talleruno.Protocolo;
import talleruno.Regla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.ReglaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link talleruno.impl.ReglaImpl#getProtocolo <em>Protocolo</em>}</li>
 *   <li>{@link talleruno.impl.ReglaImpl#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link talleruno.impl.ReglaImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link talleruno.impl.ReglaImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReglaImpl extends MinimalEObjectImpl.Container implements Regla {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolo() <em>Protocolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolo()
	 * @generated
	 * @ordered
	 */
	protected static final Protocolo PROTOCOLO_EDEFAULT = Protocolo.TCP;

	/**
	 * The cached value of the '{@link #getProtocolo() <em>Protocolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolo()
	 * @generated
	 * @ordered
	 */
	protected Protocolo protocolo = PROTOCOLO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected static final int PUERTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected int puerto = PUERTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected String origen = ORIGEN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReglaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GramaticaPackage.Literals.REGLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.REGLA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocolo getProtocolo() {
		return protocolo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolo(Protocolo newProtocolo) {
		Protocolo oldProtocolo = protocolo;
		protocolo = newProtocolo == null ? PROTOCOLO_EDEFAULT : newProtocolo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.REGLA__PROTOCOLO, oldProtocolo, protocolo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPuerto() {
		return puerto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuerto(int newPuerto) {
		int oldPuerto = puerto;
		puerto = newPuerto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.REGLA__PUERTO, oldPuerto, puerto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(String newOrigen) {
		String oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.REGLA__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.REGLA__DESCRIPCION, oldDescripcion,
					descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GramaticaPackage.REGLA__TIPO:
			return getTipo();
		case GramaticaPackage.REGLA__PROTOCOLO:
			return getProtocolo();
		case GramaticaPackage.REGLA__PUERTO:
			return getPuerto();
		case GramaticaPackage.REGLA__ORIGEN:
			return getOrigen();
		case GramaticaPackage.REGLA__DESCRIPCION:
			return getDescripcion();
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
		case GramaticaPackage.REGLA__TIPO:
			setTipo((String) newValue);
			return;
		case GramaticaPackage.REGLA__PROTOCOLO:
			setProtocolo((Protocolo) newValue);
			return;
		case GramaticaPackage.REGLA__PUERTO:
			setPuerto((Integer) newValue);
			return;
		case GramaticaPackage.REGLA__ORIGEN:
			setOrigen((String) newValue);
			return;
		case GramaticaPackage.REGLA__DESCRIPCION:
			setDescripcion((String) newValue);
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
		case GramaticaPackage.REGLA__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case GramaticaPackage.REGLA__PROTOCOLO:
			setProtocolo(PROTOCOLO_EDEFAULT);
			return;
		case GramaticaPackage.REGLA__PUERTO:
			setPuerto(PUERTO_EDEFAULT);
			return;
		case GramaticaPackage.REGLA__ORIGEN:
			setOrigen(ORIGEN_EDEFAULT);
			return;
		case GramaticaPackage.REGLA__DESCRIPCION:
			setDescripcion(DESCRIPCION_EDEFAULT);
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
		case GramaticaPackage.REGLA__TIPO:
			return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT
					.equals(tipo);
		case GramaticaPackage.REGLA__PROTOCOLO:
			return protocolo != PROTOCOLO_EDEFAULT;
		case GramaticaPackage.REGLA__PUERTO:
			return puerto != PUERTO_EDEFAULT;
		case GramaticaPackage.REGLA__ORIGEN:
			return ORIGEN_EDEFAULT == null ? origen != null : !ORIGEN_EDEFAULT
					.equals(origen);
		case GramaticaPackage.REGLA__DESCRIPCION:
			return DESCRIPCION_EDEFAULT == null ? descripcion != null
					: !DESCRIPCION_EDEFAULT.equals(descripcion);
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", protocolo: ");
		result.append(protocolo);
		result.append(", puerto: ");
		result.append(puerto);
		result.append(", origen: ");
		result.append(origen);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ReglaImpl
