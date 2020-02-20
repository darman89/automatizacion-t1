/**
 */
package talleruno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conexi�n</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.Conexi�n#getRecursos <em>Recursos</em>}</li>
 *   <li>{@link talleruno.Conexi�n#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.TallerunoPackage#getConexi�n()
 * @model
 * @generated
 */
public interface Conexi�n extends EObject {
	/**
	 * Returns the value of the '<em><b>Recursos</b></em>' reference list.
	 * The list contents are of type {@link talleruno.Recurso}.
	 * It is bidirectional and its opposite is '{@link talleruno.Recurso#getConexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursos</em>' reference list.
	 * @see talleruno.TallerunoPackage#getConexi�n_Recursos()
	 * @see talleruno.Recurso#getConexiones
	 * @model opposite="conexiones" lower="2" upper="2"
	 * @generated
	 */
	EList<Recurso> getRecursos();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see talleruno.TallerunoPackage#getConexi�n_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link talleruno.Conexi�n#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Conexi�n
