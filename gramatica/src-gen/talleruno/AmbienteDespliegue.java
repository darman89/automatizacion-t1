/**
 */
package talleruno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ambiente Despliegue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.AmbienteDespliegue#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.AmbienteDespliegue#getRecursos <em>Recursos</em>}</li>
 *   <li>{@link talleruno.AmbienteDespliegue#getConexiones <em>Conexiones</em>}</li>
 *   <li>{@link talleruno.AmbienteDespliegue#getSeguridad <em>Seguridad</em>}</li>
 *   <li>{@link talleruno.AmbienteDespliegue#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getAmbienteDespliegue()
 * @model
 * @generated
 */
public interface AmbienteDespliegue extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The literals are from the enumeration {@link talleruno.NombreAmbiente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see talleruno.NombreAmbiente
	 * @see #setNombre(NombreAmbiente)
	 * @see talleruno.GramaticaPackage#getAmbienteDespliegue_Nombre()
	 * @model
	 * @generated
	 */
	NombreAmbiente getNombre();

	/**
	 * Sets the value of the '{@link talleruno.AmbienteDespliegue#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see talleruno.NombreAmbiente
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(NombreAmbiente value);

	/**
	 * Returns the value of the '<em><b>Recursos</b></em>' containment reference list.
	 * The list contents are of type {@link talleruno.Recurso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursos</em>' containment reference list.
	 * @see talleruno.GramaticaPackage#getAmbienteDespliegue_Recursos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recurso> getRecursos();

	/**
	 * Returns the value of the '<em><b>Conexiones</b></em>' containment reference list.
	 * The list contents are of type {@link talleruno.Conexion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexiones</em>' containment reference list.
	 * @see talleruno.GramaticaPackage#getAmbienteDespliegue_Conexiones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conexion> getConexiones();

	/**
	 * Returns the value of the '<em><b>Seguridad</b></em>' containment reference list.
	 * The list contents are of type {@link talleruno.MecanismoSeguridad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seguridad</em>' containment reference list.
	 * @see talleruno.GramaticaPackage#getAmbienteDespliegue_Seguridad()
	 * @model containment="true"
	 * @generated
	 */
	EList<MecanismoSeguridad> getSeguridad();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference list.
	 * The list contents are of type {@link talleruno.VPC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference list.
	 * @see talleruno.GramaticaPackage#getAmbienteDespliegue_Vpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<VPC> getVpc();

} // AmbienteDespliegue
