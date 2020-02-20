/**
 */
package talleruno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import talleruno.TallerunoPackage;
import talleruno.UsuarioContrase�a;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario Contrase�a</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talleruno.impl.UsuarioContrase�aImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link talleruno.impl.UsuarioContrase�aImpl#getContrase�a <em>Contrase�a</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioContrase�aImpl extends Par�metroConexi�nImpl implements UsuarioContrase�a {
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
	 * The default value of the '{@link #getContrase�a() <em>Contrase�a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrase�a()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRASE�A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContrase�a() <em>Contrase�a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrase�a()
	 * @generated
	 * @ordered
	 */
	protected String contrase�a = CONTRASE�A_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioContrase�aImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TallerunoPackage.Literals.USUARIO_CONTRASE�A;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.USUARIO_CONTRASE�A__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrase�a(String newContrase�a) {
		String oldContrase�a = contrase�a;
		contrase�a = newContrase�a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TallerunoPackage.USUARIO_CONTRASE�A__CONTRASE�A, oldContrase�a, contrase�a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TallerunoPackage.USUARIO_CONTRASE�A__USUARIO:
				return getUsuario();
			case TallerunoPackage.USUARIO_CONTRASE�A__CONTRASE�A:
				return getContrase�a();
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
			case TallerunoPackage.USUARIO_CONTRASE�A__USUARIO:
				setUsuario((String)newValue);
				return;
			case TallerunoPackage.USUARIO_CONTRASE�A__CONTRASE�A:
				setContrase�a((String)newValue);
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
			case TallerunoPackage.USUARIO_CONTRASE�A__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case TallerunoPackage.USUARIO_CONTRASE�A__CONTRASE�A:
				setContrase�a(CONTRASE�A_EDEFAULT);
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
			case TallerunoPackage.USUARIO_CONTRASE�A__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case TallerunoPackage.USUARIO_CONTRASE�A__CONTRASE�A:
				return CONTRASE�A_EDEFAULT == null ? contrase�a != null : !CONTRASE�A_EDEFAULT.equals(contrase�a);
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
		result.append(", contrase�a: ");
		result.append(contrase�a);
		result.append(')');
		return result.toString();
	}

} //UsuarioContrase�aImpl
