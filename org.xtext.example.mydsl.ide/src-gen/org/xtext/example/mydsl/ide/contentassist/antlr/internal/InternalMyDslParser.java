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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DESARROLLO'", "'PRUEBAS'", "'QA'", "'PRODUCCION'", "'MICRO'", "'SMALL'", "'MEDIUM'", "'LARGE'", "'Windows'", "'Ubuntu1804'", "'POSTGRESQL'", "'MYSQL'", "'ORACLE'", "'SQLSERVER'", "'MONGODB'", "'CASSANDRA'", "'TCP'", "'UDP'", "'Infraestructura'", "'{'", "'}'", "'Tipo'", "'='", "';'", "'Ambientes'", "'['", "']'", "','", "'nombre'", "'vpcs'", "'recursos'", "'user'", "'password'", "'secret'", "'tipo'", "'VPC'", "'ServidorAplicaciones'", "'vpc'", "'tamanio'", "'sistemaOperativo'", "'conexiones'", "'('", "')'", "'ServidorAlmacenamiento'", "'tamanioInicial'", "'BaseDatosSQL'", "'manejador'", "'BaseDatosNoSQL'", "'-'", "'InternetGateway'", "'Subred'", "'CIDR'", "'zonaDisponibilidad'", "'GrupoSeguridad'", "'descripcion'", "'reglasEntrada'", "'reglasSalida'", "'Regla'", "'protocolo'", "'puerto'", "'origen'"
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEString EOF )
            // InternalMyDsl.g:130:1: ruleEString EOF
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
    // InternalMyDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:144:4: rule__EString__Alternatives
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
    // InternalMyDsl.g:153:1: entryRuleProveedor : ruleProveedor EOF ;
    public final void entryRuleProveedor() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleProveedor EOF )
            // InternalMyDsl.g:155:1: ruleProveedor EOF
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
    // InternalMyDsl.g:162:1: ruleProveedor : ( ( rule__Proveedor__Group__0 ) ) ;
    public final void ruleProveedor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Proveedor__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Proveedor__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Proveedor__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Proveedor__Group__0 )
            {
             before(grammarAccess.getProveedorAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Proveedor__Group__0 )
            // InternalMyDsl.g:169:4: rule__Proveedor__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleAmbienteDespliegue : ruleAmbienteDespliegue EOF ;
    public final void entryRuleAmbienteDespliegue() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAmbienteDespliegue EOF )
            // InternalMyDsl.g:180:1: ruleAmbienteDespliegue EOF
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
    // InternalMyDsl.g:187:1: ruleAmbienteDespliegue : ( ( rule__AmbienteDespliegue__Group__0 ) ) ;
    public final void ruleAmbienteDespliegue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AmbienteDespliegue__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AmbienteDespliegue__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AmbienteDespliegue__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AmbienteDespliegue__Group__0 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AmbienteDespliegue__Group__0 )
            // InternalMyDsl.g:194:4: rule__AmbienteDespliegue__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleUsuarioPassword : ruleUsuarioPassword EOF ;
    public final void entryRuleUsuarioPassword() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleUsuarioPassword EOF )
            // InternalMyDsl.g:205:1: ruleUsuarioPassword EOF
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
    // InternalMyDsl.g:212:1: ruleUsuarioPassword : ( ( rule__UsuarioPassword__Group__0 ) ) ;
    public final void ruleUsuarioPassword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__UsuarioPassword__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__UsuarioPassword__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__UsuarioPassword__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__UsuarioPassword__Group__0 )
            {
             before(grammarAccess.getUsuarioPasswordAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__UsuarioPassword__Group__0 )
            // InternalMyDsl.g:219:4: rule__UsuarioPassword__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleLlave : ruleLlave EOF ;
    public final void entryRuleLlave() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleLlave EOF )
            // InternalMyDsl.g:230:1: ruleLlave EOF
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
    // InternalMyDsl.g:237:1: ruleLlave : ( ( rule__Llave__Group__0 ) ) ;
    public final void ruleLlave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Llave__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Llave__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Llave__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Llave__Group__0 )
            {
             before(grammarAccess.getLlaveAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Llave__Group__0 )
            // InternalMyDsl.g:244:4: rule__Llave__Group__0
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


    // $ANTLR start "entryRuleVPC"
    // InternalMyDsl.g:253:1: entryRuleVPC : ruleVPC EOF ;
    public final void entryRuleVPC() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleVPC EOF )
            // InternalMyDsl.g:255:1: ruleVPC EOF
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
    // InternalMyDsl.g:262:1: ruleVPC : ( ( rule__VPC__Group__0 ) ) ;
    public final void ruleVPC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__VPC__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__VPC__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__VPC__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__VPC__Group__0 )
            {
             before(grammarAccess.getVPCAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__VPC__Group__0 )
            // InternalMyDsl.g:269:4: rule__VPC__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleServidorAplicaciones : ruleServidorAplicaciones EOF ;
    public final void entryRuleServidorAplicaciones() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleServidorAplicaciones EOF )
            // InternalMyDsl.g:280:1: ruleServidorAplicaciones EOF
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
    // InternalMyDsl.g:287:1: ruleServidorAplicaciones : ( ( rule__ServidorAplicaciones__Group__0 ) ) ;
    public final void ruleServidorAplicaciones() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ServidorAplicaciones__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ServidorAplicaciones__Group__0 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ServidorAplicaciones__Group__0 )
            // InternalMyDsl.g:294:4: rule__ServidorAplicaciones__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleServidorAlmacenamiento : ruleServidorAlmacenamiento EOF ;
    public final void entryRuleServidorAlmacenamiento() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleServidorAlmacenamiento EOF )
            // InternalMyDsl.g:305:1: ruleServidorAlmacenamiento EOF
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
    // InternalMyDsl.g:312:1: ruleServidorAlmacenamiento : ( ( rule__ServidorAlmacenamiento__Group__0 ) ) ;
    public final void ruleServidorAlmacenamiento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ServidorAlmacenamiento__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ServidorAlmacenamiento__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ServidorAlmacenamiento__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ServidorAlmacenamiento__Group__0 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ServidorAlmacenamiento__Group__0 )
            // InternalMyDsl.g:319:4: rule__ServidorAlmacenamiento__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleBaseDatosSQL : ruleBaseDatosSQL EOF ;
    public final void entryRuleBaseDatosSQL() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleBaseDatosSQL EOF )
            // InternalMyDsl.g:330:1: ruleBaseDatosSQL EOF
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
    // InternalMyDsl.g:337:1: ruleBaseDatosSQL : ( ( rule__BaseDatosSQL__Group__0 ) ) ;
    public final void ruleBaseDatosSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__BaseDatosSQL__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__BaseDatosSQL__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__BaseDatosSQL__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__BaseDatosSQL__Group__0 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__BaseDatosSQL__Group__0 )
            // InternalMyDsl.g:344:4: rule__BaseDatosSQL__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleBaseDatosNoSQL : ruleBaseDatosNoSQL EOF ;
    public final void entryRuleBaseDatosNoSQL() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleBaseDatosNoSQL EOF )
            // InternalMyDsl.g:355:1: ruleBaseDatosNoSQL EOF
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
    // InternalMyDsl.g:362:1: ruleBaseDatosNoSQL : ( ( rule__BaseDatosNoSQL__Group__0 ) ) ;
    public final void ruleBaseDatosNoSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__BaseDatosNoSQL__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__BaseDatosNoSQL__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__BaseDatosNoSQL__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__BaseDatosNoSQL__Group__0 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__BaseDatosNoSQL__Group__0 )
            // InternalMyDsl.g:369:4: rule__BaseDatosNoSQL__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleEInt EOF )
            // InternalMyDsl.g:380:1: ruleEInt EOF
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
    // InternalMyDsl.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:394:4: rule__EInt__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleInternetGateway : ruleInternetGateway EOF ;
    public final void entryRuleInternetGateway() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleInternetGateway EOF )
            // InternalMyDsl.g:405:1: ruleInternetGateway EOF
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
    // InternalMyDsl.g:412:1: ruleInternetGateway : ( ( rule__InternetGateway__Group__0 ) ) ;
    public final void ruleInternetGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__InternetGateway__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__InternetGateway__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__InternetGateway__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__InternetGateway__Group__0 )
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__InternetGateway__Group__0 )
            // InternalMyDsl.g:419:4: rule__InternetGateway__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleSubred : ruleSubred EOF ;
    public final void entryRuleSubred() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleSubred EOF )
            // InternalMyDsl.g:430:1: ruleSubred EOF
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
    // InternalMyDsl.g:437:1: ruleSubred : ( ( rule__Subred__Group__0 ) ) ;
    public final void ruleSubred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Subred__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Subred__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Subred__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Subred__Group__0 )
            {
             before(grammarAccess.getSubredAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Subred__Group__0 )
            // InternalMyDsl.g:444:4: rule__Subred__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleGrupoSeguridad : ruleGrupoSeguridad EOF ;
    public final void entryRuleGrupoSeguridad() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleGrupoSeguridad EOF )
            // InternalMyDsl.g:455:1: ruleGrupoSeguridad EOF
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
    // InternalMyDsl.g:462:1: ruleGrupoSeguridad : ( ( rule__GrupoSeguridad__Group__0 ) ) ;
    public final void ruleGrupoSeguridad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__GrupoSeguridad__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__GrupoSeguridad__Group__0 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__GrupoSeguridad__Group__0 )
            // InternalMyDsl.g:469:4: rule__GrupoSeguridad__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleRegla : ruleRegla EOF ;
    public final void entryRuleRegla() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleRegla EOF )
            // InternalMyDsl.g:480:1: ruleRegla EOF
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
    // InternalMyDsl.g:487:1: ruleRegla : ( ( rule__Regla__Group__0 ) ) ;
    public final void ruleRegla() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Regla__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Regla__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Regla__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Regla__Group__0 )
            {
             before(grammarAccess.getReglaAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Regla__Group__0 )
            // InternalMyDsl.g:494:4: rule__Regla__Group__0
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
    // InternalMyDsl.g:503:1: ruleNombreAmbiente : ( ( rule__NombreAmbiente__Alternatives ) ) ;
    public final void ruleNombreAmbiente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( rule__NombreAmbiente__Alternatives ) ) )
            // InternalMyDsl.g:508:2: ( ( rule__NombreAmbiente__Alternatives ) )
            {
            // InternalMyDsl.g:508:2: ( ( rule__NombreAmbiente__Alternatives ) )
            // InternalMyDsl.g:509:3: ( rule__NombreAmbiente__Alternatives )
            {
             before(grammarAccess.getNombreAmbienteAccess().getAlternatives()); 
            // InternalMyDsl.g:510:3: ( rule__NombreAmbiente__Alternatives )
            // InternalMyDsl.g:510:4: rule__NombreAmbiente__Alternatives
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
    // InternalMyDsl.g:519:1: ruleTamanioServidor : ( ( rule__TamanioServidor__Alternatives ) ) ;
    public final void ruleTamanioServidor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( ( ( rule__TamanioServidor__Alternatives ) ) )
            // InternalMyDsl.g:524:2: ( ( rule__TamanioServidor__Alternatives ) )
            {
            // InternalMyDsl.g:524:2: ( ( rule__TamanioServidor__Alternatives ) )
            // InternalMyDsl.g:525:3: ( rule__TamanioServidor__Alternatives )
            {
             before(grammarAccess.getTamanioServidorAccess().getAlternatives()); 
            // InternalMyDsl.g:526:3: ( rule__TamanioServidor__Alternatives )
            // InternalMyDsl.g:526:4: rule__TamanioServidor__Alternatives
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
    // InternalMyDsl.g:535:1: ruleSistemaOperativo : ( ( rule__SistemaOperativo__Alternatives ) ) ;
    public final void ruleSistemaOperativo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( ( rule__SistemaOperativo__Alternatives ) ) )
            // InternalMyDsl.g:540:2: ( ( rule__SistemaOperativo__Alternatives ) )
            {
            // InternalMyDsl.g:540:2: ( ( rule__SistemaOperativo__Alternatives ) )
            // InternalMyDsl.g:541:3: ( rule__SistemaOperativo__Alternatives )
            {
             before(grammarAccess.getSistemaOperativoAccess().getAlternatives()); 
            // InternalMyDsl.g:542:3: ( rule__SistemaOperativo__Alternatives )
            // InternalMyDsl.g:542:4: rule__SistemaOperativo__Alternatives
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
    // InternalMyDsl.g:551:1: ruleManejadorSQL : ( ( rule__ManejadorSQL__Alternatives ) ) ;
    public final void ruleManejadorSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( ( ( rule__ManejadorSQL__Alternatives ) ) )
            // InternalMyDsl.g:556:2: ( ( rule__ManejadorSQL__Alternatives ) )
            {
            // InternalMyDsl.g:556:2: ( ( rule__ManejadorSQL__Alternatives ) )
            // InternalMyDsl.g:557:3: ( rule__ManejadorSQL__Alternatives )
            {
             before(grammarAccess.getManejadorSQLAccess().getAlternatives()); 
            // InternalMyDsl.g:558:3: ( rule__ManejadorSQL__Alternatives )
            // InternalMyDsl.g:558:4: rule__ManejadorSQL__Alternatives
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
    // InternalMyDsl.g:567:1: ruleManejadorNoSQL : ( ( rule__ManejadorNoSQL__Alternatives ) ) ;
    public final void ruleManejadorNoSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( rule__ManejadorNoSQL__Alternatives ) ) )
            // InternalMyDsl.g:572:2: ( ( rule__ManejadorNoSQL__Alternatives ) )
            {
            // InternalMyDsl.g:572:2: ( ( rule__ManejadorNoSQL__Alternatives ) )
            // InternalMyDsl.g:573:3: ( rule__ManejadorNoSQL__Alternatives )
            {
             before(grammarAccess.getManejadorNoSQLAccess().getAlternatives()); 
            // InternalMyDsl.g:574:3: ( rule__ManejadorNoSQL__Alternatives )
            // InternalMyDsl.g:574:4: rule__ManejadorNoSQL__Alternatives
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
    // InternalMyDsl.g:583:1: ruleProtocolo : ( ( rule__Protocolo__Alternatives ) ) ;
    public final void ruleProtocolo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( ( rule__Protocolo__Alternatives ) ) )
            // InternalMyDsl.g:588:2: ( ( rule__Protocolo__Alternatives ) )
            {
            // InternalMyDsl.g:588:2: ( ( rule__Protocolo__Alternatives ) )
            // InternalMyDsl.g:589:3: ( rule__Protocolo__Alternatives )
            {
             before(grammarAccess.getProtocoloAccess().getAlternatives()); 
            // InternalMyDsl.g:590:3: ( rule__Protocolo__Alternatives )
            // InternalMyDsl.g:590:4: rule__Protocolo__Alternatives
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
    // InternalMyDsl.g:598:1: rule__ParametroConexion__Alternatives : ( ( ruleUsuarioPassword ) | ( ruleLlave ) );
    public final void rule__ParametroConexion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( ruleUsuarioPassword ) | ( ruleLlave ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==42) ) {
                alt1=1;
            }
            else if ( (LA1_0==44) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:603:2: ( ruleUsuarioPassword )
                    {
                    // InternalMyDsl.g:603:2: ( ruleUsuarioPassword )
                    // InternalMyDsl.g:604:3: ruleUsuarioPassword
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
                    // InternalMyDsl.g:609:2: ( ruleLlave )
                    {
                    // InternalMyDsl.g:609:2: ( ruleLlave )
                    // InternalMyDsl.g:610:3: ruleLlave
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
    // InternalMyDsl.g:619:1: rule__Recurso__Alternatives : ( ( ruleServidorAplicaciones ) | ( ruleServidorAlmacenamiento ) | ( ruleBaseDatosSQL ) | ( ruleBaseDatosNoSQL ) );
    public final void rule__Recurso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ruleServidorAplicaciones ) | ( ruleServidorAlmacenamiento ) | ( ruleBaseDatosSQL ) | ( ruleBaseDatosNoSQL ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt2=1;
                }
                break;
            case 54:
                {
                alt2=2;
                }
                break;
            case 56:
                {
                alt2=3;
                }
                break;
            case 58:
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
                    // InternalMyDsl.g:624:2: ( ruleServidorAplicaciones )
                    {
                    // InternalMyDsl.g:624:2: ( ruleServidorAplicaciones )
                    // InternalMyDsl.g:625:3: ruleServidorAplicaciones
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
                    // InternalMyDsl.g:630:2: ( ruleServidorAlmacenamiento )
                    {
                    // InternalMyDsl.g:630:2: ( ruleServidorAlmacenamiento )
                    // InternalMyDsl.g:631:3: ruleServidorAlmacenamiento
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
                    // InternalMyDsl.g:636:2: ( ruleBaseDatosSQL )
                    {
                    // InternalMyDsl.g:636:2: ( ruleBaseDatosSQL )
                    // InternalMyDsl.g:637:3: ruleBaseDatosSQL
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
                    // InternalMyDsl.g:642:2: ( ruleBaseDatosNoSQL )
                    {
                    // InternalMyDsl.g:642:2: ( ruleBaseDatosNoSQL )
                    // InternalMyDsl.g:643:3: ruleBaseDatosNoSQL
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:652:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:657:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:657:2: ( RULE_STRING )
                    // InternalMyDsl.g:658:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:663:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:663:2: ( RULE_ID )
                    // InternalMyDsl.g:664:3: RULE_ID
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
    // InternalMyDsl.g:673:1: rule__NombreAmbiente__Alternatives : ( ( ( 'DESARROLLO' ) ) | ( ( 'PRUEBAS' ) ) | ( ( 'QA' ) ) | ( ( 'PRODUCCION' ) ) );
    public final void rule__NombreAmbiente__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ( 'DESARROLLO' ) ) | ( ( 'PRUEBAS' ) ) | ( ( 'QA' ) ) | ( ( 'PRODUCCION' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:678:2: ( ( 'DESARROLLO' ) )
                    {
                    // InternalMyDsl.g:678:2: ( ( 'DESARROLLO' ) )
                    // InternalMyDsl.g:679:3: ( 'DESARROLLO' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:680:3: ( 'DESARROLLO' )
                    // InternalMyDsl.g:680:4: 'DESARROLLO'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:684:2: ( ( 'PRUEBAS' ) )
                    {
                    // InternalMyDsl.g:684:2: ( ( 'PRUEBAS' ) )
                    // InternalMyDsl.g:685:3: ( 'PRUEBAS' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:686:3: ( 'PRUEBAS' )
                    // InternalMyDsl.g:686:4: 'PRUEBAS'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:690:2: ( ( 'QA' ) )
                    {
                    // InternalMyDsl.g:690:2: ( ( 'QA' ) )
                    // InternalMyDsl.g:691:3: ( 'QA' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:692:3: ( 'QA' )
                    // InternalMyDsl.g:692:4: 'QA'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:696:2: ( ( 'PRODUCCION' ) )
                    {
                    // InternalMyDsl.g:696:2: ( ( 'PRODUCCION' ) )
                    // InternalMyDsl.g:697:3: ( 'PRODUCCION' )
                    {
                     before(grammarAccess.getNombreAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:698:3: ( 'PRODUCCION' )
                    // InternalMyDsl.g:698:4: 'PRODUCCION'
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
    // InternalMyDsl.g:706:1: rule__TamanioServidor__Alternatives : ( ( ( 'MICRO' ) ) | ( ( 'SMALL' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LARGE' ) ) );
    public final void rule__TamanioServidor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( ( 'MICRO' ) ) | ( ( 'SMALL' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LARGE' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
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
                    // InternalMyDsl.g:711:2: ( ( 'MICRO' ) )
                    {
                    // InternalMyDsl.g:711:2: ( ( 'MICRO' ) )
                    // InternalMyDsl.g:712:3: ( 'MICRO' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:713:3: ( 'MICRO' )
                    // InternalMyDsl.g:713:4: 'MICRO'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:717:2: ( ( 'SMALL' ) )
                    {
                    // InternalMyDsl.g:717:2: ( ( 'SMALL' ) )
                    // InternalMyDsl.g:718:3: ( 'SMALL' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:719:3: ( 'SMALL' )
                    // InternalMyDsl.g:719:4: 'SMALL'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:723:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalMyDsl.g:723:2: ( ( 'MEDIUM' ) )
                    // InternalMyDsl.g:724:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:725:3: ( 'MEDIUM' )
                    // InternalMyDsl.g:725:4: 'MEDIUM'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:729:2: ( ( 'LARGE' ) )
                    {
                    // InternalMyDsl.g:729:2: ( ( 'LARGE' ) )
                    // InternalMyDsl.g:730:3: ( 'LARGE' )
                    {
                     before(grammarAccess.getTamanioServidorAccess().getLARGEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:731:3: ( 'LARGE' )
                    // InternalMyDsl.g:731:4: 'LARGE'
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
    // InternalMyDsl.g:739:1: rule__SistemaOperativo__Alternatives : ( ( ( 'Windows' ) ) | ( ( 'Ubuntu1804' ) ) );
    public final void rule__SistemaOperativo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( ( ( 'Windows' ) ) | ( ( 'Ubuntu1804' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:744:2: ( ( 'Windows' ) )
                    {
                    // InternalMyDsl.g:744:2: ( ( 'Windows' ) )
                    // InternalMyDsl.g:745:3: ( 'Windows' )
                    {
                     before(grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:746:3: ( 'Windows' )
                    // InternalMyDsl.g:746:4: 'Windows'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:750:2: ( ( 'Ubuntu1804' ) )
                    {
                    // InternalMyDsl.g:750:2: ( ( 'Ubuntu1804' ) )
                    // InternalMyDsl.g:751:3: ( 'Ubuntu1804' )
                    {
                     before(grammarAccess.getSistemaOperativoAccess().getUbuntu1804EnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:752:3: ( 'Ubuntu1804' )
                    // InternalMyDsl.g:752:4: 'Ubuntu1804'
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
    // InternalMyDsl.g:760:1: rule__ManejadorSQL__Alternatives : ( ( ( 'POSTGRESQL' ) ) | ( ( 'MYSQL' ) ) | ( ( 'ORACLE' ) ) | ( ( 'SQLSERVER' ) ) );
    public final void rule__ManejadorSQL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( ( ( 'POSTGRESQL' ) ) | ( ( 'MYSQL' ) ) | ( ( 'ORACLE' ) ) | ( ( 'SQLSERVER' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:765:2: ( ( 'POSTGRESQL' ) )
                    {
                    // InternalMyDsl.g:765:2: ( ( 'POSTGRESQL' ) )
                    // InternalMyDsl.g:766:3: ( 'POSTGRESQL' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:767:3: ( 'POSTGRESQL' )
                    // InternalMyDsl.g:767:4: 'POSTGRESQL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:771:2: ( ( 'MYSQL' ) )
                    {
                    // InternalMyDsl.g:771:2: ( ( 'MYSQL' ) )
                    // InternalMyDsl.g:772:3: ( 'MYSQL' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:773:3: ( 'MYSQL' )
                    // InternalMyDsl.g:773:4: 'MYSQL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:777:2: ( ( 'ORACLE' ) )
                    {
                    // InternalMyDsl.g:777:2: ( ( 'ORACLE' ) )
                    // InternalMyDsl.g:778:3: ( 'ORACLE' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:779:3: ( 'ORACLE' )
                    // InternalMyDsl.g:779:4: 'ORACLE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:783:2: ( ( 'SQLSERVER' ) )
                    {
                    // InternalMyDsl.g:783:2: ( ( 'SQLSERVER' ) )
                    // InternalMyDsl.g:784:3: ( 'SQLSERVER' )
                    {
                     before(grammarAccess.getManejadorSQLAccess().getSQLSERVEREnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:785:3: ( 'SQLSERVER' )
                    // InternalMyDsl.g:785:4: 'SQLSERVER'
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
    // InternalMyDsl.g:793:1: rule__ManejadorNoSQL__Alternatives : ( ( ( 'MONGODB' ) ) | ( ( 'CASSANDRA' ) ) );
    public final void rule__ManejadorNoSQL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( ( ( 'MONGODB' ) ) | ( ( 'CASSANDRA' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:798:2: ( ( 'MONGODB' ) )
                    {
                    // InternalMyDsl.g:798:2: ( ( 'MONGODB' ) )
                    // InternalMyDsl.g:799:3: ( 'MONGODB' )
                    {
                     before(grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:800:3: ( 'MONGODB' )
                    // InternalMyDsl.g:800:4: 'MONGODB'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:804:2: ( ( 'CASSANDRA' ) )
                    {
                    // InternalMyDsl.g:804:2: ( ( 'CASSANDRA' ) )
                    // InternalMyDsl.g:805:3: ( 'CASSANDRA' )
                    {
                     before(grammarAccess.getManejadorNoSQLAccess().getCASSANDRAEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:806:3: ( 'CASSANDRA' )
                    // InternalMyDsl.g:806:4: 'CASSANDRA'
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
    // InternalMyDsl.g:814:1: rule__Protocolo__Alternatives : ( ( ( 'TCP' ) ) | ( ( 'UDP' ) ) );
    public final void rule__Protocolo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( ( 'TCP' ) ) | ( ( 'UDP' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:819:2: ( ( 'TCP' ) )
                    {
                    // InternalMyDsl.g:819:2: ( ( 'TCP' ) )
                    // InternalMyDsl.g:820:3: ( 'TCP' )
                    {
                     before(grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:821:3: ( 'TCP' )
                    // InternalMyDsl.g:821:4: 'TCP'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:825:2: ( ( 'UDP' ) )
                    {
                    // InternalMyDsl.g:825:2: ( ( 'UDP' ) )
                    // InternalMyDsl.g:826:3: ( 'UDP' )
                    {
                     before(grammarAccess.getProtocoloAccess().getUDPEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:827:3: ( 'UDP' )
                    // InternalMyDsl.g:827:4: 'UDP'
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
    // InternalMyDsl.g:835:1: rule__Infraestructura__Group__0 : rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 ;
    public final void rule__Infraestructura__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 )
            // InternalMyDsl.g:840:2: rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1
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
    // InternalMyDsl.g:847:1: rule__Infraestructura__Group__0__Impl : ( 'Infraestructura' ) ;
    public final void rule__Infraestructura__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( ( 'Infraestructura' ) )
            // InternalMyDsl.g:852:1: ( 'Infraestructura' )
            {
            // InternalMyDsl.g:852:1: ( 'Infraestructura' )
            // InternalMyDsl.g:853:2: 'Infraestructura'
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
    // InternalMyDsl.g:862:1: rule__Infraestructura__Group__1 : rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 ;
    public final void rule__Infraestructura__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 )
            // InternalMyDsl.g:867:2: rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2
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
    // InternalMyDsl.g:874:1: rule__Infraestructura__Group__1__Impl : ( ( rule__Infraestructura__NombreAssignment_1 ) ) ;
    public final void rule__Infraestructura__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( ( ( rule__Infraestructura__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:879:1: ( ( rule__Infraestructura__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:879:1: ( ( rule__Infraestructura__NombreAssignment_1 ) )
            // InternalMyDsl.g:880:2: ( rule__Infraestructura__NombreAssignment_1 )
            {
             before(grammarAccess.getInfraestructuraAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:881:2: ( rule__Infraestructura__NombreAssignment_1 )
            // InternalMyDsl.g:881:3: rule__Infraestructura__NombreAssignment_1
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
    // InternalMyDsl.g:889:1: rule__Infraestructura__Group__2 : rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 ;
    public final void rule__Infraestructura__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 )
            // InternalMyDsl.g:894:2: rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3
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
    // InternalMyDsl.g:901:1: rule__Infraestructura__Group__2__Impl : ( '{' ) ;
    public final void rule__Infraestructura__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( ( '{' ) )
            // InternalMyDsl.g:906:1: ( '{' )
            {
            // InternalMyDsl.g:906:1: ( '{' )
            // InternalMyDsl.g:907:2: '{'
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
    // InternalMyDsl.g:916:1: rule__Infraestructura__Group__3 : rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4 ;
    public final void rule__Infraestructura__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4 )
            // InternalMyDsl.g:921:2: rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4
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
    // InternalMyDsl.g:928:1: rule__Infraestructura__Group__3__Impl : ( ( rule__Infraestructura__ProveedorAssignment_3 ) ) ;
    public final void rule__Infraestructura__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( ( rule__Infraestructura__ProveedorAssignment_3 ) ) )
            // InternalMyDsl.g:933:1: ( ( rule__Infraestructura__ProveedorAssignment_3 ) )
            {
            // InternalMyDsl.g:933:1: ( ( rule__Infraestructura__ProveedorAssignment_3 ) )
            // InternalMyDsl.g:934:2: ( rule__Infraestructura__ProveedorAssignment_3 )
            {
             before(grammarAccess.getInfraestructuraAccess().getProveedorAssignment_3()); 
            // InternalMyDsl.g:935:2: ( rule__Infraestructura__ProveedorAssignment_3 )
            // InternalMyDsl.g:935:3: rule__Infraestructura__ProveedorAssignment_3
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
    // InternalMyDsl.g:943:1: rule__Infraestructura__Group__4 : rule__Infraestructura__Group__4__Impl ;
    public final void rule__Infraestructura__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( rule__Infraestructura__Group__4__Impl )
            // InternalMyDsl.g:948:2: rule__Infraestructura__Group__4__Impl
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
    // InternalMyDsl.g:954:1: rule__Infraestructura__Group__4__Impl : ( '}' ) ;
    public final void rule__Infraestructura__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( '}' ) )
            // InternalMyDsl.g:959:1: ( '}' )
            {
            // InternalMyDsl.g:959:1: ( '}' )
            // InternalMyDsl.g:960:2: '}'
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
    // InternalMyDsl.g:970:1: rule__Proveedor__Group__0 : rule__Proveedor__Group__0__Impl rule__Proveedor__Group__1 ;
    public final void rule__Proveedor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( rule__Proveedor__Group__0__Impl rule__Proveedor__Group__1 )
            // InternalMyDsl.g:975:2: rule__Proveedor__Group__0__Impl rule__Proveedor__Group__1
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
    // InternalMyDsl.g:982:1: rule__Proveedor__Group__0__Impl : ( 'Tipo' ) ;
    public final void rule__Proveedor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( ( 'Tipo' ) )
            // InternalMyDsl.g:987:1: ( 'Tipo' )
            {
            // InternalMyDsl.g:987:1: ( 'Tipo' )
            // InternalMyDsl.g:988:2: 'Tipo'
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
    // InternalMyDsl.g:997:1: rule__Proveedor__Group__1 : rule__Proveedor__Group__1__Impl rule__Proveedor__Group__2 ;
    public final void rule__Proveedor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( rule__Proveedor__Group__1__Impl rule__Proveedor__Group__2 )
            // InternalMyDsl.g:1002:2: rule__Proveedor__Group__1__Impl rule__Proveedor__Group__2
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
    // InternalMyDsl.g:1009:1: rule__Proveedor__Group__1__Impl : ( '=' ) ;
    public final void rule__Proveedor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( ( '=' ) )
            // InternalMyDsl.g:1014:1: ( '=' )
            {
            // InternalMyDsl.g:1014:1: ( '=' )
            // InternalMyDsl.g:1015:2: '='
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
    // InternalMyDsl.g:1024:1: rule__Proveedor__Group__2 : rule__Proveedor__Group__2__Impl rule__Proveedor__Group__3 ;
    public final void rule__Proveedor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( rule__Proveedor__Group__2__Impl rule__Proveedor__Group__3 )
            // InternalMyDsl.g:1029:2: rule__Proveedor__Group__2__Impl rule__Proveedor__Group__3
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
    // InternalMyDsl.g:1036:1: rule__Proveedor__Group__2__Impl : ( ( rule__Proveedor__NombreAssignment_2 ) ) ;
    public final void rule__Proveedor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( ( rule__Proveedor__NombreAssignment_2 ) ) )
            // InternalMyDsl.g:1041:1: ( ( rule__Proveedor__NombreAssignment_2 ) )
            {
            // InternalMyDsl.g:1041:1: ( ( rule__Proveedor__NombreAssignment_2 ) )
            // InternalMyDsl.g:1042:2: ( rule__Proveedor__NombreAssignment_2 )
            {
             before(grammarAccess.getProveedorAccess().getNombreAssignment_2()); 
            // InternalMyDsl.g:1043:2: ( rule__Proveedor__NombreAssignment_2 )
            // InternalMyDsl.g:1043:3: rule__Proveedor__NombreAssignment_2
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
    // InternalMyDsl.g:1051:1: rule__Proveedor__Group__3 : rule__Proveedor__Group__3__Impl rule__Proveedor__Group__4 ;
    public final void rule__Proveedor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( rule__Proveedor__Group__3__Impl rule__Proveedor__Group__4 )
            // InternalMyDsl.g:1056:2: rule__Proveedor__Group__3__Impl rule__Proveedor__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1063:1: rule__Proveedor__Group__3__Impl : ( ';' ) ;
    public final void rule__Proveedor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1067:1: ( ( ';' ) )
            // InternalMyDsl.g:1068:1: ( ';' )
            {
            // InternalMyDsl.g:1068:1: ( ';' )
            // InternalMyDsl.g:1069:2: ';'
            {
             before(grammarAccess.getProveedorAccess().getSemicolonKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1078:1: rule__Proveedor__Group__4 : rule__Proveedor__Group__4__Impl rule__Proveedor__Group__5 ;
    public final void rule__Proveedor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( rule__Proveedor__Group__4__Impl rule__Proveedor__Group__5 )
            // InternalMyDsl.g:1083:2: rule__Proveedor__Group__4__Impl rule__Proveedor__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1090:1: rule__Proveedor__Group__4__Impl : ( ( rule__Proveedor__ParametroConexionAssignment_4 ) ) ;
    public final void rule__Proveedor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( ( ( rule__Proveedor__ParametroConexionAssignment_4 ) ) )
            // InternalMyDsl.g:1095:1: ( ( rule__Proveedor__ParametroConexionAssignment_4 ) )
            {
            // InternalMyDsl.g:1095:1: ( ( rule__Proveedor__ParametroConexionAssignment_4 ) )
            // InternalMyDsl.g:1096:2: ( rule__Proveedor__ParametroConexionAssignment_4 )
            {
             before(grammarAccess.getProveedorAccess().getParametroConexionAssignment_4()); 
            // InternalMyDsl.g:1097:2: ( rule__Proveedor__ParametroConexionAssignment_4 )
            // InternalMyDsl.g:1097:3: rule__Proveedor__ParametroConexionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__ParametroConexionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getParametroConexionAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1105:1: rule__Proveedor__Group__5 : rule__Proveedor__Group__5__Impl rule__Proveedor__Group__6 ;
    public final void rule__Proveedor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( rule__Proveedor__Group__5__Impl rule__Proveedor__Group__6 )
            // InternalMyDsl.g:1110:2: rule__Proveedor__Group__5__Impl rule__Proveedor__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1117:1: rule__Proveedor__Group__5__Impl : ( 'Ambientes' ) ;
    public final void rule__Proveedor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( ( 'Ambientes' ) )
            // InternalMyDsl.g:1122:1: ( 'Ambientes' )
            {
            // InternalMyDsl.g:1122:1: ( 'Ambientes' )
            // InternalMyDsl.g:1123:2: 'Ambientes'
            {
             before(grammarAccess.getProveedorAccess().getAmbientesKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getAmbientesKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1132:1: rule__Proveedor__Group__6 : rule__Proveedor__Group__6__Impl rule__Proveedor__Group__7 ;
    public final void rule__Proveedor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( rule__Proveedor__Group__6__Impl rule__Proveedor__Group__7 )
            // InternalMyDsl.g:1137:2: rule__Proveedor__Group__6__Impl rule__Proveedor__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Proveedor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__7();

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
    // InternalMyDsl.g:1144:1: rule__Proveedor__Group__6__Impl : ( '=' ) ;
    public final void rule__Proveedor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( ( '=' ) )
            // InternalMyDsl.g:1149:1: ( '=' )
            {
            // InternalMyDsl.g:1149:1: ( '=' )
            // InternalMyDsl.g:1150:2: '='
            {
             before(grammarAccess.getProveedorAccess().getEqualsSignKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Proveedor__Group__7"
    // InternalMyDsl.g:1159:1: rule__Proveedor__Group__7 : rule__Proveedor__Group__7__Impl rule__Proveedor__Group__8 ;
    public final void rule__Proveedor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( rule__Proveedor__Group__7__Impl rule__Proveedor__Group__8 )
            // InternalMyDsl.g:1164:2: rule__Proveedor__Group__7__Impl rule__Proveedor__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Proveedor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__8();

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
    // $ANTLR end "rule__Proveedor__Group__7"


    // $ANTLR start "rule__Proveedor__Group__7__Impl"
    // InternalMyDsl.g:1171:1: rule__Proveedor__Group__7__Impl : ( '[' ) ;
    public final void rule__Proveedor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( ( '[' ) )
            // InternalMyDsl.g:1176:1: ( '[' )
            {
            // InternalMyDsl.g:1176:1: ( '[' )
            // InternalMyDsl.g:1177:2: '['
            {
             before(grammarAccess.getProveedorAccess().getLeftSquareBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__7__Impl"


    // $ANTLR start "rule__Proveedor__Group__8"
    // InternalMyDsl.g:1186:1: rule__Proveedor__Group__8 : rule__Proveedor__Group__8__Impl rule__Proveedor__Group__9 ;
    public final void rule__Proveedor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( rule__Proveedor__Group__8__Impl rule__Proveedor__Group__9 )
            // InternalMyDsl.g:1191:2: rule__Proveedor__Group__8__Impl rule__Proveedor__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Proveedor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__9();

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
    // $ANTLR end "rule__Proveedor__Group__8"


    // $ANTLR start "rule__Proveedor__Group__8__Impl"
    // InternalMyDsl.g:1198:1: rule__Proveedor__Group__8__Impl : ( ( rule__Proveedor__AmbientesDespliegueAssignment_8 ) ) ;
    public final void rule__Proveedor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( ( ( rule__Proveedor__AmbientesDespliegueAssignment_8 ) ) )
            // InternalMyDsl.g:1203:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_8 ) )
            {
            // InternalMyDsl.g:1203:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_8 ) )
            // InternalMyDsl.g:1204:2: ( rule__Proveedor__AmbientesDespliegueAssignment_8 )
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_8()); 
            // InternalMyDsl.g:1205:2: ( rule__Proveedor__AmbientesDespliegueAssignment_8 )
            // InternalMyDsl.g:1205:3: rule__Proveedor__AmbientesDespliegueAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__AmbientesDespliegueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__8__Impl"


    // $ANTLR start "rule__Proveedor__Group__9"
    // InternalMyDsl.g:1213:1: rule__Proveedor__Group__9 : rule__Proveedor__Group__9__Impl rule__Proveedor__Group__10 ;
    public final void rule__Proveedor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( rule__Proveedor__Group__9__Impl rule__Proveedor__Group__10 )
            // InternalMyDsl.g:1218:2: rule__Proveedor__Group__9__Impl rule__Proveedor__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Proveedor__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__10();

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
    // $ANTLR end "rule__Proveedor__Group__9"


    // $ANTLR start "rule__Proveedor__Group__9__Impl"
    // InternalMyDsl.g:1225:1: rule__Proveedor__Group__9__Impl : ( ( rule__Proveedor__Group_9__0 )* ) ;
    public final void rule__Proveedor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( ( ( rule__Proveedor__Group_9__0 )* ) )
            // InternalMyDsl.g:1230:1: ( ( rule__Proveedor__Group_9__0 )* )
            {
            // InternalMyDsl.g:1230:1: ( ( rule__Proveedor__Group_9__0 )* )
            // InternalMyDsl.g:1231:2: ( rule__Proveedor__Group_9__0 )*
            {
             before(grammarAccess.getProveedorAccess().getGroup_9()); 
            // InternalMyDsl.g:1232:2: ( rule__Proveedor__Group_9__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1232:3: rule__Proveedor__Group_9__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Proveedor__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProveedorAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__9__Impl"


    // $ANTLR start "rule__Proveedor__Group__10"
    // InternalMyDsl.g:1240:1: rule__Proveedor__Group__10 : rule__Proveedor__Group__10__Impl ;
    public final void rule__Proveedor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( rule__Proveedor__Group__10__Impl )
            // InternalMyDsl.g:1245:2: rule__Proveedor__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__Group__10__Impl();

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
    // $ANTLR end "rule__Proveedor__Group__10"


    // $ANTLR start "rule__Proveedor__Group__10__Impl"
    // InternalMyDsl.g:1251:1: rule__Proveedor__Group__10__Impl : ( ']' ) ;
    public final void rule__Proveedor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( ']' ) )
            // InternalMyDsl.g:1256:1: ( ']' )
            {
            // InternalMyDsl.g:1256:1: ( ']' )
            // InternalMyDsl.g:1257:2: ']'
            {
             before(grammarAccess.getProveedorAccess().getRightSquareBracketKeyword_10()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group__10__Impl"


    // $ANTLR start "rule__Proveedor__Group_9__0"
    // InternalMyDsl.g:1267:1: rule__Proveedor__Group_9__0 : rule__Proveedor__Group_9__0__Impl rule__Proveedor__Group_9__1 ;
    public final void rule__Proveedor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( rule__Proveedor__Group_9__0__Impl rule__Proveedor__Group_9__1 )
            // InternalMyDsl.g:1272:2: rule__Proveedor__Group_9__0__Impl rule__Proveedor__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Proveedor__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_9__1();

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
    // $ANTLR end "rule__Proveedor__Group_9__0"


    // $ANTLR start "rule__Proveedor__Group_9__0__Impl"
    // InternalMyDsl.g:1279:1: rule__Proveedor__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Proveedor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( ( ',' ) )
            // InternalMyDsl.g:1284:1: ( ',' )
            {
            // InternalMyDsl.g:1284:1: ( ',' )
            // InternalMyDsl.g:1285:2: ','
            {
             before(grammarAccess.getProveedorAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProveedorAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_9__0__Impl"


    // $ANTLR start "rule__Proveedor__Group_9__1"
    // InternalMyDsl.g:1294:1: rule__Proveedor__Group_9__1 : rule__Proveedor__Group_9__1__Impl ;
    public final void rule__Proveedor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( rule__Proveedor__Group_9__1__Impl )
            // InternalMyDsl.g:1299:2: rule__Proveedor__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__Group_9__1__Impl();

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
    // $ANTLR end "rule__Proveedor__Group_9__1"


    // $ANTLR start "rule__Proveedor__Group_9__1__Impl"
    // InternalMyDsl.g:1305:1: rule__Proveedor__Group_9__1__Impl : ( ( rule__Proveedor__AmbientesDespliegueAssignment_9_1 ) ) ;
    public final void rule__Proveedor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( ( rule__Proveedor__AmbientesDespliegueAssignment_9_1 ) ) )
            // InternalMyDsl.g:1310:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_9_1 ) )
            {
            // InternalMyDsl.g:1310:1: ( ( rule__Proveedor__AmbientesDespliegueAssignment_9_1 ) )
            // InternalMyDsl.g:1311:2: ( rule__Proveedor__AmbientesDespliegueAssignment_9_1 )
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_9_1()); 
            // InternalMyDsl.g:1312:2: ( rule__Proveedor__AmbientesDespliegueAssignment_9_1 )
            // InternalMyDsl.g:1312:3: rule__Proveedor__AmbientesDespliegueAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Proveedor__AmbientesDespliegueAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__Group_9__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__0"
    // InternalMyDsl.g:1321:1: rule__AmbienteDespliegue__Group__0 : rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1 ;
    public final void rule__AmbienteDespliegue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1 )
            // InternalMyDsl.g:1326:2: rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1333:1: rule__AmbienteDespliegue__Group__0__Impl : ( '{' ) ;
    public final void rule__AmbienteDespliegue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( ( '{' ) )
            // InternalMyDsl.g:1338:1: ( '{' )
            {
            // InternalMyDsl.g:1338:1: ( '{' )
            // InternalMyDsl.g:1339:2: '{'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__1"
    // InternalMyDsl.g:1348:1: rule__AmbienteDespliegue__Group__1 : rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2 ;
    public final void rule__AmbienteDespliegue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2 )
            // InternalMyDsl.g:1353:2: rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1360:1: rule__AmbienteDespliegue__Group__1__Impl : ( 'nombre' ) ;
    public final void rule__AmbienteDespliegue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:1365:1: ( 'nombre' )
            {
            // InternalMyDsl.g:1365:1: ( 'nombre' )
            // InternalMyDsl.g:1366:2: 'nombre'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getNombreKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getNombreKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1375:1: rule__AmbienteDespliegue__Group__2 : rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3 ;
    public final void rule__AmbienteDespliegue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3 )
            // InternalMyDsl.g:1380:2: rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1387:1: rule__AmbienteDespliegue__Group__2__Impl : ( '=' ) ;
    public final void rule__AmbienteDespliegue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( '=' ) )
            // InternalMyDsl.g:1392:1: ( '=' )
            {
            // InternalMyDsl.g:1392:1: ( '=' )
            // InternalMyDsl.g:1393:2: '='
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:1402:1: rule__AmbienteDespliegue__Group__3 : rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4 ;
    public final void rule__AmbienteDespliegue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4 )
            // InternalMyDsl.g:1407:2: rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1414:1: rule__AmbienteDespliegue__Group__3__Impl : ( ( rule__AmbienteDespliegue__NombreAssignment_3 ) ) ;
    public final void rule__AmbienteDespliegue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( ( rule__AmbienteDespliegue__NombreAssignment_3 ) ) )
            // InternalMyDsl.g:1419:1: ( ( rule__AmbienteDespliegue__NombreAssignment_3 ) )
            {
            // InternalMyDsl.g:1419:1: ( ( rule__AmbienteDespliegue__NombreAssignment_3 ) )
            // InternalMyDsl.g:1420:2: ( rule__AmbienteDespliegue__NombreAssignment_3 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getNombreAssignment_3()); 
            // InternalMyDsl.g:1421:2: ( rule__AmbienteDespliegue__NombreAssignment_3 )
            // InternalMyDsl.g:1421:3: rule__AmbienteDespliegue__NombreAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__NombreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getNombreAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1429:1: rule__AmbienteDespliegue__Group__4 : rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5 ;
    public final void rule__AmbienteDespliegue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5 )
            // InternalMyDsl.g:1434:2: rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1441:1: rule__AmbienteDespliegue__Group__4__Impl : ( ';' ) ;
    public final void rule__AmbienteDespliegue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( ';' ) )
            // InternalMyDsl.g:1446:1: ( ';' )
            {
            // InternalMyDsl.g:1446:1: ( ';' )
            // InternalMyDsl.g:1447:2: ';'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getSemicolonKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1456:1: rule__AmbienteDespliegue__Group__5 : rule__AmbienteDespliegue__Group__5__Impl rule__AmbienteDespliegue__Group__6 ;
    public final void rule__AmbienteDespliegue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( rule__AmbienteDespliegue__Group__5__Impl rule__AmbienteDespliegue__Group__6 )
            // InternalMyDsl.g:1461:2: rule__AmbienteDespliegue__Group__5__Impl rule__AmbienteDespliegue__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1468:1: rule__AmbienteDespliegue__Group__5__Impl : ( 'vpcs' ) ;
    public final void rule__AmbienteDespliegue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( ( 'vpcs' ) )
            // InternalMyDsl.g:1473:1: ( 'vpcs' )
            {
            // InternalMyDsl.g:1473:1: ( 'vpcs' )
            // InternalMyDsl.g:1474:2: 'vpcs'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcsKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getVpcsKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1483:1: rule__AmbienteDespliegue__Group__6 : rule__AmbienteDespliegue__Group__6__Impl rule__AmbienteDespliegue__Group__7 ;
    public final void rule__AmbienteDespliegue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( rule__AmbienteDespliegue__Group__6__Impl rule__AmbienteDespliegue__Group__7 )
            // InternalMyDsl.g:1488:2: rule__AmbienteDespliegue__Group__6__Impl rule__AmbienteDespliegue__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1495:1: rule__AmbienteDespliegue__Group__6__Impl : ( '=' ) ;
    public final void rule__AmbienteDespliegue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( '=' ) )
            // InternalMyDsl.g:1500:1: ( '=' )
            {
            // InternalMyDsl.g:1500:1: ( '=' )
            // InternalMyDsl.g:1501:2: '='
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:1510:1: rule__AmbienteDespliegue__Group__7 : rule__AmbienteDespliegue__Group__7__Impl rule__AmbienteDespliegue__Group__8 ;
    public final void rule__AmbienteDespliegue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( rule__AmbienteDespliegue__Group__7__Impl rule__AmbienteDespliegue__Group__8 )
            // InternalMyDsl.g:1515:2: rule__AmbienteDespliegue__Group__7__Impl rule__AmbienteDespliegue__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1522:1: rule__AmbienteDespliegue__Group__7__Impl : ( '[' ) ;
    public final void rule__AmbienteDespliegue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( ( '[' ) )
            // InternalMyDsl.g:1527:1: ( '[' )
            {
            // InternalMyDsl.g:1527:1: ( '[' )
            // InternalMyDsl.g:1528:2: '['
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:1537:1: rule__AmbienteDespliegue__Group__8 : rule__AmbienteDespliegue__Group__8__Impl rule__AmbienteDespliegue__Group__9 ;
    public final void rule__AmbienteDespliegue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( rule__AmbienteDespliegue__Group__8__Impl rule__AmbienteDespliegue__Group__9 )
            // InternalMyDsl.g:1542:2: rule__AmbienteDespliegue__Group__8__Impl rule__AmbienteDespliegue__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__AmbienteDespliegue__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__9();

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
    // InternalMyDsl.g:1549:1: rule__AmbienteDespliegue__Group__8__Impl : ( ( rule__AmbienteDespliegue__VpcAssignment_8 ) ) ;
    public final void rule__AmbienteDespliegue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( ( rule__AmbienteDespliegue__VpcAssignment_8 ) ) )
            // InternalMyDsl.g:1554:1: ( ( rule__AmbienteDespliegue__VpcAssignment_8 ) )
            {
            // InternalMyDsl.g:1554:1: ( ( rule__AmbienteDespliegue__VpcAssignment_8 ) )
            // InternalMyDsl.g:1555:2: ( rule__AmbienteDespliegue__VpcAssignment_8 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_8()); 
            // InternalMyDsl.g:1556:2: ( rule__AmbienteDespliegue__VpcAssignment_8 )
            // InternalMyDsl.g:1556:3: rule__AmbienteDespliegue__VpcAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__VpcAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__AmbienteDespliegue__Group__9"
    // InternalMyDsl.g:1564:1: rule__AmbienteDespliegue__Group__9 : rule__AmbienteDespliegue__Group__9__Impl rule__AmbienteDespliegue__Group__10 ;
    public final void rule__AmbienteDespliegue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( rule__AmbienteDespliegue__Group__9__Impl rule__AmbienteDespliegue__Group__10 )
            // InternalMyDsl.g:1569:2: rule__AmbienteDespliegue__Group__9__Impl rule__AmbienteDespliegue__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__AmbienteDespliegue__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__10();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__9"


    // $ANTLR start "rule__AmbienteDespliegue__Group__9__Impl"
    // InternalMyDsl.g:1576:1: rule__AmbienteDespliegue__Group__9__Impl : ( ( rule__AmbienteDespliegue__Group_9__0 )* ) ;
    public final void rule__AmbienteDespliegue__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( ( ( rule__AmbienteDespliegue__Group_9__0 )* ) )
            // InternalMyDsl.g:1581:1: ( ( rule__AmbienteDespliegue__Group_9__0 )* )
            {
            // InternalMyDsl.g:1581:1: ( ( rule__AmbienteDespliegue__Group_9__0 )* )
            // InternalMyDsl.g:1582:2: ( rule__AmbienteDespliegue__Group_9__0 )*
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_9()); 
            // InternalMyDsl.g:1583:2: ( rule__AmbienteDespliegue__Group_9__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1583:3: rule__AmbienteDespliegue__Group_9__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AmbienteDespliegue__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__9__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__10"
    // InternalMyDsl.g:1591:1: rule__AmbienteDespliegue__Group__10 : rule__AmbienteDespliegue__Group__10__Impl rule__AmbienteDespliegue__Group__11 ;
    public final void rule__AmbienteDespliegue__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( rule__AmbienteDespliegue__Group__10__Impl rule__AmbienteDespliegue__Group__11 )
            // InternalMyDsl.g:1596:2: rule__AmbienteDespliegue__Group__10__Impl rule__AmbienteDespliegue__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__11();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__10"


    // $ANTLR start "rule__AmbienteDespliegue__Group__10__Impl"
    // InternalMyDsl.g:1603:1: rule__AmbienteDespliegue__Group__10__Impl : ( ']' ) ;
    public final void rule__AmbienteDespliegue__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( ( ']' ) )
            // InternalMyDsl.g:1608:1: ( ']' )
            {
            // InternalMyDsl.g:1608:1: ( ']' )
            // InternalMyDsl.g:1609:2: ']'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_10()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__10__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__11"
    // InternalMyDsl.g:1618:1: rule__AmbienteDespliegue__Group__11 : rule__AmbienteDespliegue__Group__11__Impl rule__AmbienteDespliegue__Group__12 ;
    public final void rule__AmbienteDespliegue__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( rule__AmbienteDespliegue__Group__11__Impl rule__AmbienteDespliegue__Group__12 )
            // InternalMyDsl.g:1623:2: rule__AmbienteDespliegue__Group__11__Impl rule__AmbienteDespliegue__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__AmbienteDespliegue__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__12();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__11"


    // $ANTLR start "rule__AmbienteDespliegue__Group__11__Impl"
    // InternalMyDsl.g:1630:1: rule__AmbienteDespliegue__Group__11__Impl : ( 'recursos' ) ;
    public final void rule__AmbienteDespliegue__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( ( 'recursos' ) )
            // InternalMyDsl.g:1635:1: ( 'recursos' )
            {
            // InternalMyDsl.g:1635:1: ( 'recursos' )
            // InternalMyDsl.g:1636:2: 'recursos'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_11()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__11__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__12"
    // InternalMyDsl.g:1645:1: rule__AmbienteDespliegue__Group__12 : rule__AmbienteDespliegue__Group__12__Impl rule__AmbienteDespliegue__Group__13 ;
    public final void rule__AmbienteDespliegue__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( rule__AmbienteDespliegue__Group__12__Impl rule__AmbienteDespliegue__Group__13 )
            // InternalMyDsl.g:1650:2: rule__AmbienteDespliegue__Group__12__Impl rule__AmbienteDespliegue__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__AmbienteDespliegue__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__13();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__12"


    // $ANTLR start "rule__AmbienteDespliegue__Group__12__Impl"
    // InternalMyDsl.g:1657:1: rule__AmbienteDespliegue__Group__12__Impl : ( '=' ) ;
    public final void rule__AmbienteDespliegue__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( ( '=' ) )
            // InternalMyDsl.g:1662:1: ( '=' )
            {
            // InternalMyDsl.g:1662:1: ( '=' )
            // InternalMyDsl.g:1663:2: '='
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__12__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__13"
    // InternalMyDsl.g:1672:1: rule__AmbienteDespliegue__Group__13 : rule__AmbienteDespliegue__Group__13__Impl rule__AmbienteDespliegue__Group__14 ;
    public final void rule__AmbienteDespliegue__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( rule__AmbienteDespliegue__Group__13__Impl rule__AmbienteDespliegue__Group__14 )
            // InternalMyDsl.g:1677:2: rule__AmbienteDespliegue__Group__13__Impl rule__AmbienteDespliegue__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__AmbienteDespliegue__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__14();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__13"


    // $ANTLR start "rule__AmbienteDespliegue__Group__13__Impl"
    // InternalMyDsl.g:1684:1: rule__AmbienteDespliegue__Group__13__Impl : ( '[' ) ;
    public final void rule__AmbienteDespliegue__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( ( '[' ) )
            // InternalMyDsl.g:1689:1: ( '[' )
            {
            // InternalMyDsl.g:1689:1: ( '[' )
            // InternalMyDsl.g:1690:2: '['
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_13()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__13__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__14"
    // InternalMyDsl.g:1699:1: rule__AmbienteDespliegue__Group__14 : rule__AmbienteDespliegue__Group__14__Impl rule__AmbienteDespliegue__Group__15 ;
    public final void rule__AmbienteDespliegue__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( rule__AmbienteDespliegue__Group__14__Impl rule__AmbienteDespliegue__Group__15 )
            // InternalMyDsl.g:1704:2: rule__AmbienteDespliegue__Group__14__Impl rule__AmbienteDespliegue__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__AmbienteDespliegue__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__15();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__14"


    // $ANTLR start "rule__AmbienteDespliegue__Group__14__Impl"
    // InternalMyDsl.g:1711:1: rule__AmbienteDespliegue__Group__14__Impl : ( ( rule__AmbienteDespliegue__RecursosAssignment_14 ) ) ;
    public final void rule__AmbienteDespliegue__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( ( ( rule__AmbienteDespliegue__RecursosAssignment_14 ) ) )
            // InternalMyDsl.g:1716:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_14 ) )
            {
            // InternalMyDsl.g:1716:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_14 ) )
            // InternalMyDsl.g:1717:2: ( rule__AmbienteDespliegue__RecursosAssignment_14 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_14()); 
            // InternalMyDsl.g:1718:2: ( rule__AmbienteDespliegue__RecursosAssignment_14 )
            // InternalMyDsl.g:1718:3: rule__AmbienteDespliegue__RecursosAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__RecursosAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__14__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__15"
    // InternalMyDsl.g:1726:1: rule__AmbienteDespliegue__Group__15 : rule__AmbienteDespliegue__Group__15__Impl rule__AmbienteDespliegue__Group__16 ;
    public final void rule__AmbienteDespliegue__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( rule__AmbienteDespliegue__Group__15__Impl rule__AmbienteDespliegue__Group__16 )
            // InternalMyDsl.g:1731:2: rule__AmbienteDespliegue__Group__15__Impl rule__AmbienteDespliegue__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__AmbienteDespliegue__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__16();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__15"


    // $ANTLR start "rule__AmbienteDespliegue__Group__15__Impl"
    // InternalMyDsl.g:1738:1: rule__AmbienteDespliegue__Group__15__Impl : ( ( rule__AmbienteDespliegue__Group_15__0 )* ) ;
    public final void rule__AmbienteDespliegue__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( ( ( rule__AmbienteDespliegue__Group_15__0 )* ) )
            // InternalMyDsl.g:1743:1: ( ( rule__AmbienteDespliegue__Group_15__0 )* )
            {
            // InternalMyDsl.g:1743:1: ( ( rule__AmbienteDespliegue__Group_15__0 )* )
            // InternalMyDsl.g:1744:2: ( rule__AmbienteDespliegue__Group_15__0 )*
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_15()); 
            // InternalMyDsl.g:1745:2: ( rule__AmbienteDespliegue__Group_15__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1745:3: rule__AmbienteDespliegue__Group_15__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AmbienteDespliegue__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__15__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__16"
    // InternalMyDsl.g:1753:1: rule__AmbienteDespliegue__Group__16 : rule__AmbienteDespliegue__Group__16__Impl rule__AmbienteDespliegue__Group__17 ;
    public final void rule__AmbienteDespliegue__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( rule__AmbienteDespliegue__Group__16__Impl rule__AmbienteDespliegue__Group__17 )
            // InternalMyDsl.g:1758:2: rule__AmbienteDespliegue__Group__16__Impl rule__AmbienteDespliegue__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__AmbienteDespliegue__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__17();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__16"


    // $ANTLR start "rule__AmbienteDespliegue__Group__16__Impl"
    // InternalMyDsl.g:1765:1: rule__AmbienteDespliegue__Group__16__Impl : ( ']' ) ;
    public final void rule__AmbienteDespliegue__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1769:1: ( ( ']' ) )
            // InternalMyDsl.g:1770:1: ( ']' )
            {
            // InternalMyDsl.g:1770:1: ( ']' )
            // InternalMyDsl.g:1771:2: ']'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_16()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__16__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__17"
    // InternalMyDsl.g:1780:1: rule__AmbienteDespliegue__Group__17 : rule__AmbienteDespliegue__Group__17__Impl ;
    public final void rule__AmbienteDespliegue__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( rule__AmbienteDespliegue__Group__17__Impl )
            // InternalMyDsl.g:1785:2: rule__AmbienteDespliegue__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__17__Impl();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group__17"


    // $ANTLR start "rule__AmbienteDespliegue__Group__17__Impl"
    // InternalMyDsl.g:1791:1: rule__AmbienteDespliegue__Group__17__Impl : ( '}' ) ;
    public final void rule__AmbienteDespliegue__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( ( '}' ) )
            // InternalMyDsl.g:1796:1: ( '}' )
            {
            // InternalMyDsl.g:1796:1: ( '}' )
            // InternalMyDsl.g:1797:2: '}'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_17()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__17__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_9__0"
    // InternalMyDsl.g:1807:1: rule__AmbienteDespliegue__Group_9__0 : rule__AmbienteDespliegue__Group_9__0__Impl rule__AmbienteDespliegue__Group_9__1 ;
    public final void rule__AmbienteDespliegue__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( rule__AmbienteDespliegue__Group_9__0__Impl rule__AmbienteDespliegue__Group_9__1 )
            // InternalMyDsl.g:1812:2: rule__AmbienteDespliegue__Group_9__0__Impl rule__AmbienteDespliegue__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDespliegue__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_9__1();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group_9__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_9__0__Impl"
    // InternalMyDsl.g:1819:1: rule__AmbienteDespliegue__Group_9__0__Impl : ( ',' ) ;
    public final void rule__AmbienteDespliegue__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( ( ',' ) )
            // InternalMyDsl.g:1824:1: ( ',' )
            {
            // InternalMyDsl.g:1824:1: ( ',' )
            // InternalMyDsl.g:1825:2: ','
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_9__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_9__1"
    // InternalMyDsl.g:1834:1: rule__AmbienteDespliegue__Group_9__1 : rule__AmbienteDespliegue__Group_9__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( rule__AmbienteDespliegue__Group_9__1__Impl )
            // InternalMyDsl.g:1839:2: rule__AmbienteDespliegue__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_9__1__Impl();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group_9__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_9__1__Impl"
    // InternalMyDsl.g:1845:1: rule__AmbienteDespliegue__Group_9__1__Impl : ( ( rule__AmbienteDespliegue__VpcAssignment_9_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ( rule__AmbienteDespliegue__VpcAssignment_9_1 ) ) )
            // InternalMyDsl.g:1850:1: ( ( rule__AmbienteDespliegue__VpcAssignment_9_1 ) )
            {
            // InternalMyDsl.g:1850:1: ( ( rule__AmbienteDespliegue__VpcAssignment_9_1 ) )
            // InternalMyDsl.g:1851:2: ( rule__AmbienteDespliegue__VpcAssignment_9_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_9_1()); 
            // InternalMyDsl.g:1852:2: ( rule__AmbienteDespliegue__VpcAssignment_9_1 )
            // InternalMyDsl.g:1852:3: rule__AmbienteDespliegue__VpcAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__VpcAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_9__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_15__0"
    // InternalMyDsl.g:1861:1: rule__AmbienteDespliegue__Group_15__0 : rule__AmbienteDespliegue__Group_15__0__Impl rule__AmbienteDespliegue__Group_15__1 ;
    public final void rule__AmbienteDespliegue__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( rule__AmbienteDespliegue__Group_15__0__Impl rule__AmbienteDespliegue__Group_15__1 )
            // InternalMyDsl.g:1866:2: rule__AmbienteDespliegue__Group_15__0__Impl rule__AmbienteDespliegue__Group_15__1
            {
            pushFollow(FOLLOW_18);
            rule__AmbienteDespliegue__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_15__1();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group_15__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_15__0__Impl"
    // InternalMyDsl.g:1873:1: rule__AmbienteDespliegue__Group_15__0__Impl : ( ',' ) ;
    public final void rule__AmbienteDespliegue__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( ( ',' ) )
            // InternalMyDsl.g:1878:1: ( ',' )
            {
            // InternalMyDsl.g:1878:1: ( ',' )
            // InternalMyDsl.g:1879:2: ','
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_15_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_15__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_15__1"
    // InternalMyDsl.g:1888:1: rule__AmbienteDespliegue__Group_15__1 : rule__AmbienteDespliegue__Group_15__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( rule__AmbienteDespliegue__Group_15__1__Impl )
            // InternalMyDsl.g:1893:2: rule__AmbienteDespliegue__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_15__1__Impl();

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
    // $ANTLR end "rule__AmbienteDespliegue__Group_15__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_15__1__Impl"
    // InternalMyDsl.g:1899:1: rule__AmbienteDespliegue__Group_15__1__Impl : ( ( rule__AmbienteDespliegue__RecursosAssignment_15_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( ( ( rule__AmbienteDespliegue__RecursosAssignment_15_1 ) ) )
            // InternalMyDsl.g:1904:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_15_1 ) )
            {
            // InternalMyDsl.g:1904:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_15_1 ) )
            // InternalMyDsl.g:1905:2: ( rule__AmbienteDespliegue__RecursosAssignment_15_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_15_1()); 
            // InternalMyDsl.g:1906:2: ( rule__AmbienteDespliegue__RecursosAssignment_15_1 )
            // InternalMyDsl.g:1906:3: rule__AmbienteDespliegue__RecursosAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__RecursosAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_15__1__Impl"


    // $ANTLR start "rule__UsuarioPassword__Group__0"
    // InternalMyDsl.g:1915:1: rule__UsuarioPassword__Group__0 : rule__UsuarioPassword__Group__0__Impl rule__UsuarioPassword__Group__1 ;
    public final void rule__UsuarioPassword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( rule__UsuarioPassword__Group__0__Impl rule__UsuarioPassword__Group__1 )
            // InternalMyDsl.g:1920:2: rule__UsuarioPassword__Group__0__Impl rule__UsuarioPassword__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1927:1: rule__UsuarioPassword__Group__0__Impl : ( () ) ;
    public final void rule__UsuarioPassword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( ( () ) )
            // InternalMyDsl.g:1932:1: ( () )
            {
            // InternalMyDsl.g:1932:1: ( () )
            // InternalMyDsl.g:1933:2: ()
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordAction_0()); 
            // InternalMyDsl.g:1934:2: ()
            // InternalMyDsl.g:1934:3: 
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
    // InternalMyDsl.g:1942:1: rule__UsuarioPassword__Group__1 : rule__UsuarioPassword__Group__1__Impl rule__UsuarioPassword__Group__2 ;
    public final void rule__UsuarioPassword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( rule__UsuarioPassword__Group__1__Impl rule__UsuarioPassword__Group__2 )
            // InternalMyDsl.g:1947:2: rule__UsuarioPassword__Group__1__Impl rule__UsuarioPassword__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1954:1: rule__UsuarioPassword__Group__1__Impl : ( 'user' ) ;
    public final void rule__UsuarioPassword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( ( 'user' ) )
            // InternalMyDsl.g:1959:1: ( 'user' )
            {
            // InternalMyDsl.g:1959:1: ( 'user' )
            // InternalMyDsl.g:1960:2: 'user'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUserKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getUserKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1969:1: rule__UsuarioPassword__Group__2 : rule__UsuarioPassword__Group__2__Impl rule__UsuarioPassword__Group__3 ;
    public final void rule__UsuarioPassword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( rule__UsuarioPassword__Group__2__Impl rule__UsuarioPassword__Group__3 )
            // InternalMyDsl.g:1974:2: rule__UsuarioPassword__Group__2__Impl rule__UsuarioPassword__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1981:1: rule__UsuarioPassword__Group__2__Impl : ( ( rule__UsuarioPassword__UsuarioAssignment_2 ) ) ;
    public final void rule__UsuarioPassword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( ( ( rule__UsuarioPassword__UsuarioAssignment_2 ) ) )
            // InternalMyDsl.g:1986:1: ( ( rule__UsuarioPassword__UsuarioAssignment_2 ) )
            {
            // InternalMyDsl.g:1986:1: ( ( rule__UsuarioPassword__UsuarioAssignment_2 ) )
            // InternalMyDsl.g:1987:2: ( rule__UsuarioPassword__UsuarioAssignment_2 )
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioAssignment_2()); 
            // InternalMyDsl.g:1988:2: ( rule__UsuarioPassword__UsuarioAssignment_2 )
            // InternalMyDsl.g:1988:3: rule__UsuarioPassword__UsuarioAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__UsuarioAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUsuarioPasswordAccess().getUsuarioAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:1996:1: rule__UsuarioPassword__Group__3 : rule__UsuarioPassword__Group__3__Impl rule__UsuarioPassword__Group__4 ;
    public final void rule__UsuarioPassword__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( rule__UsuarioPassword__Group__3__Impl rule__UsuarioPassword__Group__4 )
            // InternalMyDsl.g:2001:2: rule__UsuarioPassword__Group__3__Impl rule__UsuarioPassword__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2008:1: rule__UsuarioPassword__Group__3__Impl : ( ';' ) ;
    public final void rule__UsuarioPassword__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( ( ';' ) )
            // InternalMyDsl.g:2013:1: ( ';' )
            {
            // InternalMyDsl.g:2013:1: ( ';' )
            // InternalMyDsl.g:2014:2: ';'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getSemicolonKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2023:1: rule__UsuarioPassword__Group__4 : rule__UsuarioPassword__Group__4__Impl rule__UsuarioPassword__Group__5 ;
    public final void rule__UsuarioPassword__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( rule__UsuarioPassword__Group__4__Impl rule__UsuarioPassword__Group__5 )
            // InternalMyDsl.g:2028:2: rule__UsuarioPassword__Group__4__Impl rule__UsuarioPassword__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:2035:1: rule__UsuarioPassword__Group__4__Impl : ( 'password' ) ;
    public final void rule__UsuarioPassword__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( ( 'password' ) )
            // InternalMyDsl.g:2040:1: ( 'password' )
            {
            // InternalMyDsl.g:2040:1: ( 'password' )
            // InternalMyDsl.g:2041:2: 'password'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getPasswordKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getPasswordKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:2050:1: rule__UsuarioPassword__Group__5 : rule__UsuarioPassword__Group__5__Impl rule__UsuarioPassword__Group__6 ;
    public final void rule__UsuarioPassword__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( rule__UsuarioPassword__Group__5__Impl rule__UsuarioPassword__Group__6 )
            // InternalMyDsl.g:2055:2: rule__UsuarioPassword__Group__5__Impl rule__UsuarioPassword__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__UsuarioPassword__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__6();

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
    // InternalMyDsl.g:2062:1: rule__UsuarioPassword__Group__5__Impl : ( ( rule__UsuarioPassword__PasswordAssignment_5 ) ) ;
    public final void rule__UsuarioPassword__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( ( ( rule__UsuarioPassword__PasswordAssignment_5 ) ) )
            // InternalMyDsl.g:2067:1: ( ( rule__UsuarioPassword__PasswordAssignment_5 ) )
            {
            // InternalMyDsl.g:2067:1: ( ( rule__UsuarioPassword__PasswordAssignment_5 ) )
            // InternalMyDsl.g:2068:2: ( rule__UsuarioPassword__PasswordAssignment_5 )
            {
             before(grammarAccess.getUsuarioPasswordAccess().getPasswordAssignment_5()); 
            // InternalMyDsl.g:2069:2: ( rule__UsuarioPassword__PasswordAssignment_5 )
            // InternalMyDsl.g:2069:3: rule__UsuarioPassword__PasswordAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__PasswordAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUsuarioPasswordAccess().getPasswordAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__UsuarioPassword__Group__6"
    // InternalMyDsl.g:2077:1: rule__UsuarioPassword__Group__6 : rule__UsuarioPassword__Group__6__Impl ;
    public final void rule__UsuarioPassword__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2081:1: ( rule__UsuarioPassword__Group__6__Impl )
            // InternalMyDsl.g:2082:2: rule__UsuarioPassword__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsuarioPassword__Group__6__Impl();

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
    // $ANTLR end "rule__UsuarioPassword__Group__6"


    // $ANTLR start "rule__UsuarioPassword__Group__6__Impl"
    // InternalMyDsl.g:2088:1: rule__UsuarioPassword__Group__6__Impl : ( ';' ) ;
    public final void rule__UsuarioPassword__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( ( ';' ) )
            // InternalMyDsl.g:2093:1: ( ';' )
            {
            // InternalMyDsl.g:2093:1: ( ';' )
            // InternalMyDsl.g:2094:2: ';'
            {
             before(grammarAccess.getUsuarioPasswordAccess().getSemicolonKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUsuarioPasswordAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__Group__6__Impl"


    // $ANTLR start "rule__Llave__Group__0"
    // InternalMyDsl.g:2104:1: rule__Llave__Group__0 : rule__Llave__Group__0__Impl rule__Llave__Group__1 ;
    public final void rule__Llave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( rule__Llave__Group__0__Impl rule__Llave__Group__1 )
            // InternalMyDsl.g:2109:2: rule__Llave__Group__0__Impl rule__Llave__Group__1
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
    // InternalMyDsl.g:2116:1: rule__Llave__Group__0__Impl : ( () ) ;
    public final void rule__Llave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2120:1: ( ( () ) )
            // InternalMyDsl.g:2121:1: ( () )
            {
            // InternalMyDsl.g:2121:1: ( () )
            // InternalMyDsl.g:2122:2: ()
            {
             before(grammarAccess.getLlaveAccess().getLlaveAction_0()); 
            // InternalMyDsl.g:2123:2: ()
            // InternalMyDsl.g:2123:3: 
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
    // InternalMyDsl.g:2131:1: rule__Llave__Group__1 : rule__Llave__Group__1__Impl rule__Llave__Group__2 ;
    public final void rule__Llave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( rule__Llave__Group__1__Impl rule__Llave__Group__2 )
            // InternalMyDsl.g:2136:2: rule__Llave__Group__1__Impl rule__Llave__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2143:1: rule__Llave__Group__1__Impl : ( 'secret' ) ;
    public final void rule__Llave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2147:1: ( ( 'secret' ) )
            // InternalMyDsl.g:2148:1: ( 'secret' )
            {
            // InternalMyDsl.g:2148:1: ( 'secret' )
            // InternalMyDsl.g:2149:2: 'secret'
            {
             before(grammarAccess.getLlaveAccess().getSecretKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLlaveAccess().getSecretKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2158:1: rule__Llave__Group__2 : rule__Llave__Group__2__Impl rule__Llave__Group__3 ;
    public final void rule__Llave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( rule__Llave__Group__2__Impl rule__Llave__Group__3 )
            // InternalMyDsl.g:2163:2: rule__Llave__Group__2__Impl rule__Llave__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:2170:1: rule__Llave__Group__2__Impl : ( '=' ) ;
    public final void rule__Llave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2174:1: ( ( '=' ) )
            // InternalMyDsl.g:2175:1: ( '=' )
            {
            // InternalMyDsl.g:2175:1: ( '=' )
            // InternalMyDsl.g:2176:2: '='
            {
             before(grammarAccess.getLlaveAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLlaveAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:2185:1: rule__Llave__Group__3 : rule__Llave__Group__3__Impl rule__Llave__Group__4 ;
    public final void rule__Llave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( rule__Llave__Group__3__Impl rule__Llave__Group__4 )
            // InternalMyDsl.g:2190:2: rule__Llave__Group__3__Impl rule__Llave__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2197:1: rule__Llave__Group__3__Impl : ( ( rule__Llave__SecretoAssignment_3 ) ) ;
    public final void rule__Llave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2201:1: ( ( ( rule__Llave__SecretoAssignment_3 ) ) )
            // InternalMyDsl.g:2202:1: ( ( rule__Llave__SecretoAssignment_3 ) )
            {
            // InternalMyDsl.g:2202:1: ( ( rule__Llave__SecretoAssignment_3 ) )
            // InternalMyDsl.g:2203:2: ( rule__Llave__SecretoAssignment_3 )
            {
             before(grammarAccess.getLlaveAccess().getSecretoAssignment_3()); 
            // InternalMyDsl.g:2204:2: ( rule__Llave__SecretoAssignment_3 )
            // InternalMyDsl.g:2204:3: rule__Llave__SecretoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Llave__SecretoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLlaveAccess().getSecretoAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2212:1: rule__Llave__Group__4 : rule__Llave__Group__4__Impl ;
    public final void rule__Llave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( rule__Llave__Group__4__Impl )
            // InternalMyDsl.g:2217:2: rule__Llave__Group__4__Impl
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
    // InternalMyDsl.g:2223:1: rule__Llave__Group__4__Impl : ( ';' ) ;
    public final void rule__Llave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( ( ';' ) )
            // InternalMyDsl.g:2228:1: ( ';' )
            {
            // InternalMyDsl.g:2228:1: ( ';' )
            // InternalMyDsl.g:2229:2: ';'
            {
             before(grammarAccess.getLlaveAccess().getSemicolonKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLlaveAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__VPC__Group__0"
    // InternalMyDsl.g:2239:1: rule__VPC__Group__0 : rule__VPC__Group__0__Impl rule__VPC__Group__1 ;
    public final void rule__VPC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( rule__VPC__Group__0__Impl rule__VPC__Group__1 )
            // InternalMyDsl.g:2244:2: rule__VPC__Group__0__Impl rule__VPC__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2251:1: rule__VPC__Group__0__Impl : ( '{' ) ;
    public final void rule__VPC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( ( '{' ) )
            // InternalMyDsl.g:2256:1: ( '{' )
            {
            // InternalMyDsl.g:2256:1: ( '{' )
            // InternalMyDsl.g:2257:2: '{'
            {
             before(grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2266:1: rule__VPC__Group__1 : rule__VPC__Group__1__Impl rule__VPC__Group__2 ;
    public final void rule__VPC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( rule__VPC__Group__1__Impl rule__VPC__Group__2 )
            // InternalMyDsl.g:2271:2: rule__VPC__Group__1__Impl rule__VPC__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2278:1: rule__VPC__Group__1__Impl : ( 'tipo' ) ;
    public final void rule__VPC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2282:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:2283:1: ( 'tipo' )
            {
            // InternalMyDsl.g:2283:1: ( 'tipo' )
            // InternalMyDsl.g:2284:2: 'tipo'
            {
             before(grammarAccess.getVPCAccess().getTipoKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getTipoKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2293:1: rule__VPC__Group__2 : rule__VPC__Group__2__Impl rule__VPC__Group__3 ;
    public final void rule__VPC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( rule__VPC__Group__2__Impl rule__VPC__Group__3 )
            // InternalMyDsl.g:2298:2: rule__VPC__Group__2__Impl rule__VPC__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2305:1: rule__VPC__Group__2__Impl : ( '=' ) ;
    public final void rule__VPC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2309:1: ( ( '=' ) )
            // InternalMyDsl.g:2310:1: ( '=' )
            {
            // InternalMyDsl.g:2310:1: ( '=' )
            // InternalMyDsl.g:2311:2: '='
            {
             before(grammarAccess.getVPCAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:2320:1: rule__VPC__Group__3 : rule__VPC__Group__3__Impl rule__VPC__Group__4 ;
    public final void rule__VPC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( rule__VPC__Group__3__Impl rule__VPC__Group__4 )
            // InternalMyDsl.g:2325:2: rule__VPC__Group__3__Impl rule__VPC__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2332:1: rule__VPC__Group__3__Impl : ( 'VPC' ) ;
    public final void rule__VPC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( ( 'VPC' ) )
            // InternalMyDsl.g:2337:1: ( 'VPC' )
            {
            // InternalMyDsl.g:2337:1: ( 'VPC' )
            // InternalMyDsl.g:2338:2: 'VPC'
            {
             before(grammarAccess.getVPCAccess().getVPCKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getVPCKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2347:1: rule__VPC__Group__4 : rule__VPC__Group__4__Impl rule__VPC__Group__5 ;
    public final void rule__VPC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( rule__VPC__Group__4__Impl rule__VPC__Group__5 )
            // InternalMyDsl.g:2352:2: rule__VPC__Group__4__Impl rule__VPC__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2359:1: rule__VPC__Group__4__Impl : ( ';' ) ;
    public final void rule__VPC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( ( ';' ) )
            // InternalMyDsl.g:2364:1: ( ';' )
            {
            // InternalMyDsl.g:2364:1: ( ';' )
            // InternalMyDsl.g:2365:2: ';'
            {
             before(grammarAccess.getVPCAccess().getSemicolonKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:2374:1: rule__VPC__Group__5 : rule__VPC__Group__5__Impl rule__VPC__Group__6 ;
    public final void rule__VPC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( rule__VPC__Group__5__Impl rule__VPC__Group__6 )
            // InternalMyDsl.g:2379:2: rule__VPC__Group__5__Impl rule__VPC__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VPC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__6();

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
    // InternalMyDsl.g:2386:1: rule__VPC__Group__5__Impl : ( 'nombre' ) ;
    public final void rule__VPC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2390:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:2391:1: ( 'nombre' )
            {
            // InternalMyDsl.g:2391:1: ( 'nombre' )
            // InternalMyDsl.g:2392:2: 'nombre'
            {
             before(grammarAccess.getVPCAccess().getNombreKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getNombreKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__VPC__Group__6"
    // InternalMyDsl.g:2401:1: rule__VPC__Group__6 : rule__VPC__Group__6__Impl rule__VPC__Group__7 ;
    public final void rule__VPC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( rule__VPC__Group__6__Impl rule__VPC__Group__7 )
            // InternalMyDsl.g:2406:2: rule__VPC__Group__6__Impl rule__VPC__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__VPC__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__7();

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
    // $ANTLR end "rule__VPC__Group__6"


    // $ANTLR start "rule__VPC__Group__6__Impl"
    // InternalMyDsl.g:2413:1: rule__VPC__Group__6__Impl : ( '=' ) ;
    public final void rule__VPC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2417:1: ( ( '=' ) )
            // InternalMyDsl.g:2418:1: ( '=' )
            {
            // InternalMyDsl.g:2418:1: ( '=' )
            // InternalMyDsl.g:2419:2: '='
            {
             before(grammarAccess.getVPCAccess().getEqualsSignKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__6__Impl"


    // $ANTLR start "rule__VPC__Group__7"
    // InternalMyDsl.g:2428:1: rule__VPC__Group__7 : rule__VPC__Group__7__Impl rule__VPC__Group__8 ;
    public final void rule__VPC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( rule__VPC__Group__7__Impl rule__VPC__Group__8 )
            // InternalMyDsl.g:2433:2: rule__VPC__Group__7__Impl rule__VPC__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__VPC__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__8();

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
    // $ANTLR end "rule__VPC__Group__7"


    // $ANTLR start "rule__VPC__Group__7__Impl"
    // InternalMyDsl.g:2440:1: rule__VPC__Group__7__Impl : ( ( rule__VPC__NombreAssignment_7 ) ) ;
    public final void rule__VPC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2444:1: ( ( ( rule__VPC__NombreAssignment_7 ) ) )
            // InternalMyDsl.g:2445:1: ( ( rule__VPC__NombreAssignment_7 ) )
            {
            // InternalMyDsl.g:2445:1: ( ( rule__VPC__NombreAssignment_7 ) )
            // InternalMyDsl.g:2446:2: ( rule__VPC__NombreAssignment_7 )
            {
             before(grammarAccess.getVPCAccess().getNombreAssignment_7()); 
            // InternalMyDsl.g:2447:2: ( rule__VPC__NombreAssignment_7 )
            // InternalMyDsl.g:2447:3: rule__VPC__NombreAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__VPC__NombreAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getNombreAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__7__Impl"


    // $ANTLR start "rule__VPC__Group__8"
    // InternalMyDsl.g:2455:1: rule__VPC__Group__8 : rule__VPC__Group__8__Impl rule__VPC__Group__9 ;
    public final void rule__VPC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( rule__VPC__Group__8__Impl rule__VPC__Group__9 )
            // InternalMyDsl.g:2460:2: rule__VPC__Group__8__Impl rule__VPC__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__VPC__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__9();

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
    // $ANTLR end "rule__VPC__Group__8"


    // $ANTLR start "rule__VPC__Group__8__Impl"
    // InternalMyDsl.g:2467:1: rule__VPC__Group__8__Impl : ( ';' ) ;
    public final void rule__VPC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2471:1: ( ( ';' ) )
            // InternalMyDsl.g:2472:1: ( ';' )
            {
            // InternalMyDsl.g:2472:1: ( ';' )
            // InternalMyDsl.g:2473:2: ';'
            {
             before(grammarAccess.getVPCAccess().getSemicolonKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__8__Impl"


    // $ANTLR start "rule__VPC__Group__9"
    // InternalMyDsl.g:2482:1: rule__VPC__Group__9 : rule__VPC__Group__9__Impl ;
    public final void rule__VPC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( rule__VPC__Group__9__Impl )
            // InternalMyDsl.g:2487:2: rule__VPC__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group__9__Impl();

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
    // $ANTLR end "rule__VPC__Group__9"


    // $ANTLR start "rule__VPC__Group__9__Impl"
    // InternalMyDsl.g:2493:1: rule__VPC__Group__9__Impl : ( '}' ) ;
    public final void rule__VPC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( ( '}' ) )
            // InternalMyDsl.g:2498:1: ( '}' )
            {
            // InternalMyDsl.g:2498:1: ( '}' )
            // InternalMyDsl.g:2499:2: '}'
            {
             before(grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__9__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__0"
    // InternalMyDsl.g:2509:1: rule__ServidorAplicaciones__Group__0 : rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 ;
    public final void rule__ServidorAplicaciones__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2513:1: ( rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 )
            // InternalMyDsl.g:2514:2: rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1
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
    // InternalMyDsl.g:2521:1: rule__ServidorAplicaciones__Group__0__Impl : ( 'ServidorAplicaciones' ) ;
    public final void rule__ServidorAplicaciones__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2525:1: ( ( 'ServidorAplicaciones' ) )
            // InternalMyDsl.g:2526:1: ( 'ServidorAplicaciones' )
            {
            // InternalMyDsl.g:2526:1: ( 'ServidorAplicaciones' )
            // InternalMyDsl.g:2527:2: 'ServidorAplicaciones'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:2536:1: rule__ServidorAplicaciones__Group__1 : rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 ;
    public final void rule__ServidorAplicaciones__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 )
            // InternalMyDsl.g:2541:2: rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2548:1: rule__ServidorAplicaciones__Group__1__Impl : ( '{' ) ;
    public final void rule__ServidorAplicaciones__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2552:1: ( ( '{' ) )
            // InternalMyDsl.g:2553:1: ( '{' )
            {
            // InternalMyDsl.g:2553:1: ( '{' )
            // InternalMyDsl.g:2554:2: '{'
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
    // InternalMyDsl.g:2563:1: rule__ServidorAplicaciones__Group__2 : rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 ;
    public final void rule__ServidorAplicaciones__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 )
            // InternalMyDsl.g:2568:2: rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2575:1: rule__ServidorAplicaciones__Group__2__Impl : ( ( rule__ServidorAplicaciones__Group_2__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2579:1: ( ( ( rule__ServidorAplicaciones__Group_2__0 )? ) )
            // InternalMyDsl.g:2580:1: ( ( rule__ServidorAplicaciones__Group_2__0 )? )
            {
            // InternalMyDsl.g:2580:1: ( ( rule__ServidorAplicaciones__Group_2__0 )? )
            // InternalMyDsl.g:2581:2: ( rule__ServidorAplicaciones__Group_2__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_2()); 
            // InternalMyDsl.g:2582:2: ( rule__ServidorAplicaciones__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2582:3: rule__ServidorAplicaciones__Group_2__0
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
    // InternalMyDsl.g:2590:1: rule__ServidorAplicaciones__Group__3 : rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 ;
    public final void rule__ServidorAplicaciones__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 )
            // InternalMyDsl.g:2595:2: rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2602:1: rule__ServidorAplicaciones__Group__3__Impl : ( ( rule__ServidorAplicaciones__Group_3__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2606:1: ( ( ( rule__ServidorAplicaciones__Group_3__0 )? ) )
            // InternalMyDsl.g:2607:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            {
            // InternalMyDsl.g:2607:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            // InternalMyDsl.g:2608:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_3()); 
            // InternalMyDsl.g:2609:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2609:3: rule__ServidorAplicaciones__Group_3__0
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
    // InternalMyDsl.g:2617:1: rule__ServidorAplicaciones__Group__4 : rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 ;
    public final void rule__ServidorAplicaciones__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 )
            // InternalMyDsl.g:2622:2: rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2629:1: rule__ServidorAplicaciones__Group__4__Impl : ( ( rule__ServidorAplicaciones__Group_4__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2633:1: ( ( ( rule__ServidorAplicaciones__Group_4__0 )? ) )
            // InternalMyDsl.g:2634:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            {
            // InternalMyDsl.g:2634:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            // InternalMyDsl.g:2635:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_4()); 
            // InternalMyDsl.g:2636:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2636:3: rule__ServidorAplicaciones__Group_4__0
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
    // InternalMyDsl.g:2644:1: rule__ServidorAplicaciones__Group__5 : rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 ;
    public final void rule__ServidorAplicaciones__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 )
            // InternalMyDsl.g:2649:2: rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2656:1: rule__ServidorAplicaciones__Group__5__Impl : ( ( rule__ServidorAplicaciones__Group_5__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2660:1: ( ( ( rule__ServidorAplicaciones__Group_5__0 )? ) )
            // InternalMyDsl.g:2661:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            {
            // InternalMyDsl.g:2661:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            // InternalMyDsl.g:2662:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_5()); 
            // InternalMyDsl.g:2663:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2663:3: rule__ServidorAplicaciones__Group_5__0
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
    // InternalMyDsl.g:2671:1: rule__ServidorAplicaciones__Group__6 : rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 ;
    public final void rule__ServidorAplicaciones__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 )
            // InternalMyDsl.g:2676:2: rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7
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
    // InternalMyDsl.g:2683:1: rule__ServidorAplicaciones__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAplicaciones__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2687:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:2688:1: ( 'vpc' )
            {
            // InternalMyDsl.g:2688:1: ( 'vpc' )
            // InternalMyDsl.g:2689:2: 'vpc'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:2698:1: rule__ServidorAplicaciones__Group__7 : rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 ;
    public final void rule__ServidorAplicaciones__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2702:1: ( rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 )
            // InternalMyDsl.g:2703:2: rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8
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
    // InternalMyDsl.g:2710:1: rule__ServidorAplicaciones__Group__7__Impl : ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) ) ;
    public final void rule__ServidorAplicaciones__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2714:1: ( ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:2715:1: ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:2715:1: ( ( rule__ServidorAplicaciones__VpcAssignment_7 ) )
            // InternalMyDsl.g:2716:2: ( rule__ServidorAplicaciones__VpcAssignment_7 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:2717:2: ( rule__ServidorAplicaciones__VpcAssignment_7 )
            // InternalMyDsl.g:2717:3: rule__ServidorAplicaciones__VpcAssignment_7
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
    // InternalMyDsl.g:2725:1: rule__ServidorAplicaciones__Group__8 : rule__ServidorAplicaciones__Group__8__Impl ;
    public final void rule__ServidorAplicaciones__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( rule__ServidorAplicaciones__Group__8__Impl )
            // InternalMyDsl.g:2730:2: rule__ServidorAplicaciones__Group__8__Impl
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
    // InternalMyDsl.g:2736:1: rule__ServidorAplicaciones__Group__8__Impl : ( '}' ) ;
    public final void rule__ServidorAplicaciones__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( ( '}' ) )
            // InternalMyDsl.g:2741:1: ( '}' )
            {
            // InternalMyDsl.g:2741:1: ( '}' )
            // InternalMyDsl.g:2742:2: '}'
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
    // InternalMyDsl.g:2752:1: rule__ServidorAplicaciones__Group_2__0 : rule__ServidorAplicaciones__Group_2__0__Impl rule__ServidorAplicaciones__Group_2__1 ;
    public final void rule__ServidorAplicaciones__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( rule__ServidorAplicaciones__Group_2__0__Impl rule__ServidorAplicaciones__Group_2__1 )
            // InternalMyDsl.g:2757:2: rule__ServidorAplicaciones__Group_2__0__Impl rule__ServidorAplicaciones__Group_2__1
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
    // InternalMyDsl.g:2764:1: rule__ServidorAplicaciones__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAplicaciones__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2768:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:2769:1: ( 'nombre' )
            {
            // InternalMyDsl.g:2769:1: ( 'nombre' )
            // InternalMyDsl.g:2770:2: 'nombre'
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
    // InternalMyDsl.g:2779:1: rule__ServidorAplicaciones__Group_2__1 : rule__ServidorAplicaciones__Group_2__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( rule__ServidorAplicaciones__Group_2__1__Impl )
            // InternalMyDsl.g:2784:2: rule__ServidorAplicaciones__Group_2__1__Impl
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
    // InternalMyDsl.g:2790:1: rule__ServidorAplicaciones__Group_2__1__Impl : ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:2795:1: ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2795:1: ( ( rule__ServidorAplicaciones__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:2796:2: ( rule__ServidorAplicaciones__NombreAssignment_2_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:2797:2: ( rule__ServidorAplicaciones__NombreAssignment_2_1 )
            // InternalMyDsl.g:2797:3: rule__ServidorAplicaciones__NombreAssignment_2_1
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
    // InternalMyDsl.g:2806:1: rule__ServidorAplicaciones__Group_3__0 : rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 ;
    public final void rule__ServidorAplicaciones__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 )
            // InternalMyDsl.g:2811:2: rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2818:1: rule__ServidorAplicaciones__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__ServidorAplicaciones__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2822:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:2823:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:2823:1: ( 'tamanio' )
            // InternalMyDsl.g:2824:2: 'tamanio'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanioKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:2833:1: rule__ServidorAplicaciones__Group_3__1 : rule__ServidorAplicaciones__Group_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2837:1: ( rule__ServidorAplicaciones__Group_3__1__Impl )
            // InternalMyDsl.g:2838:2: rule__ServidorAplicaciones__Group_3__1__Impl
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
    // InternalMyDsl.g:2844:1: rule__ServidorAplicaciones__Group_3__1__Impl : ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:2849:1: ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2849:1: ( ( rule__ServidorAplicaciones__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:2850:2: ( rule__ServidorAplicaciones__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:2851:2: ( rule__ServidorAplicaciones__TamanioAssignment_3_1 )
            // InternalMyDsl.g:2851:3: rule__ServidorAplicaciones__TamanioAssignment_3_1
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
    // InternalMyDsl.g:2860:1: rule__ServidorAplicaciones__Group_4__0 : rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 ;
    public final void rule__ServidorAplicaciones__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 )
            // InternalMyDsl.g:2865:2: rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2872:1: rule__ServidorAplicaciones__Group_4__0__Impl : ( 'sistemaOperativo' ) ;
    public final void rule__ServidorAplicaciones__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( ( 'sistemaOperativo' ) )
            // InternalMyDsl.g:2877:1: ( 'sistemaOperativo' )
            {
            // InternalMyDsl.g:2877:1: ( 'sistemaOperativo' )
            // InternalMyDsl.g:2878:2: 'sistemaOperativo'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:2887:1: rule__ServidorAplicaciones__Group_4__1 : rule__ServidorAplicaciones__Group_4__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2891:1: ( rule__ServidorAplicaciones__Group_4__1__Impl )
            // InternalMyDsl.g:2892:2: rule__ServidorAplicaciones__Group_4__1__Impl
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
    // InternalMyDsl.g:2898:1: rule__ServidorAplicaciones__Group_4__1__Impl : ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2902:1: ( ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) ) )
            // InternalMyDsl.g:2903:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2903:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 ) )
            // InternalMyDsl.g:2904:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoAssignment_4_1()); 
            // InternalMyDsl.g:2905:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 )
            // InternalMyDsl.g:2905:3: rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1
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
    // InternalMyDsl.g:2914:1: rule__ServidorAplicaciones__Group_5__0 : rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 ;
    public final void rule__ServidorAplicaciones__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 )
            // InternalMyDsl.g:2919:2: rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2926:1: rule__ServidorAplicaciones__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__ServidorAplicaciones__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2930:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:2931:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:2931:1: ( 'conexiones' )
            // InternalMyDsl.g:2932:2: 'conexiones'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:2941:1: rule__ServidorAplicaciones__Group_5__1 : rule__ServidorAplicaciones__Group_5__1__Impl rule__ServidorAplicaciones__Group_5__2 ;
    public final void rule__ServidorAplicaciones__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( rule__ServidorAplicaciones__Group_5__1__Impl rule__ServidorAplicaciones__Group_5__2 )
            // InternalMyDsl.g:2946:2: rule__ServidorAplicaciones__Group_5__1__Impl rule__ServidorAplicaciones__Group_5__2
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
    // InternalMyDsl.g:2953:1: rule__ServidorAplicaciones__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ServidorAplicaciones__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2957:1: ( ( '(' ) )
            // InternalMyDsl.g:2958:1: ( '(' )
            {
            // InternalMyDsl.g:2958:1: ( '(' )
            // InternalMyDsl.g:2959:2: '('
            {
             before(grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:2968:1: rule__ServidorAplicaciones__Group_5__2 : rule__ServidorAplicaciones__Group_5__2__Impl rule__ServidorAplicaciones__Group_5__3 ;
    public final void rule__ServidorAplicaciones__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( rule__ServidorAplicaciones__Group_5__2__Impl rule__ServidorAplicaciones__Group_5__3 )
            // InternalMyDsl.g:2973:2: rule__ServidorAplicaciones__Group_5__2__Impl rule__ServidorAplicaciones__Group_5__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2980:1: rule__ServidorAplicaciones__Group_5__2__Impl : ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) ) ;
    public final void rule__ServidorAplicaciones__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2984:1: ( ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:2985:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2985:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:2986:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:2987:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:2987:3: rule__ServidorAplicaciones__ConexionesAssignment_5_2
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
    // InternalMyDsl.g:2995:1: rule__ServidorAplicaciones__Group_5__3 : rule__ServidorAplicaciones__Group_5__3__Impl rule__ServidorAplicaciones__Group_5__4 ;
    public final void rule__ServidorAplicaciones__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( rule__ServidorAplicaciones__Group_5__3__Impl rule__ServidorAplicaciones__Group_5__4 )
            // InternalMyDsl.g:3000:2: rule__ServidorAplicaciones__Group_5__3__Impl rule__ServidorAplicaciones__Group_5__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3007:1: rule__ServidorAplicaciones__Group_5__3__Impl : ( ( rule__ServidorAplicaciones__Group_5_3__0 )* ) ;
    public final void rule__ServidorAplicaciones__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3011:1: ( ( ( rule__ServidorAplicaciones__Group_5_3__0 )* ) )
            // InternalMyDsl.g:3012:1: ( ( rule__ServidorAplicaciones__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:3012:1: ( ( rule__ServidorAplicaciones__Group_5_3__0 )* )
            // InternalMyDsl.g:3013:2: ( rule__ServidorAplicaciones__Group_5_3__0 )*
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_5_3()); 
            // InternalMyDsl.g:3014:2: ( rule__ServidorAplicaciones__Group_5_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:3014:3: rule__ServidorAplicaciones__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ServidorAplicaciones__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:3022:1: rule__ServidorAplicaciones__Group_5__4 : rule__ServidorAplicaciones__Group_5__4__Impl ;
    public final void rule__ServidorAplicaciones__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( rule__ServidorAplicaciones__Group_5__4__Impl )
            // InternalMyDsl.g:3027:2: rule__ServidorAplicaciones__Group_5__4__Impl
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
    // InternalMyDsl.g:3033:1: rule__ServidorAplicaciones__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ServidorAplicaciones__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( ')' ) )
            // InternalMyDsl.g:3038:1: ( ')' )
            {
            // InternalMyDsl.g:3038:1: ( ')' )
            // InternalMyDsl.g:3039:2: ')'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_5_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:3049:1: rule__ServidorAplicaciones__Group_5_3__0 : rule__ServidorAplicaciones__Group_5_3__0__Impl rule__ServidorAplicaciones__Group_5_3__1 ;
    public final void rule__ServidorAplicaciones__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3053:1: ( rule__ServidorAplicaciones__Group_5_3__0__Impl rule__ServidorAplicaciones__Group_5_3__1 )
            // InternalMyDsl.g:3054:2: rule__ServidorAplicaciones__Group_5_3__0__Impl rule__ServidorAplicaciones__Group_5_3__1
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
    // InternalMyDsl.g:3061:1: rule__ServidorAplicaciones__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorAplicaciones__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( ( ',' ) )
            // InternalMyDsl.g:3066:1: ( ',' )
            {
            // InternalMyDsl.g:3066:1: ( ',' )
            // InternalMyDsl.g:3067:2: ','
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
    // InternalMyDsl.g:3076:1: rule__ServidorAplicaciones__Group_5_3__1 : rule__ServidorAplicaciones__Group_5_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( rule__ServidorAplicaciones__Group_5_3__1__Impl )
            // InternalMyDsl.g:3081:2: rule__ServidorAplicaciones__Group_5_3__1__Impl
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
    // InternalMyDsl.g:3087:1: rule__ServidorAplicaciones__Group_5_3__1__Impl : ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:3092:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:3092:1: ( ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:3093:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:3094:2: ( rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:3094:3: rule__ServidorAplicaciones__ConexionesAssignment_5_3_1
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
    // InternalMyDsl.g:3103:1: rule__ServidorAlmacenamiento__Group__0 : rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1 ;
    public final void rule__ServidorAlmacenamiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3107:1: ( rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1 )
            // InternalMyDsl.g:3108:2: rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1
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
    // InternalMyDsl.g:3115:1: rule__ServidorAlmacenamiento__Group__0__Impl : ( 'ServidorAlmacenamiento' ) ;
    public final void rule__ServidorAlmacenamiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3119:1: ( ( 'ServidorAlmacenamiento' ) )
            // InternalMyDsl.g:3120:1: ( 'ServidorAlmacenamiento' )
            {
            // InternalMyDsl.g:3120:1: ( 'ServidorAlmacenamiento' )
            // InternalMyDsl.g:3121:2: 'ServidorAlmacenamiento'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:3130:1: rule__ServidorAlmacenamiento__Group__1 : rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2 ;
    public final void rule__ServidorAlmacenamiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3134:1: ( rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2 )
            // InternalMyDsl.g:3135:2: rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3142:1: rule__ServidorAlmacenamiento__Group__1__Impl : ( '{' ) ;
    public final void rule__ServidorAlmacenamiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3146:1: ( ( '{' ) )
            // InternalMyDsl.g:3147:1: ( '{' )
            {
            // InternalMyDsl.g:3147:1: ( '{' )
            // InternalMyDsl.g:3148:2: '{'
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
    // InternalMyDsl.g:3157:1: rule__ServidorAlmacenamiento__Group__2 : rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3 ;
    public final void rule__ServidorAlmacenamiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3161:1: ( rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3 )
            // InternalMyDsl.g:3162:2: rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3169:1: rule__ServidorAlmacenamiento__Group__2__Impl : ( ( rule__ServidorAlmacenamiento__Group_2__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3173:1: ( ( ( rule__ServidorAlmacenamiento__Group_2__0 )? ) )
            // InternalMyDsl.g:3174:1: ( ( rule__ServidorAlmacenamiento__Group_2__0 )? )
            {
            // InternalMyDsl.g:3174:1: ( ( rule__ServidorAlmacenamiento__Group_2__0 )? )
            // InternalMyDsl.g:3175:2: ( rule__ServidorAlmacenamiento__Group_2__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_2()); 
            // InternalMyDsl.g:3176:2: ( rule__ServidorAlmacenamiento__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:3176:3: rule__ServidorAlmacenamiento__Group_2__0
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
    // InternalMyDsl.g:3184:1: rule__ServidorAlmacenamiento__Group__3 : rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4 ;
    public final void rule__ServidorAlmacenamiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3188:1: ( rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4 )
            // InternalMyDsl.g:3189:2: rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3196:1: rule__ServidorAlmacenamiento__Group__3__Impl : ( ( rule__ServidorAlmacenamiento__Group_3__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3200:1: ( ( ( rule__ServidorAlmacenamiento__Group_3__0 )? ) )
            // InternalMyDsl.g:3201:1: ( ( rule__ServidorAlmacenamiento__Group_3__0 )? )
            {
            // InternalMyDsl.g:3201:1: ( ( rule__ServidorAlmacenamiento__Group_3__0 )? )
            // InternalMyDsl.g:3202:2: ( rule__ServidorAlmacenamiento__Group_3__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_3()); 
            // InternalMyDsl.g:3203:2: ( rule__ServidorAlmacenamiento__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3203:3: rule__ServidorAlmacenamiento__Group_3__0
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
    // InternalMyDsl.g:3211:1: rule__ServidorAlmacenamiento__Group__4 : rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5 ;
    public final void rule__ServidorAlmacenamiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3215:1: ( rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5 )
            // InternalMyDsl.g:3216:2: rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3223:1: rule__ServidorAlmacenamiento__Group__4__Impl : ( ( rule__ServidorAlmacenamiento__Group_4__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3227:1: ( ( ( rule__ServidorAlmacenamiento__Group_4__0 )? ) )
            // InternalMyDsl.g:3228:1: ( ( rule__ServidorAlmacenamiento__Group_4__0 )? )
            {
            // InternalMyDsl.g:3228:1: ( ( rule__ServidorAlmacenamiento__Group_4__0 )? )
            // InternalMyDsl.g:3229:2: ( rule__ServidorAlmacenamiento__Group_4__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_4()); 
            // InternalMyDsl.g:3230:2: ( rule__ServidorAlmacenamiento__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:3230:3: rule__ServidorAlmacenamiento__Group_4__0
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
    // InternalMyDsl.g:3238:1: rule__ServidorAlmacenamiento__Group__5 : rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6 ;
    public final void rule__ServidorAlmacenamiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3242:1: ( rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6 )
            // InternalMyDsl.g:3243:2: rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3250:1: rule__ServidorAlmacenamiento__Group__5__Impl : ( ( rule__ServidorAlmacenamiento__Group_5__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3254:1: ( ( ( rule__ServidorAlmacenamiento__Group_5__0 )? ) )
            // InternalMyDsl.g:3255:1: ( ( rule__ServidorAlmacenamiento__Group_5__0 )? )
            {
            // InternalMyDsl.g:3255:1: ( ( rule__ServidorAlmacenamiento__Group_5__0 )? )
            // InternalMyDsl.g:3256:2: ( rule__ServidorAlmacenamiento__Group_5__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_5()); 
            // InternalMyDsl.g:3257:2: ( rule__ServidorAlmacenamiento__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:3257:3: rule__ServidorAlmacenamiento__Group_5__0
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
    // InternalMyDsl.g:3265:1: rule__ServidorAlmacenamiento__Group__6 : rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7 ;
    public final void rule__ServidorAlmacenamiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3269:1: ( rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7 )
            // InternalMyDsl.g:3270:2: rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7
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
    // InternalMyDsl.g:3277:1: rule__ServidorAlmacenamiento__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAlmacenamiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:3282:1: ( 'vpc' )
            {
            // InternalMyDsl.g:3282:1: ( 'vpc' )
            // InternalMyDsl.g:3283:2: 'vpc'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3292:1: rule__ServidorAlmacenamiento__Group__7 : rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8 ;
    public final void rule__ServidorAlmacenamiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3296:1: ( rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8 )
            // InternalMyDsl.g:3297:2: rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8
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
    // InternalMyDsl.g:3304:1: rule__ServidorAlmacenamiento__Group__7__Impl : ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3308:1: ( ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:3309:1: ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:3309:1: ( ( rule__ServidorAlmacenamiento__VpcAssignment_7 ) )
            // InternalMyDsl.g:3310:2: ( rule__ServidorAlmacenamiento__VpcAssignment_7 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:3311:2: ( rule__ServidorAlmacenamiento__VpcAssignment_7 )
            // InternalMyDsl.g:3311:3: rule__ServidorAlmacenamiento__VpcAssignment_7
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
    // InternalMyDsl.g:3319:1: rule__ServidorAlmacenamiento__Group__8 : rule__ServidorAlmacenamiento__Group__8__Impl ;
    public final void rule__ServidorAlmacenamiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3323:1: ( rule__ServidorAlmacenamiento__Group__8__Impl )
            // InternalMyDsl.g:3324:2: rule__ServidorAlmacenamiento__Group__8__Impl
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
    // InternalMyDsl.g:3330:1: rule__ServidorAlmacenamiento__Group__8__Impl : ( '}' ) ;
    public final void rule__ServidorAlmacenamiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( ( '}' ) )
            // InternalMyDsl.g:3335:1: ( '}' )
            {
            // InternalMyDsl.g:3335:1: ( '}' )
            // InternalMyDsl.g:3336:2: '}'
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
    // InternalMyDsl.g:3346:1: rule__ServidorAlmacenamiento__Group_2__0 : rule__ServidorAlmacenamiento__Group_2__0__Impl rule__ServidorAlmacenamiento__Group_2__1 ;
    public final void rule__ServidorAlmacenamiento__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3350:1: ( rule__ServidorAlmacenamiento__Group_2__0__Impl rule__ServidorAlmacenamiento__Group_2__1 )
            // InternalMyDsl.g:3351:2: rule__ServidorAlmacenamiento__Group_2__0__Impl rule__ServidorAlmacenamiento__Group_2__1
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
    // InternalMyDsl.g:3358:1: rule__ServidorAlmacenamiento__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAlmacenamiento__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3362:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:3363:1: ( 'nombre' )
            {
            // InternalMyDsl.g:3363:1: ( 'nombre' )
            // InternalMyDsl.g:3364:2: 'nombre'
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
    // InternalMyDsl.g:3373:1: rule__ServidorAlmacenamiento__Group_2__1 : rule__ServidorAlmacenamiento__Group_2__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3377:1: ( rule__ServidorAlmacenamiento__Group_2__1__Impl )
            // InternalMyDsl.g:3378:2: rule__ServidorAlmacenamiento__Group_2__1__Impl
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
    // InternalMyDsl.g:3384:1: rule__ServidorAlmacenamiento__Group_2__1__Impl : ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:3389:1: ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3389:1: ( ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:3390:2: ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:3391:2: ( rule__ServidorAlmacenamiento__NombreAssignment_2_1 )
            // InternalMyDsl.g:3391:3: rule__ServidorAlmacenamiento__NombreAssignment_2_1
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
    // InternalMyDsl.g:3400:1: rule__ServidorAlmacenamiento__Group_3__0 : rule__ServidorAlmacenamiento__Group_3__0__Impl rule__ServidorAlmacenamiento__Group_3__1 ;
    public final void rule__ServidorAlmacenamiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3404:1: ( rule__ServidorAlmacenamiento__Group_3__0__Impl rule__ServidorAlmacenamiento__Group_3__1 )
            // InternalMyDsl.g:3405:2: rule__ServidorAlmacenamiento__Group_3__0__Impl rule__ServidorAlmacenamiento__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:3412:1: rule__ServidorAlmacenamiento__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__ServidorAlmacenamiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3416:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:3417:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:3417:1: ( 'tamanio' )
            // InternalMyDsl.g:3418:2: 'tamanio'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3427:1: rule__ServidorAlmacenamiento__Group_3__1 : rule__ServidorAlmacenamiento__Group_3__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3431:1: ( rule__ServidorAlmacenamiento__Group_3__1__Impl )
            // InternalMyDsl.g:3432:2: rule__ServidorAlmacenamiento__Group_3__1__Impl
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
    // InternalMyDsl.g:3438:1: rule__ServidorAlmacenamiento__Group_3__1__Impl : ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3442:1: ( ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:3443:1: ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3443:1: ( ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:3444:2: ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:3445:2: ( rule__ServidorAlmacenamiento__TamanioAssignment_3_1 )
            // InternalMyDsl.g:3445:3: rule__ServidorAlmacenamiento__TamanioAssignment_3_1
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
    // InternalMyDsl.g:3454:1: rule__ServidorAlmacenamiento__Group_4__0 : rule__ServidorAlmacenamiento__Group_4__0__Impl rule__ServidorAlmacenamiento__Group_4__1 ;
    public final void rule__ServidorAlmacenamiento__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3458:1: ( rule__ServidorAlmacenamiento__Group_4__0__Impl rule__ServidorAlmacenamiento__Group_4__1 )
            // InternalMyDsl.g:3459:2: rule__ServidorAlmacenamiento__Group_4__0__Impl rule__ServidorAlmacenamiento__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3466:1: rule__ServidorAlmacenamiento__Group_4__0__Impl : ( 'tamanioInicial' ) ;
    public final void rule__ServidorAlmacenamiento__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3470:1: ( ( 'tamanioInicial' ) )
            // InternalMyDsl.g:3471:1: ( 'tamanioInicial' )
            {
            // InternalMyDsl.g:3471:1: ( 'tamanioInicial' )
            // InternalMyDsl.g:3472:2: 'tamanioInicial'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:3481:1: rule__ServidorAlmacenamiento__Group_4__1 : rule__ServidorAlmacenamiento__Group_4__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3485:1: ( rule__ServidorAlmacenamiento__Group_4__1__Impl )
            // InternalMyDsl.g:3486:2: rule__ServidorAlmacenamiento__Group_4__1__Impl
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
    // InternalMyDsl.g:3492:1: rule__ServidorAlmacenamiento__Group_4__1__Impl : ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3496:1: ( ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) ) )
            // InternalMyDsl.g:3497:1: ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3497:1: ( ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 ) )
            // InternalMyDsl.g:3498:2: ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialAssignment_4_1()); 
            // InternalMyDsl.g:3499:2: ( rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 )
            // InternalMyDsl.g:3499:3: rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1
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
    // InternalMyDsl.g:3508:1: rule__ServidorAlmacenamiento__Group_5__0 : rule__ServidorAlmacenamiento__Group_5__0__Impl rule__ServidorAlmacenamiento__Group_5__1 ;
    public final void rule__ServidorAlmacenamiento__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3512:1: ( rule__ServidorAlmacenamiento__Group_5__0__Impl rule__ServidorAlmacenamiento__Group_5__1 )
            // InternalMyDsl.g:3513:2: rule__ServidorAlmacenamiento__Group_5__0__Impl rule__ServidorAlmacenamiento__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3520:1: rule__ServidorAlmacenamiento__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3524:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:3525:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:3525:1: ( 'conexiones' )
            // InternalMyDsl.g:3526:2: 'conexiones'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3535:1: rule__ServidorAlmacenamiento__Group_5__1 : rule__ServidorAlmacenamiento__Group_5__1__Impl rule__ServidorAlmacenamiento__Group_5__2 ;
    public final void rule__ServidorAlmacenamiento__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( rule__ServidorAlmacenamiento__Group_5__1__Impl rule__ServidorAlmacenamiento__Group_5__2 )
            // InternalMyDsl.g:3540:2: rule__ServidorAlmacenamiento__Group_5__1__Impl rule__ServidorAlmacenamiento__Group_5__2
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
    // InternalMyDsl.g:3547:1: rule__ServidorAlmacenamiento__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3551:1: ( ( '(' ) )
            // InternalMyDsl.g:3552:1: ( '(' )
            {
            // InternalMyDsl.g:3552:1: ( '(' )
            // InternalMyDsl.g:3553:2: '('
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:3562:1: rule__ServidorAlmacenamiento__Group_5__2 : rule__ServidorAlmacenamiento__Group_5__2__Impl rule__ServidorAlmacenamiento__Group_5__3 ;
    public final void rule__ServidorAlmacenamiento__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3566:1: ( rule__ServidorAlmacenamiento__Group_5__2__Impl rule__ServidorAlmacenamiento__Group_5__3 )
            // InternalMyDsl.g:3567:2: rule__ServidorAlmacenamiento__Group_5__2__Impl rule__ServidorAlmacenamiento__Group_5__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3574:1: rule__ServidorAlmacenamiento__Group_5__2__Impl : ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3578:1: ( ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:3579:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:3579:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:3580:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:3581:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:3581:3: rule__ServidorAlmacenamiento__ConexionesAssignment_5_2
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
    // InternalMyDsl.g:3589:1: rule__ServidorAlmacenamiento__Group_5__3 : rule__ServidorAlmacenamiento__Group_5__3__Impl rule__ServidorAlmacenamiento__Group_5__4 ;
    public final void rule__ServidorAlmacenamiento__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3593:1: ( rule__ServidorAlmacenamiento__Group_5__3__Impl rule__ServidorAlmacenamiento__Group_5__4 )
            // InternalMyDsl.g:3594:2: rule__ServidorAlmacenamiento__Group_5__3__Impl rule__ServidorAlmacenamiento__Group_5__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3601:1: rule__ServidorAlmacenamiento__Group_5__3__Impl : ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3605:1: ( ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* ) )
            // InternalMyDsl.g:3606:1: ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:3606:1: ( ( rule__ServidorAlmacenamiento__Group_5_3__0 )* )
            // InternalMyDsl.g:3607:2: ( rule__ServidorAlmacenamiento__Group_5_3__0 )*
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_5_3()); 
            // InternalMyDsl.g:3608:2: ( rule__ServidorAlmacenamiento__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:3608:3: rule__ServidorAlmacenamiento__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ServidorAlmacenamiento__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMyDsl.g:3616:1: rule__ServidorAlmacenamiento__Group_5__4 : rule__ServidorAlmacenamiento__Group_5__4__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3620:1: ( rule__ServidorAlmacenamiento__Group_5__4__Impl )
            // InternalMyDsl.g:3621:2: rule__ServidorAlmacenamiento__Group_5__4__Impl
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
    // InternalMyDsl.g:3627:1: rule__ServidorAlmacenamiento__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3631:1: ( ( ')' ) )
            // InternalMyDsl.g:3632:1: ( ')' )
            {
            // InternalMyDsl.g:3632:1: ( ')' )
            // InternalMyDsl.g:3633:2: ')'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getRightParenthesisKeyword_5_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:3643:1: rule__ServidorAlmacenamiento__Group_5_3__0 : rule__ServidorAlmacenamiento__Group_5_3__0__Impl rule__ServidorAlmacenamiento__Group_5_3__1 ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3647:1: ( rule__ServidorAlmacenamiento__Group_5_3__0__Impl rule__ServidorAlmacenamiento__Group_5_3__1 )
            // InternalMyDsl.g:3648:2: rule__ServidorAlmacenamiento__Group_5_3__0__Impl rule__ServidorAlmacenamiento__Group_5_3__1
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
    // InternalMyDsl.g:3655:1: rule__ServidorAlmacenamiento__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3659:1: ( ( ',' ) )
            // InternalMyDsl.g:3660:1: ( ',' )
            {
            // InternalMyDsl.g:3660:1: ( ',' )
            // InternalMyDsl.g:3661:2: ','
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
    // InternalMyDsl.g:3670:1: rule__ServidorAlmacenamiento__Group_5_3__1 : rule__ServidorAlmacenamiento__Group_5_3__1__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( rule__ServidorAlmacenamiento__Group_5_3__1__Impl )
            // InternalMyDsl.g:3675:2: rule__ServidorAlmacenamiento__Group_5_3__1__Impl
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
    // InternalMyDsl.g:3681:1: rule__ServidorAlmacenamiento__Group_5_3__1__Impl : ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:3686:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:3686:1: ( ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:3687:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:3688:2: ( rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:3688:3: rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1
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
    // InternalMyDsl.g:3697:1: rule__BaseDatosSQL__Group__0 : rule__BaseDatosSQL__Group__0__Impl rule__BaseDatosSQL__Group__1 ;
    public final void rule__BaseDatosSQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3701:1: ( rule__BaseDatosSQL__Group__0__Impl rule__BaseDatosSQL__Group__1 )
            // InternalMyDsl.g:3702:2: rule__BaseDatosSQL__Group__0__Impl rule__BaseDatosSQL__Group__1
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
    // InternalMyDsl.g:3709:1: rule__BaseDatosSQL__Group__0__Impl : ( 'BaseDatosSQL' ) ;
    public final void rule__BaseDatosSQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3713:1: ( ( 'BaseDatosSQL' ) )
            // InternalMyDsl.g:3714:1: ( 'BaseDatosSQL' )
            {
            // InternalMyDsl.g:3714:1: ( 'BaseDatosSQL' )
            // InternalMyDsl.g:3715:2: 'BaseDatosSQL'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getBaseDatosSQLKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:3724:1: rule__BaseDatosSQL__Group__1 : rule__BaseDatosSQL__Group__1__Impl rule__BaseDatosSQL__Group__2 ;
    public final void rule__BaseDatosSQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3728:1: ( rule__BaseDatosSQL__Group__1__Impl rule__BaseDatosSQL__Group__2 )
            // InternalMyDsl.g:3729:2: rule__BaseDatosSQL__Group__1__Impl rule__BaseDatosSQL__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3736:1: rule__BaseDatosSQL__Group__1__Impl : ( '{' ) ;
    public final void rule__BaseDatosSQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3740:1: ( ( '{' ) )
            // InternalMyDsl.g:3741:1: ( '{' )
            {
            // InternalMyDsl.g:3741:1: ( '{' )
            // InternalMyDsl.g:3742:2: '{'
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
    // InternalMyDsl.g:3751:1: rule__BaseDatosSQL__Group__2 : rule__BaseDatosSQL__Group__2__Impl rule__BaseDatosSQL__Group__3 ;
    public final void rule__BaseDatosSQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( rule__BaseDatosSQL__Group__2__Impl rule__BaseDatosSQL__Group__3 )
            // InternalMyDsl.g:3756:2: rule__BaseDatosSQL__Group__2__Impl rule__BaseDatosSQL__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3763:1: rule__BaseDatosSQL__Group__2__Impl : ( ( rule__BaseDatosSQL__Group_2__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3767:1: ( ( ( rule__BaseDatosSQL__Group_2__0 )? ) )
            // InternalMyDsl.g:3768:1: ( ( rule__BaseDatosSQL__Group_2__0 )? )
            {
            // InternalMyDsl.g:3768:1: ( ( rule__BaseDatosSQL__Group_2__0 )? )
            // InternalMyDsl.g:3769:2: ( rule__BaseDatosSQL__Group_2__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_2()); 
            // InternalMyDsl.g:3770:2: ( rule__BaseDatosSQL__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3770:3: rule__BaseDatosSQL__Group_2__0
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
    // InternalMyDsl.g:3778:1: rule__BaseDatosSQL__Group__3 : rule__BaseDatosSQL__Group__3__Impl rule__BaseDatosSQL__Group__4 ;
    public final void rule__BaseDatosSQL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3782:1: ( rule__BaseDatosSQL__Group__3__Impl rule__BaseDatosSQL__Group__4 )
            // InternalMyDsl.g:3783:2: rule__BaseDatosSQL__Group__3__Impl rule__BaseDatosSQL__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3790:1: rule__BaseDatosSQL__Group__3__Impl : ( ( rule__BaseDatosSQL__Group_3__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3794:1: ( ( ( rule__BaseDatosSQL__Group_3__0 )? ) )
            // InternalMyDsl.g:3795:1: ( ( rule__BaseDatosSQL__Group_3__0 )? )
            {
            // InternalMyDsl.g:3795:1: ( ( rule__BaseDatosSQL__Group_3__0 )? )
            // InternalMyDsl.g:3796:2: ( rule__BaseDatosSQL__Group_3__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_3()); 
            // InternalMyDsl.g:3797:2: ( rule__BaseDatosSQL__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3797:3: rule__BaseDatosSQL__Group_3__0
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
    // InternalMyDsl.g:3805:1: rule__BaseDatosSQL__Group__4 : rule__BaseDatosSQL__Group__4__Impl rule__BaseDatosSQL__Group__5 ;
    public final void rule__BaseDatosSQL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( rule__BaseDatosSQL__Group__4__Impl rule__BaseDatosSQL__Group__5 )
            // InternalMyDsl.g:3810:2: rule__BaseDatosSQL__Group__4__Impl rule__BaseDatosSQL__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3817:1: rule__BaseDatosSQL__Group__4__Impl : ( ( rule__BaseDatosSQL__Group_4__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3821:1: ( ( ( rule__BaseDatosSQL__Group_4__0 )? ) )
            // InternalMyDsl.g:3822:1: ( ( rule__BaseDatosSQL__Group_4__0 )? )
            {
            // InternalMyDsl.g:3822:1: ( ( rule__BaseDatosSQL__Group_4__0 )? )
            // InternalMyDsl.g:3823:2: ( rule__BaseDatosSQL__Group_4__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_4()); 
            // InternalMyDsl.g:3824:2: ( rule__BaseDatosSQL__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3824:3: rule__BaseDatosSQL__Group_4__0
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
    // InternalMyDsl.g:3832:1: rule__BaseDatosSQL__Group__5 : rule__BaseDatosSQL__Group__5__Impl rule__BaseDatosSQL__Group__6 ;
    public final void rule__BaseDatosSQL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3836:1: ( rule__BaseDatosSQL__Group__5__Impl rule__BaseDatosSQL__Group__6 )
            // InternalMyDsl.g:3837:2: rule__BaseDatosSQL__Group__5__Impl rule__BaseDatosSQL__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3844:1: rule__BaseDatosSQL__Group__5__Impl : ( ( rule__BaseDatosSQL__Group_5__0 )? ) ;
    public final void rule__BaseDatosSQL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3848:1: ( ( ( rule__BaseDatosSQL__Group_5__0 )? ) )
            // InternalMyDsl.g:3849:1: ( ( rule__BaseDatosSQL__Group_5__0 )? )
            {
            // InternalMyDsl.g:3849:1: ( ( rule__BaseDatosSQL__Group_5__0 )? )
            // InternalMyDsl.g:3850:2: ( rule__BaseDatosSQL__Group_5__0 )?
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_5()); 
            // InternalMyDsl.g:3851:2: ( rule__BaseDatosSQL__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3851:3: rule__BaseDatosSQL__Group_5__0
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
    // InternalMyDsl.g:3859:1: rule__BaseDatosSQL__Group__6 : rule__BaseDatosSQL__Group__6__Impl rule__BaseDatosSQL__Group__7 ;
    public final void rule__BaseDatosSQL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( rule__BaseDatosSQL__Group__6__Impl rule__BaseDatosSQL__Group__7 )
            // InternalMyDsl.g:3864:2: rule__BaseDatosSQL__Group__6__Impl rule__BaseDatosSQL__Group__7
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
    // InternalMyDsl.g:3871:1: rule__BaseDatosSQL__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__BaseDatosSQL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3875:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:3876:1: ( 'vpc' )
            {
            // InternalMyDsl.g:3876:1: ( 'vpc' )
            // InternalMyDsl.g:3877:2: 'vpc'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getVpcKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3886:1: rule__BaseDatosSQL__Group__7 : rule__BaseDatosSQL__Group__7__Impl rule__BaseDatosSQL__Group__8 ;
    public final void rule__BaseDatosSQL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( rule__BaseDatosSQL__Group__7__Impl rule__BaseDatosSQL__Group__8 )
            // InternalMyDsl.g:3891:2: rule__BaseDatosSQL__Group__7__Impl rule__BaseDatosSQL__Group__8
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
    // InternalMyDsl.g:3898:1: rule__BaseDatosSQL__Group__7__Impl : ( ( rule__BaseDatosSQL__VpcAssignment_7 ) ) ;
    public final void rule__BaseDatosSQL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3902:1: ( ( ( rule__BaseDatosSQL__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:3903:1: ( ( rule__BaseDatosSQL__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:3903:1: ( ( rule__BaseDatosSQL__VpcAssignment_7 ) )
            // InternalMyDsl.g:3904:2: ( rule__BaseDatosSQL__VpcAssignment_7 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:3905:2: ( rule__BaseDatosSQL__VpcAssignment_7 )
            // InternalMyDsl.g:3905:3: rule__BaseDatosSQL__VpcAssignment_7
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
    // InternalMyDsl.g:3913:1: rule__BaseDatosSQL__Group__8 : rule__BaseDatosSQL__Group__8__Impl ;
    public final void rule__BaseDatosSQL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3917:1: ( rule__BaseDatosSQL__Group__8__Impl )
            // InternalMyDsl.g:3918:2: rule__BaseDatosSQL__Group__8__Impl
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
    // InternalMyDsl.g:3924:1: rule__BaseDatosSQL__Group__8__Impl : ( '}' ) ;
    public final void rule__BaseDatosSQL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3928:1: ( ( '}' ) )
            // InternalMyDsl.g:3929:1: ( '}' )
            {
            // InternalMyDsl.g:3929:1: ( '}' )
            // InternalMyDsl.g:3930:2: '}'
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
    // InternalMyDsl.g:3940:1: rule__BaseDatosSQL__Group_2__0 : rule__BaseDatosSQL__Group_2__0__Impl rule__BaseDatosSQL__Group_2__1 ;
    public final void rule__BaseDatosSQL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( rule__BaseDatosSQL__Group_2__0__Impl rule__BaseDatosSQL__Group_2__1 )
            // InternalMyDsl.g:3945:2: rule__BaseDatosSQL__Group_2__0__Impl rule__BaseDatosSQL__Group_2__1
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
    // InternalMyDsl.g:3952:1: rule__BaseDatosSQL__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__BaseDatosSQL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3956:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:3957:1: ( 'nombre' )
            {
            // InternalMyDsl.g:3957:1: ( 'nombre' )
            // InternalMyDsl.g:3958:2: 'nombre'
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
    // InternalMyDsl.g:3967:1: rule__BaseDatosSQL__Group_2__1 : rule__BaseDatosSQL__Group_2__1__Impl ;
    public final void rule__BaseDatosSQL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( rule__BaseDatosSQL__Group_2__1__Impl )
            // InternalMyDsl.g:3972:2: rule__BaseDatosSQL__Group_2__1__Impl
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
    // InternalMyDsl.g:3978:1: rule__BaseDatosSQL__Group_2__1__Impl : ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:3983:1: ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3983:1: ( ( rule__BaseDatosSQL__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:3984:2: ( rule__BaseDatosSQL__NombreAssignment_2_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:3985:2: ( rule__BaseDatosSQL__NombreAssignment_2_1 )
            // InternalMyDsl.g:3985:3: rule__BaseDatosSQL__NombreAssignment_2_1
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
    // InternalMyDsl.g:3994:1: rule__BaseDatosSQL__Group_3__0 : rule__BaseDatosSQL__Group_3__0__Impl rule__BaseDatosSQL__Group_3__1 ;
    public final void rule__BaseDatosSQL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3998:1: ( rule__BaseDatosSQL__Group_3__0__Impl rule__BaseDatosSQL__Group_3__1 )
            // InternalMyDsl.g:3999:2: rule__BaseDatosSQL__Group_3__0__Impl rule__BaseDatosSQL__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:4006:1: rule__BaseDatosSQL__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__BaseDatosSQL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4010:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:4011:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:4011:1: ( 'tamanio' )
            // InternalMyDsl.g:4012:2: 'tamanio'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getTamanioKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:4021:1: rule__BaseDatosSQL__Group_3__1 : rule__BaseDatosSQL__Group_3__1__Impl ;
    public final void rule__BaseDatosSQL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4025:1: ( rule__BaseDatosSQL__Group_3__1__Impl )
            // InternalMyDsl.g:4026:2: rule__BaseDatosSQL__Group_3__1__Impl
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
    // InternalMyDsl.g:4032:1: rule__BaseDatosSQL__Group_3__1__Impl : ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4036:1: ( ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:4037:1: ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4037:1: ( ( rule__BaseDatosSQL__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:4038:2: ( rule__BaseDatosSQL__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:4039:2: ( rule__BaseDatosSQL__TamanioAssignment_3_1 )
            // InternalMyDsl.g:4039:3: rule__BaseDatosSQL__TamanioAssignment_3_1
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
    // InternalMyDsl.g:4048:1: rule__BaseDatosSQL__Group_4__0 : rule__BaseDatosSQL__Group_4__0__Impl rule__BaseDatosSQL__Group_4__1 ;
    public final void rule__BaseDatosSQL__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4052:1: ( rule__BaseDatosSQL__Group_4__0__Impl rule__BaseDatosSQL__Group_4__1 )
            // InternalMyDsl.g:4053:2: rule__BaseDatosSQL__Group_4__0__Impl rule__BaseDatosSQL__Group_4__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:4060:1: rule__BaseDatosSQL__Group_4__0__Impl : ( 'manejador' ) ;
    public final void rule__BaseDatosSQL__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4064:1: ( ( 'manejador' ) )
            // InternalMyDsl.g:4065:1: ( 'manejador' )
            {
            // InternalMyDsl.g:4065:1: ( 'manejador' )
            // InternalMyDsl.g:4066:2: 'manejador'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getManejadorKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4075:1: rule__BaseDatosSQL__Group_4__1 : rule__BaseDatosSQL__Group_4__1__Impl ;
    public final void rule__BaseDatosSQL__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( rule__BaseDatosSQL__Group_4__1__Impl )
            // InternalMyDsl.g:4080:2: rule__BaseDatosSQL__Group_4__1__Impl
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
    // InternalMyDsl.g:4086:1: rule__BaseDatosSQL__Group_4__1__Impl : ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4090:1: ( ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) ) )
            // InternalMyDsl.g:4091:1: ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4091:1: ( ( rule__BaseDatosSQL__ManejadorAssignment_4_1 ) )
            // InternalMyDsl.g:4092:2: ( rule__BaseDatosSQL__ManejadorAssignment_4_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getManejadorAssignment_4_1()); 
            // InternalMyDsl.g:4093:2: ( rule__BaseDatosSQL__ManejadorAssignment_4_1 )
            // InternalMyDsl.g:4093:3: rule__BaseDatosSQL__ManejadorAssignment_4_1
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
    // InternalMyDsl.g:4102:1: rule__BaseDatosSQL__Group_5__0 : rule__BaseDatosSQL__Group_5__0__Impl rule__BaseDatosSQL__Group_5__1 ;
    public final void rule__BaseDatosSQL__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( rule__BaseDatosSQL__Group_5__0__Impl rule__BaseDatosSQL__Group_5__1 )
            // InternalMyDsl.g:4107:2: rule__BaseDatosSQL__Group_5__0__Impl rule__BaseDatosSQL__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:4114:1: rule__BaseDatosSQL__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__BaseDatosSQL__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4118:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:4119:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:4119:1: ( 'conexiones' )
            // InternalMyDsl.g:4120:2: 'conexiones'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:4129:1: rule__BaseDatosSQL__Group_5__1 : rule__BaseDatosSQL__Group_5__1__Impl rule__BaseDatosSQL__Group_5__2 ;
    public final void rule__BaseDatosSQL__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( rule__BaseDatosSQL__Group_5__1__Impl rule__BaseDatosSQL__Group_5__2 )
            // InternalMyDsl.g:4134:2: rule__BaseDatosSQL__Group_5__1__Impl rule__BaseDatosSQL__Group_5__2
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
    // InternalMyDsl.g:4141:1: rule__BaseDatosSQL__Group_5__1__Impl : ( '(' ) ;
    public final void rule__BaseDatosSQL__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4145:1: ( ( '(' ) )
            // InternalMyDsl.g:4146:1: ( '(' )
            {
            // InternalMyDsl.g:4146:1: ( '(' )
            // InternalMyDsl.g:4147:2: '('
            {
             before(grammarAccess.getBaseDatosSQLAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4156:1: rule__BaseDatosSQL__Group_5__2 : rule__BaseDatosSQL__Group_5__2__Impl rule__BaseDatosSQL__Group_5__3 ;
    public final void rule__BaseDatosSQL__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4160:1: ( rule__BaseDatosSQL__Group_5__2__Impl rule__BaseDatosSQL__Group_5__3 )
            // InternalMyDsl.g:4161:2: rule__BaseDatosSQL__Group_5__2__Impl rule__BaseDatosSQL__Group_5__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:4168:1: rule__BaseDatosSQL__Group_5__2__Impl : ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) ) ;
    public final void rule__BaseDatosSQL__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4172:1: ( ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:4173:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:4173:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:4174:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:4175:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:4175:3: rule__BaseDatosSQL__ConexionesAssignment_5_2
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
    // InternalMyDsl.g:4183:1: rule__BaseDatosSQL__Group_5__3 : rule__BaseDatosSQL__Group_5__3__Impl rule__BaseDatosSQL__Group_5__4 ;
    public final void rule__BaseDatosSQL__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4187:1: ( rule__BaseDatosSQL__Group_5__3__Impl rule__BaseDatosSQL__Group_5__4 )
            // InternalMyDsl.g:4188:2: rule__BaseDatosSQL__Group_5__3__Impl rule__BaseDatosSQL__Group_5__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:4195:1: rule__BaseDatosSQL__Group_5__3__Impl : ( ( rule__BaseDatosSQL__Group_5_3__0 )* ) ;
    public final void rule__BaseDatosSQL__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4199:1: ( ( ( rule__BaseDatosSQL__Group_5_3__0 )* ) )
            // InternalMyDsl.g:4200:1: ( ( rule__BaseDatosSQL__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:4200:1: ( ( rule__BaseDatosSQL__Group_5_3__0 )* )
            // InternalMyDsl.g:4201:2: ( rule__BaseDatosSQL__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseDatosSQLAccess().getGroup_5_3()); 
            // InternalMyDsl.g:4202:2: ( rule__BaseDatosSQL__Group_5_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:4202:3: rule__BaseDatosSQL__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BaseDatosSQL__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyDsl.g:4210:1: rule__BaseDatosSQL__Group_5__4 : rule__BaseDatosSQL__Group_5__4__Impl ;
    public final void rule__BaseDatosSQL__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4214:1: ( rule__BaseDatosSQL__Group_5__4__Impl )
            // InternalMyDsl.g:4215:2: rule__BaseDatosSQL__Group_5__4__Impl
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
    // InternalMyDsl.g:4221:1: rule__BaseDatosSQL__Group_5__4__Impl : ( ')' ) ;
    public final void rule__BaseDatosSQL__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4225:1: ( ( ')' ) )
            // InternalMyDsl.g:4226:1: ( ')' )
            {
            // InternalMyDsl.g:4226:1: ( ')' )
            // InternalMyDsl.g:4227:2: ')'
            {
             before(grammarAccess.getBaseDatosSQLAccess().getRightParenthesisKeyword_5_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4237:1: rule__BaseDatosSQL__Group_5_3__0 : rule__BaseDatosSQL__Group_5_3__0__Impl rule__BaseDatosSQL__Group_5_3__1 ;
    public final void rule__BaseDatosSQL__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( rule__BaseDatosSQL__Group_5_3__0__Impl rule__BaseDatosSQL__Group_5_3__1 )
            // InternalMyDsl.g:4242:2: rule__BaseDatosSQL__Group_5_3__0__Impl rule__BaseDatosSQL__Group_5_3__1
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
    // InternalMyDsl.g:4249:1: rule__BaseDatosSQL__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseDatosSQL__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4253:1: ( ( ',' ) )
            // InternalMyDsl.g:4254:1: ( ',' )
            {
            // InternalMyDsl.g:4254:1: ( ',' )
            // InternalMyDsl.g:4255:2: ','
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
    // InternalMyDsl.g:4264:1: rule__BaseDatosSQL__Group_5_3__1 : rule__BaseDatosSQL__Group_5_3__1__Impl ;
    public final void rule__BaseDatosSQL__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( rule__BaseDatosSQL__Group_5_3__1__Impl )
            // InternalMyDsl.g:4269:2: rule__BaseDatosSQL__Group_5_3__1__Impl
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
    // InternalMyDsl.g:4275:1: rule__BaseDatosSQL__Group_5_3__1__Impl : ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__BaseDatosSQL__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:4280:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:4280:1: ( ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:4281:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:4282:2: ( rule__BaseDatosSQL__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:4282:3: rule__BaseDatosSQL__ConexionesAssignment_5_3_1
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
    // InternalMyDsl.g:4291:1: rule__BaseDatosNoSQL__Group__0 : rule__BaseDatosNoSQL__Group__0__Impl rule__BaseDatosNoSQL__Group__1 ;
    public final void rule__BaseDatosNoSQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( rule__BaseDatosNoSQL__Group__0__Impl rule__BaseDatosNoSQL__Group__1 )
            // InternalMyDsl.g:4296:2: rule__BaseDatosNoSQL__Group__0__Impl rule__BaseDatosNoSQL__Group__1
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
    // InternalMyDsl.g:4303:1: rule__BaseDatosNoSQL__Group__0__Impl : ( 'BaseDatosNoSQL' ) ;
    public final void rule__BaseDatosNoSQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4307:1: ( ( 'BaseDatosNoSQL' ) )
            // InternalMyDsl.g:4308:1: ( 'BaseDatosNoSQL' )
            {
            // InternalMyDsl.g:4308:1: ( 'BaseDatosNoSQL' )
            // InternalMyDsl.g:4309:2: 'BaseDatosNoSQL'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getBaseDatosNoSQLKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:4318:1: rule__BaseDatosNoSQL__Group__1 : rule__BaseDatosNoSQL__Group__1__Impl rule__BaseDatosNoSQL__Group__2 ;
    public final void rule__BaseDatosNoSQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4322:1: ( rule__BaseDatosNoSQL__Group__1__Impl rule__BaseDatosNoSQL__Group__2 )
            // InternalMyDsl.g:4323:2: rule__BaseDatosNoSQL__Group__1__Impl rule__BaseDatosNoSQL__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4330:1: rule__BaseDatosNoSQL__Group__1__Impl : ( '{' ) ;
    public final void rule__BaseDatosNoSQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4334:1: ( ( '{' ) )
            // InternalMyDsl.g:4335:1: ( '{' )
            {
            // InternalMyDsl.g:4335:1: ( '{' )
            // InternalMyDsl.g:4336:2: '{'
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
    // InternalMyDsl.g:4345:1: rule__BaseDatosNoSQL__Group__2 : rule__BaseDatosNoSQL__Group__2__Impl rule__BaseDatosNoSQL__Group__3 ;
    public final void rule__BaseDatosNoSQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4349:1: ( rule__BaseDatosNoSQL__Group__2__Impl rule__BaseDatosNoSQL__Group__3 )
            // InternalMyDsl.g:4350:2: rule__BaseDatosNoSQL__Group__2__Impl rule__BaseDatosNoSQL__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4357:1: rule__BaseDatosNoSQL__Group__2__Impl : ( ( rule__BaseDatosNoSQL__Group_2__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4361:1: ( ( ( rule__BaseDatosNoSQL__Group_2__0 )? ) )
            // InternalMyDsl.g:4362:1: ( ( rule__BaseDatosNoSQL__Group_2__0 )? )
            {
            // InternalMyDsl.g:4362:1: ( ( rule__BaseDatosNoSQL__Group_2__0 )? )
            // InternalMyDsl.g:4363:2: ( rule__BaseDatosNoSQL__Group_2__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_2()); 
            // InternalMyDsl.g:4364:2: ( rule__BaseDatosNoSQL__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:4364:3: rule__BaseDatosNoSQL__Group_2__0
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
    // InternalMyDsl.g:4372:1: rule__BaseDatosNoSQL__Group__3 : rule__BaseDatosNoSQL__Group__3__Impl rule__BaseDatosNoSQL__Group__4 ;
    public final void rule__BaseDatosNoSQL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4376:1: ( rule__BaseDatosNoSQL__Group__3__Impl rule__BaseDatosNoSQL__Group__4 )
            // InternalMyDsl.g:4377:2: rule__BaseDatosNoSQL__Group__3__Impl rule__BaseDatosNoSQL__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4384:1: rule__BaseDatosNoSQL__Group__3__Impl : ( ( rule__BaseDatosNoSQL__Group_3__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4388:1: ( ( ( rule__BaseDatosNoSQL__Group_3__0 )? ) )
            // InternalMyDsl.g:4389:1: ( ( rule__BaseDatosNoSQL__Group_3__0 )? )
            {
            // InternalMyDsl.g:4389:1: ( ( rule__BaseDatosNoSQL__Group_3__0 )? )
            // InternalMyDsl.g:4390:2: ( rule__BaseDatosNoSQL__Group_3__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_3()); 
            // InternalMyDsl.g:4391:2: ( rule__BaseDatosNoSQL__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4391:3: rule__BaseDatosNoSQL__Group_3__0
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
    // InternalMyDsl.g:4399:1: rule__BaseDatosNoSQL__Group__4 : rule__BaseDatosNoSQL__Group__4__Impl rule__BaseDatosNoSQL__Group__5 ;
    public final void rule__BaseDatosNoSQL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4403:1: ( rule__BaseDatosNoSQL__Group__4__Impl rule__BaseDatosNoSQL__Group__5 )
            // InternalMyDsl.g:4404:2: rule__BaseDatosNoSQL__Group__4__Impl rule__BaseDatosNoSQL__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4411:1: rule__BaseDatosNoSQL__Group__4__Impl : ( ( rule__BaseDatosNoSQL__Group_4__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4415:1: ( ( ( rule__BaseDatosNoSQL__Group_4__0 )? ) )
            // InternalMyDsl.g:4416:1: ( ( rule__BaseDatosNoSQL__Group_4__0 )? )
            {
            // InternalMyDsl.g:4416:1: ( ( rule__BaseDatosNoSQL__Group_4__0 )? )
            // InternalMyDsl.g:4417:2: ( rule__BaseDatosNoSQL__Group_4__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_4()); 
            // InternalMyDsl.g:4418:2: ( rule__BaseDatosNoSQL__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:4418:3: rule__BaseDatosNoSQL__Group_4__0
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
    // InternalMyDsl.g:4426:1: rule__BaseDatosNoSQL__Group__5 : rule__BaseDatosNoSQL__Group__5__Impl rule__BaseDatosNoSQL__Group__6 ;
    public final void rule__BaseDatosNoSQL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4430:1: ( rule__BaseDatosNoSQL__Group__5__Impl rule__BaseDatosNoSQL__Group__6 )
            // InternalMyDsl.g:4431:2: rule__BaseDatosNoSQL__Group__5__Impl rule__BaseDatosNoSQL__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4438:1: rule__BaseDatosNoSQL__Group__5__Impl : ( ( rule__BaseDatosNoSQL__Group_5__0 )? ) ;
    public final void rule__BaseDatosNoSQL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4442:1: ( ( ( rule__BaseDatosNoSQL__Group_5__0 )? ) )
            // InternalMyDsl.g:4443:1: ( ( rule__BaseDatosNoSQL__Group_5__0 )? )
            {
            // InternalMyDsl.g:4443:1: ( ( rule__BaseDatosNoSQL__Group_5__0 )? )
            // InternalMyDsl.g:4444:2: ( rule__BaseDatosNoSQL__Group_5__0 )?
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_5()); 
            // InternalMyDsl.g:4445:2: ( rule__BaseDatosNoSQL__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:4445:3: rule__BaseDatosNoSQL__Group_5__0
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
    // InternalMyDsl.g:4453:1: rule__BaseDatosNoSQL__Group__6 : rule__BaseDatosNoSQL__Group__6__Impl rule__BaseDatosNoSQL__Group__7 ;
    public final void rule__BaseDatosNoSQL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( rule__BaseDatosNoSQL__Group__6__Impl rule__BaseDatosNoSQL__Group__7 )
            // InternalMyDsl.g:4458:2: rule__BaseDatosNoSQL__Group__6__Impl rule__BaseDatosNoSQL__Group__7
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
    // InternalMyDsl.g:4465:1: rule__BaseDatosNoSQL__Group__6__Impl : ( 'vpc' ) ;
    public final void rule__BaseDatosNoSQL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4469:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:4470:1: ( 'vpc' )
            {
            // InternalMyDsl.g:4470:1: ( 'vpc' )
            // InternalMyDsl.g:4471:2: 'vpc'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getVpcKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:4480:1: rule__BaseDatosNoSQL__Group__7 : rule__BaseDatosNoSQL__Group__7__Impl rule__BaseDatosNoSQL__Group__8 ;
    public final void rule__BaseDatosNoSQL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4484:1: ( rule__BaseDatosNoSQL__Group__7__Impl rule__BaseDatosNoSQL__Group__8 )
            // InternalMyDsl.g:4485:2: rule__BaseDatosNoSQL__Group__7__Impl rule__BaseDatosNoSQL__Group__8
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
    // InternalMyDsl.g:4492:1: rule__BaseDatosNoSQL__Group__7__Impl : ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) ) ;
    public final void rule__BaseDatosNoSQL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4496:1: ( ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) ) )
            // InternalMyDsl.g:4497:1: ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) )
            {
            // InternalMyDsl.g:4497:1: ( ( rule__BaseDatosNoSQL__VpcAssignment_7 ) )
            // InternalMyDsl.g:4498:2: ( rule__BaseDatosNoSQL__VpcAssignment_7 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getVpcAssignment_7()); 
            // InternalMyDsl.g:4499:2: ( rule__BaseDatosNoSQL__VpcAssignment_7 )
            // InternalMyDsl.g:4499:3: rule__BaseDatosNoSQL__VpcAssignment_7
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
    // InternalMyDsl.g:4507:1: rule__BaseDatosNoSQL__Group__8 : rule__BaseDatosNoSQL__Group__8__Impl ;
    public final void rule__BaseDatosNoSQL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4511:1: ( rule__BaseDatosNoSQL__Group__8__Impl )
            // InternalMyDsl.g:4512:2: rule__BaseDatosNoSQL__Group__8__Impl
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
    // InternalMyDsl.g:4518:1: rule__BaseDatosNoSQL__Group__8__Impl : ( '}' ) ;
    public final void rule__BaseDatosNoSQL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4522:1: ( ( '}' ) )
            // InternalMyDsl.g:4523:1: ( '}' )
            {
            // InternalMyDsl.g:4523:1: ( '}' )
            // InternalMyDsl.g:4524:2: '}'
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
    // InternalMyDsl.g:4534:1: rule__BaseDatosNoSQL__Group_2__0 : rule__BaseDatosNoSQL__Group_2__0__Impl rule__BaseDatosNoSQL__Group_2__1 ;
    public final void rule__BaseDatosNoSQL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4538:1: ( rule__BaseDatosNoSQL__Group_2__0__Impl rule__BaseDatosNoSQL__Group_2__1 )
            // InternalMyDsl.g:4539:2: rule__BaseDatosNoSQL__Group_2__0__Impl rule__BaseDatosNoSQL__Group_2__1
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
    // InternalMyDsl.g:4546:1: rule__BaseDatosNoSQL__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__BaseDatosNoSQL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4550:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:4551:1: ( 'nombre' )
            {
            // InternalMyDsl.g:4551:1: ( 'nombre' )
            // InternalMyDsl.g:4552:2: 'nombre'
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
    // InternalMyDsl.g:4561:1: rule__BaseDatosNoSQL__Group_2__1 : rule__BaseDatosNoSQL__Group_2__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4565:1: ( rule__BaseDatosNoSQL__Group_2__1__Impl )
            // InternalMyDsl.g:4566:2: rule__BaseDatosNoSQL__Group_2__1__Impl
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
    // InternalMyDsl.g:4572:1: rule__BaseDatosNoSQL__Group_2__1__Impl : ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:4577:1: ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:4577:1: ( ( rule__BaseDatosNoSQL__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:4578:2: ( rule__BaseDatosNoSQL__NombreAssignment_2_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:4579:2: ( rule__BaseDatosNoSQL__NombreAssignment_2_1 )
            // InternalMyDsl.g:4579:3: rule__BaseDatosNoSQL__NombreAssignment_2_1
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
    // InternalMyDsl.g:4588:1: rule__BaseDatosNoSQL__Group_3__0 : rule__BaseDatosNoSQL__Group_3__0__Impl rule__BaseDatosNoSQL__Group_3__1 ;
    public final void rule__BaseDatosNoSQL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4592:1: ( rule__BaseDatosNoSQL__Group_3__0__Impl rule__BaseDatosNoSQL__Group_3__1 )
            // InternalMyDsl.g:4593:2: rule__BaseDatosNoSQL__Group_3__0__Impl rule__BaseDatosNoSQL__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:4600:1: rule__BaseDatosNoSQL__Group_3__0__Impl : ( 'tamanio' ) ;
    public final void rule__BaseDatosNoSQL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4604:1: ( ( 'tamanio' ) )
            // InternalMyDsl.g:4605:1: ( 'tamanio' )
            {
            // InternalMyDsl.g:4605:1: ( 'tamanio' )
            // InternalMyDsl.g:4606:2: 'tamanio'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getTamanioKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:4615:1: rule__BaseDatosNoSQL__Group_3__1 : rule__BaseDatosNoSQL__Group_3__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4619:1: ( rule__BaseDatosNoSQL__Group_3__1__Impl )
            // InternalMyDsl.g:4620:2: rule__BaseDatosNoSQL__Group_3__1__Impl
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
    // InternalMyDsl.g:4626:1: rule__BaseDatosNoSQL__Group_3__1__Impl : ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) ) )
            // InternalMyDsl.g:4631:1: ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4631:1: ( ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 ) )
            // InternalMyDsl.g:4632:2: ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getTamanioAssignment_3_1()); 
            // InternalMyDsl.g:4633:2: ( rule__BaseDatosNoSQL__TamanioAssignment_3_1 )
            // InternalMyDsl.g:4633:3: rule__BaseDatosNoSQL__TamanioAssignment_3_1
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
    // InternalMyDsl.g:4642:1: rule__BaseDatosNoSQL__Group_4__0 : rule__BaseDatosNoSQL__Group_4__0__Impl rule__BaseDatosNoSQL__Group_4__1 ;
    public final void rule__BaseDatosNoSQL__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4646:1: ( rule__BaseDatosNoSQL__Group_4__0__Impl rule__BaseDatosNoSQL__Group_4__1 )
            // InternalMyDsl.g:4647:2: rule__BaseDatosNoSQL__Group_4__0__Impl rule__BaseDatosNoSQL__Group_4__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:4654:1: rule__BaseDatosNoSQL__Group_4__0__Impl : ( 'manejador' ) ;
    public final void rule__BaseDatosNoSQL__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4658:1: ( ( 'manejador' ) )
            // InternalMyDsl.g:4659:1: ( 'manejador' )
            {
            // InternalMyDsl.g:4659:1: ( 'manejador' )
            // InternalMyDsl.g:4660:2: 'manejador'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getManejadorKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4669:1: rule__BaseDatosNoSQL__Group_4__1 : rule__BaseDatosNoSQL__Group_4__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4673:1: ( rule__BaseDatosNoSQL__Group_4__1__Impl )
            // InternalMyDsl.g:4674:2: rule__BaseDatosNoSQL__Group_4__1__Impl
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
    // InternalMyDsl.g:4680:1: rule__BaseDatosNoSQL__Group_4__1__Impl : ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4684:1: ( ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) ) )
            // InternalMyDsl.g:4685:1: ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4685:1: ( ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 ) )
            // InternalMyDsl.g:4686:2: ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getManejadorAssignment_4_1()); 
            // InternalMyDsl.g:4687:2: ( rule__BaseDatosNoSQL__ManejadorAssignment_4_1 )
            // InternalMyDsl.g:4687:3: rule__BaseDatosNoSQL__ManejadorAssignment_4_1
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
    // InternalMyDsl.g:4696:1: rule__BaseDatosNoSQL__Group_5__0 : rule__BaseDatosNoSQL__Group_5__0__Impl rule__BaseDatosNoSQL__Group_5__1 ;
    public final void rule__BaseDatosNoSQL__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4700:1: ( rule__BaseDatosNoSQL__Group_5__0__Impl rule__BaseDatosNoSQL__Group_5__1 )
            // InternalMyDsl.g:4701:2: rule__BaseDatosNoSQL__Group_5__0__Impl rule__BaseDatosNoSQL__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:4708:1: rule__BaseDatosNoSQL__Group_5__0__Impl : ( 'conexiones' ) ;
    public final void rule__BaseDatosNoSQL__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4712:1: ( ( 'conexiones' ) )
            // InternalMyDsl.g:4713:1: ( 'conexiones' )
            {
            // InternalMyDsl.g:4713:1: ( 'conexiones' )
            // InternalMyDsl.g:4714:2: 'conexiones'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:4723:1: rule__BaseDatosNoSQL__Group_5__1 : rule__BaseDatosNoSQL__Group_5__1__Impl rule__BaseDatosNoSQL__Group_5__2 ;
    public final void rule__BaseDatosNoSQL__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( rule__BaseDatosNoSQL__Group_5__1__Impl rule__BaseDatosNoSQL__Group_5__2 )
            // InternalMyDsl.g:4728:2: rule__BaseDatosNoSQL__Group_5__1__Impl rule__BaseDatosNoSQL__Group_5__2
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
    // InternalMyDsl.g:4735:1: rule__BaseDatosNoSQL__Group_5__1__Impl : ( '(' ) ;
    public final void rule__BaseDatosNoSQL__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4739:1: ( ( '(' ) )
            // InternalMyDsl.g:4740:1: ( '(' )
            {
            // InternalMyDsl.g:4740:1: ( '(' )
            // InternalMyDsl.g:4741:2: '('
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4750:1: rule__BaseDatosNoSQL__Group_5__2 : rule__BaseDatosNoSQL__Group_5__2__Impl rule__BaseDatosNoSQL__Group_5__3 ;
    public final void rule__BaseDatosNoSQL__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4754:1: ( rule__BaseDatosNoSQL__Group_5__2__Impl rule__BaseDatosNoSQL__Group_5__3 )
            // InternalMyDsl.g:4755:2: rule__BaseDatosNoSQL__Group_5__2__Impl rule__BaseDatosNoSQL__Group_5__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:4762:1: rule__BaseDatosNoSQL__Group_5__2__Impl : ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4766:1: ( ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) ) )
            // InternalMyDsl.g:4767:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) )
            {
            // InternalMyDsl.g:4767:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 ) )
            // InternalMyDsl.g:4768:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesAssignment_5_2()); 
            // InternalMyDsl.g:4769:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_2 )
            // InternalMyDsl.g:4769:3: rule__BaseDatosNoSQL__ConexionesAssignment_5_2
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
    // InternalMyDsl.g:4777:1: rule__BaseDatosNoSQL__Group_5__3 : rule__BaseDatosNoSQL__Group_5__3__Impl rule__BaseDatosNoSQL__Group_5__4 ;
    public final void rule__BaseDatosNoSQL__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4781:1: ( rule__BaseDatosNoSQL__Group_5__3__Impl rule__BaseDatosNoSQL__Group_5__4 )
            // InternalMyDsl.g:4782:2: rule__BaseDatosNoSQL__Group_5__3__Impl rule__BaseDatosNoSQL__Group_5__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:4789:1: rule__BaseDatosNoSQL__Group_5__3__Impl : ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* ) ;
    public final void rule__BaseDatosNoSQL__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4793:1: ( ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* ) )
            // InternalMyDsl.g:4794:1: ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:4794:1: ( ( rule__BaseDatosNoSQL__Group_5_3__0 )* )
            // InternalMyDsl.g:4795:2: ( rule__BaseDatosNoSQL__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getGroup_5_3()); 
            // InternalMyDsl.g:4796:2: ( rule__BaseDatosNoSQL__Group_5_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:4796:3: rule__BaseDatosNoSQL__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BaseDatosNoSQL__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMyDsl.g:4804:1: rule__BaseDatosNoSQL__Group_5__4 : rule__BaseDatosNoSQL__Group_5__4__Impl ;
    public final void rule__BaseDatosNoSQL__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4808:1: ( rule__BaseDatosNoSQL__Group_5__4__Impl )
            // InternalMyDsl.g:4809:2: rule__BaseDatosNoSQL__Group_5__4__Impl
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
    // InternalMyDsl.g:4815:1: rule__BaseDatosNoSQL__Group_5__4__Impl : ( ')' ) ;
    public final void rule__BaseDatosNoSQL__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4819:1: ( ( ')' ) )
            // InternalMyDsl.g:4820:1: ( ')' )
            {
            // InternalMyDsl.g:4820:1: ( ')' )
            // InternalMyDsl.g:4821:2: ')'
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getRightParenthesisKeyword_5_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4831:1: rule__BaseDatosNoSQL__Group_5_3__0 : rule__BaseDatosNoSQL__Group_5_3__0__Impl rule__BaseDatosNoSQL__Group_5_3__1 ;
    public final void rule__BaseDatosNoSQL__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4835:1: ( rule__BaseDatosNoSQL__Group_5_3__0__Impl rule__BaseDatosNoSQL__Group_5_3__1 )
            // InternalMyDsl.g:4836:2: rule__BaseDatosNoSQL__Group_5_3__0__Impl rule__BaseDatosNoSQL__Group_5_3__1
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
    // InternalMyDsl.g:4843:1: rule__BaseDatosNoSQL__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseDatosNoSQL__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4847:1: ( ( ',' ) )
            // InternalMyDsl.g:4848:1: ( ',' )
            {
            // InternalMyDsl.g:4848:1: ( ',' )
            // InternalMyDsl.g:4849:2: ','
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
    // InternalMyDsl.g:4858:1: rule__BaseDatosNoSQL__Group_5_3__1 : rule__BaseDatosNoSQL__Group_5_3__1__Impl ;
    public final void rule__BaseDatosNoSQL__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( rule__BaseDatosNoSQL__Group_5_3__1__Impl )
            // InternalMyDsl.g:4863:2: rule__BaseDatosNoSQL__Group_5_3__1__Impl
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
    // InternalMyDsl.g:4869:1: rule__BaseDatosNoSQL__Group_5_3__1__Impl : ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) ) ;
    public final void rule__BaseDatosNoSQL__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:4874:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:4874:1: ( ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 ) )
            // InternalMyDsl.g:4875:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesAssignment_5_3_1()); 
            // InternalMyDsl.g:4876:2: ( rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 )
            // InternalMyDsl.g:4876:3: rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1
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
    // InternalMyDsl.g:4885:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4889:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:4890:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4897:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4901:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:4902:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:4902:1: ( ( '-' )? )
            // InternalMyDsl.g:4903:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:4904:2: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4904:3: '-'
                    {
                    match(input,59,FOLLOW_2); 

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
    // InternalMyDsl.g:4912:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4916:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:4917:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:4923:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4927:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4928:1: ( RULE_INT )
            {
            // InternalMyDsl.g:4928:1: ( RULE_INT )
            // InternalMyDsl.g:4929:2: RULE_INT
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
    // InternalMyDsl.g:4939:1: rule__InternetGateway__Group__0 : rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 ;
    public final void rule__InternetGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4943:1: ( rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 )
            // InternalMyDsl.g:4944:2: rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1
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
    // InternalMyDsl.g:4951:1: rule__InternetGateway__Group__0__Impl : ( 'InternetGateway' ) ;
    public final void rule__InternetGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4955:1: ( ( 'InternetGateway' ) )
            // InternalMyDsl.g:4956:1: ( 'InternetGateway' )
            {
            // InternalMyDsl.g:4956:1: ( 'InternetGateway' )
            // InternalMyDsl.g:4957:2: 'InternetGateway'
            {
             before(grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:4966:1: rule__InternetGateway__Group__1 : rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 ;
    public final void rule__InternetGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4970:1: ( rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 )
            // InternalMyDsl.g:4971:2: rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:4978:1: rule__InternetGateway__Group__1__Impl : ( '{' ) ;
    public final void rule__InternetGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4982:1: ( ( '{' ) )
            // InternalMyDsl.g:4983:1: ( '{' )
            {
            // InternalMyDsl.g:4983:1: ( '{' )
            // InternalMyDsl.g:4984:2: '{'
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
    // InternalMyDsl.g:4993:1: rule__InternetGateway__Group__2 : rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 ;
    public final void rule__InternetGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4997:1: ( rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 )
            // InternalMyDsl.g:4998:2: rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:5005:1: rule__InternetGateway__Group__2__Impl : ( ( rule__InternetGateway__Group_2__0 )? ) ;
    public final void rule__InternetGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5009:1: ( ( ( rule__InternetGateway__Group_2__0 )? ) )
            // InternalMyDsl.g:5010:1: ( ( rule__InternetGateway__Group_2__0 )? )
            {
            // InternalMyDsl.g:5010:1: ( ( rule__InternetGateway__Group_2__0 )? )
            // InternalMyDsl.g:5011:2: ( rule__InternetGateway__Group_2__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_2()); 
            // InternalMyDsl.g:5012:2: ( rule__InternetGateway__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:5012:3: rule__InternetGateway__Group_2__0
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
    // InternalMyDsl.g:5020:1: rule__InternetGateway__Group__3 : rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 ;
    public final void rule__InternetGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5024:1: ( rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 )
            // InternalMyDsl.g:5025:2: rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4
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
    // InternalMyDsl.g:5032:1: rule__InternetGateway__Group__3__Impl : ( 'vpc' ) ;
    public final void rule__InternetGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5036:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:5037:1: ( 'vpc' )
            {
            // InternalMyDsl.g:5037:1: ( 'vpc' )
            // InternalMyDsl.g:5038:2: 'vpc'
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:5047:1: rule__InternetGateway__Group__4 : rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 ;
    public final void rule__InternetGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5051:1: ( rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 )
            // InternalMyDsl.g:5052:2: rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5
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
    // InternalMyDsl.g:5059:1: rule__InternetGateway__Group__4__Impl : ( ( rule__InternetGateway__VpcAssignment_4 ) ) ;
    public final void rule__InternetGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5063:1: ( ( ( rule__InternetGateway__VpcAssignment_4 ) ) )
            // InternalMyDsl.g:5064:1: ( ( rule__InternetGateway__VpcAssignment_4 ) )
            {
            // InternalMyDsl.g:5064:1: ( ( rule__InternetGateway__VpcAssignment_4 ) )
            // InternalMyDsl.g:5065:2: ( rule__InternetGateway__VpcAssignment_4 )
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcAssignment_4()); 
            // InternalMyDsl.g:5066:2: ( rule__InternetGateway__VpcAssignment_4 )
            // InternalMyDsl.g:5066:3: rule__InternetGateway__VpcAssignment_4
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
    // InternalMyDsl.g:5074:1: rule__InternetGateway__Group__5 : rule__InternetGateway__Group__5__Impl ;
    public final void rule__InternetGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5078:1: ( rule__InternetGateway__Group__5__Impl )
            // InternalMyDsl.g:5079:2: rule__InternetGateway__Group__5__Impl
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
    // InternalMyDsl.g:5085:1: rule__InternetGateway__Group__5__Impl : ( '}' ) ;
    public final void rule__InternetGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5089:1: ( ( '}' ) )
            // InternalMyDsl.g:5090:1: ( '}' )
            {
            // InternalMyDsl.g:5090:1: ( '}' )
            // InternalMyDsl.g:5091:2: '}'
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
    // InternalMyDsl.g:5101:1: rule__InternetGateway__Group_2__0 : rule__InternetGateway__Group_2__0__Impl rule__InternetGateway__Group_2__1 ;
    public final void rule__InternetGateway__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5105:1: ( rule__InternetGateway__Group_2__0__Impl rule__InternetGateway__Group_2__1 )
            // InternalMyDsl.g:5106:2: rule__InternetGateway__Group_2__0__Impl rule__InternetGateway__Group_2__1
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
    // InternalMyDsl.g:5113:1: rule__InternetGateway__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__InternetGateway__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5117:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:5118:1: ( 'nombre' )
            {
            // InternalMyDsl.g:5118:1: ( 'nombre' )
            // InternalMyDsl.g:5119:2: 'nombre'
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
    // InternalMyDsl.g:5128:1: rule__InternetGateway__Group_2__1 : rule__InternetGateway__Group_2__1__Impl ;
    public final void rule__InternetGateway__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5132:1: ( rule__InternetGateway__Group_2__1__Impl )
            // InternalMyDsl.g:5133:2: rule__InternetGateway__Group_2__1__Impl
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
    // InternalMyDsl.g:5139:1: rule__InternetGateway__Group_2__1__Impl : ( ( rule__InternetGateway__NombreAssignment_2_1 ) ) ;
    public final void rule__InternetGateway__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5143:1: ( ( ( rule__InternetGateway__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:5144:1: ( ( rule__InternetGateway__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5144:1: ( ( rule__InternetGateway__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:5145:2: ( rule__InternetGateway__NombreAssignment_2_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:5146:2: ( rule__InternetGateway__NombreAssignment_2_1 )
            // InternalMyDsl.g:5146:3: rule__InternetGateway__NombreAssignment_2_1
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
    // InternalMyDsl.g:5155:1: rule__Subred__Group__0 : rule__Subred__Group__0__Impl rule__Subred__Group__1 ;
    public final void rule__Subred__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5159:1: ( rule__Subred__Group__0__Impl rule__Subred__Group__1 )
            // InternalMyDsl.g:5160:2: rule__Subred__Group__0__Impl rule__Subred__Group__1
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
    // InternalMyDsl.g:5167:1: rule__Subred__Group__0__Impl : ( 'Subred' ) ;
    public final void rule__Subred__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5171:1: ( ( 'Subred' ) )
            // InternalMyDsl.g:5172:1: ( 'Subred' )
            {
            // InternalMyDsl.g:5172:1: ( 'Subred' )
            // InternalMyDsl.g:5173:2: 'Subred'
            {
             before(grammarAccess.getSubredAccess().getSubredKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:5182:1: rule__Subred__Group__1 : rule__Subred__Group__1__Impl rule__Subred__Group__2 ;
    public final void rule__Subred__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5186:1: ( rule__Subred__Group__1__Impl rule__Subred__Group__2 )
            // InternalMyDsl.g:5187:2: rule__Subred__Group__1__Impl rule__Subred__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:5194:1: rule__Subred__Group__1__Impl : ( '{' ) ;
    public final void rule__Subred__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5198:1: ( ( '{' ) )
            // InternalMyDsl.g:5199:1: ( '{' )
            {
            // InternalMyDsl.g:5199:1: ( '{' )
            // InternalMyDsl.g:5200:2: '{'
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
    // InternalMyDsl.g:5209:1: rule__Subred__Group__2 : rule__Subred__Group__2__Impl rule__Subred__Group__3 ;
    public final void rule__Subred__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5213:1: ( rule__Subred__Group__2__Impl rule__Subred__Group__3 )
            // InternalMyDsl.g:5214:2: rule__Subred__Group__2__Impl rule__Subred__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:5221:1: rule__Subred__Group__2__Impl : ( ( rule__Subred__Group_2__0 )? ) ;
    public final void rule__Subred__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5225:1: ( ( ( rule__Subred__Group_2__0 )? ) )
            // InternalMyDsl.g:5226:1: ( ( rule__Subred__Group_2__0 )? )
            {
            // InternalMyDsl.g:5226:1: ( ( rule__Subred__Group_2__0 )? )
            // InternalMyDsl.g:5227:2: ( rule__Subred__Group_2__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_2()); 
            // InternalMyDsl.g:5228:2: ( rule__Subred__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:5228:3: rule__Subred__Group_2__0
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
    // InternalMyDsl.g:5236:1: rule__Subred__Group__3 : rule__Subred__Group__3__Impl rule__Subred__Group__4 ;
    public final void rule__Subred__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5240:1: ( rule__Subred__Group__3__Impl rule__Subred__Group__4 )
            // InternalMyDsl.g:5241:2: rule__Subred__Group__3__Impl rule__Subred__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:5248:1: rule__Subred__Group__3__Impl : ( ( rule__Subred__Group_3__0 )? ) ;
    public final void rule__Subred__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5252:1: ( ( ( rule__Subred__Group_3__0 )? ) )
            // InternalMyDsl.g:5253:1: ( ( rule__Subred__Group_3__0 )? )
            {
            // InternalMyDsl.g:5253:1: ( ( rule__Subred__Group_3__0 )? )
            // InternalMyDsl.g:5254:2: ( rule__Subred__Group_3__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_3()); 
            // InternalMyDsl.g:5255:2: ( rule__Subred__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:5255:3: rule__Subred__Group_3__0
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
    // InternalMyDsl.g:5263:1: rule__Subred__Group__4 : rule__Subred__Group__4__Impl rule__Subred__Group__5 ;
    public final void rule__Subred__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5267:1: ( rule__Subred__Group__4__Impl rule__Subred__Group__5 )
            // InternalMyDsl.g:5268:2: rule__Subred__Group__4__Impl rule__Subred__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:5275:1: rule__Subred__Group__4__Impl : ( ( rule__Subred__Group_4__0 )? ) ;
    public final void rule__Subred__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5279:1: ( ( ( rule__Subred__Group_4__0 )? ) )
            // InternalMyDsl.g:5280:1: ( ( rule__Subred__Group_4__0 )? )
            {
            // InternalMyDsl.g:5280:1: ( ( rule__Subred__Group_4__0 )? )
            // InternalMyDsl.g:5281:2: ( rule__Subred__Group_4__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_4()); 
            // InternalMyDsl.g:5282:2: ( rule__Subred__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==63) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:5282:3: rule__Subred__Group_4__0
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
    // InternalMyDsl.g:5290:1: rule__Subred__Group__5 : rule__Subred__Group__5__Impl rule__Subred__Group__6 ;
    public final void rule__Subred__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5294:1: ( rule__Subred__Group__5__Impl rule__Subred__Group__6 )
            // InternalMyDsl.g:5295:2: rule__Subred__Group__5__Impl rule__Subred__Group__6
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
    // InternalMyDsl.g:5302:1: rule__Subred__Group__5__Impl : ( 'vpc' ) ;
    public final void rule__Subred__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5306:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:5307:1: ( 'vpc' )
            {
            // InternalMyDsl.g:5307:1: ( 'vpc' )
            // InternalMyDsl.g:5308:2: 'vpc'
            {
             before(grammarAccess.getSubredAccess().getVpcKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:5317:1: rule__Subred__Group__6 : rule__Subred__Group__6__Impl rule__Subred__Group__7 ;
    public final void rule__Subred__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5321:1: ( rule__Subred__Group__6__Impl rule__Subred__Group__7 )
            // InternalMyDsl.g:5322:2: rule__Subred__Group__6__Impl rule__Subred__Group__7
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
    // InternalMyDsl.g:5329:1: rule__Subred__Group__6__Impl : ( ( rule__Subred__VpcAssignment_6 ) ) ;
    public final void rule__Subred__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5333:1: ( ( ( rule__Subred__VpcAssignment_6 ) ) )
            // InternalMyDsl.g:5334:1: ( ( rule__Subred__VpcAssignment_6 ) )
            {
            // InternalMyDsl.g:5334:1: ( ( rule__Subred__VpcAssignment_6 ) )
            // InternalMyDsl.g:5335:2: ( rule__Subred__VpcAssignment_6 )
            {
             before(grammarAccess.getSubredAccess().getVpcAssignment_6()); 
            // InternalMyDsl.g:5336:2: ( rule__Subred__VpcAssignment_6 )
            // InternalMyDsl.g:5336:3: rule__Subred__VpcAssignment_6
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
    // InternalMyDsl.g:5344:1: rule__Subred__Group__7 : rule__Subred__Group__7__Impl ;
    public final void rule__Subred__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5348:1: ( rule__Subred__Group__7__Impl )
            // InternalMyDsl.g:5349:2: rule__Subred__Group__7__Impl
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
    // InternalMyDsl.g:5355:1: rule__Subred__Group__7__Impl : ( '}' ) ;
    public final void rule__Subred__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5359:1: ( ( '}' ) )
            // InternalMyDsl.g:5360:1: ( '}' )
            {
            // InternalMyDsl.g:5360:1: ( '}' )
            // InternalMyDsl.g:5361:2: '}'
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
    // InternalMyDsl.g:5371:1: rule__Subred__Group_2__0 : rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1 ;
    public final void rule__Subred__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5375:1: ( rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1 )
            // InternalMyDsl.g:5376:2: rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1
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
    // InternalMyDsl.g:5383:1: rule__Subred__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__Subred__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5387:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:5388:1: ( 'nombre' )
            {
            // InternalMyDsl.g:5388:1: ( 'nombre' )
            // InternalMyDsl.g:5389:2: 'nombre'
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
    // InternalMyDsl.g:5398:1: rule__Subred__Group_2__1 : rule__Subred__Group_2__1__Impl ;
    public final void rule__Subred__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5402:1: ( rule__Subred__Group_2__1__Impl )
            // InternalMyDsl.g:5403:2: rule__Subred__Group_2__1__Impl
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
    // InternalMyDsl.g:5409:1: rule__Subred__Group_2__1__Impl : ( ( rule__Subred__NombreAssignment_2_1 ) ) ;
    public final void rule__Subred__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5413:1: ( ( ( rule__Subred__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:5414:1: ( ( rule__Subred__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5414:1: ( ( rule__Subred__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:5415:2: ( rule__Subred__NombreAssignment_2_1 )
            {
             before(grammarAccess.getSubredAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:5416:2: ( rule__Subred__NombreAssignment_2_1 )
            // InternalMyDsl.g:5416:3: rule__Subred__NombreAssignment_2_1
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
    // InternalMyDsl.g:5425:1: rule__Subred__Group_3__0 : rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 ;
    public final void rule__Subred__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5429:1: ( rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 )
            // InternalMyDsl.g:5430:2: rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1
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
    // InternalMyDsl.g:5437:1: rule__Subred__Group_3__0__Impl : ( 'CIDR' ) ;
    public final void rule__Subred__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5441:1: ( ( 'CIDR' ) )
            // InternalMyDsl.g:5442:1: ( 'CIDR' )
            {
            // InternalMyDsl.g:5442:1: ( 'CIDR' )
            // InternalMyDsl.g:5443:2: 'CIDR'
            {
             before(grammarAccess.getSubredAccess().getCIDRKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:5452:1: rule__Subred__Group_3__1 : rule__Subred__Group_3__1__Impl ;
    public final void rule__Subred__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5456:1: ( rule__Subred__Group_3__1__Impl )
            // InternalMyDsl.g:5457:2: rule__Subred__Group_3__1__Impl
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
    // InternalMyDsl.g:5463:1: rule__Subred__Group_3__1__Impl : ( ( rule__Subred__CIDRAssignment_3_1 ) ) ;
    public final void rule__Subred__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5467:1: ( ( ( rule__Subred__CIDRAssignment_3_1 ) ) )
            // InternalMyDsl.g:5468:1: ( ( rule__Subred__CIDRAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5468:1: ( ( rule__Subred__CIDRAssignment_3_1 ) )
            // InternalMyDsl.g:5469:2: ( rule__Subred__CIDRAssignment_3_1 )
            {
             before(grammarAccess.getSubredAccess().getCIDRAssignment_3_1()); 
            // InternalMyDsl.g:5470:2: ( rule__Subred__CIDRAssignment_3_1 )
            // InternalMyDsl.g:5470:3: rule__Subred__CIDRAssignment_3_1
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
    // InternalMyDsl.g:5479:1: rule__Subred__Group_4__0 : rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 ;
    public final void rule__Subred__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5483:1: ( rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 )
            // InternalMyDsl.g:5484:2: rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1
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
    // InternalMyDsl.g:5491:1: rule__Subred__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Subred__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5495:1: ( ( 'zonaDisponibilidad' ) )
            // InternalMyDsl.g:5496:1: ( 'zonaDisponibilidad' )
            {
            // InternalMyDsl.g:5496:1: ( 'zonaDisponibilidad' )
            // InternalMyDsl.g:5497:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:5506:1: rule__Subred__Group_4__1 : rule__Subred__Group_4__1__Impl ;
    public final void rule__Subred__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5510:1: ( rule__Subred__Group_4__1__Impl )
            // InternalMyDsl.g:5511:2: rule__Subred__Group_4__1__Impl
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
    // InternalMyDsl.g:5517:1: rule__Subred__Group_4__1__Impl : ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__Subred__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5521:1: ( ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalMyDsl.g:5522:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5522:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalMyDsl.g:5523:2: ( rule__Subred__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalMyDsl.g:5524:2: ( rule__Subred__ZonaDisponibilidadAssignment_4_1 )
            // InternalMyDsl.g:5524:3: rule__Subred__ZonaDisponibilidadAssignment_4_1
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
    // InternalMyDsl.g:5533:1: rule__GrupoSeguridad__Group__0 : rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 ;
    public final void rule__GrupoSeguridad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5537:1: ( rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 )
            // InternalMyDsl.g:5538:2: rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1
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
    // InternalMyDsl.g:5545:1: rule__GrupoSeguridad__Group__0__Impl : ( 'GrupoSeguridad' ) ;
    public final void rule__GrupoSeguridad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5549:1: ( ( 'GrupoSeguridad' ) )
            // InternalMyDsl.g:5550:1: ( 'GrupoSeguridad' )
            {
            // InternalMyDsl.g:5550:1: ( 'GrupoSeguridad' )
            // InternalMyDsl.g:5551:2: 'GrupoSeguridad'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:5560:1: rule__GrupoSeguridad__Group__1 : rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 ;
    public final void rule__GrupoSeguridad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5564:1: ( rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 )
            // InternalMyDsl.g:5565:2: rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:5572:1: rule__GrupoSeguridad__Group__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5576:1: ( ( '{' ) )
            // InternalMyDsl.g:5577:1: ( '{' )
            {
            // InternalMyDsl.g:5577:1: ( '{' )
            // InternalMyDsl.g:5578:2: '{'
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
    // InternalMyDsl.g:5587:1: rule__GrupoSeguridad__Group__2 : rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 ;
    public final void rule__GrupoSeguridad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5591:1: ( rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 )
            // InternalMyDsl.g:5592:2: rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:5599:1: rule__GrupoSeguridad__Group__2__Impl : ( ( rule__GrupoSeguridad__Group_2__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5603:1: ( ( ( rule__GrupoSeguridad__Group_2__0 )? ) )
            // InternalMyDsl.g:5604:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            {
            // InternalMyDsl.g:5604:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            // InternalMyDsl.g:5605:2: ( rule__GrupoSeguridad__Group_2__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_2()); 
            // InternalMyDsl.g:5606:2: ( rule__GrupoSeguridad__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:5606:3: rule__GrupoSeguridad__Group_2__0
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
    // InternalMyDsl.g:5614:1: rule__GrupoSeguridad__Group__3 : rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 ;
    public final void rule__GrupoSeguridad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5618:1: ( rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 )
            // InternalMyDsl.g:5619:2: rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:5626:1: rule__GrupoSeguridad__Group__3__Impl : ( ( rule__GrupoSeguridad__Group_3__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5630:1: ( ( ( rule__GrupoSeguridad__Group_3__0 )? ) )
            // InternalMyDsl.g:5631:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            {
            // InternalMyDsl.g:5631:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            // InternalMyDsl.g:5632:2: ( rule__GrupoSeguridad__Group_3__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_3()); 
            // InternalMyDsl.g:5633:2: ( rule__GrupoSeguridad__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==65) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:5633:3: rule__GrupoSeguridad__Group_3__0
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
    // InternalMyDsl.g:5641:1: rule__GrupoSeguridad__Group__4 : rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 ;
    public final void rule__GrupoSeguridad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5645:1: ( rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 )
            // InternalMyDsl.g:5646:2: rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5
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
    // InternalMyDsl.g:5653:1: rule__GrupoSeguridad__Group__4__Impl : ( 'vpc' ) ;
    public final void rule__GrupoSeguridad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5657:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:5658:1: ( 'vpc' )
            {
            // InternalMyDsl.g:5658:1: ( 'vpc' )
            // InternalMyDsl.g:5659:2: 'vpc'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:5668:1: rule__GrupoSeguridad__Group__5 : rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 ;
    public final void rule__GrupoSeguridad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5672:1: ( rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 )
            // InternalMyDsl.g:5673:2: rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:5680:1: rule__GrupoSeguridad__Group__5__Impl : ( ( rule__GrupoSeguridad__VpcAssignment_5 ) ) ;
    public final void rule__GrupoSeguridad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5684:1: ( ( ( rule__GrupoSeguridad__VpcAssignment_5 ) ) )
            // InternalMyDsl.g:5685:1: ( ( rule__GrupoSeguridad__VpcAssignment_5 ) )
            {
            // InternalMyDsl.g:5685:1: ( ( rule__GrupoSeguridad__VpcAssignment_5 ) )
            // InternalMyDsl.g:5686:2: ( rule__GrupoSeguridad__VpcAssignment_5 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcAssignment_5()); 
            // InternalMyDsl.g:5687:2: ( rule__GrupoSeguridad__VpcAssignment_5 )
            // InternalMyDsl.g:5687:3: rule__GrupoSeguridad__VpcAssignment_5
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
    // InternalMyDsl.g:5695:1: rule__GrupoSeguridad__Group__6 : rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 ;
    public final void rule__GrupoSeguridad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5699:1: ( rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 )
            // InternalMyDsl.g:5700:2: rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:5707:1: rule__GrupoSeguridad__Group__6__Impl : ( ( rule__GrupoSeguridad__Group_6__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5711:1: ( ( ( rule__GrupoSeguridad__Group_6__0 )? ) )
            // InternalMyDsl.g:5712:1: ( ( rule__GrupoSeguridad__Group_6__0 )? )
            {
            // InternalMyDsl.g:5712:1: ( ( rule__GrupoSeguridad__Group_6__0 )? )
            // InternalMyDsl.g:5713:2: ( rule__GrupoSeguridad__Group_6__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_6()); 
            // InternalMyDsl.g:5714:2: ( rule__GrupoSeguridad__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==66) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:5714:3: rule__GrupoSeguridad__Group_6__0
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
    // InternalMyDsl.g:5722:1: rule__GrupoSeguridad__Group__7 : rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 ;
    public final void rule__GrupoSeguridad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5726:1: ( rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 )
            // InternalMyDsl.g:5727:2: rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:5734:1: rule__GrupoSeguridad__Group__7__Impl : ( ( rule__GrupoSeguridad__Group_7__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5738:1: ( ( ( rule__GrupoSeguridad__Group_7__0 )? ) )
            // InternalMyDsl.g:5739:1: ( ( rule__GrupoSeguridad__Group_7__0 )? )
            {
            // InternalMyDsl.g:5739:1: ( ( rule__GrupoSeguridad__Group_7__0 )? )
            // InternalMyDsl.g:5740:2: ( rule__GrupoSeguridad__Group_7__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_7()); 
            // InternalMyDsl.g:5741:2: ( rule__GrupoSeguridad__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==67) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:5741:3: rule__GrupoSeguridad__Group_7__0
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
    // InternalMyDsl.g:5749:1: rule__GrupoSeguridad__Group__8 : rule__GrupoSeguridad__Group__8__Impl ;
    public final void rule__GrupoSeguridad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5753:1: ( rule__GrupoSeguridad__Group__8__Impl )
            // InternalMyDsl.g:5754:2: rule__GrupoSeguridad__Group__8__Impl
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
    // InternalMyDsl.g:5760:1: rule__GrupoSeguridad__Group__8__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5764:1: ( ( '}' ) )
            // InternalMyDsl.g:5765:1: ( '}' )
            {
            // InternalMyDsl.g:5765:1: ( '}' )
            // InternalMyDsl.g:5766:2: '}'
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
    // InternalMyDsl.g:5776:1: rule__GrupoSeguridad__Group_2__0 : rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 ;
    public final void rule__GrupoSeguridad__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5780:1: ( rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 )
            // InternalMyDsl.g:5781:2: rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1
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
    // InternalMyDsl.g:5788:1: rule__GrupoSeguridad__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__GrupoSeguridad__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5792:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:5793:1: ( 'nombre' )
            {
            // InternalMyDsl.g:5793:1: ( 'nombre' )
            // InternalMyDsl.g:5794:2: 'nombre'
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
    // InternalMyDsl.g:5803:1: rule__GrupoSeguridad__Group_2__1 : rule__GrupoSeguridad__Group_2__1__Impl ;
    public final void rule__GrupoSeguridad__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5807:1: ( rule__GrupoSeguridad__Group_2__1__Impl )
            // InternalMyDsl.g:5808:2: rule__GrupoSeguridad__Group_2__1__Impl
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
    // InternalMyDsl.g:5814:1: rule__GrupoSeguridad__Group_2__1__Impl : ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5818:1: ( ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) )
            // InternalMyDsl.g:5819:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5819:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            // InternalMyDsl.g:5820:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreAssignment_2_1()); 
            // InternalMyDsl.g:5821:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            // InternalMyDsl.g:5821:3: rule__GrupoSeguridad__NombreAssignment_2_1
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
    // InternalMyDsl.g:5830:1: rule__GrupoSeguridad__Group_3__0 : rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 ;
    public final void rule__GrupoSeguridad__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5834:1: ( rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 )
            // InternalMyDsl.g:5835:2: rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1
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
    // InternalMyDsl.g:5842:1: rule__GrupoSeguridad__Group_3__0__Impl : ( 'descripcion' ) ;
    public final void rule__GrupoSeguridad__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5846:1: ( ( 'descripcion' ) )
            // InternalMyDsl.g:5847:1: ( 'descripcion' )
            {
            // InternalMyDsl.g:5847:1: ( 'descripcion' )
            // InternalMyDsl.g:5848:2: 'descripcion'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:5857:1: rule__GrupoSeguridad__Group_3__1 : rule__GrupoSeguridad__Group_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5861:1: ( rule__GrupoSeguridad__Group_3__1__Impl )
            // InternalMyDsl.g:5862:2: rule__GrupoSeguridad__Group_3__1__Impl
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
    // InternalMyDsl.g:5868:1: rule__GrupoSeguridad__Group_3__1__Impl : ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5872:1: ( ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) ) )
            // InternalMyDsl.g:5873:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5873:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_3_1 ) )
            // InternalMyDsl.g:5874:2: ( rule__GrupoSeguridad__DescripcionAssignment_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionAssignment_3_1()); 
            // InternalMyDsl.g:5875:2: ( rule__GrupoSeguridad__DescripcionAssignment_3_1 )
            // InternalMyDsl.g:5875:3: rule__GrupoSeguridad__DescripcionAssignment_3_1
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
    // InternalMyDsl.g:5884:1: rule__GrupoSeguridad__Group_6__0 : rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1 ;
    public final void rule__GrupoSeguridad__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5888:1: ( rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1 )
            // InternalMyDsl.g:5889:2: rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1
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
    // InternalMyDsl.g:5896:1: rule__GrupoSeguridad__Group_6__0__Impl : ( 'reglasEntrada' ) ;
    public final void rule__GrupoSeguridad__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5900:1: ( ( 'reglasEntrada' ) )
            // InternalMyDsl.g:5901:1: ( 'reglasEntrada' )
            {
            // InternalMyDsl.g:5901:1: ( 'reglasEntrada' )
            // InternalMyDsl.g:5902:2: 'reglasEntrada'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:5911:1: rule__GrupoSeguridad__Group_6__1 : rule__GrupoSeguridad__Group_6__1__Impl rule__GrupoSeguridad__Group_6__2 ;
    public final void rule__GrupoSeguridad__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5915:1: ( rule__GrupoSeguridad__Group_6__1__Impl rule__GrupoSeguridad__Group_6__2 )
            // InternalMyDsl.g:5916:2: rule__GrupoSeguridad__Group_6__1__Impl rule__GrupoSeguridad__Group_6__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:5923:1: rule__GrupoSeguridad__Group_6__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5927:1: ( ( '{' ) )
            // InternalMyDsl.g:5928:1: ( '{' )
            {
            // InternalMyDsl.g:5928:1: ( '{' )
            // InternalMyDsl.g:5929:2: '{'
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
    // InternalMyDsl.g:5938:1: rule__GrupoSeguridad__Group_6__2 : rule__GrupoSeguridad__Group_6__2__Impl rule__GrupoSeguridad__Group_6__3 ;
    public final void rule__GrupoSeguridad__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5942:1: ( rule__GrupoSeguridad__Group_6__2__Impl rule__GrupoSeguridad__Group_6__3 )
            // InternalMyDsl.g:5943:2: rule__GrupoSeguridad__Group_6__2__Impl rule__GrupoSeguridad__Group_6__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:5950:1: rule__GrupoSeguridad__Group_6__2__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) ) ;
    public final void rule__GrupoSeguridad__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5954:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) ) )
            // InternalMyDsl.g:5955:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) )
            {
            // InternalMyDsl.g:5955:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 ) )
            // InternalMyDsl.g:5956:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_6_2()); 
            // InternalMyDsl.g:5957:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 )
            // InternalMyDsl.g:5957:3: rule__GrupoSeguridad__ReglasEntradaAssignment_6_2
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
    // InternalMyDsl.g:5965:1: rule__GrupoSeguridad__Group_6__3 : rule__GrupoSeguridad__Group_6__3__Impl rule__GrupoSeguridad__Group_6__4 ;
    public final void rule__GrupoSeguridad__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5969:1: ( rule__GrupoSeguridad__Group_6__3__Impl rule__GrupoSeguridad__Group_6__4 )
            // InternalMyDsl.g:5970:2: rule__GrupoSeguridad__Group_6__3__Impl rule__GrupoSeguridad__Group_6__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:5977:1: rule__GrupoSeguridad__Group_6__3__Impl : ( ( rule__GrupoSeguridad__Group_6_3__0 )* ) ;
    public final void rule__GrupoSeguridad__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5981:1: ( ( ( rule__GrupoSeguridad__Group_6_3__0 )* ) )
            // InternalMyDsl.g:5982:1: ( ( rule__GrupoSeguridad__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:5982:1: ( ( rule__GrupoSeguridad__Group_6_3__0 )* )
            // InternalMyDsl.g:5983:2: ( rule__GrupoSeguridad__Group_6_3__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_6_3()); 
            // InternalMyDsl.g:5984:2: ( rule__GrupoSeguridad__Group_6_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==38) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:5984:3: rule__GrupoSeguridad__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GrupoSeguridad__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMyDsl.g:5992:1: rule__GrupoSeguridad__Group_6__4 : rule__GrupoSeguridad__Group_6__4__Impl ;
    public final void rule__GrupoSeguridad__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5996:1: ( rule__GrupoSeguridad__Group_6__4__Impl )
            // InternalMyDsl.g:5997:2: rule__GrupoSeguridad__Group_6__4__Impl
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
    // InternalMyDsl.g:6003:1: rule__GrupoSeguridad__Group_6__4__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6007:1: ( ( '}' ) )
            // InternalMyDsl.g:6008:1: ( '}' )
            {
            // InternalMyDsl.g:6008:1: ( '}' )
            // InternalMyDsl.g:6009:2: '}'
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
    // InternalMyDsl.g:6019:1: rule__GrupoSeguridad__Group_6_3__0 : rule__GrupoSeguridad__Group_6_3__0__Impl rule__GrupoSeguridad__Group_6_3__1 ;
    public final void rule__GrupoSeguridad__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6023:1: ( rule__GrupoSeguridad__Group_6_3__0__Impl rule__GrupoSeguridad__Group_6_3__1 )
            // InternalMyDsl.g:6024:2: rule__GrupoSeguridad__Group_6_3__0__Impl rule__GrupoSeguridad__Group_6_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:6031:1: rule__GrupoSeguridad__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6035:1: ( ( ',' ) )
            // InternalMyDsl.g:6036:1: ( ',' )
            {
            // InternalMyDsl.g:6036:1: ( ',' )
            // InternalMyDsl.g:6037:2: ','
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
    // InternalMyDsl.g:6046:1: rule__GrupoSeguridad__Group_6_3__1 : rule__GrupoSeguridad__Group_6_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6050:1: ( rule__GrupoSeguridad__Group_6_3__1__Impl )
            // InternalMyDsl.g:6051:2: rule__GrupoSeguridad__Group_6_3__1__Impl
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
    // InternalMyDsl.g:6057:1: rule__GrupoSeguridad__Group_6_3__1__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6061:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:6062:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:6062:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 ) )
            // InternalMyDsl.g:6063:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_6_3_1()); 
            // InternalMyDsl.g:6064:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 )
            // InternalMyDsl.g:6064:3: rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1
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
    // InternalMyDsl.g:6073:1: rule__GrupoSeguridad__Group_7__0 : rule__GrupoSeguridad__Group_7__0__Impl rule__GrupoSeguridad__Group_7__1 ;
    public final void rule__GrupoSeguridad__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6077:1: ( rule__GrupoSeguridad__Group_7__0__Impl rule__GrupoSeguridad__Group_7__1 )
            // InternalMyDsl.g:6078:2: rule__GrupoSeguridad__Group_7__0__Impl rule__GrupoSeguridad__Group_7__1
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
    // InternalMyDsl.g:6085:1: rule__GrupoSeguridad__Group_7__0__Impl : ( 'reglasSalida' ) ;
    public final void rule__GrupoSeguridad__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6089:1: ( ( 'reglasSalida' ) )
            // InternalMyDsl.g:6090:1: ( 'reglasSalida' )
            {
            // InternalMyDsl.g:6090:1: ( 'reglasSalida' )
            // InternalMyDsl.g:6091:2: 'reglasSalida'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyDsl.g:6100:1: rule__GrupoSeguridad__Group_7__1 : rule__GrupoSeguridad__Group_7__1__Impl rule__GrupoSeguridad__Group_7__2 ;
    public final void rule__GrupoSeguridad__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6104:1: ( rule__GrupoSeguridad__Group_7__1__Impl rule__GrupoSeguridad__Group_7__2 )
            // InternalMyDsl.g:6105:2: rule__GrupoSeguridad__Group_7__1__Impl rule__GrupoSeguridad__Group_7__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:6112:1: rule__GrupoSeguridad__Group_7__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6116:1: ( ( '{' ) )
            // InternalMyDsl.g:6117:1: ( '{' )
            {
            // InternalMyDsl.g:6117:1: ( '{' )
            // InternalMyDsl.g:6118:2: '{'
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
    // InternalMyDsl.g:6127:1: rule__GrupoSeguridad__Group_7__2 : rule__GrupoSeguridad__Group_7__2__Impl rule__GrupoSeguridad__Group_7__3 ;
    public final void rule__GrupoSeguridad__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6131:1: ( rule__GrupoSeguridad__Group_7__2__Impl rule__GrupoSeguridad__Group_7__3 )
            // InternalMyDsl.g:6132:2: rule__GrupoSeguridad__Group_7__2__Impl rule__GrupoSeguridad__Group_7__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:6139:1: rule__GrupoSeguridad__Group_7__2__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) ) ;
    public final void rule__GrupoSeguridad__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6143:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) ) )
            // InternalMyDsl.g:6144:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) )
            {
            // InternalMyDsl.g:6144:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 ) )
            // InternalMyDsl.g:6145:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_7_2()); 
            // InternalMyDsl.g:6146:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 )
            // InternalMyDsl.g:6146:3: rule__GrupoSeguridad__ReglasSalidaAssignment_7_2
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
    // InternalMyDsl.g:6154:1: rule__GrupoSeguridad__Group_7__3 : rule__GrupoSeguridad__Group_7__3__Impl rule__GrupoSeguridad__Group_7__4 ;
    public final void rule__GrupoSeguridad__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6158:1: ( rule__GrupoSeguridad__Group_7__3__Impl rule__GrupoSeguridad__Group_7__4 )
            // InternalMyDsl.g:6159:2: rule__GrupoSeguridad__Group_7__3__Impl rule__GrupoSeguridad__Group_7__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:6166:1: rule__GrupoSeguridad__Group_7__3__Impl : ( ( rule__GrupoSeguridad__Group_7_3__0 )* ) ;
    public final void rule__GrupoSeguridad__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6170:1: ( ( ( rule__GrupoSeguridad__Group_7_3__0 )* ) )
            // InternalMyDsl.g:6171:1: ( ( rule__GrupoSeguridad__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:6171:1: ( ( rule__GrupoSeguridad__Group_7_3__0 )* )
            // InternalMyDsl.g:6172:2: ( rule__GrupoSeguridad__Group_7_3__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_7_3()); 
            // InternalMyDsl.g:6173:2: ( rule__GrupoSeguridad__Group_7_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==38) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:6173:3: rule__GrupoSeguridad__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GrupoSeguridad__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalMyDsl.g:6181:1: rule__GrupoSeguridad__Group_7__4 : rule__GrupoSeguridad__Group_7__4__Impl ;
    public final void rule__GrupoSeguridad__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6185:1: ( rule__GrupoSeguridad__Group_7__4__Impl )
            // InternalMyDsl.g:6186:2: rule__GrupoSeguridad__Group_7__4__Impl
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
    // InternalMyDsl.g:6192:1: rule__GrupoSeguridad__Group_7__4__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6196:1: ( ( '}' ) )
            // InternalMyDsl.g:6197:1: ( '}' )
            {
            // InternalMyDsl.g:6197:1: ( '}' )
            // InternalMyDsl.g:6198:2: '}'
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
    // InternalMyDsl.g:6208:1: rule__GrupoSeguridad__Group_7_3__0 : rule__GrupoSeguridad__Group_7_3__0__Impl rule__GrupoSeguridad__Group_7_3__1 ;
    public final void rule__GrupoSeguridad__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6212:1: ( rule__GrupoSeguridad__Group_7_3__0__Impl rule__GrupoSeguridad__Group_7_3__1 )
            // InternalMyDsl.g:6213:2: rule__GrupoSeguridad__Group_7_3__0__Impl rule__GrupoSeguridad__Group_7_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:6220:1: rule__GrupoSeguridad__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6224:1: ( ( ',' ) )
            // InternalMyDsl.g:6225:1: ( ',' )
            {
            // InternalMyDsl.g:6225:1: ( ',' )
            // InternalMyDsl.g:6226:2: ','
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
    // InternalMyDsl.g:6235:1: rule__GrupoSeguridad__Group_7_3__1 : rule__GrupoSeguridad__Group_7_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6239:1: ( rule__GrupoSeguridad__Group_7_3__1__Impl )
            // InternalMyDsl.g:6240:2: rule__GrupoSeguridad__Group_7_3__1__Impl
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
    // InternalMyDsl.g:6246:1: rule__GrupoSeguridad__Group_7_3__1__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6250:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:6251:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:6251:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 ) )
            // InternalMyDsl.g:6252:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_7_3_1()); 
            // InternalMyDsl.g:6253:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 )
            // InternalMyDsl.g:6253:3: rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1
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
    // InternalMyDsl.g:6262:1: rule__Regla__Group__0 : rule__Regla__Group__0__Impl rule__Regla__Group__1 ;
    public final void rule__Regla__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6266:1: ( rule__Regla__Group__0__Impl rule__Regla__Group__1 )
            // InternalMyDsl.g:6267:2: rule__Regla__Group__0__Impl rule__Regla__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:6274:1: rule__Regla__Group__0__Impl : ( () ) ;
    public final void rule__Regla__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6278:1: ( ( () ) )
            // InternalMyDsl.g:6279:1: ( () )
            {
            // InternalMyDsl.g:6279:1: ( () )
            // InternalMyDsl.g:6280:2: ()
            {
             before(grammarAccess.getReglaAccess().getReglaAction_0()); 
            // InternalMyDsl.g:6281:2: ()
            // InternalMyDsl.g:6281:3: 
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
    // InternalMyDsl.g:6289:1: rule__Regla__Group__1 : rule__Regla__Group__1__Impl rule__Regla__Group__2 ;
    public final void rule__Regla__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6293:1: ( rule__Regla__Group__1__Impl rule__Regla__Group__2 )
            // InternalMyDsl.g:6294:2: rule__Regla__Group__1__Impl rule__Regla__Group__2
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
    // InternalMyDsl.g:6301:1: rule__Regla__Group__1__Impl : ( 'Regla' ) ;
    public final void rule__Regla__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6305:1: ( ( 'Regla' ) )
            // InternalMyDsl.g:6306:1: ( 'Regla' )
            {
            // InternalMyDsl.g:6306:1: ( 'Regla' )
            // InternalMyDsl.g:6307:2: 'Regla'
            {
             before(grammarAccess.getReglaAccess().getReglaKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyDsl.g:6316:1: rule__Regla__Group__2 : rule__Regla__Group__2__Impl rule__Regla__Group__3 ;
    public final void rule__Regla__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6320:1: ( rule__Regla__Group__2__Impl rule__Regla__Group__3 )
            // InternalMyDsl.g:6321:2: rule__Regla__Group__2__Impl rule__Regla__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:6328:1: rule__Regla__Group__2__Impl : ( '{' ) ;
    public final void rule__Regla__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6332:1: ( ( '{' ) )
            // InternalMyDsl.g:6333:1: ( '{' )
            {
            // InternalMyDsl.g:6333:1: ( '{' )
            // InternalMyDsl.g:6334:2: '{'
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
    // InternalMyDsl.g:6343:1: rule__Regla__Group__3 : rule__Regla__Group__3__Impl rule__Regla__Group__4 ;
    public final void rule__Regla__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6347:1: ( rule__Regla__Group__3__Impl rule__Regla__Group__4 )
            // InternalMyDsl.g:6348:2: rule__Regla__Group__3__Impl rule__Regla__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:6355:1: rule__Regla__Group__3__Impl : ( ( rule__Regla__Group_3__0 )? ) ;
    public final void rule__Regla__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6359:1: ( ( ( rule__Regla__Group_3__0 )? ) )
            // InternalMyDsl.g:6360:1: ( ( rule__Regla__Group_3__0 )? )
            {
            // InternalMyDsl.g:6360:1: ( ( rule__Regla__Group_3__0 )? )
            // InternalMyDsl.g:6361:2: ( rule__Regla__Group_3__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_3()); 
            // InternalMyDsl.g:6362:2: ( rule__Regla__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:6362:3: rule__Regla__Group_3__0
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
    // InternalMyDsl.g:6370:1: rule__Regla__Group__4 : rule__Regla__Group__4__Impl rule__Regla__Group__5 ;
    public final void rule__Regla__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6374:1: ( rule__Regla__Group__4__Impl rule__Regla__Group__5 )
            // InternalMyDsl.g:6375:2: rule__Regla__Group__4__Impl rule__Regla__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:6382:1: rule__Regla__Group__4__Impl : ( ( rule__Regla__Group_4__0 )? ) ;
    public final void rule__Regla__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6386:1: ( ( ( rule__Regla__Group_4__0 )? ) )
            // InternalMyDsl.g:6387:1: ( ( rule__Regla__Group_4__0 )? )
            {
            // InternalMyDsl.g:6387:1: ( ( rule__Regla__Group_4__0 )? )
            // InternalMyDsl.g:6388:2: ( rule__Regla__Group_4__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_4()); 
            // InternalMyDsl.g:6389:2: ( rule__Regla__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==69) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:6389:3: rule__Regla__Group_4__0
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
    // InternalMyDsl.g:6397:1: rule__Regla__Group__5 : rule__Regla__Group__5__Impl rule__Regla__Group__6 ;
    public final void rule__Regla__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6401:1: ( rule__Regla__Group__5__Impl rule__Regla__Group__6 )
            // InternalMyDsl.g:6402:2: rule__Regla__Group__5__Impl rule__Regla__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:6409:1: rule__Regla__Group__5__Impl : ( ( rule__Regla__Group_5__0 )? ) ;
    public final void rule__Regla__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6413:1: ( ( ( rule__Regla__Group_5__0 )? ) )
            // InternalMyDsl.g:6414:1: ( ( rule__Regla__Group_5__0 )? )
            {
            // InternalMyDsl.g:6414:1: ( ( rule__Regla__Group_5__0 )? )
            // InternalMyDsl.g:6415:2: ( rule__Regla__Group_5__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_5()); 
            // InternalMyDsl.g:6416:2: ( rule__Regla__Group_5__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==70) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:6416:3: rule__Regla__Group_5__0
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
    // InternalMyDsl.g:6424:1: rule__Regla__Group__6 : rule__Regla__Group__6__Impl rule__Regla__Group__7 ;
    public final void rule__Regla__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6428:1: ( rule__Regla__Group__6__Impl rule__Regla__Group__7 )
            // InternalMyDsl.g:6429:2: rule__Regla__Group__6__Impl rule__Regla__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:6436:1: rule__Regla__Group__6__Impl : ( ( rule__Regla__Group_6__0 )? ) ;
    public final void rule__Regla__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6440:1: ( ( ( rule__Regla__Group_6__0 )? ) )
            // InternalMyDsl.g:6441:1: ( ( rule__Regla__Group_6__0 )? )
            {
            // InternalMyDsl.g:6441:1: ( ( rule__Regla__Group_6__0 )? )
            // InternalMyDsl.g:6442:2: ( rule__Regla__Group_6__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_6()); 
            // InternalMyDsl.g:6443:2: ( rule__Regla__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==71) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:6443:3: rule__Regla__Group_6__0
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
    // InternalMyDsl.g:6451:1: rule__Regla__Group__7 : rule__Regla__Group__7__Impl rule__Regla__Group__8 ;
    public final void rule__Regla__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6455:1: ( rule__Regla__Group__7__Impl rule__Regla__Group__8 )
            // InternalMyDsl.g:6456:2: rule__Regla__Group__7__Impl rule__Regla__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:6463:1: rule__Regla__Group__7__Impl : ( ( rule__Regla__Group_7__0 )? ) ;
    public final void rule__Regla__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6467:1: ( ( ( rule__Regla__Group_7__0 )? ) )
            // InternalMyDsl.g:6468:1: ( ( rule__Regla__Group_7__0 )? )
            {
            // InternalMyDsl.g:6468:1: ( ( rule__Regla__Group_7__0 )? )
            // InternalMyDsl.g:6469:2: ( rule__Regla__Group_7__0 )?
            {
             before(grammarAccess.getReglaAccess().getGroup_7()); 
            // InternalMyDsl.g:6470:2: ( rule__Regla__Group_7__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:6470:3: rule__Regla__Group_7__0
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
    // InternalMyDsl.g:6478:1: rule__Regla__Group__8 : rule__Regla__Group__8__Impl ;
    public final void rule__Regla__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6482:1: ( rule__Regla__Group__8__Impl )
            // InternalMyDsl.g:6483:2: rule__Regla__Group__8__Impl
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
    // InternalMyDsl.g:6489:1: rule__Regla__Group__8__Impl : ( '}' ) ;
    public final void rule__Regla__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6493:1: ( ( '}' ) )
            // InternalMyDsl.g:6494:1: ( '}' )
            {
            // InternalMyDsl.g:6494:1: ( '}' )
            // InternalMyDsl.g:6495:2: '}'
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
    // InternalMyDsl.g:6505:1: rule__Regla__Group_3__0 : rule__Regla__Group_3__0__Impl rule__Regla__Group_3__1 ;
    public final void rule__Regla__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6509:1: ( rule__Regla__Group_3__0__Impl rule__Regla__Group_3__1 )
            // InternalMyDsl.g:6510:2: rule__Regla__Group_3__0__Impl rule__Regla__Group_3__1
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
    // InternalMyDsl.g:6517:1: rule__Regla__Group_3__0__Impl : ( 'tipo' ) ;
    public final void rule__Regla__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6521:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:6522:1: ( 'tipo' )
            {
            // InternalMyDsl.g:6522:1: ( 'tipo' )
            // InternalMyDsl.g:6523:2: 'tipo'
            {
             before(grammarAccess.getReglaAccess().getTipoKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:6532:1: rule__Regla__Group_3__1 : rule__Regla__Group_3__1__Impl ;
    public final void rule__Regla__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6536:1: ( rule__Regla__Group_3__1__Impl )
            // InternalMyDsl.g:6537:2: rule__Regla__Group_3__1__Impl
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
    // InternalMyDsl.g:6543:1: rule__Regla__Group_3__1__Impl : ( ( rule__Regla__TipoAssignment_3_1 ) ) ;
    public final void rule__Regla__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6547:1: ( ( ( rule__Regla__TipoAssignment_3_1 ) ) )
            // InternalMyDsl.g:6548:1: ( ( rule__Regla__TipoAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6548:1: ( ( rule__Regla__TipoAssignment_3_1 ) )
            // InternalMyDsl.g:6549:2: ( rule__Regla__TipoAssignment_3_1 )
            {
             before(grammarAccess.getReglaAccess().getTipoAssignment_3_1()); 
            // InternalMyDsl.g:6550:2: ( rule__Regla__TipoAssignment_3_1 )
            // InternalMyDsl.g:6550:3: rule__Regla__TipoAssignment_3_1
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
    // InternalMyDsl.g:6559:1: rule__Regla__Group_4__0 : rule__Regla__Group_4__0__Impl rule__Regla__Group_4__1 ;
    public final void rule__Regla__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6563:1: ( rule__Regla__Group_4__0__Impl rule__Regla__Group_4__1 )
            // InternalMyDsl.g:6564:2: rule__Regla__Group_4__0__Impl rule__Regla__Group_4__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:6571:1: rule__Regla__Group_4__0__Impl : ( 'protocolo' ) ;
    public final void rule__Regla__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6575:1: ( ( 'protocolo' ) )
            // InternalMyDsl.g:6576:1: ( 'protocolo' )
            {
            // InternalMyDsl.g:6576:1: ( 'protocolo' )
            // InternalMyDsl.g:6577:2: 'protocolo'
            {
             before(grammarAccess.getReglaAccess().getProtocoloKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyDsl.g:6586:1: rule__Regla__Group_4__1 : rule__Regla__Group_4__1__Impl ;
    public final void rule__Regla__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6590:1: ( rule__Regla__Group_4__1__Impl )
            // InternalMyDsl.g:6591:2: rule__Regla__Group_4__1__Impl
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
    // InternalMyDsl.g:6597:1: rule__Regla__Group_4__1__Impl : ( ( rule__Regla__ProtocoloAssignment_4_1 ) ) ;
    public final void rule__Regla__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6601:1: ( ( ( rule__Regla__ProtocoloAssignment_4_1 ) ) )
            // InternalMyDsl.g:6602:1: ( ( rule__Regla__ProtocoloAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6602:1: ( ( rule__Regla__ProtocoloAssignment_4_1 ) )
            // InternalMyDsl.g:6603:2: ( rule__Regla__ProtocoloAssignment_4_1 )
            {
             before(grammarAccess.getReglaAccess().getProtocoloAssignment_4_1()); 
            // InternalMyDsl.g:6604:2: ( rule__Regla__ProtocoloAssignment_4_1 )
            // InternalMyDsl.g:6604:3: rule__Regla__ProtocoloAssignment_4_1
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
    // InternalMyDsl.g:6613:1: rule__Regla__Group_5__0 : rule__Regla__Group_5__0__Impl rule__Regla__Group_5__1 ;
    public final void rule__Regla__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6617:1: ( rule__Regla__Group_5__0__Impl rule__Regla__Group_5__1 )
            // InternalMyDsl.g:6618:2: rule__Regla__Group_5__0__Impl rule__Regla__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:6625:1: rule__Regla__Group_5__0__Impl : ( 'puerto' ) ;
    public final void rule__Regla__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6629:1: ( ( 'puerto' ) )
            // InternalMyDsl.g:6630:1: ( 'puerto' )
            {
            // InternalMyDsl.g:6630:1: ( 'puerto' )
            // InternalMyDsl.g:6631:2: 'puerto'
            {
             before(grammarAccess.getReglaAccess().getPuertoKeyword_5_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyDsl.g:6640:1: rule__Regla__Group_5__1 : rule__Regla__Group_5__1__Impl ;
    public final void rule__Regla__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6644:1: ( rule__Regla__Group_5__1__Impl )
            // InternalMyDsl.g:6645:2: rule__Regla__Group_5__1__Impl
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
    // InternalMyDsl.g:6651:1: rule__Regla__Group_5__1__Impl : ( ( rule__Regla__PuertoAssignment_5_1 ) ) ;
    public final void rule__Regla__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6655:1: ( ( ( rule__Regla__PuertoAssignment_5_1 ) ) )
            // InternalMyDsl.g:6656:1: ( ( rule__Regla__PuertoAssignment_5_1 ) )
            {
            // InternalMyDsl.g:6656:1: ( ( rule__Regla__PuertoAssignment_5_1 ) )
            // InternalMyDsl.g:6657:2: ( rule__Regla__PuertoAssignment_5_1 )
            {
             before(grammarAccess.getReglaAccess().getPuertoAssignment_5_1()); 
            // InternalMyDsl.g:6658:2: ( rule__Regla__PuertoAssignment_5_1 )
            // InternalMyDsl.g:6658:3: rule__Regla__PuertoAssignment_5_1
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
    // InternalMyDsl.g:6667:1: rule__Regla__Group_6__0 : rule__Regla__Group_6__0__Impl rule__Regla__Group_6__1 ;
    public final void rule__Regla__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6671:1: ( rule__Regla__Group_6__0__Impl rule__Regla__Group_6__1 )
            // InternalMyDsl.g:6672:2: rule__Regla__Group_6__0__Impl rule__Regla__Group_6__1
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
    // InternalMyDsl.g:6679:1: rule__Regla__Group_6__0__Impl : ( 'origen' ) ;
    public final void rule__Regla__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6683:1: ( ( 'origen' ) )
            // InternalMyDsl.g:6684:1: ( 'origen' )
            {
            // InternalMyDsl.g:6684:1: ( 'origen' )
            // InternalMyDsl.g:6685:2: 'origen'
            {
             before(grammarAccess.getReglaAccess().getOrigenKeyword_6_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyDsl.g:6694:1: rule__Regla__Group_6__1 : rule__Regla__Group_6__1__Impl ;
    public final void rule__Regla__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6698:1: ( rule__Regla__Group_6__1__Impl )
            // InternalMyDsl.g:6699:2: rule__Regla__Group_6__1__Impl
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
    // InternalMyDsl.g:6705:1: rule__Regla__Group_6__1__Impl : ( ( rule__Regla__OrigenAssignment_6_1 ) ) ;
    public final void rule__Regla__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6709:1: ( ( ( rule__Regla__OrigenAssignment_6_1 ) ) )
            // InternalMyDsl.g:6710:1: ( ( rule__Regla__OrigenAssignment_6_1 ) )
            {
            // InternalMyDsl.g:6710:1: ( ( rule__Regla__OrigenAssignment_6_1 ) )
            // InternalMyDsl.g:6711:2: ( rule__Regla__OrigenAssignment_6_1 )
            {
             before(grammarAccess.getReglaAccess().getOrigenAssignment_6_1()); 
            // InternalMyDsl.g:6712:2: ( rule__Regla__OrigenAssignment_6_1 )
            // InternalMyDsl.g:6712:3: rule__Regla__OrigenAssignment_6_1
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
    // InternalMyDsl.g:6721:1: rule__Regla__Group_7__0 : rule__Regla__Group_7__0__Impl rule__Regla__Group_7__1 ;
    public final void rule__Regla__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6725:1: ( rule__Regla__Group_7__0__Impl rule__Regla__Group_7__1 )
            // InternalMyDsl.g:6726:2: rule__Regla__Group_7__0__Impl rule__Regla__Group_7__1
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
    // InternalMyDsl.g:6733:1: rule__Regla__Group_7__0__Impl : ( 'descripcion' ) ;
    public final void rule__Regla__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6737:1: ( ( 'descripcion' ) )
            // InternalMyDsl.g:6738:1: ( 'descripcion' )
            {
            // InternalMyDsl.g:6738:1: ( 'descripcion' )
            // InternalMyDsl.g:6739:2: 'descripcion'
            {
             before(grammarAccess.getReglaAccess().getDescripcionKeyword_7_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:6748:1: rule__Regla__Group_7__1 : rule__Regla__Group_7__1__Impl ;
    public final void rule__Regla__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6752:1: ( rule__Regla__Group_7__1__Impl )
            // InternalMyDsl.g:6753:2: rule__Regla__Group_7__1__Impl
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
    // InternalMyDsl.g:6759:1: rule__Regla__Group_7__1__Impl : ( ( rule__Regla__DescripcionAssignment_7_1 ) ) ;
    public final void rule__Regla__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6763:1: ( ( ( rule__Regla__DescripcionAssignment_7_1 ) ) )
            // InternalMyDsl.g:6764:1: ( ( rule__Regla__DescripcionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:6764:1: ( ( rule__Regla__DescripcionAssignment_7_1 ) )
            // InternalMyDsl.g:6765:2: ( rule__Regla__DescripcionAssignment_7_1 )
            {
             before(grammarAccess.getReglaAccess().getDescripcionAssignment_7_1()); 
            // InternalMyDsl.g:6766:2: ( rule__Regla__DescripcionAssignment_7_1 )
            // InternalMyDsl.g:6766:3: rule__Regla__DescripcionAssignment_7_1
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
    // InternalMyDsl.g:6775:1: rule__Infraestructura__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Infraestructura__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6779:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6780:2: ( ruleEString )
            {
            // InternalMyDsl.g:6780:2: ( ruleEString )
            // InternalMyDsl.g:6781:3: ruleEString
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
    // InternalMyDsl.g:6790:1: rule__Infraestructura__ProveedorAssignment_3 : ( ruleProveedor ) ;
    public final void rule__Infraestructura__ProveedorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6794:1: ( ( ruleProveedor ) )
            // InternalMyDsl.g:6795:2: ( ruleProveedor )
            {
            // InternalMyDsl.g:6795:2: ( ruleProveedor )
            // InternalMyDsl.g:6796:3: ruleProveedor
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
    // InternalMyDsl.g:6805:1: rule__Proveedor__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Proveedor__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6809:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6810:2: ( ruleEString )
            {
            // InternalMyDsl.g:6810:2: ( ruleEString )
            // InternalMyDsl.g:6811:3: ruleEString
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


    // $ANTLR start "rule__Proveedor__ParametroConexionAssignment_4"
    // InternalMyDsl.g:6820:1: rule__Proveedor__ParametroConexionAssignment_4 : ( ruleParametroConexion ) ;
    public final void rule__Proveedor__ParametroConexionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6824:1: ( ( ruleParametroConexion ) )
            // InternalMyDsl.g:6825:2: ( ruleParametroConexion )
            {
            // InternalMyDsl.g:6825:2: ( ruleParametroConexion )
            // InternalMyDsl.g:6826:3: ruleParametroConexion
            {
             before(grammarAccess.getProveedorAccess().getParametroConexionParametroConexionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParametroConexion();

            state._fsp--;

             after(grammarAccess.getProveedorAccess().getParametroConexionParametroConexionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__ParametroConexionAssignment_4"


    // $ANTLR start "rule__Proveedor__AmbientesDespliegueAssignment_8"
    // InternalMyDsl.g:6835:1: rule__Proveedor__AmbientesDespliegueAssignment_8 : ( ruleAmbienteDespliegue ) ;
    public final void rule__Proveedor__AmbientesDespliegueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6839:1: ( ( ruleAmbienteDespliegue ) )
            // InternalMyDsl.g:6840:2: ( ruleAmbienteDespliegue )
            {
            // InternalMyDsl.g:6840:2: ( ruleAmbienteDespliegue )
            // InternalMyDsl.g:6841:3: ruleAmbienteDespliegue
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__AmbientesDespliegueAssignment_8"


    // $ANTLR start "rule__Proveedor__AmbientesDespliegueAssignment_9_1"
    // InternalMyDsl.g:6850:1: rule__Proveedor__AmbientesDespliegueAssignment_9_1 : ( ruleAmbienteDespliegue ) ;
    public final void rule__Proveedor__AmbientesDespliegueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6854:1: ( ( ruleAmbienteDespliegue ) )
            // InternalMyDsl.g:6855:2: ( ruleAmbienteDespliegue )
            {
            // InternalMyDsl.g:6855:2: ( ruleAmbienteDespliegue )
            // InternalMyDsl.g:6856:3: ruleAmbienteDespliegue
            {
             before(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proveedor__AmbientesDespliegueAssignment_9_1"


    // $ANTLR start "rule__AmbienteDespliegue__NombreAssignment_3"
    // InternalMyDsl.g:6865:1: rule__AmbienteDespliegue__NombreAssignment_3 : ( ruleNombreAmbiente ) ;
    public final void rule__AmbienteDespliegue__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6869:1: ( ( ruleNombreAmbiente ) )
            // InternalMyDsl.g:6870:2: ( ruleNombreAmbiente )
            {
            // InternalMyDsl.g:6870:2: ( ruleNombreAmbiente )
            // InternalMyDsl.g:6871:3: ruleNombreAmbiente
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getNombreNombreAmbienteEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNombreAmbiente();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getNombreNombreAmbienteEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__NombreAssignment_3"


    // $ANTLR start "rule__AmbienteDespliegue__VpcAssignment_8"
    // InternalMyDsl.g:6880:1: rule__AmbienteDespliegue__VpcAssignment_8 : ( ruleVPC ) ;
    public final void rule__AmbienteDespliegue__VpcAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6884:1: ( ( ruleVPC ) )
            // InternalMyDsl.g:6885:2: ( ruleVPC )
            {
            // InternalMyDsl.g:6885:2: ( ruleVPC )
            // InternalMyDsl.g:6886:3: ruleVPC
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__VpcAssignment_8"


    // $ANTLR start "rule__AmbienteDespliegue__VpcAssignment_9_1"
    // InternalMyDsl.g:6895:1: rule__AmbienteDespliegue__VpcAssignment_9_1 : ( ruleVPC ) ;
    public final void rule__AmbienteDespliegue__VpcAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6899:1: ( ( ruleVPC ) )
            // InternalMyDsl.g:6900:2: ( ruleVPC )
            {
            // InternalMyDsl.g:6900:2: ( ruleVPC )
            // InternalMyDsl.g:6901:3: ruleVPC
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__VpcAssignment_9_1"


    // $ANTLR start "rule__AmbienteDespliegue__RecursosAssignment_14"
    // InternalMyDsl.g:6910:1: rule__AmbienteDespliegue__RecursosAssignment_14 : ( ruleRecurso ) ;
    public final void rule__AmbienteDespliegue__RecursosAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6914:1: ( ( ruleRecurso ) )
            // InternalMyDsl.g:6915:2: ( ruleRecurso )
            {
            // InternalMyDsl.g:6915:2: ( ruleRecurso )
            // InternalMyDsl.g:6916:3: ruleRecurso
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleRecurso();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__RecursosAssignment_14"


    // $ANTLR start "rule__AmbienteDespliegue__RecursosAssignment_15_1"
    // InternalMyDsl.g:6925:1: rule__AmbienteDespliegue__RecursosAssignment_15_1 : ( ruleRecurso ) ;
    public final void rule__AmbienteDespliegue__RecursosAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6929:1: ( ( ruleRecurso ) )
            // InternalMyDsl.g:6930:2: ( ruleRecurso )
            {
            // InternalMyDsl.g:6930:2: ( ruleRecurso )
            // InternalMyDsl.g:6931:3: ruleRecurso
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecurso();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__RecursosAssignment_15_1"


    // $ANTLR start "rule__UsuarioPassword__UsuarioAssignment_2"
    // InternalMyDsl.g:6940:1: rule__UsuarioPassword__UsuarioAssignment_2 : ( ruleEString ) ;
    public final void rule__UsuarioPassword__UsuarioAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6944:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6945:2: ( ruleEString )
            {
            // InternalMyDsl.g:6945:2: ( ruleEString )
            // InternalMyDsl.g:6946:3: ruleEString
            {
             before(grammarAccess.getUsuarioPasswordAccess().getUsuarioEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUsuarioPasswordAccess().getUsuarioEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__UsuarioAssignment_2"


    // $ANTLR start "rule__UsuarioPassword__PasswordAssignment_5"
    // InternalMyDsl.g:6955:1: rule__UsuarioPassword__PasswordAssignment_5 : ( ruleEString ) ;
    public final void rule__UsuarioPassword__PasswordAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6959:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6960:2: ( ruleEString )
            {
            // InternalMyDsl.g:6960:2: ( ruleEString )
            // InternalMyDsl.g:6961:3: ruleEString
            {
             before(grammarAccess.getUsuarioPasswordAccess().getPasswordEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUsuarioPasswordAccess().getPasswordEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsuarioPassword__PasswordAssignment_5"


    // $ANTLR start "rule__Llave__SecretoAssignment_3"
    // InternalMyDsl.g:6970:1: rule__Llave__SecretoAssignment_3 : ( ruleEString ) ;
    public final void rule__Llave__SecretoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6974:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6975:2: ( ruleEString )
            {
            // InternalMyDsl.g:6975:2: ( ruleEString )
            // InternalMyDsl.g:6976:3: ruleEString
            {
             before(grammarAccess.getLlaveAccess().getSecretoEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLlaveAccess().getSecretoEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Llave__SecretoAssignment_3"


    // $ANTLR start "rule__VPC__NombreAssignment_7"
    // InternalMyDsl.g:6985:1: rule__VPC__NombreAssignment_7 : ( ruleEString ) ;
    public final void rule__VPC__NombreAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6989:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6990:2: ( ruleEString )
            {
            // InternalMyDsl.g:6990:2: ( ruleEString )
            // InternalMyDsl.g:6991:3: ruleEString
            {
             before(grammarAccess.getVPCAccess().getNombreEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVPCAccess().getNombreEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__NombreAssignment_7"


    // $ANTLR start "rule__ServidorAplicaciones__NombreAssignment_2_1"
    // InternalMyDsl.g:7000:1: rule__ServidorAplicaciones__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7004:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7005:2: ( ruleEString )
            {
            // InternalMyDsl.g:7005:2: ( ruleEString )
            // InternalMyDsl.g:7006:3: ruleEString
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
    // InternalMyDsl.g:7015:1: rule__ServidorAplicaciones__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__ServidorAplicaciones__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7019:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:7020:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:7020:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:7021:3: ruleTamanioServidor
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
    // InternalMyDsl.g:7030:1: rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1 : ( ruleSistemaOperativo ) ;
    public final void rule__ServidorAplicaciones__SistemaOperativoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7034:1: ( ( ruleSistemaOperativo ) )
            // InternalMyDsl.g:7035:2: ( ruleSistemaOperativo )
            {
            // InternalMyDsl.g:7035:2: ( ruleSistemaOperativo )
            // InternalMyDsl.g:7036:3: ruleSistemaOperativo
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
    // InternalMyDsl.g:7045:1: rule__ServidorAplicaciones__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7049:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7050:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7050:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7051:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:7052:3: ( ruleEString )
            // InternalMyDsl.g:7053:4: ruleEString
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
    // InternalMyDsl.g:7064:1: rule__ServidorAplicaciones__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7068:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7069:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7069:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7070:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:7071:3: ( ruleEString )
            // InternalMyDsl.g:7072:4: ruleEString
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
    // InternalMyDsl.g:7083:1: rule__ServidorAplicaciones__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7087:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7088:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7088:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7089:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:7090:3: ( ruleEString )
            // InternalMyDsl.g:7091:4: ruleEString
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
    // InternalMyDsl.g:7102:1: rule__ServidorAlmacenamiento__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ServidorAlmacenamiento__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7106:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7107:2: ( ruleEString )
            {
            // InternalMyDsl.g:7107:2: ( ruleEString )
            // InternalMyDsl.g:7108:3: ruleEString
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
    // InternalMyDsl.g:7117:1: rule__ServidorAlmacenamiento__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__ServidorAlmacenamiento__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7121:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:7122:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:7122:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:7123:3: ruleTamanioServidor
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
    // InternalMyDsl.g:7132:1: rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__ServidorAlmacenamiento__TamanioInicialAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7136:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:7137:2: ( ruleEInt )
            {
            // InternalMyDsl.g:7137:2: ( ruleEInt )
            // InternalMyDsl.g:7138:3: ruleEInt
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
    // InternalMyDsl.g:7147:1: rule__ServidorAlmacenamiento__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7151:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7152:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7152:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7153:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:7154:3: ( ruleEString )
            // InternalMyDsl.g:7155:4: ruleEString
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
    // InternalMyDsl.g:7166:1: rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7170:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7171:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7171:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7172:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:7173:3: ( ruleEString )
            // InternalMyDsl.g:7174:4: ruleEString
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
    // InternalMyDsl.g:7185:1: rule__ServidorAlmacenamiento__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7189:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7190:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7190:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7191:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:7192:3: ( ruleEString )
            // InternalMyDsl.g:7193:4: ruleEString
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
    // InternalMyDsl.g:7204:1: rule__BaseDatosSQL__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__BaseDatosSQL__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7208:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7209:2: ( ruleEString )
            {
            // InternalMyDsl.g:7209:2: ( ruleEString )
            // InternalMyDsl.g:7210:3: ruleEString
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
    // InternalMyDsl.g:7219:1: rule__BaseDatosSQL__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__BaseDatosSQL__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7223:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:7224:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:7224:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:7225:3: ruleTamanioServidor
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
    // InternalMyDsl.g:7234:1: rule__BaseDatosSQL__ManejadorAssignment_4_1 : ( ruleManejadorSQL ) ;
    public final void rule__BaseDatosSQL__ManejadorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7238:1: ( ( ruleManejadorSQL ) )
            // InternalMyDsl.g:7239:2: ( ruleManejadorSQL )
            {
            // InternalMyDsl.g:7239:2: ( ruleManejadorSQL )
            // InternalMyDsl.g:7240:3: ruleManejadorSQL
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
    // InternalMyDsl.g:7249:1: rule__BaseDatosSQL__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosSQL__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7253:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7254:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7254:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7255:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:7256:3: ( ruleEString )
            // InternalMyDsl.g:7257:4: ruleEString
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
    // InternalMyDsl.g:7268:1: rule__BaseDatosSQL__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosSQL__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7272:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7273:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7273:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7274:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:7275:3: ( ruleEString )
            // InternalMyDsl.g:7276:4: ruleEString
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
    // InternalMyDsl.g:7287:1: rule__BaseDatosSQL__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosSQL__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7291:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7292:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7292:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7293:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosSQLAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:7294:3: ( ruleEString )
            // InternalMyDsl.g:7295:4: ruleEString
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
    // InternalMyDsl.g:7306:1: rule__BaseDatosNoSQL__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__BaseDatosNoSQL__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7310:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7311:2: ( ruleEString )
            {
            // InternalMyDsl.g:7311:2: ( ruleEString )
            // InternalMyDsl.g:7312:3: ruleEString
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
    // InternalMyDsl.g:7321:1: rule__BaseDatosNoSQL__TamanioAssignment_3_1 : ( ruleTamanioServidor ) ;
    public final void rule__BaseDatosNoSQL__TamanioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7325:1: ( ( ruleTamanioServidor ) )
            // InternalMyDsl.g:7326:2: ( ruleTamanioServidor )
            {
            // InternalMyDsl.g:7326:2: ( ruleTamanioServidor )
            // InternalMyDsl.g:7327:3: ruleTamanioServidor
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
    // InternalMyDsl.g:7336:1: rule__BaseDatosNoSQL__ManejadorAssignment_4_1 : ( ruleManejadorNoSQL ) ;
    public final void rule__BaseDatosNoSQL__ManejadorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7340:1: ( ( ruleManejadorNoSQL ) )
            // InternalMyDsl.g:7341:2: ( ruleManejadorNoSQL )
            {
            // InternalMyDsl.g:7341:2: ( ruleManejadorNoSQL )
            // InternalMyDsl.g:7342:3: ruleManejadorNoSQL
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
    // InternalMyDsl.g:7351:1: rule__BaseDatosNoSQL__ConexionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosNoSQL__ConexionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7355:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7356:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7356:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7357:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_2_0()); 
            // InternalMyDsl.g:7358:3: ( ruleEString )
            // InternalMyDsl.g:7359:4: ruleEString
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
    // InternalMyDsl.g:7370:1: rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosNoSQL__ConexionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7374:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7375:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7375:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7376:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:7377:3: ( ruleEString )
            // InternalMyDsl.g:7378:4: ruleEString
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
    // InternalMyDsl.g:7389:1: rule__BaseDatosNoSQL__VpcAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BaseDatosNoSQL__VpcAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7393:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7394:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7394:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7395:3: ( ruleEString )
            {
             before(grammarAccess.getBaseDatosNoSQLAccess().getVpcVPCCrossReference_7_0()); 
            // InternalMyDsl.g:7396:3: ( ruleEString )
            // InternalMyDsl.g:7397:4: ruleEString
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
    // InternalMyDsl.g:7408:1: rule__InternetGateway__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7412:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7413:2: ( ruleEString )
            {
            // InternalMyDsl.g:7413:2: ( ruleEString )
            // InternalMyDsl.g:7414:3: ruleEString
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
    // InternalMyDsl.g:7423:1: rule__InternetGateway__VpcAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__InternetGateway__VpcAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7427:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7428:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7428:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7429:3: ( ruleEString )
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcVPCCrossReference_4_0()); 
            // InternalMyDsl.g:7430:3: ( ruleEString )
            // InternalMyDsl.g:7431:4: ruleEString
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
    // InternalMyDsl.g:7442:1: rule__Subred__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Subred__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7446:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7447:2: ( ruleEString )
            {
            // InternalMyDsl.g:7447:2: ( ruleEString )
            // InternalMyDsl.g:7448:3: ruleEString
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
    // InternalMyDsl.g:7457:1: rule__Subred__CIDRAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subred__CIDRAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7461:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7462:2: ( ruleEString )
            {
            // InternalMyDsl.g:7462:2: ( ruleEString )
            // InternalMyDsl.g:7463:3: ruleEString
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
    // InternalMyDsl.g:7472:1: rule__Subred__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Subred__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7476:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7477:2: ( ruleEString )
            {
            // InternalMyDsl.g:7477:2: ( ruleEString )
            // InternalMyDsl.g:7478:3: ruleEString
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
    // InternalMyDsl.g:7487:1: rule__Subred__VpcAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Subred__VpcAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7491:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7492:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7492:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7493:3: ( ruleEString )
            {
             before(grammarAccess.getSubredAccess().getVpcVPCCrossReference_6_0()); 
            // InternalMyDsl.g:7494:3: ( ruleEString )
            // InternalMyDsl.g:7495:4: ruleEString
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
    // InternalMyDsl.g:7506:1: rule__GrupoSeguridad__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7510:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7511:2: ( ruleEString )
            {
            // InternalMyDsl.g:7511:2: ( ruleEString )
            // InternalMyDsl.g:7512:3: ruleEString
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
    // InternalMyDsl.g:7521:1: rule__GrupoSeguridad__DescripcionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__DescripcionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7525:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7526:2: ( ruleEString )
            {
            // InternalMyDsl.g:7526:2: ( ruleEString )
            // InternalMyDsl.g:7527:3: ruleEString
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
    // InternalMyDsl.g:7536:1: rule__GrupoSeguridad__VpcAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__VpcAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7540:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7541:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7541:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7542:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_5_0()); 
            // InternalMyDsl.g:7543:3: ( ruleEString )
            // InternalMyDsl.g:7544:4: ruleEString
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
    // InternalMyDsl.g:7555:1: rule__GrupoSeguridad__ReglasEntradaAssignment_6_2 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7559:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:7560:2: ( ruleRegla )
            {
            // InternalMyDsl.g:7560:2: ( ruleRegla )
            // InternalMyDsl.g:7561:3: ruleRegla
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
    // InternalMyDsl.g:7570:1: rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7574:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:7575:2: ( ruleRegla )
            {
            // InternalMyDsl.g:7575:2: ( ruleRegla )
            // InternalMyDsl.g:7576:3: ruleRegla
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
    // InternalMyDsl.g:7585:1: rule__GrupoSeguridad__ReglasSalidaAssignment_7_2 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7589:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:7590:2: ( ruleRegla )
            {
            // InternalMyDsl.g:7590:2: ( ruleRegla )
            // InternalMyDsl.g:7591:3: ruleRegla
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
    // InternalMyDsl.g:7600:1: rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1 : ( ruleRegla ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7604:1: ( ( ruleRegla ) )
            // InternalMyDsl.g:7605:2: ( ruleRegla )
            {
            // InternalMyDsl.g:7605:2: ( ruleRegla )
            // InternalMyDsl.g:7606:3: ruleRegla
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
    // InternalMyDsl.g:7615:1: rule__Regla__TipoAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Regla__TipoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7619:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7620:2: ( ruleEString )
            {
            // InternalMyDsl.g:7620:2: ( ruleEString )
            // InternalMyDsl.g:7621:3: ruleEString
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
    // InternalMyDsl.g:7630:1: rule__Regla__ProtocoloAssignment_4_1 : ( ruleProtocolo ) ;
    public final void rule__Regla__ProtocoloAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7634:1: ( ( ruleProtocolo ) )
            // InternalMyDsl.g:7635:2: ( ruleProtocolo )
            {
            // InternalMyDsl.g:7635:2: ( ruleProtocolo )
            // InternalMyDsl.g:7636:3: ruleProtocolo
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
    // InternalMyDsl.g:7645:1: rule__Regla__PuertoAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Regla__PuertoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7649:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:7650:2: ( ruleEInt )
            {
            // InternalMyDsl.g:7650:2: ( ruleEInt )
            // InternalMyDsl.g:7651:3: ruleEInt
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
    // InternalMyDsl.g:7660:1: rule__Regla__OrigenAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Regla__OrigenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7664:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7665:2: ( ruleEString )
            {
            // InternalMyDsl.g:7665:2: ( ruleEString )
            // InternalMyDsl.g:7666:3: ruleEString
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
    // InternalMyDsl.g:7675:1: rule__Regla__DescripcionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Regla__DescripcionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7679:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7680:2: ( ruleEString )
            {
            // InternalMyDsl.g:7680:2: ( ruleEString )
            // InternalMyDsl.g:7681:3: ruleEString
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0540800000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000F008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x008B008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x020B008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xC001008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001008000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200080000000L,0x00000000000000E2L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000018000000L});

}