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
 * @see talleruno.TallerunoPackage#getInternetGateway()
 * @model
 * @generated
 */
public interface InternetGateway extends MecanismoSeguridad {
	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link talleruno.VPC#getInternetgateway <em>Internetgateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see talleruno.TallerunoPackage#getInternetGateway_Vpc()
	 * @see talleruno.VPC#getInternetgateway
	 * @model opposite="internetgateway" required="true"
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
