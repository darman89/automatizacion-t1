/**
 */
package talleruno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infraestructura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.Infraestructura#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.Infraestructura#getProveedor <em>Proveedor</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.TallerunoPackage#getInfraestructura()
 * @model
 * @generated
 */
public interface Infraestructura extends EObject {
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
	 * @see talleruno.TallerunoPackage#getInfraestructura_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link talleruno.Infraestructura#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Proveedor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proveedor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proveedor</em>' reference.
	 * @see #setProveedor(Proveedor)
	 * @see talleruno.TallerunoPackage#getInfraestructura_Proveedor()
	 * @model required="true"
	 * @generated
	 */
	Proveedor getProveedor();

	/**
	 * Sets the value of the '{@link talleruno.Infraestructura#getProveedor <em>Proveedor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proveedor</em>' reference.
	 * @see #getProveedor()
	 * @generated
	 */
	void setProveedor(Proveedor value);

} // Infraestructura
