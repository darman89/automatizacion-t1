/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import talleruno.BaseDatosSQL;
import talleruno.GramaticaPackage;
import talleruno.ManejadorSQL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Datos SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.BaseDatosSQLImpl#getManejador <em>Manejador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseDatosSQLImpl extends ServidorBaseDatosImpl implements
		BaseDatosSQL {
	/**
	 * The default value of the '{@link #getManejador() <em>Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManejador()
	 * @generated
	 * @ordered
	 */
	protected static final ManejadorSQL MANEJADOR_EDEFAULT = ManejadorSQL.POSTGRESQL;

	/**
	 * The cached value of the '{@link #getManejador() <em>Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManejador()
	 * @generated
	 * @ordered
	 */
	protected ManejadorSQL manejador = MANEJADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseDatosSQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GramaticaPackage.Literals.BASE_DATOS_SQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManejadorSQL getManejador() {
		return manejador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManejador(ManejadorSQL newManejador) {
		ManejadorSQL oldManejador = manejador;
		manejador = newManejador == null ? MANEJADOR_EDEFAULT : newManejador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.BASE_DATOS_SQL__MANEJADOR, oldManejador,
					manejador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GramaticaPackage.BASE_DATOS_SQL__MANEJADOR:
			return getManejador();
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
		case GramaticaPackage.BASE_DATOS_SQL__MANEJADOR:
			setManejador((ManejadorSQL) newValue);
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
		case GramaticaPackage.BASE_DATOS_SQL__MANEJADOR:
			setManejador(MANEJADOR_EDEFAULT);
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
		case GramaticaPackage.BASE_DATOS_SQL__MANEJADOR:
			return manejador != MANEJADOR_EDEFAULT;
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
		result.append(" (manejador: ");
		result.append(manejador);
		result.append(')');
		return result.toString();
	}

} //BaseDatosSQLImpl
