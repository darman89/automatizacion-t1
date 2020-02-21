/**
 */
package talleruno;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see talleruno.GramaticaPackage
 * @generated
 */
public interface GramaticaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GramaticaFactory eINSTANCE = talleruno.impl.GramaticaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Proveedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proveedor</em>'.
	 * @generated
	 */
	Proveedor createProveedor();

	/**
	 * Returns a new object of class '<em>Usuario Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuario Password</em>'.
	 * @generated
	 */
	UsuarioPassword createUsuarioPassword();

	/**
	 * Returns a new object of class '<em>Llave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Llave</em>'.
	 * @generated
	 */
	Llave createLlave();

	/**
	 * Returns a new object of class '<em>Ambiente Despliegue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ambiente Despliegue</em>'.
	 * @generated
	 */
	AmbienteDespliegue createAmbienteDespliegue();

	/**
	 * Returns a new object of class '<em>Servidor Aplicaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor Aplicaciones</em>'.
	 * @generated
	 */
	ServidorAplicaciones createServidorAplicaciones();

	/**
	 * Returns a new object of class '<em>Servidor Almacenamiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor Almacenamiento</em>'.
	 * @generated
	 */
	ServidorAlmacenamiento createServidorAlmacenamiento();

	/**
	 * Returns a new object of class '<em>Conexion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conexion</em>'.
	 * @generated
	 */
	Conexion createConexion();

	/**
	 * Returns a new object of class '<em>Base Datos SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Datos SQL</em>'.
	 * @generated
	 */
	BaseDatosSQL createBaseDatosSQL();

	/**
	 * Returns a new object of class '<em>Base Datos No SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Datos No SQL</em>'.
	 * @generated
	 */
	BaseDatosNoSQL createBaseDatosNoSQL();

	/**
	 * Returns a new object of class '<em>Internet Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internet Gateway</em>'.
	 * @generated
	 */
	InternetGateway createInternetGateway();

	/**
	 * Returns a new object of class '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPC</em>'.
	 * @generated
	 */
	VPC createVPC();

	/**
	 * Returns a new object of class '<em>Subred</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subred</em>'.
	 * @generated
	 */
	Subred createSubred();

	/**
	 * Returns a new object of class '<em>Grupo Seguridad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grupo Seguridad</em>'.
	 * @generated
	 */
	GrupoSeguridad createGrupoSeguridad();

	/**
	 * Returns a new object of class '<em>Regla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regla</em>'.
	 * @generated
	 */
	Regla createRegla();

	/**
	 * Returns a new object of class '<em>Infraestructura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infraestructura</em>'.
	 * @generated
	 */
	Infraestructura createInfraestructura();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GramaticaPackage getGramaticaPackage();

} //GramaticaFactory
