/**
 */
package talleruno.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import talleruno.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see talleruno.GramaticaPackage
 * @generated
 */
public class GramaticaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GramaticaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GramaticaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GramaticaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GramaticaSwitch<Adapter> modelSwitch = new GramaticaSwitch<Adapter>() {
		@Override
		public Adapter caseProveedor(Proveedor object) {
			return createProveedorAdapter();
		}

		@Override
		public Adapter caseParametroConexion(ParametroConexion object) {
			return createParametroConexionAdapter();
		}

		@Override
		public Adapter caseUsuarioPassword(UsuarioPassword object) {
			return createUsuarioPasswordAdapter();
		}

		@Override
		public Adapter caseLlave(Llave object) {
			return createLlaveAdapter();
		}

		@Override
		public Adapter caseAmbienteDespliegue(AmbienteDespliegue object) {
			return createAmbienteDespliegueAdapter();
		}

		@Override
		public Adapter caseRecurso(Recurso object) {
			return createRecursoAdapter();
		}

		@Override
		public Adapter caseServidorAplicaciones(ServidorAplicaciones object) {
			return createServidorAplicacionesAdapter();
		}

		@Override
		public Adapter caseServidorBaseDatos(ServidorBaseDatos object) {
			return createServidorBaseDatosAdapter();
		}

		@Override
		public Adapter caseServidorAlmacenamiento(ServidorAlmacenamiento object) {
			return createServidorAlmacenamientoAdapter();
		}

		@Override
		public Adapter caseConexion(Conexion object) {
			return createConexionAdapter();
		}

		@Override
		public Adapter caseBaseDatosSQL(BaseDatosSQL object) {
			return createBaseDatosSQLAdapter();
		}

		@Override
		public Adapter caseBaseDatosNoSQL(BaseDatosNoSQL object) {
			return createBaseDatosNoSQLAdapter();
		}

		@Override
		public Adapter caseInternetGateway(InternetGateway object) {
			return createInternetGatewayAdapter();
		}

		@Override
		public Adapter caseVPC(VPC object) {
			return createVPCAdapter();
		}

		@Override
		public Adapter caseSubred(Subred object) {
			return createSubredAdapter();
		}

		@Override
		public Adapter caseGrupoSeguridad(GrupoSeguridad object) {
			return createGrupoSeguridadAdapter();
		}

		@Override
		public Adapter caseRegla(Regla object) {
			return createReglaAdapter();
		}

		@Override
		public Adapter caseMecanismoSeguridad(MecanismoSeguridad object) {
			return createMecanismoSeguridadAdapter();
		}

		@Override
		public Adapter caseInfraestructura(Infraestructura object) {
			return createInfraestructuraAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.Proveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.Proveedor
	 * @generated
	 */
	public Adapter createProveedorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.ParametroConexion <em>Parametro Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.ParametroConexion
	 * @generated
	 */
	public Adapter createParametroConexionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.UsuarioPassword <em>Usuario Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.UsuarioPassword
	 * @generated
	 */
	public Adapter createUsuarioPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.Llave <em>Llave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.Llave
	 * @generated
	 */
	public Adapter createLlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.AmbienteDespliegue <em>Ambiente Despliegue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.AmbienteDespliegue
	 * @generated
	 */
	public Adapter createAmbienteDespliegueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.Recurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.Recurso
	 * @generated
	 */
	public Adapter createRecursoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.ServidorAplicaciones <em>Servidor Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.ServidorAplicaciones
	 * @generated
	 */
	public Adapter createServidorAplicacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.ServidorBaseDatos <em>Servidor Base Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.ServidorBaseDatos
	 * @generated
	 */
	public Adapter createServidorBaseDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.ServidorAlmacenamiento <em>Servidor Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.ServidorAlmacenamiento
	 * @generated
	 */
	public Adapter createServidorAlmacenamientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.Conexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.Conexion
	 * @generated
	 */
	public Adapter createConexionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.BaseDatosSQL <em>Base Datos SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.BaseDatosSQL
	 * @generated
	 */
	public Adapter createBaseDatosSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.BaseDatosNoSQL <em>Base Datos No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.BaseDatosNoSQL
	 * @generated
	 */
	public Adapter createBaseDatosNoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.InternetGateway <em>Internet Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.InternetGateway
	 * @generated
	 */
	public Adapter createInternetGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.VPC
	 * @generated
	 */
	public Adapter createVPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.Subred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.Subred
	 * @generated
	 */
	public Adapter createSubredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.GrupoSeguridad <em>Grupo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.GrupoSeguridad
	 * @generated
	 */
	public Adapter createGrupoSeguridadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.Regla <em>Regla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.Regla
	 * @generated
	 */
	public Adapter createReglaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.MecanismoSeguridad <em>Mecanismo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.MecanismoSeguridad
	 * @generated
	 */
	public Adapter createMecanismoSeguridadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link talleruno.Infraestructura <em>Infraestructura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see talleruno.Infraestructura
	 * @generated
	 */
	public Adapter createInfraestructuraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GramaticaAdapterFactory
