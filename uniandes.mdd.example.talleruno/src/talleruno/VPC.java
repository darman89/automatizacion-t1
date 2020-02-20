/**
 */
package talleruno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talleruno.VPC#getNombre <em>Nombre</em>}</li>
 *   <li>{@link talleruno.VPC#getRecurso <em>Recurso</em>}</li>
 *   <li>{@link talleruno.VPC#getGruposeguridad <em>Gruposeguridad</em>}</li>
 *   <li>{@link talleruno.VPC#getSubred <em>Subred</em>}</li>
 *   <li>{@link talleruno.VPC#getInternetgateway <em>Internetgateway</em>}</li>
 * </ul>
 * </p>
 *
 * @see talleruno.TallerunoPackage#getVPC()
 * @model
 * @generated
 */
public interface VPC extends EObject {
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
	 * @see talleruno.TallerunoPackage#getVPC_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link talleruno.VPC#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Recurso</b></em>' reference list.
	 * The list contents are of type {@link talleruno.Recurso}.
	 * It is bidirectional and its opposite is '{@link talleruno.Recurso#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurso</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso</em>' reference list.
	 * @see talleruno.TallerunoPackage#getVPC_Recurso()
	 * @see talleruno.Recurso#getVpc
	 * @model opposite="vpc" required="true"
	 * @generated
	 */
	EList<Recurso> getRecurso();

	/**
	 * Returns the value of the '<em><b>Gruposeguridad</b></em>' reference list.
	 * The list contents are of type {@link talleruno.GrupoSeguridad}.
	 * It is bidirectional and its opposite is '{@link talleruno.GrupoSeguridad#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gruposeguridad</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gruposeguridad</em>' reference list.
	 * @see talleruno.TallerunoPackage#getVPC_Gruposeguridad()
	 * @see talleruno.GrupoSeguridad#getVpc
	 * @model opposite="vpc"
	 * @generated
	 */
	EList<GrupoSeguridad> getGruposeguridad();

	/**
	 * Returns the value of the '<em><b>Subred</b></em>' reference list.
	 * The list contents are of type {@link talleruno.Subred}.
	 * It is bidirectional and its opposite is '{@link talleruno.Subred#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subred</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subred</em>' reference list.
	 * @see talleruno.TallerunoPackage#getVPC_Subred()
	 * @see talleruno.Subred#getVpc
	 * @model opposite="vpc"
	 * @generated
	 */
	EList<Subred> getSubred();

	/**
	 * Returns the value of the '<em><b>Internetgateway</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link talleruno.InternetGateway#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internetgateway</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internetgateway</em>' reference.
	 * @see #setInternetgateway(InternetGateway)
	 * @see talleruno.TallerunoPackage#getVPC_Internetgateway()
	 * @see talleruno.InternetGateway#getVpc
	 * @model opposite="vpc"
	 * @generated
	 */
	InternetGateway getInternetgateway();

	/**
	 * Sets the value of the '{@link talleruno.VPC#getInternetgateway <em>Internetgateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internetgateway</em>' reference.
	 * @see #getInternetgateway()
	 * @generated
	 */
	void setInternetgateway(InternetGateway value);

} // VPC
