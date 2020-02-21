/**
 */
package talleruno;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.ServidorAlmacenamiento#getTamanioInicial <em>Tamanio Inicial</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getServidorAlmacenamiento()
 * @model
 * @generated
 */
public interface ServidorAlmacenamiento extends Recurso {
	/**
	 * Returns the value of the '<em><b>Tamanio Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamanio Inicial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamanio Inicial</em>' attribute.
	 * @see #setTamanioInicial(int)
	 * @see talleruno.GramaticaPackage#getServidorAlmacenamiento_TamanioInicial()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getTamanioInicial();

	/**
	 * Sets the value of the '{@link talleruno.ServidorAlmacenamiento#getTamanioInicial <em>Tamanio Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamanio Inicial</em>' attribute.
	 * @see #getTamanioInicial()
	 * @generated
	 */
	void setTamanioInicial(int value);

} // ServidorAlmacenamiento
