/**
 */
package talleruno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Datos SQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.BaseDatosSQL#getManejador <em>Manejador</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.TallerunoPackage#getBaseDatosSQL()
 * @model
 * @generated
 */
public interface BaseDatosSQL extends ServidorBaseDatos {
	/**
	 * Returns the value of the '<em><b>Manejador</b></em>' attribute.
	 * The literals are from the enumeration {@link talleruno.ManejadorSQL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manejador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manejador</em>' attribute.
	 * @see talleruno.ManejadorSQL
	 * @see #setManejador(ManejadorSQL)
	 * @see talleruno.TallerunoPackage#getBaseDatosSQL_Manejador()
	 * @model
	 * @generated
	 */
	ManejadorSQL getManejador();

	/**
	 * Sets the value of the '{@link talleruno.BaseDatosSQL#getManejador <em>Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manejador</em>' attribute.
	 * @see talleruno.ManejadorSQL
	 * @see #getManejador()
	 * @generated
	 */
	void setManejador(ManejadorSQL value);

} // BaseDatosSQL
