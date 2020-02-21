/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import talleruno.BaseDatosNoSQL;
import talleruno.GramaticaPackage;
import talleruno.ManejadorNoSQL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Datos No SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.BaseDatosNoSQLImpl#getManejador <em>Manejador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseDatosNoSQLImpl extends ServidorBaseDatosImpl implements
		BaseDatosNoSQL {
	/**
	 * The default value of the '{@link #getManejador() <em>Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManejador()
	 * @generated
	 * @ordered
	 */
	protected static final ManejadorNoSQL MANEJADOR_EDEFAULT = ManejadorNoSQL.MONGODB;

	/**
	 * The cached value of the '{@link #getManejador() <em>Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManejador()
	 * @generated
	 * @ordered
	 */
	protected ManejadorNoSQL manejador = MANEJADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseDatosNoSQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GramaticaPackage.Literals.BASE_DATOS_NO_SQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManejadorNoSQL getManejador() {
		return manejador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManejador(ManejadorNoSQL newManejador) {
		ManejadorNoSQL oldManejador = manejador;
		manejador = newManejador == null ? MANEJADOR_EDEFAULT : newManejador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GramaticaPackage.BASE_DATOS_NO_SQL__MANEJADOR,
					oldManejador, manejador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GramaticaPackage.BASE_DATOS_NO_SQL__MANEJADOR:
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
		case GramaticaPackage.BASE_DATOS_NO_SQL__MANEJADOR:
			setManejador((ManejadorNoSQL) newValue);
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
		case GramaticaPackage.BASE_DATOS_NO_SQL__MANEJADOR:
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
		case GramaticaPackage.BASE_DATOS_NO_SQL__MANEJADOR:
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

} //BaseDatosNoSQLImpl
