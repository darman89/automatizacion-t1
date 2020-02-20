/**
 */
package talleruno;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see talleruno.TallerunoFactory
 * @model kind="package"
 * @generated
 */
public interface TallerunoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "talleruno";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "talleruno";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "talleruno";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TallerunoPackage eINSTANCE = talleruno.impl.TallerunoPackageImpl.init();

	/**
	 * The meta object id for the '{@link talleruno.impl.ProveedorImpl <em>Proveedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.ProveedorImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getProveedor()
	 * @generated
	 */
	int PROVEEDOR = 0;

	/**
	 * The feature id for the '<em><b>Parámetro Conexión</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__PARÁMETRO_CONEXIÓN = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Ambientes Despliegue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__AMBIENTES_DESPLIEGUE = 2;

	/**
	 * The number of structural features of the '<em>Proveedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Proveedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.ParámetroConexiónImpl <em>Parámetro Conexión</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.ParámetroConexiónImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getParámetroConexión()
	 * @generated
	 */
	int PARÁMETRO_CONEXIÓN = 1;

	/**
	 * The number of structural features of the '<em>Parámetro Conexión</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARÁMETRO_CONEXIÓN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parámetro Conexión</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARÁMETRO_CONEXIÓN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.UsuarioContraseñaImpl <em>Usuario Contraseña</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.UsuarioContraseñaImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getUsuarioContraseña()
	 * @generated
	 */
	int USUARIO_CONTRASEÑA = 2;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_CONTRASEÑA__USUARIO = PARÁMETRO_CONEXIÓN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contraseña</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_CONTRASEÑA__CONTRASEÑA = PARÁMETRO_CONEXIÓN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usuario Contraseña</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_CONTRASEÑA_FEATURE_COUNT = PARÁMETRO_CONEXIÓN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Usuario Contraseña</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_CONTRASEÑA_OPERATION_COUNT = PARÁMETRO_CONEXIÓN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.LlaveImpl <em>Llave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.LlaveImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getLlave()
	 * @generated
	 */
	int LLAVE = 3;

	/**
	 * The feature id for the '<em><b>Secreto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAVE__SECRETO = PARÁMETRO_CONEXIÓN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Llave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAVE_FEATURE_COUNT = PARÁMETRO_CONEXIÓN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Llave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAVE_OPERATION_COUNT = PARÁMETRO_CONEXIÓN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.AmbienteDespliegueImpl <em>Ambiente Despliegue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.AmbienteDespliegueImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getAmbienteDespliegue()
	 * @generated
	 */
	int AMBIENTE_DESPLIEGUE = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE__RECURSOS = 1;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE__CONEXIONES = 2;

	/**
	 * The feature id for the '<em><b>Seguridad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE__SEGURIDAD = 3;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE__VPC = 4;

	/**
	 * The number of structural features of the '<em>Ambiente Despliegue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ambiente Despliegue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.RecursoImpl <em>Recurso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.RecursoImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getRecurso()
	 * @generated
	 */
	int RECURSO = 5;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__CONEXIONES = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Tamaño</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__TAMAÑO = 2;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__VPC = 3;

	/**
	 * The number of structural features of the '<em>Recurso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Recurso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.ServidorAplicacionesImpl <em>Servidor Aplicaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.ServidorAplicacionesImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getServidorAplicaciones()
	 * @generated
	 */
	int SERVIDOR_APLICACIONES = 6;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__CONEXIONES = RECURSO__CONEXIONES;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__NOMBRE = RECURSO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__TAMAÑO = RECURSO__TAMAÑO;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__VPC = RECURSO__VPC;

	/**
	 * The feature id for the '<em><b>Sistema Operativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__SISTEMA_OPERATIVO = RECURSO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servidor Aplicaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES_FEATURE_COUNT = RECURSO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Servidor Aplicaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES_OPERATION_COUNT = RECURSO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.ServidorBaseDatosImpl <em>Servidor Base Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.ServidorBaseDatosImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getServidorBaseDatos()
	 * @generated
	 */
	int SERVIDOR_BASE_DATOS = 7;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DATOS__CONEXIONES = RECURSO__CONEXIONES;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DATOS__NOMBRE = RECURSO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DATOS__TAMAÑO = RECURSO__TAMAÑO;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DATOS__VPC = RECURSO__VPC;

	/**
	 * The number of structural features of the '<em>Servidor Base Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DATOS_FEATURE_COUNT = RECURSO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Servidor Base Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DATOS_OPERATION_COUNT = RECURSO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.ServidorAlmacenamientoImpl <em>Servidor Almacenamiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.ServidorAlmacenamientoImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getServidorAlmacenamiento()
	 * @generated
	 */
	int SERVIDOR_ALMACENAMIENTO = 8;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__CONEXIONES = RECURSO__CONEXIONES;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__NOMBRE = RECURSO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__TAMAÑO = RECURSO__TAMAÑO;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__VPC = RECURSO__VPC;

	/**
	 * The feature id for the '<em><b>Tamanio Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL = RECURSO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servidor Almacenamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO_FEATURE_COUNT = RECURSO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Servidor Almacenamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO_OPERATION_COUNT = RECURSO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.ConexiónImpl <em>Conexión</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.ConexiónImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getConexión()
	 * @generated
	 */
	int CONEXIÓN = 9;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXIÓN__RECURSOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXIÓN__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Conexión</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXIÓN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conexión</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXIÓN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.BaseDatosSQLImpl <em>Base Datos SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.BaseDatosSQLImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getBaseDatosSQL()
	 * @generated
	 */
	int BASE_DATOS_SQL = 10;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_SQL__CONEXIONES = SERVIDOR_BASE_DATOS__CONEXIONES;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_SQL__NOMBRE = SERVIDOR_BASE_DATOS__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_SQL__TAMAÑO = SERVIDOR_BASE_DATOS__TAMAÑO;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_SQL__VPC = SERVIDOR_BASE_DATOS__VPC;

	/**
	 * The feature id for the '<em><b>Manejador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_SQL__MANEJADOR = SERVIDOR_BASE_DATOS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Datos SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_SQL_FEATURE_COUNT = SERVIDOR_BASE_DATOS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Datos SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_SQL_OPERATION_COUNT = SERVIDOR_BASE_DATOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.BaseDatosNoSQLImpl <em>Base Datos No SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.BaseDatosNoSQLImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getBaseDatosNoSQL()
	 * @generated
	 */
	int BASE_DATOS_NO_SQL = 11;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_NO_SQL__CONEXIONES = SERVIDOR_BASE_DATOS__CONEXIONES;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_NO_SQL__NOMBRE = SERVIDOR_BASE_DATOS__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_NO_SQL__TAMAÑO = SERVIDOR_BASE_DATOS__TAMAÑO;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_NO_SQL__VPC = SERVIDOR_BASE_DATOS__VPC;

	/**
	 * The feature id for the '<em><b>Manejador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_NO_SQL__MANEJADOR = SERVIDOR_BASE_DATOS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Datos No SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_NO_SQL_FEATURE_COUNT = SERVIDOR_BASE_DATOS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Datos No SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_NO_SQL_OPERATION_COUNT = SERVIDOR_BASE_DATOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.MecanismoSeguridadImpl <em>Mecanismo Seguridad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.MecanismoSeguridadImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getMecanismoSeguridad()
	 * @generated
	 */
	int MECANISMO_SEGURIDAD = 17;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Mecanismo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mecanismo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.InternetGatewayImpl <em>Internet Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.InternetGatewayImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getInternetGateway()
	 * @generated
	 */
	int INTERNET_GATEWAY = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__NOMBRE = MECANISMO_SEGURIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__VPC = MECANISMO_SEGURIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internet Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY_FEATURE_COUNT = MECANISMO_SEGURIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Internet Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY_OPERATION_COUNT = MECANISMO_SEGURIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.VPCImpl <em>VPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.VPCImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getVPC()
	 * @generated
	 */
	int VPC = 13;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Recurso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__RECURSO = 1;

	/**
	 * The feature id for the '<em><b>Gruposeguridad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__GRUPOSEGURIDAD = 2;

	/**
	 * The feature id for the '<em><b>Subred</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__SUBRED = 3;

	/**
	 * The feature id for the '<em><b>Internetgateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__INTERNETGATEWAY = 4;

	/**
	 * The number of structural features of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.SubredImpl <em>Subred</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.SubredImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getSubred()
	 * @generated
	 */
	int SUBRED = 14;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__NOMBRE = MECANISMO_SEGURIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>CIDR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__CIDR = MECANISMO_SEGURIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__ZONA_DISPONIBILIDAD = MECANISMO_SEGURIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__VPC = MECANISMO_SEGURIDAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subred</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED_FEATURE_COUNT = MECANISMO_SEGURIDAD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Subred</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED_OPERATION_COUNT = MECANISMO_SEGURIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.GrupoSeguridadImpl <em>Grupo Seguridad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.GrupoSeguridadImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getGrupoSeguridad()
	 * @generated
	 */
	int GRUPO_SEGURIDAD = 15;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__NOMBRE = MECANISMO_SEGURIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Reglas Entrada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__REGLAS_ENTRADA = MECANISMO_SEGURIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reglas Salida</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__REGLAS_SALIDA = MECANISMO_SEGURIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descripción</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__DESCRIPCIÓN = MECANISMO_SEGURIDAD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__VPC = MECANISMO_SEGURIDAD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grupo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD_FEATURE_COUNT = MECANISMO_SEGURIDAD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Grupo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD_OPERATION_COUNT = MECANISMO_SEGURIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.ReglaImpl <em>Regla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.ReglaImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getRegla()
	 * @generated
	 */
	int REGLA = 16;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Protocolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__PROTOCOLO = 1;

	/**
	 * The feature id for the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__PUERTO = 2;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__ORIGEN = 3;

	/**
	 * The feature id for the '<em><b>Descripción</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__DESCRIPCIÓN = 4;

	/**
	 * The number of structural features of the '<em>Regla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Regla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.impl.InfraestructuraImpl <em>Infraestructura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.impl.InfraestructuraImpl
	 * @see talleruno.impl.TallerunoPackageImpl#getInfraestructura()
	 * @generated
	 */
	int INFRAESTRUCTURA = 18;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Proveedor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__PROVEEDOR = 1;

	/**
	 * The number of structural features of the '<em>Infraestructura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Infraestructura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link talleruno.NombreAmbiente <em>Nombre Ambiente</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.NombreAmbiente
	 * @see talleruno.impl.TallerunoPackageImpl#getNombreAmbiente()
	 * @generated
	 */
	int NOMBRE_AMBIENTE = 19;

	/**
	 * The meta object id for the '{@link talleruno.TamañoServidor <em>Tamaño Servidor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.TamañoServidor
	 * @see talleruno.impl.TallerunoPackageImpl#getTamañoServidor()
	 * @generated
	 */
	int TAMAÑO_SERVIDOR = 20;

	/**
	 * The meta object id for the '{@link talleruno.SistemaOperativo <em>Sistema Operativo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.SistemaOperativo
	 * @see talleruno.impl.TallerunoPackageImpl#getSistemaOperativo()
	 * @generated
	 */
	int SISTEMA_OPERATIVO = 21;

	/**
	 * The meta object id for the '{@link talleruno.ManejadorNoSQL <em>Manejador No SQL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.ManejadorNoSQL
	 * @see talleruno.impl.TallerunoPackageImpl#getManejadorNoSQL()
	 * @generated
	 */
	int MANEJADOR_NO_SQL = 22;

	/**
	 * The meta object id for the '{@link talleruno.ManejadorSQL <em>Manejador SQL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.ManejadorSQL
	 * @see talleruno.impl.TallerunoPackageImpl#getManejadorSQL()
	 * @generated
	 */
	int MANEJADOR_SQL = 23;

	/**
	 * The meta object id for the '{@link talleruno.Protocolo <em>Protocolo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see talleruno.Protocolo
	 * @see talleruno.impl.TallerunoPackageImpl#getProtocolo()
	 * @generated
	 */
	int PROTOCOLO = 24;


	/**
	 * Returns the meta object for class '{@link talleruno.Proveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proveedor</em>'.
	 * @see talleruno.Proveedor
	 * @generated
	 */
	EClass getProveedor();

	/**
	 * Returns the meta object for the containment reference '{@link talleruno.Proveedor#getParámetroConexión <em>Parámetro Conexión</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parámetro Conexión</em>'.
	 * @see talleruno.Proveedor#getParámetroConexión()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_ParámetroConexión();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Proveedor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see talleruno.Proveedor#getNombre()
	 * @see #getProveedor()
	 * @generated
	 */
	EAttribute getProveedor_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link talleruno.Proveedor#getAmbientesDespliegue <em>Ambientes Despliegue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ambientes Despliegue</em>'.
	 * @see talleruno.Proveedor#getAmbientesDespliegue()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_AmbientesDespliegue();

	/**
	 * Returns the meta object for class '{@link talleruno.ParámetroConexión <em>Parámetro Conexión</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parámetro Conexión</em>'.
	 * @see talleruno.ParámetroConexión
	 * @generated
	 */
	EClass getParámetroConexión();

	/**
	 * Returns the meta object for class '{@link talleruno.UsuarioContraseña <em>Usuario Contraseña</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario Contraseña</em>'.
	 * @see talleruno.UsuarioContraseña
	 * @generated
	 */
	EClass getUsuarioContraseña();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.UsuarioContraseña#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see talleruno.UsuarioContraseña#getUsuario()
	 * @see #getUsuarioContraseña()
	 * @generated
	 */
	EAttribute getUsuarioContraseña_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.UsuarioContraseña#getContraseña <em>Contraseña</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contraseña</em>'.
	 * @see talleruno.UsuarioContraseña#getContraseña()
	 * @see #getUsuarioContraseña()
	 * @generated
	 */
	EAttribute getUsuarioContraseña_Contraseña();

	/**
	 * Returns the meta object for class '{@link talleruno.Llave <em>Llave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Llave</em>'.
	 * @see talleruno.Llave
	 * @generated
	 */
	EClass getLlave();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Llave#getSecreto <em>Secreto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secreto</em>'.
	 * @see talleruno.Llave#getSecreto()
	 * @see #getLlave()
	 * @generated
	 */
	EAttribute getLlave_Secreto();

	/**
	 * Returns the meta object for class '{@link talleruno.AmbienteDespliegue <em>Ambiente Despliegue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambiente Despliegue</em>'.
	 * @see talleruno.AmbienteDespliegue
	 * @generated
	 */
	EClass getAmbienteDespliegue();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.AmbienteDespliegue#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see talleruno.AmbienteDespliegue#getNombre()
	 * @see #getAmbienteDespliegue()
	 * @generated
	 */
	EAttribute getAmbienteDespliegue_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link talleruno.AmbienteDespliegue#getRecursos <em>Recursos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recursos</em>'.
	 * @see talleruno.AmbienteDespliegue#getRecursos()
	 * @see #getAmbienteDespliegue()
	 * @generated
	 */
	EReference getAmbienteDespliegue_Recursos();

	/**
	 * Returns the meta object for the containment reference list '{@link talleruno.AmbienteDespliegue#getConexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conexiones</em>'.
	 * @see talleruno.AmbienteDespliegue#getConexiones()
	 * @see #getAmbienteDespliegue()
	 * @generated
	 */
	EReference getAmbienteDespliegue_Conexiones();

	/**
	 * Returns the meta object for the containment reference list '{@link talleruno.AmbienteDespliegue#getSeguridad <em>Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seguridad</em>'.
	 * @see talleruno.AmbienteDespliegue#getSeguridad()
	 * @see #getAmbienteDespliegue()
	 * @generated
	 */
	EReference getAmbienteDespliegue_Seguridad();

	/**
	 * Returns the meta object for the containment reference list '{@link talleruno.AmbienteDespliegue#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpc</em>'.
	 * @see talleruno.AmbienteDespliegue#getVpc()
	 * @see #getAmbienteDespliegue()
	 * @generated
	 */
	EReference getAmbienteDespliegue_Vpc();

	/**
	 * Returns the meta object for class '{@link talleruno.Recurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurso</em>'.
	 * @see talleruno.Recurso
	 * @generated
	 */
	EClass getRecurso();

	/**
	 * Returns the meta object for the reference list '{@link talleruno.Recurso#getConexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conexiones</em>'.
	 * @see talleruno.Recurso#getConexiones()
	 * @see #getRecurso()
	 * @generated
	 */
	EReference getRecurso_Conexiones();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Recurso#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see talleruno.Recurso#getNombre()
	 * @see #getRecurso()
	 * @generated
	 */
	EAttribute getRecurso_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Recurso#getTamaño <em>Tamaño</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamaño</em>'.
	 * @see talleruno.Recurso#getTamaño()
	 * @see #getRecurso()
	 * @generated
	 */
	EAttribute getRecurso_Tamaño();

	/**
	 * Returns the meta object for the reference '{@link talleruno.Recurso#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vpc</em>'.
	 * @see talleruno.Recurso#getVpc()
	 * @see #getRecurso()
	 * @generated
	 */
	EReference getRecurso_Vpc();

	/**
	 * Returns the meta object for class '{@link talleruno.ServidorAplicaciones <em>Servidor Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor Aplicaciones</em>'.
	 * @see talleruno.ServidorAplicaciones
	 * @generated
	 */
	EClass getServidorAplicaciones();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.ServidorAplicaciones#getSistemaOperativo <em>Sistema Operativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sistema Operativo</em>'.
	 * @see talleruno.ServidorAplicaciones#getSistemaOperativo()
	 * @see #getServidorAplicaciones()
	 * @generated
	 */
	EAttribute getServidorAplicaciones_SistemaOperativo();

	/**
	 * Returns the meta object for class '{@link talleruno.ServidorBaseDatos <em>Servidor Base Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor Base Datos</em>'.
	 * @see talleruno.ServidorBaseDatos
	 * @generated
	 */
	EClass getServidorBaseDatos();

	/**
	 * Returns the meta object for class '{@link talleruno.ServidorAlmacenamiento <em>Servidor Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor Almacenamiento</em>'.
	 * @see talleruno.ServidorAlmacenamiento
	 * @generated
	 */
	EClass getServidorAlmacenamiento();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.ServidorAlmacenamiento#getTamanioInicial <em>Tamanio Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamanio Inicial</em>'.
	 * @see talleruno.ServidorAlmacenamiento#getTamanioInicial()
	 * @see #getServidorAlmacenamiento()
	 * @generated
	 */
	EAttribute getServidorAlmacenamiento_TamanioInicial();

	/**
	 * Returns the meta object for class '{@link talleruno.Conexión <em>Conexión</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conexión</em>'.
	 * @see talleruno.Conexión
	 * @generated
	 */
	EClass getConexión();

	/**
	 * Returns the meta object for the reference list '{@link talleruno.Conexión#getRecursos <em>Recursos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recursos</em>'.
	 * @see talleruno.Conexión#getRecursos()
	 * @see #getConexión()
	 * @generated
	 */
	EReference getConexión_Recursos();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Conexión#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see talleruno.Conexión#getNombre()
	 * @see #getConexión()
	 * @generated
	 */
	EAttribute getConexión_Nombre();

	/**
	 * Returns the meta object for class '{@link talleruno.BaseDatosSQL <em>Base Datos SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Datos SQL</em>'.
	 * @see talleruno.BaseDatosSQL
	 * @generated
	 */
	EClass getBaseDatosSQL();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.BaseDatosSQL#getManejador <em>Manejador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manejador</em>'.
	 * @see talleruno.BaseDatosSQL#getManejador()
	 * @see #getBaseDatosSQL()
	 * @generated
	 */
	EAttribute getBaseDatosSQL_Manejador();

	/**
	 * Returns the meta object for class '{@link talleruno.BaseDatosNoSQL <em>Base Datos No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Datos No SQL</em>'.
	 * @see talleruno.BaseDatosNoSQL
	 * @generated
	 */
	EClass getBaseDatosNoSQL();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.BaseDatosNoSQL#getManejador <em>Manejador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manejador</em>'.
	 * @see talleruno.BaseDatosNoSQL#getManejador()
	 * @see #getBaseDatosNoSQL()
	 * @generated
	 */
	EAttribute getBaseDatosNoSQL_Manejador();

	/**
	 * Returns the meta object for class '{@link talleruno.InternetGateway <em>Internet Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internet Gateway</em>'.
	 * @see talleruno.InternetGateway
	 * @generated
	 */
	EClass getInternetGateway();

	/**
	 * Returns the meta object for the reference '{@link talleruno.InternetGateway#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vpc</em>'.
	 * @see talleruno.InternetGateway#getVpc()
	 * @see #getInternetGateway()
	 * @generated
	 */
	EReference getInternetGateway_Vpc();

	/**
	 * Returns the meta object for class '{@link talleruno.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPC</em>'.
	 * @see talleruno.VPC
	 * @generated
	 */
	EClass getVPC();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.VPC#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see talleruno.VPC#getNombre()
	 * @see #getVPC()
	 * @generated
	 */
	EAttribute getVPC_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link talleruno.VPC#getRecurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recurso</em>'.
	 * @see talleruno.VPC#getRecurso()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Recurso();

	/**
	 * Returns the meta object for the reference list '{@link talleruno.VPC#getGruposeguridad <em>Gruposeguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gruposeguridad</em>'.
	 * @see talleruno.VPC#getGruposeguridad()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Gruposeguridad();

	/**
	 * Returns the meta object for the reference list '{@link talleruno.VPC#getSubred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subred</em>'.
	 * @see talleruno.VPC#getSubred()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Subred();

	/**
	 * Returns the meta object for the reference '{@link talleruno.VPC#getInternetgateway <em>Internetgateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internetgateway</em>'.
	 * @see talleruno.VPC#getInternetgateway()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Internetgateway();

	/**
	 * Returns the meta object for class '{@link talleruno.Subred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subred</em>'.
	 * @see talleruno.Subred
	 * @generated
	 */
	EClass getSubred();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Subred#getCIDR <em>CIDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CIDR</em>'.
	 * @see talleruno.Subred#getCIDR()
	 * @see #getSubred()
	 * @generated
	 */
	EAttribute getSubred_CIDR();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Subred#getZonaDisponibilidad <em>Zona Disponibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zona Disponibilidad</em>'.
	 * @see talleruno.Subred#getZonaDisponibilidad()
	 * @see #getSubred()
	 * @generated
	 */
	EAttribute getSubred_ZonaDisponibilidad();

	/**
	 * Returns the meta object for the reference '{@link talleruno.Subred#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vpc</em>'.
	 * @see talleruno.Subred#getVpc()
	 * @see #getSubred()
	 * @generated
	 */
	EReference getSubred_Vpc();

	/**
	 * Returns the meta object for class '{@link talleruno.GrupoSeguridad <em>Grupo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grupo Seguridad</em>'.
	 * @see talleruno.GrupoSeguridad
	 * @generated
	 */
	EClass getGrupoSeguridad();

	/**
	 * Returns the meta object for the containment reference list '{@link talleruno.GrupoSeguridad#getReglasEntrada <em>Reglas Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reglas Entrada</em>'.
	 * @see talleruno.GrupoSeguridad#getReglasEntrada()
	 * @see #getGrupoSeguridad()
	 * @generated
	 */
	EReference getGrupoSeguridad_ReglasEntrada();

	/**
	 * Returns the meta object for the containment reference list '{@link talleruno.GrupoSeguridad#getReglasSalida <em>Reglas Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reglas Salida</em>'.
	 * @see talleruno.GrupoSeguridad#getReglasSalida()
	 * @see #getGrupoSeguridad()
	 * @generated
	 */
	EReference getGrupoSeguridad_ReglasSalida();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.GrupoSeguridad#getDescripción <em>Descripción</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripción</em>'.
	 * @see talleruno.GrupoSeguridad#getDescripción()
	 * @see #getGrupoSeguridad()
	 * @generated
	 */
	EAttribute getGrupoSeguridad_Descripción();

	/**
	 * Returns the meta object for the reference '{@link talleruno.GrupoSeguridad#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vpc</em>'.
	 * @see talleruno.GrupoSeguridad#getVpc()
	 * @see #getGrupoSeguridad()
	 * @generated
	 */
	EReference getGrupoSeguridad_Vpc();

	/**
	 * Returns the meta object for class '{@link talleruno.Regla <em>Regla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regla</em>'.
	 * @see talleruno.Regla
	 * @generated
	 */
	EClass getRegla();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Regla#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see talleruno.Regla#getTipo()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Regla#getProtocolo <em>Protocolo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocolo</em>'.
	 * @see talleruno.Regla#getProtocolo()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Protocolo();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Regla#getPuerto <em>Puerto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puerto</em>'.
	 * @see talleruno.Regla#getPuerto()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Puerto();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Regla#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see talleruno.Regla#getOrigen()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Origen();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Regla#getDescripción <em>Descripción</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripción</em>'.
	 * @see talleruno.Regla#getDescripción()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Descripción();

	/**
	 * Returns the meta object for class '{@link talleruno.MecanismoSeguridad <em>Mecanismo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mecanismo Seguridad</em>'.
	 * @see talleruno.MecanismoSeguridad
	 * @generated
	 */
	EClass getMecanismoSeguridad();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.MecanismoSeguridad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see talleruno.MecanismoSeguridad#getNombre()
	 * @see #getMecanismoSeguridad()
	 * @generated
	 */
	EAttribute getMecanismoSeguridad_Nombre();

	/**
	 * Returns the meta object for class '{@link talleruno.Infraestructura <em>Infraestructura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infraestructura</em>'.
	 * @see talleruno.Infraestructura
	 * @generated
	 */
	EClass getInfraestructura();

	/**
	 * Returns the meta object for the attribute '{@link talleruno.Infraestructura#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see talleruno.Infraestructura#getNombre()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EAttribute getInfraestructura_Nombre();

	/**
	 * Returns the meta object for the reference '{@link talleruno.Infraestructura#getProveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proveedor</em>'.
	 * @see talleruno.Infraestructura#getProveedor()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EReference getInfraestructura_Proveedor();

	/**
	 * Returns the meta object for enum '{@link talleruno.NombreAmbiente <em>Nombre Ambiente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nombre Ambiente</em>'.
	 * @see talleruno.NombreAmbiente
	 * @generated
	 */
	EEnum getNombreAmbiente();

	/**
	 * Returns the meta object for enum '{@link talleruno.TamañoServidor <em>Tamaño Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tamaño Servidor</em>'.
	 * @see talleruno.TamañoServidor
	 * @generated
	 */
	EEnum getTamañoServidor();

	/**
	 * Returns the meta object for enum '{@link talleruno.SistemaOperativo <em>Sistema Operativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sistema Operativo</em>'.
	 * @see talleruno.SistemaOperativo
	 * @generated
	 */
	EEnum getSistemaOperativo();

	/**
	 * Returns the meta object for enum '{@link talleruno.ManejadorNoSQL <em>Manejador No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manejador No SQL</em>'.
	 * @see talleruno.ManejadorNoSQL
	 * @generated
	 */
	EEnum getManejadorNoSQL();

	/**
	 * Returns the meta object for enum '{@link talleruno.ManejadorSQL <em>Manejador SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manejador SQL</em>'.
	 * @see talleruno.ManejadorSQL
	 * @generated
	 */
	EEnum getManejadorSQL();

	/**
	 * Returns the meta object for enum '{@link talleruno.Protocolo <em>Protocolo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocolo</em>'.
	 * @see talleruno.Protocolo
	 * @generated
	 */
	EEnum getProtocolo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TallerunoFactory getTallerunoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link talleruno.impl.ProveedorImpl <em>Proveedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.ProveedorImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getProveedor()
		 * @generated
		 */
		EClass PROVEEDOR = eINSTANCE.getProveedor();

		/**
		 * The meta object literal for the '<em><b>Parámetro Conexión</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__PARÁMETRO_CONEXIÓN = eINSTANCE.getProveedor_ParámetroConexión();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVEEDOR__NOMBRE = eINSTANCE.getProveedor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ambientes Despliegue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__AMBIENTES_DESPLIEGUE = eINSTANCE.getProveedor_AmbientesDespliegue();

		/**
		 * The meta object literal for the '{@link talleruno.impl.ParámetroConexiónImpl <em>Parámetro Conexión</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.ParámetroConexiónImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getParámetroConexión()
		 * @generated
		 */
		EClass PARÁMETRO_CONEXIÓN = eINSTANCE.getParámetroConexión();

		/**
		 * The meta object literal for the '{@link talleruno.impl.UsuarioContraseñaImpl <em>Usuario Contraseña</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.UsuarioContraseñaImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getUsuarioContraseña()
		 * @generated
		 */
		EClass USUARIO_CONTRASEÑA = eINSTANCE.getUsuarioContraseña();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO_CONTRASEÑA__USUARIO = eINSTANCE.getUsuarioContraseña_Usuario();

		/**
		 * The meta object literal for the '<em><b>Contraseña</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO_CONTRASEÑA__CONTRASEÑA = eINSTANCE.getUsuarioContraseña_Contraseña();

		/**
		 * The meta object literal for the '{@link talleruno.impl.LlaveImpl <em>Llave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.LlaveImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getLlave()
		 * @generated
		 */
		EClass LLAVE = eINSTANCE.getLlave();

		/**
		 * The meta object literal for the '<em><b>Secreto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLAVE__SECRETO = eINSTANCE.getLlave_Secreto();

		/**
		 * The meta object literal for the '{@link talleruno.impl.AmbienteDespliegueImpl <em>Ambiente Despliegue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.AmbienteDespliegueImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getAmbienteDespliegue()
		 * @generated
		 */
		EClass AMBIENTE_DESPLIEGUE = eINSTANCE.getAmbienteDespliegue();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMBIENTE_DESPLIEGUE__NOMBRE = eINSTANCE.getAmbienteDespliegue_Nombre();

		/**
		 * The meta object literal for the '<em><b>Recursos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLIEGUE__RECURSOS = eINSTANCE.getAmbienteDespliegue_Recursos();

		/**
		 * The meta object literal for the '<em><b>Conexiones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLIEGUE__CONEXIONES = eINSTANCE.getAmbienteDespliegue_Conexiones();

		/**
		 * The meta object literal for the '<em><b>Seguridad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLIEGUE__SEGURIDAD = eINSTANCE.getAmbienteDespliegue_Seguridad();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLIEGUE__VPC = eINSTANCE.getAmbienteDespliegue_Vpc();

		/**
		 * The meta object literal for the '{@link talleruno.impl.RecursoImpl <em>Recurso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.RecursoImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getRecurso()
		 * @generated
		 */
		EClass RECURSO = eINSTANCE.getRecurso();

		/**
		 * The meta object literal for the '<em><b>Conexiones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSO__CONEXIONES = eINSTANCE.getRecurso_Conexiones();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURSO__NOMBRE = eINSTANCE.getRecurso_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tamaño</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURSO__TAMAÑO = eINSTANCE.getRecurso_Tamaño();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSO__VPC = eINSTANCE.getRecurso_Vpc();

		/**
		 * The meta object literal for the '{@link talleruno.impl.ServidorAplicacionesImpl <em>Servidor Aplicaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.ServidorAplicacionesImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getServidorAplicaciones()
		 * @generated
		 */
		EClass SERVIDOR_APLICACIONES = eINSTANCE.getServidorAplicaciones();

		/**
		 * The meta object literal for the '<em><b>Sistema Operativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_APLICACIONES__SISTEMA_OPERATIVO = eINSTANCE.getServidorAplicaciones_SistemaOperativo();

		/**
		 * The meta object literal for the '{@link talleruno.impl.ServidorBaseDatosImpl <em>Servidor Base Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.ServidorBaseDatosImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getServidorBaseDatos()
		 * @generated
		 */
		EClass SERVIDOR_BASE_DATOS = eINSTANCE.getServidorBaseDatos();

		/**
		 * The meta object literal for the '{@link talleruno.impl.ServidorAlmacenamientoImpl <em>Servidor Almacenamiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.ServidorAlmacenamientoImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getServidorAlmacenamiento()
		 * @generated
		 */
		EClass SERVIDOR_ALMACENAMIENTO = eINSTANCE.getServidorAlmacenamiento();

		/**
		 * The meta object literal for the '<em><b>Tamanio Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL = eINSTANCE.getServidorAlmacenamiento_TamanioInicial();

		/**
		 * The meta object literal for the '{@link talleruno.impl.ConexiónImpl <em>Conexión</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.ConexiónImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getConexión()
		 * @generated
		 */
		EClass CONEXIÓN = eINSTANCE.getConexión();

		/**
		 * The meta object literal for the '<em><b>Recursos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONEXIÓN__RECURSOS = eINSTANCE.getConexión_Recursos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONEXIÓN__NOMBRE = eINSTANCE.getConexión_Nombre();

		/**
		 * The meta object literal for the '{@link talleruno.impl.BaseDatosSQLImpl <em>Base Datos SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.BaseDatosSQLImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getBaseDatosSQL()
		 * @generated
		 */
		EClass BASE_DATOS_SQL = eINSTANCE.getBaseDatosSQL();

		/**
		 * The meta object literal for the '<em><b>Manejador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_DATOS_SQL__MANEJADOR = eINSTANCE.getBaseDatosSQL_Manejador();

		/**
		 * The meta object literal for the '{@link talleruno.impl.BaseDatosNoSQLImpl <em>Base Datos No SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.BaseDatosNoSQLImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getBaseDatosNoSQL()
		 * @generated
		 */
		EClass BASE_DATOS_NO_SQL = eINSTANCE.getBaseDatosNoSQL();

		/**
		 * The meta object literal for the '<em><b>Manejador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_DATOS_NO_SQL__MANEJADOR = eINSTANCE.getBaseDatosNoSQL_Manejador();

		/**
		 * The meta object literal for the '{@link talleruno.impl.InternetGatewayImpl <em>Internet Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.InternetGatewayImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getInternetGateway()
		 * @generated
		 */
		EClass INTERNET_GATEWAY = eINSTANCE.getInternetGateway();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNET_GATEWAY__VPC = eINSTANCE.getInternetGateway_Vpc();

		/**
		 * The meta object literal for the '{@link talleruno.impl.VPCImpl <em>VPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.VPCImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getVPC()
		 * @generated
		 */
		EClass VPC = eINSTANCE.getVPC();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__NOMBRE = eINSTANCE.getVPC_Nombre();

		/**
		 * The meta object literal for the '<em><b>Recurso</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__RECURSO = eINSTANCE.getVPC_Recurso();

		/**
		 * The meta object literal for the '<em><b>Gruposeguridad</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__GRUPOSEGURIDAD = eINSTANCE.getVPC_Gruposeguridad();

		/**
		 * The meta object literal for the '<em><b>Subred</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__SUBRED = eINSTANCE.getVPC_Subred();

		/**
		 * The meta object literal for the '<em><b>Internetgateway</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__INTERNETGATEWAY = eINSTANCE.getVPC_Internetgateway();

		/**
		 * The meta object literal for the '{@link talleruno.impl.SubredImpl <em>Subred</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.SubredImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getSubred()
		 * @generated
		 */
		EClass SUBRED = eINSTANCE.getSubred();

		/**
		 * The meta object literal for the '<em><b>CIDR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRED__CIDR = eINSTANCE.getSubred_CIDR();

		/**
		 * The meta object literal for the '<em><b>Zona Disponibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRED__ZONA_DISPONIBILIDAD = eINSTANCE.getSubred_ZonaDisponibilidad();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRED__VPC = eINSTANCE.getSubred_Vpc();

		/**
		 * The meta object literal for the '{@link talleruno.impl.GrupoSeguridadImpl <em>Grupo Seguridad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.GrupoSeguridadImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getGrupoSeguridad()
		 * @generated
		 */
		EClass GRUPO_SEGURIDAD = eINSTANCE.getGrupoSeguridad();

		/**
		 * The meta object literal for the '<em><b>Reglas Entrada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO_SEGURIDAD__REGLAS_ENTRADA = eINSTANCE.getGrupoSeguridad_ReglasEntrada();

		/**
		 * The meta object literal for the '<em><b>Reglas Salida</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO_SEGURIDAD__REGLAS_SALIDA = eINSTANCE.getGrupoSeguridad_ReglasSalida();

		/**
		 * The meta object literal for the '<em><b>Descripción</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO_SEGURIDAD__DESCRIPCIÓN = eINSTANCE.getGrupoSeguridad_Descripción();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO_SEGURIDAD__VPC = eINSTANCE.getGrupoSeguridad_Vpc();

		/**
		 * The meta object literal for the '{@link talleruno.impl.ReglaImpl <em>Regla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.ReglaImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getRegla()
		 * @generated
		 */
		EClass REGLA = eINSTANCE.getRegla();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__TIPO = eINSTANCE.getRegla_Tipo();

		/**
		 * The meta object literal for the '<em><b>Protocolo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__PROTOCOLO = eINSTANCE.getRegla_Protocolo();

		/**
		 * The meta object literal for the '<em><b>Puerto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__PUERTO = eINSTANCE.getRegla_Puerto();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__ORIGEN = eINSTANCE.getRegla_Origen();

		/**
		 * The meta object literal for the '<em><b>Descripción</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__DESCRIPCIÓN = eINSTANCE.getRegla_Descripción();

		/**
		 * The meta object literal for the '{@link talleruno.impl.MecanismoSeguridadImpl <em>Mecanismo Seguridad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.MecanismoSeguridadImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getMecanismoSeguridad()
		 * @generated
		 */
		EClass MECANISMO_SEGURIDAD = eINSTANCE.getMecanismoSeguridad();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECANISMO_SEGURIDAD__NOMBRE = eINSTANCE.getMecanismoSeguridad_Nombre();

		/**
		 * The meta object literal for the '{@link talleruno.impl.InfraestructuraImpl <em>Infraestructura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.impl.InfraestructuraImpl
		 * @see talleruno.impl.TallerunoPackageImpl#getInfraestructura()
		 * @generated
		 */
		EClass INFRAESTRUCTURA = eINSTANCE.getInfraestructura();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRAESTRUCTURA__NOMBRE = eINSTANCE.getInfraestructura_Nombre();

		/**
		 * The meta object literal for the '<em><b>Proveedor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRAESTRUCTURA__PROVEEDOR = eINSTANCE.getInfraestructura_Proveedor();

		/**
		 * The meta object literal for the '{@link talleruno.NombreAmbiente <em>Nombre Ambiente</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.NombreAmbiente
		 * @see talleruno.impl.TallerunoPackageImpl#getNombreAmbiente()
		 * @generated
		 */
		EEnum NOMBRE_AMBIENTE = eINSTANCE.getNombreAmbiente();

		/**
		 * The meta object literal for the '{@link talleruno.TamañoServidor <em>Tamaño Servidor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.TamañoServidor
		 * @see talleruno.impl.TallerunoPackageImpl#getTamañoServidor()
		 * @generated
		 */
		EEnum TAMAÑO_SERVIDOR = eINSTANCE.getTamañoServidor();

		/**
		 * The meta object literal for the '{@link talleruno.SistemaOperativo <em>Sistema Operativo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.SistemaOperativo
		 * @see talleruno.impl.TallerunoPackageImpl#getSistemaOperativo()
		 * @generated
		 */
		EEnum SISTEMA_OPERATIVO = eINSTANCE.getSistemaOperativo();

		/**
		 * The meta object literal for the '{@link talleruno.ManejadorNoSQL <em>Manejador No SQL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.ManejadorNoSQL
		 * @see talleruno.impl.TallerunoPackageImpl#getManejadorNoSQL()
		 * @generated
		 */
		EEnum MANEJADOR_NO_SQL = eINSTANCE.getManejadorNoSQL();

		/**
		 * The meta object literal for the '{@link talleruno.ManejadorSQL <em>Manejador SQL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.ManejadorSQL
		 * @see talleruno.impl.TallerunoPackageImpl#getManejadorSQL()
		 * @generated
		 */
		EEnum MANEJADOR_SQL = eINSTANCE.getManejadorSQL();

		/**
		 * The meta object literal for the '{@link talleruno.Protocolo <em>Protocolo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see talleruno.Protocolo
		 * @see talleruno.impl.TallerunoPackageImpl#getProtocolo()
		 * @generated
		 */
		EEnum PROTOCOLO = eINSTANCE.getProtocolo();

	}

} //TallerunoPackage
