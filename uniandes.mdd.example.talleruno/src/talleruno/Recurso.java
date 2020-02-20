/**
 */
package talleruno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.Recurso#getConexiones <em>Conexiones</em>}</li>
 *   <li>{@link talleruno.Recurso#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.Recurso#getTama�o <em>Tama�o</em>}</li>
 *   <li>{@link talleruno.Recurso#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.TallerunoPackage#getRecurso()
 * @model abstract="true"
 * @generated
 */
public interface Recurso extends EObject {
	/**
	 * Returns the value of the '<em><b>Conexiones</b></em>' reference list.
	 * The list contents are of type {@link talleruno.Conexi�n}.
	 * It is bidirectional and its opposite is '{@link talleruno.Conexi�n#getRecursos <em>Recursos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conexiones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexiones</em>' reference list.
	 * @see talleruno.TallerunoPackage#getRecurso_Conexiones()
	 * @see talleruno.Conexi�n#getRecursos
	 * @model opposite="recursos"
	 * @generated
	 */
	EList<Conexi�n> getConexiones();

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
	 * @see talleruno.TallerunoPackage#getRecurso_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link talleruno.Recurso#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tama�o</b></em>' attribute.
	 * The literals are from the enumeration {@link talleruno.Tama�oServidor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tama�o</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tama�o</em>' attribute.
	 * @see talleruno.Tama�oServidor
	 * @see #setTama�o(Tama�oServidor)
	 * @see talleruno.TallerunoPackage#getRecurso_Tama�o()
	 * @model
	 * @generated
	 */
	Tama�oServidor getTama�o();

	/**
	 * Sets the value of the '{@link talleruno.Recurso#getTama�o <em>Tama�o</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tama�o</em>' attribute.
	 * @see talleruno.Tama�oServidor
	 * @see #getTama�o()
	 * @generated
	 */
	void setTama�o(Tama�oServidor value);

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link talleruno.VPC#getRecurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see talleruno.TallerunoPackage#getRecurso_Vpc()
	 * @see talleruno.VPC#getRecurso
	 * @model opposite="recurso" required="true"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link talleruno.Recurso#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

} // Recurso
