package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DESARROLLO'", "'PRUEBAS'", "'QA'", "'PRODUCCION'", "'MICRO'", "'SMALL'", "'MEDIUM'", "'LARGE'", "'Windows'", "'Ubuntu1804'", "'POSTGRESQL'", "'MYSQL'", "'ORACLE'", "'SQLSERVER'", "'MONGODB'", "'CASSANDRA'", "'TCP'", "'UDP'", "'Infraestructura'", "'{'", "'}'", "'Tipo'", "'='", "'parametroConexion'", "'ambientes'", "'['", "']'", "','", "'nombre'", "'recursos'", "'conexiones'", "'seguridad'", "'vpc'", "'UsuarioPassword'", "'usuario'", "'password'", "'Llave'", "'secreto'", "'Conexion'", "'('", "')'", "'tipo'", "'VPC'", "'id'", "'ServidorAplicaciones'", "'tamanio'", "'sistemaOperativo'", "'ServidorAlmacenamiento'", "'tamanioInicial'", "'BaseDatosSQL'", "'manejador'", "'BaseDatosNoSQL'", "'-'", "'InternetGateway'", "'Subred'", "'CIDR'", "'zonaDisponibilidad'", "'GrupoSeguridad'", "'descripcion'", "'reglasEntrada'", "'reglasSalida'", "'Regla'", "'protocolo'", "'puerto'", "'origen'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInfraestructura"
    // InternalMyDsl.g:53:1: entryRuleInfraestructura : ruleInfraestructura EOF ;
    public final void entryRuleInfraestructura() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleInfraestructura EOF )
            // InternalMyDsl.g:55:1: ruleInfraestructura EOF
            {
             before(grammarAccess.getInfraestructuraRule()); 
            pushFollow(FOLLOW_1);
            ruleInfraestructura();

            state._fsp--;

             after(grammarAccess.getInfraestructuraRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfraestructura"


    // $ANTLR start "ruleInfraestructura"
    // InternalMyDsl.g:62:1: ruleInfraestructura : ( ( rule__Infraestructura__Group__0 ) ) ;
    public final void ruleInfraestructura() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Infraestructura__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Infraestructura__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Infraestructura__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Infraestructura__Group__0 )
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Infraestructura__Group__0 )
            // InternalMyDsl.g:69:4: rule__Infraestructura__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfraestructura"


    // $ANTLR start "entryRuleParametroConexion"
    // InternalMyDsl.g:78:1: entryRuleParametroConexion : ruleParametroConexion EOF ;
    public final void entryRuleParametroConexion() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleParametroConexion EOF )
            // InternalMyDsl.g:80:1: ruleParametroConexion EOF
            {
             before(grammarAccess.getParametroConexionRule()); 
            pushFollow(FOLLOW_1);
            ruleParametroConexion();

            state._fsp--;

             after(grammarAccess.getParametroConexionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametroConexion"


    // $ANTLR start "ruleParametroConexion"
    // InternalMyDsl.g:87:1: ruleParametroConexion : ( ( rule__ParametroConexion__Alternatives ) ) ;
    public final void ruleParametroConexion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ParametroConexion__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ParametroConexion__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ParametroConexion__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__ParametroConexion__Alternatives )
            {
             before(grammarAccess.getParametroConexionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__ParametroConexion__Alternatives )
            // InternalMyDsl.g:94:4: rule__ParametroConexion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParametroConexion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParametroConexionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametroConexion"


    // $ANTLR start "entryRuleRecurso"
    // InternalMyDsl.g:103:1: entryRuleRecurso : ruleRecurso EOF ;
    public final void entryRuleRecurso() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRecurso EOF )
            // InternalMyDsl.g:105:1: ruleRecurso EOF
            {
             before(grammarAccess.getRecursoRule()); 
            pushFollow(FOLLOW_1);
            ruleRecurso();

            state._fsp--;

             after(grammarAccess.getRecursoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecurso"


    // $ANTLR start "ruleRecurso"
    // InternalMyDsl.g:112:1: ruleRecurso : ( ( rule__Recurso__Alternatives ) ) ;
    public final void ruleRecurso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Recurso__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Recurso__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Recurso__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Recurso__Alternatives )
            {
             before(grammarAccess.getRecursoAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Recurso__Alternatives )
            // InternalMyDsl.g:119:4: rule__Recurso__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Recurso__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRecursoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecurso"


    // $ANTLR start "entryRuleMecanismoSeguridad"
    // InternalMyDsl.g:128:1: entryRuleMecanismoSeguridad : ruleMecanismoSeguridad EOF ;
    public final void entryRuleMecanismoSeguridad() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleMecanismoSeguridad EOF )
            // InternalMyDsl.g:130:1: ruleMecanismoSeguridad EOF
            {
             before(grammarAccess.getMecanismoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            ruleMecanismoSeguridad();

            state._fsp--;

             after(grammarAccess.getMecanismoSeguridadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMecanismoSeguridad"


    // $ANTLR start "ruleMecanismoSeguridad"
    // InternalMyDsl.g:137:1: ruleMecanismoSeguridad : ( ( rule__MecanismoSeguridad__Alternatives ) ) ;
    public final void ruleMecanismoSeguridad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__MecanismoSeguridad__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__MecanismoSeguridad__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__MecanismoSeguridad__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__MecanismoSeguridad__Alternatives )
            {
             before(grammarAccess.getMecanismoSeguridadAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__MecanismoSeguridad__Alternatives )
            // InternalMyDsl.g:144:4: rule__MecanismoSeguridad__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MecanismoSeguridad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMecanismoSeguridadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMecanismoSeguridad"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEString EOF )
            // InternalMyDsl.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProveedor"
    // InternalMyDsl.g:178:1: entryRuleProveedor : ruleProveedor EOF ;
    public final void entryRuleProveedor() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleProveedor EOF )
            // InternalMyDsl.g:180:1: ruleProveedor EOF
            {
             before(grammarAccess.getProveedorRule()); 
            pushFollow(FOLLOW_1);
            ruleProveedor();

            state._fsp--;

             after(grammarAccess.getProveedorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProveedor"


    // $ANTLR start "ruleProveedor"
    // InternalMyDsl.g:187:1: ruleProveedor : ( ( rule__Proveedor__Group__0 ) ) ;
    public final void ruleProveedor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Proveedor__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Proveedor__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Proveedor__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Proveedor__Group__0 )
            {
             before(grammarAccess.getProveedorAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Proveedor__Group__0 )
            // InternalMyDsl.g:194:4: rule__Proveedor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProveedor"


    // $ANTLR start "entryRuleAmbienteDespliegue"
    // InternalMyDsl.g:203:1: entryRuleAmbienteDespliegue : ruleAmbienteDespliegue EOF ;
    public final void entryRuleAmbienteDespliegue() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAmbienteDespliegue EOF )
            // InternalMyDsl.g:205:1: ruleAmbienteDespliegue EOF
            {
             before(grammarAccess.getAmbienteDespliegueRule()); 
            pushFollow(FOLLOW_1);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAmbienteDespliegue"


    // $ANTLR start "ruleAmbienteDespliegue"
    // InternalMyDsl.g:212:1: ruleAmbienteDespliegue : ( ( rule__AmbienteDespliegue__Group__0 ) ) ;
    public final void ruleAmbienteDespliegue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AmbienteDespliegue__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AmbienteDespliegue__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AmbienteDespliegue__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__AmbienteDespliegue__Group__0 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__AmbienteDespliegue__Group__0 )
            // InternalMyDsl.g:219:4: rule__AmbienteDespliegue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmbienteDespliegue"


    // $ANTLR start "entryRuleUsuarioPassword"
    // InternalMyDsl.g:228:1: entryRuleUsuarioPassword : ruleUsuarioPassword EOF ;
    public final void entryRuleUsuarioPassword() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleUsuarioPassword EOF )
            // InternalMyDsl.g:230:1: ruleUsuarioPassword EOF
            {
             before(grammarAccess.getUsuarioPasswordRule()); 
            pushFollow(FOLLOW_1);
            ruleUsuarioPassword();

            state._fsp--;

             after(grammarAccess.getUsuarioPasswordRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUsuarioPassword"


    // $ANTLR start "ruleUsuarioPassword"
    // InternalMyDsl.g:237:1: ruleUsuarioPassword : ( ( rule__UsuarioPassword__Group__0 ) ) ;
    public final void ruleUsuarioPassword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__UsuarioPassword__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__UsuarioPassword__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__UsuarioPassword__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__UsuarioPassword__Group__0 )
            {
             before(grammarAccess.getUsuarioPasswordAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__UsuarioPassword__Group__0 )
            // InternalMyDsl.g:244:4: rule__UsuarioPassword__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsuarioPasswordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsuarioPassword"


    // $ANTLR start "entryRuleLlave"
    // InternalMyDsl.g:253:1: entryRuleLlave : ruleLlave EOF ;
    public final void entryRuleLlave() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleLlave EOF )
            // InternalMyDsl.g:255:1: ruleLlave EOF
            {
             before(grammarAccess.getLlaveRule()); 
            pushFollow(FOLLOW_1);
            ruleLlave();

            state._fsp--;

             after(grammarAccess.getLlaveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLlave"


    // $ANTLR start "ruleLlave"
    // InternalMyDsl.g:262:1: ruleLlave : ( ( rule__Llave__Group__0 ) ) ;
    public final void ruleLlave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Llave__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Llave__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Llave__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Llave__Group__0 )
            {
             before(grammarAccess.getLlaveAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Llave__Group__0 )
            // InternalMyDsl.g:269:4: rule__Llave__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Llave__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLlaveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLlave"


    // $ANTLR start "entryRuleConexion"
    // InternalMyDsl.g:278:1: entryRuleConexion : ruleConexion EOF ;
    public final void entryRuleConexion() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleConexion EOF )
            // InternalMyDsl.g:280:1: ruleConexion EOF
            {
             before(grammarAccess.getConexionRule()); 
            pushFollow(FOLLOW_1);
            ruleConexion();

            state._fsp--;

             after(grammarAccess.getConexionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConexion"


    // $ANTLR start "ruleConexion"
    // InternalMyDsl.g:287:1: ruleConexion : ( ( rule__Conexion__Group__0 ) ) ;
    public final void ruleConexion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Conexion__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Conexion__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Conexion__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Conexion__Group__0 )
            {
             before(grammarAccess.getConexionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Conexion__Group__0 )
            // InternalMyDsl.g:294:4: rule__Conexion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConexionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConexion"


    // $ANTLR start "entryRuleVPC"
    // InternalMyDsl.g:303:1: entryRuleVPC : ruleVPC EOF ;
    public final void entryRuleVPC() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleVPC EOF )
            // InternalMyDsl.g:305:1: ruleVPC EOF
            {
             before(grammarAccess.getVPCRule()); 
            pushFollow(FOLLOW_1);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getVPCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVPC"


    // $ANTLR start "ruleVPC"
    // InternalMyDsl.g:312:1: ruleVPC : ( ( rule__VPC__Group__0 ) ) ;
    public final void ruleVPC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__VPC__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__VPC__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__VPC__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__VPC__Group__0 )
            {
             before(grammarAccess.getVPCAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__VPC__Group__0 )
            // InternalMyDsl.g:319:4: rule__VPC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVPC"


    // $ANTLR start "entryRuleServidorAplicaciones"
    // InternalMyDsl.g:328:1: entryRuleServidorAplicaciones : ruleServidorAplicaciones EOF ;
    public final void entryRuleServidorAplicaciones() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleServidorAplicaciones EOF )
            // InternalMyDsl.g:330:1: ruleServidorAplicaciones EOF
            {
             before(grammarAccess.getServidorAplicacionesRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorAplicaciones();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorAplicaciones"


    // $ANTLR start "ruleServidorAplicaciones"
    // InternalMyDsl.g:337:1: ruleServidorAplicaciones : ( ( rule__ServidorAplicaciones__Group__0 ) ) ;
    public final void ruleServidorAplicaciones() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ServidorAplicaciones__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ServidorAplicaciones__Group__0 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ServidorAplicaciones__Group__0 )
            // InternalMyDsl.g:344:4: rule__ServidorAplicaciones__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorAplicaciones"


    // $ANTLR start "entryRuleServidorAlmacenamiento"
    // InternalMyDsl.g:353:1: entryRuleServidorAlmacenamiento : ruleServidorAlmacenamiento EOF ;
    public final void entryRuleServidorAlmacenamiento() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleServidorAlmacenamiento EOF )
            // InternalMyDsl.g:355:1: ruleServidorAlmacenamiento EOF
            {
             before(grammarAccess.getServidorAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorAlmacenamiento();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorAlmacenamiento"


    // $ANTLR start "ruleServidorAlmacenamiento"
    // InternalMyDsl.g:362:1: ruleServidorAlmacenamiento : ( ( rule__ServidorAlmacenamiento__Group__0 ) ) ;
    public final void ruleServidorAlmacenamiento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ServidorAlmacenamiento__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ServidorAlmacenamiento__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ServidorAlmacenamiento__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ServidorAlmacenamiento__Group__0 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ServidorAlmacenamiento__Group__0 )
            // InternalMyDsl.g:369:4: rule__ServidorAlmacenamiento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorAlmacenamiento"


    // $ANTLR start "entryRuleBaseDatosSQL"
    // InternalMyDsl.g:378:1: entryRuleBaseDatosSQL : ruleBaseDatosSQL EOF ;
    public final void entryRuleBaseDatosSQL() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleBaseDatosSQL EOF )
            // InternalMyDsl.g:380:1: ruleBaseDatosSQL EOF
            {
             before(grammarAccess.getBaseDatosSQLRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseDatosSQL();

            state._fsp--;

             after(grammarAccess.getBaseDatosSQLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseDatosSQL"


    // $ANTLR start "ruleBaseDatosSQL"
    // InternalMyDsl.g:387:1: ruleBaseDatosSQL : ( ( rule__BaseDatosSQL__Group__0 ) ) ;
    public final void ruleBaseDatosSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__BaseDatosSQL__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__BaseDatosSQL__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__BaseDatosSQL__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__BaseDatosSQL__Group__0 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__BaseDatosSQL__Group__0 )
            // InternalMyDsl.g:394:4: rule__BaseDatosSQL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosSQLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseDatosSQL"


    // $ANTLR start "entryRuleBaseDatosNoSQL"
    // InternalMyDsl.g:403:1: entryRuleBaseDatosNoSQL : ruleBaseDatosNoSQL EOF ;
    public final void entryRuleBaseDatosNoSQL() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleBaseDatosNoSQL EOF )
            // InternalMyDsl.g:405:1: ruleBaseDatosNoSQL EOF
            {
             before(grammarAccess.getBaseDatosNoSQLRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseDatosNoSQL();

            state._fsp--;

             after(grammarAccess.getBaseDatosNoSQLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseDatosNoSQL"


    // $ANTLR start "ruleBaseDatosNoSQL"
    // InternalMyDsl.g:412:1: ruleBaseDatosNoSQL : ( ( rule__BaseDatosNoSQL__Group__0 ) ) ;
    public final void ruleBaseDatosNoSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__BaseDatosNoSQL__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__BaseDatosNoSQL__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__BaseDatosNoSQL__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__BaseDatosNoSQL__Group__0 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__BaseDatosNoSQL__Group__0 )
            // InternalMyDsl.g:419:4: rule__BaseDatosNoSQL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseDatosNoSQL"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:428:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleEInt EOF )
            // InternalMyDsl.g:430:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:437:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:444:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInternetGateway"
    // InternalMyDsl.g:453:1: entryRuleInternetGateway : ruleInternetGateway EOF ;
    public final void entryRuleInternetGateway() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleInternetGateway EOF )
            // InternalMyDsl.g:455:1: ruleInternetGateway EOF
            {
             before(grammarAccess.getInternetGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleInternetGateway();

            state._fsp--;

             after(grammarAccess.getInternetGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternetGateway"


    // $ANTLR start "ruleInternetGateway"
    // InternalMyDsl.g:462:1: ruleInternetGateway : ( ( rule__InternetGateway__Group__0 ) ) ;
    public final void ruleInternetGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__InternetGateway__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__InternetGateway__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__InternetGateway__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__InternetGateway__Group__0 )
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__InternetGateway__Group__0 )
            // InternalMyDsl.g:469:4: rule__InternetGateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternetGateway"


    // $ANTLR start "entryRuleSubred"
    // InternalMyDsl.g:478:1: entryRuleSubred : ruleSubred EOF ;
    public final void entryRuleSubred() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleSubred EOF )
            // InternalMyDsl.g:480:1: ruleSubred EOF
            {
             before(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            ruleSubred();

            state._fsp--;

             after(grammarAccess.getSubredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalMyDsl.g:487:1: ruleSubred : ( ( rule__Subred__Group__0 ) ) ;
    public final void ruleSubred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Subred__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Subred__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Subred__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Subred__Group__0 )
            {
             before(grammarAccess.getSubredAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Subred__Group__0 )
            // InternalMyDsl.g:494:4: rule__Subred__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleGrupoSeguridad"
    // InternalMyDsl.g:503:1: entryRuleGrupoSeguridad : ruleGrupoSeguridad EOF ;
    public final void entryRuleGrupoSeguridad() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleGrupoSeguridad EOF )
            // InternalMyDsl.g:505:1: ruleGrupoSeguridad EOF
            {
             before(grammarAccess.getGrupoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            ruleGrupoSeguridad();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrupoSeguridad"


    // $ANTLR start "ruleGrupoSeguridad"
    // InternalMyDsl.g:512:1: ruleGrupoSeguridad : ( ( rule__GrupoSeguridad__Group__0 ) ) ;
    public final void ruleGrupoSeguridad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__GrupoSeguridad__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__GrupoSeguridad__Group__0 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__GrupoSeguridad__Group__0 )
            // InternalMyDsl.g:519:4: rule__GrupoSeguridad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrupoSeguridad"


    // $ANTLR start "entryRuleRegla"
    // InternalMyDsl.g:528:1: entryRuleRegla : ruleRegla EOF ;
    public final void entryRuleRegla() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleRegla EOF )
            // InternalMyDsl.g:530:1: ruleRegla EOF
            {
             before(grammarAccess.getReglaRule()); 
            pushFollow(FOLLOW_1);
            ruleRegla();

            state._fsp--;

             after(grammarAccess.getReglaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegla"


    // $ANTLR start "ruleRegla"
    // InternalMyDsl.g:537:1: ruleRegla : ( ( rule__Regla__Group__0 ) ) ;
    public final void ruleRegla() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Regla__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Regla__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Regla__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Regla__Group__0 )
            {
             before(grammarAccess.getReglaAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Regla__Group__0 )
            // InternalMyDsl.g:544:4: rule__Regla__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Regla__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegla"


    // $ANTLR start "ruleNombreAmbiente"
    // InternalMyDsl.g:553:1: ruleNombreAmbiente : ( ( rule__NombreAmbiente__Alternatives ) ) ;
    public final void ruleNombreAmbiente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( ( rule__NombreAmbiente__Alternatives ) ) )
            // InternalMyDsl.g:558:2: ( ( rule__NombreAmbiente__Alternatives ) )
            {
            // InternalMyDsl.g:558:2: ( ( rule__NombreAmbiente__Alternatives ) )
            // InternalMyDsl.g:559:3: ( rule__NombreAmbiente__Alternatives )
            {
             before(grammarAccess.getNombreAmbienteAccess().getAlternatives()); 
            // InternalMyDsl.g:560:3: ( rule__NombreAmbiente__Alternatives )
            // InternalMyDsl.g:560:4: rule__NombreAmbiente__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NombreAmbiente__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNombreAmbienteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNombreAmbiente"


    // $ANTLR start "ruleTamanioServidor"
    // InternalMyDsl.g:569:1: ruleTamanioServidor : ( ( rule__TamanioServidor__Alternatives ) ) ;
    public final void ruleTamanioServidor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( ( ( rule__TamanioServidor__Alternatives ) ) )
            // InternalMyDsl.g:574:2: ( ( rule__TamanioServidor__Alternatives ) )
            {
            // InternalMyDsl.g:574:2: ( ( rule__TamanioServidor__Alternatives ) )
            // InternalMyDsl.g:575:3: ( rule__TamanioServidor__Alternatives )
            {
             before(grammarAccess.getTamanioServidorAccess().getAlternatives()); 
            // InternalMyDsl.g:576:3: ( rule__TamanioServidor__Alternatives )
            // InternalMyDsl.g:576:4: rule__TamanioServidor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TamanioServidor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTamanioServidorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamanioServidor"


    // $ANTLR start "ruleSistemaOperativo"
    // InternalMyDsl.g:585:1: ruleSistemaOperativo : ( ( rule__SistemaOperativo__Alternatives ) ) ;
    public final void ruleSistemaOperativo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( ( rule__SistemaOperativo__Alternatives ) ) )
            // InternalMyDsl.g:590:2: ( ( rule__SistemaOperativo__Alternatives ) )
            {
            // InternalMyDsl.g:590:2: ( ( rule__SistemaOperativo__Alternatives ) )
            // InternalMyDsl.g:591:3: ( rule__SistemaOperativo__Alternatives )
            {
             before(grammarAccess.getSistemaOperativoAccess().getAlternatives()); 
            // InternalMyDsl.g:592:3: ( rule__SistemaOperativo__Alternatives )
            // InternalMyDsl.g:592:4: rule__SistemaOperativo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SistemaOperativo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSistemaOperativo"


    // $ANTLR start "ruleManejadorSQL"
    // InternalMyDsl.g:601:1: ruleManejadorSQL : ( ( rule__ManejadorSQL__Alternatives ) ) ;
    public final void ruleManejadorSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ( rule__ManejadorSQL__Alternatives ) ) )
            // InternalMyDsl.g:606:2: ( ( rule__ManejadorSQL__Alternatives ) )
            {
            // InternalMyDsl.g:606:2: ( ( rule__ManejadorSQL__Alternatives ) )
            // InternalMyDsl.g:607:3: ( rule__ManejadorSQL__Alternatives )
            {
             before(grammarAccess.getManejadorSQLAccess().getAlternatives()); 
            // InternalMyDsl.g:608:3: ( rule__ManejadorSQL__Alternatives )
            // InternalMyDsl.g:608:4: rule__ManejadorSQL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ManejadorSQL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getManejadorSQLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManejadorSQL"


    // $ANTLR start "ruleManejadorNoSQL"
    // InternalMyDsl.g:617:1: ruleManejadorNoSQL : ( ( rule__ManejadorNoSQL__Alternatives ) ) ;
    public final void ruleManejadorNoSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ( rule__ManejadorNoSQL__Alternatives ) ) )
            // InternalMyDsl.g:622:2: ( ( rule__ManejadorNoSQL__Alternatives ) )
            {
            // InternalMyDsl.g:622:2: ( ( rule__ManejadorNoSQL__Alternatives ) )
            // InternalMyDsl.g:623:3: ( rule__ManejadorNoSQL__Alternatives )
            {
             before(grammarAccess.getManejadorNoSQLAccess().getAlternatives()); 
            // InternalMyDsl.g:624:3: ( rule__ManejadorNoSQL__Alternatives )
            // InternalMyDsl.g:624:4: rule__ManejadorNoSQL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ManejadorNoSQL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getManejadorNoSQLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManejadorNoSQL"


    // $ANTLR start "ruleProtocolo"
    // InternalMyDsl.g:633:1: ruleProtocolo : ( ( rule__Protocolo__Alternatives ) ) ;
    public final void ruleProtocolo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( ( rule__Protocolo__Alternatives ) ) )
            // InternalMyDsl.g:638:2: ( ( rule__Protocolo__Alternatives ) )
            {
            // InternalMyDsl.g:638:2: ( ( rule__Protocolo__Alternatives ) )
            // InternalMyDsl.g:639:3: ( rule__Protocolo__Alternatives )
            {
             before(grammarAccess.getProtocoloAccess().getAlternatives()); 
            // InternalMyDsl.g:640:3: ( rule__Protocolo__Alternatives )
            // InternalMyDsl.g:640:4: rule__Protocolo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Protocolo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocoloAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocolo"


    // $ANTLR start "rule__ParametroConexion__Alternatives"
    // InternalMyDsl.g:648:1: rule__ParametroConexion__Alternatives : ( ( ruleUsuarioPassword ) | ( ruleLlave ) );
    public final void rule__ParametroConexion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( ( ruleUsuarioPassword ) | ( ruleLlave ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==47) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:653:2: ( ruleUsuarioPassword )
                    {
                    // InternalMyDsl.g:653:2: ( ruleUsuarioPassword )
                    // InternalMyDsl.g:654:3: ruleUsuarioPassword
                    {
                     before(grammarAccess.getParametroConexionAccess().getUsuarioPasswordParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUsuarioPassword();

                    state._fsp--;

                     after(grammarAccess.getParametroConexionAccess().getUsuarioPasswordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:659:2: ( ruleLlave )
                    {
                    // InternalMyDsl.g:659:2: ( ruleLlave )
                    // InternalMyDsl.g:660:3: ruleLlave
                    {
                     before(grammarAccess.getParametroConexionAccess().getLlaveParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLlave();

                    state._fsp--;

                     after(grammarAccess.getParametroConexionAccess().getLlaveParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametroConexion__Alternatives"


    // $ANTLR start "rule__Recurso__Alternatives"
    // InternalMyDsl.g:669:1: rule__Recurso__Alternatives : ( ( ruleServidorAplicaciones ) | ( ruleServidorAlmacenamiento ) | ( ruleBaseDatosSQL ) | ( ruleBaseDatosNoSQL ) );
    public final void rule__Recurso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( ruleServidorAplicaciones ) | ( ruleServidorAlmacenamiento ) | ( ruleBaseDatosSQL ) | ( ruleBaseDatosNoSQL ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt2=1;
                }
                break;
            case 58:
                {
                alt2=2;
                }
                break;
            case 60:
                {
                alt2=3;
                }
                break;
            case 62:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:674:2: ( ruleServidorAplicaciones )
                    {
                    // InternalMyDsl.g:674:2: ( ruleServidorAplicaciones )
                    // InternalMyDsl.g:675:3: ruleServidorAplicaciones
                    {
                     before(grammarAccess.getRecursoAccess().getServidorAplicacionesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleServidorAplicaciones();

                    state._fsp--;

                     after(grammarAccess.getRecursoAccess().getServidorAplicacionesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:680:2: ( ruleServidorAlmacenamiento )
                    {
                    // InternalMyDsl.g:680:2: ( ruleServidorAlmacenamiento )
                    // InternalMyDsl.g:681:3: ruleServidorAlmacenamiento
                    {
                     before(grammarAccess.getRecursoAccess().getServidorAlmacenamientoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleServidorAlmacenamiento();

                    state._fsp--;

                     after(grammarAccess.getRecursoAccess().getServidorAlmacenamientoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:686:2: ( ruleBaseDatosSQL )
                    {
                    // InternalMyDsl.g:686:2: ( ruleBaseDatosSQL )
                    // InternalMyDsl.g:687:3: ruleBaseDatosSQL
                    {
                     before(grammarAccess.getRecursoAccess().getBaseDatosSQLParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseDatosSQL();

                    state._fsp--;

                     after(grammarAccess.getRecursoAccess().getBaseDatosSQLParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:692:2: ( ruleBaseDatosNoSQL )
                    {
                    // InternalMyDsl.g:692:2: ( ruleBaseDatosNoSQL )
                    // InternalMyDsl.g:693:3: ruleBaseDatosNoSQL
                    {
                     before(grammarAccess.getRecursoAccess().getBaseDatosNoSQLParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseDatosNoSQL();

                    state._fsp--;

                     after(grammarAccess.getRecursoAccess().getBaseDatosNoSQLParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurso__Alternatives"


    // $ANTLR start "rule__MecanismoSeguridad__Alternatives"
    // InternalMyDsl.g:702:1: rule__MecanismoSeguridad__Alternatives : ( ( ruleInternetGateway ) | ( ruleSubred ) | ( ruleGrupoSeguridad ) );
    public final void rule__MecanismoSeguridad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( ruleInternetGateway ) | ( ruleSubred ) | ( ruleGrupoSeguridad ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt3=1;
                }
                break;
            case 65:
                {
                alt3=2;
                }
                break;
            case 68:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:707:2: ( ruleInternetGateway )
                    {
                    // InternalMyDsl.g:707:2: ( ruleInternetGateway )
                    // InternalMyDsl.g:708:3: ruleInternetGateway
                    {
                     before(grammarAccess.getMecanismoSeguridadAccess().getInternetGatewayParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInternetGateway();

                    state._fsp--;

                     after(grammarAccess.getMecanismoSeguridadAccess().getInternetGatewayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:713:2: ( ruleSubred )
                    {
                    // InternalMyDsl.g:713:2: ( ruleSubred )
                    // InternalMyDsl.g:714:3: ruleSubred
                    {
                     before(grammarAccess.getMecanismoSeguridadAccess().getSubredParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubred();

                    state._fsp--;

                     after(grammarAccess.getMecanismoSeguridadAccess().getSubredParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:719:2: ( ruleGrupoSeguridad )
                    {
                    // InternalMyDsl.g:719:2: ( ruleGrupoSeguridad )
                    // InternalMyDsl.g:720:3: ruleGrupoSeguridad
                    {
                     before(grammarAccess.getMecanismoSeguridadAccess().getGrupoSeguridadParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGrupoSeguridad();

                    state._fsp--;

                     after(grammarAccess.getMecanismoSeguridadAccess().getGrupoSeguridadParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MecanismoSeguridad__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:729:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:734:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:734:2: ( RULE_STRING )
                    // InternalMyDsl.g:735:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:740:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:740:2: ( RULE_ID )
                    // InternalMyDsl.g:741:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__NombreAmbiente__Alternatives"
    // InternalMyDsl.g:750:1: rule__NombreAmbiente__Alternatives : ( ( ( 'DESARROLLO' ) ) | ( ( 'PRUEBAS' ) ) | ( ( 'QA' ) ) | ( ( 'PRODUCCION' ) ) );
    public final void rule__NombreAmbiente__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( ( 'DESARROLLO' ) ) | ( ( 'PRUEBAS' ) ) | ( ( 'QA' ) ) | ( ( 'PRODUCCION' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:755:2: ( ( 'DESARROLLO' ) )
                    {
                    // InternalMyDsl.g:755:2: ( ( 'DESARROLLO' ) )
                    // InternalMyDsl.g:756:3: ( 'DESARROLLO' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:757:3: ( 'DESARROLLO' )
                    // InternalMyDsl.g:757:4: 'DESARROLLO'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:761:2: ( ( 'PRUEBAS' ) )
                    {
                    // InternalMyDsl.g:761:2: ( ( 'PRUEBAS' ) )
                    // InternalMyDsl.g:762:3: ( 'PRUEBAS' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:763:3: ( 'PRUEBAS' )
                    // InternalMyDsl.g:763:4: 'PRUEBAS'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:767:2: ( ( 'QA' ) )
                    {
                    // InternalMyDsl.g:767:2: ( ( 'QA' ) )
                    // InternalMyDsl.g:768:3: ( 'QA' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:769:3: ( 'QA' )
                    // InternalMyDsl.g:769:4: 'QA'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:773:2: ( ( 'PRODUCCION' ) )
                    {
                    // InternalMyDsl.g:773:2: ( ( 'PRODUCCION' ) )
                    // InternalMyDsl.g:774:3: ( 'PRODUCCION' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:775:3: ( 'PRODUCCION' )
                    // InternalMyDsl.g:775:4: 'PRODUCCION'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreAmbiente__Alternatives"


    // $ANTLR start "rule__TamanioServidor__Alternatives"
    // InternalMyDsl.g:783:1: rule__TamanioServidor__Alternatives : ( ( ( 'MICRO' ) ) | ( ( 'SMALL' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LARGE' ) ) );
    public final void rule__TamanioServidor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( ( 'MICRO' ) ) | ( ( 'SMALL' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LARGE' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:788:2: ( ( 'MICRO' ) )
                    {
                    // InternalMyDsl.g:788:2: ( ( 'MICRO' ) )
                    // InternalMyDsl.g:789:3: ( 'MICRO' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:790:3: ( 'MICRO' )
                    // InternalMyDsl.g:790:4: 'MICRO'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:794:2: ( ( 'SMALL' ) )
                    {
                    // InternalMyDsl.g:794:2: ( ( 'SMALL' ) )
                    // InternalMyDsl.g:795:3: ( 'SMALL' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:796:3: ( 'SMALL' )
                    // InternalMyDsl.g:796:4: 'SMALL'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:800:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalMyDsl.g:800:2: ( ( 'MEDIUM' ) )
                    // InternalMyDsl.g:801:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:802:3: ( 'MEDIUM' )
                    // InternalMyDsl.g:802:4: 'MEDIUM'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:806:2: ( ( 'LARGE' ) )
                    {
                    // InternalMyDsl.g:806:2: ( ( 'LARGE' ) )
                    // InternalMyDsl.g:807:3: ( 'LARGE' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getLARGEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:808:3: ( 'LARGE' )
                    // InternalMyDsl.g:808:4: 'LARGE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioServidorAccess().getLARGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TamanioServidor__Alternatives"


    // $ANTLR start "rule__SistemaOperativo__Alternatives"
    // InternalMyDsl.g:816:1: rule__SistemaOperativo__Alternatives : ( ( ( 'Windows' ) ) | ( ( 'Ubuntu1804' ) ) );
    public final void rule__SistemaOperativo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( ( ( 'Windows' ) ) | ( ( 'Ubuntu1804' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:821:2: ( ( 'Windows' ) )
                    {
                    // InternalMyDsl.g:821:2: ( ( 'Windows' ) )
                    // InternalMyDsl.g:822:3: ( 'Windows' )
                    {
                     before(grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:823:3: ( 'Windows' )
                    // InternalMyDsl.g:823:4: 'Windows'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:827:2: ( ( 'Ubuntu1804' ) )
                    {
                    // InternalMyDsl.g:827:2: ( ( 'Ubuntu1804' ) )
                    // InternalMyDsl.g:828:3: ( 'Ubuntu1804' )
                    {
                     before(grammarAccess.getSistemaOperativoAccess().getUbuntu1804EnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:829:3: ( 'Ubuntu1804' )
                    // InternalMyDsl.g:829:4: 'Ubuntu1804'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaOperativoAccess().getUbuntu1804EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Alternatives"


    // $ANTLR start "rule__ManejadorSQL__Alternatives"
    // InternalMyDsl.g:837:1: rule__ManejadorSQL__Alternatives : ( ( ( 'POSTGRESQL' ) ) | ( ( 'MYSQL' ) ) | ( ( 'ORACLE' ) ) | ( ( 'SQLSERVER' ) ) );
    public final void rule__ManejadorSQL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ( 'POSTGRESQL' ) ) | ( ( 'MYSQL' ) ) | ( ( 'ORACLE' ) ) | ( ( 'SQLSERVER' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:842:2: ( ( 'POSTGRESQL' ) )
                    {
                    // InternalMyDsl.g:842:2: ( ( 'POSTGRESQL' ) )
                    // InternalMyDsl.g:843:3: ( 'POSTGRESQL' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:844:3: ( 'POSTGRESQL' )
                    // InternalMyDsl.g:844:4: 'POSTGRESQL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:848:2: ( ( 'MYSQL' ) )
                    {
                    // InternalMyDsl.g:848:2: ( ( 'MYSQL' ) )
                    // InternalMyDsl.g:849:3: ( 'MYSQL' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:850:3: ( 'MYSQL' )
                    // InternalMyDsl.g:850:4: 'MYSQL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:854:2: ( ( 'ORACLE' ) )
                    {
                    // InternalMyDsl.g:854:2: ( ( 'ORACLE' ) )
                    // InternalMyDsl.g:855:3: ( 'ORACLE' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:856:3: ( 'ORACLE' )
                    // InternalMyDsl.g:856:4: 'ORACLE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:860:2: ( ( 'SQLSERVER' ) )
                    {
                    // InternalMyDsl.g:860:2: ( ( 'SQLSERVER' ) )
                    // InternalMyDsl.g:861:3: ( 'SQLSERVER' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getSQLSERVEREnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:862:3: ( 'SQLSERVER' )
                    // InternalMyDsl.g:862:4: 'SQLSERVER'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorSQLAccess().getSQLSERVEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManejadorSQL__Alternatives"


    // $ANTLR start "rule__ManejadorNoSQL__Alternatives"
    // InternalMyDsl.g:870:1: rule__ManejadorNoSQL__Alternatives : ( ( ( 'MONGODB' ) ) | ( ( 'CASSANDRA' ) ) );
    public final void rule__ManejadorNoSQL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( ( ( 'MONGODB' ) ) | ( ( 'CASSANDRA' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:875:2: ( ( 'MONGODB' ) )
                    {
                    // InternalMyDsl.g:875:2: ( ( 'MONGODB' ) )
                    // InternalMyDsl.g:876:3: ( 'MONGODB' )
                    {
                     before(grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:877:3: ( 'MONGODB' )
                    // InternalMyDsl.g:877:4: 'MONGODB'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:881:2: ( ( 'CASSANDRA' ) )
                    {
                    // InternalMyDsl.g:881:2: ( ( 'CASSANDRA' ) )
                    // InternalMyDsl.g:882:3: ( 'CASSANDRA' )
                    {
                     before(grammarAccess.getManejadorNoSQLAccess().getCASSANDRAEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:883:3: ( 'CASSANDRA' )
                    // InternalMyDsl.g:883:4: 'CASSANDRA'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorNoSQLAccess().getCASSANDRAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManejadorNoSQL__Alternatives"


    // $ANTLR start "rule__Protocolo__Alternatives"
    // InternalMyDsl.g:891:1: rule__Protocolo__Alternatives : ( ( ( 'TCP' ) ) | ( ( 'UDP' ) ) );
    public final void rule__Protocolo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( ( ( 'TCP' ) ) | ( ( 'UDP' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:896:2: ( ( 'TCP' ) )
                    {
                    // InternalMyDsl.g:896:2: ( ( 'TCP' ) )
                    // InternalMyDsl.g:897:3: ( 'TCP' )
                    {
                     before(grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:898:3: ( 'TCP' )
                    // InternalMyDsl.g:898:4: 'TCP'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:902:2: ( ( 'UDP' ) )
                    {
                    // InternalMyDsl.g:902:2: ( ( 'UDP' ) )
                    // InternalMyDsl.g:903:3: ( 'UDP' )
                    {
                     before(grammarAccess.getProtocoloAccess().getUDPEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:904:3: ( 'UDP' )
                    // InternalMyDsl.g:904:4: 'UDP'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocoloAccess().getUDPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocolo__Alternatives"


    // $ANTLR start "rule__Infraestructura__Group__0"
    // InternalMyDsl.g:912:1: rule__Infraestructura__Group__0 : rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 ;
    public final void rule__Infraestructura__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 )
            // InternalMyDsl.g:917:2: rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Infraestructura__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__0"


    // $ANTLR start "rule__Infraestructura__Group__0__Impl"
    // InternalMyDsl.g:924:1: rule__Infraestructura__Group__0__Impl : ( 'Infraestructura' ) ;
    public final void rule__Infraestructura__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( 'Infraestructura' ) )
            // InternalMyDsl.g:929:1: ( 'Infraestructura' )
            {
            // InternalMyDsl.g:929:1: ( 'Infraestructura' )
            // InternalMyDsl.g:930:2: 'Infraestructura'
            {
             before(grammarAccess.getInfraestructuraAccess().getInfraestructuraKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getInfraestructuraKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group__1"
    // InternalMyDsl.g:939:1: rule__Infraestructura__Group__1 : rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 ;
    public final void rule__Infraestructura__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 )
            // InternalMyDsl.g:944:2: rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Infraestructura__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__1"


    // $ANTLR start "rule__Infraestructura__Group__1__Impl"
    // InternalMyDsl.g:951:1: rule__Infraestructura__Group__1__Impl : ( ( rule__Infraestructura__NombreAssignment_1 ) ) ;
    public final void rule__Infraestructura__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( ( rule__Infraestructura__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:956:1: ( ( rule__Infraestructura__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:956:1: ( ( rule__Infraestructura__NombreAssignment_1 ) )
            // InternalMyDsl.g:957:2: ( rule__Infraestructura__NombreAssignment_1 )
            {
             before(grammarAccess.getInfraestructuraAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:958:2: ( rule__Infraestructura__NombreAssignment_1 )
            // InternalMyDsl.g:958:3: rule__Infraestructura__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__1__Impl"


    // $ANTLR start "rule__Infraestructura__Group__2"
    // InternalMyDsl.g:966:1: rule__Infraestructura__Group__2 : rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 ;
    public final void rule__Infraestructura__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 )
            // InternalMyDsl.g:971:2: rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Infraestructura__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__2"


    // $ANTLR start "rule__Infraestructura__Group__2__Impl"
    // InternalMyDsl.g:978:1: rule__Infraestructura__Group__2__Impl : ( '{' ) ;
    public final void rule__Infraestructura__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( '{' ) )
            // InternalMyDsl.g:983:1: ( '{' )
            {
            // InternalMyDsl.g:983:1: ( '{' )
            // InternalMyDsl.g:984:2: '{'
            {
             before(grammarAccess.getInfraestructuraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__2__Impl"


    // $ANTLR start "rule__Infraestructura__Group__3"
    // InternalMyDsl.g:993:1: rule__Infraestructura__Group__3 : rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4 ;
    public final void rule__Infraestructura__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4 )
            // InternalMyDsl.g:998:2: rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Infraestructura__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__3"


    // $ANTLR start "rule__Infraestructura__Group__3__Impl"
    // InternalMyDsl.g:1005:1: rule__Infraestructura__Group__3__Impl : ( ( rule__Infraestructura__ProveedorAssignment_3 ) ) ;
    public final void rule__Infraestructura__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ( rule__Infraestructura__ProveedorAssignment_3 ) ) )
            // InternalMyDsl.g:1010:1: ( ( rule__Infraestructura__ProveedorAssignment_3 ) )
            {
            // InternalMyDsl.g:1010:1: ( ( rule__Infraestructura__ProveedorAssignment_3 ) )
            // InternalMyDsl.g:1011:2: ( rule__Infraestructura__ProveedorAssignment_3 )
            {
             before(grammarAccess.getInfraestructuraAccess().getProveedorAssignment_3()); 
            // InternalMyDsl.g:1012:2: ( rule__Infraestructura__ProveedorAssignment_3 )
            // InternalMyDsl.g:1012:3: rule__Infraestructura__ProveedorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__ProveedorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getProveedorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__3__Impl"


    // $ANTLR start "rule__Infraestructura__Group__4"
    // InternalMyDsl.g:1020:1: rule__Infraestructura__Group__4 : rule__Infraestructura__Group__4__Impl ;
    public final void rule__Infraestructura__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Infraestructura__Group__4__Impl )
            // InternalMyDsl.g:1025:2: rule__Infraestructura__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__4"


    // $ANTLR start "rule__Infraestructura__Group__4__Impl"
    // InternalMyDsl.g:1031:1: rule__Infraestructura__Group__4__Impl : ( '}' ) ;
    public final void rule__Infraestructura__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( ( '}' ) )
            // InternalMyDsl.g:1036:1: ( '}' )
            {
            // InternalMyDsl.g:1036:1: ( '}' )
            // InternalMyDsl.g:1037:2: '}'
            {
             before(grammarAccess.getInfraestructuraAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__4__Impl"


    // $ANTLR start "rule__Proveedor__Group__0"
    // InternalMyDsl.g:1047:1: rule__Proveedor__Group__0 : rule__Proveedor__Group__0__Impl rule__Proveedor__Group__1 ;
    public final void rule__Proveedor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Proveedor__Group__0__Impl rule__Proveedor__Group__1 )
            // InternalMyDsl.g:1052:2: rule__Proveedor__Group__0__Impl rule__Proveedor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Proveedor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__0"


    // $ANTLR start "rule__Proveedor__Group__0__Impl"
    // InternalMyDsl.g:1059:1: rule__Proveedor__Group__0__Impl : ( 'Tipo' ) ;
    public final void rule__Proveedor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( 'Tipo' ) )
            // InternalMyDsl.g:1064:1: ( 'Tipo' )
            {
            // InternalMyDsl.g:1064:1: ( 'Tipo' )
            // InternalMyDsl.g:1065:2: 'Tipo'
            {
             before(grammarAccess.getProveedorAccess().getTipoKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getTipoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__0__Impl"


    // $ANTLR start "rule__Proveedor__Group__1"
    // InternalMyDsl.g:1074:1: rule__Proveedor__Group__1 : rule__Proveedor__Group__1__Impl rule__Proveedor__Group__2 ;
    public final void rule__Proveedor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Proveedor__Group__1__Impl rule__Proveedor__Group__2 )
            // InternalMyDsl.g:1079:2: rule__Proveedor__Group__1__Impl rule__Proveedor__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Proveedor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__1"


    // $ANTLR start "rule__Proveedor__Group__1__Impl"
    // InternalMyDsl.g:1086:1: rule__Proveedor__Group__1__Impl : ( '=' ) ;
    public final void rule__Proveedor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( '=' ) )
            // InternalMyDsl.g:1091:1: ( '=' )
            {
            // InternalMyDsl.g:1091:1: ( '=' )
            // InternalMyDsl.g:1092:2: '='
            {
             before(grammarAccess.getProveedorAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__1__Impl"


    // $ANTLR start "rule__Proveedor__Group__2"
    // InternalMyDsl.g:1101:1: rule__Proveedor__Group__2 : rule__Proveedor__Group__2__Impl rule__Proveedor__Group__3 ;
    public final void rule__Proveedor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Proveedor__Group__2__Impl rule__Proveedor__Group__3 )
            // InternalMyDsl.g:1106:2: rule__Proveedor__Group__2__Impl rule__Proveedor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Proveedor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__2"


    // $ANTLR start "rule__Proveedor__Group__2__Impl"
    // InternalMyDsl.g:1113:1: rule__Proveedor__Group__2__Impl : ( ( rule__Proveedor__NombreAssignment_2 ) ) ;
    public final void rule__Proveedor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( ( rule__Proveedor__NombreAssignment_2 ) ) )
            // InternalMyDsl.g:1118:1: ( ( rule__Proveedor__NombreAssignment_2 ) )
            {
            // InternalMyDsl.g:1118:1: ( ( rule__Proveedor__NombreAssignment_2 ) )
            // InternalMyDsl.g:1119:2: ( rule__Proveedor__NombreAssignment_2 )
            {
             before(grammarAccess.getProveedorAccess().getNombreAssignment_2()); 
            // InternalMyDsl.g:1120:2: ( rule__Proveedor__NombreAssignment_2 )
            // InternalMyDsl.g:1120:3: rule__Proveedor__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__2__Impl"


    // $ANTLR start "rule__Proveedor__Group__3"
    // InternalMyDsl.g:1128:1: rule__Proveedor__Group__3 : rule__Proveedor__Group__3__Impl rule__Proveedor__Group__4 ;
    public final void rule__Proveedor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Proveedor__Group__3__Impl rule__Proveedor__Group__4 )
            // InternalMyDsl.g:1133:2: rule__Proveedor__Group__3__Impl rule__Proveedor__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Proveedor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__3"


    // $ANTLR start "rule__Proveedor__Group__3__Impl"
    // InternalMyDsl.g:1140:1: rule__Proveedor__Group__3__Impl : ( 'parametroConexion' ) ;
    public final void rule__Proveedor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( 'parametroConexion' ) )
            // InternalMyDsl.g:1145:1: ( 'parametroConexion' )
            {
            // InternalMyDsl.g:1145:1: ( 'parametroConexion' )
            // InternalMyDsl.g:1146:2: 'parametroConexion'
            {
             before(grammarAccess.getProveedorAccess().getParametroConexionKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getParametroConexionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__3__Impl"


    // $ANTLR start "rule__Proveedor__Group__4"
    // InternalMyDsl.g:1155:1: rule__Proveedor__Group__4 : rule__Proveedor__Group__4__Impl rule__Proveedor__Group__5 ;
    public final void rule__Proveedor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__Proveedor__Group__4__Impl rule__Proveedor__Group__5 )
            // InternalMyDsl.g:1160:2: rule__Proveedor__Group__4__Impl rule__Proveedor__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Proveedor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__4"


    // $ANTLR start "rule__Proveedor__Group__4__Impl"
    // InternalMyDsl.g:1167:1: rule__Proveedor__Group__4__Impl : ( '=' ) ;
    public final void rule__Proveedor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( '=' ) )
            // InternalMyDsl.g:1172:1: ( '=' )
            {
            // InternalMyDsl.g:1172:1: ( '=' )
            // InternalMyDsl.g:1173:2: '='
            {
             before(grammarAccess.getProveedorAccess().getEqualsSignKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__4__Impl"


    // $ANTLR start "rule__Proveedor__Group__5"
    // InternalMyDsl.g:1182:1: rule__Proveedor__Group__5 : rule__Proveedor__Group__5__Impl rule__Proveedor__Group__6 ;
    public final void rule__Proveedor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__Proveedor__Group__5__Impl rule__Proveedor__Group__6 )
            // InternalMyDsl.g:1187:2: rule__Proveedor__Group__5__Impl rule__Proveedor__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Proveedor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__5"


    // $ANTLR start "rule__Proveedor__Group__5__Impl"
    // InternalMyDsl.g:1194:1: rule__Proveedor__Group__5__Impl : ( ( rule__Proveedor__ParametroConexionAssignment_5 ) ) ;
    public final void rule__Proveedor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__Proveedor__ParametroConexionAssignment_5 ) ) )
            // InternalMyDsl.g:1199:1: ( ( rule__Proveedor__ParametroConexionAssignment_5 ) )
            {
            // InternalMyDsl.g:1199:1: ( ( rule__Proveedor__ParametroConexionAssignment_5 ) )
            // InternalMyDsl.g:1200:2: ( rule__Proveedor__ParametroConexionAssignment_5 )
            {
             before(grammarAccess.getProveedorAccess().getParametroConexionAssignment_5()); 
            // InternalMyDsl.g:1201:2: ( rule__Proveedor__ParametroConexionAssignment_5 )
            // InternalMyDsl.g:1201:3: rule__Proveedor__ParametroConexionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__ParametroConexionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getParametroConexionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__5__Impl"


    // $ANTLR start "rule__Proveedor__Group__6"
    // InternalMyDsl.g:1209:1: rule__Proveedor__Group__6 : rule__Proveedor__Group__6__Impl ;
    public final void rule__Proveedor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__Proveedor__Group__6__Impl )
            // InternalMyDsl.g:1214:2: rule__Proveedor__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__6"


    // $ANTLR start "rule__Proveedor__Group__6__Impl"
    // InternalMyDsl.g:1220:1: rule__Proveedor__Group__6__Impl : ( ( rule__Proveedor__Group_6__0 )? ) ;
    public final void rule__Proveedor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ( rule__Proveedor__Group_6__0 )? ) )
            // InternalMyDsl.g:1225:1: ( ( rule__Proveedor__Group_6__0 )? )
            {
            // InternalMyDsl.g:1225:1: ( ( rule__Proveedor__Group_6__0 )? )
            // InternalMyDsl.g:1226:2: ( rule__Proveedor__Group_6__0 )?
            {
             before(grammarAccess.getProveedorAccess().getGroup_6()); 
            // InternalMyDsl.g:1227:2: ( rule__Proveedor__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1227:3: rule__Proveedor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Proveedor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__6__Impl"


    // $ANTLR start "rule__Proveedor__Group_6__0"
    // InternalMyDsl.g:1236:1: rule__Proveedor__Group_6__0 : rule__Proveedor__Group_6__0__Impl rule__Proveedor__Group_6__1 ;
    public final void rule__Proveedor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__Proveedor__Group_6__0__Impl rule__Proveedor__Group_6__1 )
            // InternalMyDsl.g:1241:2: rule__Proveedor__Group_6__0__Impl rule__Proveedor__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Proveedor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__0"


    // $ANTLR start "rule__Proveedor__Group_6__0__Impl"
    // InternalMyDsl.g:1248:1: rule__Proveedor__Group_6__0__Impl : ( 'ambientes' ) ;
    public final void rule__Proveedor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( 'ambientes' ) )
            // InternalMyDsl.g:1253:1: ( 'ambientes' )
            {
            // InternalMyDsl.g:1253:1: ( 'ambientes' )
            // InternalMyDsl.g:1254:2: 'ambientes'
            {
             before(grammarAccess.getProveedorAccess().getAmbientesKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getAmbientesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__0__Impl"


    // $ANTLR start "rule__Proveedor__Group_6__1"
    // InternalMyDsl.g:1263:1: rule__Proveedor__Group_6__1 : rule__Proveedor__Group_6__1__Impl rule__Proveedor__Group_6__2 ;
    public final void rule__Proveedor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__Proveedor__Group_6__1__Impl rule__Proveedor__Group_6__2 )
            // InternalMyDsl.g:1268:2: rule__Proveedor__Group_6__1__Impl rule__Proveedor__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Proveedor__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__1"


    // $ANTLR start "rule__Proveedor__Group_6__1__Impl"
    // InternalMyDsl.g:1275:1: rule__Proveedor__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Proveedor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( '=' ) )
            // InternalMyDsl.g:1280:1: ( '=' )
            {
            // InternalMyDsl.g:1280:1: ( '=' )
            // InternalMyDsl.g:1281:2: '='
            {
             before(grammarAccess.getProveedorAccess().getEqualsSignKeyword_6_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__1__Impl"


    // $ANTLR start "rule__Proveedor__Group_6__2"
    // InternalMyDsl.g:1290:1: rule__Proveedor__Group_6__2 : rule__Proveedor__Group_6__2__Impl rule__Proveedor__Group_6__3 ;
    public final void rule__Proveedor__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__Proveedor__Group_6__2__Impl rule__Proveedor__Group_6__3 )
            // InternalMyDsl.g:1295:2: rule__Proveedor__Group_6__2__Impl rule__Proveedor__Group_6__3
            {
            pushFollow(FOLLOW_4);
            rule__Proveedor__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__2"


    // $ANTLR start "rule__Proveedor__Group_6__2__Impl"
    // InternalMyDsl.g:1302:1: rule__Proveedor__Group_6__2__Impl : ( '[' ) ;
    public final void rule__Proveedor__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( '[' ) )
            // InternalMyDsl.g:1307:1: ( '[' )
            {
            // InternalMyDsl.g:1307:1: ( '[' )
            // InternalMyDsl.g:1308:2: '['
            {
             before(grammarAccess.getProveedorAccess().getLeftSquareBracketKeyword_6_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getLeftSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__2__Impl"


    // $ANTLR start "rule__Proveedor__Group_6__3"
    // InternalMyDsl.g:1317:1: rule__Proveedor__Group_6__3 : rule__Proveedor__Group_6__3__Impl rule__Proveedor__Group_6__4 ;
    public final void rule__Proveedor__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__Proveedor__Group_6__3__Impl rule__Proveedor__Group_6__4 )
            // InternalMyDsl.g:1322:2: rule__Proveedor__Group_6__3__Impl rule__Proveedor__Group_6__4
            {
            pushFollow(FOLLOW_12);
            rule__Proveedor__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__3"


    // $ANTLR start "rule__Proveedor__Group_6__3__Impl"
    // InternalMyDsl.g:1329:1: rule__Proveedor__Group_6__3__Impl : ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_3 ) ) ;
    public final void rule__Proveedor__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_3 ) ) )
            // InternalMyDsl.g:1334:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_3 ) )
            {
            // InternalMyDsl.g:1334:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_3 ) )
            // InternalMyDsl.g:1335:2: ( rule__Proveedor__AmbientesDespliegueAssignment_6_3 )
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_6_3()); 
            // InternalMyDsl.g:1336:2: ( rule__Proveedor__AmbientesDespliegueAssignment_6_3 )
            // InternalMyDsl.g:1336:3: rule__Proveedor__AmbientesDespliegueAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__AmbientesDespliegueAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__3__Impl"


    // $ANTLR start "rule__Proveedor__Group_6__4"
    // InternalMyDsl.g:1344:1: rule__Proveedor__Group_6__4 : rule__Proveedor__Group_6__4__Impl rule__Proveedor__Group_6__5 ;
    public final void rule__Proveedor__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__Proveedor__Group_6__4__Impl rule__Proveedor__Group_6__5 )
            // InternalMyDsl.g:1349:2: rule__Proveedor__Group_6__4__Impl rule__Proveedor__Group_6__5
            {
            pushFollow(FOLLOW_12);
            rule__Proveedor__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__4"


    // $ANTLR start "rule__Proveedor__Group_6__4__Impl"
    // InternalMyDsl.g:1356:1: rule__Proveedor__Group_6__4__Impl : ( ( rule__Proveedor__Group_6_4__0 )* ) ;
    public final void rule__Proveedor__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( ( rule__Proveedor__Group_6_4__0 )* ) )
            // InternalMyDsl.g:1361:1: ( ( rule__Proveedor__Group_6_4__0 )* )
            {
            // InternalMyDsl.g:1361:1: ( ( rule__Proveedor__Group_6_4__0 )* )
            // InternalMyDsl.g:1362:2: ( rule__Proveedor__Group_6_4__0 )*
            {
             before(grammarAccess.getProveedorAccess().getGroup_6_4()); 
            // InternalMyDsl.g:1363:2: ( rule__Proveedor__Group_6_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1363:3: rule__Proveedor__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Proveedor__Group_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProveedorAccess().getGroup_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__4__Impl"


    // $ANTLR start "rule__Proveedor__Group_6__5"
    // InternalMyDsl.g:1371:1: rule__Proveedor__Group_6__5 : rule__Proveedor__Group_6__5__Impl ;
    public final void rule__Proveedor__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__Proveedor__Group_6__5__Impl )
            // InternalMyDsl.g:1376:2: rule__Proveedor__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__5"


    // $ANTLR start "rule__Proveedor__Group_6__5__Impl"
    // InternalMyDsl.g:1382:1: rule__Proveedor__Group_6__5__Impl : ( ']' ) ;
    public final void rule__Proveedor__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ']' ) )
            // InternalMyDsl.g:1387:1: ( ']' )
            {
            // InternalMyDsl.g:1387:1: ( ']' )
            // InternalMyDsl.g:1388:2: ']'
            {
             before(grammarAccess.getProveedorAccess().getRightSquareBracketKeyword_6_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getRightSquareBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6__5__Impl"


    // $ANTLR start "rule__Proveedor__Group_6_4__0"
    // InternalMyDsl.g:1398:1: rule__Proveedor__Group_6_4__0 : rule__Proveedor__Group_6_4__0__Impl rule__Proveedor__Group_6_4__1 ;
    public final void rule__Proveedor__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__Proveedor__Group_6_4__0__Impl rule__Proveedor__Group_6_4__1 )
            // InternalMyDsl.g:1403:2: rule__Proveedor__Group_6_4__0__Impl rule__Proveedor__Group_6_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Proveedor__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6_4__0"


    // $ANTLR start "rule__Proveedor__Group_6_4__0__Impl"
    // InternalMyDsl.g:1410:1: rule__Proveedor__Group_6_4__0__Impl : ( ',' ) ;
    public final void rule__Proveedor__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( ( ',' ) )
            // InternalMyDsl.g:1415:1: ( ',' )
            {
            // InternalMyDsl.g:1415:1: ( ',' )
            // InternalMyDsl.g:1416:2: ','
            {
             before(grammarAccess.getProveedorAccess().getCommaKeyword_6_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getCommaKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6_4__0__Impl"


    // $ANTLR start "rule__Proveedor__Group_6_4__1"
    // InternalMyDsl.g:1425:1: rule__Proveedor__Group_6_4__1 : rule__Proveedor__Group_6_4__1__Impl ;
    public final void rule__Proveedor__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__Proveedor__Group_6_4__1__Impl )
            // InternalMyDsl.g:1430:2: rule__Proveedor__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_6_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6_4__1"


    // $ANTLR start "rule__Proveedor__Group_6_4__1__Impl"
    // InternalMyDsl.g:1436:1: rule__Proveedor__Group_6_4__1__Impl : ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_4_1 ) ) ;
    public final void rule__Proveedor__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_4_1 ) ) )
            // InternalMyDsl.g:1441:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_4_1 ) )
            {
            // InternalMyDsl.g:1441:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_6_4_1 ) )
            // InternalMyDsl.g:1442:2: ( rule__Proveedor__AmbientesDespliegueAssignment_6_4_1 )
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_6_4_1()); 
            // InternalMyDsl.g:1443:2: ( rule__Proveedor__AmbientesDespliegueAssignment_6_4_1 )
            // InternalMyDsl.g:1443:3: rule__Proveedor__AmbientesDespliegueAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__AmbientesDespliegueAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_6_4__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__0"
    // InternalMyDsl.g:1452:1: rule__AmbienteDespliegue__Group__0 : rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1 ;
    public final void rule__AmbienteDespliegue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1 )
            // InternalMyDsl.g:1457:2: rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDespliegue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group__0__Impl"
    // InternalMyDsl.g:1464:1: rule__AmbienteDespliegue__Group__0__Impl : ( () ) ;
    public final void rule__AmbienteDespliegue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( () ) )
            // InternalMyDsl.g:1469:1: ( () )
            {
            // InternalMyDsl.g:1469:1: ( () )
            // InternalMyDsl.g:1470:2: ()
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueAction_0()); 
            // InternalMyDsl.g:1471:2: ()
            // InternalMyDsl.g:1471:3: 
            {
            }

             after(grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__1"
    // InternalMyDsl.g:1479:1: rule__AmbienteDespliegue__Group__1 : rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2 ;
    public final void rule__AmbienteDespliegue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2 )
            // InternalMyDsl.g:1484:2: rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDespliegue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group__1__Impl"
    // InternalMyDsl.g:1491:1: rule__AmbienteDespliegue__Group__1__Impl : ( '{' ) ;
    public final void rule__AmbienteDespliegue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( '{' ) )
            // InternalMyDsl.g:1496:1: ( '{' )
            {
            // InternalMyDsl.g:1496:1: ( '{' )
            // InternalMyDsl.g:1497:2: '{'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__2"
    // InternalMyDsl.g:1506:1: rule__AmbienteDespliegue__Group__2 : rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3 ;
    public final void rule__AmbienteDespliegue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3 )
            // InternalMyDsl.g:1511:2: rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDespliegue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group__2__Impl"
    // InternalMyDsl.g:1518:1: rule__AmbienteDespliegue__Group__2__Impl : ( ( rule__AmbienteDespliegue__Group_2__0 )? ) ;
    public final void rule__AmbienteDespliegue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( ( rule__AmbienteDespliegue__Group_2__0 )? ) )
            // InternalMyDsl.g:1523:1: ( ( rule__AmbienteDespliegue__Group_2__0 )? )
            {
            // InternalMyDsl.g:1523:1: ( ( rule__AmbienteDespliegue__Group_2__0 )? )
            // InternalMyDsl.g:1524:2: ( rule__AmbienteDespliegue__Group_2__0 )?
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_2()); 
            // InternalMyDsl.g:1525:2: ( rule__AmbienteDespliegue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1525:3: rule__AmbienteDespliegue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDespliegue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__3"
    // InternalMyDsl.g:1533:1: rule__AmbienteDespliegue__Group__3 : rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4 ;
    public final void rule__AmbienteDespliegue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4 )
            // InternalMyDsl.g:1538:2: rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDespliegue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__3"


    // $ANTLR start "rule__AmbienteDespliegue__Group__3__Impl"
    // InternalMyDsl.g:1545:1: rule__AmbienteDespliegue__Group__3__Impl : ( ( rule__AmbienteDespliegue__Group_3__0 )? ) ;
    public final void rule__AmbienteDespliegue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( ( rule__AmbienteDespliegue__Group_3__0 )? ) )
            // InternalMyDsl.g:1550:1: ( ( rule__AmbienteDespliegue__Group_3__0 )? )
            {
            // InternalMyDsl.g:1550:1: ( ( rule__AmbienteDespliegue__Group_3__0 )? )
            // InternalMyDsl.g:1551:2: ( rule__AmbienteDespliegue__Group_3__0 )?
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_3()); 
            // InternalMyDsl.g:1552:2: ( rule__AmbienteDespliegue__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1552:3: rule__AmbienteDespliegue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDespliegue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__3__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__4"
    // InternalMyDsl.g:1560:1: rule__AmbienteDespliegue__Group__4 : rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5 ;
    public final void rule__AmbienteDespliegue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5 )
            // InternalMyDsl.g:1565:2: rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDespliegue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__4"


    // $ANTLR start "rule__AmbienteDespliegue__Group__4__Impl"
    // InternalMyDsl.g:1572:1: rule__AmbienteDespliegue__Group__4__Impl : ( ( rule__AmbienteDespliegue__Group_4__0 )? ) ;
    public final void rule__AmbienteDespliegue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( ( rule__AmbienteDespliegue__Group_4__0 )? ) )
            // InternalMyDsl.g:1577:1: ( ( rule__AmbienteDespliegue__Group_4__0 )? )
            {
            // InternalMyDsl.g:1577:1: ( ( rule__AmbienteDespliegue__Group_4__0 )? )
            // InternalMyDsl.g:1578:2: ( rule__AmbienteDespliegue__Group_4__0 )?
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_4()); 
            // InternalMyDsl.g:1579:2: ( rule__AmbienteDespliegue__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1579:3: rule__AmbienteDespliegue__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDespliegue__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__4__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__5"
    // InternalMyDsl.g:1587:1: rule__AmbienteDespliegue__Group__5 : rule__AmbienteDespliegue__Group__5__Impl rule__AmbienteDespliegue__Group__6 ;
    public final void rule__AmbienteDespliegue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__AmbienteDespliegue__Group__5__Impl rule__AmbienteDespliegue__Group__6 )
            // InternalMyDsl.g:1592:2: rule__AmbienteDespliegue__Group__5__Impl rule__AmbienteDespliegue__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDespliegue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__5"


    // $ANTLR start "rule__AmbienteDespliegue__Group__5__Impl"
    // InternalMyDsl.g:1599:1: rule__AmbienteDespliegue__Group__5__Impl : ( ( rule__AmbienteDespliegue__Group_5__0 )? ) ;
    public final void rule__AmbienteDespliegue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( ( rule__AmbienteDespliegue__Group_5__0 )? ) )
            // InternalMyDsl.g:1604:1: ( ( rule__AmbienteDespliegue__Group_5__0 )? )
            {
            // InternalMyDsl.g:1604:1: ( ( rule__AmbienteDespliegue__Group_5__0 )? )
            // InternalMyDsl.g:1605:2: ( rule__AmbienteDespliegue__Group_5__0 )?
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_5()); 
            // InternalMyDsl.g:1606:2: ( rule__AmbienteDespliegue__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1606:3: rule__AmbienteDespliegue__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDespliegue__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__5__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__6"
    // InternalMyDsl.g:1614:1: rule__AmbienteDespliegue__Group__6 : rule__AmbienteDespliegue__Group__6__Impl rule__AmbienteDespliegue__Group__7 ;
    public final void rule__AmbienteDespliegue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__AmbienteDespliegue__Group__6__Impl rule__AmbienteDespliegue__Group__7 )
            // InternalMyDsl.g:1619:2: rule__AmbienteDespliegue__Group__6__Impl rule__AmbienteDespliegue__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDespliegue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__6"


    // $ANTLR start "rule__AmbienteDespliegue__Group__6__Impl"
    // InternalMyDsl.g:1626:1: rule__AmbienteDespliegue__Group__6__Impl : ( ( rule__AmbienteDespliegue__Group_6__0 )? ) ;
    public final void rule__AmbienteDespliegue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( ( rule__AmbienteDespliegue__Group_6__0 )? ) )
            // InternalMyDsl.g:1631:1: ( ( rule__AmbienteDespliegue__Group_6__0 )? )
            {
            // InternalMyDsl.g:1631:1: ( ( rule__AmbienteDespliegue__Group_6__0 )? )
            // InternalMyDsl.g:1632:2: ( rule__AmbienteDespliegue__Group_6__0 )?
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_6()); 
            // InternalMyDsl.g:1633:2: ( rule__AmbienteDespliegue__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1633:3: rule__AmbienteDespliegue__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDespliegue__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__6__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__7"
    // InternalMyDsl.g:1641:1: rule__AmbienteDespliegue__Group__7 : rule__AmbienteDespliegue__Group__7__Impl rule__AmbienteDespliegue__Group__8 ;
    public final void rule__AmbienteDespliegue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__AmbienteDespliegue__Group__7__Impl rule__AmbienteDespliegue__Group__8 )
            // InternalMyDsl.g:1646:2: rule__AmbienteDespliegue__Group__7__Impl rule__AmbienteDespliegue__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__AmbienteDespliegue__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__7"


    // $ANTLR start "rule__AmbienteDespliegue__Group__7__Impl"
    // InternalMyDsl.g:1653:1: rule__AmbienteDespliegue__Group__7__Impl : ( ']' ) ;
    public final void rule__AmbienteDespliegue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( ']' ) )
            // InternalMyDsl.g:1658:1: ( ']' )
            {
            // InternalMyDsl.g:1658:1: ( ']' )
            // InternalMyDsl.g:1659:2: ']'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__7__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__8"
    // InternalMyDsl.g:1668:1: rule__AmbienteDespliegue__Group__8 : rule__AmbienteDespliegue__Group__8__Impl ;
    public final void rule__AmbienteDespliegue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__AmbienteDespliegue__Group__8__Impl )
            // InternalMyDsl.g:1673:2: rule__AmbienteDespliegue__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__8"


    // $ANTLR start "rule__AmbienteDespliegue__Group__8__Impl"
    // InternalMyDsl.g:1679:1: rule__AmbienteDespliegue__Group__8__Impl : ( '}' ) ;
    public final void rule__AmbienteDespliegue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( ( '}' ) )
            // InternalMyDsl.g:1684:1: ( '}' )
            {
            // InternalMyDsl.g:1684:1: ( '}' )
            // InternalMyDsl.g:1685:2: '}'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__8__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_2__0"
    // InternalMyDsl.g:1695:1: rule__AmbienteDespliegue__Group_2__0 : rule__AmbienteDespliegue__Group_2__0__Impl rule__AmbienteDespliegue__Group_2__1 ;
    public final void rule__AmbienteDespliegue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__AmbienteDespliegue__Group_2__0__Impl rule__AmbienteDespliegue__Group_2__1 )
            // InternalMyDsl.g:1700:2: rule__AmbienteDespliegue__Group_2__0__Impl rule__AmbienteDespliegue__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__AmbienteDespliegue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_2__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_2__0__Impl"
    // InternalMyDsl.g:1707:1: rule__AmbienteDespliegue__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__AmbienteDespliegue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:1712:1: ( 'nombre' )
            {
            // InternalMyDsl.g:1712:1: ( 'nombre' )
            // InternalMyDsl.g:1713:2: 'nombre'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_2__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_2__1"
    // InternalMyDsl.g:1722:1: rule__AmbienteDespliegue__Group_2__1 : rule__AmbienteDespliegue__Group_2__1__Impl rule__AmbienteDespliegue__Group_2__2 ;
    public final void rule__AmbienteDespliegue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__AmbienteDespliegue__Group_2__1__Impl rule__AmbienteDespliegue__Group_2__2 )
            // InternalMyDsl.g:1727:2: rule__AmbienteDespliegue__Group_2__1__Impl rule__AmbienteDespliegue__Group_2__2
            {
            pushFollow(FOLLOW_15);
            rule__AmbienteDespliegue__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_2__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_2__1__Impl"
    // InternalMyDsl.g:1734:1: rule__AmbienteDespliegue__Group_2__1__Impl : ( '=' ) ;
    public final void rule__AmbienteDespliegue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( '=' ) )
            // InternalMyDsl.g:1739:1: ( '=' )
            {
            // InternalMyDsl.g:1739:1: ( '=' )
            // InternalMyDsl.g:1740:2: '='
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_2__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_2__2"
    // InternalMyDsl.g:1749:1: rule__AmbienteDespliegue__Group_2__2 : rule__AmbienteDespliegue__Group_2__2__Impl ;
    public final void rule__AmbienteDespliegue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__AmbienteDespliegue__Group_2__2__Impl )
            // InternalMyDsl.g:1754:2: rule__AmbienteDespliegue__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_2__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group_2__2__Impl"
    // InternalMyDsl.g:1760:1: rule__AmbienteDespliegue__Group_2__2__Impl : ( ( rule__AmbienteDespliegue__NombreAssignment_2_2 ) ) ;
    public final void rule__AmbienteDespliegue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( ( ( rule__AmbienteDespliegue__NombreAssignment_2_2 ) ) )
            // InternalMyDsl.g:1765:1: ( ( rule__AmbienteDespliegue__NombreAssignment_2_2 ) )
            {
            // InternalMyDsl.g:1765:1: ( ( rule__AmbienteDespliegue__NombreAssignment_2_2 ) )
            // InternalMyDsl.g:1766:2: ( rule__AmbienteDespliegue__NombreAssignment_2_2 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getNombreAssignment_2_2()); 
            // InternalMyDsl.g:1767:2: ( rule__AmbienteDespliegue__NombreAssignment_2_2 )
            // InternalMyDsl.g:1767:3: rule__AmbienteDespliegue__NombreAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__NombreAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getNombreAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_2__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__0"
    // InternalMyDsl.g:1776:1: rule__AmbienteDespliegue__Group_3__0 : rule__AmbienteDespliegue__Group_3__0__Impl rule__AmbienteDespliegue__Group_3__1 ;
    public final void rule__AmbienteDespliegue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__AmbienteDespliegue__Group_3__0__Impl rule__AmbienteDespliegue__Group_3__1 )
            // InternalMyDsl.g:1781:2: rule__AmbienteDespliegue__Group_3__0__Impl rule__AmbienteDespliegue__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDespliegue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__0__Impl"
    // InternalMyDsl.g:1788:1: rule__AmbienteDespliegue__Group_3__0__Impl : ( 'recursos' ) ;
    public final void rule__AmbienteDespliegue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( 'recursos' ) )
            // InternalMyDsl.g:1793:1: ( 'recursos' )
            {
            // InternalMyDsl.g:1793:1: ( 'recursos' )
            // InternalMyDsl.g:1794:2: 'recursos'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__1"
    // InternalMyDsl.g:1803:1: rule__AmbienteDespliegue__Group_3__1 : rule__AmbienteDespliegue__Group_3__1__Impl rule__AmbienteDespliegue__Group_3__2 ;
    public final void rule__AmbienteDespliegue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__AmbienteDespliegue__Group_3__1__Impl rule__AmbienteDespliegue__Group_3__2 )
            // InternalMyDsl.g:1808:2: rule__AmbienteDespliegue__Group_3__1__Impl rule__AmbienteDespliegue__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__AmbienteDespliegue__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__1__Impl"
    // InternalMyDsl.g:1815:1: rule__AmbienteDespliegue__Group_3__1__Impl : ( '{' ) ;
    public final void rule__AmbienteDespliegue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( '{' ) )
            // InternalMyDsl.g:1820:1: ( '{' )
            {
            // InternalMyDsl.g:1820:1: ( '{' )
            // InternalMyDsl.g:1821:2: '{'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__2"
    // InternalMyDsl.g:1830:1: rule__AmbienteDespliegue__Group_3__2 : rule__AmbienteDespliegue__Group_3__2__Impl rule__AmbienteDespliegue__Group_3__3 ;
    public final void rule__AmbienteDespliegue__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__AmbienteDespliegue__Group_3__2__Impl rule__AmbienteDespliegue__Group_3__3 )
            // InternalMyDsl.g:1835:2: rule__AmbienteDespliegue__Group_3__2__Impl rule__AmbienteDespliegue__Group_3__3
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__2__Impl"
    // InternalMyDsl.g:1842:1: rule__AmbienteDespliegue__Group_3__2__Impl : ( ( rule__AmbienteDespliegue__RecursosAssignment_3_2 ) ) ;
    public final void rule__AmbienteDespliegue__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ( rule__AmbienteDespliegue__RecursosAssignment_3_2 ) ) )
            // InternalMyDsl.g:1847:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1847:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_3_2 ) )
            // InternalMyDsl.g:1848:2: ( rule__AmbienteDespliegue__RecursosAssignment_3_2 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_3_2()); 
            // InternalMyDsl.g:1849:2: ( rule__AmbienteDespliegue__RecursosAssignment_3_2 )
            // InternalMyDsl.g:1849:3: rule__AmbienteDespliegue__RecursosAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__RecursosAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__3"
    // InternalMyDsl.g:1857:1: rule__AmbienteDespliegue__Group_3__3 : rule__AmbienteDespliegue__Group_3__3__Impl rule__AmbienteDespliegue__Group_3__4 ;
    public final void rule__AmbienteDespliegue__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__AmbienteDespliegue__Group_3__3__Impl rule__AmbienteDespliegue__Group_3__4 )
            // InternalMyDsl.g:1862:2: rule__AmbienteDespliegue__Group_3__3__Impl rule__AmbienteDespliegue__Group_3__4
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__3"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__3__Impl"
    // InternalMyDsl.g:1869:1: rule__AmbienteDespliegue__Group_3__3__Impl : ( ( rule__AmbienteDespliegue__Group_3_3__0 )* ) ;
    public final void rule__AmbienteDespliegue__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( ( ( rule__AmbienteDespliegue__Group_3_3__0 )* ) )
            // InternalMyDsl.g:1874:1: ( ( rule__AmbienteDespliegue__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:1874:1: ( ( rule__AmbienteDespliegue__Group_3_3__0 )* )
            // InternalMyDsl.g:1875:2: ( rule__AmbienteDespliegue__Group_3_3__0 )*
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_3_3()); 
            // InternalMyDsl.g:1876:2: ( rule__AmbienteDespliegue__Group_3_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1876:3: rule__AmbienteDespliegue__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AmbienteDespliegue__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__3__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__4"
    // InternalMyDsl.g:1884:1: rule__AmbienteDespliegue__Group_3__4 : rule__AmbienteDespliegue__Group_3__4__Impl ;
    public final void rule__AmbienteDespliegue__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__AmbienteDespliegue__Group_3__4__Impl )
            // InternalMyDsl.g:1889:2: rule__AmbienteDespliegue__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__4"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__4__Impl"
    // InternalMyDsl.g:1895:1: rule__AmbienteDespliegue__Group_3__4__Impl : ( '}' ) ;
    public final void rule__AmbienteDespliegue__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( '}' ) )
            // InternalMyDsl.g:1900:1: ( '}' )
            {
            // InternalMyDsl.g:1900:1: ( '}' )
            // InternalMyDsl.g:1901:2: '}'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__4__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3_3__0"
    // InternalMyDsl.g:1911:1: rule__AmbienteDespliegue__Group_3_3__0 : rule__AmbienteDespliegue__Group_3_3__0__Impl rule__AmbienteDespliegue__Group_3_3__1 ;
    public final void rule__AmbienteDespliegue__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__AmbienteDespliegue__Group_3_3__0__Impl rule__AmbienteDespliegue__Group_3_3__1 )
            // InternalMyDsl.g:1916:2: rule__AmbienteDespliegue__Group_3_3__0__Impl rule__AmbienteDespliegue__Group_3_3__1
            {
            pushFollow(FOLLOW_16);
            rule__AmbienteDespliegue__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3_3__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3_3__0__Impl"
    // InternalMyDsl.g:1923:1: rule__AmbienteDespliegue__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__AmbienteDespliegue__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( ',' ) )
            // InternalMyDsl.g:1928:1: ( ',' )
            {
            // InternalMyDsl.g:1928:1: ( ',' )
            // InternalMyDsl.g:1929:2: ','
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3_3__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3_3__1"
    // InternalMyDsl.g:1938:1: rule__AmbienteDespliegue__Group_3_3__1 : rule__AmbienteDespliegue__Group_3_3__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__AmbienteDespliegue__Group_3_3__1__Impl )
            // InternalMyDsl.g:1943:2: rule__AmbienteDespliegue__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3_3__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3_3__1__Impl"
    // InternalMyDsl.g:1949:1: rule__AmbienteDespliegue__Group_3_3__1__Impl : ( ( rule__AmbienteDespliegue__RecursosAssignment_3_3_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ( rule__AmbienteDespliegue__RecursosAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:1954:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:1954:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_3_3_1 ) )
            // InternalMyDsl.g:1955:2: ( rule__AmbienteDespliegue__RecursosAssignment_3_3_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_3_3_1()); 
            // InternalMyDsl.g:1956:2: ( rule__AmbienteDespliegue__RecursosAssignment_3_3_1 )
            // InternalMyDsl.g:1956:3: rule__AmbienteDespliegue__RecursosAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__RecursosAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3_3__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__0"
    // InternalMyDsl.g:1965:1: rule__AmbienteDespliegue__Group_4__0 : rule__AmbienteDespliegue__Group_4__0__Impl rule__AmbienteDespliegue__Group_4__1 ;
    public final void rule__AmbienteDespliegue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__AmbienteDespliegue__Group_4__0__Impl rule__AmbienteDespliegue__Group_4__1 )
            // InternalMyDsl.g:1970:2: rule__AmbienteDespliegue__Group_4__0__Impl rule__AmbienteDespliegue__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDespliegue__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__0__Impl"
    // InternalMyDsl.g:1977:1: rule__AmbienteDespliegue__Group_4__0__Impl : ( 'conexiones' ) ;
    public final void rule__AmbienteDespliegue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:1982:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:1982:1: ( 'conexiones' )
            // InternalMyDsl.g:1983:2: 'conexiones'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getConexionesKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getConexionesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__1"
    // InternalMyDsl.g:1992:1: rule__AmbienteDespliegue__Group_4__1 : rule__AmbienteDespliegue__Group_4__1__Impl rule__AmbienteDespliegue__Group_4__2 ;
    public final void rule__AmbienteDespliegue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__AmbienteDespliegue__Group_4__1__Impl rule__AmbienteDespliegue__Group_4__2 )
            // InternalMyDsl.g:1997:2: rule__AmbienteDespliegue__Group_4__1__Impl rule__AmbienteDespliegue__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__AmbienteDespliegue__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__1__Impl"
    // InternalMyDsl.g:2004:1: rule__AmbienteDespliegue__Group_4__1__Impl : ( '{' ) ;
    public final void rule__AmbienteDespliegue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( '{' ) )
            // InternalMyDsl.g:2009:1: ( '{' )
            {
            // InternalMyDsl.g:2009:1: ( '{' )
            // InternalMyDsl.g:2010:2: '{'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__2"
    // InternalMyDsl.g:2019:1: rule__AmbienteDespliegue__Group_4__2 : rule__AmbienteDespliegue__Group_4__2__Impl rule__AmbienteDespliegue__Group_4__3 ;
    public final void rule__AmbienteDespliegue__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__AmbienteDespliegue__Group_4__2__Impl rule__AmbienteDespliegue__Group_4__3 )
            // InternalMyDsl.g:2024:2: rule__AmbienteDespliegue__Group_4__2__Impl rule__AmbienteDespliegue__Group_4__3
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__2__Impl"
    // InternalMyDsl.g:2031:1: rule__AmbienteDespliegue__Group_4__2__Impl : ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_2 ) ) ;
    public final void rule__AmbienteDespliegue__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_2 ) ) )
            // InternalMyDsl.g:2036:1: ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_2 ) )
            {
            // InternalMyDsl.g:2036:1: ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_2 ) )
            // InternalMyDsl.g:2037:2: ( rule__AmbienteDespliegue__ConexionesAssignment_4_2 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getConexionesAssignment_4_2()); 
            // InternalMyDsl.g:2038:2: ( rule__AmbienteDespliegue__ConexionesAssignment_4_2 )
            // InternalMyDsl.g:2038:3: rule__AmbienteDespliegue__ConexionesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__ConexionesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getConexionesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__3"
    // InternalMyDsl.g:2046:1: rule__AmbienteDespliegue__Group_4__3 : rule__AmbienteDespliegue__Group_4__3__Impl rule__AmbienteDespliegue__Group_4__4 ;
    public final void rule__AmbienteDespliegue__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__AmbienteDespliegue__Group_4__3__Impl rule__AmbienteDespliegue__Group_4__4 )
            // InternalMyDsl.g:2051:2: rule__AmbienteDespliegue__Group_4__3__Impl rule__AmbienteDespliegue__Group_4__4
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__3"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__3__Impl"
    // InternalMyDsl.g:2058:1: rule__AmbienteDespliegue__Group_4__3__Impl : ( ( rule__AmbienteDespliegue__Group_4_3__0 )* ) ;
    public final void rule__AmbienteDespliegue__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( ( rule__AmbienteDespliegue__Group_4_3__0 )* ) )
            // InternalMyDsl.g:2063:1: ( ( rule__AmbienteDespliegue__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:2063:1: ( ( rule__AmbienteDespliegue__Group_4_3__0 )* )
            // InternalMyDsl.g:2064:2: ( rule__AmbienteDespliegue__Group_4_3__0 )*
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_4_3()); 
            // InternalMyDsl.g:2065:2: ( rule__AmbienteDespliegue__Group_4_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2065:3: rule__AmbienteDespliegue__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AmbienteDespliegue__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__3__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__4"
    // InternalMyDsl.g:2073:1: rule__AmbienteDespliegue__Group_4__4 : rule__AmbienteDespliegue__Group_4__4__Impl ;
    public final void rule__AmbienteDespliegue__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__AmbienteDespliegue__Group_4__4__Impl )
            // InternalMyDsl.g:2078:2: rule__AmbienteDespliegue__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__4"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__4__Impl"
    // InternalMyDsl.g:2084:1: rule__AmbienteDespliegue__Group_4__4__Impl : ( '}' ) ;
    public final void rule__AmbienteDespliegue__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( ( '}' ) )
            // InternalMyDsl.g:2089:1: ( '}' )
            {
            // InternalMyDsl.g:2089:1: ( '}' )
            // InternalMyDsl.g:2090:2: '}'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__4__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__0"
    // InternalMyDsl.g:2100:1: rule__AmbienteDespliegue__Group_4_3__0 : rule__AmbienteDespliegue__Group_4_3__0__Impl rule__AmbienteDespliegue__Group_4_3__1 ;
    public final void rule__AmbienteDespliegue__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__AmbienteDespliegue__Group_4_3__0__Impl rule__AmbienteDespliegue__Group_4_3__1 )
            // InternalMyDsl.g:2105:2: rule__AmbienteDespliegue__Group_4_3__0__Impl rule__AmbienteDespliegue__Group_4_3__1
            {
            pushFollow(FOLLOW_18);
            rule__AmbienteDespliegue__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__0__Impl"
    // InternalMyDsl.g:2112:1: rule__AmbienteDespliegue__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__AmbienteDespliegue__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( ',' ) )
            // InternalMyDsl.g:2117:1: ( ',' )
            {
            // InternalMyDsl.g:2117:1: ( ',' )
            // InternalMyDsl.g:2118:2: ','
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_4_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__1"
    // InternalMyDsl.g:2127:1: rule__AmbienteDespliegue__Group_4_3__1 : rule__AmbienteDespliegue__Group_4_3__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__AmbienteDespliegue__Group_4_3__1__Impl )
            // InternalMyDsl.g:2132:2: rule__AmbienteDespliegue__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__1__Impl"
    // InternalMyDsl.g:2138:1: rule__AmbienteDespliegue__Group_4_3__1__Impl : ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_3_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:2143:1: ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:2143:1: ( ( rule__AmbienteDespliegue__ConexionesAssignment_4_3_1 ) )
            // InternalMyDsl.g:2144:2: ( rule__AmbienteDespliegue__ConexionesAssignment_4_3_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getConexionesAssignment_4_3_1()); 
            // InternalMyDsl.g:2145:2: ( rule__AmbienteDespliegue__ConexionesAssignment_4_3_1 )
            // InternalMyDsl.g:2145:3: rule__AmbienteDespliegue__ConexionesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__ConexionesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getConexionesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__0"
    // InternalMyDsl.g:2154:1: rule__AmbienteDespliegue__Group_5__0 : rule__AmbienteDespliegue__Group_5__0__Impl rule__AmbienteDespliegue__Group_5__1 ;
    public final void rule__AmbienteDespliegue__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__AmbienteDespliegue__Group_5__0__Impl rule__AmbienteDespliegue__Group_5__1 )
            // InternalMyDsl.g:2159:2: rule__AmbienteDespliegue__Group_5__0__Impl rule__AmbienteDespliegue__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDespliegue__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__0__Impl"
    // InternalMyDsl.g:2166:1: rule__AmbienteDespliegue__Group_5__0__Impl : ( 'seguridad' ) ;
    public final void rule__AmbienteDespliegue__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( 'seguridad' ) )
            // InternalMyDsl.g:2171:1: ( 'seguridad' )
            {
            // InternalMyDsl.g:2171:1: ( 'seguridad' )
            // InternalMyDsl.g:2172:2: 'seguridad'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getSeguridadKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getSeguridadKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__1"
    // InternalMyDsl.g:2181:1: rule__AmbienteDespliegue__Group_5__1 : rule__AmbienteDespliegue__Group_5__1__Impl rule__AmbienteDespliegue__Group_5__2 ;
    public final void rule__AmbienteDespliegue__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__AmbienteDespliegue__Group_5__1__Impl rule__AmbienteDespliegue__Group_5__2 )
            // InternalMyDsl.g:2186:2: rule__AmbienteDespliegue__Group_5__1__Impl rule__AmbienteDespliegue__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__AmbienteDespliegue__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__1__Impl"
    // InternalMyDsl.g:2193:1: rule__AmbienteDespliegue__Group_5__1__Impl : ( '{' ) ;
    public final void rule__AmbienteDespliegue__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( '{' ) )
            // InternalMyDsl.g:2198:1: ( '{' )
            {
            // InternalMyDsl.g:2198:1: ( '{' )
            // InternalMyDsl.g:2199:2: '{'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__2"
    // InternalMyDsl.g:2208:1: rule__AmbienteDespliegue__Group_5__2 : rule__AmbienteDespliegue__Group_5__2__Impl rule__AmbienteDespliegue__Group_5__3 ;
    public final void rule__AmbienteDespliegue__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__AmbienteDespliegue__Group_5__2__Impl rule__AmbienteDespliegue__Group_5__3 )
            // InternalMyDsl.g:2213:2: rule__AmbienteDespliegue__Group_5__2__Impl rule__AmbienteDespliegue__Group_5__3
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__2__Impl"
    // InternalMyDsl.g:2220:1: rule__AmbienteDespliegue__Group_5__2__Impl : ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_2 ) ) ;
    public final void rule__AmbienteDespliegue__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_2 ) ) )
            // InternalMyDsl.g:2225:1: ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2225:1: ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_2 ) )
            // InternalMyDsl.g:2226:2: ( rule__AmbienteDespliegue__SeguridadAssignment_5_2 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getSeguridadAssignment_5_2()); 
            // InternalMyDsl.g:2227:2: ( rule__AmbienteDespliegue__SeguridadAssignment_5_2 )
            // InternalMyDsl.g:2227:3: rule__AmbienteDespliegue__SeguridadAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__SeguridadAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getSeguridadAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__3"
    // InternalMyDsl.g:2235:1: rule__AmbienteDespliegue__Group_5__3 : rule__AmbienteDespliegue__Group_5__3__Impl rule__AmbienteDespliegue__Group_5__4 ;
    public final void rule__AmbienteDespliegue__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__AmbienteDespliegue__Group_5__3__Impl rule__AmbienteDespliegue__Group_5__4 )
            // InternalMyDsl.g:2240:2: rule__AmbienteDespliegue__Group_5__3__Impl rule__AmbienteDespliegue__Group_5__4
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__3"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__3__Impl"
    // InternalMyDsl.g:2247:1: rule__AmbienteDespliegue__Group_5__3__Impl : ( ( rule__AmbienteDespliegue__Group_5_3__0 )* ) ;
    public final void rule__AmbienteDespliegue__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( ( rule__AmbienteDespliegue__Group_5_3__0 )* ) )
            // InternalMyDsl.g:2252:1: ( ( rule__AmbienteDespliegue__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:2252:1: ( ( rule__AmbienteDespliegue__Group_5_3__0 )* )
            // InternalMyDsl.g:2253:2: ( rule__AmbienteDespliegue__Group_5_3__0 )*
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_5_3()); 
            // InternalMyDsl.g:2254:2: ( rule__AmbienteDespliegue__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2254:3: rule__AmbienteDespliegue__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AmbienteDespliegue__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__3__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__4"
    // InternalMyDsl.g:2262:1: rule__AmbienteDespliegue__Group_5__4 : rule__AmbienteDespliegue__Group_5__4__Impl ;
    public final void rule__AmbienteDespliegue__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__AmbienteDespliegue__Group_5__4__Impl )
            // InternalMyDsl.g:2267:2: rule__AmbienteDespliegue__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__4"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5__4__Impl"
    // InternalMyDsl.g:2273:1: rule__AmbienteDespliegue__Group_5__4__Impl : ( '}' ) ;
    public final void rule__AmbienteDespliegue__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( ( '}' ) )
            // InternalMyDsl.g:2278:1: ( '}' )
            {
            // InternalMyDsl.g:2278:1: ( '}' )
            // InternalMyDsl.g:2279:2: '}'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5__4__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5_3__0"
    // InternalMyDsl.g:2289:1: rule__AmbienteDespliegue__Group_5_3__0 : rule__AmbienteDespliegue__Group_5_3__0__Impl rule__AmbienteDespliegue__Group_5_3__1 ;
    public final void rule__AmbienteDespliegue__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__AmbienteDespliegue__Group_5_3__0__Impl rule__AmbienteDespliegue__Group_5_3__1 )
            // InternalMyDsl.g:2294:2: rule__AmbienteDespliegue__Group_5_3__0__Impl rule__AmbienteDespliegue__Group_5_3__1
            {
            pushFollow(FOLLOW_19);
            rule__AmbienteDespliegue__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5_3__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5_3__0__Impl"
    // InternalMyDsl.g:2301:1: rule__AmbienteDespliegue__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AmbienteDespliegue__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( ',' ) )
            // InternalMyDsl.g:2306:1: ( ',' )
            {
            // InternalMyDsl.g:2306:1: ( ',' )
            // InternalMyDsl.g:2307:2: ','
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_5_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5_3__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5_3__1"
    // InternalMyDsl.g:2316:1: rule__AmbienteDespliegue__Group_5_3__1 : rule__AmbienteDespliegue__Group_5_3__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__AmbienteDespliegue__Group_5_3__1__Impl )
            // InternalMyDsl.g:2321:2: rule__AmbienteDespliegue__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5_3__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_5_3__1__Impl"
    // InternalMyDsl.g:2327:1: rule__AmbienteDespliegue__Group_5_3__1__Impl : ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_3_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2331:1: ( ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:2332:1: ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:2332:1: ( ( rule__AmbienteDespliegue__SeguridadAssignment_5_3_1 ) )
            // InternalMyDsl.g:2333:2: ( rule__AmbienteDespliegue__SeguridadAssignment_5_3_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getSeguridadAssignment_5_3_1()); 
            // InternalMyDsl.g:2334:2: ( rule__AmbienteDespliegue__SeguridadAssignment_5_3_1 )
            // InternalMyDsl.g:2334:3: rule__AmbienteDespliegue__SeguridadAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__SeguridadAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getSeguridadAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_5_3__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__0"
    // InternalMyDsl.g:2343:1: rule__AmbienteDespliegue__Group_6__0 : rule__AmbienteDespliegue__Group_6__0__Impl rule__AmbienteDespliegue__Group_6__1 ;
    public final void rule__AmbienteDespliegue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__AmbienteDespliegue__Group_6__0__Impl rule__AmbienteDespliegue__Group_6__1 )
            // InternalMyDsl.g:2348:2: rule__AmbienteDespliegue__Group_6__0__Impl rule__AmbienteDespliegue__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__AmbienteDespliegue__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__0__Impl"
    // InternalMyDsl.g:2355:1: rule__AmbienteDespliegue__Group_6__0__Impl : ( 'vpc' ) ;
    public final void rule__AmbienteDespliegue__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:2360:1: ( 'vpc' )
            {
            // InternalMyDsl.g:2360:1: ( 'vpc' )
            // InternalMyDsl.g:2361:2: 'vpc'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getVpcKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__1"
    // InternalMyDsl.g:2370:1: rule__AmbienteDespliegue__Group_6__1 : rule__AmbienteDespliegue__Group_6__1__Impl rule__AmbienteDespliegue__Group_6__2 ;
    public final void rule__AmbienteDespliegue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__AmbienteDespliegue__Group_6__1__Impl rule__AmbienteDespliegue__Group_6__2 )
            // InternalMyDsl.g:2375:2: rule__AmbienteDespliegue__Group_6__1__Impl rule__AmbienteDespliegue__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__AmbienteDespliegue__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__1__Impl"
    // InternalMyDsl.g:2382:1: rule__AmbienteDespliegue__Group_6__1__Impl : ( '=' ) ;
    public final void rule__AmbienteDespliegue__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( ( '=' ) )
            // InternalMyDsl.g:2387:1: ( '=' )
            {
            // InternalMyDsl.g:2387:1: ( '=' )
            // InternalMyDsl.g:2388:2: '='
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_6_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__2"
    // InternalMyDsl.g:2397:1: rule__AmbienteDespliegue__Group_6__2 : rule__AmbienteDespliegue__Group_6__2__Impl rule__AmbienteDespliegue__Group_6__3 ;
    public final void rule__AmbienteDespliegue__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__AmbienteDespliegue__Group_6__2__Impl rule__AmbienteDespliegue__Group_6__3 )
            // InternalMyDsl.g:2402:2: rule__AmbienteDespliegue__Group_6__2__Impl rule__AmbienteDespliegue__Group_6__3
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDespliegue__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__2__Impl"
    // InternalMyDsl.g:2409:1: rule__AmbienteDespliegue__Group_6__2__Impl : ( '[' ) ;
    public final void rule__AmbienteDespliegue__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( '[' ) )
            // InternalMyDsl.g:2414:1: ( '[' )
            {
            // InternalMyDsl.g:2414:1: ( '[' )
            // InternalMyDsl.g:2415:2: '['
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_6_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__3"
    // InternalMyDsl.g:2424:1: rule__AmbienteDespliegue__Group_6__3 : rule__AmbienteDespliegue__Group_6__3__Impl rule__AmbienteDespliegue__Group_6__4 ;
    public final void rule__AmbienteDespliegue__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__AmbienteDespliegue__Group_6__3__Impl rule__AmbienteDespliegue__Group_6__4 )
            // InternalMyDsl.g:2429:2: rule__AmbienteDespliegue__Group_6__3__Impl rule__AmbienteDespliegue__Group_6__4
            {
            pushFollow(FOLLOW_20);
            rule__AmbienteDespliegue__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__3"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__3__Impl"
    // InternalMyDsl.g:2436:1: rule__AmbienteDespliegue__Group_6__3__Impl : ( '{' ) ;
    public final void rule__AmbienteDespliegue__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( ( '{' ) )
            // InternalMyDsl.g:2441:1: ( '{' )
            {
            // InternalMyDsl.g:2441:1: ( '{' )
            // InternalMyDsl.g:2442:2: '{'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_6_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__3__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__4"
    // InternalMyDsl.g:2451:1: rule__AmbienteDespliegue__Group_6__4 : rule__AmbienteDespliegue__Group_6__4__Impl rule__AmbienteDespliegue__Group_6__5 ;
    public final void rule__AmbienteDespliegue__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__AmbienteDespliegue__Group_6__4__Impl rule__AmbienteDespliegue__Group_6__5 )
            // InternalMyDsl.g:2456:2: rule__AmbienteDespliegue__Group_6__4__Impl rule__AmbienteDespliegue__Group_6__5
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__4"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__4__Impl"
    // InternalMyDsl.g:2463:1: rule__AmbienteDespliegue__Group_6__4__Impl : ( ( rule__AmbienteDespliegue__VpcAssignment_6_4 ) ) ;
    public final void rule__AmbienteDespliegue__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( ( ( rule__AmbienteDespliegue__VpcAssignment_6_4 ) ) )
            // InternalMyDsl.g:2468:1: ( ( rule__AmbienteDespliegue__VpcAssignment_6_4 ) )
            {
            // InternalMyDsl.g:2468:1: ( ( rule__AmbienteDespliegue__VpcAssignment_6_4 ) )
            // InternalMyDsl.g:2469:2: ( rule__AmbienteDespliegue__VpcAssignment_6_4 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_6_4()); 
            // InternalMyDsl.g:2470:2: ( rule__AmbienteDespliegue__VpcAssignment_6_4 )
            // InternalMyDsl.g:2470:3: rule__AmbienteDespliegue__VpcAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__VpcAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__4__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__5"
    // InternalMyDsl.g:2478:1: rule__AmbienteDespliegue__Group_6__5 : rule__AmbienteDespliegue__Group_6__5__Impl rule__AmbienteDespliegue__Group_6__6 ;
    public final void rule__AmbienteDespliegue__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__AmbienteDespliegue__Group_6__5__Impl rule__AmbienteDespliegue__Group_6__6 )
            // InternalMyDsl.g:2483:2: rule__AmbienteDespliegue__Group_6__5__Impl rule__AmbienteDespliegue__Group_6__6
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__5"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__5__Impl"
    // InternalMyDsl.g:2490:1: rule__AmbienteDespliegue__Group_6__5__Impl : ( ( rule__AmbienteDespliegue__Group_6_5__0 )* ) ;
    public final void rule__AmbienteDespliegue__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ( rule__AmbienteDespliegue__Group_6_5__0 )* ) )
            // InternalMyDsl.g:2495:1: ( ( rule__AmbienteDespliegue__Group_6_5__0 )* )
            {
            // InternalMyDsl.g:2495:1: ( ( rule__AmbienteDespliegue__Group_6_5__0 )* )
            // InternalMyDsl.g:2496:2: ( rule__AmbienteDespliegue__Group_6_5__0 )*
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_6_5()); 
            // InternalMyDsl.g:2497:2: ( rule__AmbienteDespliegue__Group_6_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2497:3: rule__AmbienteDespliegue__Group_6_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AmbienteDespliegue__Group_6_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__5__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__6"
    // InternalMyDsl.g:2505:1: rule__AmbienteDespliegue__Group_6__6 : rule__AmbienteDespliegue__Group_6__6__Impl ;
    public final void rule__AmbienteDespliegue__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__AmbienteDespliegue__Group_6__6__Impl )
            // InternalMyDsl.g:2510:2: rule__AmbienteDespliegue__Group_6__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__6"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6__6__Impl"
    // InternalMyDsl.g:2516:1: rule__AmbienteDespliegue__Group_6__6__Impl : ( '}' ) ;
    public final void rule__AmbienteDespliegue__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( ( '}' ) )
            // InternalMyDsl.g:2521:1: ( '}' )
            {
            // InternalMyDsl.g:2521:1: ( '}' )
            // InternalMyDsl.g:2522:2: '}'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_6_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_6_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6__6__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6_5__0"
    // InternalMyDsl.g:2532:1: rule__AmbienteDespliegue__Group_6_5__0 : rule__AmbienteDespliegue__Group_6_5__0__Impl rule__AmbienteDespliegue__Group_6_5__1 ;
    public final void rule__AmbienteDespliegue__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__AmbienteDespliegue__Group_6_5__0__Impl rule__AmbienteDespliegue__Group_6_5__1 )
            // InternalMyDsl.g:2537:2: rule__AmbienteDespliegue__Group_6_5__0__Impl rule__AmbienteDespliegue__Group_6_5__1
            {
            pushFollow(FOLLOW_20);
            rule__AmbienteDespliegue__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6_5__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6_5__0__Impl"
    // InternalMyDsl.g:2544:1: rule__AmbienteDespliegue__Group_6_5__0__Impl : ( ',' ) ;
    public final void rule__AmbienteDespliegue__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( ',' ) )
            // InternalMyDsl.g:2549:1: ( ',' )
            {
            // InternalMyDsl.g:2549:1: ( ',' )
            // InternalMyDsl.g:2550:2: ','
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_6_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6_5__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6_5__1"
    // InternalMyDsl.g:2559:1: rule__AmbienteDespliegue__Group_6_5__1 : rule__AmbienteDespliegue__Group_6_5__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__AmbienteDespliegue__Group_6_5__1__Impl )
            // InternalMyDsl.g:2564:2: rule__AmbienteDespliegue__Group_6_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_6_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6_5__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_6_5__1__Impl"
    // InternalMyDsl.g:2570:1: rule__AmbienteDespliegue__Group_6_5__1__Impl : ( ( rule__AmbienteDespliegue__VpcAssignment_6_5_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2574:1: ( ( ( rule__AmbienteDespliegue__VpcAssignment_6_5_1 ) ) )
            // InternalMyDsl.g:2575:1: ( ( rule__AmbienteDespliegue__VpcAssignment_6_5_1 ) )
            {
            // InternalMyDsl.g:2575:1: ( ( rule__AmbienteDespliegue__VpcAssignment_6_5_1 ) )
            // InternalMyDsl.g:2576:2: ( rule__AmbienteDespliegue__VpcAssignment_6_5_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_6_5_1()); 
            // InternalMyDsl.g:2577:2: ( rule__AmbienteDespliegue__VpcAssignment_6_5_1 )
            // InternalMyDsl.g:2577:3: rule__AmbienteDespliegue__VpcAssignment_6_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__VpcAssignment_6_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_6_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_6_5__1__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group__0"
    // InternalMyDsl.g:2586:1: rule__UsuarioPassword__Group__0 : rule__UsuarioPassword__Group__0__Impl rule__UsuarioPassword__Group__1 ;
    public final void rule__UsuarioPassword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__UsuarioPassword__Group__0__Impl rule__UsuarioPassword__Group__1 )
            // InternalMyDsl.g:2591:2: rule__UsuarioPassword__Group__0__Impl rule__UsuarioPassword__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__UsuarioPassword__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__0"


    // $ANTLR start "rule__UsuarioPassword__Group__0__Impl"
    // InternalMyDsl.g:2598:1: rule__UsuarioPassword__Group__0__Impl : ( () ) ;
    public final void rule__UsuarioPassword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( () ) )
            // InternalMyDsl.g:2603:1: ( () )
            {
            // InternalMyDsl.g:2603:1: ( () )
            // InternalMyDsl.g:2604:2: ()
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordAction_0()); 
            // InternalMyDsl.g:2605:2: ()
            // InternalMyDsl.g:2605:3: 
            {
            }

             after(grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__0__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group__1"
    // InternalMyDsl.g:2613:1: rule__UsuarioPassword__Group__1 : rule__UsuarioPassword__Group__1__Impl rule__UsuarioPassword__Group__2 ;
    public final void rule__UsuarioPassword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__UsuarioPassword__Group__1__Impl rule__UsuarioPassword__Group__2 )
            // InternalMyDsl.g:2618:2: rule__UsuarioPassword__Group__1__Impl rule__UsuarioPassword__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UsuarioPassword__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__1"


    // $ANTLR start "rule__UsuarioPassword__Group__1__Impl"
    // InternalMyDsl.g:2625:1: rule__UsuarioPassword__Group__1__Impl : ( 'UsuarioPassword' ) ;
    public final void rule__UsuarioPassword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( ( 'UsuarioPassword' ) )
            // InternalMyDsl.g:2630:1: ( 'UsuarioPassword' )
            {
            // InternalMyDsl.g:2630:1: ( 'UsuarioPassword' )
            // InternalMyDsl.g:2631:2: 'UsuarioPassword'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__1__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group__2"
    // InternalMyDsl.g:2640:1: rule__UsuarioPassword__Group__2 : rule__UsuarioPassword__Group__2__Impl rule__UsuarioPassword__Group__3 ;
    public final void rule__UsuarioPassword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( rule__UsuarioPassword__Group__2__Impl rule__UsuarioPassword__Group__3 )
            // InternalMyDsl.g:2645:2: rule__UsuarioPassword__Group__2__Impl rule__UsuarioPassword__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__UsuarioPassword__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__2"


    // $ANTLR start "rule__UsuarioPassword__Group__2__Impl"
    // InternalMyDsl.g:2652:1: rule__UsuarioPassword__Group__2__Impl : ( '{' ) ;
    public final void rule__UsuarioPassword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( '{' ) )
            // InternalMyDsl.g:2657:1: ( '{' )
            {
            // InternalMyDsl.g:2657:1: ( '{' )
            // InternalMyDsl.g:2658:2: '{'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__2__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group__3"
    // InternalMyDsl.g:2667:1: rule__UsuarioPassword__Group__3 : rule__UsuarioPassword__Group__3__Impl rule__UsuarioPassword__Group__4 ;
    public final void rule__UsuarioPassword__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( rule__UsuarioPassword__Group__3__Impl rule__UsuarioPassword__Group__4 )
            // InternalMyDsl.g:2672:2: rule__UsuarioPassword__Group__3__Impl rule__UsuarioPassword__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__UsuarioPassword__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__3"


    // $ANTLR start "rule__UsuarioPassword__Group__3__Impl"
    // InternalMyDsl.g:2679:1: rule__UsuarioPassword__Group__3__Impl : ( ( rule__UsuarioPassword__Group_3__0 )? ) ;
    public final void rule__UsuarioPassword__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( ( rule__UsuarioPassword__Group_3__0 )? ) )
            // InternalMyDsl.g:2684:1: ( ( rule__UsuarioPassword__Group_3__0 )? )
            {
            // InternalMyDsl.g:2684:1: ( ( rule__UsuarioPassword__Group_3__0 )? )
            // InternalMyDsl.g:2685:2: ( rule__UsuarioPassword__Group_3__0 )?
            {
             before(grammarAccess.getUsuarioPasswordAccess().getGroup_3()); 
            // InternalMyDsl.g:2686:2: ( rule__UsuarioPassword__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2686:3: rule__UsuarioPassword__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsuarioPassword__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsuarioPasswordAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__3__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group__4"
    // InternalMyDsl.g:2694:1: rule__UsuarioPassword__Group__4 : rule__UsuarioPassword__Group__4__Impl rule__UsuarioPassword__Group__5 ;
    public final void rule__UsuarioPassword__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( rule__UsuarioPassword__Group__4__Impl rule__UsuarioPassword__Group__5 )
            // InternalMyDsl.g:2699:2: rule__UsuarioPassword__Group__4__Impl rule__UsuarioPassword__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__UsuarioPassword__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__4"


    // $ANTLR start "rule__UsuarioPassword__Group__4__Impl"
    // InternalMyDsl.g:2706:1: rule__UsuarioPassword__Group__4__Impl : ( ( rule__UsuarioPassword__Group_4__0 )? ) ;
    public final void rule__UsuarioPassword__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( ( ( rule__UsuarioPassword__Group_4__0 )? ) )
            // InternalMyDsl.g:2711:1: ( ( rule__UsuarioPassword__Group_4__0 )? )
            {
            // InternalMyDsl.g:2711:1: ( ( rule__UsuarioPassword__Group_4__0 )? )
            // InternalMyDsl.g:2712:2: ( rule__UsuarioPassword__Group_4__0 )?
            {
             before(grammarAccess.getUsuarioPasswordAccess().getGroup_4()); 
            // InternalMyDsl.g:2713:2: ( rule__UsuarioPassword__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2713:3: rule__UsuarioPassword__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsuarioPassword__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsuarioPasswordAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__4__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group__5"
    // InternalMyDsl.g:2721:1: rule__UsuarioPassword__Group__5 : rule__UsuarioPassword__Group__5__Impl ;
    public final void rule__UsuarioPassword__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( rule__UsuarioPassword__Group__5__Impl )
            // InternalMyDsl.g:2726:2: rule__UsuarioPassword__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__5"


    // $ANTLR start "rule__UsuarioPassword__Group__5__Impl"
    // InternalMyDsl.g:2732:1: rule__UsuarioPassword__Group__5__Impl : ( '}' ) ;
    public final void rule__UsuarioPassword__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2736:1: ( ( '}' ) )
            // InternalMyDsl.g:2737:1: ( '}' )
            {
            // InternalMyDsl.g:2737:1: ( '}' )
            // InternalMyDsl.g:2738:2: '}'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__5__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group_3__0"
    // InternalMyDsl.g:2748:1: rule__UsuarioPassword__Group_3__0 : rule__UsuarioPassword__Group_3__0__Impl rule__UsuarioPassword__Group_3__1 ;
    public final void rule__UsuarioPassword__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( rule__UsuarioPassword__Group_3__0__Impl rule__UsuarioPassword__Group_3__1 )
            // InternalMyDsl.g:2753:2: rule__UsuarioPassword__Group_3__0__Impl rule__UsuarioPassword__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__UsuarioPassword__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_3__0"


    // $ANTLR start "rule__UsuarioPassword__Group_3__0__Impl"
    // InternalMyDsl.g:2760:1: rule__UsuarioPassword__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__UsuarioPassword__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( 'usuario' ) )
            // InternalMyDsl.g:2765:1: ( 'usuario' )
            {
            // InternalMyDsl.g:2765:1: ( 'usuario' )
            // InternalMyDsl.g:2766:2: 'usuario'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_3__0__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group_3__1"
    // InternalMyDsl.g:2775:1: rule__UsuarioPassword__Group_3__1 : rule__UsuarioPassword__Group_3__1__Impl ;
    public final void rule__UsuarioPassword__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( rule__UsuarioPassword__Group_3__1__Impl )
            // InternalMyDsl.g:2780:2: rule__UsuarioPassword__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_3__1"


    // $ANTLR start "rule__UsuarioPassword__Group_3__1__Impl"
    // InternalMyDsl.g:2786:1: rule__UsuarioPassword__Group_3__1__Impl : ( ( rule__UsuarioPassword__UsuarioAssignment_3_1 ) ) ;
    public final void rule__UsuarioPassword__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2790:1: ( ( ( rule__UsuarioPassword__UsuarioAssignment_3_1 ) ) )
            // InternalMyDsl.g:2791:1: ( ( rule__UsuarioPassword__UsuarioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2791:1: ( ( rule__UsuarioPassword__UsuarioAssignment_3_1 ) )
            // InternalMyDsl.g:2792:2: ( rule__UsuarioPassword__UsuarioAssignment_3_1 )
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioAssignment_3_1()); 
            // InternalMyDsl.g:2793:2: ( rule__UsuarioPassword__UsuarioAssignment_3_1 )
            // InternalMyDsl.g:2793:3: rule__UsuarioPassword__UsuarioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__UsuarioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUsuarioPasswordAccess().getUsuarioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_3__1__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group_4__0"
    // InternalMyDsl.g:2802:1: rule__UsuarioPassword__Group_4__0 : rule__UsuarioPassword__Group_4__0__Impl rule__UsuarioPassword__Group_4__1 ;
    public final void rule__UsuarioPassword__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( rule__UsuarioPassword__Group_4__0__Impl rule__UsuarioPassword__Group_4__1 )
            // InternalMyDsl.g:2807:2: rule__UsuarioPassword__Group_4__0__Impl rule__UsuarioPassword__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__UsuarioPassword__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_4__0"


    // $ANTLR start "rule__UsuarioPassword__Group_4__0__Impl"
    // InternalMyDsl.g:2814:1: rule__UsuarioPassword__Group_4__0__Impl : ( 'password' ) ;
    public final void rule__UsuarioPassword__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( 'password' ) )
            // InternalMyDsl.g:2819:1: ( 'password' )
            {
            // InternalMyDsl.g:2819:1: ( 'password' )
            // InternalMyDsl.g:2820:2: 'password'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getPasswordKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getPasswordKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_4__0__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group_4__1"
    // InternalMyDsl.g:2829:1: rule__UsuarioPassword__Group_4__1 : rule__UsuarioPassword__Group_4__1__Impl ;
    public final void rule__UsuarioPassword__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( rule__UsuarioPassword__Group_4__1__Impl )
            // InternalMyDsl.g:2834:2: rule__UsuarioPassword__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_4__1"


    // $ANTLR start "rule__UsuarioPassword__Group_4__1__Impl"
    // InternalMyDsl.g:2840:1: rule__UsuarioPassword__Group_4__1__Impl : ( ( rule__UsuarioPassword__PasswordAssignment_4_1 ) ) ;
    public final void rule__UsuarioPassword__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2844:1: ( ( ( rule__UsuarioPassword__PasswordAssignment_4_1 ) ) )
            // InternalMyDsl.g:2845:1: ( ( rule__UsuarioPassword__PasswordAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2845:1: ( ( rule__UsuarioPassword__PasswordAssignment_4_1 ) )
            // InternalMyDsl.g:2846:2: ( rule__UsuarioPassword__PasswordAssignment_4_1 )
            {
             before(grammarAccess.getUsuarioPasswordAccess().getPasswordAssignment_4_1()); 
            // InternalMyDsl.g:2847:2: ( rule__UsuarioPassword__PasswordAssignment_4_1 )
            // InternalMyDsl.g:2847:3: rule__UsuarioPassword__PasswordAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__PasswordAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUsuarioPasswordAccess().getPasswordAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group_4__1__Impl"


    // $ANTLR start "rule__Llave__Group__0"
    // InternalMyDsl.g:2856:1: rule__Llave__Group__0 : rule__Llave__Group__0__Impl rule__Llave__Group__1 ;
    public final void rule__Llave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( rule__Llave__Group__0__Impl rule__Llave__Group__1 )
            // InternalMyDsl.g:2861:2: rule__Llave__Group__0__Impl rule__Llave__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Llave__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Llave__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__0"


    // $ANTLR start "rule__Llave__Group__0__Impl"
    // InternalMyDsl.g:2868:1: rule__Llave__Group__0__Impl : ( () ) ;
    public final void rule__Llave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( ( () ) )
            // InternalMyDsl.g:2873:1: ( () )
            {
            // InternalMyDsl.g:2873:1: ( () )
            // InternalMyDsl.g:2874:2: ()
            {
             before(grammarAccess.getLlaveAccess().getLlaveAction_0()); 
            // InternalMyDsl.g:2875:2: ()
            // InternalMyDsl.g:2875:3: 
            {
            }

             after(grammarAccess.getLlaveAccess().getLlaveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__0__Impl"


    // $ANTLR start "rule__Llave__Group__1"
    // InternalMyDsl.g:2883:1: rule__Llave__Group__1 : rule__Llave__Group__1__Impl rule__Llave__Group__2 ;
    public final void rule__Llave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( rule__Llave__Group__1__Impl rule__Llave__Group__2 )
            // InternalMyDsl.g:2888:2: rule__Llave__Group__1__Impl rule__Llave__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Llave__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Llave__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__1"


    // $ANTLR start "rule__Llave__Group__1__Impl"
    // InternalMyDsl.g:2895:1: rule__Llave__Group__1__Impl : ( 'Llave' ) ;
    public final void rule__Llave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( ( 'Llave' ) )
            // InternalMyDsl.g:2900:1: ( 'Llave' )
            {
            // InternalMyDsl.g:2900:1: ( 'Llave' )
            // InternalMyDsl.g:2901:2: 'Llave'
            {
             before(grammarAccess.getLlaveAccess().getLlaveKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLlaveAccess().getLlaveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__1__Impl"


    // $ANTLR start "rule__Llave__Group__2"
    // InternalMyDsl.g:2910:1: rule__Llave__Group__2 : rule__Llave__Group__2__Impl rule__Llave__Group__3 ;
    public final void rule__Llave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( rule__Llave__Group__2__Impl rule__Llave__Group__3 )
            // InternalMyDsl.g:2915:2: rule__Llave__Group__2__Impl rule__Llave__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Llave__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Llave__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__2"


    // $ANTLR start "rule__Llave__Group__2__Impl"
    // InternalMyDsl.g:2922:1: rule__Llave__Group__2__Impl : ( '{' ) ;
    public final void rule__Llave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( ( '{' ) )
            // InternalMyDsl.g:2927:1: ( '{' )
            {
            // InternalMyDsl.g:2927:1: ( '{' )
            // InternalMyDsl.g:2928:2: '{'
            {
             before(grammarAccess.getLlaveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLlaveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__2__Impl"


    // $ANTLR start "rule__Llave__Group__3"
    // InternalMyDsl.g:2937:1: rule__Llave__Group__3 : rule__Llave__Group__3__Impl rule__Llave__Group__4 ;
    public final void rule__Llave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( rule__Llave__Group__3__Impl rule__Llave__Group__4 )
            // InternalMyDsl.g:2942:2: rule__Llave__Group__3__Impl rule__Llave__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Llave__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Llave__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__3"


    // $ANTLR start "rule__Llave__Group__3__Impl"
    // InternalMyDsl.g:2949:1: rule__Llave__Group__3__Impl : ( ( rule__Llave__Group_3__0 )? ) ;
    public final void rule__Llave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( ( rule__Llave__Group_3__0 )? ) )
            // InternalMyDsl.g:2954:1: ( ( rule__Llave__Group_3__0 )? )
            {
            // InternalMyDsl.g:2954:1: ( ( rule__Llave__Group_3__0 )? )
            // InternalMyDsl.g:2955:2: ( rule__Llave__Group_3__0 )?
            {
             before(grammarAccess.getLlaveAccess().getGroup_3()); 
            // InternalMyDsl.g:2956:2: ( rule__Llave__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2956:3: rule__Llave__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Llave__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLlaveAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__3__Impl"


    // $ANTLR start "rule__Llave__Group__4"
    // InternalMyDsl.g:2964:1: rule__Llave__Group__4 : rule__Llave__Group__4__Impl ;
    public final void rule__Llave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( rule__Llave__Group__4__Impl )
            // InternalMyDsl.g:2969:2: rule__Llave__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Llave__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__4"


    // $ANTLR start "rule__Llave__Group__4__Impl"
    // InternalMyDsl.g:2975:1: rule__Llave__Group__4__Impl : ( '}' ) ;
    public final void rule__Llave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2979:1: ( ( '}' ) )
            // InternalMyDsl.g:2980:1: ( '}' )
            {
            // InternalMyDsl.g:2980:1: ( '}' )
            // InternalMyDsl.g:2981:2: '}'
            {
             before(grammarAccess.getLlaveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLlaveAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group__4__Impl"


    // $ANTLR start "rule__Llave__Group_3__0"
    // InternalMyDsl.g:2991:1: rule__Llave__Group_3__0 : rule__Llave__Group_3__0__Impl rule__Llave__Group_3__1 ;
    public final void rule__Llave__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( rule__Llave__Group_3__0__Impl rule__Llave__Group_3__1 )
            // InternalMyDsl.g:2996:2: rule__Llave__Group_3__0__Impl rule__Llave__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Llave__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Llave__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group_3__0"


    // $ANTLR start "rule__Llave__Group_3__0__Impl"
    // InternalMyDsl.g:3003:1: rule__Llave__Group_3__0__Impl : ( 'secreto' ) ;
    public final void rule__Llave__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( ( 'secreto' ) )
            // InternalMyDsl.g:3008:1: ( 'secreto' )
            {
            // InternalMyDsl.g:3008:1: ( 'secreto' )
            // InternalMyDsl.g:3009:2: 'secreto'
            {
             before(grammarAccess.getLlaveAccess().getSecretoKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLlaveAccess().getSecretoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group_3__0__Impl"


    // $ANTLR start "rule__Llave__Group_3__1"
    // InternalMyDsl.g:3018:1: rule__Llave__Group_3__1 : rule__Llave__Group_3__1__Impl ;
    public final void rule__Llave__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( rule__Llave__Group_3__1__Impl )
            // InternalMyDsl.g:3023:2: rule__Llave__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Llave__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group_3__1"


    // $ANTLR start "rule__Llave__Group_3__1__Impl"
    // InternalMyDsl.g:3029:1: rule__Llave__Group_3__1__Impl : ( ( rule__Llave__SecretoAssignment_3_1 ) ) ;
    public final void rule__Llave__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( ( ( rule__Llave__SecretoAssignment_3_1 ) ) )
            // InternalMyDsl.g:3034:1: ( ( rule__Llave__SecretoAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3034:1: ( ( rule__Llave__SecretoAssignment_3_1 ) )
            // InternalMyDsl.g:3035:2: ( rule__Llave__SecretoAssignment_3_1 )
            {
             before(grammarAccess.getLlaveAccess().getSecretoAssignment_3_1()); 
            // InternalMyDsl.g:3036:2: ( rule__Llave__SecretoAssignment_3_1 )
            // InternalMyDsl.g:3036:3: rule__Llave__SecretoAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Llave__SecretoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLlaveAccess().getSecretoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__Group_3__1__Impl"


    // $ANTLR start "rule__Conexion__Group__0"
    // InternalMyDsl.g:3045:1: rule__Conexion__Group__0 : rule__Conexion__Group__0__Impl rule__Conexion__Group__1 ;
    public final void rule__Conexion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( rule__Conexion__Group__0__Impl rule__Conexion__Group__1 )
            // InternalMyDsl.g:3050:2: rule__Conexion__Group__0__Impl rule__Conexion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Conexion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__0"


    // $ANTLR start "rule__Conexion__Group__0__Impl"
    // InternalMyDsl.g:3057:1: rule__Conexion__Group__0__Impl : ( 'Conexion' ) ;
    public final void rule__Conexion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( ( 'Conexion' ) )
            // InternalMyDsl.g:3062:1: ( 'Conexion' )
            {
            // InternalMyDsl.g:3062:1: ( 'Conexion' )
            // InternalMyDsl.g:3063:2: 'Conexion'
            {
             before(grammarAccess.getConexionAccess().getConexionKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getConexionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__0__Impl"


    // $ANTLR start "rule__Conexion__Group__1"
    // InternalMyDsl.g:3072:1: rule__Conexion__Group__1 : rule__Conexion__Group__1__Impl rule__Conexion__Group__2 ;
    public final void rule__Conexion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( rule__Conexion__Group__1__Impl rule__Conexion__Group__2 )
            // InternalMyDsl.g:3077:2: rule__Conexion__Group__1__Impl rule__Conexion__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Conexion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__1"


    // $ANTLR start "rule__Conexion__Group__1__Impl"
    // InternalMyDsl.g:3084:1: rule__Conexion__Group__1__Impl : ( '{' ) ;
    public final void rule__Conexion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( ( '{' ) )
            // InternalMyDsl.g:3089:1: ( '{' )
            {
            // InternalMyDsl.g:3089:1: ( '{' )
            // InternalMyDsl.g:3090:2: '{'
            {
             before(grammarAccess.getConexionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__1__Impl"


    // $ANTLR start "rule__Conexion__Group__2"
    // InternalMyDsl.g:3099:1: rule__Conexion__Group__2 : rule__Conexion__Group__2__Impl rule__Conexion__Group__3 ;
    public final void rule__Conexion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( rule__Conexion__Group__2__Impl rule__Conexion__Group__3 )
            // InternalMyDsl.g:3104:2: rule__Conexion__Group__2__Impl rule__Conexion__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Conexion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__2"


    // $ANTLR start "rule__Conexion__Group__2__Impl"
    // InternalMyDsl.g:3111:1: rule__Conexion__Group__2__Impl : ( ( rule__Conexion__Group_2__0 )? ) ;
    public final void rule__Conexion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( ( ( rule__Conexion__Group_2__0 )? ) )
            // InternalMyDsl.g:3116:1: ( ( rule__Conexion__Group_2__0 )? )
            {
            // InternalMyDsl.g:3116:1: ( ( rule__Conexion__Group_2__0 )? )
            // InternalMyDsl.g:3117:2: ( rule__Conexion__Group_2__0 )?
            {
             before(grammarAccess.getConexionAccess().getGroup_2()); 
            // InternalMyDsl.g:3118:2: ( rule__Conexion__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3118:3: rule__Conexion__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conexion__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConexionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__2__Impl"


    // $ANTLR start "rule__Conexion__Group__3"
    // InternalMyDsl.g:3126:1: rule__Conexion__Group__3 : rule__Conexion__Group__3__Impl rule__Conexion__Group__4 ;
    public final void rule__Conexion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( rule__Conexion__Group__3__Impl rule__Conexion__Group__4 )
            // InternalMyDsl.g:3131:2: rule__Conexion__Group__3__Impl rule__Conexion__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Conexion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__3"


    // $ANTLR start "rule__Conexion__Group__3__Impl"
    // InternalMyDsl.g:3138:1: rule__Conexion__Group__3__Impl : ( 'recursos' ) ;
    public final void rule__Conexion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( ( 'recursos' ) )
            // InternalMyDsl.g:3143:1: ( 'recursos' )
            {
            // InternalMyDsl.g:3143:1: ( 'recursos' )
            // InternalMyDsl.g:3144:2: 'recursos'
            {
             before(grammarAccess.getConexionAccess().getRecursosKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getRecursosKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__3__Impl"


    // $ANTLR start "rule__Conexion__Group__4"
    // InternalMyDsl.g:3153:1: rule__Conexion__Group__4 : rule__Conexion__Group__4__Impl rule__Conexion__Group__5 ;
    public final void rule__Conexion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( rule__Conexion__Group__4__Impl rule__Conexion__Group__5 )
            // InternalMyDsl.g:3158:2: rule__Conexion__Group__4__Impl rule__Conexion__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Conexion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__4"


    // $ANTLR start "rule__Conexion__Group__4__Impl"
    // InternalMyDsl.g:3165:1: rule__Conexion__Group__4__Impl : ( '(' ) ;
    public final void rule__Conexion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( ( '(' ) )
            // InternalMyDsl.g:3170:1: ( '(' )
            {
            // InternalMyDsl.g:3170:1: ( '(' )
            // InternalMyDsl.g:3171:2: '('
            {
             before(grammarAccess.getConexionAccess().getLeftParenthesisKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__4__Impl"


    // $ANTLR start "rule__Conexion__Group__5"
    // InternalMyDsl.g:3180:1: rule__Conexion__Group__5 : rule__Conexion__Group__5__Impl rule__Conexion__Group__6 ;
    public final void rule__Conexion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( rule__Conexion__Group__5__Impl rule__Conexion__Group__6 )
            // InternalMyDsl.g:3185:2: rule__Conexion__Group__5__Impl rule__Conexion__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Conexion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__5"


    // $ANTLR start "rule__Conexion__Group__5__Impl"
    // InternalMyDsl.g:3192:1: rule__Conexion__Group__5__Impl : ( ( rule__Conexion__RecursosAssignment_5 ) ) ;
    public final void rule__Conexion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( ( ( rule__Conexion__RecursosAssignment_5 ) ) )
            // InternalMyDsl.g:3197:1: ( ( rule__Conexion__RecursosAssignment_5 ) )
            {
            // InternalMyDsl.g:3197:1: ( ( rule__Conexion__RecursosAssignment_5 ) )
            // InternalMyDsl.g:3198:2: ( rule__Conexion__RecursosAssignment_5 )
            {
             before(grammarAccess.getConexionAccess().getRecursosAssignment_5()); 
            // InternalMyDsl.g:3199:2: ( rule__Conexion__RecursosAssignment_5 )
            // InternalMyDsl.g:3199:3: rule__Conexion__RecursosAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__RecursosAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConexionAccess().getRecursosAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__5__Impl"


    // $ANTLR start "rule__Conexion__Group__6"
    // InternalMyDsl.g:3207:1: rule__Conexion__Group__6 : rule__Conexion__Group__6__Impl rule__Conexion__Group__7 ;
    public final void rule__Conexion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( rule__Conexion__Group__6__Impl rule__Conexion__Group__7 )
            // InternalMyDsl.g:3212:2: rule__Conexion__Group__6__Impl rule__Conexion__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Conexion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__6"


    // $ANTLR start "rule__Conexion__Group__6__Impl"
    // InternalMyDsl.g:3219:1: rule__Conexion__Group__6__Impl : ( ( rule__Conexion__Group_6__0 )* ) ;
    public final void rule__Conexion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( ( ( rule__Conexion__Group_6__0 )* ) )
            // InternalMyDsl.g:3224:1: ( ( rule__Conexion__Group_6__0 )* )
            {
            // InternalMyDsl.g:3224:1: ( ( rule__Conexion__Group_6__0 )* )
            // InternalMyDsl.g:3225:2: ( rule__Conexion__Group_6__0 )*
            {
             before(grammarAccess.getConexionAccess().getGroup_6()); 
            // InternalMyDsl.g:3226:2: ( rule__Conexion__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:3226:3: rule__Conexion__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Conexion__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConexionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__6__Impl"


    // $ANTLR start "rule__Conexion__Group__7"
    // InternalMyDsl.g:3234:1: rule__Conexion__Group__7 : rule__Conexion__Group__7__Impl rule__Conexion__Group__8 ;
    public final void rule__Conexion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( rule__Conexion__Group__7__Impl rule__Conexion__Group__8 )
            // InternalMyDsl.g:3239:2: rule__Conexion__Group__7__Impl rule__Conexion__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Conexion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__7"


    // $ANTLR start "rule__Conexion__Group__7__Impl"
    // InternalMyDsl.g:3246:1: rule__Conexion__Group__7__Impl : ( ')' ) ;
    public final void rule__Conexion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3250:1: ( ( ')' ) )
            // InternalMyDsl.g:3251:1: ( ')' )
            {
            // InternalMyDsl.g:3251:1: ( ')' )
            // InternalMyDsl.g:3252:2: ')'
            {
             before(grammarAccess.getConexionAccess().getRightParenthesisKeyword_7()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__7__Impl"


    // $ANTLR start "rule__Conexion__Group__8"
    // InternalMyDsl.g:3261:1: rule__Conexion__Group__8 : rule__Conexion__Group__8__Impl ;
    public final void rule__Conexion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( rule__Conexion__Group__8__Impl )
            // InternalMyDsl.g:3266:2: rule__Conexion__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__8"


    // $ANTLR start "rule__Conexion__Group__8__Impl"
    // InternalMyDsl.g:3272:1: rule__Conexion__Group__8__Impl : ( '}' ) ;
    public final void rule__Conexion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3276:1: ( ( '}' ) )
            // InternalMyDsl.g:3277:1: ( '}' )
            {
            // InternalMyDsl.g:3277:1: ( '}' )
            // InternalMyDsl.g:3278:2: '}'
            {
             before(grammarAccess.getConexionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__8__Impl"


    // $ANTLR start "rule__Conexion__Group_2__0"
    // InternalMyDsl.g:3288:1: rule__Conexion__Group_2__0 : rule__Conexion__Group_2__0__Impl rule__Conexion__Group_2__1 ;
    public final void rule__Conexion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( rule__Conexion__Group_2__0__Impl rule__Conexion__Group_2__1 )
            // InternalMyDsl.g:3293:2: rule__Conexion__Group_2__0__Impl rule__Conexion__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Conexion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_2__0"


    // $ANTLR start "rule__Conexion__Group_2__0__Impl"
    // InternalMyDsl.g:3300:1: rule__Conexion__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__Conexion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:3305:1: ( 'nombre' )
            {
            // InternalMyDsl.g:3305:1: ( 'nombre' )
            // InternalMyDsl.g:3306:2: 'nombre'
            {
             before(grammarAccess.getConexionAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_2__0__Impl"


    // $ANTLR start "rule__Conexion__Group_2__1"
    // InternalMyDsl.g:3315:1: rule__Conexion__Group_2__1 : rule__Conexion__Group_2__1__Impl ;
    public final void rule__Conexion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( rule__Conexion__Group_2__1__Impl )
            // InternalMyDsl.g:3320:2: rule__Conexion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_2__1"


    // $ANTLR start "rule__Conexion__Group_2__1__Impl"
    // InternalMyDsl.g:3326:1: rule__Conexion__Group_2__1__Impl : ( ( rule__Conexion__NombreAssignment_2_1 ) ) ;
    public final void rule__Conexion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3330:1: ( ( ( rule__Conexion__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:3331:1: ( ( rule__Conexion__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3331:1: ( ( rule__Conexion__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:3332:2: ( rule__Conexion__NombreAssignment_2_1 )
            {
             before(grammarAccess.getConexionAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:3333:2: ( rule__Conexion__NombreAssignment_2_1 )
            // InternalMyDsl.g:3333:3: rule__Conexion__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConexionAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_2__1__Impl"


    // $ANTLR start "rule__Conexion__Group_6__0"
    // InternalMyDsl.g:3342:1: rule__Conexion__Group_6__0 : rule__Conexion__Group_6__0__Impl rule__Conexion__Group_6__1 ;
    public final void rule__Conexion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( rule__Conexion__Group_6__0__Impl rule__Conexion__Group_6__1 )
            // InternalMyDsl.g:3347:2: rule__Conexion__Group_6__0__Impl rule__Conexion__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Conexion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_6__0"


    // $ANTLR start "rule__Conexion__Group_6__0__Impl"
    // InternalMyDsl.g:3354:1: rule__Conexion__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Conexion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( ( ',' ) )
            // InternalMyDsl.g:3359:1: ( ',' )
            {
            // InternalMyDsl.g:3359:1: ( ',' )
            // InternalMyDsl.g:3360:2: ','
            {
             before(grammarAccess.getConexionAccess().getCommaKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_6__0__Impl"


    // $ANTLR start "rule__Conexion__Group_6__1"
    // InternalMyDsl.g:3369:1: rule__Conexion__Group_6__1 : rule__Conexion__Group_6__1__Impl ;
    public final void rule__Conexion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( rule__Conexion__Group_6__1__Impl )
            // InternalMyDsl.g:3374:2: rule__Conexion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_6__1"


    // $ANTLR start "rule__Conexion__Group_6__1__Impl"
    // InternalMyDsl.g:3380:1: rule__Conexion__Group_6__1__Impl : ( ( rule__Conexion__RecursosAssignment_6_1 ) ) ;
    public final void rule__Conexion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3384:1: ( ( ( rule__Conexion__RecursosAssignment_6_1 ) ) )
            // InternalMyDsl.g:3385:1: ( ( rule__Conexion__RecursosAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3385:1: ( ( rule__Conexion__RecursosAssignment_6_1 ) )
            // InternalMyDsl.g:3386:2: ( rule__Conexion__RecursosAssignment_6_1 )
            {
             before(grammarAccess.getConexionAccess().getRecursosAssignment_6_1()); 
            // InternalMyDsl.g:3387:2: ( rule__Conexion__RecursosAssignment_6_1 )
            // InternalMyDsl.g:3387:3: rule__Conexion__RecursosAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__RecursosAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConexionAccess().getRecursosAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group_6__1__Impl"


    // $ANTLR start "rule__VPC__Group__0"
    // InternalMyDsl.g:3396:1: rule__VPC__Group__0 : rule__VPC__Group__0__Impl rule__VPC__Group__1 ;
    public final void rule__VPC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( rule__VPC__Group__0__Impl rule__VPC__Group__1 )
            // InternalMyDsl.g:3401:2: rule__VPC__Group__0__Impl rule__VPC__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__VPC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__0"


    // $ANTLR start "rule__VPC__Group__0__Impl"
    // InternalMyDsl.g:3408:1: rule__VPC__Group__0__Impl : ( 'tipo' ) ;
    public final void rule__VPC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:3413:1: ( 'tipo' )
            {
            // InternalMyDsl.g:3413:1: ( 'tipo' )
            // InternalMyDsl.g:3414:2: 'tipo'
            {
             before(grammarAccess.getVPCAccess().getTipoKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getTipoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__0__Impl"


    // $ANTLR start "rule__VPC__Group__1"
    // InternalMyDsl.g:3423:1: rule__VPC__Group__1 : rule__VPC__Group__1__Impl rule__VPC__Group__2 ;
    public final void rule__VPC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( rule__VPC__Group__1__Impl rule__VPC__Group__2 )
            // InternalMyDsl.g:3428:2: rule__VPC__Group__1__Impl rule__VPC__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__VPC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__1"


    // $ANTLR start "rule__VPC__Group__1__Impl"
    // InternalMyDsl.g:3435:1: rule__VPC__Group__1__Impl : ( '=' ) ;
    public final void rule__VPC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( ( '=' ) )
            // InternalMyDsl.g:3440:1: ( '=' )
            {
            // InternalMyDsl.g:3440:1: ( '=' )
            // InternalMyDsl.g:3441:2: '='
            {
             before(grammarAccess.getVPCAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__1__Impl"


    // $ANTLR start "rule__VPC__Group__2"
    // InternalMyDsl.g:3450:1: rule__VPC__Group__2 : rule__VPC__Group__2__Impl rule__VPC__Group__3 ;
    public final void rule__VPC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3454:1: ( rule__VPC__Group__2__Impl rule__VPC__Group__3 )
            // InternalMyDsl.g:3455:2: rule__VPC__Group__2__Impl rule__VPC__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__VPC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__2"


    // $ANTLR start "rule__VPC__Group__2__Impl"
    // InternalMyDsl.g:3462:1: rule__VPC__Group__2__Impl : ( 'VPC' ) ;
    public final void rule__VPC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( ( 'VPC' ) )
            // InternalMyDsl.g:3467:1: ( 'VPC' )
            {
            // InternalMyDsl.g:3467:1: ( 'VPC' )
            // InternalMyDsl.g:3468:2: 'VPC'
            {
             before(grammarAccess.getVPCAccess().getVPCKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getVPCKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__2__Impl"


    // $ANTLR start "rule__VPC__Group__3"
    // InternalMyDsl.g:3477:1: rule__VPC__Group__3 : rule__VPC__Group__3__Impl rule__VPC__Group__4 ;
    public final void rule__VPC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( rule__VPC__Group__3__Impl rule__VPC__Group__4 )
            // InternalMyDsl.g:3482:2: rule__VPC__Group__3__Impl rule__VPC__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__VPC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__3"


    // $ANTLR start "rule__VPC__Group__3__Impl"
    // InternalMyDsl.g:3489:1: rule__VPC__Group__3__Impl : ( 'id' ) ;
    public final void rule__VPC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( ( 'id' ) )
            // InternalMyDsl.g:3494:1: ( 'id' )
            {
            // InternalMyDsl.g:3494:1: ( 'id' )
            // InternalMyDsl.g:3495:2: 'id'
            {
             before(grammarAccess.getVPCAccess().getIdKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__3__Impl"


    // $ANTLR start "rule__VPC__Group__4"
    // InternalMyDsl.g:3504:1: rule__VPC__Group__4 : rule__VPC__Group__4__Impl rule__VPC__Group__5 ;
    public final void rule__VPC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( rule__VPC__Group__4__Impl rule__VPC__Group__5 )
            // InternalMyDsl.g:3509:2: rule__VPC__Group__4__Impl rule__VPC__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__VPC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__4"


    // $ANTLR start "rule__VPC__Group__4__Impl"
    // InternalMyDsl.g:3516:1: rule__VPC__Group__4__Impl : ( '=' ) ;
    public final void rule__VPC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( ( '=' ) )
            // InternalMyDsl.g:3521:1: ( '=' )
            {
            // InternalMyDsl.g:3521:1: ( '=' )
            // InternalMyDsl.g:3522:2: '='
            {
             before(grammarAccess.getVPCAccess().getEqualsSignKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__4__Impl"


    // $ANTLR start "rule__VPC__Group__5"
    // InternalMyDsl.g:3531:1: rule__VPC__Group__5 : rule__VPC__Group__5__Impl ;
    public final void rule__VPC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( rule__VPC__Group__5__Impl )
            // InternalMyDsl.g:3536:2: rule__VPC__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__5"


    // $ANTLR start "rule__VPC__Group__5__Impl"
    // InternalMyDsl.g:3542:1: rule__VPC__Group__5__Impl : ( ( rule__VPC__NombreAssignment_5 ) ) ;
    public final void rule__VPC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3546:1: ( ( ( rule__VPC__NombreAssignment_5 ) ) )
            // InternalMyDsl.g:3547:1: ( ( rule__VPC__NombreAssignment_5 ) )
            {
            // InternalMyDsl.g:3547:1: ( ( rule__VPC__NombreAssignment_5 ) )
            // InternalMyDsl.g:3548:2: ( rule__VPC__NombreAssignment_5 )
            {
             before(grammarAccess.getVPCAccess().getNombreAssignment_5()); 
            // InternalMyDsl.g:3549:2: ( rule__VPC__NombreAssignment_5 )
            // InternalMyDsl.g:3549:3: rule__VPC__NombreAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__VPC__NombreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getNombreAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__5__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__0"
    // InternalMyDsl.g:3558:1: rule__ServidorAplicaciones__Group__0 : rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 ;
    public final void rule__ServidorAplicaciones__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3562:1: ( rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 )
            // InternalMyDsl.g:3563:2: rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAplicaciones__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group__0__Impl"
    // InternalMyDsl.g:3570:1: rule__ServidorAplicaciones__Group__0__Impl : ( 'ServidorAplicaciones' ) ;
    public final void rule__ServidorAplicaciones__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( ( 'ServidorAplicaciones' ) )
            // InternalMyDsl.g:3575:1: ( 'ServidorAplicaciones' )
            {
            // InternalMyDsl.g:3575:1: ( 'ServidorAplicaciones' )
            // InternalMyDsl.g:3576:2: 'ServidorAplicaciones'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__1"
    // InternalMyDsl.g:3585:1: rule__ServidorAplicaciones__Group__1 : rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 ;
    public final void rule__ServidorAplicaciones__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 )
            // InternalMyDsl.g:3590:2: rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ServidorAplicaciones__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group__1__Impl"
    // InternalMyDsl.g:3597:1: rule__ServidorAplicaciones__Group__1__Impl : ( '{' ) ;
    public final void rule__ServidorAplicaciones__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( ( '{' ) )
            // InternalMyDsl.g:3602:1: ( '{' )
            {
            // InternalMyDsl.g:3602:1: ( '{' )
            // InternalMyDsl.g:3603:2: '{'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__2"
    // InternalMyDsl.g:3612:1: rule__ServidorAplicaciones__Group__2 : rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 ;
    public final void rule__ServidorAplicaciones__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3616:1: ( rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 )
            // InternalMyDsl.g:3617:2: rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ServidorAplicaciones__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__2"


    // $ANTLR start "rule__ServidorAplicaciones__Group__2__Impl"
    // InternalMyDsl.g:3624:1: rule__ServidorAplicaciones__Group__2__Impl : ( ( rule__ServidorAplicaciones__Group_2__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( ( ( rule__ServidorAplicaciones__Group_2__0 )? ) )
            // InternalMyDsl.g:3629:1: ( ( rule__ServidorAplicaciones__Group_2__0 )? )
            {
            // InternalMyDsl.g:3629:1: ( ( rule__ServidorAplicaciones__Group_2__0 )? )
            // InternalMyDsl.g:3630:2: ( rule__ServidorAplicaciones__Group_2__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_2()); 
            // InternalMyDsl.g:3631:2: ( rule__ServidorAplicaciones__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3631:3: rule__ServidorAplicaciones__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__2__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__3"
    // InternalMyDsl.g:3639:1: rule__ServidorAplicaciones__Group__3 : rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 ;
    public final void rule__ServidorAplicaciones__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3643:1: ( rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 )
            // InternalMyDsl.g:3644:2: rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ServidorAplicaciones__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__3"


    // $ANTLR start "rule__ServidorAplicaciones__Group__3__Impl"
    // InternalMyDsl.g:3651:1: rule__ServidorAplicaciones__Group__3__Impl : ( ( rule__ServidorAplicaciones__Group_3__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( ( ( rule__ServidorAplicaciones__Group_3__0 )? ) )
            // InternalMyDsl.g:3656:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            {
            // InternalMyDsl.g:3656:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            // InternalMyDsl.g:3657:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_3()); 
            // InternalMyDsl.g:3658:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3658:3: rule__ServidorAplicaciones__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__3__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__4"
    // InternalMyDsl.g:3666:1: rule__ServidorAplicaciones__Group__4 : rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 ;
    public final void rule__ServidorAplicaciones__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 )
            // InternalMyDsl.g:3671:2: rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__ServidorAplicaciones__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__4"


    // $ANTLR start "rule__ServidorAplicaciones__Group__4__Impl"
    // InternalMyDsl.g:3678:1: rule__ServidorAplicaciones__Group__4__Impl : ( ( rule__ServidorAplicaciones__Group_4__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3682:1: ( ( ( rule__ServidorAplicaciones__Group_4__0 )? ) )
            // InternalMyDsl.g:3683:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            {
            // InternalMyDsl.g:3683:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            // InternalMyDsl.g:3684:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_4()); 
            // InternalMyDsl.g:3685:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==57) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3685:3: rule__ServidorAplicaciones__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__4__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__5"
    // InternalMyDsl.g:3693:1: rule__ServidorAplicaciones__Group__5 : rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 ;
    public final void rule__ServidorAplicaciones__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 )
            // InternalMyDsl.g:3698:2: rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__ServidorAplicaciones__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__5"


    // $ANTLR start "rule__ServidorAplicaciones__Group__5__Impl"
    // InternalMyDsl.g:3705:1: rule__ServidorAplicaciones__Group__5__Impl : ( ( rule__ServidorAplicaciones__Group_5__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( ( ( rule__ServidorAplicaciones__Group_5__0 )? ) )
            // InternalMyDsl.g:3710:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            {
            // InternalMyDsl.g:3710:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            // InternalMyDsl.g:3711:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_5()); 
            // InternalMyDsl.g:3712:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3712:3: rule__ServidorAplicaciones__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__5__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__6"
    // InternalMyDsl.g:3720:1: rule__ServidorAplicaciones__Group__6 : rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 ;
    public final void rule__ServidorAplicaciones__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3724:1: ( rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 )
            // InternalMyDsl.g:3725:2: rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAplicaciones__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__6"


    // $ANTLR start "rule__ServidorAplicaciones__Group__6__Impl"
    // InternalMyDsl.g:3732:1: rule__ServidorAplicaciones__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAplicaciones__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:3737:1: ( 'vpc' )
            {
            // InternalMyDsl.g:3737:1: ( 'vpc' )
            // InternalMyDsl.g:3738:2: 'vpc'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__6__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__7"
    // InternalMyDsl.g:3747:1: rule__ServidorAplicaciones__Group__7 : rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 ;
    public final void rule__ServidorAplicaciones__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 )
            // InternalMyDsl.g:3752:2: rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ServidorAplicaciones__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__7"


    // $ANTLR start "rule__ServidorAplicaciones__Group__7__Impl"
    // InternalMyDsl.g:3759:1: rule__ServidorAplicaciones__Group__7__Impl : ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) ) ;
    public final void rule__ServidorAplicaciones__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:3764:1: ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:3764:1: ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) )
            // InternalMyDsl.g:3765:2: ( rule__ServidorAplicaciones__VpcAssignment_7 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:3766:2: ( rule__ServidorAplicaciones__VpcAssignment_7 )
            // InternalMyDsl.g:3766:3: rule__ServidorAplicaciones__VpcAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__VpcAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getVpcAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__7__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__8"
    // InternalMyDsl.g:3774:1: rule__ServidorAplicaciones__Group__8 : rule__ServidorAplicaciones__Group__8__Impl ;
    public final void rule__ServidorAplicaciones__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( rule__ServidorAplicaciones__Group__8__Impl )
            // InternalMyDsl.g:3779:2: rule__ServidorAplicaciones__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__8"


    // $ANTLR start "rule__ServidorAplicaciones__Group__8__Impl"
    // InternalMyDsl.g:3785:1: rule__ServidorAplicaciones__Group__8__Impl : ( '}' ) ;
    public final void rule__ServidorAplicaciones__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3789:1: ( ( '}' ) )
            // InternalMyDsl.g:3790:1: ( '}' )
            {
            // InternalMyDsl.g:3790:1: ( '}' )
            // InternalMyDsl.g:3791:2: '}'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__8__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_2__0"
    // InternalMyDsl.g:3801:1: rule__ServidorAplicaciones__Group_2__0 : rule__ServidorAplicaciones__Group_2__0__Impl rule__ServidorAplicaciones__Group_2__1 ;
    public final void rule__ServidorAplicaciones__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( rule__ServidorAplicaciones__Group_2__0__Impl rule__ServidorAplicaciones__Group_2__1 )
            // InternalMyDsl.g:3806:2: rule__ServidorAplicaciones__Group_2__0__Impl rule__ServidorAplicaciones__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAplicaciones__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_2__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_2__0__Impl"
    // InternalMyDsl.g:3813:1: rule__ServidorAplicaciones__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAplicaciones__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:3818:1: ( 'nombre' )
            {
            // InternalMyDsl.g:3818:1: ( 'nombre' )
            // InternalMyDsl.g:3819:2: 'nombre'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_2__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_2__1"
    // InternalMyDsl.g:3828:1: rule__ServidorAplicaciones__Group_2__1 : rule__ServidorAplicaciones__Group_2__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( rule__ServidorAplicaciones__Group_2__1__Impl )
            // InternalMyDsl.g:3833:2: rule__ServidorAplicaciones__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_2__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_2__1__Impl"
    // InternalMyDsl.g:3839:1: rule__ServidorAplicaciones__Group_2__1__Impl : ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3843:1: ( ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:3844:1: ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3844:1: ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:3845:2: ( rule__ServidorAplicaciones__NombreAssignment_2_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:3846:2: ( rule__ServidorAplicaciones__NombreAssignment_2_1 )
            // InternalMyDsl.g:3846:3: rule__ServidorAplicaciones__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_2__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__0"
    // InternalMyDsl.g:3855:1: rule__ServidorAplicaciones__Group_3__0 : rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 ;
    public final void rule__ServidorAplicaciones__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3859:1: ( rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 )
            // InternalMyDsl.g:3860:2: rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__ServidorAplicaciones__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__0__Impl"
    // InternalMyDsl.g:3867:1: rule__ServidorAplicaciones__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__ServidorAplicaciones__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:3872:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:3872:1: ( 'tamanio' )
            // InternalMyDsl.g:3873:2: 'tamanio'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanioKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getTamanioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__1"
    // InternalMyDsl.g:3882:1: rule__ServidorAplicaciones__Group_3__1 : rule__ServidorAplicaciones__Group_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3886:1: ( rule__ServidorAplicaciones__Group_3__1__Impl )
            // InternalMyDsl.g:3887:2: rule__ServidorAplicaciones__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__1__Impl"
    // InternalMyDsl.g:3893:1: rule__ServidorAplicaciones__Group_3__1__Impl : ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3897:1: ( ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:3898:1: ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3898:1: ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:3899:2: ( rule__ServidorAplicaciones__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:3900:2: ( rule__ServidorAplicaciones__TamanioAssignment_3_1 )
            // InternalMyDsl.g:3900:3: rule__ServidorAplicaciones__TamanioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__TamanioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getTamanioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__0"
    // InternalMyDsl.g:3909:1: rule__ServidorAplicaciones__Group_4__0 : rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 ;
    public final void rule__ServidorAplicaciones__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3913:1: ( rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 )
            // InternalMyDsl.g:3914:2: rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__ServidorAplicaciones__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__0__Impl"
    // InternalMyDsl.g:3921:1: rule__ServidorAplicaciones__Group_4__0__Impl : ( 'sistemaOperativo' ) ;
    public final void rule__ServidorAplicaciones__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( ( 'sistemaOperativo' ) )
            // InternalMyDsl.g:3926:1: ( 'sistemaOperativo' )
            {
            // InternalMyDsl.g:3926:1: ( 'sistemaOperativo' )
            // InternalMyDsl.g:3927:2: 'sistemaOperativo'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__1"
    // InternalMyDsl.g:3936:1: rule__ServidorAplicaciones__Group_4__1 : rule__ServidorAplicaciones__Group_4__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( rule__ServidorAplicaciones__Group_4__1__Impl )
            // InternalMyDsl.g:3941:2: rule__ServidorAplicaciones__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__1__Impl"
    // InternalMyDsl.g:3947:1: rule__ServidorAplicaciones__Group_4__1__Impl : ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3951:1: ( ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) ) )
            // InternalMyDsl.g:3952:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3952:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) )
            // InternalMyDsl.g:3953:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoAssignment_4_1()); 
            // InternalMyDsl.g:3954:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 )
            // InternalMyDsl.g:3954:3: rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__0"
    // InternalMyDsl.g:3963:1: rule__ServidorAplicaciones__Group_5__0 : rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 ;
    public final void rule__ServidorAplicaciones__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3967:1: ( rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 )
            // InternalMyDsl.g:3968:2: rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__0__Impl"
    // InternalMyDsl.g:3975:1: rule__ServidorAplicaciones__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__ServidorAplicaciones__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3979:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:3980:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:3980:1: ( 'conexiones' )
            // InternalMyDsl.g:3981:2: 'conexiones'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getConexionesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__1"
    // InternalMyDsl.g:3990:1: rule__ServidorAplicaciones__Group_5__1 : rule__ServidorAplicaciones__Group_5__1__Impl rule__ServidorAplicaciones__Group_5__2 ;
    public final void rule__ServidorAplicaciones__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3994:1: ( rule__ServidorAplicaciones__Group_5__1__Impl rule__ServidorAplicaciones__Group_5__2 )
            // InternalMyDsl.g:3995:2: rule__ServidorAplicaciones__Group_5__1__Impl rule__ServidorAplicaciones__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAplicaciones__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__1__Impl"
    // InternalMyDsl.g:4002:1: rule__ServidorAplicaciones__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ServidorAplicaciones__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4006:1: ( ( '(' ) )
            // InternalMyDsl.g:4007:1: ( '(' )
            {
            // InternalMyDsl.g:4007:1: ( '(' )
            // InternalMyDsl.g:4008:2: '('
            {
             before(grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__2"
    // InternalMyDsl.g:4017:1: rule__ServidorAplicaciones__Group_5__2 : rule__ServidorAplicaciones__Group_5__2__Impl rule__ServidorAplicaciones__Group_5__3 ;
    public final void rule__ServidorAplicaciones__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4021:1: ( rule__ServidorAplicaciones__Group_5__2__Impl rule__ServidorAplicaciones__Group_5__3 )
            // InternalMyDsl.g:4022:2: rule__ServidorAplicaciones__Group_5__2__Impl rule__ServidorAplicaciones__Group_5__3
            {
            pushFollow(FOLLOW_26);
            rule__ServidorAplicaciones__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__2"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__2__Impl"
    // InternalMyDsl.g:4029:1: rule__ServidorAplicaciones__Group_5__2__Impl : ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) ) ;
    public final void rule__ServidorAplicaciones__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:4034:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:4034:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:4035:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:4036:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:4036:3: rule__ServidorAplicaciones__ConexionesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__ConexionesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getConexionesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__2__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__3"
    // InternalMyDsl.g:4044:1: rule__ServidorAplicaciones__Group_5__3 : rule__ServidorAplicaciones__Group_5__3__Impl rule__ServidorAplicaciones__Group_5__4 ;
    public final void rule__ServidorAplicaciones__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( rule__ServidorAplicaciones__Group_5__3__Impl rule__ServidorAplicaciones__Group_5__4 )
            // InternalMyDsl.g:4049:2: rule__ServidorAplicaciones__Group_5__3__Impl rule__ServidorAplicaciones__Group_5__4
            {
            pushFollow(FOLLOW_26);
            rule__ServidorAplicaciones__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__3"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__3__Impl"
    // InternalMyDsl.g:4056:1: rule__ServidorAplicaciones__Group_5__3__Impl : ( ( rule__ServidorAplicaciones__Group_5_3__0 )* ) ;
    public final void rule__ServidorAplicaciones__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4060:1: ( ( ( rule__ServidorAplicaciones__Group_5_3__0 )* ) )
            // InternalMyDsl.g:4061:1: ( ( rule__ServidorAplicaciones__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:4061:1: ( ( rule__ServidorAplicaciones__Group_5_3__0 )* )
            // InternalMyDsl.g:4062:2: ( rule__ServidorAplicaciones__Group_5_3__0 )*
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_5_3()); 
            // InternalMyDsl.g:4063:2: ( rule__ServidorAplicaciones__Group_5_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:4063:3: rule__ServidorAplicaciones__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ServidorAplicaciones__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__3__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__4"
    // InternalMyDsl.g:4071:1: rule__ServidorAplicaciones__Group_5__4 : rule__ServidorAplicaciones__Group_5__4__Impl ;
    public final void rule__ServidorAplicaciones__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4075:1: ( rule__ServidorAplicaciones__Group_5__4__Impl )
            // InternalMyDsl.g:4076:2: rule__ServidorAplicaciones__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__4"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__4__Impl"
    // InternalMyDsl.g:4082:1: rule__ServidorAplicaciones__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ServidorAplicaciones__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4086:1: ( ( ')' ) )
            // InternalMyDsl.g:4087:1: ( ')' )
            {
            // InternalMyDsl.g:4087:1: ( ')' )
            // InternalMyDsl.g:4088:2: ')'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_5_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__4__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5_3__0"
    // InternalMyDsl.g:4098:1: rule__ServidorAplicaciones__Group_5_3__0 : rule__ServidorAplicaciones__Group_5_3__0__Impl rule__ServidorAplicaciones__Group_5_3__1 ;
    public final void rule__ServidorAplicaciones__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4102:1: ( rule__ServidorAplicaciones__Group_5_3__0__Impl rule__ServidorAplicaciones__Group_5_3__1 )
            // InternalMyDsl.g:4103:2: rule__ServidorAplicaciones__Group_5_3__0__Impl rule__ServidorAplicaciones__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAplicaciones__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5_3__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5_3__0__Impl"
    // InternalMyDsl.g:4110:1: rule__ServidorAplicaciones__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorAplicaciones__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4114:1: ( ( ',' ) )
            // InternalMyDsl.g:4115:1: ( ',' )
            {
            // InternalMyDsl.g:4115:1: ( ',' )
            // InternalMyDsl.g:4116:2: ','
            {
             before(grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_5_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5_3__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5_3__1"
    // InternalMyDsl.g:4125:1: rule__ServidorAplicaciones__Group_5_3__1 : rule__ServidorAplicaciones__Group_5_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4129:1: ( rule__ServidorAplicaciones__Group_5_3__1__Impl )
            // InternalMyDsl.g:4130:2: rule__ServidorAplicaciones__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5_3__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5_3__1__Impl"
    // InternalMyDsl.g:4136:1: rule__ServidorAplicaciones__Group_5_3__1__Impl : ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4140:1: ( ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:4141:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:4141:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:4142:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:4143:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:4143:3: rule__ServidorAplicaciones__ConexionesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__ConexionesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getConexionesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5_3__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__0"
    // InternalMyDsl.g:4152:1: rule__ServidorAlmacenamiento__Group__0 : rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1 ;
    public final void rule__ServidorAlmacenamiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4156:1: ( rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1 )
            // InternalMyDsl.g:4157:2: rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAlmacenamiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__0__Impl"
    // InternalMyDsl.g:4164:1: rule__ServidorAlmacenamiento__Group__0__Impl : ( 'ServidorAlmacenamiento' ) ;
    public final void rule__ServidorAlmacenamiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4168:1: ( ( 'ServidorAlmacenamiento' ) )
            // InternalMyDsl.g:4169:1: ( 'ServidorAlmacenamiento' )
            {
            // InternalMyDsl.g:4169:1: ( 'ServidorAlmacenamiento' )
            // InternalMyDsl.g:4170:2: 'ServidorAlmacenamiento'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__1"
    // InternalMyDsl.g:4179:1: rule__ServidorAlmacenamiento__Group__1 : rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2 ;
    public final void rule__ServidorAlmacenamiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4183:1: ( rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2 )
            // InternalMyDsl.g:4184:2: rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ServidorAlmacenamiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__1__Impl"
    // InternalMyDsl.g:4191:1: rule__ServidorAlmacenamiento__Group__1__Impl : ( '{' ) ;
    public final void rule__ServidorAlmacenamiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4195:1: ( ( '{' ) )
            // InternalMyDsl.g:4196:1: ( '{' )
            {
            // InternalMyDsl.g:4196:1: ( '{' )
            // InternalMyDsl.g:4197:2: '{'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__2"
    // InternalMyDsl.g:4206:1: rule__ServidorAlmacenamiento__Group__2 : rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3 ;
    public final void rule__ServidorAlmacenamiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4210:1: ( rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3 )
            // InternalMyDsl.g:4211:2: rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ServidorAlmacenamiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__2"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__2__Impl"
    // InternalMyDsl.g:4218:1: rule__ServidorAlmacenamiento__Group__2__Impl : ( ( rule__ServidorAlmacenamiento__Group_2__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4222:1: ( ( ( rule__ServidorAlmacenamiento__Group_2__0 )? ) )
            // InternalMyDsl.g:4223:1: ( ( rule__ServidorAlmacenamiento__Group_2__0 )? )
            {
            // InternalMyDsl.g:4223:1: ( ( rule__ServidorAlmacenamiento__Group_2__0 )? )
            // InternalMyDsl.g:4224:2: ( rule__ServidorAlmacenamiento__Group_2__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_2()); 
            // InternalMyDsl.g:4225:2: ( rule__ServidorAlmacenamiento__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:4225:3: rule__ServidorAlmacenamiento__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAlmacenamiento__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__2__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__3"
    // InternalMyDsl.g:4233:1: rule__ServidorAlmacenamiento__Group__3 : rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4 ;
    public final void rule__ServidorAlmacenamiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4237:1: ( rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4 )
            // InternalMyDsl.g:4238:2: rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ServidorAlmacenamiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__3"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__3__Impl"
    // InternalMyDsl.g:4245:1: rule__ServidorAlmacenamiento__Group__3__Impl : ( ( rule__ServidorAlmacenamiento__Group_3__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4249:1: ( ( ( rule__ServidorAlmacenamiento__Group_3__0 )? ) )
            // InternalMyDsl.g:4250:1: ( ( rule__ServidorAlmacenamiento__Group_3__0 )? )
            {
            // InternalMyDsl.g:4250:1: ( ( rule__ServidorAlmacenamiento__Group_3__0 )? )
            // InternalMyDsl.g:4251:2: ( rule__ServidorAlmacenamiento__Group_3__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_3()); 
            // InternalMyDsl.g:4252:2: ( rule__ServidorAlmacenamiento__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4252:3: rule__ServidorAlmacenamiento__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAlmacenamiento__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__3__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__4"
    // InternalMyDsl.g:4260:1: rule__ServidorAlmacenamiento__Group__4 : rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5 ;
    public final void rule__ServidorAlmacenamiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4264:1: ( rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5 )
            // InternalMyDsl.g:4265:2: rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__ServidorAlmacenamiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__4"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__4__Impl"
    // InternalMyDsl.g:4272:1: rule__ServidorAlmacenamiento__Group__4__Impl : ( ( rule__ServidorAlmacenamiento__Group_4__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4276:1: ( ( ( rule__ServidorAlmacenamiento__Group_4__0 )? ) )
            // InternalMyDsl.g:4277:1: ( ( rule__ServidorAlmacenamiento__Group_4__0 )? )
            {
            // InternalMyDsl.g:4277:1: ( ( rule__ServidorAlmacenamiento__Group_4__0 )? )
            // InternalMyDsl.g:4278:2: ( rule__ServidorAlmacenamiento__Group_4__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_4()); 
            // InternalMyDsl.g:4279:2: ( rule__ServidorAlmacenamiento__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4279:3: rule__ServidorAlmacenamiento__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAlmacenamiento__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__4__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__5"
    // InternalMyDsl.g:4287:1: rule__ServidorAlmacenamiento__Group__5 : rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6 ;
    public final void rule__ServidorAlmacenamiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4291:1: ( rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6 )
            // InternalMyDsl.g:4292:2: rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__ServidorAlmacenamiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__5"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__5__Impl"
    // InternalMyDsl.g:4299:1: rule__ServidorAlmacenamiento__Group__5__Impl : ( ( rule__ServidorAlmacenamiento__Group_5__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4303:1: ( ( ( rule__ServidorAlmacenamiento__Group_5__0 )? ) )
            // InternalMyDsl.g:4304:1: ( ( rule__ServidorAlmacenamiento__Group_5__0 )? )
            {
            // InternalMyDsl.g:4304:1: ( ( rule__ServidorAlmacenamiento__Group_5__0 )? )
            // InternalMyDsl.g:4305:2: ( rule__ServidorAlmacenamiento__Group_5__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_5()); 
            // InternalMyDsl.g:4306:2: ( rule__ServidorAlmacenamiento__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4306:3: rule__ServidorAlmacenamiento__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAlmacenamiento__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__5__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__6"
    // InternalMyDsl.g:4314:1: rule__ServidorAlmacenamiento__Group__6 : rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7 ;
    public final void rule__ServidorAlmacenamiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4318:1: ( rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7 )
            // InternalMyDsl.g:4319:2: rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAlmacenamiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__6"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__6__Impl"
    // InternalMyDsl.g:4326:1: rule__ServidorAlmacenamiento__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAlmacenamiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4330:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:4331:1: ( 'vpc' )
            {
            // InternalMyDsl.g:4331:1: ( 'vpc' )
            // InternalMyDsl.g:4332:2: 'vpc'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__6__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__7"
    // InternalMyDsl.g:4341:1: rule__ServidorAlmacenamiento__Group__7 : rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8 ;
    public final void rule__ServidorAlmacenamiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4345:1: ( rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8 )
            // InternalMyDsl.g:4346:2: rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ServidorAlmacenamiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__7"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__7__Impl"
    // InternalMyDsl.g:4353:1: rule__ServidorAlmacenamiento__Group__7__Impl : ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4357:1: ( ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:4358:1: ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:4358:1: ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) )
            // InternalMyDsl.g:4359:2: ( rule__ServidorAlmacenamiento__VpcAssignment_7 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:4360:2: ( rule__ServidorAlmacenamiento__VpcAssignment_7 )
            // InternalMyDsl.g:4360:3: rule__ServidorAlmacenamiento__VpcAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__VpcAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__7__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__8"
    // InternalMyDsl.g:4368:1: rule__ServidorAlmacenamiento__Group__8 : rule__ServidorAlmacenamiento__Group__8__Impl ;
    public final void rule__ServidorAlmacenamiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4372:1: ( rule__ServidorAlmacenamiento__Group__8__Impl )
            // InternalMyDsl.g:4373:2: rule__ServidorAlmacenamiento__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__8"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__8__Impl"
    // InternalMyDsl.g:4379:1: rule__ServidorAlmacenamiento__Group__8__Impl : ( '}' ) ;
    public final void rule__ServidorAlmacenamiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4383:1: ( ( '}' ) )
            // InternalMyDsl.g:4384:1: ( '}' )
            {
            // InternalMyDsl.g:4384:1: ( '}' )
            // InternalMyDsl.g:4385:2: '}'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__8__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_2__0"
    // InternalMyDsl.g:4395:1: rule__ServidorAlmacenamiento__Group_2__0 : rule__ServidorAlmacenamiento__Group_2__0__Impl rule__ServidorAlmacenamiento__Group_2__1 ;
    public final void rule__ServidorAlmacenamiento__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4399:1: ( rule__ServidorAlmacenamiento__Group_2__0__Impl rule__ServidorAlmacenamiento__Group_2__1 )
            // InternalMyDsl.g:4400:2: rule__ServidorAlmacenamiento__Group_2__0__Impl rule__ServidorAlmacenamiento__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAlmacenamiento__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_2__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_2__0__Impl"
    // InternalMyDsl.g:4407:1: rule__ServidorAlmacenamiento__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAlmacenamiento__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4411:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:4412:1: ( 'nombre' )
            {
            // InternalMyDsl.g:4412:1: ( 'nombre' )
            // InternalMyDsl.g:4413:2: 'nombre'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_2__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_2__1"
    // InternalMyDsl.g:4422:1: rule__ServidorAlmacenamiento__Group_2__1 : rule__ServidorAlmacenamiento__Group_2__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4426:1: ( rule__ServidorAlmacenamiento__Group_2__1__Impl )
            // InternalMyDsl.g:4427:2: rule__ServidorAlmacenamiento__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_2__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_2__1__Impl"
    // InternalMyDsl.g:4433:1: rule__ServidorAlmacenamiento__Group_2__1__Impl : ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4437:1: ( ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:4438:1: ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:4438:1: ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:4439:2: ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:4440:2: ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 )
            // InternalMyDsl.g:4440:3: rule__ServidorAlmacenamiento__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_2__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_3__0"
    // InternalMyDsl.g:4449:1: rule__ServidorAlmacenamiento__Group_3__0 : rule__ServidorAlmacenamiento__Group_3__0__Impl rule__ServidorAlmacenamiento__Group_3__1 ;
    public final void rule__ServidorAlmacenamiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4453:1: ( rule__ServidorAlmacenamiento__Group_3__0__Impl rule__ServidorAlmacenamiento__Group_3__1 )
            // InternalMyDsl.g:4454:2: rule__ServidorAlmacenamiento__Group_3__0__Impl rule__ServidorAlmacenamiento__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__ServidorAlmacenamiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_3__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_3__0__Impl"
    // InternalMyDsl.g:4461:1: rule__ServidorAlmacenamiento__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__ServidorAlmacenamiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4465:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:4466:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:4466:1: ( 'tamanio' )
            // InternalMyDsl.g:4467:2: 'tamanio'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_3__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_3__1"
    // InternalMyDsl.g:4476:1: rule__ServidorAlmacenamiento__Group_3__1 : rule__ServidorAlmacenamiento__Group_3__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4480:1: ( rule__ServidorAlmacenamiento__Group_3__1__Impl )
            // InternalMyDsl.g:4481:2: rule__ServidorAlmacenamiento__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_3__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_3__1__Impl"
    // InternalMyDsl.g:4487:1: rule__ServidorAlmacenamiento__Group_3__1__Impl : ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4491:1: ( ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:4492:1: ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4492:1: ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:4493:2: ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:4494:2: ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 )
            // InternalMyDsl.g:4494:3: rule__ServidorAlmacenamiento__TamanioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__TamanioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_3__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_4__0"
    // InternalMyDsl.g:4503:1: rule__ServidorAlmacenamiento__Group_4__0 : rule__ServidorAlmacenamiento__Group_4__0__Impl rule__ServidorAlmacenamiento__Group_4__1 ;
    public final void rule__ServidorAlmacenamiento__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4507:1: ( rule__ServidorAlmacenamiento__Group_4__0__Impl rule__ServidorAlmacenamiento__Group_4__1 )
            // InternalMyDsl.g:4508:2: rule__ServidorAlmacenamiento__Group_4__0__Impl rule__ServidorAlmacenamiento__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__ServidorAlmacenamiento__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_4__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_4__0__Impl"
    // InternalMyDsl.g:4515:1: rule__ServidorAlmacenamiento__Group_4__0__Impl : ( 'tamanioInicial' ) ;
    public final void rule__ServidorAlmacenamiento__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4519:1: ( ( 'tamanioInicial' ) )
            // InternalMyDsl.g:4520:1: ( 'tamanioInicial' )
            {
            // InternalMyDsl.g:4520:1: ( 'tamanioInicial' )
            // InternalMyDsl.g:4521:2: 'tamanioInicial'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_4__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_4__1"
    // InternalMyDsl.g:4530:1: rule__ServidorAlmacenamiento__Group_4__1 : rule__ServidorAlmacenamiento__Group_4__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4534:1: ( rule__ServidorAlmacenamiento__Group_4__1__Impl )
            // InternalMyDsl.g:4535:2: rule__ServidorAlmacenamiento__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_4__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_4__1__Impl"
    // InternalMyDsl.g:4541:1: rule__ServidorAlmacenamiento__Group_4__1__Impl : ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4545:1: ( ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) ) )
            // InternalMyDsl.g:4546:1: ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4546:1: ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) )
            // InternalMyDsl.g:4547:2: ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialAssignment_4_1()); 
            // InternalMyDsl.g:4548:2: ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 )
            // InternalMyDsl.g:4548:3: rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_4__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__0"
    // InternalMyDsl.g:4557:1: rule__ServidorAlmacenamiento__Group_5__0 : rule__ServidorAlmacenamiento__Group_5__0__Impl rule__ServidorAlmacenamiento__Group_5__1 ;
    public final void rule__ServidorAlmacenamiento__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4561:1: ( rule__ServidorAlmacenamiento__Group_5__0__Impl rule__ServidorAlmacenamiento__Group_5__1 )
            // InternalMyDsl.g:4562:2: rule__ServidorAlmacenamiento__Group_5__0__Impl rule__ServidorAlmacenamiento__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAlmacenamiento__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__0__Impl"
    // InternalMyDsl.g:4569:1: rule__ServidorAlmacenamiento__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:4574:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:4574:1: ( 'conexiones' )
            // InternalMyDsl.g:4575:2: 'conexiones'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getConexionesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__1"
    // InternalMyDsl.g:4584:1: rule__ServidorAlmacenamiento__Group_5__1 : rule__ServidorAlmacenamiento__Group_5__1__Impl rule__ServidorAlmacenamiento__Group_5__2 ;
    public final void rule__ServidorAlmacenamiento__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( rule__ServidorAlmacenamiento__Group_5__1__Impl rule__ServidorAlmacenamiento__Group_5__2 )
            // InternalMyDsl.g:4589:2: rule__ServidorAlmacenamiento__Group_5__1__Impl rule__ServidorAlmacenamiento__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAlmacenamiento__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__1__Impl"
    // InternalMyDsl.g:4596:1: rule__ServidorAlmacenamiento__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4600:1: ( ( '(' ) )
            // InternalMyDsl.g:4601:1: ( '(' )
            {
            // InternalMyDsl.g:4601:1: ( '(' )
            // InternalMyDsl.g:4602:2: '('
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__2"
    // InternalMyDsl.g:4611:1: rule__ServidorAlmacenamiento__Group_5__2 : rule__ServidorAlmacenamiento__Group_5__2__Impl rule__ServidorAlmacenamiento__Group_5__3 ;
    public final void rule__ServidorAlmacenamiento__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4615:1: ( rule__ServidorAlmacenamiento__Group_5__2__Impl rule__ServidorAlmacenamiento__Group_5__3 )
            // InternalMyDsl.g:4616:2: rule__ServidorAlmacenamiento__Group_5__2__Impl rule__ServidorAlmacenamiento__Group_5__3
            {
            pushFollow(FOLLOW_26);
            rule__ServidorAlmacenamiento__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__2"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__2__Impl"
    // InternalMyDsl.g:4623:1: rule__ServidorAlmacenamiento__Group_5__2__Impl : ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4627:1: ( ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:4628:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:4628:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:4629:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:4630:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:4630:3: rule__ServidorAlmacenamiento__ConexionesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__ConexionesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getConexionesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__2__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__3"
    // InternalMyDsl.g:4638:1: rule__ServidorAlmacenamiento__Group_5__3 : rule__ServidorAlmacenamiento__Group_5__3__Impl rule__ServidorAlmacenamiento__Group_5__4 ;
    public final void rule__ServidorAlmacenamiento__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4642:1: ( rule__ServidorAlmacenamiento__Group_5__3__Impl rule__ServidorAlmacenamiento__Group_5__4 )
            // InternalMyDsl.g:4643:2: rule__ServidorAlmacenamiento__Group_5__3__Impl rule__ServidorAlmacenamiento__Group_5__4
            {
            pushFollow(FOLLOW_26);
            rule__ServidorAlmacenamiento__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__3"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__3__Impl"
    // InternalMyDsl.g:4650:1: rule__ServidorAlmacenamiento__Group_5__3__Impl : ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4654:1: ( ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* ) )
            // InternalMyDsl.g:4655:1: ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:4655:1: ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* )
            // InternalMyDsl.g:4656:2: ( rule__ServidorAlmacenamiento__Group_5_3__0 )*
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_5_3()); 
            // InternalMyDsl.g:4657:2: ( rule__ServidorAlmacenamiento__Group_5_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:4657:3: rule__ServidorAlmacenamiento__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ServidorAlmacenamiento__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__3__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__4"
    // InternalMyDsl.g:4665:1: rule__ServidorAlmacenamiento__Group_5__4 : rule__ServidorAlmacenamiento__Group_5__4__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4669:1: ( rule__ServidorAlmacenamiento__Group_5__4__Impl )
            // InternalMyDsl.g:4670:2: rule__ServidorAlmacenamiento__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__4"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5__4__Impl"
    // InternalMyDsl.g:4676:1: rule__ServidorAlmacenamiento__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4680:1: ( ( ')' ) )
            // InternalMyDsl.g:4681:1: ( ')' )
            {
            // InternalMyDsl.g:4681:1: ( ')' )
            // InternalMyDsl.g:4682:2: ')'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getRightParenthesisKeyword_5_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5__4__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5_3__0"
    // InternalMyDsl.g:4692:1: rule__ServidorAlmacenamiento__Group_5_3__0 : rule__ServidorAlmacenamiento__Group_5_3__0__Impl rule__ServidorAlmacenamiento__Group_5_3__1 ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4696:1: ( rule__ServidorAlmacenamiento__Group_5_3__0__Impl rule__ServidorAlmacenamiento__Group_5_3__1 )
            // InternalMyDsl.g:4697:2: rule__ServidorAlmacenamiento__Group_5_3__0__Impl rule__ServidorAlmacenamiento__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ServidorAlmacenamiento__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5_3__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5_3__0__Impl"
    // InternalMyDsl.g:4704:1: rule__ServidorAlmacenamiento__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( ( ',' ) )
            // InternalMyDsl.g:4709:1: ( ',' )
            {
            // InternalMyDsl.g:4709:1: ( ',' )
            // InternalMyDsl.g:4710:2: ','
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getCommaKeyword_5_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5_3__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5_3__1"
    // InternalMyDsl.g:4719:1: rule__ServidorAlmacenamiento__Group_5_3__1 : rule__ServidorAlmacenamiento__Group_5_3__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4723:1: ( rule__ServidorAlmacenamiento__Group_5_3__1__Impl )
            // InternalMyDsl.g:4724:2: rule__ServidorAlmacenamiento__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5_3__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_5_3__1__Impl"
    // InternalMyDsl.g:4730:1: rule__ServidorAlmacenamiento__Group_5_3__1__Impl : ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4734:1: ( ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:4735:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:4735:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:4736:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:4737:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:4737:3: rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getConexionesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_5_3__1__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__0"
    // InternalMyDsl.g:4746:1: rule__BaseDatosSQL__Group__0 : rule__BaseDatosSQL__Group__0__Impl rule__BaseDatosSQL__Group__1 ;
    public final void rule__BaseDatosSQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( rule__BaseDatosSQL__Group__0__Impl rule__BaseDatosSQL__Group__1 )
            // InternalMyDsl.g:4751:2: rule__BaseDatosSQL__Group__0__Impl rule__BaseDatosSQL__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BaseDatosSQL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__0"


    // $ANTLR start "rule__BaseDatosSQL__Group__0__Impl"
    // InternalMyDsl.g:4758:1: rule__BaseDatosSQL__Group__0__Impl : ( 'BaseDatosSQL' ) ;
    public final void rule__BaseDatosSQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4762:1: ( ( 'BaseDatosSQL' ) )
            // InternalMyDsl.g:4763:1: ( 'BaseDatosSQL' )
            {
            // InternalMyDsl.g:4763:1: ( 'BaseDatosSQL' )
            // InternalMyDsl.g:4764:2: 'BaseDatosSQL'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getBaseDatosSQLKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getBaseDatosSQLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__0__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__1"
    // InternalMyDsl.g:4773:1: rule__BaseDatosSQL__Group__1 : rule__BaseDatosSQL__Group__1__Impl rule__BaseDatosSQL__Group__2 ;
    public final void rule__BaseDatosSQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4777:1: ( rule__BaseDatosSQL__Group__1__Impl rule__BaseDatosSQL__Group__2 )
            // InternalMyDsl.g:4778:2: rule__BaseDatosSQL__Group__1__Impl rule__BaseDatosSQL__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosSQL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__1"


    // $ANTLR start "rule__BaseDatosSQL__Group__1__Impl"
    // InternalMyDsl.g:4785:1: rule__BaseDatosSQL__Group__1__Impl : ( '{' ) ;
    public final void rule__BaseDatosSQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4789:1: ( ( '{' ) )
            // InternalMyDsl.g:4790:1: ( '{' )
            {
            // InternalMyDsl.g:4790:1: ( '{' )
            // InternalMyDsl.g:4791:2: '{'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__1__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__2"
    // InternalMyDsl.g:4800:1: rule__BaseDatosSQL__Group__2 : rule__BaseDatosSQL__Group__2__Impl rule__BaseDatosSQL__Group__3 ;
    public final void rule__BaseDatosSQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4804:1: ( rule__BaseDatosSQL__Group__2__Impl rule__BaseDatosSQL__Group__3 )
            // InternalMyDsl.g:4805:2: rule__BaseDatosSQL__Group__2__Impl rule__BaseDatosSQL__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosSQL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__2"


    // $ANTLR start "rule__BaseDatosSQL__Group__2__Impl"
    // InternalMyDsl.g:4812:1: rule__BaseDatosSQL__Group__2__Impl : ( ( rule__BaseDatosSQL__Group_2__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4816:1: ( ( ( rule__BaseDatosSQL__Group_2__0 )? ) )
            // InternalMyDsl.g:4817:1: ( ( rule__BaseDatosSQL__Group_2__0 )? )
            {
            // InternalMyDsl.g:4817:1: ( ( rule__BaseDatosSQL__Group_2__0 )? )
            // InternalMyDsl.g:4818:2: ( rule__BaseDatosSQL__Group_2__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_2()); 
            // InternalMyDsl.g:4819:2: ( rule__BaseDatosSQL__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4819:3: rule__BaseDatosSQL__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosSQL__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosSQLAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__2__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__3"
    // InternalMyDsl.g:4827:1: rule__BaseDatosSQL__Group__3 : rule__BaseDatosSQL__Group__3__Impl rule__BaseDatosSQL__Group__4 ;
    public final void rule__BaseDatosSQL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4831:1: ( rule__BaseDatosSQL__Group__3__Impl rule__BaseDatosSQL__Group__4 )
            // InternalMyDsl.g:4832:2: rule__BaseDatosSQL__Group__3__Impl rule__BaseDatosSQL__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosSQL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__3"


    // $ANTLR start "rule__BaseDatosSQL__Group__3__Impl"
    // InternalMyDsl.g:4839:1: rule__BaseDatosSQL__Group__3__Impl : ( ( rule__BaseDatosSQL__Group_3__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( ( ( rule__BaseDatosSQL__Group_3__0 )? ) )
            // InternalMyDsl.g:4844:1: ( ( rule__BaseDatosSQL__Group_3__0 )? )
            {
            // InternalMyDsl.g:4844:1: ( ( rule__BaseDatosSQL__Group_3__0 )? )
            // InternalMyDsl.g:4845:2: ( rule__BaseDatosSQL__Group_3__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_3()); 
            // InternalMyDsl.g:4846:2: ( rule__BaseDatosSQL__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4846:3: rule__BaseDatosSQL__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosSQL__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosSQLAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__3__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__4"
    // InternalMyDsl.g:4854:1: rule__BaseDatosSQL__Group__4 : rule__BaseDatosSQL__Group__4__Impl rule__BaseDatosSQL__Group__5 ;
    public final void rule__BaseDatosSQL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( rule__BaseDatosSQL__Group__4__Impl rule__BaseDatosSQL__Group__5 )
            // InternalMyDsl.g:4859:2: rule__BaseDatosSQL__Group__4__Impl rule__BaseDatosSQL__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosSQL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__4"


    // $ANTLR start "rule__BaseDatosSQL__Group__4__Impl"
    // InternalMyDsl.g:4866:1: rule__BaseDatosSQL__Group__4__Impl : ( ( rule__BaseDatosSQL__Group_4__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( ( ( rule__BaseDatosSQL__Group_4__0 )? ) )
            // InternalMyDsl.g:4871:1: ( ( rule__BaseDatosSQL__Group_4__0 )? )
            {
            // InternalMyDsl.g:4871:1: ( ( rule__BaseDatosSQL__Group_4__0 )? )
            // InternalMyDsl.g:4872:2: ( rule__BaseDatosSQL__Group_4__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_4()); 
            // InternalMyDsl.g:4873:2: ( rule__BaseDatosSQL__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==61) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:4873:3: rule__BaseDatosSQL__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosSQL__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosSQLAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__4__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__5"
    // InternalMyDsl.g:4881:1: rule__BaseDatosSQL__Group__5 : rule__BaseDatosSQL__Group__5__Impl rule__BaseDatosSQL__Group__6 ;
    public final void rule__BaseDatosSQL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4885:1: ( rule__BaseDatosSQL__Group__5__Impl rule__BaseDatosSQL__Group__6 )
            // InternalMyDsl.g:4886:2: rule__BaseDatosSQL__Group__5__Impl rule__BaseDatosSQL__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosSQL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__5"


    // $ANTLR start "rule__BaseDatosSQL__Group__5__Impl"
    // InternalMyDsl.g:4893:1: rule__BaseDatosSQL__Group__5__Impl : ( ( rule__BaseDatosSQL__Group_5__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4897:1: ( ( ( rule__BaseDatosSQL__Group_5__0 )? ) )
            // InternalMyDsl.g:4898:1: ( ( rule__BaseDatosSQL__Group_5__0 )? )
            {
            // InternalMyDsl.g:4898:1: ( ( rule__BaseDatosSQL__Group_5__0 )? )
            // InternalMyDsl.g:4899:2: ( rule__BaseDatosSQL__Group_5__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_5()); 
            // InternalMyDsl.g:4900:2: ( rule__BaseDatosSQL__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:4900:3: rule__BaseDatosSQL__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosSQL__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosSQLAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__5__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__6"
    // InternalMyDsl.g:4908:1: rule__BaseDatosSQL__Group__6 : rule__BaseDatosSQL__Group__6__Impl rule__BaseDatosSQL__Group__7 ;
    public final void rule__BaseDatosSQL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4912:1: ( rule__BaseDatosSQL__Group__6__Impl rule__BaseDatosSQL__Group__7 )
            // InternalMyDsl.g:4913:2: rule__BaseDatosSQL__Group__6__Impl rule__BaseDatosSQL__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosSQL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__6"


    // $ANTLR start "rule__BaseDatosSQL__Group__6__Impl"
    // InternalMyDsl.g:4920:1: rule__BaseDatosSQL__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__BaseDatosSQL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4924:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:4925:1: ( 'vpc' )
            {
            // InternalMyDsl.g:4925:1: ( 'vpc' )
            // InternalMyDsl.g:4926:2: 'vpc'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getVpcKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getVpcKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__6__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__7"
    // InternalMyDsl.g:4935:1: rule__BaseDatosSQL__Group__7 : rule__BaseDatosSQL__Group__7__Impl rule__BaseDatosSQL__Group__8 ;
    public final void rule__BaseDatosSQL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4939:1: ( rule__BaseDatosSQL__Group__7__Impl rule__BaseDatosSQL__Group__8 )
            // InternalMyDsl.g:4940:2: rule__BaseDatosSQL__Group__7__Impl rule__BaseDatosSQL__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__BaseDatosSQL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__7"


    // $ANTLR start "rule__BaseDatosSQL__Group__7__Impl"
    // InternalMyDsl.g:4947:1: rule__BaseDatosSQL__Group__7__Impl : ( ( rule__BaseDatosSQL__VpcAssignment_7 ) ) ;
    public final void rule__BaseDatosSQL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4951:1: ( ( ( rule__BaseDatosSQL__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:4952:1: ( ( rule__BaseDatosSQL__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:4952:1: ( ( rule__BaseDatosSQL__VpcAssignment_7 ) )
            // InternalMyDsl.g:4953:2: ( rule__BaseDatosSQL__VpcAssignment_7 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:4954:2: ( rule__BaseDatosSQL__VpcAssignment_7 )
            // InternalMyDsl.g:4954:3: rule__BaseDatosSQL__VpcAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__VpcAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosSQLAccess().getVpcAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__7__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group__8"
    // InternalMyDsl.g:4962:1: rule__BaseDatosSQL__Group__8 : rule__BaseDatosSQL__Group__8__Impl ;
    public final void rule__BaseDatosSQL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4966:1: ( rule__BaseDatosSQL__Group__8__Impl )
            // InternalMyDsl.g:4967:2: rule__BaseDatosSQL__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__8"


    // $ANTLR start "rule__BaseDatosSQL__Group__8__Impl"
    // InternalMyDsl.g:4973:1: rule__BaseDatosSQL__Group__8__Impl : ( '}' ) ;
    public final void rule__BaseDatosSQL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4977:1: ( ( '}' ) )
            // InternalMyDsl.g:4978:1: ( '}' )
            {
            // InternalMyDsl.g:4978:1: ( '}' )
            // InternalMyDsl.g:4979:2: '}'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group__8__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_2__0"
    // InternalMyDsl.g:4989:1: rule__BaseDatosSQL__Group_2__0 : rule__BaseDatosSQL__Group_2__0__Impl rule__BaseDatosSQL__Group_2__1 ;
    public final void rule__BaseDatosSQL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4993:1: ( rule__BaseDatosSQL__Group_2__0__Impl rule__BaseDatosSQL__Group_2__1 )
            // InternalMyDsl.g:4994:2: rule__BaseDatosSQL__Group_2__0__Impl rule__BaseDatosSQL__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosSQL__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_2__0"


    // $ANTLR start "rule__BaseDatosSQL__Group_2__0__Impl"
    // InternalMyDsl.g:5001:1: rule__BaseDatosSQL__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__BaseDatosSQL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5005:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:5006:1: ( 'nombre' )
            {
            // InternalMyDsl.g:5006:1: ( 'nombre' )
            // InternalMyDsl.g:5007:2: 'nombre'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_2__0__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_2__1"
    // InternalMyDsl.g:5016:1: rule__BaseDatosSQL__Group_2__1 : rule__BaseDatosSQL__Group_2__1__Impl ;
    public final void rule__BaseDatosSQL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5020:1: ( rule__BaseDatosSQL__Group_2__1__Impl )
            // InternalMyDsl.g:5021:2: rule__BaseDatosSQL__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_2__1"


    // $ANTLR start "rule__BaseDatosSQL__Group_2__1__Impl"
    // InternalMyDsl.g:5027:1: rule__BaseDatosSQL__Group_2__1__Impl : ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5031:1: ( ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:5032:1: ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5032:1: ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:5033:2: ( rule__BaseDatosSQL__NombreAssignment_2_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:5034:2: ( rule__BaseDatosSQL__NombreAssignment_2_1 )
            // InternalMyDsl.g:5034:3: rule__BaseDatosSQL__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosSQLAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_2__1__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_3__0"
    // InternalMyDsl.g:5043:1: rule__BaseDatosSQL__Group_3__0 : rule__BaseDatosSQL__Group_3__0__Impl rule__BaseDatosSQL__Group_3__1 ;
    public final void rule__BaseDatosSQL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5047:1: ( rule__BaseDatosSQL__Group_3__0__Impl rule__BaseDatosSQL__Group_3__1 )
            // InternalMyDsl.g:5048:2: rule__BaseDatosSQL__Group_3__0__Impl rule__BaseDatosSQL__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__BaseDatosSQL__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_3__0"


    // $ANTLR start "rule__BaseDatosSQL__Group_3__0__Impl"
    // InternalMyDsl.g:5055:1: rule__BaseDatosSQL__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__BaseDatosSQL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5059:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:5060:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:5060:1: ( 'tamanio' )
            // InternalMyDsl.g:5061:2: 'tamanio'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getTamanioKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getTamanioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_3__0__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_3__1"
    // InternalMyDsl.g:5070:1: rule__BaseDatosSQL__Group_3__1 : rule__BaseDatosSQL__Group_3__1__Impl ;
    public final void rule__BaseDatosSQL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5074:1: ( rule__BaseDatosSQL__Group_3__1__Impl )
            // InternalMyDsl.g:5075:2: rule__BaseDatosSQL__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_3__1"


    // $ANTLR start "rule__BaseDatosSQL__Group_3__1__Impl"
    // InternalMyDsl.g:5081:1: rule__BaseDatosSQL__Group_3__1__Impl : ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5085:1: ( ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:5086:1: ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5086:1: ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:5087:2: ( rule__BaseDatosSQL__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:5088:2: ( rule__BaseDatosSQL__TamanioAssignment_3_1 )
            // InternalMyDsl.g:5088:3: rule__BaseDatosSQL__TamanioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__TamanioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosSQLAccess().getTamanioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_3__1__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_4__0"
    // InternalMyDsl.g:5097:1: rule__BaseDatosSQL__Group_4__0 : rule__BaseDatosSQL__Group_4__0__Impl rule__BaseDatosSQL__Group_4__1 ;
    public final void rule__BaseDatosSQL__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5101:1: ( rule__BaseDatosSQL__Group_4__0__Impl rule__BaseDatosSQL__Group_4__1 )
            // InternalMyDsl.g:5102:2: rule__BaseDatosSQL__Group_4__0__Impl rule__BaseDatosSQL__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__BaseDatosSQL__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_4__0"


    // $ANTLR start "rule__BaseDatosSQL__Group_4__0__Impl"
    // InternalMyDsl.g:5109:1: rule__BaseDatosSQL__Group_4__0__Impl : ( 'manejador' ) ;
    public final void rule__BaseDatosSQL__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5113:1: ( ( 'manejador' ) )
            // InternalMyDsl.g:5114:1: ( 'manejador' )
            {
            // InternalMyDsl.g:5114:1: ( 'manejador' )
            // InternalMyDsl.g:5115:2: 'manejador'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getManejadorKeyword_4_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getManejadorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_4__0__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_4__1"
    // InternalMyDsl.g:5124:1: rule__BaseDatosSQL__Group_4__1 : rule__BaseDatosSQL__Group_4__1__Impl ;
    public final void rule__BaseDatosSQL__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5128:1: ( rule__BaseDatosSQL__Group_4__1__Impl )
            // InternalMyDsl.g:5129:2: rule__BaseDatosSQL__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_4__1"


    // $ANTLR start "rule__BaseDatosSQL__Group_4__1__Impl"
    // InternalMyDsl.g:5135:1: rule__BaseDatosSQL__Group_4__1__Impl : ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5139:1: ( ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) ) )
            // InternalMyDsl.g:5140:1: ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5140:1: ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) )
            // InternalMyDsl.g:5141:2: ( rule__BaseDatosSQL__ManejadorAssignment_4_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getManejadorAssignment_4_1()); 
            // InternalMyDsl.g:5142:2: ( rule__BaseDatosSQL__ManejadorAssignment_4_1 )
            // InternalMyDsl.g:5142:3: rule__BaseDatosSQL__ManejadorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__ManejadorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosSQLAccess().getManejadorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_4__1__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__0"
    // InternalMyDsl.g:5151:1: rule__BaseDatosSQL__Group_5__0 : rule__BaseDatosSQL__Group_5__0__Impl rule__BaseDatosSQL__Group_5__1 ;
    public final void rule__BaseDatosSQL__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5155:1: ( rule__BaseDatosSQL__Group_5__0__Impl rule__BaseDatosSQL__Group_5__1 )
            // InternalMyDsl.g:5156:2: rule__BaseDatosSQL__Group_5__0__Impl rule__BaseDatosSQL__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__BaseDatosSQL__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__0"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__0__Impl"
    // InternalMyDsl.g:5163:1: rule__BaseDatosSQL__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__BaseDatosSQL__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5167:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:5168:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:5168:1: ( 'conexiones' )
            // InternalMyDsl.g:5169:2: 'conexiones'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getConexionesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__0__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__1"
    // InternalMyDsl.g:5178:1: rule__BaseDatosSQL__Group_5__1 : rule__BaseDatosSQL__Group_5__1__Impl rule__BaseDatosSQL__Group_5__2 ;
    public final void rule__BaseDatosSQL__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5182:1: ( rule__BaseDatosSQL__Group_5__1__Impl rule__BaseDatosSQL__Group_5__2 )
            // InternalMyDsl.g:5183:2: rule__BaseDatosSQL__Group_5__1__Impl rule__BaseDatosSQL__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosSQL__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__1"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__1__Impl"
    // InternalMyDsl.g:5190:1: rule__BaseDatosSQL__Group_5__1__Impl : ( '(' ) ;
    public final void rule__BaseDatosSQL__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5194:1: ( ( '(' ) )
            // InternalMyDsl.g:5195:1: ( '(' )
            {
            // InternalMyDsl.g:5195:1: ( '(' )
            // InternalMyDsl.g:5196:2: '('
            {
             before(grammarAccess.getBaseDatosSQLAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__1__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__2"
    // InternalMyDsl.g:5205:1: rule__BaseDatosSQL__Group_5__2 : rule__BaseDatosSQL__Group_5__2__Impl rule__BaseDatosSQL__Group_5__3 ;
    public final void rule__BaseDatosSQL__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5209:1: ( rule__BaseDatosSQL__Group_5__2__Impl rule__BaseDatosSQL__Group_5__3 )
            // InternalMyDsl.g:5210:2: rule__BaseDatosSQL__Group_5__2__Impl rule__BaseDatosSQL__Group_5__3
            {
            pushFollow(FOLLOW_26);
            rule__BaseDatosSQL__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__2"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__2__Impl"
    // InternalMyDsl.g:5217:1: rule__BaseDatosSQL__Group_5__2__Impl : ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) ) ;
    public final void rule__BaseDatosSQL__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5221:1: ( ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:5222:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:5222:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:5223:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:5224:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:5224:3: rule__BaseDatosSQL__ConexionesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__ConexionesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosSQLAccess().getConexionesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__2__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__3"
    // InternalMyDsl.g:5232:1: rule__BaseDatosSQL__Group_5__3 : rule__BaseDatosSQL__Group_5__3__Impl rule__BaseDatosSQL__Group_5__4 ;
    public final void rule__BaseDatosSQL__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5236:1: ( rule__BaseDatosSQL__Group_5__3__Impl rule__BaseDatosSQL__Group_5__4 )
            // InternalMyDsl.g:5237:2: rule__BaseDatosSQL__Group_5__3__Impl rule__BaseDatosSQL__Group_5__4
            {
            pushFollow(FOLLOW_26);
            rule__BaseDatosSQL__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__3"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__3__Impl"
    // InternalMyDsl.g:5244:1: rule__BaseDatosSQL__Group_5__3__Impl : ( ( rule__BaseDatosSQL__Group_5_3__0 )* ) ;
    public final void rule__BaseDatosSQL__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5248:1: ( ( ( rule__BaseDatosSQL__Group_5_3__0 )* ) )
            // InternalMyDsl.g:5249:1: ( ( rule__BaseDatosSQL__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:5249:1: ( ( rule__BaseDatosSQL__Group_5_3__0 )* )
            // InternalMyDsl.g:5250:2: ( rule__BaseDatosSQL__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_5_3()); 
            // InternalMyDsl.g:5251:2: ( rule__BaseDatosSQL__Group_5_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==38) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:5251:3: rule__BaseDatosSQL__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BaseDatosSQL__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getBaseDatosSQLAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__3__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__4"
    // InternalMyDsl.g:5259:1: rule__BaseDatosSQL__Group_5__4 : rule__BaseDatosSQL__Group_5__4__Impl ;
    public final void rule__BaseDatosSQL__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5263:1: ( rule__BaseDatosSQL__Group_5__4__Impl )
            // InternalMyDsl.g:5264:2: rule__BaseDatosSQL__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__4"


    // $ANTLR start "rule__BaseDatosSQL__Group_5__4__Impl"
    // InternalMyDsl.g:5270:1: rule__BaseDatosSQL__Group_5__4__Impl : ( ')' ) ;
    public final void rule__BaseDatosSQL__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5274:1: ( ( ')' ) )
            // InternalMyDsl.g:5275:1: ( ')' )
            {
            // InternalMyDsl.g:5275:1: ( ')' )
            // InternalMyDsl.g:5276:2: ')'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getRightParenthesisKeyword_5_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5__4__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_5_3__0"
    // InternalMyDsl.g:5286:1: rule__BaseDatosSQL__Group_5_3__0 : rule__BaseDatosSQL__Group_5_3__0__Impl rule__BaseDatosSQL__Group_5_3__1 ;
    public final void rule__BaseDatosSQL__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5290:1: ( rule__BaseDatosSQL__Group_5_3__0__Impl rule__BaseDatosSQL__Group_5_3__1 )
            // InternalMyDsl.g:5291:2: rule__BaseDatosSQL__Group_5_3__0__Impl rule__BaseDatosSQL__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosSQL__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5_3__0"


    // $ANTLR start "rule__BaseDatosSQL__Group_5_3__0__Impl"
    // InternalMyDsl.g:5298:1: rule__BaseDatosSQL__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseDatosSQL__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5302:1: ( ( ',' ) )
            // InternalMyDsl.g:5303:1: ( ',' )
            {
            // InternalMyDsl.g:5303:1: ( ',' )
            // InternalMyDsl.g:5304:2: ','
            {
             before(grammarAccess.getBaseDatosSQLAccess().getCommaKeyword_5_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBaseDatosSQLAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5_3__0__Impl"


    // $ANTLR start "rule__BaseDatosSQL__Group_5_3__1"
    // InternalMyDsl.g:5313:1: rule__BaseDatosSQL__Group_5_3__1 : rule__BaseDatosSQL__Group_5_3__1__Impl ;
    public final void rule__BaseDatosSQL__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5317:1: ( rule__BaseDatosSQL__Group_5_3__1__Impl )
            // InternalMyDsl.g:5318:2: rule__BaseDatosSQL__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5_3__1"


    // $ANTLR start "rule__BaseDatosSQL__Group_5_3__1__Impl"
    // InternalMyDsl.g:5324:1: rule__BaseDatosSQL__Group_5_3__1__Impl : ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5328:1: ( ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:5329:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:5329:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:5330:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:5331:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:5331:3: rule__BaseDatosSQL__ConexionesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosSQL__ConexionesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosSQLAccess().getConexionesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__Group_5_3__1__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__0"
    // InternalMyDsl.g:5340:1: rule__BaseDatosNoSQL__Group__0 : rule__BaseDatosNoSQL__Group__0__Impl rule__BaseDatosNoSQL__Group__1 ;
    public final void rule__BaseDatosNoSQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5344:1: ( rule__BaseDatosNoSQL__Group__0__Impl rule__BaseDatosNoSQL__Group__1 )
            // InternalMyDsl.g:5345:2: rule__BaseDatosNoSQL__Group__0__Impl rule__BaseDatosNoSQL__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BaseDatosNoSQL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__0"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__0__Impl"
    // InternalMyDsl.g:5352:1: rule__BaseDatosNoSQL__Group__0__Impl : ( 'BaseDatosNoSQL' ) ;
    public final void rule__BaseDatosNoSQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5356:1: ( ( 'BaseDatosNoSQL' ) )
            // InternalMyDsl.g:5357:1: ( 'BaseDatosNoSQL' )
            {
            // InternalMyDsl.g:5357:1: ( 'BaseDatosNoSQL' )
            // InternalMyDsl.g:5358:2: 'BaseDatosNoSQL'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getBaseDatosNoSQLKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getBaseDatosNoSQLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__0__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__1"
    // InternalMyDsl.g:5367:1: rule__BaseDatosNoSQL__Group__1 : rule__BaseDatosNoSQL__Group__1__Impl rule__BaseDatosNoSQL__Group__2 ;
    public final void rule__BaseDatosNoSQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5371:1: ( rule__BaseDatosNoSQL__Group__1__Impl rule__BaseDatosNoSQL__Group__2 )
            // InternalMyDsl.g:5372:2: rule__BaseDatosNoSQL__Group__1__Impl rule__BaseDatosNoSQL__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosNoSQL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__1"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__1__Impl"
    // InternalMyDsl.g:5379:1: rule__BaseDatosNoSQL__Group__1__Impl : ( '{' ) ;
    public final void rule__BaseDatosNoSQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5383:1: ( ( '{' ) )
            // InternalMyDsl.g:5384:1: ( '{' )
            {
            // InternalMyDsl.g:5384:1: ( '{' )
            // InternalMyDsl.g:5385:2: '{'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__1__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__2"
    // InternalMyDsl.g:5394:1: rule__BaseDatosNoSQL__Group__2 : rule__BaseDatosNoSQL__Group__2__Impl rule__BaseDatosNoSQL__Group__3 ;
    public final void rule__BaseDatosNoSQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5398:1: ( rule__BaseDatosNoSQL__Group__2__Impl rule__BaseDatosNoSQL__Group__3 )
            // InternalMyDsl.g:5399:2: rule__BaseDatosNoSQL__Group__2__Impl rule__BaseDatosNoSQL__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosNoSQL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__2"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__2__Impl"
    // InternalMyDsl.g:5406:1: rule__BaseDatosNoSQL__Group__2__Impl : ( ( rule__BaseDatosNoSQL__Group_2__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5410:1: ( ( ( rule__BaseDatosNoSQL__Group_2__0 )? ) )
            // InternalMyDsl.g:5411:1: ( ( rule__BaseDatosNoSQL__Group_2__0 )? )
            {
            // InternalMyDsl.g:5411:1: ( ( rule__BaseDatosNoSQL__Group_2__0 )? )
            // InternalMyDsl.g:5412:2: ( rule__BaseDatosNoSQL__Group_2__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_2()); 
            // InternalMyDsl.g:5413:2: ( rule__BaseDatosNoSQL__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:5413:3: rule__BaseDatosNoSQL__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosNoSQL__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__2__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__3"
    // InternalMyDsl.g:5421:1: rule__BaseDatosNoSQL__Group__3 : rule__BaseDatosNoSQL__Group__3__Impl rule__BaseDatosNoSQL__Group__4 ;
    public final void rule__BaseDatosNoSQL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5425:1: ( rule__BaseDatosNoSQL__Group__3__Impl rule__BaseDatosNoSQL__Group__4 )
            // InternalMyDsl.g:5426:2: rule__BaseDatosNoSQL__Group__3__Impl rule__BaseDatosNoSQL__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosNoSQL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__3"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__3__Impl"
    // InternalMyDsl.g:5433:1: rule__BaseDatosNoSQL__Group__3__Impl : ( ( rule__BaseDatosNoSQL__Group_3__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5437:1: ( ( ( rule__BaseDatosNoSQL__Group_3__0 )? ) )
            // InternalMyDsl.g:5438:1: ( ( rule__BaseDatosNoSQL__Group_3__0 )? )
            {
            // InternalMyDsl.g:5438:1: ( ( rule__BaseDatosNoSQL__Group_3__0 )? )
            // InternalMyDsl.g:5439:2: ( rule__BaseDatosNoSQL__Group_3__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_3()); 
            // InternalMyDsl.g:5440:2: ( rule__BaseDatosNoSQL__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:5440:3: rule__BaseDatosNoSQL__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosNoSQL__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__3__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__4"
    // InternalMyDsl.g:5448:1: rule__BaseDatosNoSQL__Group__4 : rule__BaseDatosNoSQL__Group__4__Impl rule__BaseDatosNoSQL__Group__5 ;
    public final void rule__BaseDatosNoSQL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5452:1: ( rule__BaseDatosNoSQL__Group__4__Impl rule__BaseDatosNoSQL__Group__5 )
            // InternalMyDsl.g:5453:2: rule__BaseDatosNoSQL__Group__4__Impl rule__BaseDatosNoSQL__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosNoSQL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__4"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__4__Impl"
    // InternalMyDsl.g:5460:1: rule__BaseDatosNoSQL__Group__4__Impl : ( ( rule__BaseDatosNoSQL__Group_4__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5464:1: ( ( ( rule__BaseDatosNoSQL__Group_4__0 )? ) )
            // InternalMyDsl.g:5465:1: ( ( rule__BaseDatosNoSQL__Group_4__0 )? )
            {
            // InternalMyDsl.g:5465:1: ( ( rule__BaseDatosNoSQL__Group_4__0 )? )
            // InternalMyDsl.g:5466:2: ( rule__BaseDatosNoSQL__Group_4__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_4()); 
            // InternalMyDsl.g:5467:2: ( rule__BaseDatosNoSQL__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:5467:3: rule__BaseDatosNoSQL__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosNoSQL__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__4__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__5"
    // InternalMyDsl.g:5475:1: rule__BaseDatosNoSQL__Group__5 : rule__BaseDatosNoSQL__Group__5__Impl rule__BaseDatosNoSQL__Group__6 ;
    public final void rule__BaseDatosNoSQL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5479:1: ( rule__BaseDatosNoSQL__Group__5__Impl rule__BaseDatosNoSQL__Group__6 )
            // InternalMyDsl.g:5480:2: rule__BaseDatosNoSQL__Group__5__Impl rule__BaseDatosNoSQL__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__BaseDatosNoSQL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__5"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__5__Impl"
    // InternalMyDsl.g:5487:1: rule__BaseDatosNoSQL__Group__5__Impl : ( ( rule__BaseDatosNoSQL__Group_5__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5491:1: ( ( ( rule__BaseDatosNoSQL__Group_5__0 )? ) )
            // InternalMyDsl.g:5492:1: ( ( rule__BaseDatosNoSQL__Group_5__0 )? )
            {
            // InternalMyDsl.g:5492:1: ( ( rule__BaseDatosNoSQL__Group_5__0 )? )
            // InternalMyDsl.g:5493:2: ( rule__BaseDatosNoSQL__Group_5__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_5()); 
            // InternalMyDsl.g:5494:2: ( rule__BaseDatosNoSQL__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:5494:3: rule__BaseDatosNoSQL__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseDatosNoSQL__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__5__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__6"
    // InternalMyDsl.g:5502:1: rule__BaseDatosNoSQL__Group__6 : rule__BaseDatosNoSQL__Group__6__Impl rule__BaseDatosNoSQL__Group__7 ;
    public final void rule__BaseDatosNoSQL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5506:1: ( rule__BaseDatosNoSQL__Group__6__Impl rule__BaseDatosNoSQL__Group__7 )
            // InternalMyDsl.g:5507:2: rule__BaseDatosNoSQL__Group__6__Impl rule__BaseDatosNoSQL__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosNoSQL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__6"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__6__Impl"
    // InternalMyDsl.g:5514:1: rule__BaseDatosNoSQL__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__BaseDatosNoSQL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5518:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:5519:1: ( 'vpc' )
            {
            // InternalMyDsl.g:5519:1: ( 'vpc' )
            // InternalMyDsl.g:5520:2: 'vpc'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getVpcKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getVpcKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__6__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__7"
    // InternalMyDsl.g:5529:1: rule__BaseDatosNoSQL__Group__7 : rule__BaseDatosNoSQL__Group__7__Impl rule__BaseDatosNoSQL__Group__8 ;
    public final void rule__BaseDatosNoSQL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5533:1: ( rule__BaseDatosNoSQL__Group__7__Impl rule__BaseDatosNoSQL__Group__8 )
            // InternalMyDsl.g:5534:2: rule__BaseDatosNoSQL__Group__7__Impl rule__BaseDatosNoSQL__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__BaseDatosNoSQL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__7"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__7__Impl"
    // InternalMyDsl.g:5541:1: rule__BaseDatosNoSQL__Group__7__Impl : ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) ) ;
    public final void rule__BaseDatosNoSQL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5545:1: ( ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:5546:1: ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:5546:1: ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) )
            // InternalMyDsl.g:5547:2: ( rule__BaseDatosNoSQL__VpcAssignment_7 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:5548:2: ( rule__BaseDatosNoSQL__VpcAssignment_7 )
            // InternalMyDsl.g:5548:3: rule__BaseDatosNoSQL__VpcAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__VpcAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getVpcAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__7__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__8"
    // InternalMyDsl.g:5556:1: rule__BaseDatosNoSQL__Group__8 : rule__BaseDatosNoSQL__Group__8__Impl ;
    public final void rule__BaseDatosNoSQL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5560:1: ( rule__BaseDatosNoSQL__Group__8__Impl )
            // InternalMyDsl.g:5561:2: rule__BaseDatosNoSQL__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__8"


    // $ANTLR start "rule__BaseDatosNoSQL__Group__8__Impl"
    // InternalMyDsl.g:5567:1: rule__BaseDatosNoSQL__Group__8__Impl : ( '}' ) ;
    public final void rule__BaseDatosNoSQL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5571:1: ( ( '}' ) )
            // InternalMyDsl.g:5572:1: ( '}' )
            {
            // InternalMyDsl.g:5572:1: ( '}' )
            // InternalMyDsl.g:5573:2: '}'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group__8__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_2__0"
    // InternalMyDsl.g:5583:1: rule__BaseDatosNoSQL__Group_2__0 : rule__BaseDatosNoSQL__Group_2__0__Impl rule__BaseDatosNoSQL__Group_2__1 ;
    public final void rule__BaseDatosNoSQL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5587:1: ( rule__BaseDatosNoSQL__Group_2__0__Impl rule__BaseDatosNoSQL__Group_2__1 )
            // InternalMyDsl.g:5588:2: rule__BaseDatosNoSQL__Group_2__0__Impl rule__BaseDatosNoSQL__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosNoSQL__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_2__0"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_2__0__Impl"
    // InternalMyDsl.g:5595:1: rule__BaseDatosNoSQL__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__BaseDatosNoSQL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5599:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:5600:1: ( 'nombre' )
            {
            // InternalMyDsl.g:5600:1: ( 'nombre' )
            // InternalMyDsl.g:5601:2: 'nombre'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_2__0__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_2__1"
    // InternalMyDsl.g:5610:1: rule__BaseDatosNoSQL__Group_2__1 : rule__BaseDatosNoSQL__Group_2__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5614:1: ( rule__BaseDatosNoSQL__Group_2__1__Impl )
            // InternalMyDsl.g:5615:2: rule__BaseDatosNoSQL__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_2__1"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_2__1__Impl"
    // InternalMyDsl.g:5621:1: rule__BaseDatosNoSQL__Group_2__1__Impl : ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5625:1: ( ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:5626:1: ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5626:1: ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:5627:2: ( rule__BaseDatosNoSQL__NombreAssignment_2_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:5628:2: ( rule__BaseDatosNoSQL__NombreAssignment_2_1 )
            // InternalMyDsl.g:5628:3: rule__BaseDatosNoSQL__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_2__1__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_3__0"
    // InternalMyDsl.g:5637:1: rule__BaseDatosNoSQL__Group_3__0 : rule__BaseDatosNoSQL__Group_3__0__Impl rule__BaseDatosNoSQL__Group_3__1 ;
    public final void rule__BaseDatosNoSQL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5641:1: ( rule__BaseDatosNoSQL__Group_3__0__Impl rule__BaseDatosNoSQL__Group_3__1 )
            // InternalMyDsl.g:5642:2: rule__BaseDatosNoSQL__Group_3__0__Impl rule__BaseDatosNoSQL__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__BaseDatosNoSQL__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_3__0"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_3__0__Impl"
    // InternalMyDsl.g:5649:1: rule__BaseDatosNoSQL__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__BaseDatosNoSQL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5653:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:5654:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:5654:1: ( 'tamanio' )
            // InternalMyDsl.g:5655:2: 'tamanio'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getTamanioKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getTamanioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_3__0__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_3__1"
    // InternalMyDsl.g:5664:1: rule__BaseDatosNoSQL__Group_3__1 : rule__BaseDatosNoSQL__Group_3__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5668:1: ( rule__BaseDatosNoSQL__Group_3__1__Impl )
            // InternalMyDsl.g:5669:2: rule__BaseDatosNoSQL__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_3__1"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_3__1__Impl"
    // InternalMyDsl.g:5675:1: rule__BaseDatosNoSQL__Group_3__1__Impl : ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5679:1: ( ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:5680:1: ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5680:1: ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:5681:2: ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:5682:2: ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 )
            // InternalMyDsl.g:5682:3: rule__BaseDatosNoSQL__TamanioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__TamanioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getTamanioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_3__1__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_4__0"
    // InternalMyDsl.g:5691:1: rule__BaseDatosNoSQL__Group_4__0 : rule__BaseDatosNoSQL__Group_4__0__Impl rule__BaseDatosNoSQL__Group_4__1 ;
    public final void rule__BaseDatosNoSQL__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5695:1: ( rule__BaseDatosNoSQL__Group_4__0__Impl rule__BaseDatosNoSQL__Group_4__1 )
            // InternalMyDsl.g:5696:2: rule__BaseDatosNoSQL__Group_4__0__Impl rule__BaseDatosNoSQL__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__BaseDatosNoSQL__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_4__0"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_4__0__Impl"
    // InternalMyDsl.g:5703:1: rule__BaseDatosNoSQL__Group_4__0__Impl : ( 'manejador' ) ;
    public final void rule__BaseDatosNoSQL__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5707:1: ( ( 'manejador' ) )
            // InternalMyDsl.g:5708:1: ( 'manejador' )
            {
            // InternalMyDsl.g:5708:1: ( 'manejador' )
            // InternalMyDsl.g:5709:2: 'manejador'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getManejadorKeyword_4_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getManejadorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_4__0__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_4__1"
    // InternalMyDsl.g:5718:1: rule__BaseDatosNoSQL__Group_4__1 : rule__BaseDatosNoSQL__Group_4__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5722:1: ( rule__BaseDatosNoSQL__Group_4__1__Impl )
            // InternalMyDsl.g:5723:2: rule__BaseDatosNoSQL__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_4__1"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_4__1__Impl"
    // InternalMyDsl.g:5729:1: rule__BaseDatosNoSQL__Group_4__1__Impl : ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5733:1: ( ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) ) )
            // InternalMyDsl.g:5734:1: ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5734:1: ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) )
            // InternalMyDsl.g:5735:2: ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getManejadorAssignment_4_1()); 
            // InternalMyDsl.g:5736:2: ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 )
            // InternalMyDsl.g:5736:3: rule__BaseDatosNoSQL__ManejadorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__ManejadorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getManejadorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_4__1__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__0"
    // InternalMyDsl.g:5745:1: rule__BaseDatosNoSQL__Group_5__0 : rule__BaseDatosNoSQL__Group_5__0__Impl rule__BaseDatosNoSQL__Group_5__1 ;
    public final void rule__BaseDatosNoSQL__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5749:1: ( rule__BaseDatosNoSQL__Group_5__0__Impl rule__BaseDatosNoSQL__Group_5__1 )
            // InternalMyDsl.g:5750:2: rule__BaseDatosNoSQL__Group_5__0__Impl rule__BaseDatosNoSQL__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__BaseDatosNoSQL__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__0"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__0__Impl"
    // InternalMyDsl.g:5757:1: rule__BaseDatosNoSQL__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__BaseDatosNoSQL__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:5762:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:5762:1: ( 'conexiones' )
            // InternalMyDsl.g:5763:2: 'conexiones'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getConexionesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__0__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__1"
    // InternalMyDsl.g:5772:1: rule__BaseDatosNoSQL__Group_5__1 : rule__BaseDatosNoSQL__Group_5__1__Impl rule__BaseDatosNoSQL__Group_5__2 ;
    public final void rule__BaseDatosNoSQL__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5776:1: ( rule__BaseDatosNoSQL__Group_5__1__Impl rule__BaseDatosNoSQL__Group_5__2 )
            // InternalMyDsl.g:5777:2: rule__BaseDatosNoSQL__Group_5__1__Impl rule__BaseDatosNoSQL__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosNoSQL__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__1"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__1__Impl"
    // InternalMyDsl.g:5784:1: rule__BaseDatosNoSQL__Group_5__1__Impl : ( '(' ) ;
    public final void rule__BaseDatosNoSQL__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5788:1: ( ( '(' ) )
            // InternalMyDsl.g:5789:1: ( '(' )
            {
            // InternalMyDsl.g:5789:1: ( '(' )
            // InternalMyDsl.g:5790:2: '('
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__1__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__2"
    // InternalMyDsl.g:5799:1: rule__BaseDatosNoSQL__Group_5__2 : rule__BaseDatosNoSQL__Group_5__2__Impl rule__BaseDatosNoSQL__Group_5__3 ;
    public final void rule__BaseDatosNoSQL__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5803:1: ( rule__BaseDatosNoSQL__Group_5__2__Impl rule__BaseDatosNoSQL__Group_5__3 )
            // InternalMyDsl.g:5804:2: rule__BaseDatosNoSQL__Group_5__2__Impl rule__BaseDatosNoSQL__Group_5__3
            {
            pushFollow(FOLLOW_26);
            rule__BaseDatosNoSQL__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__2"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__2__Impl"
    // InternalMyDsl.g:5811:1: rule__BaseDatosNoSQL__Group_5__2__Impl : ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5815:1: ( ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:5816:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:5816:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:5817:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:5818:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:5818:3: rule__BaseDatosNoSQL__ConexionesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__ConexionesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getConexionesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__2__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__3"
    // InternalMyDsl.g:5826:1: rule__BaseDatosNoSQL__Group_5__3 : rule__BaseDatosNoSQL__Group_5__3__Impl rule__BaseDatosNoSQL__Group_5__4 ;
    public final void rule__BaseDatosNoSQL__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5830:1: ( rule__BaseDatosNoSQL__Group_5__3__Impl rule__BaseDatosNoSQL__Group_5__4 )
            // InternalMyDsl.g:5831:2: rule__BaseDatosNoSQL__Group_5__3__Impl rule__BaseDatosNoSQL__Group_5__4
            {
            pushFollow(FOLLOW_26);
            rule__BaseDatosNoSQL__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__3"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__3__Impl"
    // InternalMyDsl.g:5838:1: rule__BaseDatosNoSQL__Group_5__3__Impl : ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* ) ;
    public final void rule__BaseDatosNoSQL__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5842:1: ( ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* ) )
            // InternalMyDsl.g:5843:1: ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:5843:1: ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* )
            // InternalMyDsl.g:5844:2: ( rule__BaseDatosNoSQL__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_5_3()); 
            // InternalMyDsl.g:5845:2: ( rule__BaseDatosNoSQL__Group_5_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==38) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:5845:3: rule__BaseDatosNoSQL__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BaseDatosNoSQL__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getBaseDatosNoSQLAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__3__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__4"
    // InternalMyDsl.g:5853:1: rule__BaseDatosNoSQL__Group_5__4 : rule__BaseDatosNoSQL__Group_5__4__Impl ;
    public final void rule__BaseDatosNoSQL__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5857:1: ( rule__BaseDatosNoSQL__Group_5__4__Impl )
            // InternalMyDsl.g:5858:2: rule__BaseDatosNoSQL__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__4"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5__4__Impl"
    // InternalMyDsl.g:5864:1: rule__BaseDatosNoSQL__Group_5__4__Impl : ( ')' ) ;
    public final void rule__BaseDatosNoSQL__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5868:1: ( ( ')' ) )
            // InternalMyDsl.g:5869:1: ( ')' )
            {
            // InternalMyDsl.g:5869:1: ( ')' )
            // InternalMyDsl.g:5870:2: ')'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getRightParenthesisKeyword_5_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5__4__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5_3__0"
    // InternalMyDsl.g:5880:1: rule__BaseDatosNoSQL__Group_5_3__0 : rule__BaseDatosNoSQL__Group_5_3__0__Impl rule__BaseDatosNoSQL__Group_5_3__1 ;
    public final void rule__BaseDatosNoSQL__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5884:1: ( rule__BaseDatosNoSQL__Group_5_3__0__Impl rule__BaseDatosNoSQL__Group_5_3__1 )
            // InternalMyDsl.g:5885:2: rule__BaseDatosNoSQL__Group_5_3__0__Impl rule__BaseDatosNoSQL__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BaseDatosNoSQL__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5_3__0"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5_3__0__Impl"
    // InternalMyDsl.g:5892:1: rule__BaseDatosNoSQL__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseDatosNoSQL__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5896:1: ( ( ',' ) )
            // InternalMyDsl.g:5897:1: ( ',' )
            {
            // InternalMyDsl.g:5897:1: ( ',' )
            // InternalMyDsl.g:5898:2: ','
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getCommaKeyword_5_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBaseDatosNoSQLAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5_3__0__Impl"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5_3__1"
    // InternalMyDsl.g:5907:1: rule__BaseDatosNoSQL__Group_5_3__1 : rule__BaseDatosNoSQL__Group_5_3__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5911:1: ( rule__BaseDatosNoSQL__Group_5_3__1__Impl )
            // InternalMyDsl.g:5912:2: rule__BaseDatosNoSQL__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5_3__1"


    // $ANTLR start "rule__BaseDatosNoSQL__Group_5_3__1__Impl"
    // InternalMyDsl.g:5918:1: rule__BaseDatosNoSQL__Group_5_3__1__Impl : ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5922:1: ( ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:5923:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:5923:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:5924:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:5925:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:5925:3: rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getConexionesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__Group_5_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:5934:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5938:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:5939:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:5946:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5950:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:5951:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:5951:1: ( ( '-' )? )
            // InternalMyDsl.g:5952:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:5953:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==63) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:5953:3: '-'
                    {
                    match(input,63,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:5961:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5965:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:5966:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:5972:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5976:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5977:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5977:1: ( RULE_INT )
            // InternalMyDsl.g:5978:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group__0"
    // InternalMyDsl.g:5988:1: rule__InternetGateway__Group__0 : rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 ;
    public final void rule__InternetGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5992:1: ( rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 )
            // InternalMyDsl.g:5993:2: rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InternetGateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__0"


    // $ANTLR start "rule__InternetGateway__Group__0__Impl"
    // InternalMyDsl.g:6000:1: rule__InternetGateway__Group__0__Impl : ( 'InternetGateway' ) ;
    public final void rule__InternetGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6004:1: ( ( 'InternetGateway' ) )
            // InternalMyDsl.g:6005:1: ( 'InternetGateway' )
            {
            // InternalMyDsl.g:6005:1: ( 'InternetGateway' )
            // InternalMyDsl.g:6006:2: 'InternetGateway'
            {
             before(grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group__1"
    // InternalMyDsl.g:6015:1: rule__InternetGateway__Group__1 : rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 ;
    public final void rule__InternetGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6019:1: ( rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 )
            // InternalMyDsl.g:6020:2: rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__InternetGateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__1"


    // $ANTLR start "rule__InternetGateway__Group__1__Impl"
    // InternalMyDsl.g:6027:1: rule__InternetGateway__Group__1__Impl : ( '{' ) ;
    public final void rule__InternetGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6031:1: ( ( '{' ) )
            // InternalMyDsl.g:6032:1: ( '{' )
            {
            // InternalMyDsl.g:6032:1: ( '{' )
            // InternalMyDsl.g:6033:2: '{'
            {
             before(grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group__2"
    // InternalMyDsl.g:6042:1: rule__InternetGateway__Group__2 : rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 ;
    public final void rule__InternetGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6046:1: ( rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 )
            // InternalMyDsl.g:6047:2: rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__InternetGateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__2"


    // $ANTLR start "rule__InternetGateway__Group__2__Impl"
    // InternalMyDsl.g:6054:1: rule__InternetGateway__Group__2__Impl : ( ( rule__InternetGateway__Group_2__0 )? ) ;
    public final void rule__InternetGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6058:1: ( ( ( rule__InternetGateway__Group_2__0 )? ) )
            // InternalMyDsl.g:6059:1: ( ( rule__InternetGateway__Group_2__0 )? )
            {
            // InternalMyDsl.g:6059:1: ( ( rule__InternetGateway__Group_2__0 )? )
            // InternalMyDsl.g:6060:2: ( rule__InternetGateway__Group_2__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_2()); 
            // InternalMyDsl.g:6061:2: ( rule__InternetGateway__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:6061:3: rule__InternetGateway__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__2__Impl"


    // $ANTLR start "rule__InternetGateway__Group__3"
    // InternalMyDsl.g:6069:1: rule__InternetGateway__Group__3 : rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 ;
    public final void rule__InternetGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6073:1: ( rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 )
            // InternalMyDsl.g:6074:2: rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__InternetGateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__3"


    // $ANTLR start "rule__InternetGateway__Group__3__Impl"
    // InternalMyDsl.g:6081:1: rule__InternetGateway__Group__3__Impl : ( 'vpc' ) ;
    public final void rule__InternetGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6085:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:6086:1: ( 'vpc' )
            {
            // InternalMyDsl.g:6086:1: ( 'vpc' )
            // InternalMyDsl.g:6087:2: 'vpc'
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getVpcKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__3__Impl"


    // $ANTLR start "rule__InternetGateway__Group__4"
    // InternalMyDsl.g:6096:1: rule__InternetGateway__Group__4 : rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 ;
    public final void rule__InternetGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6100:1: ( rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 )
            // InternalMyDsl.g:6101:2: rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__InternetGateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__4"


    // $ANTLR start "rule__InternetGateway__Group__4__Impl"
    // InternalMyDsl.g:6108:1: rule__InternetGateway__Group__4__Impl : ( ( rule__InternetGateway__VpcAssignment_4 ) ) ;
    public final void rule__InternetGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6112:1: ( ( ( rule__InternetGateway__VpcAssignment_4 ) ) )
            // InternalMyDsl.g:6113:1: ( ( rule__InternetGateway__VpcAssignment_4 ) )
            {
            // InternalMyDsl.g:6113:1: ( ( rule__InternetGateway__VpcAssignment_4 ) )
            // InternalMyDsl.g:6114:2: ( rule__InternetGateway__VpcAssignment_4 )
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcAssignment_4()); 
            // InternalMyDsl.g:6115:2: ( rule__InternetGateway__VpcAssignment_4 )
            // InternalMyDsl.g:6115:3: rule__InternetGateway__VpcAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__VpcAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getVpcAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__4__Impl"


    // $ANTLR start "rule__InternetGateway__Group__5"
    // InternalMyDsl.g:6123:1: rule__InternetGateway__Group__5 : rule__InternetGateway__Group__5__Impl ;
    public final void rule__InternetGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6127:1: ( rule__InternetGateway__Group__5__Impl )
            // InternalMyDsl.g:6128:2: rule__InternetGateway__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__5"


    // $ANTLR start "rule__InternetGateway__Group__5__Impl"
    // InternalMyDsl.g:6134:1: rule__InternetGateway__Group__5__Impl : ( '}' ) ;
    public final void rule__InternetGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6138:1: ( ( '}' ) )
            // InternalMyDsl.g:6139:1: ( '}' )
            {
            // InternalMyDsl.g:6139:1: ( '}' )
            // InternalMyDsl.g:6140:2: '}'
            {
             before(grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__5__Impl"


    // $ANTLR start "rule__InternetGateway__Group_2__0"
    // InternalMyDsl.g:6150:1: rule__InternetGateway__Group_2__0 : rule__InternetGateway__Group_2__0__Impl rule__InternetGateway__Group_2__1 ;
    public final void rule__InternetGateway__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6154:1: ( rule__InternetGateway__Group_2__0__Impl rule__InternetGateway__Group_2__1 )
            // InternalMyDsl.g:6155:2: rule__InternetGateway__Group_2__0__Impl rule__InternetGateway__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__InternetGateway__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_2__0"


    // $ANTLR start "rule__InternetGateway__Group_2__0__Impl"
    // InternalMyDsl.g:6162:1: rule__InternetGateway__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__InternetGateway__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6166:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:6167:1: ( 'nombre' )
            {
            // InternalMyDsl.g:6167:1: ( 'nombre' )
            // InternalMyDsl.g:6168:2: 'nombre'
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_2__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_2__1"
    // InternalMyDsl.g:6177:1: rule__InternetGateway__Group_2__1 : rule__InternetGateway__Group_2__1__Impl ;
    public final void rule__InternetGateway__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6181:1: ( rule__InternetGateway__Group_2__1__Impl )
            // InternalMyDsl.g:6182:2: rule__InternetGateway__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_2__1"


    // $ANTLR start "rule__InternetGateway__Group_2__1__Impl"
    // InternalMyDsl.g:6188:1: rule__InternetGateway__Group_2__1__Impl : ( ( rule__InternetGateway__NombreAssignment_2_1 ) ) ;
    public final void rule__InternetGateway__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6192:1: ( ( ( rule__InternetGateway__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:6193:1: ( ( rule__InternetGateway__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:6193:1: ( ( rule__InternetGateway__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:6194:2: ( rule__InternetGateway__NombreAssignment_2_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:6195:2: ( rule__InternetGateway__NombreAssignment_2_1 )
            // InternalMyDsl.g:6195:3: rule__InternetGateway__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_2__1__Impl"


    // $ANTLR start "rule__Subred__Group__0"
    // InternalMyDsl.g:6204:1: rule__Subred__Group__0 : rule__Subred__Group__0__Impl rule__Subred__Group__1 ;
    public final void rule__Subred__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6208:1: ( rule__Subred__Group__0__Impl rule__Subred__Group__1 )
            // InternalMyDsl.g:6209:2: rule__Subred__Group__0__Impl rule__Subred__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Subred__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0"


    // $ANTLR start "rule__Subred__Group__0__Impl"
    // InternalMyDsl.g:6216:1: rule__Subred__Group__0__Impl : ( 'Subred' ) ;
    public final void rule__Subred__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6220:1: ( ( 'Subred' ) )
            // InternalMyDsl.g:6221:1: ( 'Subred' )
            {
            // InternalMyDsl.g:6221:1: ( 'Subred' )
            // InternalMyDsl.g:6222:2: 'Subred'
            {
             before(grammarAccess.getSubredAccess().getSubredKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getSubredKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0__Impl"


    // $ANTLR start "rule__Subred__Group__1"
    // InternalMyDsl.g:6231:1: rule__Subred__Group__1 : rule__Subred__Group__1__Impl rule__Subred__Group__2 ;
    public final void rule__Subred__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6235:1: ( rule__Subred__Group__1__Impl rule__Subred__Group__2 )
            // InternalMyDsl.g:6236:2: rule__Subred__Group__1__Impl rule__Subred__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Subred__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1"


    // $ANTLR start "rule__Subred__Group__1__Impl"
    // InternalMyDsl.g:6243:1: rule__Subred__Group__1__Impl : ( '{' ) ;
    public final void rule__Subred__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6247:1: ( ( '{' ) )
            // InternalMyDsl.g:6248:1: ( '{' )
            {
            // InternalMyDsl.g:6248:1: ( '{' )
            // InternalMyDsl.g:6249:2: '{'
            {
             before(grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1__Impl"


    // $ANTLR start "rule__Subred__Group__2"
    // InternalMyDsl.g:6258:1: rule__Subred__Group__2 : rule__Subred__Group__2__Impl rule__Subred__Group__3 ;
    public final void rule__Subred__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6262:1: ( rule__Subred__Group__2__Impl rule__Subred__Group__3 )
            // InternalMyDsl.g:6263:2: rule__Subred__Group__2__Impl rule__Subred__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Subred__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2"


    // $ANTLR start "rule__Subred__Group__2__Impl"
    // InternalMyDsl.g:6270:1: rule__Subred__Group__2__Impl : ( ( rule__Subred__Group_2__0 )? ) ;
    public final void rule__Subred__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6274:1: ( ( ( rule__Subred__Group_2__0 )? ) )
            // InternalMyDsl.g:6275:1: ( ( rule__Subred__Group_2__0 )? )
            {
            // InternalMyDsl.g:6275:1: ( ( rule__Subred__Group_2__0 )? )
            // InternalMyDsl.g:6276:2: ( rule__Subred__Group_2__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_2()); 
            // InternalMyDsl.g:6277:2: ( rule__Subred__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:6277:3: rule__Subred__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2__Impl"


    // $ANTLR start "rule__Subred__Group__3"
    // InternalMyDsl.g:6285:1: rule__Subred__Group__3 : rule__Subred__Group__3__Impl rule__Subred__Group__4 ;
    public final void rule__Subred__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6289:1: ( rule__Subred__Group__3__Impl rule__Subred__Group__4 )
            // InternalMyDsl.g:6290:2: rule__Subred__Group__3__Impl rule__Subred__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Subred__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3"


    // $ANTLR start "rule__Subred__Group__3__Impl"
    // InternalMyDsl.g:6297:1: rule__Subred__Group__3__Impl : ( ( rule__Subred__Group_3__0 )? ) ;
    public final void rule__Subred__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6301:1: ( ( ( rule__Subred__Group_3__0 )? ) )
            // InternalMyDsl.g:6302:1: ( ( rule__Subred__Group_3__0 )? )
            {
            // InternalMyDsl.g:6302:1: ( ( rule__Subred__Group_3__0 )? )
            // InternalMyDsl.g:6303:2: ( rule__Subred__Group_3__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_3()); 
            // InternalMyDsl.g:6304:2: ( rule__Subred__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==66) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:6304:3: rule__Subred__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3__Impl"


    // $ANTLR start "rule__Subred__Group__4"
    // InternalMyDsl.g:6312:1: rule__Subred__Group__4 : rule__Subred__Group__4__Impl rule__Subred__Group__5 ;
    public final void rule__Subred__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6316:1: ( rule__Subred__Group__4__Impl rule__Subred__Group__5 )
            // InternalMyDsl.g:6317:2: rule__Subred__Group__4__Impl rule__Subred__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__Subred__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4"


    // $ANTLR start "rule__Subred__Group__4__Impl"
    // InternalMyDsl.g:6324:1: rule__Subred__Group__4__Impl : ( ( rule__Subred__Group_4__0 )? ) ;
    public final void rule__Subred__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6328:1: ( ( ( rule__Subred__Group_4__0 )? ) )
            // InternalMyDsl.g:6329:1: ( ( rule__Subred__Group_4__0 )? )
            {
            // InternalMyDsl.g:6329:1: ( ( rule__Subred__Group_4__0 )? )
            // InternalMyDsl.g:6330:2: ( rule__Subred__Group_4__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_4()); 
            // InternalMyDsl.g:6331:2: ( rule__Subred__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==67) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:6331:3: rule__Subred__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4__Impl"


    // $ANTLR start "rule__Subred__Group__5"
    // InternalMyDsl.g:6339:1: rule__Subred__Group__5 : rule__Subred__Group__5__Impl rule__Subred__Group__6 ;
    public final void rule__Subred__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6343:1: ( rule__Subred__Group__5__Impl rule__Subred__Group__6 )
            // InternalMyDsl.g:6344:2: rule__Subred__Group__5__Impl rule__Subred__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Subred__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5"


    // $ANTLR start "rule__Subred__Group__5__Impl"
    // InternalMyDsl.g:6351:1: rule__Subred__Group__5__Impl : ( 'vpc' ) ;
    public final void rule__Subred__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6355:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:6356:1: ( 'vpc' )
            {
            // InternalMyDsl.g:6356:1: ( 'vpc' )
            // InternalMyDsl.g:6357:2: 'vpc'
            {
             before(grammarAccess.getSubredAccess().getVpcKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getVpcKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5__Impl"


    // $ANTLR start "rule__Subred__Group__6"
    // InternalMyDsl.g:6366:1: rule__Subred__Group__6 : rule__Subred__Group__6__Impl rule__Subred__Group__7 ;
    public final void rule__Subred__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6370:1: ( rule__Subred__Group__6__Impl rule__Subred__Group__7 )
            // InternalMyDsl.g:6371:2: rule__Subred__Group__6__Impl rule__Subred__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Subred__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6"


    // $ANTLR start "rule__Subred__Group__6__Impl"
    // InternalMyDsl.g:6378:1: rule__Subred__Group__6__Impl : ( ( rule__Subred__VpcAssignment_6 ) ) ;
    public final void rule__Subred__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6382:1: ( ( ( rule__Subred__VpcAssignment_6 ) ) )
            // InternalMyDsl.g:6383:1: ( ( rule__Subred__VpcAssignment_6 ) )
            {
            // InternalMyDsl.g:6383:1: ( ( rule__Subred__VpcAssignment_6 ) )
            // InternalMyDsl.g:6384:2: ( rule__Subred__VpcAssignment_6 )
            {
             before(grammarAccess.getSubredAccess().getVpcAssignment_6()); 
            // InternalMyDsl.g:6385:2: ( rule__Subred__VpcAssignment_6 )
            // InternalMyDsl.g:6385:3: rule__Subred__VpcAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Subred__VpcAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getVpcAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6__Impl"


    // $ANTLR start "rule__Subred__Group__7"
    // InternalMyDsl.g:6393:1: rule__Subred__Group__7 : rule__Subred__Group__7__Impl ;
    public final void rule__Subred__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6397:1: ( rule__Subred__Group__7__Impl )
            // InternalMyDsl.g:6398:2: rule__Subred__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7"


    // $ANTLR start "rule__Subred__Group__7__Impl"
    // InternalMyDsl.g:6404:1: rule__Subred__Group__7__Impl : ( '}' ) ;
    public final void rule__Subred__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6408:1: ( ( '}' ) )
            // InternalMyDsl.g:6409:1: ( '}' )
            {
            // InternalMyDsl.g:6409:1: ( '}' )
            // InternalMyDsl.g:6410:2: '}'
            {
             before(grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7__Impl"


    // $ANTLR start "rule__Subred__Group_2__0"
    // InternalMyDsl.g:6420:1: rule__Subred__Group_2__0 : rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1 ;
    public final void rule__Subred__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6424:1: ( rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1 )
            // InternalMyDsl.g:6425:2: rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Subred__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__0"


    // $ANTLR start "rule__Subred__Group_2__0__Impl"
    // InternalMyDsl.g:6432:1: rule__Subred__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__Subred__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6436:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:6437:1: ( 'nombre' )
            {
            // InternalMyDsl.g:6437:1: ( 'nombre' )
            // InternalMyDsl.g:6438:2: 'nombre'
            {
             before(grammarAccess.getSubredAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__0__Impl"


    // $ANTLR start "rule__Subred__Group_2__1"
    // InternalMyDsl.g:6447:1: rule__Subred__Group_2__1 : rule__Subred__Group_2__1__Impl ;
    public final void rule__Subred__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6451:1: ( rule__Subred__Group_2__1__Impl )
            // InternalMyDsl.g:6452:2: rule__Subred__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__1"


    // $ANTLR start "rule__Subred__Group_2__1__Impl"
    // InternalMyDsl.g:6458:1: rule__Subred__Group_2__1__Impl : ( ( rule__Subred__NombreAssignment_2_1 ) ) ;
    public final void rule__Subred__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6462:1: ( ( ( rule__Subred__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:6463:1: ( ( rule__Subred__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:6463:1: ( ( rule__Subred__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:6464:2: ( rule__Subred__NombreAssignment_2_1 )
            {
             before(grammarAccess.getSubredAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:6465:2: ( rule__Subred__NombreAssignment_2_1 )
            // InternalMyDsl.g:6465:3: rule__Subred__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__1__Impl"


    // $ANTLR start "rule__Subred__Group_3__0"
    // InternalMyDsl.g:6474:1: rule__Subred__Group_3__0 : rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 ;
    public final void rule__Subred__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6478:1: ( rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 )
            // InternalMyDsl.g:6479:2: rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Subred__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__0"


    // $ANTLR start "rule__Subred__Group_3__0__Impl"
    // InternalMyDsl.g:6486:1: rule__Subred__Group_3__0__Impl : ( 'CIDR' ) ;
    public final void rule__Subred__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6490:1: ( ( 'CIDR' ) )
            // InternalMyDsl.g:6491:1: ( 'CIDR' )
            {
            // InternalMyDsl.g:6491:1: ( 'CIDR' )
            // InternalMyDsl.g:6492:2: 'CIDR'
            {
             before(grammarAccess.getSubredAccess().getCIDRKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getCIDRKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__0__Impl"


    // $ANTLR start "rule__Subred__Group_3__1"
    // InternalMyDsl.g:6501:1: rule__Subred__Group_3__1 : rule__Subred__Group_3__1__Impl ;
    public final void rule__Subred__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6505:1: ( rule__Subred__Group_3__1__Impl )
            // InternalMyDsl.g:6506:2: rule__Subred__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__1"


    // $ANTLR start "rule__Subred__Group_3__1__Impl"
    // InternalMyDsl.g:6512:1: rule__Subred__Group_3__1__Impl : ( ( rule__Subred__CIDRAssignment_3_1 ) ) ;
    public final void rule__Subred__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6516:1: ( ( ( rule__Subred__CIDRAssignment_3_1 ) ) )
            // InternalMyDsl.g:6517:1: ( ( rule__Subred__CIDRAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6517:1: ( ( rule__Subred__CIDRAssignment_3_1 ) )
            // InternalMyDsl.g:6518:2: ( rule__Subred__CIDRAssignment_3_1 )
            {
             before(grammarAccess.getSubredAccess().getCIDRAssignment_3_1()); 
            // InternalMyDsl.g:6519:2: ( rule__Subred__CIDRAssignment_3_1 )
            // InternalMyDsl.g:6519:3: rule__Subred__CIDRAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__CIDRAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getCIDRAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__1__Impl"


    // $ANTLR start "rule__Subred__Group_4__0"
    // InternalMyDsl.g:6528:1: rule__Subred__Group_4__0 : rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 ;
    public final void rule__Subred__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6532:1: ( rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 )
            // InternalMyDsl.g:6533:2: rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Subred__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0"


    // $ANTLR start "rule__Subred__Group_4__0__Impl"
    // InternalMyDsl.g:6540:1: rule__Subred__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Subred__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6544:1: ( ( 'zonaDisponibilidad' ) )
            // InternalMyDsl.g:6545:1: ( 'zonaDisponibilidad' )
            {
            // InternalMyDsl.g:6545:1: ( 'zonaDisponibilidad' )
            // InternalMyDsl.g:6546:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0__Impl"


    // $ANTLR start "rule__Subred__Group_4__1"
    // InternalMyDsl.g:6555:1: rule__Subred__Group_4__1 : rule__Subred__Group_4__1__Impl ;
    public final void rule__Subred__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6559:1: ( rule__Subred__Group_4__1__Impl )
            // InternalMyDsl.g:6560:2: rule__Subred__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1"


    // $ANTLR start "rule__Subred__Group_4__1__Impl"
    // InternalMyDsl.g:6566:1: rule__Subred__Group_4__1__Impl : ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__Subred__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6570:1: ( ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalMyDsl.g:6571:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6571:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalMyDsl.g:6572:2: ( rule__Subred__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalMyDsl.g:6573:2: ( rule__Subred__ZonaDisponibilidadAssignment_4_1 )
            // InternalMyDsl.g:6573:3: rule__Subred__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__0"
    // InternalMyDsl.g:6582:1: rule__GrupoSeguridad__Group__0 : rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 ;
    public final void rule__GrupoSeguridad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6586:1: ( rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 )
            // InternalMyDsl.g:6587:2: rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GrupoSeguridad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__0"


    // $ANTLR start "rule__GrupoSeguridad__Group__0__Impl"
    // InternalMyDsl.g:6594:1: rule__GrupoSeguridad__Group__0__Impl : ( 'GrupoSeguridad' ) ;
    public final void rule__GrupoSeguridad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6598:1: ( ( 'GrupoSeguridad' ) )
            // InternalMyDsl.g:6599:1: ( 'GrupoSeguridad' )
            {
            // InternalMyDsl.g:6599:1: ( 'GrupoSeguridad' )
            // InternalMyDsl.g:6600:2: 'GrupoSeguridad'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__1"
    // InternalMyDsl.g:6609:1: rule__GrupoSeguridad__Group__1 : rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 ;
    public final void rule__GrupoSeguridad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6613:1: ( rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 )
            // InternalMyDsl.g:6614:2: rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__1"


    // $ANTLR start "rule__GrupoSeguridad__Group__1__Impl"
    // InternalMyDsl.g:6621:1: rule__GrupoSeguridad__Group__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6625:1: ( ( '{' ) )
            // InternalMyDsl.g:6626:1: ( '{' )
            {
            // InternalMyDsl.g:6626:1: ( '{' )
            // InternalMyDsl.g:6627:2: '{'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__2"
    // InternalMyDsl.g:6636:1: rule__GrupoSeguridad__Group__2 : rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 ;
    public final void rule__GrupoSeguridad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6640:1: ( rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 )
            // InternalMyDsl.g:6641:2: rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__2"


    // $ANTLR start "rule__GrupoSeguridad__Group__2__Impl"
    // InternalMyDsl.g:6648:1: rule__GrupoSeguridad__Group__2__Impl : ( ( rule__GrupoSeguridad__Group_2__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6652:1: ( ( ( rule__GrupoSeguridad__Group_2__0 )? ) )
            // InternalMyDsl.g:6653:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            {
            // InternalMyDsl.g:6653:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            // InternalMyDsl.g:6654:2: ( rule__GrupoSeguridad__Group_2__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_2()); 
            // InternalMyDsl.g:6655:2: ( rule__GrupoSeguridad__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:6655:3: rule__GrupoSeguridad__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__2__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__3"
    // InternalMyDsl.g:6663:1: rule__GrupoSeguridad__Group__3 : rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 ;
    public final void rule__GrupoSeguridad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6667:1: ( rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 )
            // InternalMyDsl.g:6668:2: rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__3"


    // $ANTLR start "rule__GrupoSeguridad__Group__3__Impl"
    // InternalMyDsl.g:6675:1: rule__GrupoSeguridad__Group__3__Impl : ( ( rule__GrupoSeguridad__Group_3__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6679:1: ( ( ( rule__GrupoSeguridad__Group_3__0 )? ) )
            // InternalMyDsl.g:6680:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            {
            // InternalMyDsl.g:6680:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            // InternalMyDsl.g:6681:2: ( rule__GrupoSeguridad__Group_3__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_3()); 
            // InternalMyDsl.g:6682:2: ( rule__GrupoSeguridad__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==69) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:6682:3: rule__GrupoSeguridad__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__3__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__4"
    // InternalMyDsl.g:6690:1: rule__GrupoSeguridad__Group__4 : rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 ;
    public final void rule__GrupoSeguridad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6694:1: ( rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 )
            // InternalMyDsl.g:6695:2: rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__GrupoSeguridad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__4"


    // $ANTLR start "rule__GrupoSeguridad__Group__4__Impl"
    // InternalMyDsl.g:6702:1: rule__GrupoSeguridad__Group__4__Impl : ( 'vpc' ) ;
    public final void rule__GrupoSeguridad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6706:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:6707:1: ( 'vpc' )
            {
            // InternalMyDsl.g:6707:1: ( 'vpc' )
            // InternalMyDsl.g:6708:2: 'vpc'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__4__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__5"
    // InternalMyDsl.g:6717:1: rule__GrupoSeguridad__Group__5 : rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 ;
    public final void rule__GrupoSeguridad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6721:1: ( rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 )
            // InternalMyDsl.g:6722:2: rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__GrupoSeguridad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__5"


    // $ANTLR start "rule__GrupoSeguridad__Group__5__Impl"
    // InternalMyDsl.g:6729:1: rule__GrupoSeguridad__Group__5__Impl : ( ( rule__GrupoSeguridad__VpcAssignment_5 ) ) ;
    public final void rule__GrupoSeguridad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6733:1: ( ( ( rule__GrupoSeguridad__VpcAssignment_5 ) ) )
            // InternalMyDsl.g:6734:1: ( ( rule__GrupoSeguridad__VpcAssignment_5 ) )
            {
            // InternalMyDsl.g:6734:1: ( ( rule__GrupoSeguridad__VpcAssignment_5 ) )
            // InternalMyDsl.g:6735:2: ( rule__GrupoSeguridad__VpcAssignment_5 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcAssignment_5()); 
            // InternalMyDsl.g:6736:2: ( rule__GrupoSeguridad__VpcAssignment_5 )
            // InternalMyDsl.g:6736:3: rule__GrupoSeguridad__VpcAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__VpcAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getVpcAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__5__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__6"
    // InternalMyDsl.g:6744:1: rule__GrupoSeguridad__Group__6 : rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 ;
    public final void rule__GrupoSeguridad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6748:1: ( rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 )
            // InternalMyDsl.g:6749:2: rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__GrupoSeguridad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__6"


    // $ANTLR start "rule__GrupoSeguridad__Group__6__Impl"
    // InternalMyDsl.g:6756:1: rule__GrupoSeguridad__Group__6__Impl : ( ( rule__GrupoSeguridad__Group_6__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6760:1: ( ( ( rule__GrupoSeguridad__Group_6__0 )? ) )
            // InternalMyDsl.g:6761:1: ( ( rule__GrupoSeguridad__Group_6__0 )? )
            {
            // InternalMyDsl.g:6761:1: ( ( rule__GrupoSeguridad__Group_6__0 )? )
            // InternalMyDsl.g:6762:2: ( rule__GrupoSeguridad__Group_6__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_6()); 
            // InternalMyDsl.g:6763:2: ( rule__GrupoSeguridad__Group_6__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==70) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:6763:3: rule__GrupoSeguridad__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__6__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__7"
    // InternalMyDsl.g:6771:1: rule__GrupoSeguridad__Group__7 : rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 ;
    public final void rule__GrupoSeguridad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6775:1: ( rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 )
            // InternalMyDsl.g:6776:2: rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__GrupoSeguridad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__7"


    // $ANTLR start "rule__GrupoSeguridad__Group__7__Impl"
    // InternalMyDsl.g:6783:1: rule__GrupoSeguridad__Group__7__Impl : ( ( rule__GrupoSeguridad__Group_7__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6787:1: ( ( ( rule__GrupoSeguridad__Group_7__0 )? ) )
            // InternalMyDsl.g:6788:1: ( ( rule__GrupoSeguridad__Group_7__0 )? )
            {
            // InternalMyDsl.g:6788:1: ( ( rule__GrupoSeguridad__Group_7__0 )? )
            // InternalMyDsl.g:6789:2: ( rule__GrupoSeguridad__Group_7__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_7()); 
            // InternalMyDsl.g:6790:2: ( rule__GrupoSeguridad__Group_7__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==71) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:6790:3: rule__GrupoSeguridad__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__7__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__8"
    // InternalMyDsl.g:6798:1: rule__GrupoSeguridad__Group__8 : rule__GrupoSeguridad__Group__8__Impl ;
    public final void rule__GrupoSeguridad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6802:1: ( rule__GrupoSeguridad__Group__8__Impl )
            // InternalMyDsl.g:6803:2: rule__GrupoSeguridad__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__8"


    // $ANTLR start "rule__GrupoSeguridad__Group__8__Impl"
    // InternalMyDsl.g:6809:1: rule__GrupoSeguridad__Group__8__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6813:1: ( ( '}' ) )
            // InternalMyDsl.g:6814:1: ( '}' )
            {
            // InternalMyDsl.g:6814:1: ( '}' )
            // InternalMyDsl.g:6815:2: '}'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__8__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__0"
    // InternalMyDsl.g:6825:1: rule__GrupoSeguridad__Group_2__0 : rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 ;
    public final void rule__GrupoSeguridad__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6829:1: ( rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 )
            // InternalMyDsl.g:6830:2: rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__GrupoSeguridad__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__0__Impl"
    // InternalMyDsl.g:6837:1: rule__GrupoSeguridad__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__GrupoSeguridad__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6841:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:6842:1: ( 'nombre' )
            {
            // InternalMyDsl.g:6842:1: ( 'nombre' )
            // InternalMyDsl.g:6843:2: 'nombre'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__1"
    // InternalMyDsl.g:6852:1: rule__GrupoSeguridad__Group_2__1 : rule__GrupoSeguridad__Group_2__1__Impl ;
    public final void rule__GrupoSeguridad__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6856:1: ( rule__GrupoSeguridad__Group_2__1__Impl )
            // InternalMyDsl.g:6857:2: rule__GrupoSeguridad__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__1__Impl"
    // InternalMyDsl.g:6863:1: rule__GrupoSeguridad__Group_2__1__Impl : ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6867:1: ( ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:6868:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:6868:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:6869:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:6870:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            // InternalMyDsl.g:6870:3: rule__GrupoSeguridad__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__0"
    // InternalMyDsl.g:6879:1: rule__GrupoSeguridad__Group_3__0 : rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 ;
    public final void rule__GrupoSeguridad__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6883:1: ( rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 )
            // InternalMyDsl.g:6884:2: rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__GrupoSeguridad__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__0__Impl"
    // InternalMyDsl.g:6891:1: rule__GrupoSeguridad__Group_3__0__Impl : ( 'descripcion' ) ;
    public final void rule__GrupoSeguridad__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6895:1: ( ( 'descripcion' ) )
            // InternalMyDsl.g:6896:1: ( 'descripcion' )
            {
            // InternalMyDsl.g:6896:1: ( 'descripcion' )
            // InternalMyDsl.g:6897:2: 'descripcion'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__1"
    // InternalMyDsl.g:6906:1: rule__GrupoSeguridad__Group_3__1 : rule__GrupoSeguridad__Group_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6910:1: ( rule__GrupoSeguridad__Group_3__1__Impl )
            // InternalMyDsl.g:6911:2: rule__GrupoSeguridad__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__1__Impl"
    // InternalMyDsl.g:6917:1: rule__GrupoSeguridad__Group_3__1__Impl : ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6921:1: ( ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) ) )
            // InternalMyDsl.g:6922:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6922:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) )
            // InternalMyDsl.g:6923:2: ( rule__GrupoSeguridad__DescripcionAssignment_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionAssignment_3_1()); 
            // InternalMyDsl.g:6924:2: ( rule__GrupoSeguridad__DescripcionAssignment_3_1 )
            // InternalMyDsl.g:6924:3: rule__GrupoSeguridad__DescripcionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__DescripcionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__0"
    // InternalMyDsl.g:6933:1: rule__GrupoSeguridad__Group_6__0 : rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1 ;
    public final void rule__GrupoSeguridad__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6937:1: ( rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1 )
            // InternalMyDsl.g:6938:2: rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__GrupoSeguridad__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__0__Impl"
    // InternalMyDsl.g:6945:1: rule__GrupoSeguridad__Group_6__0__Impl : ( 'reglasEntrada' ) ;
    public final void rule__GrupoSeguridad__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6949:1: ( ( 'reglasEntrada' ) )
            // InternalMyDsl.g:6950:1: ( 'reglasEntrada' )
            {
            // InternalMyDsl.g:6950:1: ( 'reglasEntrada' )
            // InternalMyDsl.g:6951:2: 'reglasEntrada'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_6_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__1"
    // InternalMyDsl.g:6960:1: rule__GrupoSeguridad__Group_6__1 : rule__GrupoSeguridad__Group_6__1__Impl rule__GrupoSeguridad__Group_6__2 ;
    public final void rule__GrupoSeguridad__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6964:1: ( rule__GrupoSeguridad__Group_6__1__Impl rule__GrupoSeguridad__Group_6__2 )
            // InternalMyDsl.g:6965:2: rule__GrupoSeguridad__Group_6__1__Impl rule__GrupoSeguridad__Group_6__2
            {
            pushFollow(FOLLOW_41);
            rule__GrupoSeguridad__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__1__Impl"
    // InternalMyDsl.g:6972:1: rule__GrupoSeguridad__Group_6__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6976:1: ( ( '{' ) )
            // InternalMyDsl.g:6977:1: ( '{' )
            {
            // InternalMyDsl.g:6977:1: ( '{' )
            // InternalMyDsl.g:6978:2: '{'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__2"
    // InternalMyDsl.g:6987:1: rule__GrupoSeguridad__Group_6__2 : rule__GrupoSeguridad__Group_6__2__Impl rule__GrupoSeguridad__Group_6__3 ;
    public final void rule__GrupoSeguridad__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6991:1: ( rule__GrupoSeguridad__Group_6__2__Impl rule__GrupoSeguridad__Group_6__3 )
            // InternalMyDsl.g:6992:2: rule__GrupoSeguridad__Group_6__2__Impl rule__GrupoSeguridad__Group_6__3
            {
            pushFollow(FOLLOW_17);
            rule__GrupoSeguridad__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__2"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__2__Impl"
    // InternalMyDsl.g:6999:1: rule__GrupoSeguridad__Group_6__2__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) ) ;
    public final void rule__GrupoSeguridad__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7003:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) ) )
            // InternalMyDsl.g:7004:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) )
            {
            // InternalMyDsl.g:7004:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) )
            // InternalMyDsl.g:7005:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_6_2()); 
            // InternalMyDsl.g:7006:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 )
            // InternalMyDsl.g:7006:3: rule__GrupoSeguridad__ReglasEntradaAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasEntradaAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__2__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__3"
    // InternalMyDsl.g:7014:1: rule__GrupoSeguridad__Group_6__3 : rule__GrupoSeguridad__Group_6__3__Impl rule__GrupoSeguridad__Group_6__4 ;
    public final void rule__GrupoSeguridad__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7018:1: ( rule__GrupoSeguridad__Group_6__3__Impl rule__GrupoSeguridad__Group_6__4 )
            // InternalMyDsl.g:7019:2: rule__GrupoSeguridad__Group_6__3__Impl rule__GrupoSeguridad__Group_6__4
            {
            pushFollow(FOLLOW_17);
            rule__GrupoSeguridad__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__3"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__3__Impl"
    // InternalMyDsl.g:7026:1: rule__GrupoSeguridad__Group_6__3__Impl : ( ( rule__GrupoSeguridad__Group_6_3__0 )* ) ;
    public final void rule__GrupoSeguridad__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7030:1: ( ( ( rule__GrupoSeguridad__Group_6_3__0 )* ) )
            // InternalMyDsl.g:7031:1: ( ( rule__GrupoSeguridad__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:7031:1: ( ( rule__GrupoSeguridad__Group_6_3__0 )* )
            // InternalMyDsl.g:7032:2: ( rule__GrupoSeguridad__Group_6_3__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_6_3()); 
            // InternalMyDsl.g:7033:2: ( rule__GrupoSeguridad__Group_6_3__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==38) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:7033:3: rule__GrupoSeguridad__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GrupoSeguridad__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__3__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__4"
    // InternalMyDsl.g:7041:1: rule__GrupoSeguridad__Group_6__4 : rule__GrupoSeguridad__Group_6__4__Impl ;
    public final void rule__GrupoSeguridad__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7045:1: ( rule__GrupoSeguridad__Group_6__4__Impl )
            // InternalMyDsl.g:7046:2: rule__GrupoSeguridad__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__4"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__4__Impl"
    // InternalMyDsl.g:7052:1: rule__GrupoSeguridad__Group_6__4__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7056:1: ( ( '}' ) )
            // InternalMyDsl.g:7057:1: ( '}' )
            {
            // InternalMyDsl.g:7057:1: ( '}' )
            // InternalMyDsl.g:7058:2: '}'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__4__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6_3__0"
    // InternalMyDsl.g:7068:1: rule__GrupoSeguridad__Group_6_3__0 : rule__GrupoSeguridad__Group_6_3__0__Impl rule__GrupoSeguridad__Group_6_3__1 ;
    public final void rule__GrupoSeguridad__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7072:1: ( rule__GrupoSeguridad__Group_6_3__0__Impl rule__GrupoSeguridad__Group_6_3__1 )
            // InternalMyDsl.g:7073:2: rule__GrupoSeguridad__Group_6_3__0__Impl rule__GrupoSeguridad__Group_6_3__1
            {
            pushFollow(FOLLOW_41);
            rule__GrupoSeguridad__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6_3__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_6_3__0__Impl"
    // InternalMyDsl.g:7080:1: rule__GrupoSeguridad__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7084:1: ( ( ',' ) )
            // InternalMyDsl.g:7085:1: ( ',' )
            {
            // InternalMyDsl.g:7085:1: ( ',' )
            // InternalMyDsl.g:7086:2: ','
            {
             before(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_6_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6_3__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6_3__1"
    // InternalMyDsl.g:7095:1: rule__GrupoSeguridad__Group_6_3__1 : rule__GrupoSeguridad__Group_6_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7099:1: ( rule__GrupoSeguridad__Group_6_3__1__Impl )
            // InternalMyDsl.g:7100:2: rule__GrupoSeguridad__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6_3__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_6_3__1__Impl"
    // InternalMyDsl.g:7106:1: rule__GrupoSeguridad__Group_6_3__1__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7110:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:7111:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:7111:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) )
            // InternalMyDsl.g:7112:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_6_3_1()); 
            // InternalMyDsl.g:7113:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 )
            // InternalMyDsl.g:7113:3: rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6_3__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__0"
    // InternalMyDsl.g:7122:1: rule__GrupoSeguridad__Group_7__0 : rule__GrupoSeguridad__Group_7__0__Impl rule__GrupoSeguridad__Group_7__1 ;
    public final void rule__GrupoSeguridad__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7126:1: ( rule__GrupoSeguridad__Group_7__0__Impl rule__GrupoSeguridad__Group_7__1 )
            // InternalMyDsl.g:7127:2: rule__GrupoSeguridad__Group_7__0__Impl rule__GrupoSeguridad__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__GrupoSeguridad__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__0__Impl"
    // InternalMyDsl.g:7134:1: rule__GrupoSeguridad__Group_7__0__Impl : ( 'reglasSalida' ) ;
    public final void rule__GrupoSeguridad__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7138:1: ( ( 'reglasSalida' ) )
            // InternalMyDsl.g:7139:1: ( 'reglasSalida' )
            {
            // InternalMyDsl.g:7139:1: ( 'reglasSalida' )
            // InternalMyDsl.g:7140:2: 'reglasSalida'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__1"
    // InternalMyDsl.g:7149:1: rule__GrupoSeguridad__Group_7__1 : rule__GrupoSeguridad__Group_7__1__Impl rule__GrupoSeguridad__Group_7__2 ;
    public final void rule__GrupoSeguridad__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7153:1: ( rule__GrupoSeguridad__Group_7__1__Impl rule__GrupoSeguridad__Group_7__2 )
            // InternalMyDsl.g:7154:2: rule__GrupoSeguridad__Group_7__1__Impl rule__GrupoSeguridad__Group_7__2
            {
            pushFollow(FOLLOW_41);
            rule__GrupoSeguridad__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__1__Impl"
    // InternalMyDsl.g:7161:1: rule__GrupoSeguridad__Group_7__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7165:1: ( ( '{' ) )
            // InternalMyDsl.g:7166:1: ( '{' )
            {
            // InternalMyDsl.g:7166:1: ( '{' )
            // InternalMyDsl.g:7167:2: '{'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__2"
    // InternalMyDsl.g:7176:1: rule__GrupoSeguridad__Group_7__2 : rule__GrupoSeguridad__Group_7__2__Impl rule__GrupoSeguridad__Group_7__3 ;
    public final void rule__GrupoSeguridad__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7180:1: ( rule__GrupoSeguridad__Group_7__2__Impl rule__GrupoSeguridad__Group_7__3 )
            // InternalMyDsl.g:7181:2: rule__GrupoSeguridad__Group_7__2__Impl rule__GrupoSeguridad__Group_7__3
            {
            pushFollow(FOLLOW_17);
            rule__GrupoSeguridad__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__2"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__2__Impl"
    // InternalMyDsl.g:7188:1: rule__GrupoSeguridad__Group_7__2__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) ) ;
    public final void rule__GrupoSeguridad__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7192:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) ) )
            // InternalMyDsl.g:7193:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) )
            {
            // InternalMyDsl.g:7193:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) )
            // InternalMyDsl.g:7194:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_7_2()); 
            // InternalMyDsl.g:7195:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 )
            // InternalMyDsl.g:7195:3: rule__GrupoSeguridad__ReglasSalidaAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasSalidaAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__2__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__3"
    // InternalMyDsl.g:7203:1: rule__GrupoSeguridad__Group_7__3 : rule__GrupoSeguridad__Group_7__3__Impl rule__GrupoSeguridad__Group_7__4 ;
    public final void rule__GrupoSeguridad__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7207:1: ( rule__GrupoSeguridad__Group_7__3__Impl rule__GrupoSeguridad__Group_7__4 )
            // InternalMyDsl.g:7208:2: rule__GrupoSeguridad__Group_7__3__Impl rule__GrupoSeguridad__Group_7__4
            {
            pushFollow(FOLLOW_17);
            rule__GrupoSeguridad__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__3"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__3__Impl"
    // InternalMyDsl.g:7215:1: rule__GrupoSeguridad__Group_7__3__Impl : ( ( rule__GrupoSeguridad__Group_7_3__0 )* ) ;
    public final void rule__GrupoSeguridad__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7219:1: ( ( ( rule__GrupoSeguridad__Group_7_3__0 )* ) )
            // InternalMyDsl.g:7220:1: ( ( rule__GrupoSeguridad__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:7220:1: ( ( rule__GrupoSeguridad__Group_7_3__0 )* )
            // InternalMyDsl.g:7221:2: ( rule__GrupoSeguridad__Group_7_3__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_7_3()); 
            // InternalMyDsl.g:7222:2: ( rule__GrupoSeguridad__Group_7_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==38) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:7222:3: rule__GrupoSeguridad__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GrupoSeguridad__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__3__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__4"
    // InternalMyDsl.g:7230:1: rule__GrupoSeguridad__Group_7__4 : rule__GrupoSeguridad__Group_7__4__Impl ;
    public final void rule__GrupoSeguridad__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7234:1: ( rule__GrupoSeguridad__Group_7__4__Impl )
            // InternalMyDsl.g:7235:2: rule__GrupoSeguridad__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__4"


    // $ANTLR start "rule__GrupoSeguridad__Group_7__4__Impl"
    // InternalMyDsl.g:7241:1: rule__GrupoSeguridad__Group_7__4__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7245:1: ( ( '}' ) )
            // InternalMyDsl.g:7246:1: ( '}' )
            {
            // InternalMyDsl.g:7246:1: ( '}' )
            // InternalMyDsl.g:7247:2: '}'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7__4__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_7_3__0"
    // InternalMyDsl.g:7257:1: rule__GrupoSeguridad__Group_7_3__0 : rule__GrupoSeguridad__Group_7_3__0__Impl rule__GrupoSeguridad__Group_7_3__1 ;
    public final void rule__GrupoSeguridad__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7261:1: ( rule__GrupoSeguridad__Group_7_3__0__Impl rule__GrupoSeguridad__Group_7_3__1 )
            // InternalMyDsl.g:7262:2: rule__GrupoSeguridad__Group_7_3__0__Impl rule__GrupoSeguridad__Group_7_3__1
            {
            pushFollow(FOLLOW_41);
            rule__GrupoSeguridad__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7_3__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_7_3__0__Impl"
    // InternalMyDsl.g:7269:1: rule__GrupoSeguridad__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7273:1: ( ( ',' ) )
            // InternalMyDsl.g:7274:1: ( ',' )
            {
            // InternalMyDsl.g:7274:1: ( ',' )
            // InternalMyDsl.g:7275:2: ','
            {
             before(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_7_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7_3__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_7_3__1"
    // InternalMyDsl.g:7284:1: rule__GrupoSeguridad__Group_7_3__1 : rule__GrupoSeguridad__Group_7_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7288:1: ( rule__GrupoSeguridad__Group_7_3__1__Impl )
            // InternalMyDsl.g:7289:2: rule__GrupoSeguridad__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7_3__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_7_3__1__Impl"
    // InternalMyDsl.g:7295:1: rule__GrupoSeguridad__Group_7_3__1__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7299:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:7300:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:7300:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) )
            // InternalMyDsl.g:7301:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_7_3_1()); 
            // InternalMyDsl.g:7302:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 )
            // InternalMyDsl.g:7302:3: rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_7_3__1__Impl"


    // $ANTLR start "rule__Regla__Group__0"
    // InternalMyDsl.g:7311:1: rule__Regla__Group__0 : rule__Regla__Group__0__Impl rule__Regla__Group__1 ;
    public final void rule__Regla__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7315:1: ( rule__Regla__Group__0__Impl rule__Regla__Group__1 )
            // InternalMyDsl.g:7316:2: rule__Regla__Group__0__Impl rule__Regla__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Regla__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__0"


    // $ANTLR start "rule__Regla__Group__0__Impl"
    // InternalMyDsl.g:7323:1: rule__Regla__Group__0__Impl : ( () ) ;
    public final void rule__Regla__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7327:1: ( ( () ) )
            // InternalMyDsl.g:7328:1: ( () )
            {
            // InternalMyDsl.g:7328:1: ( () )
            // InternalMyDsl.g:7329:2: ()
            {
             before(grammarAccess.getReglaAccess().getReglaAction_0()); 
            // InternalMyDsl.g:7330:2: ()
            // InternalMyDsl.g:7330:3: 
            {
            }

             after(grammarAccess.getReglaAccess().getReglaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__0__Impl"


    // $ANTLR start "rule__Regla__Group__1"
    // InternalMyDsl.g:7338:1: rule__Regla__Group__1 : rule__Regla__Group__1__Impl rule__Regla__Group__2 ;
    public final void rule__Regla__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7342:1: ( rule__Regla__Group__1__Impl rule__Regla__Group__2 )
            // InternalMyDsl.g:7343:2: rule__Regla__Group__1__Impl rule__Regla__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Regla__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__1"


    // $ANTLR start "rule__Regla__Group__1__Impl"
    // InternalMyDsl.g:7350:1: rule__Regla__Group__1__Impl : ( 'Regla' ) ;
    public final void rule__Regla__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7354:1: ( ( 'Regla' ) )
            // InternalMyDsl.g:7355:1: ( 'Regla' )
            {
            // InternalMyDsl.g:7355:1: ( 'Regla' )
            // InternalMyDsl.g:7356:2: 'Regla'
            {
             before(grammarAccess.getReglaAccess().getReglaKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getReglaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__1__Impl"


    // $ANTLR start "rule__Regla__Group__2"
    // InternalMyDsl.g:7365:1: rule__Regla__Group__2 : rule__Regla__Group__2__Impl rule__Regla__Group__3 ;
    public final void rule__Regla__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7369:1: ( rule__Regla__Group__2__Impl rule__Regla__Group__3 )
            // InternalMyDsl.g:7370:2: rule__Regla__Group__2__Impl rule__Regla__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Regla__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__2"


    // $ANTLR start "rule__Regla__Group__2__Impl"
    // InternalMyDsl.g:7377:1: rule__Regla__Group__2__Impl : ( '{' ) ;
    public final void rule__Regla__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7381:1: ( ( '{' ) )
            // InternalMyDsl.g:7382:1: ( '{' )
            {
            // InternalMyDsl.g:7382:1: ( '{' )
            // InternalMyDsl.g:7383:2: '{'
            {
             before(grammarAccess.getReglaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__2__Impl"


    // $ANTLR start "rule__Regla__Group__3"
    // InternalMyDsl.g:7392:1: rule__Regla__Group__3 : rule__Regla__Group__3__Impl rule__Regla__Group__4 ;
    public final void rule__Regla__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7396:1: ( rule__Regla__Group__3__Impl rule__Regla__Group__4 )
            // InternalMyDsl.g:7397:2: rule__Regla__Group__3__Impl rule__Regla__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Regla__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__3"


    // $ANTLR start "rule__Regla__Group__3__Impl"
    // InternalMyDsl.g:7404:1: rule__Regla__Group__3__Impl : ( ( rule__Regla__Group_3__0 )? ) ;
    public final void rule__Regla__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7408:1: ( ( ( rule__Regla__Group_3__0 )? ) )
            // InternalMyDsl.g:7409:1: ( ( rule__Regla__Group_3__0 )? )
            {
            // InternalMyDsl.g:7409:1: ( ( rule__Regla__Group_3__0 )? )
            // InternalMyDsl.g:7410:2: ( rule__Regla__Group_3__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_3()); 
            // InternalMyDsl.g:7411:2: ( rule__Regla__Group_3__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==52) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:7411:3: rule__Regla__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Regla__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReglaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__3__Impl"


    // $ANTLR start "rule__Regla__Group__4"
    // InternalMyDsl.g:7419:1: rule__Regla__Group__4 : rule__Regla__Group__4__Impl rule__Regla__Group__5 ;
    public final void rule__Regla__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7423:1: ( rule__Regla__Group__4__Impl rule__Regla__Group__5 )
            // InternalMyDsl.g:7424:2: rule__Regla__Group__4__Impl rule__Regla__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Regla__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__4"


    // $ANTLR start "rule__Regla__Group__4__Impl"
    // InternalMyDsl.g:7431:1: rule__Regla__Group__4__Impl : ( ( rule__Regla__Group_4__0 )? ) ;
    public final void rule__Regla__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7435:1: ( ( ( rule__Regla__Group_4__0 )? ) )
            // InternalMyDsl.g:7436:1: ( ( rule__Regla__Group_4__0 )? )
            {
            // InternalMyDsl.g:7436:1: ( ( rule__Regla__Group_4__0 )? )
            // InternalMyDsl.g:7437:2: ( rule__Regla__Group_4__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_4()); 
            // InternalMyDsl.g:7438:2: ( rule__Regla__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==73) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:7438:3: rule__Regla__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Regla__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReglaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__4__Impl"


    // $ANTLR start "rule__Regla__Group__5"
    // InternalMyDsl.g:7446:1: rule__Regla__Group__5 : rule__Regla__Group__5__Impl rule__Regla__Group__6 ;
    public final void rule__Regla__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7450:1: ( rule__Regla__Group__5__Impl rule__Regla__Group__6 )
            // InternalMyDsl.g:7451:2: rule__Regla__Group__5__Impl rule__Regla__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__Regla__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__5"


    // $ANTLR start "rule__Regla__Group__5__Impl"
    // InternalMyDsl.g:7458:1: rule__Regla__Group__5__Impl : ( ( rule__Regla__Group_5__0 )? ) ;
    public final void rule__Regla__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7462:1: ( ( ( rule__Regla__Group_5__0 )? ) )
            // InternalMyDsl.g:7463:1: ( ( rule__Regla__Group_5__0 )? )
            {
            // InternalMyDsl.g:7463:1: ( ( rule__Regla__Group_5__0 )? )
            // InternalMyDsl.g:7464:2: ( rule__Regla__Group_5__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_5()); 
            // InternalMyDsl.g:7465:2: ( rule__Regla__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==74) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:7465:3: rule__Regla__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Regla__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReglaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__5__Impl"


    // $ANTLR start "rule__Regla__Group__6"
    // InternalMyDsl.g:7473:1: rule__Regla__Group__6 : rule__Regla__Group__6__Impl rule__Regla__Group__7 ;
    public final void rule__Regla__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7477:1: ( rule__Regla__Group__6__Impl rule__Regla__Group__7 )
            // InternalMyDsl.g:7478:2: rule__Regla__Group__6__Impl rule__Regla__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__Regla__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__6"


    // $ANTLR start "rule__Regla__Group__6__Impl"
    // InternalMyDsl.g:7485:1: rule__Regla__Group__6__Impl : ( ( rule__Regla__Group_6__0 )? ) ;
    public final void rule__Regla__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7489:1: ( ( ( rule__Regla__Group_6__0 )? ) )
            // InternalMyDsl.g:7490:1: ( ( rule__Regla__Group_6__0 )? )
            {
            // InternalMyDsl.g:7490:1: ( ( rule__Regla__Group_6__0 )? )
            // InternalMyDsl.g:7491:2: ( rule__Regla__Group_6__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_6()); 
            // InternalMyDsl.g:7492:2: ( rule__Regla__Group_6__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==75) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:7492:3: rule__Regla__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Regla__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReglaAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__6__Impl"


    // $ANTLR start "rule__Regla__Group__7"
    // InternalMyDsl.g:7500:1: rule__Regla__Group__7 : rule__Regla__Group__7__Impl rule__Regla__Group__8 ;
    public final void rule__Regla__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7504:1: ( rule__Regla__Group__7__Impl rule__Regla__Group__8 )
            // InternalMyDsl.g:7505:2: rule__Regla__Group__7__Impl rule__Regla__Group__8
            {
            pushFollow(FOLLOW_42);
            rule__Regla__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__7"


    // $ANTLR start "rule__Regla__Group__7__Impl"
    // InternalMyDsl.g:7512:1: rule__Regla__Group__7__Impl : ( ( rule__Regla__Group_7__0 )? ) ;
    public final void rule__Regla__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7516:1: ( ( ( rule__Regla__Group_7__0 )? ) )
            // InternalMyDsl.g:7517:1: ( ( rule__Regla__Group_7__0 )? )
            {
            // InternalMyDsl.g:7517:1: ( ( rule__Regla__Group_7__0 )? )
            // InternalMyDsl.g:7518:2: ( rule__Regla__Group_7__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_7()); 
            // InternalMyDsl.g:7519:2: ( rule__Regla__Group_7__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==69) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:7519:3: rule__Regla__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Regla__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReglaAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__7__Impl"


    // $ANTLR start "rule__Regla__Group__8"
    // InternalMyDsl.g:7527:1: rule__Regla__Group__8 : rule__Regla__Group__8__Impl ;
    public final void rule__Regla__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7531:1: ( rule__Regla__Group__8__Impl )
            // InternalMyDsl.g:7532:2: rule__Regla__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regla__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__8"


    // $ANTLR start "rule__Regla__Group__8__Impl"
    // InternalMyDsl.g:7538:1: rule__Regla__Group__8__Impl : ( '}' ) ;
    public final void rule__Regla__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7542:1: ( ( '}' ) )
            // InternalMyDsl.g:7543:1: ( '}' )
            {
            // InternalMyDsl.g:7543:1: ( '}' )
            // InternalMyDsl.g:7544:2: '}'
            {
             before(grammarAccess.getReglaAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__8__Impl"


    // $ANTLR start "rule__Regla__Group_3__0"
    // InternalMyDsl.g:7554:1: rule__Regla__Group_3__0 : rule__Regla__Group_3__0__Impl rule__Regla__Group_3__1 ;
    public final void rule__Regla__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7558:1: ( rule__Regla__Group_3__0__Impl rule__Regla__Group_3__1 )
            // InternalMyDsl.g:7559:2: rule__Regla__Group_3__0__Impl rule__Regla__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Regla__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_3__0"


    // $ANTLR start "rule__Regla__Group_3__0__Impl"
    // InternalMyDsl.g:7566:1: rule__Regla__Group_3__0__Impl : ( 'tipo' ) ;
    public final void rule__Regla__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7570:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:7571:1: ( 'tipo' )
            {
            // InternalMyDsl.g:7571:1: ( 'tipo' )
            // InternalMyDsl.g:7572:2: 'tipo'
            {
             before(grammarAccess.getReglaAccess().getTipoKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getTipoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_3__0__Impl"


    // $ANTLR start "rule__Regla__Group_3__1"
    // InternalMyDsl.g:7581:1: rule__Regla__Group_3__1 : rule__Regla__Group_3__1__Impl ;
    public final void rule__Regla__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7585:1: ( rule__Regla__Group_3__1__Impl )
            // InternalMyDsl.g:7586:2: rule__Regla__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regla__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_3__1"


    // $ANTLR start "rule__Regla__Group_3__1__Impl"
    // InternalMyDsl.g:7592:1: rule__Regla__Group_3__1__Impl : ( ( rule__Regla__TipoAssignment_3_1 ) ) ;
    public final void rule__Regla__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7596:1: ( ( ( rule__Regla__TipoAssignment_3_1 ) ) )
            // InternalMyDsl.g:7597:1: ( ( rule__Regla__TipoAssignment_3_1 ) )
            {
            // InternalMyDsl.g:7597:1: ( ( rule__Regla__TipoAssignment_3_1 ) )
            // InternalMyDsl.g:7598:2: ( rule__Regla__TipoAssignment_3_1 )
            {
             before(grammarAccess.getReglaAccess().getTipoAssignment_3_1()); 
            // InternalMyDsl.g:7599:2: ( rule__Regla__TipoAssignment_3_1 )
            // InternalMyDsl.g:7599:3: rule__Regla__TipoAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Regla__TipoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getTipoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_3__1__Impl"


    // $ANTLR start "rule__Regla__Group_4__0"
    // InternalMyDsl.g:7608:1: rule__Regla__Group_4__0 : rule__Regla__Group_4__0__Impl rule__Regla__Group_4__1 ;
    public final void rule__Regla__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7612:1: ( rule__Regla__Group_4__0__Impl rule__Regla__Group_4__1 )
            // InternalMyDsl.g:7613:2: rule__Regla__Group_4__0__Impl rule__Regla__Group_4__1
            {
            pushFollow(FOLLOW_43);
            rule__Regla__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_4__0"


    // $ANTLR start "rule__Regla__Group_4__0__Impl"
    // InternalMyDsl.g:7620:1: rule__Regla__Group_4__0__Impl : ( 'protocolo' ) ;
    public final void rule__Regla__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7624:1: ( ( 'protocolo' ) )
            // InternalMyDsl.g:7625:1: ( 'protocolo' )
            {
            // InternalMyDsl.g:7625:1: ( 'protocolo' )
            // InternalMyDsl.g:7626:2: 'protocolo'
            {
             before(grammarAccess.getReglaAccess().getProtocoloKeyword_4_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getProtocoloKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_4__0__Impl"


    // $ANTLR start "rule__Regla__Group_4__1"
    // InternalMyDsl.g:7635:1: rule__Regla__Group_4__1 : rule__Regla__Group_4__1__Impl ;
    public final void rule__Regla__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7639:1: ( rule__Regla__Group_4__1__Impl )
            // InternalMyDsl.g:7640:2: rule__Regla__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regla__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_4__1"


    // $ANTLR start "rule__Regla__Group_4__1__Impl"
    // InternalMyDsl.g:7646:1: rule__Regla__Group_4__1__Impl : ( ( rule__Regla__ProtocoloAssignment_4_1 ) ) ;
    public final void rule__Regla__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7650:1: ( ( ( rule__Regla__ProtocoloAssignment_4_1 ) ) )
            // InternalMyDsl.g:7651:1: ( ( rule__Regla__ProtocoloAssignment_4_1 ) )
            {
            // InternalMyDsl.g:7651:1: ( ( rule__Regla__ProtocoloAssignment_4_1 ) )
            // InternalMyDsl.g:7652:2: ( rule__Regla__ProtocoloAssignment_4_1 )
            {
             before(grammarAccess.getReglaAccess().getProtocoloAssignment_4_1()); 
            // InternalMyDsl.g:7653:2: ( rule__Regla__ProtocoloAssignment_4_1 )
            // InternalMyDsl.g:7653:3: rule__Regla__ProtocoloAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Regla__ProtocoloAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getProtocoloAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_4__1__Impl"


    // $ANTLR start "rule__Regla__Group_5__0"
    // InternalMyDsl.g:7662:1: rule__Regla__Group_5__0 : rule__Regla__Group_5__0__Impl rule__Regla__Group_5__1 ;
    public final void rule__Regla__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7666:1: ( rule__Regla__Group_5__0__Impl rule__Regla__Group_5__1 )
            // InternalMyDsl.g:7667:2: rule__Regla__Group_5__0__Impl rule__Regla__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__Regla__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_5__0"


    // $ANTLR start "rule__Regla__Group_5__0__Impl"
    // InternalMyDsl.g:7674:1: rule__Regla__Group_5__0__Impl : ( 'puerto' ) ;
    public final void rule__Regla__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7678:1: ( ( 'puerto' ) )
            // InternalMyDsl.g:7679:1: ( 'puerto' )
            {
            // InternalMyDsl.g:7679:1: ( 'puerto' )
            // InternalMyDsl.g:7680:2: 'puerto'
            {
             before(grammarAccess.getReglaAccess().getPuertoKeyword_5_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getPuertoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_5__0__Impl"


    // $ANTLR start "rule__Regla__Group_5__1"
    // InternalMyDsl.g:7689:1: rule__Regla__Group_5__1 : rule__Regla__Group_5__1__Impl ;
    public final void rule__Regla__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7693:1: ( rule__Regla__Group_5__1__Impl )
            // InternalMyDsl.g:7694:2: rule__Regla__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regla__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_5__1"


    // $ANTLR start "rule__Regla__Group_5__1__Impl"
    // InternalMyDsl.g:7700:1: rule__Regla__Group_5__1__Impl : ( ( rule__Regla__PuertoAssignment_5_1 ) ) ;
    public final void rule__Regla__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7704:1: ( ( ( rule__Regla__PuertoAssignment_5_1 ) ) )
            // InternalMyDsl.g:7705:1: ( ( rule__Regla__PuertoAssignment_5_1 ) )
            {
            // InternalMyDsl.g:7705:1: ( ( rule__Regla__PuertoAssignment_5_1 ) )
            // InternalMyDsl.g:7706:2: ( rule__Regla__PuertoAssignment_5_1 )
            {
             before(grammarAccess.getReglaAccess().getPuertoAssignment_5_1()); 
            // InternalMyDsl.g:7707:2: ( rule__Regla__PuertoAssignment_5_1 )
            // InternalMyDsl.g:7707:3: rule__Regla__PuertoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Regla__PuertoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getPuertoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_5__1__Impl"


    // $ANTLR start "rule__Regla__Group_6__0"
    // InternalMyDsl.g:7716:1: rule__Regla__Group_6__0 : rule__Regla__Group_6__0__Impl rule__Regla__Group_6__1 ;
    public final void rule__Regla__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7720:1: ( rule__Regla__Group_6__0__Impl rule__Regla__Group_6__1 )
            // InternalMyDsl.g:7721:2: rule__Regla__Group_6__0__Impl rule__Regla__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Regla__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_6__0"


    // $ANTLR start "rule__Regla__Group_6__0__Impl"
    // InternalMyDsl.g:7728:1: rule__Regla__Group_6__0__Impl : ( 'origen' ) ;
    public final void rule__Regla__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7732:1: ( ( 'origen' ) )
            // InternalMyDsl.g:7733:1: ( 'origen' )
            {
            // InternalMyDsl.g:7733:1: ( 'origen' )
            // InternalMyDsl.g:7734:2: 'origen'
            {
             before(grammarAccess.getReglaAccess().getOrigenKeyword_6_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getOrigenKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_6__0__Impl"


    // $ANTLR start "rule__Regla__Group_6__1"
    // InternalMyDsl.g:7743:1: rule__Regla__Group_6__1 : rule__Regla__Group_6__1__Impl ;
    public final void rule__Regla__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7747:1: ( rule__Regla__Group_6__1__Impl )
            // InternalMyDsl.g:7748:2: rule__Regla__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regla__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_6__1"


    // $ANTLR start "rule__Regla__Group_6__1__Impl"
    // InternalMyDsl.g:7754:1: rule__Regla__Group_6__1__Impl : ( ( rule__Regla__OrigenAssignment_6_1 ) ) ;
    public final void rule__Regla__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7758:1: ( ( ( rule__Regla__OrigenAssignment_6_1 ) ) )
            // InternalMyDsl.g:7759:1: ( ( rule__Regla__OrigenAssignment_6_1 ) )
            {
            // InternalMyDsl.g:7759:1: ( ( rule__Regla__OrigenAssignment_6_1 ) )
            // InternalMyDsl.g:7760:2: ( rule__Regla__OrigenAssignment_6_1 )
            {
             before(grammarAccess.getReglaAccess().getOrigenAssignment_6_1()); 
            // InternalMyDsl.g:7761:2: ( rule__Regla__OrigenAssignment_6_1 )
            // InternalMyDsl.g:7761:3: rule__Regla__OrigenAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Regla__OrigenAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getOrigenAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_6__1__Impl"


    // $ANTLR start "rule__Regla__Group_7__0"
    // InternalMyDsl.g:7770:1: rule__Regla__Group_7__0 : rule__Regla__Group_7__0__Impl rule__Regla__Group_7__1 ;
    public final void rule__Regla__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7774:1: ( rule__Regla__Group_7__0__Impl rule__Regla__Group_7__1 )
            // InternalMyDsl.g:7775:2: rule__Regla__Group_7__0__Impl rule__Regla__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Regla__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regla__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_7__0"


    // $ANTLR start "rule__Regla__Group_7__0__Impl"
    // InternalMyDsl.g:7782:1: rule__Regla__Group_7__0__Impl : ( 'descripcion' ) ;
    public final void rule__Regla__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7786:1: ( ( 'descripcion' ) )
            // InternalMyDsl.g:7787:1: ( 'descripcion' )
            {
            // InternalMyDsl.g:7787:1: ( 'descripcion' )
            // InternalMyDsl.g:7788:2: 'descripcion'
            {
             before(grammarAccess.getReglaAccess().getDescripcionKeyword_7_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getReglaAccess().getDescripcionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_7__0__Impl"


    // $ANTLR start "rule__Regla__Group_7__1"
    // InternalMyDsl.g:7797:1: rule__Regla__Group_7__1 : rule__Regla__Group_7__1__Impl ;
    public final void rule__Regla__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7801:1: ( rule__Regla__Group_7__1__Impl )
            // InternalMyDsl.g:7802:2: rule__Regla__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regla__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_7__1"


    // $ANTLR start "rule__Regla__Group_7__1__Impl"
    // InternalMyDsl.g:7808:1: rule__Regla__Group_7__1__Impl : ( ( rule__Regla__DescripcionAssignment_7_1 ) ) ;
    public final void rule__Regla__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7812:1: ( ( ( rule__Regla__DescripcionAssignment_7_1 ) ) )
            // InternalMyDsl.g:7813:1: ( ( rule__Regla__DescripcionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:7813:1: ( ( rule__Regla__DescripcionAssignment_7_1 ) )
            // InternalMyDsl.g:7814:2: ( rule__Regla__DescripcionAssignment_7_1 )
            {
             before(grammarAccess.getReglaAccess().getDescripcionAssignment_7_1()); 
            // InternalMyDsl.g:7815:2: ( rule__Regla__DescripcionAssignment_7_1 )
            // InternalMyDsl.g:7815:3: rule__Regla__DescripcionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Regla__DescripcionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getDescripcionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group_7__1__Impl"


    // $ANTLR start "rule__Infraestructura__NombreAssignment_1"
    // InternalMyDsl.g:7824:1: rule__Infraestructura__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Infraestructura__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7828:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7829:2: ( ruleEString )
            {
            // InternalMyDsl.g:7829:2: ( ruleEString )
            // InternalMyDsl.g:7830:3: ruleEString
            {
             before(grammarAccess.getInfraestructuraAccess().getNombreEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getNombreEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__NombreAssignment_1"


    // $ANTLR start "rule__Infraestructura__ProveedorAssignment_3"
    // InternalMyDsl.g:7839:1: rule__Infraestructura__ProveedorAssignment_3 : ( ruleProveedor ) ;
    public final void rule__Infraestructura__ProveedorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7843:1: ( ( ruleProveedor ) )
            // InternalMyDsl.g:7844:2: ( ruleProveedor )
            {
            // InternalMyDsl.g:7844:2: ( ruleProveedor )
            // InternalMyDsl.g:7845:3: ruleProveedor
            {
             before(grammarAccess.getInfraestructuraAccess().getProveedorProveedorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProveedor();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getProveedorProveedorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__ProveedorAssignment_3"


    // $ANTLR start "rule__Proveedor__NombreAssignment_2"
    // InternalMyDsl.g:7854:1: rule__Proveedor__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Proveedor__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7858:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7859:2: ( ruleEString )
            {
            // InternalMyDsl.g:7859:2: ( ruleEString )
            // InternalMyDsl.g:7860:3: ruleEString
            {
             before(grammarAccess.getProveedorAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorAccess().getNombreEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__NombreAssignment_2"


    // $ANTLR start "rule__Proveedor__ParametroConexionAssignment_5"
    // InternalMyDsl.g:7869:1: rule__Proveedor__ParametroConexionAssignment_5 : ( ruleParametroConexion ) ;
    public final void rule__Proveedor__ParametroConexionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7873:1: ( ( ruleParametroConexion ) )
            // InternalMyDsl.g:7874:2: ( ruleParametroConexion )
            {
            // InternalMyDsl.g:7874:2: ( ruleParametroConexion )
            // InternalMyDsl.g:7875:3: ruleParametroConexion
            {
             before(grammarAccess.getProveedorAccess().getParametroConexionParametroConexionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParametroConexion();

            state._fsp--;

             after(grammarAccess.getProveedorAccess().getParametroConexionParametroConexionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__ParametroConexionAssignment_5"


    // $ANTLR start "rule__Proveedor__AmbientesDespliegueAssignment_6_3"
    // InternalMyDsl.g:7884:1: rule__Proveedor__AmbientesDespliegueAssignment_6_3 : ( ruleAmbienteDespliegue ) ;
    public final void rule__Proveedor__AmbientesDespliegueAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7888:1: ( ( ruleAmbienteDespliegue ) )
            // InternalMyDsl.g:7889:2: ( ruleAmbienteDespliegue )
            {
            // InternalMyDsl.g:7889:2: ( ruleAmbienteDespliegue )
            // InternalMyDsl.g:7890:3: ruleAmbienteDespliegue
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__AmbientesDespliegueAssignment_6_3"


    // $ANTLR start "rule__Proveedor__AmbientesDespliegueAssignment_6_4_1"
    // InternalMyDsl.g:7899:1: rule__Proveedor__AmbientesDespliegueAssignment_6_4_1 : ( ruleAmbienteDespliegue ) ;
    public final void rule__Proveedor__AmbientesDespliegueAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7903:1: ( ( ruleAmbienteDespliegue ) )
            // InternalMyDsl.g:7904:2: ( ruleAmbienteDespliegue )
            {
            // InternalMyDsl.g:7904:2: ( ruleAmbienteDespliegue )
            // InternalMyDsl.g:7905:3: ruleAmbienteDespliegue
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__AmbientesDespliegueAssignment_6_4_1"


    // $ANTLR start "rule__AmbienteDespliegue__NombreAssignment_2_2"
    // InternalMyDsl.g:7914:1: rule__AmbienteDespliegue__NombreAssignment_2_2 : ( ruleNombreAmbiente ) ;
    public final void rule__AmbienteDespliegue__NombreAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7918:1: ( ( ruleNombreAmbiente ) )
            // InternalMyDsl.g:7919:2: ( ruleNombreAmbiente )
            {
            // InternalMyDsl.g:7919:2: ( ruleNombreAmbiente )
            // InternalMyDsl.g:7920:3: ruleNombreAmbiente
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getNombreNombreAmbienteEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNombreAmbiente();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getNombreNombreAmbienteEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__NombreAssignment_2_2"


    // $ANTLR start "rule__AmbienteDespliegue__RecursosAssignment_3_2"
    // InternalMyDsl.g:7929:1: rule__AmbienteDespliegue__RecursosAssignment_3_2 : ( ruleRecurso ) ;
    public final void rule__AmbienteDespliegue__RecursosAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7933:1: ( ( ruleRecurso ) )
            // InternalMyDsl.g:7934:2: ( ruleRecurso )
            {
            // InternalMyDsl.g:7934:2: ( ruleRecurso )
            // InternalMyDsl.g:7935:3: ruleRecurso
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRecurso();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__RecursosAssignment_3_2"


    // $ANTLR start "rule__AmbienteDespliegue__RecursosAssignment_3_3_1"
    // InternalMyDsl.g:7944:1: rule__AmbienteDespliegue__RecursosAssignment_3_3_1 : ( ruleRecurso ) ;
    public final void rule__AmbienteDespliegue__RecursosAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7948:1: ( ( ruleRecurso ) )
            // InternalMyDsl.g:7949:2: ( ruleRecurso )
            {
            // InternalMyDsl.g:7949:2: ( ruleRecurso )
            // InternalMyDsl.g:7950:3: ruleRecurso
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecurso();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__RecursosAssignment_3_3_1"


    // $ANTLR start "rule__AmbienteDespliegue__ConexionesAssignment_4_2"
    // InternalMyDsl.g:7959:1: rule__AmbienteDespliegue__ConexionesAssignment_4_2 : ( ruleConexion ) ;
    public final void rule__AmbienteDespliegue__ConexionesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7963:1: ( ( ruleConexion ) )
            // InternalMyDsl.g:7964:2: ( ruleConexion )
            {
            // InternalMyDsl.g:7964:2: ( ruleConexion )
            // InternalMyDsl.g:7965:3: ruleConexion
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getConexionesConexionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConexion();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getConexionesConexionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__ConexionesAssignment_4_2"


    // $ANTLR start "rule__AmbienteDespliegue__ConexionesAssignment_4_3_1"
    // InternalMyDsl.g:7974:1: rule__AmbienteDespliegue__ConexionesAssignment_4_3_1 : ( ruleConexion ) ;
    public final void rule__AmbienteDespliegue__ConexionesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7978:1: ( ( ruleConexion ) )
            // InternalMyDsl.g:7979:2: ( ruleConexion )
            {
            // InternalMyDsl.g:7979:2: ( ruleConexion )
            // InternalMyDsl.g:7980:3: ruleConexion
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getConexionesConexionParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConexion();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getConexionesConexionParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__ConexionesAssignment_4_3_1"


    // $ANTLR start "rule__AmbienteDespliegue__SeguridadAssignment_5_2"
    // InternalMyDsl.g:7989:1: rule__AmbienteDespliegue__SeguridadAssignment_5_2 : ( ruleMecanismoSeguridad ) ;
    public final void rule__AmbienteDespliegue__SeguridadAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7993:1: ( ( ruleMecanismoSeguridad ) )
            // InternalMyDsl.g:7994:2: ( ruleMecanismoSeguridad )
            {
            // InternalMyDsl.g:7994:2: ( ruleMecanismoSeguridad )
            // InternalMyDsl.g:7995:3: ruleMecanismoSeguridad
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getSeguridadMecanismoSeguridadParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMecanismoSeguridad();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getSeguridadMecanismoSeguridadParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__SeguridadAssignment_5_2"


    // $ANTLR start "rule__AmbienteDespliegue__SeguridadAssignment_5_3_1"
    // InternalMyDsl.g:8004:1: rule__AmbienteDespliegue__SeguridadAssignment_5_3_1 : ( ruleMecanismoSeguridad ) ;
    public final void rule__AmbienteDespliegue__SeguridadAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8008:1: ( ( ruleMecanismoSeguridad ) )
            // InternalMyDsl.g:8009:2: ( ruleMecanismoSeguridad )
            {
            // InternalMyDsl.g:8009:2: ( ruleMecanismoSeguridad )
            // InternalMyDsl.g:8010:3: ruleMecanismoSeguridad
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getSeguridadMecanismoSeguridadParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMecanismoSeguridad();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getSeguridadMecanismoSeguridadParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__SeguridadAssignment_5_3_1"


    // $ANTLR start "rule__AmbienteDespliegue__VpcAssignment_6_4"
    // InternalMyDsl.g:8019:1: rule__AmbienteDespliegue__VpcAssignment_6_4 : ( ruleVPC ) ;
    public final void rule__AmbienteDespliegue__VpcAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8023:1: ( ( ruleVPC ) )
            // InternalMyDsl.g:8024:2: ( ruleVPC )
            {
            // InternalMyDsl.g:8024:2: ( ruleVPC )
            // InternalMyDsl.g:8025:3: ruleVPC
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__VpcAssignment_6_4"


    // $ANTLR start "rule__AmbienteDespliegue__VpcAssignment_6_5_1"
    // InternalMyDsl.g:8034:1: rule__AmbienteDespliegue__VpcAssignment_6_5_1 : ( ruleVPC ) ;
    public final void rule__AmbienteDespliegue__VpcAssignment_6_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8038:1: ( ( ruleVPC ) )
            // InternalMyDsl.g:8039:2: ( ruleVPC )
            {
            // InternalMyDsl.g:8039:2: ( ruleVPC )
            // InternalMyDsl.g:8040:3: ruleVPC
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_6_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_6_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__VpcAssignment_6_5_1"


    // $ANTLR start "rule__UsuarioPassword__UsuarioAssignment_3_1"
    // InternalMyDsl.g:8049:1: rule__UsuarioPassword__UsuarioAssignment_3_1 : ( ruleEString ) ;
    public final void rule__UsuarioPassword__UsuarioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8053:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8054:2: ( ruleEString )
            {
            // InternalMyDsl.g:8054:2: ( ruleEString )
            // InternalMyDsl.g:8055:3: ruleEString
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUsuarioPasswordAccess().getUsuarioEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__UsuarioAssignment_3_1"


    // $ANTLR start "rule__UsuarioPassword__PasswordAssignment_4_1"
    // InternalMyDsl.g:8064:1: rule__UsuarioPassword__PasswordAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UsuarioPassword__PasswordAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8068:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8069:2: ( ruleEString )
            {
            // InternalMyDsl.g:8069:2: ( ruleEString )
            // InternalMyDsl.g:8070:3: ruleEString
            {
             before(grammarAccess.getUsuarioPasswordAccess().getPasswordEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUsuarioPasswordAccess().getPasswordEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__PasswordAssignment_4_1"


    // $ANTLR start "rule__Llave__SecretoAssignment_3_1"
    // InternalMyDsl.g:8079:1: rule__Llave__SecretoAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Llave__SecretoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8083:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8084:2: ( ruleEString )
            {
            // InternalMyDsl.g:8084:2: ( ruleEString )
            // InternalMyDsl.g:8085:3: ruleEString
            {
             before(grammarAccess.getLlaveAccess().getSecretoEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLlaveAccess().getSecretoEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__SecretoAssignment_3_1"


    // $ANTLR start "rule__Conexion__NombreAssignment_2_1"
    // InternalMyDsl.g:8094:1: rule__Conexion__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Conexion__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8098:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8099:2: ( ruleEString )
            {
            // InternalMyDsl.g:8099:2: ( ruleEString )
            // InternalMyDsl.g:8100:3: ruleEString
            {
             before(grammarAccess.getConexionAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConexionAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__NombreAssignment_2_1"


    // $ANTLR start "rule__Conexion__RecursosAssignment_5"
    // InternalMyDsl.g:8109:1: rule__Conexion__RecursosAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Conexion__RecursosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8113:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8114:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8114:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8115:3: ( ruleEString )
            {
             before(grammarAccess.getConexionAccess().getRecursosRecursoCrossReference_5_0()); 
            // InternalMyDsl.g:8116:3: ( ruleEString )
            // InternalMyDsl.g:8117:4: ruleEString
            {
             before(grammarAccess.getConexionAccess().getRecursosRecursoEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConexionAccess().getRecursosRecursoEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getConexionAccess().getRecursosRecursoCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__RecursosAssignment_5"


    // $ANTLR start "rule__Conexion__RecursosAssignment_6_1"
    // InternalMyDsl.g:8128:1: rule__Conexion__RecursosAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Conexion__RecursosAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8132:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8133:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8133:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8134:3: ( ruleEString )
            {
             before(grammarAccess.getConexionAccess().getRecursosRecursoCrossReference_6_1_0()); 
            // InternalMyDsl.g:8135:3: ( ruleEString )
            // InternalMyDsl.g:8136:4: ruleEString
            {
             before(grammarAccess.getConexionAccess().getRecursosRecursoEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConexionAccess().getRecursosRecursoEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getConexionAccess().getRecursosRecursoCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__RecursosAssignment_6_1"


    // $ANTLR start "rule__VPC__NombreAssignment_5"
    // InternalMyDsl.g:8147:1: rule__VPC__NombreAssignment_5 : ( ruleEString ) ;
    public final void rule__VPC__NombreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8151:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8152:2: ( ruleEString )
            {
            // InternalMyDsl.g:8152:2: ( ruleEString )
            // InternalMyDsl.g:8153:3: ruleEString
            {
             before(grammarAccess.getVPCAccess().getNombreEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVPCAccess().getNombreEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__NombreAssignment_5"


    // $ANTLR start "rule__ServidorAplicaciones__NombreAssignment_2_1"
    // InternalMyDsl.g:8162:1: rule__ServidorAplicaciones__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8166:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8167:2: ( ruleEString )
            {
            // InternalMyDsl.g:8167:2: ( ruleEString )
            // InternalMyDsl.g:8168:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__NombreAssignment_2_1"


    // $ANTLR start "rule__ServidorAplicaciones__TamanioAssignment_3_1"
    // InternalMyDsl.g:8177:1: rule__ServidorAplicaciones__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__ServidorAplicaciones__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8181:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:8182:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:8182:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:8183:3: ruleTamanioServidor
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanioServidor();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__TamanioAssignment_3_1"


    // $ANTLR start "rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1"
    // InternalMyDsl.g:8192:1: rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 : ( ruleSistemaOperativo ) ;
    public final void rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8196:1: ( ( ruleSistemaOperativo ) )
            // InternalMyDsl.g:8197:2: ( ruleSistemaOperativo )
            {
            // InternalMyDsl.g:8197:2: ( ruleSistemaOperativo )
            // InternalMyDsl.g:8198:3: ruleSistemaOperativo
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoSistemaOperativoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSistemaOperativo();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoSistemaOperativoEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1"


    // $ANTLR start "rule__ServidorAplicaciones__ConexionesAssignment_5_2"
    // InternalMyDsl.g:8207:1: rule__ServidorAplicaciones__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8211:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8212:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8212:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8213:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:8214:3: ( ruleEString )
            // InternalMyDsl.g:8215:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__ConexionesAssignment_5_2"


    // $ANTLR start "rule__ServidorAplicaciones__ConexionesAssignment_5_3_1"
    // InternalMyDsl.g:8226:1: rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8230:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8231:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8231:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8232:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:8233:3: ( ruleEString )
            // InternalMyDsl.g:8234:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__ConexionesAssignment_5_3_1"


    // $ANTLR start "rule__ServidorAplicaciones__VpcAssignment_7"
    // InternalMyDsl.g:8245:1: rule__ServidorAplicaciones__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8249:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8250:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8250:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8251:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:8252:3: ( ruleEString )
            // InternalMyDsl.g:8253:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__VpcAssignment_7"


    // $ANTLR start "rule__ServidorAlmacenamiento__NombreAssignment_2_1"
    // InternalMyDsl.g:8264:1: rule__ServidorAlmacenamiento__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ServidorAlmacenamiento__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8268:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8269:2: ( ruleEString )
            {
            // InternalMyDsl.g:8269:2: ( ruleEString )
            // InternalMyDsl.g:8270:3: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__NombreAssignment_2_1"


    // $ANTLR start "rule__ServidorAlmacenamiento__TamanioAssignment_3_1"
    // InternalMyDsl.g:8279:1: rule__ServidorAlmacenamiento__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__ServidorAlmacenamiento__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8283:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:8284:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:8284:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:8285:3: ruleTamanioServidor
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanioServidor();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__TamanioAssignment_3_1"


    // $ANTLR start "rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1"
    // InternalMyDsl.g:8294:1: rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8298:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8299:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8299:2: ( ruleEInt )
            // InternalMyDsl.g:8300:3: ruleEInt
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1"


    // $ANTLR start "rule__ServidorAlmacenamiento__ConexionesAssignment_5_2"
    // InternalMyDsl.g:8309:1: rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8313:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8314:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8314:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8315:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:8316:3: ( ruleEString )
            // InternalMyDsl.g:8317:4: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__ConexionesAssignment_5_2"


    // $ANTLR start "rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1"
    // InternalMyDsl.g:8328:1: rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8332:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8333:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8333:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8334:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:8335:3: ( ruleEString )
            // InternalMyDsl.g:8336:4: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1"


    // $ANTLR start "rule__ServidorAlmacenamiento__VpcAssignment_7"
    // InternalMyDsl.g:8347:1: rule__ServidorAlmacenamiento__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8351:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8352:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8352:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8353:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:8354:3: ( ruleEString )
            // InternalMyDsl.g:8355:4: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__VpcAssignment_7"


    // $ANTLR start "rule__BaseDatosSQL__NombreAssignment_2_1"
    // InternalMyDsl.g:8366:1: rule__BaseDatosSQL__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__BaseDatosSQL__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8370:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8371:2: ( ruleEString )
            {
            // InternalMyDsl.g:8371:2: ( ruleEString )
            // InternalMyDsl.g:8372:3: ruleEString
            {
             before(grammarAccess.getBaseDatosSQLAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosSQLAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__NombreAssignment_2_1"


    // $ANTLR start "rule__BaseDatosSQL__TamanioAssignment_3_1"
    // InternalMyDsl.g:8381:1: rule__BaseDatosSQL__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__BaseDatosSQL__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8385:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:8386:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:8386:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:8387:3: ruleTamanioServidor
            {
             before(grammarAccess.getBaseDatosSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanioServidor();

            state._fsp--;

             after(grammarAccess.getBaseDatosSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__TamanioAssignment_3_1"


    // $ANTLR start "rule__BaseDatosSQL__ManejadorAssignment_4_1"
    // InternalMyDsl.g:8396:1: rule__BaseDatosSQL__ManejadorAssignment_4_1 : ( ruleManejadorSQL ) ;
    public final void rule__BaseDatosSQL__ManejadorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8400:1: ( ( ruleManejadorSQL ) )
            // InternalMyDsl.g:8401:2: ( ruleManejadorSQL )
            {
            // InternalMyDsl.g:8401:2: ( ruleManejadorSQL )
            // InternalMyDsl.g:8402:3: ruleManejadorSQL
            {
             before(grammarAccess.getBaseDatosSQLAccess().getManejadorManejadorSQLEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManejadorSQL();

            state._fsp--;

             after(grammarAccess.getBaseDatosSQLAccess().getManejadorManejadorSQLEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__ManejadorAssignment_4_1"


    // $ANTLR start "rule__BaseDatosSQL__ConexionesAssignment_5_2"
    // InternalMyDsl.g:8411:1: rule__BaseDatosSQL__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosSQL__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8415:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8416:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8416:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8417:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:8418:3: ( ruleEString )
            // InternalMyDsl.g:8419:4: ruleEString
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__ConexionesAssignment_5_2"


    // $ANTLR start "rule__BaseDatosSQL__ConexionesAssignment_5_3_1"
    // InternalMyDsl.g:8430:1: rule__BaseDatosSQL__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosSQL__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8434:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8435:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8435:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8436:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:8437:3: ( ruleEString )
            // InternalMyDsl.g:8438:4: ruleEString
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__ConexionesAssignment_5_3_1"


    // $ANTLR start "rule__BaseDatosSQL__VpcAssignment_7"
    // InternalMyDsl.g:8449:1: rule__BaseDatosSQL__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosSQL__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8453:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8454:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8454:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8455:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:8456:3: ( ruleEString )
            // InternalMyDsl.g:8457:4: ruleEString
            {
             before(grammarAccess.getBaseDatosSQLAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosSQLAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBaseDatosSQLAccess().getVpcVPCCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosSQL__VpcAssignment_7"


    // $ANTLR start "rule__BaseDatosNoSQL__NombreAssignment_2_1"
    // InternalMyDsl.g:8468:1: rule__BaseDatosNoSQL__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__BaseDatosNoSQL__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8472:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8473:2: ( ruleEString )
            {
            // InternalMyDsl.g:8473:2: ( ruleEString )
            // InternalMyDsl.g:8474:3: ruleEString
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosNoSQLAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__NombreAssignment_2_1"


    // $ANTLR start "rule__BaseDatosNoSQL__TamanioAssignment_3_1"
    // InternalMyDsl.g:8483:1: rule__BaseDatosNoSQL__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__BaseDatosNoSQL__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8487:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:8488:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:8488:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:8489:3: ruleTamanioServidor
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanioServidor();

            state._fsp--;

             after(grammarAccess.getBaseDatosNoSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__TamanioAssignment_3_1"


    // $ANTLR start "rule__BaseDatosNoSQL__ManejadorAssignment_4_1"
    // InternalMyDsl.g:8498:1: rule__BaseDatosNoSQL__ManejadorAssignment_4_1 : ( ruleManejadorNoSQL ) ;
    public final void rule__BaseDatosNoSQL__ManejadorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8502:1: ( ( ruleManejadorNoSQL ) )
            // InternalMyDsl.g:8503:2: ( ruleManejadorNoSQL )
            {
            // InternalMyDsl.g:8503:2: ( ruleManejadorNoSQL )
            // InternalMyDsl.g:8504:3: ruleManejadorNoSQL
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getManejadorManejadorNoSQLEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManejadorNoSQL();

            state._fsp--;

             after(grammarAccess.getBaseDatosNoSQLAccess().getManejadorManejadorNoSQLEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__ManejadorAssignment_4_1"


    // $ANTLR start "rule__BaseDatosNoSQL__ConexionesAssignment_5_2"
    // InternalMyDsl.g:8513:1: rule__BaseDatosNoSQL__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosNoSQL__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8517:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8518:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8518:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8519:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:8520:3: ( ruleEString )
            // InternalMyDsl.g:8521:4: ruleEString
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__ConexionesAssignment_5_2"


    // $ANTLR start "rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1"
    // InternalMyDsl.g:8532:1: rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8536:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8537:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8537:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8538:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:8539:3: ( ruleEString )
            // InternalMyDsl.g:8540:4: ruleEString
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1"


    // $ANTLR start "rule__BaseDatosNoSQL__VpcAssignment_7"
    // InternalMyDsl.g:8551:1: rule__BaseDatosNoSQL__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosNoSQL__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8555:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8556:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8556:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8557:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:8558:3: ( ruleEString )
            // InternalMyDsl.g:8559:4: ruleEString
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseDatosNoSQLAccess().getVpcVPCEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBaseDatosNoSQLAccess().getVpcVPCCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseDatosNoSQL__VpcAssignment_7"


    // $ANTLR start "rule__InternetGateway__NombreAssignment_2_1"
    // InternalMyDsl.g:8570:1: rule__InternetGateway__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8574:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8575:2: ( ruleEString )
            {
            // InternalMyDsl.g:8575:2: ( ruleEString )
            // InternalMyDsl.g:8576:3: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__NombreAssignment_2_1"


    // $ANTLR start "rule__InternetGateway__VpcAssignment_4"
    // InternalMyDsl.g:8585:1: rule__InternetGateway__VpcAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__InternetGateway__VpcAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8589:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8590:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8590:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8591:3: ( ruleEString )
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcVPCCrossReference_4_0()); 
            // InternalMyDsl.g:8592:3: ( ruleEString )
            // InternalMyDsl.g:8593:4: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcVPCEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getVpcVPCEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInternetGatewayAccess().getVpcVPCCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__VpcAssignment_4"


    // $ANTLR start "rule__Subred__NombreAssignment_2_1"
    // InternalMyDsl.g:8604:1: rule__Subred__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Subred__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8608:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8609:2: ( ruleEString )
            {
            // InternalMyDsl.g:8609:2: ( ruleEString )
            // InternalMyDsl.g:8610:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__NombreAssignment_2_1"


    // $ANTLR start "rule__Subred__CIDRAssignment_3_1"
    // InternalMyDsl.g:8619:1: rule__Subred__CIDRAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subred__CIDRAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8623:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8624:2: ( ruleEString )
            {
            // InternalMyDsl.g:8624:2: ( ruleEString )
            // InternalMyDsl.g:8625:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getCIDREStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getCIDREStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__CIDRAssignment_3_1"


    // $ANTLR start "rule__Subred__ZonaDisponibilidadAssignment_4_1"
    // InternalMyDsl.g:8634:1: rule__Subred__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Subred__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8638:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8639:2: ( ruleEString )
            {
            // InternalMyDsl.g:8639:2: ( ruleEString )
            // InternalMyDsl.g:8640:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__Subred__VpcAssignment_6"
    // InternalMyDsl.g:8649:1: rule__Subred__VpcAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Subred__VpcAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8653:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8654:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8654:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8655:3: ( ruleEString )
            {
             before(grammarAccess.getSubredAccess().getVpcVPCCrossReference_6_0()); 
            // InternalMyDsl.g:8656:3: ( ruleEString )
            // InternalMyDsl.g:8657:4: ruleEString
            {
             before(grammarAccess.getSubredAccess().getVpcVPCEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getVpcVPCEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSubredAccess().getVpcVPCCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__VpcAssignment_6"


    // $ANTLR start "rule__GrupoSeguridad__NombreAssignment_2_1"
    // InternalMyDsl.g:8668:1: rule__GrupoSeguridad__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8672:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8673:2: ( ruleEString )
            {
            // InternalMyDsl.g:8673:2: ( ruleEString )
            // InternalMyDsl.g:8674:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__NombreAssignment_2_1"


    // $ANTLR start "rule__GrupoSeguridad__DescripcionAssignment_3_1"
    // InternalMyDsl.g:8683:1: rule__GrupoSeguridad__DescripcionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__DescripcionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8687:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8688:2: ( ruleEString )
            {
            // InternalMyDsl.g:8688:2: ( ruleEString )
            // InternalMyDsl.g:8689:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__DescripcionAssignment_3_1"


    // $ANTLR start "rule__GrupoSeguridad__VpcAssignment_5"
    // InternalMyDsl.g:8698:1: rule__GrupoSeguridad__VpcAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__VpcAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8702:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8703:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8703:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8704:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_5_0()); 
            // InternalMyDsl.g:8705:3: ( ruleEString )
            // InternalMyDsl.g:8706:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcVPCEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getVpcVPCEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__VpcAssignment_5"


    // $ANTLR start "rule__GrupoSeguridad__ReglasEntradaAssignment_6_2"
    // InternalMyDsl.g:8717:1: rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8721:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:8722:2: ( ruleRegla )
            {
            // InternalMyDsl.g:8722:2: ( ruleRegla )
            // InternalMyDsl.g:8723:3: ruleRegla
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRegla();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasEntradaAssignment_6_2"


    // $ANTLR start "rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1"
    // InternalMyDsl.g:8732:1: rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8736:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:8737:2: ( ruleRegla )
            {
            // InternalMyDsl.g:8737:2: ( ruleRegla )
            // InternalMyDsl.g:8738:3: ruleRegla
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegla();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1"


    // $ANTLR start "rule__GrupoSeguridad__ReglasSalidaAssignment_7_2"
    // InternalMyDsl.g:8747:1: rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8751:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:8752:2: ( ruleRegla )
            {
            // InternalMyDsl.g:8752:2: ( ruleRegla )
            // InternalMyDsl.g:8753:3: ruleRegla
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRegla();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasSalidaAssignment_7_2"


    // $ANTLR start "rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1"
    // InternalMyDsl.g:8762:1: rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8766:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:8767:2: ( ruleRegla )
            {
            // InternalMyDsl.g:8767:2: ( ruleRegla )
            // InternalMyDsl.g:8768:3: ruleRegla
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegla();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1"


    // $ANTLR start "rule__Regla__TipoAssignment_3_1"
    // InternalMyDsl.g:8777:1: rule__Regla__TipoAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Regla__TipoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8781:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8782:2: ( ruleEString )
            {
            // InternalMyDsl.g:8782:2: ( ruleEString )
            // InternalMyDsl.g:8783:3: ruleEString
            {
             before(grammarAccess.getReglaAccess().getTipoEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReglaAccess().getTipoEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__TipoAssignment_3_1"


    // $ANTLR start "rule__Regla__ProtocoloAssignment_4_1"
    // InternalMyDsl.g:8792:1: rule__Regla__ProtocoloAssignment_4_1 : ( ruleProtocolo ) ;
    public final void rule__Regla__ProtocoloAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8796:1: ( ( ruleProtocolo ) )
            // InternalMyDsl.g:8797:2: ( ruleProtocolo )
            {
            // InternalMyDsl.g:8797:2: ( ruleProtocolo )
            // InternalMyDsl.g:8798:3: ruleProtocolo
            {
             before(grammarAccess.getReglaAccess().getProtocoloProtocoloEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocolo();

            state._fsp--;

             after(grammarAccess.getReglaAccess().getProtocoloProtocoloEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__ProtocoloAssignment_4_1"


    // $ANTLR start "rule__Regla__PuertoAssignment_5_1"
    // InternalMyDsl.g:8807:1: rule__Regla__PuertoAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Regla__PuertoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8811:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8812:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8812:2: ( ruleEInt )
            // InternalMyDsl.g:8813:3: ruleEInt
            {
             before(grammarAccess.getReglaAccess().getPuertoEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReglaAccess().getPuertoEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__PuertoAssignment_5_1"


    // $ANTLR start "rule__Regla__OrigenAssignment_6_1"
    // InternalMyDsl.g:8822:1: rule__Regla__OrigenAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Regla__OrigenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8826:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8827:2: ( ruleEString )
            {
            // InternalMyDsl.g:8827:2: ( ruleEString )
            // InternalMyDsl.g:8828:3: ruleEString
            {
             before(grammarAccess.getReglaAccess().getOrigenEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReglaAccess().getOrigenEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__OrigenAssignment_6_1"


    // $ANTLR start "rule__Regla__DescripcionAssignment_7_1"
    // InternalMyDsl.g:8837:1: rule__Regla__DescripcionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Regla__DescripcionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8841:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8842:2: ( ruleEString )
            {
            // InternalMyDsl.g:8842:2: ( ruleEString )
            // InternalMyDsl.g:8843:3: ruleEString
            {
             before(grammarAccess.getReglaAccess().getDescripcionEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReglaAccess().getDescripcionEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__DescripcionAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000FA000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x5480000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000600080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x03000A8000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x09000A8000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x21000A8000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000088000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000088000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000080000000L,0x0000000000000E20L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000018000000L});

}