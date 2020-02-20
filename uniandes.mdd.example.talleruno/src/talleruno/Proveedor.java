/**
 */
package talleruno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proveedor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.Proveedor#getParámetroConexión <em>Parámetro Conexión</em>}</li>
 *   <li>{@link talleruno.Proveedor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.Proveedor#getAmbientesDespliegue <em>Ambientes Despliegue</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.TallerunoPackage#getProveedor()
 * @model
 * @generated
 */
public interface Proveedor extends EObject {
	/**
	 * Returns the value of the '<em><b>Parámetro Conexión</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parámetro Conexión</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parámetro Conexión</em>' containment reference.
	 * @see #setParámetroConexión(ParámetroConexión)
	 * @see talleruno.TallerunoPackage#getProveedor_ParámetroConexión()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParámetroConexión getParámetroConexión();

	/**
	 * Sets the value of the '{@link talleruno.Proveedor#getParámetroConexión <em>Parámetro Conexión</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parámetro Conexión</em>' containment reference.
	 * @see #getParámetroConexión()
	 * @generated
	 */
	void setParámetroConexión(ParámetroConexión value);

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
	 * @see talleruno.TallerunoPackage#getProveedor_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link talleruno.Proveedor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ambientes Despliegue</b></em>' containment reference list.
	 * The list contents are of type {@link talleruno.AmbienteDespliegue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambientes Despliegue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambientes Despliegue</em>' containment reference list.
	 * @see talleruno.TallerunoPackage#getProveedor_AmbientesDespliegue()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmbienteDespliegue> getAmbientesDespliegue();

} // Proveedor
