/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import talleruno.AmbienteDespliegue;
import talleruno.BaseDatosNoSQL;
import talleruno.BaseDatosSQL;
import talleruno.Conexion;
import talleruno.GramaticaPackage;
import talleruno.GrupoSeguridad;
import talleruno.Infraestructura;
import talleruno.InternetGateway;
import talleruno.Llave;
import talleruno.Proveedor;
import talleruno.Regla;
import talleruno.ServidorAlmacenamiento;
import talleruno.ServidorAplicaciones;
import talleruno.Subred;
import talleruno.UsuarioPassword;
import talleruno.VPC;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GramaticaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GramaticaPackage.AMBIENTE_DESPLIEGUE:
				sequence_AmbienteDespliegue(context, (AmbienteDespliegue) semanticObject); 
				return; 
			case GramaticaPackage.BASE_DATOS_NO_SQL:
				sequence_BaseDatosNoSQL(context, (BaseDatosNoSQL) semanticObject); 
				return; 
			case GramaticaPackage.BASE_DATOS_SQL:
				sequence_BaseDatosSQL(context, (BaseDatosSQL) semanticObject); 
				return; 
			case GramaticaPackage.CONEXION:
				sequence_Conexion(context, (Conexion) semanticObject); 
				return; 
			case GramaticaPackage.GRUPO_SEGURIDAD:
				sequence_GrupoSeguridad(context, (GrupoSeguridad) semanticObject); 
				return; 
			case GramaticaPackage.INFRAESTRUCTURA:
				sequence_Infraestructura(context, (Infraestructura) semanticObject); 
				return; 
			case GramaticaPackage.INTERNET_GATEWAY:
				sequence_InternetGateway(context, (InternetGateway) semanticObject); 
				return; 
			case GramaticaPackage.LLAVE:
				sequence_Llave(context, (Llave) semanticObject); 
				return; 
			case GramaticaPackage.PROVEEDOR:
				sequence_Proveedor(context, (Proveedor) semanticObject); 
				return; 
			case GramaticaPackage.REGLA:
				sequence_Regla(context, (Regla) semanticObject); 
				return; 
			case GramaticaPackage.SERVIDOR_ALMACENAMIENTO:
				sequence_ServidorAlmacenamiento(context, (ServidorAlmacenamiento) semanticObject); 
				return; 
			case GramaticaPackage.SERVIDOR_APLICACIONES:
				sequence_ServidorAplicaciones(context, (ServidorAplicaciones) semanticObject); 
				return; 
			case GramaticaPackage.SUBRED:
				sequence_Subred(context, (Subred) semanticObject); 
				return; 
			case GramaticaPackage.USUARIO_PASSWORD:
				sequence_UsuarioPassword(context, (UsuarioPassword) semanticObject); 
				return; 
			case GramaticaPackage.VPC:
				sequence_VPC(context, (VPC) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AmbienteDespliegue returns AmbienteDespliegue
	 *
	 * Constraint:
	 *     (nombre=NombreAmbiente vpc+=VPC vpc+=VPC* recursos+=Recurso recursos+=Recurso*)
	 */
	protected void sequence_AmbienteDespliegue(ISerializationContext context, AmbienteDespliegue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recurso returns BaseDatosNoSQL
	 *     BaseDatosNoSQL returns BaseDatosNoSQL
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         tamanio=TamanioServidor? 
	 *         manejador=ManejadorNoSQL? 
	 *         (conexiones+=[Conexion|EString] conexiones+=[Conexion|EString]*)? 
	 *         vpc=[VPC|EString]
	 *     )
	 */
	protected void sequence_BaseDatosNoSQL(ISerializationContext context, BaseDatosNoSQL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recurso returns BaseDatosSQL
	 *     BaseDatosSQL returns BaseDatosSQL
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         tamanio=TamanioServidor? 
	 *         manejador=ManejadorSQL? 
	 *         (conexiones+=[Conexion|EString] conexiones+=[Conexion|EString]*)? 
	 *         vpc=[VPC|EString]
	 *     )
	 */
	protected void sequence_BaseDatosSQL(ISerializationContext context, BaseDatosSQL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Conexion returns Conexion
	 *
	 * Constraint:
	 *     (nombre=EString? recursos+=[Recurso|EString] recursos+=[Recurso|EString]*)
	 */
	protected void sequence_Conexion(ISerializationContext context, Conexion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MecanismoSeguridad returns GrupoSeguridad
	 *     GrupoSeguridad returns GrupoSeguridad
	 *
	 * Constraint:
	 *     (nombre=EString? descripcion=EString? vpc=[VPC|EString] (reglasEntrada+=Regla reglasEntrada+=Regla*)? (reglasSalida+=Regla reglasSalida+=Regla*)?)
	 */
	protected void sequence_GrupoSeguridad(ISerializationContext context, GrupoSeguridad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Infraestructura returns Infraestructura
	 *
	 * Constraint:
	 *     (nombre=EString proveedor=Proveedor)
	 */
	protected void sequence_Infraestructura(ISerializationContext context, Infraestructura semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GramaticaPackage.Literals.INFRAESTRUCTURA__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GramaticaPackage.Literals.INFRAESTRUCTURA__NOMBRE));
			if (transientValues.isValueTransient(semanticObject, GramaticaPackage.Literals.INFRAESTRUCTURA__PROVEEDOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GramaticaPackage.Literals.INFRAESTRUCTURA__PROVEEDOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInfraestructuraAccess().getNombreEStringParserRuleCall_1_0(), semanticObject.getNombre());
		feeder.accept(grammarAccess.getInfraestructuraAccess().getProveedorProveedorParserRuleCall_3_0(), semanticObject.getProveedor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MecanismoSeguridad returns InternetGateway
	 *     InternetGateway returns InternetGateway
	 *
	 * Constraint:
	 *     (nombre=EString? vpc=[VPC|EString])
	 */
	protected void sequence_InternetGateway(ISerializationContext context, InternetGateway semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParametroConexion returns Llave
	 *     Llave returns Llave
	 *
	 * Constraint:
	 *     secreto=EString
	 */
	protected void sequence_Llave(ISerializationContext context, Llave semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GramaticaPackage.Literals.LLAVE__SECRETO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GramaticaPackage.Literals.LLAVE__SECRETO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLlaveAccess().getSecretoEStringParserRuleCall_3_0(), semanticObject.getSecreto());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Proveedor returns Proveedor
	 *
	 * Constraint:
	 *     (nombre=EString parametroConexion=ParametroConexion ambientesDespliegue+=AmbienteDespliegue ambientesDespliegue+=AmbienteDespliegue*)
	 */
	protected void sequence_Proveedor(ISerializationContext context, Proveedor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Regla returns Regla
	 *
	 * Constraint:
	 *     (tipo=EString? protocolo=Protocolo? puerto=EInt? origen=EString? descripcion=EString?)
	 */
	protected void sequence_Regla(ISerializationContext context, Regla semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recurso returns ServidorAlmacenamiento
	 *     ServidorAlmacenamiento returns ServidorAlmacenamiento
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         tamanio=TamanioServidor? 
	 *         tamanioInicial=EInt? 
	 *         (conexiones+=[Conexion|EString] conexiones+=[Conexion|EString]*)? 
	 *         vpc=[VPC|EString]
	 *     )
	 */
	protected void sequence_ServidorAlmacenamiento(ISerializationContext context, ServidorAlmacenamiento semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recurso returns ServidorAplicaciones
	 *     ServidorAplicaciones returns ServidorAplicaciones
	 *
	 * Constraint:
	 *     (
	 *         nombre=EString? 
	 *         tamanio=TamanioServidor? 
	 *         sistemaOperativo=SistemaOperativo? 
	 *         (conexiones+=[Conexion|EString] conexiones+=[Conexion|EString]*)? 
	 *         vpc=[VPC|ID]
	 *     )
	 */
	protected void sequence_ServidorAplicaciones(ISerializationContext context, ServidorAplicaciones semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MecanismoSeguridad returns Subred
	 *     Subred returns Subred
	 *
	 * Constraint:
	 *     (nombre=EString? CIDR=EString? zonaDisponibilidad=EString? vpc=[VPC|EString])
	 */
	protected void sequence_Subred(ISerializationContext context, Subred semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParametroConexion returns UsuarioPassword
	 *     UsuarioPassword returns UsuarioPassword
	 *
	 * Constraint:
	 *     (usuario=EString password=EString)
	 */
	protected void sequence_UsuarioPassword(ISerializationContext context, UsuarioPassword semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GramaticaPackage.Literals.USUARIO_PASSWORD__USUARIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GramaticaPackage.Literals.USUARIO_PASSWORD__USUARIO));
			if (transientValues.isValueTransient(semanticObject, GramaticaPackage.Literals.USUARIO_PASSWORD__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GramaticaPackage.Literals.USUARIO_PASSWORD__PASSWORD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUsuarioPasswordAccess().getUsuarioEStringParserRuleCall_2_0(), semanticObject.getUsuario());
		feeder.accept(grammarAccess.getUsuarioPasswordAccess().getPasswordEStringParserRuleCall_5_0(), semanticObject.getPassword());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VPC returns VPC
	 *
	 * Constraint:
	 *     nombre=EString
	 */
	protected void sequence_VPC(ISerializationContext context, VPC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GramaticaPackage.Literals.VPC__NOMBRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GramaticaPackage.Literals.VPC__NOMBRE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVPCAccess().getNombreEStringParserRuleCall_7_0(), semanticObject.getNombre());
		feeder.finish();
	}
	
	
}
