/**
 */
package talleruno;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Datos No SQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.BaseDatosNoSQL#getManejador <em>Manejador</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getBaseDatosNoSQL()
 * @model
 * @generated
 */
public interface BaseDatosNoSQL extends ServidorBaseDatos {
	/**
	 * Returns the value of the '<em><b>Manejador</b></em>' attribute.
	 * The literals are from the enumeration {@link talleruno.ManejadorNoSQL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manejador</em>' attribute.
	 * @see talleruno.ManejadorNoSQL
	 * @see #setManejador(ManejadorNoSQL)
	 * @see talleruno.GramaticaPackage#getBaseDatosNoSQL_Manejador()
	 * @model
	 * @generated
	 */
	ManejadorNoSQL getManejador();

	/**
	 * Sets the value of the '{@link talleruno.BaseDatosNoSQL#getManejador <em>Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manejador</em>' attribute.
	 * @see talleruno.ManejadorNoSQL
	 * @see #getManejador()
	 * @generated
	 */
	void setManejador(ManejadorNoSQL value);

} // BaseDatosNoSQL
