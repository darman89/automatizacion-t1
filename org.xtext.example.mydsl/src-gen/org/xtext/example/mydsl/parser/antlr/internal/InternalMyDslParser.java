package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Infraestructura'", "'{'", "'}'", "'Tipo'", "'='", "'parametroConexion'", "'ambientes'", "'['", "','", "']'", "'nombre'", "'recursos'", "'conexiones'", "'seguridad'", "'vpc'", "'UsuarioPassword'", "'usuario'", "'password'", "'Llave'", "'secreto'", "'Conexion'", "'('", "')'", "'tipo'", "'VPC'", "'id'", "'ServidorAplicaciones'", "'tamanio'", "'sistemaOperativo'", "'ServidorAlmacenamiento'", "'tamanioInicial'", "'BaseDatosSQL'", "'manejador'", "'BaseDatosNoSQL'", "'-'", "'InternetGateway'", "'Subred'", "'CIDR'", "'zonaDisponibilidad'", "'GrupoSeguridad'", "'descripcion'", "'reglasEntrada'", "'reglasSalida'", "'Regla'", "'protocolo'", "'puerto'", "'origen'", "'DESARROLLO'", "'PRUEBAS'", "'QA'", "'PRODUCCION'", "'MICRO'", "'SMALL'", "'MEDIUM'", "'LARGE'", "'Windows'", "'Ubuntu1804'", "'POSTGRESQL'", "'MYSQL'", "'ORACLE'", "'SQLSERVER'", "'MONGODB'", "'CASSANDRA'", "'TCP'", "'UDP'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Infraestructura";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInfraestructura"
    // InternalMyDsl.g:65:1: entryRuleInfraestructura returns [EObject current=null] : iv_ruleInfraestructura= ruleInfraestructura EOF ;
    public final EObject entryRuleInfraestructura() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraestructura = null;


        try {
            // InternalMyDsl.g:65:56: (iv_ruleInfraestructura= ruleInfraestructura EOF )
            // InternalMyDsl.g:66:2: iv_ruleInfraestructura= ruleInfraestructura EOF
            {
             newCompositeNode(grammarAccess.getInfraestructuraRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfraestructura=ruleInfraestructura();

            state._fsp--;

             current =iv_ruleInfraestructura; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfraestructura"


    // $ANTLR start "ruleInfraestructura"
    // InternalMyDsl.g:72:1: ruleInfraestructura returns [EObject current=null] : (otherlv_0= 'Infraestructura' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_proveedor_3_0= ruleProveedor ) ) otherlv_4= '}' ) ;
    public final EObject ruleInfraestructura() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_proveedor_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Infraestructura' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_proveedor_3_0= ruleProveedor ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Infraestructura' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_proveedor_3_0= ruleProveedor ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Infraestructura' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_proveedor_3_0= ruleProveedor ) ) otherlv_4= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Infraestructura' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_proveedor_3_0= ruleProveedor ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInfraestructuraAccess().getInfraestructuraKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfraestructuraAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInfraestructuraAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:107:3: ( (lv_proveedor_3_0= ruleProveedor ) )
            // InternalMyDsl.g:108:4: (lv_proveedor_3_0= ruleProveedor )
            {
            // InternalMyDsl.g:108:4: (lv_proveedor_3_0= ruleProveedor )
            // InternalMyDsl.g:109:5: lv_proveedor_3_0= ruleProveedor
            {

            					newCompositeNode(grammarAccess.getInfraestructuraAccess().getProveedorProveedorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_proveedor_3_0=ruleProveedor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
            					}
            					set(
            						current,
            						"proveedor",
            						lv_proveedor_3_0,
            						"org.xtext.example.mydsl.MyDsl.Proveedor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInfraestructuraAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfraestructura"


    // $ANTLR start "entryRuleParametroConexion"
    // InternalMyDsl.g:134:1: entryRuleParametroConexion returns [EObject current=null] : iv_ruleParametroConexion= ruleParametroConexion EOF ;
    public final EObject entryRuleParametroConexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroConexion = null;


        try {
            // InternalMyDsl.g:134:58: (iv_ruleParametroConexion= ruleParametroConexion EOF )
            // InternalMyDsl.g:135:2: iv_ruleParametroConexion= ruleParametroConexion EOF
            {
             newCompositeNode(grammarAccess.getParametroConexionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametroConexion=ruleParametroConexion();

            state._fsp--;

             current =iv_ruleParametroConexion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametroConexion"


    // $ANTLR start "ruleParametroConexion"
    // InternalMyDsl.g:141:1: ruleParametroConexion returns [EObject current=null] : (this_UsuarioPassword_0= ruleUsuarioPassword | this_Llave_1= ruleLlave ) ;
    public final EObject ruleParametroConexion() throws RecognitionException {
        EObject current = null;

        EObject this_UsuarioPassword_0 = null;

        EObject this_Llave_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:147:2: ( (this_UsuarioPassword_0= ruleUsuarioPassword | this_Llave_1= ruleLlave ) )
            // InternalMyDsl.g:148:2: (this_UsuarioPassword_0= ruleUsuarioPassword | this_Llave_1= ruleLlave )
            {
            // InternalMyDsl.g:148:2: (this_UsuarioPassword_0= ruleUsuarioPassword | this_Llave_1= ruleLlave )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==29) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:149:3: this_UsuarioPassword_0= ruleUsuarioPassword
                    {

                    			newCompositeNode(grammarAccess.getParametroConexionAccess().getUsuarioPasswordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UsuarioPassword_0=ruleUsuarioPassword();

                    state._fsp--;


                    			current = this_UsuarioPassword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:158:3: this_Llave_1= ruleLlave
                    {

                    			newCompositeNode(grammarAccess.getParametroConexionAccess().getLlaveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Llave_1=ruleLlave();

                    state._fsp--;


                    			current = this_Llave_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametroConexion"


    // $ANTLR start "entryRuleRecurso"
    // InternalMyDsl.g:170:1: entryRuleRecurso returns [EObject current=null] : iv_ruleRecurso= ruleRecurso EOF ;
    public final EObject entryRuleRecurso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecurso = null;


        try {
            // InternalMyDsl.g:170:48: (iv_ruleRecurso= ruleRecurso EOF )
            // InternalMyDsl.g:171:2: iv_ruleRecurso= ruleRecurso EOF
            {
             newCompositeNode(grammarAccess.getRecursoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecurso=ruleRecurso();

            state._fsp--;

             current =iv_ruleRecurso; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecurso"


    // $ANTLR start "ruleRecurso"
    // InternalMyDsl.g:177:1: ruleRecurso returns [EObject current=null] : (this_ServidorAplicaciones_0= ruleServidorAplicaciones | this_ServidorAlmacenamiento_1= ruleServidorAlmacenamiento | this_BaseDatosSQL_2= ruleBaseDatosSQL | this_BaseDatosNoSQL_3= ruleBaseDatosNoSQL ) ;
    public final EObject ruleRecurso() throws RecognitionException {
        EObject current = null;

        EObject this_ServidorAplicaciones_0 = null;

        EObject this_ServidorAlmacenamiento_1 = null;

        EObject this_BaseDatosSQL_2 = null;

        EObject this_BaseDatosNoSQL_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:183:2: ( (this_ServidorAplicaciones_0= ruleServidorAplicaciones | this_ServidorAlmacenamiento_1= ruleServidorAlmacenamiento | this_BaseDatosSQL_2= ruleBaseDatosSQL | this_BaseDatosNoSQL_3= ruleBaseDatosNoSQL ) )
            // InternalMyDsl.g:184:2: (this_ServidorAplicaciones_0= ruleServidorAplicaciones | this_ServidorAlmacenamiento_1= ruleServidorAlmacenamiento | this_BaseDatosSQL_2= ruleBaseDatosSQL | this_BaseDatosNoSQL_3= ruleBaseDatosNoSQL )
            {
            // InternalMyDsl.g:184:2: (this_ServidorAplicaciones_0= ruleServidorAplicaciones | this_ServidorAlmacenamiento_1= ruleServidorAlmacenamiento | this_BaseDatosSQL_2= ruleBaseDatosSQL | this_BaseDatosNoSQL_3= ruleBaseDatosNoSQL )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 42:
                {
                alt2=3;
                }
                break;
            case 44:
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
                    // InternalMyDsl.g:185:3: this_ServidorAplicaciones_0= ruleServidorAplicaciones
                    {

                    			newCompositeNode(grammarAccess.getRecursoAccess().getServidorAplicacionesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServidorAplicaciones_0=ruleServidorAplicaciones();

                    state._fsp--;


                    			current = this_ServidorAplicaciones_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:194:3: this_ServidorAlmacenamiento_1= ruleServidorAlmacenamiento
                    {

                    			newCompositeNode(grammarAccess.getRecursoAccess().getServidorAlmacenamientoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServidorAlmacenamiento_1=ruleServidorAlmacenamiento();

                    state._fsp--;


                    			current = this_ServidorAlmacenamiento_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:203:3: this_BaseDatosSQL_2= ruleBaseDatosSQL
                    {

                    			newCompositeNode(grammarAccess.getRecursoAccess().getBaseDatosSQLParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseDatosSQL_2=ruleBaseDatosSQL();

                    state._fsp--;


                    			current = this_BaseDatosSQL_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:212:3: this_BaseDatosNoSQL_3= ruleBaseDatosNoSQL
                    {

                    			newCompositeNode(grammarAccess.getRecursoAccess().getBaseDatosNoSQLParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseDatosNoSQL_3=ruleBaseDatosNoSQL();

                    state._fsp--;


                    			current = this_BaseDatosNoSQL_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecurso"


    // $ANTLR start "entryRuleMecanismoSeguridad"
    // InternalMyDsl.g:224:1: entryRuleMecanismoSeguridad returns [EObject current=null] : iv_ruleMecanismoSeguridad= ruleMecanismoSeguridad EOF ;
    public final EObject entryRuleMecanismoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMecanismoSeguridad = null;


        try {
            // InternalMyDsl.g:224:59: (iv_ruleMecanismoSeguridad= ruleMecanismoSeguridad EOF )
            // InternalMyDsl.g:225:2: iv_ruleMecanismoSeguridad= ruleMecanismoSeguridad EOF
            {
             newCompositeNode(grammarAccess.getMecanismoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMecanismoSeguridad=ruleMecanismoSeguridad();

            state._fsp--;

             current =iv_ruleMecanismoSeguridad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMecanismoSeguridad"


    // $ANTLR start "ruleMecanismoSeguridad"
    // InternalMyDsl.g:231:1: ruleMecanismoSeguridad returns [EObject current=null] : (this_InternetGateway_0= ruleInternetGateway | this_Subred_1= ruleSubred | this_GrupoSeguridad_2= ruleGrupoSeguridad ) ;
    public final EObject ruleMecanismoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject this_InternetGateway_0 = null;

        EObject this_Subred_1 = null;

        EObject this_GrupoSeguridad_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:237:2: ( (this_InternetGateway_0= ruleInternetGateway | this_Subred_1= ruleSubred | this_GrupoSeguridad_2= ruleGrupoSeguridad ) )
            // InternalMyDsl.g:238:2: (this_InternetGateway_0= ruleInternetGateway | this_Subred_1= ruleSubred | this_GrupoSeguridad_2= ruleGrupoSeguridad )
            {
            // InternalMyDsl.g:238:2: (this_InternetGateway_0= ruleInternetGateway | this_Subred_1= ruleSubred | this_GrupoSeguridad_2= ruleGrupoSeguridad )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt3=1;
                }
                break;
            case 47:
                {
                alt3=2;
                }
                break;
            case 50:
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
                    // InternalMyDsl.g:239:3: this_InternetGateway_0= ruleInternetGateway
                    {

                    			newCompositeNode(grammarAccess.getMecanismoSeguridadAccess().getInternetGatewayParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternetGateway_0=ruleInternetGateway();

                    state._fsp--;


                    			current = this_InternetGateway_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:248:3: this_Subred_1= ruleSubred
                    {

                    			newCompositeNode(grammarAccess.getMecanismoSeguridadAccess().getSubredParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subred_1=ruleSubred();

                    state._fsp--;


                    			current = this_Subred_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:257:3: this_GrupoSeguridad_2= ruleGrupoSeguridad
                    {

                    			newCompositeNode(grammarAccess.getMecanismoSeguridadAccess().getGrupoSeguridadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GrupoSeguridad_2=ruleGrupoSeguridad();

                    state._fsp--;


                    			current = this_GrupoSeguridad_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMecanismoSeguridad"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:269:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:269:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:270:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:276:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:282:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:283:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:283:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMyDsl.g:284:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:292:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProveedor"
    // InternalMyDsl.g:303:1: entryRuleProveedor returns [EObject current=null] : iv_ruleProveedor= ruleProveedor EOF ;
    public final EObject entryRuleProveedor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProveedor = null;


        try {
            // InternalMyDsl.g:303:50: (iv_ruleProveedor= ruleProveedor EOF )
            // InternalMyDsl.g:304:2: iv_ruleProveedor= ruleProveedor EOF
            {
             newCompositeNode(grammarAccess.getProveedorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProveedor=ruleProveedor();

            state._fsp--;

             current =iv_ruleProveedor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProveedor"


    // $ANTLR start "ruleProveedor"
    // InternalMyDsl.g:310:1: ruleProveedor returns [EObject current=null] : (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= 'parametroConexion' otherlv_4= '=' ( (lv_parametroConexion_5_0= ruleParametroConexion ) ) (otherlv_6= 'ambientes' otherlv_7= '=' otherlv_8= '[' ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) ) (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )* otherlv_12= ']' )? ) ;
    public final EObject ruleProveedor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        EObject lv_parametroConexion_5_0 = null;

        EObject lv_ambientesDespliegue_9_0 = null;

        EObject lv_ambientesDespliegue_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:316:2: ( (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= 'parametroConexion' otherlv_4= '=' ( (lv_parametroConexion_5_0= ruleParametroConexion ) ) (otherlv_6= 'ambientes' otherlv_7= '=' otherlv_8= '[' ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) ) (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )* otherlv_12= ']' )? ) )
            // InternalMyDsl.g:317:2: (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= 'parametroConexion' otherlv_4= '=' ( (lv_parametroConexion_5_0= ruleParametroConexion ) ) (otherlv_6= 'ambientes' otherlv_7= '=' otherlv_8= '[' ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) ) (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )* otherlv_12= ']' )? )
            {
            // InternalMyDsl.g:317:2: (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= 'parametroConexion' otherlv_4= '=' ( (lv_parametroConexion_5_0= ruleParametroConexion ) ) (otherlv_6= 'ambientes' otherlv_7= '=' otherlv_8= '[' ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) ) (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )* otherlv_12= ']' )? )
            // InternalMyDsl.g:318:3: otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= 'parametroConexion' otherlv_4= '=' ( (lv_parametroConexion_5_0= ruleParametroConexion ) ) (otherlv_6= 'ambientes' otherlv_7= '=' otherlv_8= '[' ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) ) (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )* otherlv_12= ']' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProveedorAccess().getTipoKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProveedorAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:326:3: ( (lv_nombre_2_0= ruleEString ) )
            // InternalMyDsl.g:327:4: (lv_nombre_2_0= ruleEString )
            {
            // InternalMyDsl.g:327:4: (lv_nombre_2_0= ruleEString )
            // InternalMyDsl.g:328:5: lv_nombre_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProveedorAccess().getNombreEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_nombre_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProveedorRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getProveedorAccess().getParametroConexionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getProveedorAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:353:3: ( (lv_parametroConexion_5_0= ruleParametroConexion ) )
            // InternalMyDsl.g:354:4: (lv_parametroConexion_5_0= ruleParametroConexion )
            {
            // InternalMyDsl.g:354:4: (lv_parametroConexion_5_0= ruleParametroConexion )
            // InternalMyDsl.g:355:5: lv_parametroConexion_5_0= ruleParametroConexion
            {

            					newCompositeNode(grammarAccess.getProveedorAccess().getParametroConexionParametroConexionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_parametroConexion_5_0=ruleParametroConexion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProveedorRule());
            					}
            					set(
            						current,
            						"parametroConexion",
            						lv_parametroConexion_5_0,
            						"org.xtext.example.mydsl.MyDsl.ParametroConexion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:372:3: (otherlv_6= 'ambientes' otherlv_7= '=' otherlv_8= '[' ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) ) (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )* otherlv_12= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:373:4: otherlv_6= 'ambientes' otherlv_7= '=' otherlv_8= '[' ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) ) (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )* otherlv_12= ']'
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getProveedorAccess().getAmbientesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getProveedorAccess().getEqualsSignKeyword_6_1());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getProveedorAccess().getLeftSquareBracketKeyword_6_2());
                    			
                    // InternalMyDsl.g:385:4: ( (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue ) )
                    // InternalMyDsl.g:386:5: (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue )
                    {
                    // InternalMyDsl.g:386:5: (lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue )
                    // InternalMyDsl.g:387:6: lv_ambientesDespliegue_9_0= ruleAmbienteDespliegue
                    {

                    						newCompositeNode(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_ambientesDespliegue_9_0=ruleAmbienteDespliegue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProveedorRule());
                    						}
                    						add(
                    							current,
                    							"ambientesDespliegue",
                    							lv_ambientesDespliegue_9_0,
                    							"org.xtext.example.mydsl.MyDsl.AmbienteDespliegue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:404:4: (otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:405:5: otherlv_10= ',' ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FOLLOW_4); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getProveedorAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalMyDsl.g:409:5: ( (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue ) )
                    	    // InternalMyDsl.g:410:6: (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue )
                    	    {
                    	    // InternalMyDsl.g:410:6: (lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue )
                    	    // InternalMyDsl.g:411:7: lv_ambientesDespliegue_11_0= ruleAmbienteDespliegue
                    	    {

                    	    							newCompositeNode(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_ambientesDespliegue_11_0=ruleAmbienteDespliegue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProveedorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ambientesDespliegue",
                    	    								lv_ambientesDespliegue_11_0,
                    	    								"org.xtext.example.mydsl.MyDsl.AmbienteDespliegue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getProveedorAccess().getRightSquareBracketKeyword_6_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProveedor"


    // $ANTLR start "entryRuleAmbienteDespliegue"
    // InternalMyDsl.g:438:1: entryRuleAmbienteDespliegue returns [EObject current=null] : iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF ;
    public final EObject entryRuleAmbienteDespliegue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbienteDespliegue = null;


        try {
            // InternalMyDsl.g:438:59: (iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF )
            // InternalMyDsl.g:439:2: iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF
            {
             newCompositeNode(grammarAccess.getAmbienteDespliegueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmbienteDespliegue=ruleAmbienteDespliegue();

            state._fsp--;

             current =iv_ruleAmbienteDespliegue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmbienteDespliegue"


    // $ANTLR start "ruleAmbienteDespliegue"
    // InternalMyDsl.g:445:1: ruleAmbienteDespliegue returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'nombre' otherlv_3= '=' ( (lv_nombre_4_0= ruleNombreAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '{' ( (lv_recursos_7_0= ruleRecurso ) ) (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )* otherlv_10= '}' )? (otherlv_11= 'conexiones' otherlv_12= '{' ( (lv_conexiones_13_0= ruleConexion ) ) (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )* otherlv_16= '}' )? (otherlv_17= 'seguridad' otherlv_18= '{' ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) ) (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )* otherlv_22= '}' )? (otherlv_23= 'vpc' otherlv_24= '=' otherlv_25= '[' otherlv_26= '{' ( (lv_vpc_27_0= ruleVPC ) ) (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )* otherlv_30= '}' )? otherlv_31= ']' otherlv_32= '}' ) ;
    public final EObject ruleAmbienteDespliegue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Enumerator lv_nombre_4_0 = null;

        EObject lv_recursos_7_0 = null;

        EObject lv_recursos_9_0 = null;

        EObject lv_conexiones_13_0 = null;

        EObject lv_conexiones_15_0 = null;

        EObject lv_seguridad_19_0 = null;

        EObject lv_seguridad_21_0 = null;

        EObject lv_vpc_27_0 = null;

        EObject lv_vpc_29_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:451:2: ( ( () otherlv_1= '{' (otherlv_2= 'nombre' otherlv_3= '=' ( (lv_nombre_4_0= ruleNombreAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '{' ( (lv_recursos_7_0= ruleRecurso ) ) (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )* otherlv_10= '}' )? (otherlv_11= 'conexiones' otherlv_12= '{' ( (lv_conexiones_13_0= ruleConexion ) ) (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )* otherlv_16= '}' )? (otherlv_17= 'seguridad' otherlv_18= '{' ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) ) (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )* otherlv_22= '}' )? (otherlv_23= 'vpc' otherlv_24= '=' otherlv_25= '[' otherlv_26= '{' ( (lv_vpc_27_0= ruleVPC ) ) (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )* otherlv_30= '}' )? otherlv_31= ']' otherlv_32= '}' ) )
            // InternalMyDsl.g:452:2: ( () otherlv_1= '{' (otherlv_2= 'nombre' otherlv_3= '=' ( (lv_nombre_4_0= ruleNombreAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '{' ( (lv_recursos_7_0= ruleRecurso ) ) (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )* otherlv_10= '}' )? (otherlv_11= 'conexiones' otherlv_12= '{' ( (lv_conexiones_13_0= ruleConexion ) ) (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )* otherlv_16= '}' )? (otherlv_17= 'seguridad' otherlv_18= '{' ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) ) (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )* otherlv_22= '}' )? (otherlv_23= 'vpc' otherlv_24= '=' otherlv_25= '[' otherlv_26= '{' ( (lv_vpc_27_0= ruleVPC ) ) (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )* otherlv_30= '}' )? otherlv_31= ']' otherlv_32= '}' )
            {
            // InternalMyDsl.g:452:2: ( () otherlv_1= '{' (otherlv_2= 'nombre' otherlv_3= '=' ( (lv_nombre_4_0= ruleNombreAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '{' ( (lv_recursos_7_0= ruleRecurso ) ) (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )* otherlv_10= '}' )? (otherlv_11= 'conexiones' otherlv_12= '{' ( (lv_conexiones_13_0= ruleConexion ) ) (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )* otherlv_16= '}' )? (otherlv_17= 'seguridad' otherlv_18= '{' ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) ) (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )* otherlv_22= '}' )? (otherlv_23= 'vpc' otherlv_24= '=' otherlv_25= '[' otherlv_26= '{' ( (lv_vpc_27_0= ruleVPC ) ) (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )* otherlv_30= '}' )? otherlv_31= ']' otherlv_32= '}' )
            // InternalMyDsl.g:453:3: () otherlv_1= '{' (otherlv_2= 'nombre' otherlv_3= '=' ( (lv_nombre_4_0= ruleNombreAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '{' ( (lv_recursos_7_0= ruleRecurso ) ) (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )* otherlv_10= '}' )? (otherlv_11= 'conexiones' otherlv_12= '{' ( (lv_conexiones_13_0= ruleConexion ) ) (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )* otherlv_16= '}' )? (otherlv_17= 'seguridad' otherlv_18= '{' ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) ) (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )* otherlv_22= '}' )? (otherlv_23= 'vpc' otherlv_24= '=' otherlv_25= '[' otherlv_26= '{' ( (lv_vpc_27_0= ruleVPC ) ) (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )* otherlv_30= '}' )? otherlv_31= ']' otherlv_32= '}'
            {
            // InternalMyDsl.g:453:3: ()
            // InternalMyDsl.g:454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:464:3: (otherlv_2= 'nombre' otherlv_3= '=' ( (lv_nombre_4_0= ruleNombreAmbiente ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:465:4: otherlv_2= 'nombre' otherlv_3= '=' ( (lv_nombre_4_0= ruleNombreAmbiente ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getAmbienteDespliegueAccess().getNombreKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalMyDsl.g:473:4: ( (lv_nombre_4_0= ruleNombreAmbiente ) )
                    // InternalMyDsl.g:474:5: (lv_nombre_4_0= ruleNombreAmbiente )
                    {
                    // InternalMyDsl.g:474:5: (lv_nombre_4_0= ruleNombreAmbiente )
                    // InternalMyDsl.g:475:6: lv_nombre_4_0= ruleNombreAmbiente
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getNombreNombreAmbienteEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_nombre_4_0=ruleNombreAmbiente();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.mydsl.MyDsl.NombreAmbiente");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:493:3: (otherlv_5= 'recursos' otherlv_6= '{' ( (lv_recursos_7_0= ruleRecurso ) ) (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:494:4: otherlv_5= 'recursos' otherlv_6= '{' ( (lv_recursos_7_0= ruleRecurso ) ) (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:502:4: ( (lv_recursos_7_0= ruleRecurso ) )
                    // InternalMyDsl.g:503:5: (lv_recursos_7_0= ruleRecurso )
                    {
                    // InternalMyDsl.g:503:5: (lv_recursos_7_0= ruleRecurso )
                    // InternalMyDsl.g:504:6: lv_recursos_7_0= ruleRecurso
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_recursos_7_0=ruleRecurso();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    						}
                    						add(
                    							current,
                    							"recursos",
                    							lv_recursos_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Recurso");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:521:4: (otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:522:5: otherlv_8= ',' ( (lv_recursos_9_0= ruleRecurso ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:526:5: ( (lv_recursos_9_0= ruleRecurso ) )
                    	    // InternalMyDsl.g:527:6: (lv_recursos_9_0= ruleRecurso )
                    	    {
                    	    // InternalMyDsl.g:527:6: (lv_recursos_9_0= ruleRecurso )
                    	    // InternalMyDsl.g:528:7: lv_recursos_9_0= ruleRecurso
                    	    {

                    	    							newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_recursos_9_0=ruleRecurso();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"recursos",
                    	    								lv_recursos_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Recurso");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:551:3: (otherlv_11= 'conexiones' otherlv_12= '{' ( (lv_conexiones_13_0= ruleConexion ) ) (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )* otherlv_16= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:552:4: otherlv_11= 'conexiones' otherlv_12= '{' ( (lv_conexiones_13_0= ruleConexion ) ) (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getAmbienteDespliegueAccess().getConexionesKeyword_4_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:560:4: ( (lv_conexiones_13_0= ruleConexion ) )
                    // InternalMyDsl.g:561:5: (lv_conexiones_13_0= ruleConexion )
                    {
                    // InternalMyDsl.g:561:5: (lv_conexiones_13_0= ruleConexion )
                    // InternalMyDsl.g:562:6: lv_conexiones_13_0= ruleConexion
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getConexionesConexionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_conexiones_13_0=ruleConexion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    						}
                    						add(
                    							current,
                    							"conexiones",
                    							lv_conexiones_13_0,
                    							"org.xtext.example.mydsl.MyDsl.Conexion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:579:4: (otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:580:5: otherlv_14= ',' ( (lv_conexiones_15_0= ruleConexion ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:584:5: ( (lv_conexiones_15_0= ruleConexion ) )
                    	    // InternalMyDsl.g:585:6: (lv_conexiones_15_0= ruleConexion )
                    	    {
                    	    // InternalMyDsl.g:585:6: (lv_conexiones_15_0= ruleConexion )
                    	    // InternalMyDsl.g:586:7: lv_conexiones_15_0= ruleConexion
                    	    {

                    	    							newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getConexionesConexionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_conexiones_15_0=ruleConexion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conexiones",
                    	    								lv_conexiones_15_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Conexion");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_16, grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:609:3: (otherlv_17= 'seguridad' otherlv_18= '{' ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) ) (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )* otherlv_22= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:610:4: otherlv_17= 'seguridad' otherlv_18= '{' ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) ) (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getAmbienteDespliegueAccess().getSeguridadKeyword_5_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_18, grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:618:4: ( (lv_seguridad_19_0= ruleMecanismoSeguridad ) )
                    // InternalMyDsl.g:619:5: (lv_seguridad_19_0= ruleMecanismoSeguridad )
                    {
                    // InternalMyDsl.g:619:5: (lv_seguridad_19_0= ruleMecanismoSeguridad )
                    // InternalMyDsl.g:620:6: lv_seguridad_19_0= ruleMecanismoSeguridad
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getSeguridadMecanismoSeguridadParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_seguridad_19_0=ruleMecanismoSeguridad();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    						}
                    						add(
                    							current,
                    							"seguridad",
                    							lv_seguridad_19_0,
                    							"org.xtext.example.mydsl.MyDsl.MecanismoSeguridad");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:637:4: (otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:638:5: otherlv_20= ',' ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) )
                    	    {
                    	    otherlv_20=(Token)match(input,19,FOLLOW_21); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:642:5: ( (lv_seguridad_21_0= ruleMecanismoSeguridad ) )
                    	    // InternalMyDsl.g:643:6: (lv_seguridad_21_0= ruleMecanismoSeguridad )
                    	    {
                    	    // InternalMyDsl.g:643:6: (lv_seguridad_21_0= ruleMecanismoSeguridad )
                    	    // InternalMyDsl.g:644:7: lv_seguridad_21_0= ruleMecanismoSeguridad
                    	    {

                    	    							newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getSeguridadMecanismoSeguridadParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_seguridad_21_0=ruleMecanismoSeguridad();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"seguridad",
                    	    								lv_seguridad_21_0,
                    	    								"org.xtext.example.mydsl.MyDsl.MecanismoSeguridad");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_22, grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:667:3: (otherlv_23= 'vpc' otherlv_24= '=' otherlv_25= '[' otherlv_26= '{' ( (lv_vpc_27_0= ruleVPC ) ) (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )* otherlv_30= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:668:4: otherlv_23= 'vpc' otherlv_24= '=' otherlv_25= '[' otherlv_26= '{' ( (lv_vpc_27_0= ruleVPC ) ) (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )* otherlv_30= '}'
                    {
                    otherlv_23=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_23, grammarAccess.getAmbienteDespliegueAccess().getVpcKeyword_6_0());
                    			
                    otherlv_24=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_24, grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_6_1());
                    			
                    otherlv_25=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_6_2());
                    			
                    otherlv_26=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_26, grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_6_3());
                    			
                    // InternalMyDsl.g:684:4: ( (lv_vpc_27_0= ruleVPC ) )
                    // InternalMyDsl.g:685:5: (lv_vpc_27_0= ruleVPC )
                    {
                    // InternalMyDsl.g:685:5: (lv_vpc_27_0= ruleVPC )
                    // InternalMyDsl.g:686:6: lv_vpc_27_0= ruleVPC
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_vpc_27_0=ruleVPC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    						}
                    						add(
                    							current,
                    							"vpc",
                    							lv_vpc_27_0,
                    							"org.xtext.example.mydsl.MyDsl.VPC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:703:4: (otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:704:5: otherlv_28= ',' ( (lv_vpc_29_0= ruleVPC ) )
                    	    {
                    	    otherlv_28=(Token)match(input,19,FOLLOW_23); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_6_5_0());
                    	    				
                    	    // InternalMyDsl.g:708:5: ( (lv_vpc_29_0= ruleVPC ) )
                    	    // InternalMyDsl.g:709:6: (lv_vpc_29_0= ruleVPC )
                    	    {
                    	    // InternalMyDsl.g:709:6: (lv_vpc_29_0= ruleVPC )
                    	    // InternalMyDsl.g:710:7: lv_vpc_29_0= ruleVPC
                    	    {

                    	    							newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_6_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_vpc_29_0=ruleVPC();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vpc",
                    	    								lv_vpc_29_0,
                    	    								"org.xtext.example.mydsl.MyDsl.VPC");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,13,FOLLOW_24); 

                    				newLeafNode(otherlv_30, grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_6_6());
                    			

                    }
                    break;

            }

            otherlv_31=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_31, grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_32=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmbienteDespliegue"


    // $ANTLR start "entryRuleUsuarioPassword"
    // InternalMyDsl.g:745:1: entryRuleUsuarioPassword returns [EObject current=null] : iv_ruleUsuarioPassword= ruleUsuarioPassword EOF ;
    public final EObject entryRuleUsuarioPassword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsuarioPassword = null;


        try {
            // InternalMyDsl.g:745:56: (iv_ruleUsuarioPassword= ruleUsuarioPassword EOF )
            // InternalMyDsl.g:746:2: iv_ruleUsuarioPassword= ruleUsuarioPassword EOF
            {
             newCompositeNode(grammarAccess.getUsuarioPasswordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsuarioPassword=ruleUsuarioPassword();

            state._fsp--;

             current =iv_ruleUsuarioPassword; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsuarioPassword"


    // $ANTLR start "ruleUsuarioPassword"
    // InternalMyDsl.g:752:1: ruleUsuarioPassword returns [EObject current=null] : ( () otherlv_1= 'UsuarioPassword' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'password' ( (lv_password_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleUsuarioPassword() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_usuario_4_0 = null;

        AntlrDatatypeRuleToken lv_password_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:758:2: ( ( () otherlv_1= 'UsuarioPassword' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'password' ( (lv_password_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:759:2: ( () otherlv_1= 'UsuarioPassword' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'password' ( (lv_password_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:759:2: ( () otherlv_1= 'UsuarioPassword' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'password' ( (lv_password_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:760:3: () otherlv_1= 'UsuarioPassword' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'password' ( (lv_password_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:760:3: ()
            // InternalMyDsl.g:761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getUsuarioPasswordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:775:3: (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:776:4: otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getUsuarioPasswordAccess().getUsuarioKeyword_3_0());
                    			
                    // InternalMyDsl.g:780:4: ( (lv_usuario_4_0= ruleEString ) )
                    // InternalMyDsl.g:781:5: (lv_usuario_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:781:5: (lv_usuario_4_0= ruleEString )
                    // InternalMyDsl.g:782:6: lv_usuario_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUsuarioPasswordAccess().getUsuarioEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_usuario_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUsuarioPasswordRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:800:3: (otherlv_5= 'password' ( (lv_password_6_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:801:4: otherlv_5= 'password' ( (lv_password_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getUsuarioPasswordAccess().getPasswordKeyword_4_0());
                    			
                    // InternalMyDsl.g:805:4: ( (lv_password_6_0= ruleEString ) )
                    // InternalMyDsl.g:806:5: (lv_password_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:806:5: (lv_password_6_0= ruleEString )
                    // InternalMyDsl.g:807:6: lv_password_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUsuarioPasswordAccess().getPasswordEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_password_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUsuarioPasswordRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getUsuarioPasswordAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsuarioPassword"


    // $ANTLR start "entryRuleLlave"
    // InternalMyDsl.g:833:1: entryRuleLlave returns [EObject current=null] : iv_ruleLlave= ruleLlave EOF ;
    public final EObject entryRuleLlave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlave = null;


        try {
            // InternalMyDsl.g:833:46: (iv_ruleLlave= ruleLlave EOF )
            // InternalMyDsl.g:834:2: iv_ruleLlave= ruleLlave EOF
            {
             newCompositeNode(grammarAccess.getLlaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlave=ruleLlave();

            state._fsp--;

             current =iv_ruleLlave; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlave"


    // $ANTLR start "ruleLlave"
    // InternalMyDsl.g:840:1: ruleLlave returns [EObject current=null] : ( () otherlv_1= 'Llave' otherlv_2= '{' (otherlv_3= 'secreto' ( (lv_secreto_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLlave() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_secreto_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:846:2: ( ( () otherlv_1= 'Llave' otherlv_2= '{' (otherlv_3= 'secreto' ( (lv_secreto_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:847:2: ( () otherlv_1= 'Llave' otherlv_2= '{' (otherlv_3= 'secreto' ( (lv_secreto_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:847:2: ( () otherlv_1= 'Llave' otherlv_2= '{' (otherlv_3= 'secreto' ( (lv_secreto_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:848:3: () otherlv_1= 'Llave' otherlv_2= '{' (otherlv_3= 'secreto' ( (lv_secreto_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:848:3: ()
            // InternalMyDsl.g:849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLlaveAccess().getLlaveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLlaveAccess().getLlaveKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getLlaveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:863:3: (otherlv_3= 'secreto' ( (lv_secreto_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:864:4: otherlv_3= 'secreto' ( (lv_secreto_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLlaveAccess().getSecretoKeyword_3_0());
                    			
                    // InternalMyDsl.g:868:4: ( (lv_secreto_4_0= ruleEString ) )
                    // InternalMyDsl.g:869:5: (lv_secreto_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:869:5: (lv_secreto_4_0= ruleEString )
                    // InternalMyDsl.g:870:6: lv_secreto_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLlaveAccess().getSecretoEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_secreto_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLlaveRule());
                    						}
                    						set(
                    							current,
                    							"secreto",
                    							lv_secreto_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLlaveAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlave"


    // $ANTLR start "entryRuleConexion"
    // InternalMyDsl.g:896:1: entryRuleConexion returns [EObject current=null] : iv_ruleConexion= ruleConexion EOF ;
    public final EObject entryRuleConexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConexion = null;


        try {
            // InternalMyDsl.g:896:49: (iv_ruleConexion= ruleConexion EOF )
            // InternalMyDsl.g:897:2: iv_ruleConexion= ruleConexion EOF
            {
             newCompositeNode(grammarAccess.getConexionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConexion=ruleConexion();

            state._fsp--;

             current =iv_ruleConexion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConexion"


    // $ANTLR start "ruleConexion"
    // InternalMyDsl.g:903:1: ruleConexion returns [EObject current=null] : (otherlv_0= 'Conexion' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'recursos' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) ;
    public final EObject ruleConexion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:909:2: ( (otherlv_0= 'Conexion' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'recursos' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) )
            // InternalMyDsl.g:910:2: (otherlv_0= 'Conexion' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'recursos' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            {
            // InternalMyDsl.g:910:2: (otherlv_0= 'Conexion' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'recursos' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            // InternalMyDsl.g:911:3: otherlv_0= 'Conexion' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'recursos' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConexionAccess().getConexionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getConexionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:919:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:920:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getConexionAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:924:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:925:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:925:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:926:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConexionAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConexionRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getConexionAccess().getRecursosKeyword_3());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getConexionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:952:3: ( ( ruleEString ) )
            // InternalMyDsl.g:953:4: ( ruleEString )
            {
            // InternalMyDsl.g:953:4: ( ruleEString )
            // InternalMyDsl.g:954:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConexionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConexionAccess().getRecursosRecursoCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:968:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:969:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConexionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:973:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:974:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:974:5: ( ruleEString )
            	    // InternalMyDsl.g:975:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConexionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getConexionAccess().getRecursosRecursoCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getConexionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getConexionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConexion"


    // $ANTLR start "entryRuleVPC"
    // InternalMyDsl.g:1002:1: entryRuleVPC returns [EObject current=null] : iv_ruleVPC= ruleVPC EOF ;
    public final EObject entryRuleVPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVPC = null;


        try {
            // InternalMyDsl.g:1002:44: (iv_ruleVPC= ruleVPC EOF )
            // InternalMyDsl.g:1003:2: iv_ruleVPC= ruleVPC EOF
            {
             newCompositeNode(grammarAccess.getVPCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVPC=ruleVPC();

            state._fsp--;

             current =iv_ruleVPC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVPC"


    // $ANTLR start "ruleVPC"
    // InternalMyDsl.g:1009:1: ruleVPC returns [EObject current=null] : (otherlv_0= 'tipo' otherlv_1= '=' otherlv_2= 'VPC' otherlv_3= 'id' otherlv_4= '=' ( (lv_nombre_5_0= ruleEString ) ) ) ;
    public final EObject ruleVPC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1015:2: ( (otherlv_0= 'tipo' otherlv_1= '=' otherlv_2= 'VPC' otherlv_3= 'id' otherlv_4= '=' ( (lv_nombre_5_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1016:2: (otherlv_0= 'tipo' otherlv_1= '=' otherlv_2= 'VPC' otherlv_3= 'id' otherlv_4= '=' ( (lv_nombre_5_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1016:2: (otherlv_0= 'tipo' otherlv_1= '=' otherlv_2= 'VPC' otherlv_3= 'id' otherlv_4= '=' ( (lv_nombre_5_0= ruleEString ) ) )
            // InternalMyDsl.g:1017:3: otherlv_0= 'tipo' otherlv_1= '=' otherlv_2= 'VPC' otherlv_3= 'id' otherlv_4= '=' ( (lv_nombre_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getVPCAccess().getTipoKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getVPCAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getVPCAccess().getVPCKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getVPCAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVPCAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1037:3: ( (lv_nombre_5_0= ruleEString ) )
            // InternalMyDsl.g:1038:4: (lv_nombre_5_0= ruleEString )
            {
            // InternalMyDsl.g:1038:4: (lv_nombre_5_0= ruleEString )
            // InternalMyDsl.g:1039:5: lv_nombre_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVPCAccess().getNombreEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_nombre_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVPCRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_5_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVPC"


    // $ANTLR start "entryRuleServidorAplicaciones"
    // InternalMyDsl.g:1060:1: entryRuleServidorAplicaciones returns [EObject current=null] : iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF ;
    public final EObject entryRuleServidorAplicaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAplicaciones = null;


        try {
            // InternalMyDsl.g:1060:61: (iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF )
            // InternalMyDsl.g:1061:2: iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF
            {
             newCompositeNode(grammarAccess.getServidorAplicacionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorAplicaciones=ruleServidorAplicaciones();

            state._fsp--;

             current =iv_ruleServidorAplicaciones; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorAplicaciones"


    // $ANTLR start "ruleServidorAplicaciones"
    // InternalMyDsl.g:1067:1: ruleServidorAplicaciones returns [EObject current=null] : (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) ;
    public final EObject ruleServidorAplicaciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        Enumerator lv_tamanio_5_0 = null;

        Enumerator lv_sistemaOperativo_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1073:2: ( (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:1074:2: (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:1074:2: (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            // InternalMyDsl.g:1075:3: otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1083:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1084:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1088:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1089:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1089:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1090:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1108:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1109:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getServidorAplicacionesAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:1113:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:1114:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:1114:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:1115:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_tamanio_5_0=ruleTamanioServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"tamanio",
                    							lv_tamanio_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TamanioServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1133:3: (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1134:4: otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_4_0());
                    			
                    // InternalMyDsl.g:1138:4: ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) )
                    // InternalMyDsl.g:1139:5: (lv_sistemaOperativo_7_0= ruleSistemaOperativo )
                    {
                    // InternalMyDsl.g:1139:5: (lv_sistemaOperativo_7_0= ruleSistemaOperativo )
                    // InternalMyDsl.g:1140:6: lv_sistemaOperativo_7_0= ruleSistemaOperativo
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoSistemaOperativoEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_sistemaOperativo_7_0=ruleSistemaOperativo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"sistemaOperativo",
                    							lv_sistemaOperativo_7_0,
                    							"org.xtext.example.mydsl.MyDsl.SistemaOperativo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1158:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1159:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getServidorAplicacionesAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1167:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1168:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1168:5: ( ruleEString )
                    // InternalMyDsl.g:1169:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1183:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:1184:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1188:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1189:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1189:6: ( ruleEString )
                    	    // InternalMyDsl.g:1190:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:1214:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1215:4: ( ruleEString )
            {
            // InternalMyDsl.g:1215:4: ( ruleEString )
            // InternalMyDsl.g:1216:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAplicacionesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_7_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorAplicaciones"


    // $ANTLR start "entryRuleServidorAlmacenamiento"
    // InternalMyDsl.g:1238:1: entryRuleServidorAlmacenamiento returns [EObject current=null] : iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF ;
    public final EObject entryRuleServidorAlmacenamiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAlmacenamiento = null;


        try {
            // InternalMyDsl.g:1238:63: (iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF )
            // InternalMyDsl.g:1239:2: iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF
            {
             newCompositeNode(grammarAccess.getServidorAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorAlmacenamiento=ruleServidorAlmacenamiento();

            state._fsp--;

             current =iv_ruleServidorAlmacenamiento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorAlmacenamiento"


    // $ANTLR start "ruleServidorAlmacenamiento"
    // InternalMyDsl.g:1245:1: ruleServidorAlmacenamiento returns [EObject current=null] : (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) ;
    public final EObject ruleServidorAlmacenamiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        Enumerator lv_tamanio_5_0 = null;

        AntlrDatatypeRuleToken lv_tamanioInicial_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1251:2: ( (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:1252:2: (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:1252:2: (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            // InternalMyDsl.g:1253:3: otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorAlmacenamientoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1261:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1262:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServidorAlmacenamientoAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1266:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1267:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1267:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1268:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1286:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1287:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getServidorAlmacenamientoAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:1291:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:1292:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:1292:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:1293:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_tamanio_5_0=ruleTamanioServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"tamanio",
                    							lv_tamanio_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TamanioServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1311:3: (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1312:4: otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialKeyword_4_0());
                    			
                    // InternalMyDsl.g:1316:4: ( (lv_tamanioInicial_7_0= ruleEInt ) )
                    // InternalMyDsl.g:1317:5: (lv_tamanioInicial_7_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1317:5: (lv_tamanioInicial_7_0= ruleEInt )
                    // InternalMyDsl.g:1318:6: lv_tamanioInicial_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_tamanioInicial_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"tamanioInicial",
                    							lv_tamanioInicial_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1336:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1337:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getServidorAlmacenamientoAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorAlmacenamientoAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1345:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1346:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1346:5: ( ruleEString )
                    // InternalMyDsl.g:1347:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1361:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==19) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:1362:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getServidorAlmacenamientoAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1366:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1367:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1367:6: ( ruleEString )
                    	    // InternalMyDsl.g:1368:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorAlmacenamientoAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:1392:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1393:4: ( ruleEString )
            {
            // InternalMyDsl.g:1393:4: ( ruleEString )
            // InternalMyDsl.g:1394:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCCrossReference_7_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getServidorAlmacenamientoAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorAlmacenamiento"


    // $ANTLR start "entryRuleBaseDatosSQL"
    // InternalMyDsl.g:1416:1: entryRuleBaseDatosSQL returns [EObject current=null] : iv_ruleBaseDatosSQL= ruleBaseDatosSQL EOF ;
    public final EObject entryRuleBaseDatosSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDatosSQL = null;


        try {
            // InternalMyDsl.g:1416:53: (iv_ruleBaseDatosSQL= ruleBaseDatosSQL EOF )
            // InternalMyDsl.g:1417:2: iv_ruleBaseDatosSQL= ruleBaseDatosSQL EOF
            {
             newCompositeNode(grammarAccess.getBaseDatosSQLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseDatosSQL=ruleBaseDatosSQL();

            state._fsp--;

             current =iv_ruleBaseDatosSQL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseDatosSQL"


    // $ANTLR start "ruleBaseDatosSQL"
    // InternalMyDsl.g:1423:1: ruleBaseDatosSQL returns [EObject current=null] : (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) ;
    public final EObject ruleBaseDatosSQL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        Enumerator lv_tamanio_5_0 = null;

        Enumerator lv_manejador_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1429:2: ( (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:1430:2: (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:1430:2: (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            // InternalMyDsl.g:1431:3: otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseDatosSQLAccess().getBaseDatosSQLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseDatosSQLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1439:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1440:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBaseDatosSQLAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1444:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1445:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1445:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1446:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseDatosSQLRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1464:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1465:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseDatosSQLAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:1469:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:1470:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:1470:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:1471:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_tamanio_5_0=ruleTamanioServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseDatosSQLRule());
                    						}
                    						set(
                    							current,
                    							"tamanio",
                    							lv_tamanio_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TamanioServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1489:3: (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1490:4: otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseDatosSQLAccess().getManejadorKeyword_4_0());
                    			
                    // InternalMyDsl.g:1494:4: ( (lv_manejador_7_0= ruleManejadorSQL ) )
                    // InternalMyDsl.g:1495:5: (lv_manejador_7_0= ruleManejadorSQL )
                    {
                    // InternalMyDsl.g:1495:5: (lv_manejador_7_0= ruleManejadorSQL )
                    // InternalMyDsl.g:1496:6: lv_manejador_7_0= ruleManejadorSQL
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getManejadorManejadorSQLEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_manejador_7_0=ruleManejadorSQL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseDatosSQLRule());
                    						}
                    						set(
                    							current,
                    							"manejador",
                    							lv_manejador_7_0,
                    							"org.xtext.example.mydsl.MyDsl.ManejadorSQL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1514:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1515:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseDatosSQLAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBaseDatosSQLAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1523:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1524:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1524:5: ( ruleEString )
                    // InternalMyDsl.g:1525:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseDatosSQLRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1539:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==19) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:1540:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBaseDatosSQLAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1544:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1545:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1545:6: ( ruleEString )
                    	    // InternalMyDsl.g:1546:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBaseDatosSQLRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_13, grammarAccess.getBaseDatosSQLAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getBaseDatosSQLAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:1570:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1571:4: ( ruleEString )
            {
            // InternalMyDsl.g:1571:4: ( ruleEString )
            // InternalMyDsl.g:1572:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaseDatosSQLRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getVpcVPCCrossReference_7_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBaseDatosSQLAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseDatosSQL"


    // $ANTLR start "entryRuleBaseDatosNoSQL"
    // InternalMyDsl.g:1594:1: entryRuleBaseDatosNoSQL returns [EObject current=null] : iv_ruleBaseDatosNoSQL= ruleBaseDatosNoSQL EOF ;
    public final EObject entryRuleBaseDatosNoSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDatosNoSQL = null;


        try {
            // InternalMyDsl.g:1594:55: (iv_ruleBaseDatosNoSQL= ruleBaseDatosNoSQL EOF )
            // InternalMyDsl.g:1595:2: iv_ruleBaseDatosNoSQL= ruleBaseDatosNoSQL EOF
            {
             newCompositeNode(grammarAccess.getBaseDatosNoSQLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseDatosNoSQL=ruleBaseDatosNoSQL();

            state._fsp--;

             current =iv_ruleBaseDatosNoSQL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseDatosNoSQL"


    // $ANTLR start "ruleBaseDatosNoSQL"
    // InternalMyDsl.g:1601:1: ruleBaseDatosNoSQL returns [EObject current=null] : (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) ;
    public final EObject ruleBaseDatosNoSQL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        Enumerator lv_tamanio_5_0 = null;

        Enumerator lv_manejador_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1607:2: ( (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:1608:2: (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:1608:2: (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            // InternalMyDsl.g:1609:3: otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseDatosNoSQLAccess().getBaseDatosNoSQLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseDatosNoSQLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1617:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1618:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBaseDatosNoSQLAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1622:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1623:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1623:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1624:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseDatosNoSQLRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1642:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1643:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseDatosNoSQLAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:1647:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:1648:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:1648:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:1649:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_tamanio_5_0=ruleTamanioServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseDatosNoSQLRule());
                    						}
                    						set(
                    							current,
                    							"tamanio",
                    							lv_tamanio_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TamanioServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1667:3: (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1668:4: otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_49); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseDatosNoSQLAccess().getManejadorKeyword_4_0());
                    			
                    // InternalMyDsl.g:1672:4: ( (lv_manejador_7_0= ruleManejadorNoSQL ) )
                    // InternalMyDsl.g:1673:5: (lv_manejador_7_0= ruleManejadorNoSQL )
                    {
                    // InternalMyDsl.g:1673:5: (lv_manejador_7_0= ruleManejadorNoSQL )
                    // InternalMyDsl.g:1674:6: lv_manejador_7_0= ruleManejadorNoSQL
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getManejadorManejadorNoSQLEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_manejador_7_0=ruleManejadorNoSQL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseDatosNoSQLRule());
                    						}
                    						set(
                    							current,
                    							"manejador",
                    							lv_manejador_7_0,
                    							"org.xtext.example.mydsl.MyDsl.ManejadorNoSQL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1692:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1693:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseDatosNoSQLAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBaseDatosNoSQLAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1701:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1702:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1702:5: ( ruleEString )
                    // InternalMyDsl.g:1703:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseDatosNoSQLRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1717:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==19) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMyDsl.g:1718:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBaseDatosNoSQLAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1722:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1723:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1723:6: ( ruleEString )
                    	    // InternalMyDsl.g:1724:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBaseDatosNoSQLRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_13, grammarAccess.getBaseDatosNoSQLAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getBaseDatosNoSQLAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:1748:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1749:4: ( ruleEString )
            {
            // InternalMyDsl.g:1749:4: ( ruleEString )
            // InternalMyDsl.g:1750:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaseDatosNoSQLRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getVpcVPCCrossReference_7_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBaseDatosNoSQLAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseDatosNoSQL"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1772:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1772:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1773:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1779:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1785:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1786:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1786:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1787:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1787:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1788:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_50); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInternetGateway"
    // InternalMyDsl.g:1805:1: entryRuleInternetGateway returns [EObject current=null] : iv_ruleInternetGateway= ruleInternetGateway EOF ;
    public final EObject entryRuleInternetGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternetGateway = null;


        try {
            // InternalMyDsl.g:1805:56: (iv_ruleInternetGateway= ruleInternetGateway EOF )
            // InternalMyDsl.g:1806:2: iv_ruleInternetGateway= ruleInternetGateway EOF
            {
             newCompositeNode(grammarAccess.getInternetGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternetGateway=ruleInternetGateway();

            state._fsp--;

             current =iv_ruleInternetGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternetGateway"


    // $ANTLR start "ruleInternetGateway"
    // InternalMyDsl.g:1812:1: ruleInternetGateway returns [EObject current=null] : (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleInternetGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1818:2: ( (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1819:2: (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1819:2: (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1820:3: otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1828:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1829:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInternetGatewayAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1833:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1834:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1834:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1835:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternetGatewayRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getInternetGatewayAccess().getVpcKeyword_3());
            		
            // InternalMyDsl.g:1857:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1858:4: ( ruleEString )
            {
            // InternalMyDsl.g:1858:4: ( ruleEString )
            // InternalMyDsl.g:1859:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInternetGatewayRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInternetGatewayAccess().getVpcVPCCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternetGateway"


    // $ANTLR start "entryRuleSubred"
    // InternalMyDsl.g:1881:1: entryRuleSubred returns [EObject current=null] : iv_ruleSubred= ruleSubred EOF ;
    public final EObject entryRuleSubred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubred = null;


        try {
            // InternalMyDsl.g:1881:47: (iv_ruleSubred= ruleSubred EOF )
            // InternalMyDsl.g:1882:2: iv_ruleSubred= ruleSubred EOF
            {
             newCompositeNode(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubred=ruleSubred();

            state._fsp--;

             current =iv_ruleSubred; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalMyDsl.g:1888:1: ruleSubred returns [EObject current=null] : (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleSubred() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        AntlrDatatypeRuleToken lv_CIDR_5_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1894:2: ( (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1895:2: (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1895:2: (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1896:3: otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubredAccess().getSubredKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1904:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1905:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubredAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1909:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1910:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1910:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1911:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1929:3: (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1930:4: otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubredAccess().getCIDRKeyword_3_0());
                    			
                    // InternalMyDsl.g:1934:4: ( (lv_CIDR_5_0= ruleEString ) )
                    // InternalMyDsl.g:1935:5: (lv_CIDR_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1935:5: (lv_CIDR_5_0= ruleEString )
                    // InternalMyDsl.g:1936:6: lv_CIDR_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getCIDREStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_CIDR_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"CIDR",
                    							lv_CIDR_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1954:3: (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1955:4: otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalMyDsl.g:1959:4: ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    // InternalMyDsl.g:1960:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:1960:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    // InternalMyDsl.g:1961:6: lv_zonaDisponibilidad_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_zonaDisponibilidad_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSubredAccess().getVpcKeyword_5());
            		
            // InternalMyDsl.g:1983:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1984:4: ( ruleEString )
            {
            // InternalMyDsl.g:1984:4: ( ruleEString )
            // InternalMyDsl.g:1985:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubredAccess().getVpcVPCCrossReference_6_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleGrupoSeguridad"
    // InternalMyDsl.g:2007:1: entryRuleGrupoSeguridad returns [EObject current=null] : iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF ;
    public final EObject entryRuleGrupoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrupoSeguridad = null;


        try {
            // InternalMyDsl.g:2007:55: (iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF )
            // InternalMyDsl.g:2008:2: iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF
            {
             newCompositeNode(grammarAccess.getGrupoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrupoSeguridad=ruleGrupoSeguridad();

            state._fsp--;

             current =iv_ruleGrupoSeguridad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrupoSeguridad"


    // $ANTLR start "ruleGrupoSeguridad"
    // InternalMyDsl.g:2014:1: ruleGrupoSeguridad returns [EObject current=null] : (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleGrupoSeguridad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        AntlrDatatypeRuleToken lv_descripcion_5_0 = null;

        EObject lv_reglasEntrada_10_0 = null;

        EObject lv_reglasEntrada_12_0 = null;

        EObject lv_reglasSalida_16_0 = null;

        EObject lv_reglasSalida_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2020:2: ( (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalMyDsl.g:2021:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalMyDsl.g:2021:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalMyDsl.g:2022:3: otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2030:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==21) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2031:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:2035:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:2036:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:2036:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:2037:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2055:3: (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2056:4: otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_3_0());
                    			
                    // InternalMyDsl.g:2060:4: ( (lv_descripcion_5_0= ruleEString ) )
                    // InternalMyDsl.g:2061:5: (lv_descripcion_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:2061:5: (lv_descripcion_5_0= ruleEString )
                    // InternalMyDsl.g:2062:6: lv_descripcion_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_descripcion_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"descripcion",
                    							lv_descripcion_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_4());
            		
            // InternalMyDsl.g:2084:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2085:4: ( ruleEString )
            {
            // InternalMyDsl.g:2085:4: ( ruleEString )
            // InternalMyDsl.g:2086:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_5_0());
            				
            pushFollow(FOLLOW_57);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2100:3: (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2101:4: otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:2109:4: ( (lv_reglasEntrada_10_0= ruleRegla ) )
                    // InternalMyDsl.g:2110:5: (lv_reglasEntrada_10_0= ruleRegla )
                    {
                    // InternalMyDsl.g:2110:5: (lv_reglasEntrada_10_0= ruleRegla )
                    // InternalMyDsl.g:2111:6: lv_reglasEntrada_10_0= ruleRegla
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_reglasEntrada_10_0=ruleRegla();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						add(
                    							current,
                    							"reglasEntrada",
                    							lv_reglasEntrada_10_0,
                    							"org.xtext.example.mydsl.MyDsl.Regla");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2128:4: (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==19) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMyDsl.g:2129:5: otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_58); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:2133:5: ( (lv_reglasEntrada_12_0= ruleRegla ) )
                    	    // InternalMyDsl.g:2134:6: (lv_reglasEntrada_12_0= ruleRegla )
                    	    {
                    	    // InternalMyDsl.g:2134:6: (lv_reglasEntrada_12_0= ruleRegla )
                    	    // InternalMyDsl.g:2135:7: lv_reglasEntrada_12_0= ruleRegla
                    	    {

                    	    							newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_reglasEntrada_12_0=ruleRegla();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"reglasEntrada",
                    	    								lv_reglasEntrada_12_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Regla");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_59); 

                    				newLeafNode(otherlv_13, grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2158:3: (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2159:4: otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_58); 

                    				newLeafNode(otherlv_15, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:2167:4: ( (lv_reglasSalida_16_0= ruleRegla ) )
                    // InternalMyDsl.g:2168:5: (lv_reglasSalida_16_0= ruleRegla )
                    {
                    // InternalMyDsl.g:2168:5: (lv_reglasSalida_16_0= ruleRegla )
                    // InternalMyDsl.g:2169:6: lv_reglasSalida_16_0= ruleRegla
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_reglasSalida_16_0=ruleRegla();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						add(
                    							current,
                    							"reglasSalida",
                    							lv_reglasSalida_16_0,
                    							"org.xtext.example.mydsl.MyDsl.Regla");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2186:4: (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==19) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalMyDsl.g:2187:5: otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) )
                    	    {
                    	    otherlv_17=(Token)match(input,19,FOLLOW_58); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:2191:5: ( (lv_reglasSalida_18_0= ruleRegla ) )
                    	    // InternalMyDsl.g:2192:6: (lv_reglasSalida_18_0= ruleRegla )
                    	    {
                    	    // InternalMyDsl.g:2192:6: (lv_reglasSalida_18_0= ruleRegla )
                    	    // InternalMyDsl.g:2193:7: lv_reglasSalida_18_0= ruleRegla
                    	    {

                    	    							newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_reglasSalida_18_0=ruleRegla();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"reglasSalida",
                    	    								lv_reglasSalida_18_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Regla");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrupoSeguridad"


    // $ANTLR start "entryRuleRegla"
    // InternalMyDsl.g:2224:1: entryRuleRegla returns [EObject current=null] : iv_ruleRegla= ruleRegla EOF ;
    public final EObject entryRuleRegla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegla = null;


        try {
            // InternalMyDsl.g:2224:46: (iv_ruleRegla= ruleRegla EOF )
            // InternalMyDsl.g:2225:2: iv_ruleRegla= ruleRegla EOF
            {
             newCompositeNode(grammarAccess.getReglaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegla=ruleRegla();

            state._fsp--;

             current =iv_ruleRegla; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegla"


    // $ANTLR start "ruleRegla"
    // InternalMyDsl.g:2231:1: ruleRegla returns [EObject current=null] : ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleRegla() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_tipo_4_0 = null;

        Enumerator lv_protocolo_6_0 = null;

        AntlrDatatypeRuleToken lv_puerto_8_0 = null;

        AntlrDatatypeRuleToken lv_origen_10_0 = null;

        AntlrDatatypeRuleToken lv_descripcion_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2237:2: ( ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalMyDsl.g:2238:2: ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalMyDsl.g:2238:2: ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // InternalMyDsl.g:2239:3: () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalMyDsl.g:2239:3: ()
            // InternalMyDsl.g:2240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReglaAccess().getReglaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReglaAccess().getReglaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getReglaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2254:3: (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2255:4: otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getReglaAccess().getTipoKeyword_3_0());
                    			
                    // InternalMyDsl.g:2259:4: ( (lv_tipo_4_0= ruleEString ) )
                    // InternalMyDsl.g:2260:5: (lv_tipo_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:2260:5: (lv_tipo_4_0= ruleEString )
                    // InternalMyDsl.g:2261:6: lv_tipo_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getTipoEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_tipo_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReglaRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2279:3: (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2280:4: otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_62); 

                    				newLeafNode(otherlv_5, grammarAccess.getReglaAccess().getProtocoloKeyword_4_0());
                    			
                    // InternalMyDsl.g:2284:4: ( (lv_protocolo_6_0= ruleProtocolo ) )
                    // InternalMyDsl.g:2285:5: (lv_protocolo_6_0= ruleProtocolo )
                    {
                    // InternalMyDsl.g:2285:5: (lv_protocolo_6_0= ruleProtocolo )
                    // InternalMyDsl.g:2286:6: lv_protocolo_6_0= ruleProtocolo
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getProtocoloProtocoloEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_protocolo_6_0=ruleProtocolo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReglaRule());
                    						}
                    						set(
                    							current,
                    							"protocolo",
                    							lv_protocolo_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Protocolo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2304:3: (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2305:4: otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getReglaAccess().getPuertoKeyword_5_0());
                    			
                    // InternalMyDsl.g:2309:4: ( (lv_puerto_8_0= ruleEInt ) )
                    // InternalMyDsl.g:2310:5: (lv_puerto_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2310:5: (lv_puerto_8_0= ruleEInt )
                    // InternalMyDsl.g:2311:6: lv_puerto_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getPuertoEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_puerto_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReglaRule());
                    						}
                    						set(
                    							current,
                    							"puerto",
                    							lv_puerto_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2329:3: (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==57) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2330:4: otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReglaAccess().getOrigenKeyword_6_0());
                    			
                    // InternalMyDsl.g:2334:4: ( (lv_origen_10_0= ruleEString ) )
                    // InternalMyDsl.g:2335:5: (lv_origen_10_0= ruleEString )
                    {
                    // InternalMyDsl.g:2335:5: (lv_origen_10_0= ruleEString )
                    // InternalMyDsl.g:2336:6: lv_origen_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getOrigenEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_origen_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReglaRule());
                    						}
                    						set(
                    							current,
                    							"origen",
                    							lv_origen_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2354:3: (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==51) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2355:4: otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getReglaAccess().getDescripcionKeyword_7_0());
                    			
                    // InternalMyDsl.g:2359:4: ( (lv_descripcion_12_0= ruleEString ) )
                    // InternalMyDsl.g:2360:5: (lv_descripcion_12_0= ruleEString )
                    {
                    // InternalMyDsl.g:2360:5: (lv_descripcion_12_0= ruleEString )
                    // InternalMyDsl.g:2361:6: lv_descripcion_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getDescripcionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_descripcion_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReglaRule());
                    						}
                    						set(
                    							current,
                    							"descripcion",
                    							lv_descripcion_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getReglaAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegla"


    // $ANTLR start "ruleNombreAmbiente"
    // InternalMyDsl.g:2387:1: ruleNombreAmbiente returns [Enumerator current=null] : ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) ) ;
    public final Enumerator ruleNombreAmbiente() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2393:2: ( ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) ) )
            // InternalMyDsl.g:2394:2: ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) )
            {
            // InternalMyDsl.g:2394:2: ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt57=1;
                }
                break;
            case 59:
                {
                alt57=2;
                }
                break;
            case 60:
                {
                alt57=3;
                }
                break;
            case 61:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2395:3: (enumLiteral_0= 'DESARROLLO' )
                    {
                    // InternalMyDsl.g:2395:3: (enumLiteral_0= 'DESARROLLO' )
                    // InternalMyDsl.g:2396:4: enumLiteral_0= 'DESARROLLO'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2403:3: (enumLiteral_1= 'PRUEBAS' )
                    {
                    // InternalMyDsl.g:2403:3: (enumLiteral_1= 'PRUEBAS' )
                    // InternalMyDsl.g:2404:4: enumLiteral_1= 'PRUEBAS'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2411:3: (enumLiteral_2= 'QA' )
                    {
                    // InternalMyDsl.g:2411:3: (enumLiteral_2= 'QA' )
                    // InternalMyDsl.g:2412:4: enumLiteral_2= 'QA'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2419:3: (enumLiteral_3= 'PRODUCCION' )
                    {
                    // InternalMyDsl.g:2419:3: (enumLiteral_3= 'PRODUCCION' )
                    // InternalMyDsl.g:2420:4: enumLiteral_3= 'PRODUCCION'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNombreAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNombreAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombreAmbiente"


    // $ANTLR start "ruleTamanioServidor"
    // InternalMyDsl.g:2430:1: ruleTamanioServidor returns [Enumerator current=null] : ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) ) ;
    public final Enumerator ruleTamanioServidor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2436:2: ( ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) ) )
            // InternalMyDsl.g:2437:2: ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) )
            {
            // InternalMyDsl.g:2437:2: ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt58=1;
                }
                break;
            case 63:
                {
                alt58=2;
                }
                break;
            case 64:
                {
                alt58=3;
                }
                break;
            case 65:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2438:3: (enumLiteral_0= 'MICRO' )
                    {
                    // InternalMyDsl.g:2438:3: (enumLiteral_0= 'MICRO' )
                    // InternalMyDsl.g:2439:4: enumLiteral_0= 'MICRO'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2446:3: (enumLiteral_1= 'SMALL' )
                    {
                    // InternalMyDsl.g:2446:3: (enumLiteral_1= 'SMALL' )
                    // InternalMyDsl.g:2447:4: enumLiteral_1= 'SMALL'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2454:3: (enumLiteral_2= 'MEDIUM' )
                    {
                    // InternalMyDsl.g:2454:3: (enumLiteral_2= 'MEDIUM' )
                    // InternalMyDsl.g:2455:4: enumLiteral_2= 'MEDIUM'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2462:3: (enumLiteral_3= 'LARGE' )
                    {
                    // InternalMyDsl.g:2462:3: (enumLiteral_3= 'LARGE' )
                    // InternalMyDsl.g:2463:4: enumLiteral_3= 'LARGE'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTamanioServidorAccess().getLARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTamanioServidorAccess().getLARGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanioServidor"


    // $ANTLR start "ruleSistemaOperativo"
    // InternalMyDsl.g:2473:1: ruleSistemaOperativo returns [Enumerator current=null] : ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) ) ;
    public final Enumerator ruleSistemaOperativo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2479:2: ( ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) ) )
            // InternalMyDsl.g:2480:2: ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) )
            {
            // InternalMyDsl.g:2480:2: ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==66) ) {
                alt59=1;
            }
            else if ( (LA59_0==67) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2481:3: (enumLiteral_0= 'Windows' )
                    {
                    // InternalMyDsl.g:2481:3: (enumLiteral_0= 'Windows' )
                    // InternalMyDsl.g:2482:4: enumLiteral_0= 'Windows'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2489:3: (enumLiteral_1= 'Ubuntu1804' )
                    {
                    // InternalMyDsl.g:2489:3: (enumLiteral_1= 'Ubuntu1804' )
                    // InternalMyDsl.g:2490:4: enumLiteral_1= 'Ubuntu1804'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getSistemaOperativoAccess().getUbuntu1804EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSistemaOperativoAccess().getUbuntu1804EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSistemaOperativo"


    // $ANTLR start "ruleManejadorSQL"
    // InternalMyDsl.g:2500:1: ruleManejadorSQL returns [Enumerator current=null] : ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) ) ;
    public final Enumerator ruleManejadorSQL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2506:2: ( ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) ) )
            // InternalMyDsl.g:2507:2: ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) )
            {
            // InternalMyDsl.g:2507:2: ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt60=1;
                }
                break;
            case 69:
                {
                alt60=2;
                }
                break;
            case 70:
                {
                alt60=3;
                }
                break;
            case 71:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2508:3: (enumLiteral_0= 'POSTGRESQL' )
                    {
                    // InternalMyDsl.g:2508:3: (enumLiteral_0= 'POSTGRESQL' )
                    // InternalMyDsl.g:2509:4: enumLiteral_0= 'POSTGRESQL'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2516:3: (enumLiteral_1= 'MYSQL' )
                    {
                    // InternalMyDsl.g:2516:3: (enumLiteral_1= 'MYSQL' )
                    // InternalMyDsl.g:2517:4: enumLiteral_1= 'MYSQL'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2524:3: (enumLiteral_2= 'ORACLE' )
                    {
                    // InternalMyDsl.g:2524:3: (enumLiteral_2= 'ORACLE' )
                    // InternalMyDsl.g:2525:4: enumLiteral_2= 'ORACLE'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2532:3: (enumLiteral_3= 'SQLSERVER' )
                    {
                    // InternalMyDsl.g:2532:3: (enumLiteral_3= 'SQLSERVER' )
                    // InternalMyDsl.g:2533:4: enumLiteral_3= 'SQLSERVER'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getManejadorSQLAccess().getSQLSERVEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getManejadorSQLAccess().getSQLSERVEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManejadorSQL"


    // $ANTLR start "ruleManejadorNoSQL"
    // InternalMyDsl.g:2543:1: ruleManejadorNoSQL returns [Enumerator current=null] : ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) ) ;
    public final Enumerator ruleManejadorNoSQL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2549:2: ( ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) ) )
            // InternalMyDsl.g:2550:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) )
            {
            // InternalMyDsl.g:2550:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==72) ) {
                alt61=1;
            }
            else if ( (LA61_0==73) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:2551:3: (enumLiteral_0= 'MONGODB' )
                    {
                    // InternalMyDsl.g:2551:3: (enumLiteral_0= 'MONGODB' )
                    // InternalMyDsl.g:2552:4: enumLiteral_0= 'MONGODB'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2559:3: (enumLiteral_1= 'CASSANDRA' )
                    {
                    // InternalMyDsl.g:2559:3: (enumLiteral_1= 'CASSANDRA' )
                    // InternalMyDsl.g:2560:4: enumLiteral_1= 'CASSANDRA'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getManejadorNoSQLAccess().getCASSANDRAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getManejadorNoSQLAccess().getCASSANDRAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManejadorNoSQL"


    // $ANTLR start "ruleProtocolo"
    // InternalMyDsl.g:2570:1: ruleProtocolo returns [Enumerator current=null] : ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) ;
    public final Enumerator ruleProtocolo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2576:2: ( ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) )
            // InternalMyDsl.g:2577:2: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            {
            // InternalMyDsl.g:2577:2: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==74) ) {
                alt62=1;
            }
            else if ( (LA62_0==75) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:2578:3: (enumLiteral_0= 'TCP' )
                    {
                    // InternalMyDsl.g:2578:3: (enumLiteral_0= 'TCP' )
                    // InternalMyDsl.g:2579:4: enumLiteral_0= 'TCP'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2586:3: (enumLiteral_1= 'UDP' )
                    {
                    // InternalMyDsl.g:2586:3: (enumLiteral_1= 'UDP' )
                    // InternalMyDsl.g:2587:4: enumLiteral_1= 'UDP'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getProtocoloAccess().getUDPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocoloAccess().getUDPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocolo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003D00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000152000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003900000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004C00000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C002A00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000C002800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008002800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000024002A00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000024002800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020002800000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000084002A00000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000084002800000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080002800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0003000002200000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000002200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0030000000002000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0388000400002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0388000000002000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0308000000002000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0208000000002000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0008000000002000L});

}