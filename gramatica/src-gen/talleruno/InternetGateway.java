/**
 */
package talleruno;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internet Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.InternetGateway#getVpc <em>Vpc</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.GramaticaPackage#getInternetGateway()
 * @model
 * @generated
 */
public interface InternetGateway extends MecanismoSeguridad {
	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see talleruno.GramaticaPackage#getInternetGateway_Vpc()
	 * @model required="true"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link talleruno.InternetGateway#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

} // InternetGateway
