/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import talleruno.TallerunoPackage;
import talleruno.UsuarioContraseña;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario Contraseña</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.UsuarioContraseñaImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link talleruno.impl.UsuarioContraseñaImpl#getContraseña <em>Contraseña</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioContraseñaImpl extends ParámetroConexiónImpl implements UsuarioContraseña {
	/**
	 * The default value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final String USUARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected String usuario = USUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getContraseña() <em>Contraseña</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraseña()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRASEÑA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContraseña() <em>Contraseña</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraseña()
	 * @generated
	 * @ordered
	 */
	protected String contraseña = CONTRASEÑA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioContraseñaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.USUARIO_CONTRASEÑA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuario(String newUsuario) {
		String oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.USUARIO_CONTRASEÑA__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraseña(String newContraseña) {
		String oldContraseña = contraseña;
		contraseña = newContraseña;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.USUARIO_CONTRASEÑA__CONTRASEÑA, oldContraseña, contraseña));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TallerunoPackage.USUARIO_CONTRASEÑA__USUARIO:
				return getUsuario();
			case TallerunoPackage.USUARIO_CONTRASEÑA__CONTRASEÑA:
				return getContraseña();
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
			case TallerunoPackage.USUARIO_CONTRASEÑA__USUARIO:
				setUsuario((String)newValue);
				return;
			case TallerunoPackage.USUARIO_CONTRASEÑA__CONTRASEÑA:
				setContraseña((String)newValue);
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
			case TallerunoPackage.USUARIO_CONTRASEÑA__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case TallerunoPackage.USUARIO_CONTRASEÑA__CONTRASEÑA:
				setContraseña(CONTRASEÑA_EDEFAULT);
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
			case TallerunoPackage.USUARIO_CONTRASEÑA__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case TallerunoPackage.USUARIO_CONTRASEÑA__CONTRASEÑA:
				return CONTRASEÑA_EDEFAULT == null ? contraseña != null : !CONTRASEÑA_EDEFAULT.equals(contraseña);
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
		result.append(" (usuario: ");
		result.append(usuario);
		result.append(", contraseña: ");
		result.append(contraseña);
		result.append(')');
		return result.toString();
	}

} //UsuarioContraseñaImpl
