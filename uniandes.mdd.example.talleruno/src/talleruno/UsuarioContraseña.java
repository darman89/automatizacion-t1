/**
 */
package talleruno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario Contraseña</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.UsuarioContraseña#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link talleruno.UsuarioContraseña#getContraseña <em>Contraseña</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.TallerunoPackage#getUsuarioContraseña()
 * @model
 * @generated
 */
public interface UsuarioContraseña extends ParámetroConexión {
	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see talleruno.TallerunoPackage#getUsuarioContraseña_Usuario()
	 * @model
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link talleruno.UsuarioContraseña#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Contraseña</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraseña</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraseña</em>' attribute.
	 * @see #setContraseña(String)
	 * @see talleruno.TallerunoPackage#getUsuarioContraseña_Contraseña()
	 * @model
	 * @generated
	 */
	String getContraseña();

	/**
	 * Sets the value of the '{@link talleruno.UsuarioContraseña#getContraseña <em>Contraseña</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contraseña</em>' attribute.
	 * @see #getContraseña()
	 * @generated
	 */
	void setContraseña(String value);

} // UsuarioContraseña
