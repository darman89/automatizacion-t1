/**
 */
package talleruno;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grupo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.GrupoSeguridad#getReglasEntrada <em>Reglas Entrada</em>}</li>
 *   <li>{@link talleruno.GrupoSeguridad#getReglasSalida <em>Reglas Salida</em>}</li>
 *   <li>{@link talleruno.GrupoSeguridad#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link talleruno.GrupoSeguridad#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getGrupoSeguridad()
 * @model
 * @generated
 */
public interface GrupoSeguridad extends MecanismoSeguridad {
	/**
	 * Returns the value of the '<em><b>Reglas Entrada</b></em>' containment reference list.
	 * The list contents are of type {@link talleruno.Regla}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reglas Entrada</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reglas Entrada</em>' containment reference list.
	 * @see talleruno.GramaticaPackage#getGrupoSeguridad_ReglasEntrada()
	 * @model containment="true"
	 * @generated
	 */
	EList<Regla> getReglasEntrada();

	/**
	 * Returns the value of the '<em><b>Reglas Salida</b></em>' containment reference list.
	 * The list contents are of type {@link talleruno.Regla}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reglas Salida</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reglas Salida</em>' containment reference list.
	 * @see talleruno.GramaticaPackage#getGrupoSeguridad_ReglasSalida()
	 * @model containment="true"
	 * @generated
	 */
	EList<Regla> getReglasSalida();

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see talleruno.GramaticaPackage#getGrupoSeguridad_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link talleruno.GrupoSeguridad#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link talleruno.VPC#getGruposeguridad <em>Gruposeguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see talleruno.GramaticaPackage#getGrupoSeguridad_Vpc()
	 * @see talleruno.VPC#getGruposeguridad
	 * @model opposite="gruposeguridad" required="true"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link talleruno.GrupoSeguridad#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

} // GrupoSeguridad
