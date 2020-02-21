/**
 */
package talleruno;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario Password</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.UsuarioPassword#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link talleruno.UsuarioPassword#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getUsuarioPassword()
 * @model
 * @generated
 */
public interface UsuarioPassword extends ParametroConexion {
	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see talleruno.GramaticaPackage#getUsuarioPassword_Usuario()
	 * @model
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link talleruno.UsuarioPassword#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see talleruno.GramaticaPackage#getUsuarioPassword_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link talleruno.UsuarioPassword#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // UsuarioPassword
