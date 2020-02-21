/**
 */
package talleruno;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor Aplicaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.ServidorAplicaciones#getSistemaOperativo <em>Sistema Operativo</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getServidorAplicaciones()
 * @model
 * @generated
 */
public interface ServidorAplicaciones extends Recurso {
	/**
	 * Returns the value of the '<em><b>Sistema Operativo</b></em>' attribute.
	 * The literals are from the enumeration {@link talleruno.SistemaOperativo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sistema Operativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistema Operativo</em>' attribute.
	 * @see talleruno.SistemaOperativo
	 * @see #setSistemaOperativo(SistemaOperativo)
	 * @see talleruno.GramaticaPackage#getServidorAplicaciones_SistemaOperativo()
	 * @model
	 * @generated
	 */
	SistemaOperativo getSistemaOperativo();

	/**
	 * Sets the value of the '{@link talleruno.ServidorAplicaciones#getSistemaOperativo <em>Sistema Operativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistema Operativo</em>' attribute.
	 * @see talleruno.SistemaOperativo
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	void setSistemaOperativo(SistemaOperativo value);

} // ServidorAplicaciones
