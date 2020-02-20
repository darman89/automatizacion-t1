/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import talleruno.Llave;
import talleruno.TallerunoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Llave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.LlaveImpl#getSecreto <em>Secreto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LlaveImpl extends ParámetroConexiónImpl implements Llave {
	/**
	 * The default value of the '{@link #getSecreto() <em>Secreto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecreto()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRETO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecreto() <em>Secreto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecreto()
	 * @generated
	 * @ordered
	 */
	protected String secreto = SECRETO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LlaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.LLAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecreto() {
		return secreto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecreto(String newSecreto) {
		String oldSecreto = secreto;
		secreto = newSecreto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.LLAVE__SECRETO, oldSecreto, secreto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TallerunoPackage.LLAVE__SECRETO:
				return getSecreto();
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
			case TallerunoPackage.LLAVE__SECRETO:
				setSecreto((String)newValue);
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
			case TallerunoPackage.LLAVE__SECRETO:
				setSecreto(SECRETO_EDEFAULT);
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
			case TallerunoPackage.LLAVE__SECRETO:
				return SECRETO_EDEFAULT == null ? secreto != null : !SECRETO_EDEFAULT.equals(secreto);
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
		result.append(" (secreto: ");
		result.append(secreto);
		result.append(')');
		return result.toString();
	}

} //LlaveImpl
