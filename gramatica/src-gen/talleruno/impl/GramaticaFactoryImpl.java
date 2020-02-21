/**
 */
package talleruno.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import talleruno.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GramaticaFactoryImpl extends EFactoryImpl implements
		GramaticaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GramaticaFactory init() {
		try {
			GramaticaFactory theGramaticaFactory = (GramaticaFactory) EPackage.Registry.INSTANCE
					.getEFactory(GramaticaPackage.eNS_URI);
			if (theGramaticaFactory != null) {
				return theGramaticaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GramaticaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GramaticaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GramaticaPackage.PROVEEDOR:
			return createProveedor();
		case GramaticaPackage.USUARIO_PASSWORD:
			return createUsuarioPassword();
		case GramaticaPackage.LLAVE:
			return createLlave();
		case GramaticaPackage.AMBIENTE_DESPLIEGUE:
			return createAmbienteDespliegue();
		case GramaticaPackage.SERVIDOR_APLICACIONES:
			return createServidorAplicaciones();
		case GramaticaPackage.SERVIDOR_ALMACENAMIENTO:
			return createServidorAlmacenamiento();
		case GramaticaPackage.CONEXION:
			return createConexion();
		case GramaticaPackage.BASE_DATOS_SQL:
			return createBaseDatosSQL();
		case GramaticaPackage.BASE_DATOS_NO_SQL:
			return createBaseDatosNoSQL();
		case GramaticaPackage.INTERNET_GATEWAY:
			return createInternetGateway();
		case GramaticaPackage.VPC:
			return createVPC();
		case GramaticaPackage.SUBRED:
			return createSubred();
		case GramaticaPackage.GRUPO_SEGURIDAD:
			return createGrupoSeguridad();
		case GramaticaPackage.REGLA:
			return createRegla();
		case GramaticaPackage.INFRAESTRUCTURA:
			return createInfraestructura();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GramaticaPackage.NOMBRE_AMBIENTE:
			return createNombreAmbienteFromString(eDataType, initialValue);
		case GramaticaPackage.TAMANIO_SERVIDOR:
			return createTamanioServidorFromString(eDataType, initialValue);
		case GramaticaPackage.SISTEMA_OPERATIVO:
			return createSistemaOperativoFromString(eDataType, initialValue);
		case GramaticaPackage.MANEJADOR_NO_SQL:
			return createManejadorNoSQLFromString(eDataType, initialValue);
		case GramaticaPackage.MANEJADOR_SQL:
			return createManejadorSQLFromString(eDataType, initialValue);
		case GramaticaPackage.PROTOCOLO:
			return createProtocoloFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GramaticaPackage.NOMBRE_AMBIENTE:
			return convertNombreAmbienteToString(eDataType, instanceValue);
		case GramaticaPackage.TAMANIO_SERVIDOR:
			return convertTamanioServidorToString(eDataType, instanceValue);
		case GramaticaPackage.SISTEMA_OPERATIVO:
			return convertSistemaOperativoToString(eDataType, instanceValue);
		case GramaticaPackage.MANEJADOR_NO_SQL:
			return convertManejadorNoSQLToString(eDataType, instanceValue);
		case GramaticaPackage.MANEJADOR_SQL:
			return convertManejadorSQLToString(eDataType, instanceValue);
		case GramaticaPackage.PROTOCOLO:
			return convertProtocoloToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proveedor createProveedor() {
		ProveedorImpl proveedor = new ProveedorImpl();
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsuarioPassword createUsuarioPassword() {
		UsuarioPasswordImpl usuarioPassword = new UsuarioPasswordImpl();
		return usuarioPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Llave createLlave() {
		LlaveImpl llave = new LlaveImpl();
		return llave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmbienteDespliegue createAmbienteDespliegue() {
		AmbienteDespliegueImpl ambienteDespliegue = new AmbienteDespliegueImpl();
		return ambienteDespliegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServidorAplicaciones createServidorAplicaciones() {
		ServidorAplicacionesImpl servidorAplicaciones = new ServidorAplicacionesImpl();
		return servidorAplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServidorAlmacenamiento createServidorAlmacenamiento() {
		ServidorAlmacenamientoImpl servidorAlmacenamiento = new ServidorAlmacenamientoImpl();
		return servidorAlmacenamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conexion createConexion() {
		ConexionImpl conexion = new ConexionImpl();
		return conexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseDatosSQL createBaseDatosSQL() {
		BaseDatosSQLImpl baseDatosSQL = new BaseDatosSQLImpl();
		return baseDatosSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseDatosNoSQL createBaseDatosNoSQL() {
		BaseDatosNoSQLImpl baseDatosNoSQL = new BaseDatosNoSQLImpl();
		return baseDatosNoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternetGateway createInternetGateway() {
		InternetGatewayImpl internetGateway = new InternetGatewayImpl();
		return internetGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VPC createVPC() {
		VPCImpl vpc = new VPCImpl();
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subred createSubred() {
		SubredImpl subred = new SubredImpl();
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrupoSeguridad createGrupoSeguridad() {
		GrupoSeguridadImpl grupoSeguridad = new GrupoSeguridadImpl();
		return grupoSeguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regla createRegla() {
		ReglaImpl regla = new ReglaImpl();
		return regla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Infraestructura createInfraestructura() {
		InfraestructuraImpl infraestructura = new InfraestructuraImpl();
		return infraestructura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombreAmbiente createNombreAmbienteFromString(EDataType eDataType,
			String initialValue) {
		NombreAmbiente result = NombreAmbiente.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNombreAmbienteToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamanioServidor createTamanioServidorFromString(EDataType eDataType,
			String initialValue) {
		TamanioServidor result = TamanioServidor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTamanioServidorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaOperativo createSistemaOperativoFromString(
			EDataType eDataType, String initialValue) {
		SistemaOperativo result = SistemaOperativo.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSistemaOperativoToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManejadorNoSQL createManejadorNoSQLFromString(EDataType eDataType,
			String initialValue) {
		ManejadorNoSQL result = ManejadorNoSQL.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManejadorNoSQLToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManejadorSQL createManejadorSQLFromString(EDataType eDataType,
			String initialValue) {
		ManejadorSQL result = ManejadorSQL.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManejadorSQLToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocolo createProtocoloFromString(EDataType eDataType,
			String initialValue) {
		Protocolo result = Protocolo.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocoloToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GramaticaPackage getGramaticaPackage() {
		return (GramaticaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GramaticaPackage getPackage() {
		return GramaticaPackage.eINSTANCE;
	}

} //GramaticaFactoryImpl
