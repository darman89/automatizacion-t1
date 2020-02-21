/**
 */
package talleruno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.Regla#getTipo <em>Tipo</em>}</li>
 *   <li>{@link talleruno.Regla#getProtocolo <em>Protocolo</em>}</li>
 *   <li>{@link talleruno.Regla#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link talleruno.Regla#getOrigen <em>Origen</em>}</li>
 *   <li>{@link talleruno.Regla#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getRegla()
 * @model
 * @generated
 */
public interface Regla extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see talleruno.GramaticaPackage#getRegla_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link talleruno.Regla#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Protocolo</b></em>' attribute.
	 * The literals are from the enumeration {@link talleruno.Protocolo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocolo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocolo</em>' attribute.
	 * @see talleruno.Protocolo
	 * @see #setProtocolo(Protocolo)
	 * @see talleruno.GramaticaPackage#getRegla_Protocolo()
	 * @model
	 * @generated
	 */
	Protocolo getProtocolo();

	/**
	 * Sets the value of the '{@link talleruno.Regla#getProtocolo <em>Protocolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocolo</em>' attribute.
	 * @see talleruno.Protocolo
	 * @see #getProtocolo()
	 * @generated
	 */
	void setProtocolo(Protocolo value);

	/**
	 * Returns the value of the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puerto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puerto</em>' attribute.
	 * @see #setPuerto(int)
	 * @see talleruno.GramaticaPackage#getRegla_Puerto()
	 * @model
	 * @generated
	 */
	int getPuerto();

	/**
	 * Sets the value of the '{@link talleruno.Regla#getPuerto <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puerto</em>' attribute.
	 * @see #getPuerto()
	 * @generated
	 */
	void setPuerto(int value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' attribute.
	 * @see #setOrigen(String)
	 * @see talleruno.GramaticaPackage#getRegla_Origen()
	 * @model
	 * @generated
	 */
	String getOrigen();

	/**
	 * Sets the value of the '{@link talleruno.Regla#getOrigen <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' attribute.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(String value);

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
	 * @see talleruno.GramaticaPackage#getRegla_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link talleruno.Regla#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // Regla
