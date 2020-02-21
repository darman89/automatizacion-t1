/**
 */
package talleruno;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subred</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.Subred#getCIDR <em>CIDR</em>}</li>
 *   <li>{@link talleruno.Subred#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 *   <li>{@link talleruno.Subred#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getSubred()
 * @model
 * @generated
 */
public interface Subred extends MecanismoSeguridad {
	/**
	 * Returns the value of the '<em><b>CIDR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CIDR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CIDR</em>' attribute.
	 * @see #setCIDR(String)
	 * @see talleruno.GramaticaPackage#getSubred_CIDR()
	 * @model
	 * @generated
	 */
	String getCIDR();

	/**
	 * Sets the value of the '{@link talleruno.Subred#getCIDR <em>CIDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CIDR</em>' attribute.
	 * @see #getCIDR()
	 * @generated
	 */
	void setCIDR(String value);

	/**
	 * Returns the value of the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zona Disponibilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #setZonaDisponibilidad(String)
	 * @see talleruno.GramaticaPackage#getSubred_ZonaDisponibilidad()
	 * @model
	 * @generated
	 */
	String getZonaDisponibilidad();

	/**
	 * Sets the value of the '{@link talleruno.Subred#getZonaDisponibilidad <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #getZonaDisponibilidad()
	 * @generated
	 */
	void setZonaDisponibilidad(String value);

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link talleruno.VPC#getSubred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see talleruno.GramaticaPackage#getSubred_Vpc()
	 * @see talleruno.VPC#getSubred
	 * @model opposite="subred" required="true"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link talleruno.Subred#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

} // Subred
