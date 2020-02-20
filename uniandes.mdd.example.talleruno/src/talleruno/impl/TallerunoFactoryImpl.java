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
public class TallerunoFactoryImpl extends EFactoryImpl implements TallerunoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TallerunoFactory init() {
		try {
			TallerunoFactory theTallerunoFactory = (TallerunoFactory)EPackage.Registry.INSTANCE.getEFactory(TallerunoPackage.eNS_URI);
			if (theTallerunoFactory != null) {
				return theTallerunoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TallerunoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TallerunoFactoryImpl() {
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
			case TallerunoPackage.PROVEEDOR: return createProveedor();
			case TallerunoPackage.USUARIO_CONTRASEÑA: return createUsuarioContraseña();
			case TallerunoPackage.LLAVE: return createLlave();
			case TallerunoPackage.AMBIENTE_DESPLIEGUE: return createAmbienteDespliegue();
			case TallerunoPackage.SERVIDOR_APLICACIONES: return createServidorAplicaciones();
			case TallerunoPackage.SERVIDOR_ALMACENAMIENTO: return createServidorAlmacenamiento();
			case TallerunoPackage.CONEXIÓN: return createConexión();
			case TallerunoPackage.BASE_DATOS_SQL: return createBaseDatosSQL();
			case TallerunoPackage.BASE_DATOS_NO_SQL: return createBaseDatosNoSQL();
			case TallerunoPackage.INTERNET_GATEWAY: return createInternetGateway();
			case TallerunoPackage.VPC: return createVPC();
			case TallerunoPackage.SUBRED: return createSubred();
			case TallerunoPackage.GRUPO_SEGURIDAD: return createGrupoSeguridad();
			case TallerunoPackage.REGLA: return createRegla();
			case TallerunoPackage.INFRAESTRUCTURA: return createInfraestructura();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
			case TallerunoPackage.NOMBRE_AMBIENTE:
				return createNombreAmbienteFromString(eDataType, initialValue);
			case TallerunoPackage.TAMAÑO_SERVIDOR:
				return createTamañoServidorFromString(eDataType, initialValue);
			case TallerunoPackage.SISTEMA_OPERATIVO:
				return createSistemaOperativoFromString(eDataType, initialValue);
			case TallerunoPackage.MANEJADOR_NO_SQL:
				return createManejadorNoSQLFromString(eDataType, initialValue);
			case TallerunoPackage.MANEJADOR_SQL:
				return createManejadorSQLFromString(eDataType, initialValue);
			case TallerunoPackage.PROTOCOLO:
				return createProtocoloFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
			case TallerunoPackage.NOMBRE_AMBIENTE:
				return convertNombreAmbienteToString(eDataType, instanceValue);
			case TallerunoPackage.TAMAÑO_SERVIDOR:
				return convertTamañoServidorToString(eDataType, instanceValue);
			case TallerunoPackage.SISTEMA_OPERATIVO:
				return convertSistemaOperativoToString(eDataType, instanceValue);
			case TallerunoPackage.MANEJADOR_NO_SQL:
				return convertManejadorNoSQLToString(eDataType, instanceValue);
			case TallerunoPackage.MANEJADOR_SQL:
				return convertManejadorSQLToString(eDataType, instanceValue);
			case TallerunoPackage.PROTOCOLO:
				return convertProtocoloToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proveedor createProveedor() {
		ProveedorImpl proveedor = new ProveedorImpl();
		return proveedor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsuarioContraseña createUsuarioContraseña() {
		UsuarioContraseñaImpl usuarioContraseña = new UsuarioContraseñaImpl();
		return usuarioContraseña;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Llave createLlave() {
		LlaveImpl llave = new LlaveImpl();
		return llave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbienteDespliegue createAmbienteDespliegue() {
		AmbienteDespliegueImpl ambienteDespliegue = new AmbienteDespliegueImpl();
		return ambienteDespliegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServidorAplicaciones createServidorAplicaciones() {
		ServidorAplicacionesImpl servidorAplicaciones = new ServidorAplicacionesImpl();
		return servidorAplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServidorAlmacenamiento createServidorAlmacenamiento() {
		ServidorAlmacenamientoImpl servidorAlmacenamiento = new ServidorAlmacenamientoImpl();
		return servidorAlmacenamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conexión createConexión() {
		ConexiónImpl conexión = new ConexiónImpl();
		return conexión;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDatosSQL createBaseDatosSQL() {
		BaseDatosSQLImpl baseDatosSQL = new BaseDatosSQLImpl();
		return baseDatosSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDatosNoSQL createBaseDatosNoSQL() {
		BaseDatosNoSQLImpl baseDatosNoSQL = new BaseDatosNoSQLImpl();
		return baseDatosNoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternetGateway createInternetGateway() {
		InternetGatewayImpl internetGateway = new InternetGatewayImpl();
		return internetGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC createVPC() {
		VPCImpl vpc = new VPCImpl();
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subred createSubred() {
		SubredImpl subred = new SubredImpl();
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrupoSeguridad createGrupoSeguridad() {
		GrupoSeguridadImpl grupoSeguridad = new GrupoSeguridadImpl();
		return grupoSeguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regla createRegla() {
		ReglaImpl regla = new ReglaImpl();
		return regla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infraestructura createInfraestructura() {
		InfraestructuraImpl infraestructura = new InfraestructuraImpl();
		return infraestructura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombreAmbiente createNombreAmbienteFromString(EDataType eDataType, String initialValue) {
		NombreAmbiente result = NombreAmbiente.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNombreAmbienteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamañoServidor createTamañoServidorFromString(EDataType eDataType, String initialValue) {
		TamañoServidor result = TamañoServidor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTamañoServidorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaOperativo createSistemaOperativoFromString(EDataType eDataType, String initialValue) {
		SistemaOperativo result = SistemaOperativo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSistemaOperativoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManejadorNoSQL createManejadorNoSQLFromString(EDataType eDataType, String initialValue) {
		ManejadorNoSQL result = ManejadorNoSQL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManejadorNoSQLToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManejadorSQL createManejadorSQLFromString(EDataType eDataType, String initialValue) {
		ManejadorSQL result = ManejadorSQL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManejadorSQLToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocolo createProtocoloFromString(EDataType eDataType, String initialValue) {
		Protocolo result = Protocolo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocoloToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TallerunoPackage getTallerunoPackage() {
		return (TallerunoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TallerunoPackage getPackage() {
		return TallerunoPackage.eINSTANCE;
	}

} //TallerunoFactoryImpl
