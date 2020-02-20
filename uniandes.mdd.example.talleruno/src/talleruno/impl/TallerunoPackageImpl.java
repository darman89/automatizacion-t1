/**
 */
package talleruno.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import talleruno.AmbienteDespliegue;
import talleruno.BaseDatosNoSQL;
import talleruno.BaseDatosSQL;
import talleruno.Conexión;
import talleruno.GrupoSeguridad;
import talleruno.Infraestructura;
import talleruno.InternetGateway;
import talleruno.Llave;
import talleruno.ManejadorNoSQL;
import talleruno.ManejadorSQL;
import talleruno.MecanismoSeguridad;
import talleruno.NombreAmbiente;
import talleruno.ParámetroConexión;
import talleruno.Protocolo;
import talleruno.Proveedor;
import talleruno.Recurso;
import talleruno.Regla;
import talleruno.ServidorAlmacenamiento;
import talleruno.ServidorAplicaciones;
import talleruno.ServidorBaseDatos;
import talleruno.SistemaOperativo;
import talleruno.Subred;
import talleruno.TallerunoFactory;
import talleruno.TallerunoPackage;
import talleruno.TamañoServidor;
import talleruno.UsuarioContraseña;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TallerunoPackageImpl extends EPackageImpl implements TallerunoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proveedorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parámetroConexiónEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioContraseñaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambienteDespliegueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorAplicacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorBaseDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorAlmacenamientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conexiónEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseDatosSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseDatosNoSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internetGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grupoSeguridadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reglaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mecanismoSeguridadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infraestructuraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nombreAmbienteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tamañoServidorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sistemaOperativoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manejadorNoSQLEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manejadorSQLEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocoloEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see talleruno.TallerunoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TallerunoPackageImpl() {
		super(eNS_URI, TallerunoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TallerunoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TallerunoPackage init() {
		if (isInited) return (TallerunoPackage)EPackage.Registry.INSTANCE.getEPackage(TallerunoPackage.eNS_URI);

		// Obtain or create and register package
		TallerunoPackageImpl theTallerunoPackage = (TallerunoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TallerunoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TallerunoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTallerunoPackage.createPackageContents();

		// Initialize created meta-data
		theTallerunoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTallerunoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TallerunoPackage.eNS_URI, theTallerunoPackage);
		return theTallerunoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProveedor() {
		return proveedorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_ParámetroConexión() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProveedor_Nombre() {
		return (EAttribute)proveedorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_AmbientesDespliegue() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParámetroConexión() {
		return parámetroConexiónEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuarioContraseña() {
		return usuarioContraseñaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuarioContraseña_Usuario() {
		return (EAttribute)usuarioContraseñaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuarioContraseña_Contraseña() {
		return (EAttribute)usuarioContraseñaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLlave() {
		return llaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLlave_Secreto() {
		return (EAttribute)llaveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbienteDespliegue() {
		return ambienteDespliegueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmbienteDespliegue_Nombre() {
		return (EAttribute)ambienteDespliegueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmbienteDespliegue_Recursos() {
		return (EReference)ambienteDespliegueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmbienteDespliegue_Conexiones() {
		return (EReference)ambienteDespliegueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmbienteDespliegue_Seguridad() {
		return (EReference)ambienteDespliegueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmbienteDespliegue_Vpc() {
		return (EReference)ambienteDespliegueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurso() {
		return recursoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurso_Conexiones() {
		return (EReference)recursoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurso_Nombre() {
		return (EAttribute)recursoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurso_Tamaño() {
		return (EAttribute)recursoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurso_Vpc() {
		return (EReference)recursoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorAplicaciones() {
		return servidorAplicacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorAplicaciones_SistemaOperativo() {
		return (EAttribute)servidorAplicacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorBaseDatos() {
		return servidorBaseDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorAlmacenamiento() {
		return servidorAlmacenamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorAlmacenamiento_TamanioInicial() {
		return (EAttribute)servidorAlmacenamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConexión() {
		return conexiónEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConexión_Recursos() {
		return (EReference)conexiónEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConexión_Nombre() {
		return (EAttribute)conexiónEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseDatosSQL() {
		return baseDatosSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseDatosSQL_Manejador() {
		return (EAttribute)baseDatosSQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseDatosNoSQL() {
		return baseDatosNoSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseDatosNoSQL_Manejador() {
		return (EAttribute)baseDatosNoSQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternetGateway() {
		return internetGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternetGateway_Vpc() {
		return (EReference)internetGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPC() {
		return vpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPC_Nombre() {
		return (EAttribute)vpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPC_Recurso() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPC_Gruposeguridad() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPC_Subred() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPC_Internetgateway() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubred() {
		return subredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubred_CIDR() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubred_ZonaDisponibilidad() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubred_Vpc() {
		return (EReference)subredEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrupoSeguridad() {
		return grupoSeguridadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupoSeguridad_ReglasEntrada() {
		return (EReference)grupoSeguridadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupoSeguridad_ReglasSalida() {
		return (EReference)grupoSeguridadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrupoSeguridad_Descripción() {
		return (EAttribute)grupoSeguridadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupoSeguridad_Vpc() {
		return (EReference)grupoSeguridadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegla() {
		return reglaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Tipo() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Protocolo() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Puerto() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Origen() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Descripción() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMecanismoSeguridad() {
		return mecanismoSeguridadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMecanismoSeguridad_Nombre() {
		return (EAttribute)mecanismoSeguridadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfraestructura() {
		return infraestructuraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfraestructura_Nombre() {
		return (EAttribute)infraestructuraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfraestructura_Proveedor() {
		return (EReference)infraestructuraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNombreAmbiente() {
		return nombreAmbienteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTamañoServidor() {
		return tamañoServidorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSistemaOperativo() {
		return sistemaOperativoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getManejadorNoSQL() {
		return manejadorNoSQLEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getManejadorSQL() {
		return manejadorSQLEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocolo() {
		return protocoloEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TallerunoFactory getTallerunoFactory() {
		return (TallerunoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		proveedorEClass = createEClass(PROVEEDOR);
		createEReference(proveedorEClass, PROVEEDOR__PARÁMETRO_CONEXIÓN);
		createEAttribute(proveedorEClass, PROVEEDOR__NOMBRE);
		createEReference(proveedorEClass, PROVEEDOR__AMBIENTES_DESPLIEGUE);

		parámetroConexiónEClass = createEClass(PARÁMETRO_CONEXIÓN);

		usuarioContraseñaEClass = createEClass(USUARIO_CONTRASEÑA);
		createEAttribute(usuarioContraseñaEClass, USUARIO_CONTRASEÑA__USUARIO);
		createEAttribute(usuarioContraseñaEClass, USUARIO_CONTRASEÑA__CONTRASEÑA);

		llaveEClass = createEClass(LLAVE);
		createEAttribute(llaveEClass, LLAVE__SECRETO);

		ambienteDespliegueEClass = createEClass(AMBIENTE_DESPLIEGUE);
		createEAttribute(ambienteDespliegueEClass, AMBIENTE_DESPLIEGUE__NOMBRE);
		createEReference(ambienteDespliegueEClass, AMBIENTE_DESPLIEGUE__RECURSOS);
		createEReference(ambienteDespliegueEClass, AMBIENTE_DESPLIEGUE__CONEXIONES);
		createEReference(ambienteDespliegueEClass, AMBIENTE_DESPLIEGUE__SEGURIDAD);
		createEReference(ambienteDespliegueEClass, AMBIENTE_DESPLIEGUE__VPC);

		recursoEClass = createEClass(RECURSO);
		createEReference(recursoEClass, RECURSO__CONEXIONES);
		createEAttribute(recursoEClass, RECURSO__NOMBRE);
		createEAttribute(recursoEClass, RECURSO__TAMAÑO);
		createEReference(recursoEClass, RECURSO__VPC);

		servidorAplicacionesEClass = createEClass(SERVIDOR_APLICACIONES);
		createEAttribute(servidorAplicacionesEClass, SERVIDOR_APLICACIONES__SISTEMA_OPERATIVO);

		servidorBaseDatosEClass = createEClass(SERVIDOR_BASE_DATOS);

		servidorAlmacenamientoEClass = createEClass(SERVIDOR_ALMACENAMIENTO);
		createEAttribute(servidorAlmacenamientoEClass, SERVIDOR_ALMACENAMIENTO__TAMANIO_INICIAL);

		conexiónEClass = createEClass(CONEXIÓN);
		createEReference(conexiónEClass, CONEXIÓN__RECURSOS);
		createEAttribute(conexiónEClass, CONEXIÓN__NOMBRE);

		baseDatosSQLEClass = createEClass(BASE_DATOS_SQL);
		createEAttribute(baseDatosSQLEClass, BASE_DATOS_SQL__MANEJADOR);

		baseDatosNoSQLEClass = createEClass(BASE_DATOS_NO_SQL);
		createEAttribute(baseDatosNoSQLEClass, BASE_DATOS_NO_SQL__MANEJADOR);

		internetGatewayEClass = createEClass(INTERNET_GATEWAY);
		createEReference(internetGatewayEClass, INTERNET_GATEWAY__VPC);

		vpcEClass = createEClass(VPC);
		createEAttribute(vpcEClass, VPC__NOMBRE);
		createEReference(vpcEClass, VPC__RECURSO);
		createEReference(vpcEClass, VPC__GRUPOSEGURIDAD);
		createEReference(vpcEClass, VPC__SUBRED);
		createEReference(vpcEClass, VPC__INTERNETGATEWAY);

		subredEClass = createEClass(SUBRED);
		createEAttribute(subredEClass, SUBRED__CIDR);
		createEAttribute(subredEClass, SUBRED__ZONA_DISPONIBILIDAD);
		createEReference(subredEClass, SUBRED__VPC);

		grupoSeguridadEClass = createEClass(GRUPO_SEGURIDAD);
		createEReference(grupoSeguridadEClass, GRUPO_SEGURIDAD__REGLAS_ENTRADA);
		createEReference(grupoSeguridadEClass, GRUPO_SEGURIDAD__REGLAS_SALIDA);
		createEAttribute(grupoSeguridadEClass, GRUPO_SEGURIDAD__DESCRIPCIÓN);
		createEReference(grupoSeguridadEClass, GRUPO_SEGURIDAD__VPC);

		reglaEClass = createEClass(REGLA);
		createEAttribute(reglaEClass, REGLA__TIPO);
		createEAttribute(reglaEClass, REGLA__PROTOCOLO);
		createEAttribute(reglaEClass, REGLA__PUERTO);
		createEAttribute(reglaEClass, REGLA__ORIGEN);
		createEAttribute(reglaEClass, REGLA__DESCRIPCIÓN);

		mecanismoSeguridadEClass = createEClass(MECANISMO_SEGURIDAD);
		createEAttribute(mecanismoSeguridadEClass, MECANISMO_SEGURIDAD__NOMBRE);

		infraestructuraEClass = createEClass(INFRAESTRUCTURA);
		createEAttribute(infraestructuraEClass, INFRAESTRUCTURA__NOMBRE);
		createEReference(infraestructuraEClass, INFRAESTRUCTURA__PROVEEDOR);

		// Create enums
		nombreAmbienteEEnum = createEEnum(NOMBRE_AMBIENTE);
		tamañoServidorEEnum = createEEnum(TAMAÑO_SERVIDOR);
		sistemaOperativoEEnum = createEEnum(SISTEMA_OPERATIVO);
		manejadorNoSQLEEnum = createEEnum(MANEJADOR_NO_SQL);
		manejadorSQLEEnum = createEEnum(MANEJADOR_SQL);
		protocoloEEnum = createEEnum(PROTOCOLO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		usuarioContraseñaEClass.getESuperTypes().add(this.getParámetroConexión());
		llaveEClass.getESuperTypes().add(this.getParámetroConexión());
		servidorAplicacionesEClass.getESuperTypes().add(this.getRecurso());
		servidorBaseDatosEClass.getESuperTypes().add(this.getRecurso());
		servidorAlmacenamientoEClass.getESuperTypes().add(this.getRecurso());
		baseDatosSQLEClass.getESuperTypes().add(this.getServidorBaseDatos());
		baseDatosNoSQLEClass.getESuperTypes().add(this.getServidorBaseDatos());
		internetGatewayEClass.getESuperTypes().add(this.getMecanismoSeguridad());
		subredEClass.getESuperTypes().add(this.getMecanismoSeguridad());
		grupoSeguridadEClass.getESuperTypes().add(this.getMecanismoSeguridad());

		// Initialize classes, features, and operations; add parameters
		initEClass(proveedorEClass, Proveedor.class, "Proveedor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProveedor_ParámetroConexión(), this.getParámetroConexión(), null, "parámetroConexión", null, 1, 1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProveedor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedor_AmbientesDespliegue(), this.getAmbienteDespliegue(), null, "ambientesDespliegue", null, 0, -1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parámetroConexiónEClass, ParámetroConexión.class, "ParámetroConexión", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usuarioContraseñaEClass, UsuarioContraseña.class, "UsuarioContraseña", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuarioContraseña_Usuario(), ecorePackage.getEString(), "usuario", null, 0, 1, UsuarioContraseña.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuarioContraseña_Contraseña(), ecorePackage.getEString(), "contraseña", null, 0, 1, UsuarioContraseña.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(llaveEClass, Llave.class, "Llave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLlave_Secreto(), ecorePackage.getEString(), "secreto", null, 0, 1, Llave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambienteDespliegueEClass, AmbienteDespliegue.class, "AmbienteDespliegue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmbienteDespliegue_Nombre(), this.getNombreAmbiente(), "nombre", null, 0, 1, AmbienteDespliegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDespliegue_Recursos(), this.getRecurso(), null, "recursos", null, 0, -1, AmbienteDespliegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDespliegue_Conexiones(), this.getConexión(), null, "conexiones", null, 0, -1, AmbienteDespliegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDespliegue_Seguridad(), this.getMecanismoSeguridad(), null, "seguridad", null, 0, -1, AmbienteDespliegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDespliegue_Vpc(), this.getVPC(), null, "vpc", null, 0, -1, AmbienteDespliegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recursoEClass, Recurso.class, "Recurso", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecurso_Conexiones(), this.getConexión(), this.getConexión_Recursos(), "conexiones", null, 0, -1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurso_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurso_Tamaño(), this.getTamañoServidor(), "tamaño", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecurso_Vpc(), this.getVPC(), this.getVPC_Recurso(), "vpc", null, 1, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorAplicacionesEClass, ServidorAplicaciones.class, "ServidorAplicaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorAplicaciones_SistemaOperativo(), this.getSistemaOperativo(), "sistemaOperativo", null, 0, 1, ServidorAplicaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorBaseDatosEClass, ServidorBaseDatos.class, "ServidorBaseDatos", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servidorAlmacenamientoEClass, ServidorAlmacenamiento.class, "ServidorAlmacenamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorAlmacenamiento_TamanioInicial(), ecorePackage.getEInt(), "tamanioInicial", null, 0, 1, ServidorAlmacenamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conexiónEClass, Conexión.class, "Conexión", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConexión_Recursos(), this.getRecurso(), this.getRecurso_Conexiones(), "recursos", null, 2, 2, Conexión.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConexión_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Conexión.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseDatosSQLEClass, BaseDatosSQL.class, "BaseDatosSQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseDatosSQL_Manejador(), this.getManejadorSQL(), "manejador", null, 0, 1, BaseDatosSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseDatosNoSQLEClass, BaseDatosNoSQL.class, "BaseDatosNoSQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseDatosNoSQL_Manejador(), this.getManejadorNoSQL(), "manejador", null, 0, 1, BaseDatosNoSQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internetGatewayEClass, InternetGateway.class, "InternetGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternetGateway_Vpc(), this.getVPC(), this.getVPC_Internetgateway(), "vpc", null, 1, 1, InternetGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcEClass, talleruno.VPC.class, "VPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPC_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, talleruno.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Recurso(), this.getRecurso(), this.getRecurso_Vpc(), "recurso", null, 1, -1, talleruno.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Gruposeguridad(), this.getGrupoSeguridad(), this.getGrupoSeguridad_Vpc(), "gruposeguridad", null, 0, -1, talleruno.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Subred(), this.getSubred(), this.getSubred_Vpc(), "subred", null, 0, -1, talleruno.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Internetgateway(), this.getInternetGateway(), this.getInternetGateway_Vpc(), "internetgateway", null, 0, 1, talleruno.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subredEClass, Subred.class, "Subred", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubred_CIDR(), ecorePackage.getEString(), "CIDR", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubred_ZonaDisponibilidad(), ecorePackage.getEString(), "zonaDisponibilidad", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubred_Vpc(), this.getVPC(), this.getVPC_Subred(), "vpc", null, 1, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grupoSeguridadEClass, GrupoSeguridad.class, "GrupoSeguridad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrupoSeguridad_ReglasEntrada(), this.getRegla(), null, "reglasEntrada", null, 0, -1, GrupoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupoSeguridad_ReglasSalida(), this.getRegla(), null, "reglasSalida", null, 0, -1, GrupoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrupoSeguridad_Descripción(), ecorePackage.getEString(), "descripción", null, 0, 1, GrupoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupoSeguridad_Vpc(), this.getVPC(), this.getVPC_Gruposeguridad(), "vpc", null, 1, 1, GrupoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reglaEClass, Regla.class, "Regla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegla_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Protocolo(), this.getProtocolo(), "protocolo", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Puerto(), ecorePackage.getEInt(), "puerto", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Origen(), ecorePackage.getEString(), "origen", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Descripción(), ecorePackage.getEString(), "descripción", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mecanismoSeguridadEClass, MecanismoSeguridad.class, "MecanismoSeguridad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMecanismoSeguridad_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MecanismoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infraestructuraEClass, Infraestructura.class, "Infraestructura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfraestructura_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfraestructura_Proveedor(), this.getProveedor(), null, "proveedor", null, 1, 1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nombreAmbienteEEnum, NombreAmbiente.class, "NombreAmbiente");
		addEEnumLiteral(nombreAmbienteEEnum, NombreAmbiente.DESARROLLO);
		addEEnumLiteral(nombreAmbienteEEnum, NombreAmbiente.PRUEBAS);
		addEEnumLiteral(nombreAmbienteEEnum, NombreAmbiente.QA);
		addEEnumLiteral(nombreAmbienteEEnum, NombreAmbiente.PRODUCCIÓN);

		initEEnum(tamañoServidorEEnum, TamañoServidor.class, "TamañoServidor");
		addEEnumLiteral(tamañoServidorEEnum, TamañoServidor.MICRO);
		addEEnumLiteral(tamañoServidorEEnum, TamañoServidor.SMALL);
		addEEnumLiteral(tamañoServidorEEnum, TamañoServidor.MEDIUM);
		addEEnumLiteral(tamañoServidorEEnum, TamañoServidor.LARGE);

		initEEnum(sistemaOperativoEEnum, SistemaOperativo.class, "SistemaOperativo");
		addEEnumLiteral(sistemaOperativoEEnum, SistemaOperativo.WINDOWS);
		addEEnumLiteral(sistemaOperativoEEnum, SistemaOperativo.UBUNTU1804);

		initEEnum(manejadorNoSQLEEnum, ManejadorNoSQL.class, "ManejadorNoSQL");
		addEEnumLiteral(manejadorNoSQLEEnum, ManejadorNoSQL.MONGODB);
		addEEnumLiteral(manejadorNoSQLEEnum, ManejadorNoSQL.CASSANDRA);

		initEEnum(manejadorSQLEEnum, ManejadorSQL.class, "ManejadorSQL");
		addEEnumLiteral(manejadorSQLEEnum, ManejadorSQL.POSTGRESQL);
		addEEnumLiteral(manejadorSQLEEnum, ManejadorSQL.MYSQL);
		addEEnumLiteral(manejadorSQLEEnum, ManejadorSQL.ORACLE);
		addEEnumLiteral(manejadorSQLEEnum, ManejadorSQL.SQLSERVER);

		initEEnum(protocoloEEnum, Protocolo.class, "Protocolo");
		addEEnumLiteral(protocoloEEnum, Protocolo.TCP);
		addEEnumLiteral(protocoloEEnum, Protocolo.UDP);

		// Create resource
		createResource(eNS_URI);
	}

} //TallerunoPackageImpl
