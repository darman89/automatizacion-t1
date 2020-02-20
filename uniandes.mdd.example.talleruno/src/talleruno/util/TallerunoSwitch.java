/**
 */
package talleruno.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import talleruno.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see talleruno.TallerunoPackage
 * @generated
 */
public class TallerunoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TallerunoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TallerunoSwitch() {
		if (modelPackage == null) {
			modelPackage = TallerunoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TallerunoPackage.PROVEEDOR: {
				Proveedor proveedor = (Proveedor)theEObject;
				T result = caseProveedor(proveedor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.PARÁMETRO_CONEXIÓN: {
				ParámetroConexión parámetroConexión = (ParámetroConexión)theEObject;
				T result = caseParámetroConexión(parámetroConexión);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.USUARIO_CONTRASEÑA: {
				UsuarioContraseña usuarioContraseña = (UsuarioContraseña)theEObject;
				T result = caseUsuarioContraseña(usuarioContraseña);
				if (result == null) result = caseParámetroConexión(usuarioContraseña);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.LLAVE: {
				Llave llave = (Llave)theEObject;
				T result = caseLlave(llave);
				if (result == null) result = caseParámetroConexión(llave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.AMBIENTE_DESPLIEGUE: {
				AmbienteDespliegue ambienteDespliegue = (AmbienteDespliegue)theEObject;
				T result = caseAmbienteDespliegue(ambienteDespliegue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.RECURSO: {
				Recurso recurso = (Recurso)theEObject;
				T result = caseRecurso(recurso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.SERVIDOR_APLICACIONES: {
				ServidorAplicaciones servidorAplicaciones = (ServidorAplicaciones)theEObject;
				T result = caseServidorAplicaciones(servidorAplicaciones);
				if (result == null) result = caseRecurso(servidorAplicaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.SERVIDOR_BASE_DATOS: {
				ServidorBaseDatos servidorBaseDatos = (ServidorBaseDatos)theEObject;
				T result = caseServidorBaseDatos(servidorBaseDatos);
				if (result == null) result = caseRecurso(servidorBaseDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.SERVIDOR_ALMACENAMIENTO: {
				ServidorAlmacenamiento servidorAlmacenamiento = (ServidorAlmacenamiento)theEObject;
				T result = caseServidorAlmacenamiento(servidorAlmacenamiento);
				if (result == null) result = caseRecurso(servidorAlmacenamiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.CONEXIÓN: {
				Conexión conexión = (Conexión)theEObject;
				T result = caseConexión(conexión);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.BASE_DATOS_SQL: {
				BaseDatosSQL baseDatosSQL = (BaseDatosSQL)theEObject;
				T result = caseBaseDatosSQL(baseDatosSQL);
				if (result == null) result = caseServidorBaseDatos(baseDatosSQL);
				if (result == null) result = caseRecurso(baseDatosSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.BASE_DATOS_NO_SQL: {
				BaseDatosNoSQL baseDatosNoSQL = (BaseDatosNoSQL)theEObject;
				T result = caseBaseDatosNoSQL(baseDatosNoSQL);
				if (result == null) result = caseServidorBaseDatos(baseDatosNoSQL);
				if (result == null) result = caseRecurso(baseDatosNoSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.INTERNET_GATEWAY: {
				InternetGateway internetGateway = (InternetGateway)theEObject;
				T result = caseInternetGateway(internetGateway);
				if (result == null) result = caseMecanismoSeguridad(internetGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.VPC: {
				VPC vpc = (VPC)theEObject;
				T result = caseVPC(vpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.SUBRED: {
				Subred subred = (Subred)theEObject;
				T result = caseSubred(subred);
				if (result == null) result = caseMecanismoSeguridad(subred);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.GRUPO_SEGURIDAD: {
				GrupoSeguridad grupoSeguridad = (GrupoSeguridad)theEObject;
				T result = caseGrupoSeguridad(grupoSeguridad);
				if (result == null) result = caseMecanismoSeguridad(grupoSeguridad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.REGLA: {
				Regla regla = (Regla)theEObject;
				T result = caseRegla(regla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.MECANISMO_SEGURIDAD: {
				MecanismoSeguridad mecanismoSeguridad = (MecanismoSeguridad)theEObject;
				T result = caseMecanismoSeguridad(mecanismoSeguridad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TallerunoPackage.INFRAESTRUCTURA: {
				Infraestructura infraestructura = (Infraestructura)theEObject;
				T result = caseInfraestructura(infraestructura);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proveedor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proveedor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProveedor(Proveedor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parámetro Conexión</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parámetro Conexión</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParámetroConexión(ParámetroConexión object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario Contraseña</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario Contraseña</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuarioContraseña(UsuarioContraseña object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Llave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Llave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLlave(Llave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ambiente Despliegue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ambiente Despliegue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmbienteDespliegue(AmbienteDespliegue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurso(Recurso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servidor Aplicaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servidor Aplicaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServidorAplicaciones(ServidorAplicaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servidor Base Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servidor Base Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServidorBaseDatos(ServidorBaseDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servidor Almacenamiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servidor Almacenamiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServidorAlmacenamiento(ServidorAlmacenamiento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conexión</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conexión</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConexión(Conexión object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Datos SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Datos SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseDatosSQL(BaseDatosSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Datos No SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Datos No SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseDatosNoSQL(BaseDatosNoSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internet Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internet Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternetGateway(InternetGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPC(VPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subred</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subred</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubred(Subred object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grupo Seguridad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grupo Seguridad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrupoSeguridad(GrupoSeguridad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegla(Regla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mecanismo Seguridad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mecanismo Seguridad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMecanismoSeguridad(MecanismoSeguridad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infraestructura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infraestructura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfraestructura(Infraestructura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TallerunoSwitch
