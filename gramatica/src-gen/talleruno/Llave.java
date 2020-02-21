/**
 */
package talleruno;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.Llave#getSecreto <em>Secreto</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getLlave()
 * @model
 * @generated
 */
public interface Llave extends ParametroConexion {
	/**
	 * Returns the value of the '<em><b>Secreto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secreto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secreto</em>' attribute.
	 * @see #setSecreto(String)
	 * @see talleruno.GramaticaPackage#getLlave_Secreto()
	 * @model
	 * @generated
	 */
	String getSecreto();

	/**
	 * Sets the value of the '{@link talleruno.Llave#getSecreto <em>Secreto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secreto</em>' attribute.
	 * @see #getSecreto()
	 * @generated
	 */
	void setSecreto(String value);

} // Llave
