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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Infraestructura'", "'{'", "'}'", "'Tipo'", "'='", "';'", "'Ambientes'", "'['", "','", "']'", "'nombre'", "'vpcs'", "'recursos'", "'user'", "'password'", "'secret'", "'tipo'", "'VPC'", "'id'", "'ServidorAplicaciones'", "'tamanio'", "'sistemaOperativo'", "'conexiones'", "'('", "')'", "'vpc'", "'ServidorAlmacenamiento'", "'tamanioInicial'", "'BaseDatosSQL'", "'manejador'", "'BaseDatosNoSQL'", "'-'", "'InternetGateway'", "'Subred'", "'CIDR'", "'zonaDisponibilidad'", "'GrupoSeguridad'", "'descripcion'", "'reglasEntrada'", "'reglasSalida'", "'Regla'", "'protocolo'", "'puerto'", "'origen'", "'DESARROLLO'", "'PRUEBAS'", "'QA'", "'PRODUCCION'", "'MICRO'", "'SMALL'", "'MEDIUM'", "'LARGE'", "'Windows'", "'Ubuntu1804'", "'POSTGRESQL'", "'MYSQL'", "'ORACLE'", "'SQLSERVER'", "'MONGODB'", "'CASSANDRA'", "'TCP'", "'UDP'"
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

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
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
            case 30:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
            case 41:
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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:224:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:224:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:225:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:231:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:237:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:238:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:238:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMyDsl.g:239:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:247:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:258:1: entryRuleProveedor returns [EObject current=null] : iv_ruleProveedor= ruleProveedor EOF ;
    public final EObject entryRuleProveedor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProveedor = null;


        try {
            // InternalMyDsl.g:258:50: (iv_ruleProveedor= ruleProveedor EOF )
            // InternalMyDsl.g:259:2: iv_ruleProveedor= ruleProveedor EOF
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
    // InternalMyDsl.g:265:1: ruleProveedor returns [EObject current=null] : (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= ';' ( (lv_parametroConexion_4_0= ruleParametroConexion ) ) otherlv_5= 'Ambientes' otherlv_6= '=' otherlv_7= '[' ( (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue ) ) (otherlv_9= ',' ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) ) )* otherlv_11= ']' ) ;
    public final EObject ruleProveedor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        EObject lv_parametroConexion_4_0 = null;

        EObject lv_ambientesDespliegue_8_0 = null;

        EObject lv_ambientesDespliegue_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:271:2: ( (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= ';' ( (lv_parametroConexion_4_0= ruleParametroConexion ) ) otherlv_5= 'Ambientes' otherlv_6= '=' otherlv_7= '[' ( (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue ) ) (otherlv_9= ',' ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) ) )* otherlv_11= ']' ) )
            // InternalMyDsl.g:272:2: (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= ';' ( (lv_parametroConexion_4_0= ruleParametroConexion ) ) otherlv_5= 'Ambientes' otherlv_6= '=' otherlv_7= '[' ( (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue ) ) (otherlv_9= ',' ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) ) )* otherlv_11= ']' )
            {
            // InternalMyDsl.g:272:2: (otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= ';' ( (lv_parametroConexion_4_0= ruleParametroConexion ) ) otherlv_5= 'Ambientes' otherlv_6= '=' otherlv_7= '[' ( (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue ) ) (otherlv_9= ',' ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) ) )* otherlv_11= ']' )
            // InternalMyDsl.g:273:3: otherlv_0= 'Tipo' otherlv_1= '=' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= ';' ( (lv_parametroConexion_4_0= ruleParametroConexion ) ) otherlv_5= 'Ambientes' otherlv_6= '=' otherlv_7= '[' ( (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue ) ) (otherlv_9= ',' ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) ) )* otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProveedorAccess().getTipoKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProveedorAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:281:3: ( (lv_nombre_2_0= ruleEString ) )
            // InternalMyDsl.g:282:4: (lv_nombre_2_0= ruleEString )
            {
            // InternalMyDsl.g:282:4: (lv_nombre_2_0= ruleEString )
            // InternalMyDsl.g:283:5: lv_nombre_2_0= ruleEString
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

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getProveedorAccess().getSemicolonKeyword_3());
            		
            // InternalMyDsl.g:304:3: ( (lv_parametroConexion_4_0= ruleParametroConexion ) )
            // InternalMyDsl.g:305:4: (lv_parametroConexion_4_0= ruleParametroConexion )
            {
            // InternalMyDsl.g:305:4: (lv_parametroConexion_4_0= ruleParametroConexion )
            // InternalMyDsl.g:306:5: lv_parametroConexion_4_0= ruleParametroConexion
            {

            					newCompositeNode(grammarAccess.getProveedorAccess().getParametroConexionParametroConexionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_parametroConexion_4_0=ruleParametroConexion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProveedorRule());
            					}
            					set(
            						current,
            						"parametroConexion",
            						lv_parametroConexion_4_0,
            						"org.xtext.example.mydsl.MyDsl.ParametroConexion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getProveedorAccess().getAmbientesKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getProveedorAccess().getEqualsSignKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getProveedorAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalMyDsl.g:335:3: ( (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue ) )
            // InternalMyDsl.g:336:4: (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue )
            {
            // InternalMyDsl.g:336:4: (lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue )
            // InternalMyDsl.g:337:5: lv_ambientesDespliegue_8_0= ruleAmbienteDespliegue
            {

            					newCompositeNode(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_ambientesDespliegue_8_0=ruleAmbienteDespliegue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProveedorRule());
            					}
            					add(
            						current,
            						"ambientesDespliegue",
            						lv_ambientesDespliegue_8_0,
            						"org.xtext.example.mydsl.MyDsl.AmbienteDespliegue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:354:3: (otherlv_9= ',' ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:355:4: otherlv_9= ',' ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getProveedorAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:359:4: ( (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue ) )
            	    // InternalMyDsl.g:360:5: (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue )
            	    {
            	    // InternalMyDsl.g:360:5: (lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue )
            	    // InternalMyDsl.g:361:6: lv_ambientesDespliegue_10_0= ruleAmbienteDespliegue
            	    {

            	    						newCompositeNode(grammarAccess.getProveedorAccess().getAmbientesDespliegueAmbienteDespliegueParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_ambientesDespliegue_10_0=ruleAmbienteDespliegue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProveedorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ambientesDespliegue",
            	    							lv_ambientesDespliegue_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.AmbienteDespliegue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getProveedorAccess().getRightSquareBracketKeyword_10());
            		

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
    // InternalMyDsl.g:387:1: entryRuleAmbienteDespliegue returns [EObject current=null] : iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF ;
    public final EObject entryRuleAmbienteDespliegue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbienteDespliegue = null;


        try {
            // InternalMyDsl.g:387:59: (iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF )
            // InternalMyDsl.g:388:2: iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF
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
    // InternalMyDsl.g:394:1: ruleAmbienteDespliegue returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'nombre' otherlv_2= '=' ( (lv_nombre_3_0= ruleNombreAmbiente ) ) otherlv_4= ';' otherlv_5= 'vpcs' otherlv_6= '=' otherlv_7= '[' ( (lv_vpc_8_0= ruleVPC ) ) (otherlv_9= ',' ( (lv_vpc_10_0= ruleVPC ) ) )* otherlv_11= ']' otherlv_12= 'recursos' otherlv_13= '=' otherlv_14= '[' ( (lv_recursos_15_0= ruleRecurso ) ) (otherlv_16= ',' ( (lv_recursos_17_0= ruleRecurso ) ) )* otherlv_18= ']' otherlv_19= '}' ) ;
    public final EObject ruleAmbienteDespliegue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_nombre_3_0 = null;

        EObject lv_vpc_8_0 = null;

        EObject lv_vpc_10_0 = null;

        EObject lv_recursos_15_0 = null;

        EObject lv_recursos_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:400:2: ( (otherlv_0= '{' otherlv_1= 'nombre' otherlv_2= '=' ( (lv_nombre_3_0= ruleNombreAmbiente ) ) otherlv_4= ';' otherlv_5= 'vpcs' otherlv_6= '=' otherlv_7= '[' ( (lv_vpc_8_0= ruleVPC ) ) (otherlv_9= ',' ( (lv_vpc_10_0= ruleVPC ) ) )* otherlv_11= ']' otherlv_12= 'recursos' otherlv_13= '=' otherlv_14= '[' ( (lv_recursos_15_0= ruleRecurso ) ) (otherlv_16= ',' ( (lv_recursos_17_0= ruleRecurso ) ) )* otherlv_18= ']' otherlv_19= '}' ) )
            // InternalMyDsl.g:401:2: (otherlv_0= '{' otherlv_1= 'nombre' otherlv_2= '=' ( (lv_nombre_3_0= ruleNombreAmbiente ) ) otherlv_4= ';' otherlv_5= 'vpcs' otherlv_6= '=' otherlv_7= '[' ( (lv_vpc_8_0= ruleVPC ) ) (otherlv_9= ',' ( (lv_vpc_10_0= ruleVPC ) ) )* otherlv_11= ']' otherlv_12= 'recursos' otherlv_13= '=' otherlv_14= '[' ( (lv_recursos_15_0= ruleRecurso ) ) (otherlv_16= ',' ( (lv_recursos_17_0= ruleRecurso ) ) )* otherlv_18= ']' otherlv_19= '}' )
            {
            // InternalMyDsl.g:401:2: (otherlv_0= '{' otherlv_1= 'nombre' otherlv_2= '=' ( (lv_nombre_3_0= ruleNombreAmbiente ) ) otherlv_4= ';' otherlv_5= 'vpcs' otherlv_6= '=' otherlv_7= '[' ( (lv_vpc_8_0= ruleVPC ) ) (otherlv_9= ',' ( (lv_vpc_10_0= ruleVPC ) ) )* otherlv_11= ']' otherlv_12= 'recursos' otherlv_13= '=' otherlv_14= '[' ( (lv_recursos_15_0= ruleRecurso ) ) (otherlv_16= ',' ( (lv_recursos_17_0= ruleRecurso ) ) )* otherlv_18= ']' otherlv_19= '}' )
            // InternalMyDsl.g:402:3: otherlv_0= '{' otherlv_1= 'nombre' otherlv_2= '=' ( (lv_nombre_3_0= ruleNombreAmbiente ) ) otherlv_4= ';' otherlv_5= 'vpcs' otherlv_6= '=' otherlv_7= '[' ( (lv_vpc_8_0= ruleVPC ) ) (otherlv_9= ',' ( (lv_vpc_10_0= ruleVPC ) ) )* otherlv_11= ']' otherlv_12= 'recursos' otherlv_13= '=' otherlv_14= '[' ( (lv_recursos_15_0= ruleRecurso ) ) (otherlv_16= ',' ( (lv_recursos_17_0= ruleRecurso ) ) )* otherlv_18= ']' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAmbienteDespliegueAccess().getNombreKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:414:3: ( (lv_nombre_3_0= ruleNombreAmbiente ) )
            // InternalMyDsl.g:415:4: (lv_nombre_3_0= ruleNombreAmbiente )
            {
            // InternalMyDsl.g:415:4: (lv_nombre_3_0= ruleNombreAmbiente )
            // InternalMyDsl.g:416:5: lv_nombre_3_0= ruleNombreAmbiente
            {

            					newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getNombreNombreAmbienteEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_nombre_3_0=ruleNombreAmbiente();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_3_0,
            						"org.xtext.example.mydsl.MyDsl.NombreAmbiente");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getAmbienteDespliegueAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAmbienteDespliegueAccess().getVpcsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalMyDsl.g:449:3: ( (lv_vpc_8_0= ruleVPC ) )
            // InternalMyDsl.g:450:4: (lv_vpc_8_0= ruleVPC )
            {
            // InternalMyDsl.g:450:4: (lv_vpc_8_0= ruleVPC )
            // InternalMyDsl.g:451:5: lv_vpc_8_0= ruleVPC
            {

            					newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_vpc_8_0=ruleVPC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
            					}
            					add(
            						current,
            						"vpc",
            						lv_vpc_8_0,
            						"org.xtext.example.mydsl.MyDsl.VPC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:468:3: (otherlv_9= ',' ( (lv_vpc_10_0= ruleVPC ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:469:4: otherlv_9= ',' ( (lv_vpc_10_0= ruleVPC ) )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:473:4: ( (lv_vpc_10_0= ruleVPC ) )
            	    // InternalMyDsl.g:474:5: (lv_vpc_10_0= ruleVPC )
            	    {
            	    // InternalMyDsl.g:474:5: (lv_vpc_10_0= ruleVPC )
            	    // InternalMyDsl.g:475:6: lv_vpc_10_0= ruleVPC
            	    {

            	    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getVpcVPCParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vpc_10_0=ruleVPC();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vpc",
            	    							lv_vpc_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.VPC");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_11());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getAmbienteDespliegueAccess().getEqualsSignKeyword_12());
            		
            otherlv_14=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getAmbienteDespliegueAccess().getLeftSquareBracketKeyword_13());
            		
            // InternalMyDsl.g:509:3: ( (lv_recursos_15_0= ruleRecurso ) )
            // InternalMyDsl.g:510:4: (lv_recursos_15_0= ruleRecurso )
            {
            // InternalMyDsl.g:510:4: (lv_recursos_15_0= ruleRecurso )
            // InternalMyDsl.g:511:5: lv_recursos_15_0= ruleRecurso
            {

            					newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_12);
            lv_recursos_15_0=ruleRecurso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
            					}
            					add(
            						current,
            						"recursos",
            						lv_recursos_15_0,
            						"org.xtext.example.mydsl.MyDsl.Recurso");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:528:3: (otherlv_16= ',' ( (lv_recursos_17_0= ruleRecurso ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:529:4: otherlv_16= ',' ( (lv_recursos_17_0= ruleRecurso ) )
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_17); 

            	    				newLeafNode(otherlv_16, grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalMyDsl.g:533:4: ( (lv_recursos_17_0= ruleRecurso ) )
            	    // InternalMyDsl.g:534:5: (lv_recursos_17_0= ruleRecurso )
            	    {
            	    // InternalMyDsl.g:534:5: (lv_recursos_17_0= ruleRecurso )
            	    // InternalMyDsl.g:535:6: lv_recursos_17_0= ruleRecurso
            	    {

            	    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_recursos_17_0=ruleRecurso();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recursos",
            	    							lv_recursos_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.Recurso");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_18=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getAmbienteDespliegueAccess().getRightSquareBracketKeyword_16());
            		
            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalMyDsl.g:565:1: entryRuleUsuarioPassword returns [EObject current=null] : iv_ruleUsuarioPassword= ruleUsuarioPassword EOF ;
    public final EObject entryRuleUsuarioPassword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsuarioPassword = null;


        try {
            // InternalMyDsl.g:565:56: (iv_ruleUsuarioPassword= ruleUsuarioPassword EOF )
            // InternalMyDsl.g:566:2: iv_ruleUsuarioPassword= ruleUsuarioPassword EOF
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
    // InternalMyDsl.g:572:1: ruleUsuarioPassword returns [EObject current=null] : ( () otherlv_1= 'user' ( (lv_usuario_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'password' ( (lv_password_5_0= ruleEString ) ) otherlv_6= ';' ) ;
    public final EObject ruleUsuarioPassword() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_usuario_2_0 = null;

        AntlrDatatypeRuleToken lv_password_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:578:2: ( ( () otherlv_1= 'user' ( (lv_usuario_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'password' ( (lv_password_5_0= ruleEString ) ) otherlv_6= ';' ) )
            // InternalMyDsl.g:579:2: ( () otherlv_1= 'user' ( (lv_usuario_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'password' ( (lv_password_5_0= ruleEString ) ) otherlv_6= ';' )
            {
            // InternalMyDsl.g:579:2: ( () otherlv_1= 'user' ( (lv_usuario_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'password' ( (lv_password_5_0= ruleEString ) ) otherlv_6= ';' )
            // InternalMyDsl.g:580:3: () otherlv_1= 'user' ( (lv_usuario_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'password' ( (lv_password_5_0= ruleEString ) ) otherlv_6= ';'
            {
            // InternalMyDsl.g:580:3: ()
            // InternalMyDsl.g:581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUsuarioPasswordAccess().getUsuarioPasswordAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUsuarioPasswordAccess().getUserKeyword_1());
            		
            // InternalMyDsl.g:591:3: ( (lv_usuario_2_0= ruleEString ) )
            // InternalMyDsl.g:592:4: (lv_usuario_2_0= ruleEString )
            {
            // InternalMyDsl.g:592:4: (lv_usuario_2_0= ruleEString )
            // InternalMyDsl.g:593:5: lv_usuario_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUsuarioPasswordAccess().getUsuarioEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_usuario_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsuarioPasswordRule());
            					}
            					set(
            						current,
            						"usuario",
            						lv_usuario_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getUsuarioPasswordAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getUsuarioPasswordAccess().getPasswordKeyword_4());
            		
            // InternalMyDsl.g:618:3: ( (lv_password_5_0= ruleEString ) )
            // InternalMyDsl.g:619:4: (lv_password_5_0= ruleEString )
            {
            // InternalMyDsl.g:619:4: (lv_password_5_0= ruleEString )
            // InternalMyDsl.g:620:5: lv_password_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUsuarioPasswordAccess().getPasswordEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_password_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsuarioPasswordRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_5_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUsuarioPasswordAccess().getSemicolonKeyword_6());
            		

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
    // InternalMyDsl.g:645:1: entryRuleLlave returns [EObject current=null] : iv_ruleLlave= ruleLlave EOF ;
    public final EObject entryRuleLlave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlave = null;


        try {
            // InternalMyDsl.g:645:46: (iv_ruleLlave= ruleLlave EOF )
            // InternalMyDsl.g:646:2: iv_ruleLlave= ruleLlave EOF
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
    // InternalMyDsl.g:652:1: ruleLlave returns [EObject current=null] : ( () otherlv_1= 'secret' otherlv_2= '=' ( (lv_secreto_3_0= ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject ruleLlave() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_secreto_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:658:2: ( ( () otherlv_1= 'secret' otherlv_2= '=' ( (lv_secreto_3_0= ruleEString ) ) otherlv_4= ';' ) )
            // InternalMyDsl.g:659:2: ( () otherlv_1= 'secret' otherlv_2= '=' ( (lv_secreto_3_0= ruleEString ) ) otherlv_4= ';' )
            {
            // InternalMyDsl.g:659:2: ( () otherlv_1= 'secret' otherlv_2= '=' ( (lv_secreto_3_0= ruleEString ) ) otherlv_4= ';' )
            // InternalMyDsl.g:660:3: () otherlv_1= 'secret' otherlv_2= '=' ( (lv_secreto_3_0= ruleEString ) ) otherlv_4= ';'
            {
            // InternalMyDsl.g:660:3: ()
            // InternalMyDsl.g:661:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLlaveAccess().getLlaveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLlaveAccess().getSecretKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLlaveAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:675:3: ( (lv_secreto_3_0= ruleEString ) )
            // InternalMyDsl.g:676:4: (lv_secreto_3_0= ruleEString )
            {
            // InternalMyDsl.g:676:4: (lv_secreto_3_0= ruleEString )
            // InternalMyDsl.g:677:5: lv_secreto_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLlaveAccess().getSecretoEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_secreto_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLlaveRule());
            					}
            					set(
            						current,
            						"secreto",
            						lv_secreto_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLlaveAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleVPC"
    // InternalMyDsl.g:702:1: entryRuleVPC returns [EObject current=null] : iv_ruleVPC= ruleVPC EOF ;
    public final EObject entryRuleVPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVPC = null;


        try {
            // InternalMyDsl.g:702:44: (iv_ruleVPC= ruleVPC EOF )
            // InternalMyDsl.g:703:2: iv_ruleVPC= ruleVPC EOF
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
    // InternalMyDsl.g:709:1: ruleVPC returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'tipo' otherlv_2= '=' otherlv_3= 'VPC' otherlv_4= ';' otherlv_5= 'id' otherlv_6= '=' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= ';' otherlv_9= '}' ) ;
    public final EObject ruleVPC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_nombre_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:715:2: ( (otherlv_0= '{' otherlv_1= 'tipo' otherlv_2= '=' otherlv_3= 'VPC' otherlv_4= ';' otherlv_5= 'id' otherlv_6= '=' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= ';' otherlv_9= '}' ) )
            // InternalMyDsl.g:716:2: (otherlv_0= '{' otherlv_1= 'tipo' otherlv_2= '=' otherlv_3= 'VPC' otherlv_4= ';' otherlv_5= 'id' otherlv_6= '=' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= ';' otherlv_9= '}' )
            {
            // InternalMyDsl.g:716:2: (otherlv_0= '{' otherlv_1= 'tipo' otherlv_2= '=' otherlv_3= 'VPC' otherlv_4= ';' otherlv_5= 'id' otherlv_6= '=' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= ';' otherlv_9= '}' )
            // InternalMyDsl.g:717:3: otherlv_0= '{' otherlv_1= 'tipo' otherlv_2= '=' otherlv_3= 'VPC' otherlv_4= ';' otherlv_5= 'id' otherlv_6= '=' ( (lv_nombre_7_0= ruleEString ) ) otherlv_8= ';' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getVPCAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getVPCAccess().getTipoKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getVPCAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getVPCAccess().getVPCKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getVPCAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getVPCAccess().getIdKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getVPCAccess().getEqualsSignKeyword_6());
            		
            // InternalMyDsl.g:745:3: ( (lv_nombre_7_0= ruleEString ) )
            // InternalMyDsl.g:746:4: (lv_nombre_7_0= ruleEString )
            {
            // InternalMyDsl.g:746:4: (lv_nombre_7_0= ruleEString )
            // InternalMyDsl.g:747:5: lv_nombre_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVPCAccess().getNombreEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_nombre_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVPCRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_7_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getVPCAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getVPCAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:776:1: entryRuleServidorAplicaciones returns [EObject current=null] : iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF ;
    public final EObject entryRuleServidorAplicaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAplicaciones = null;


        try {
            // InternalMyDsl.g:776:61: (iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF )
            // InternalMyDsl.g:777:2: iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF
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
    // InternalMyDsl.g:783:1: ruleServidorAplicaciones returns [EObject current=null] : (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        Enumerator lv_tamanio_5_0 = null;

        Enumerator lv_sistemaOperativo_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:789:2: ( (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:790:2: (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:790:2: (otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            // InternalMyDsl.g:791:3: otherlv_0= 'ServidorAplicaciones' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( (otherlv_15= RULE_ID ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:799:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:800:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:804:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:805:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:805:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:806:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:824:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:825:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getServidorAplicacionesAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:829:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:830:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:830:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:831:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalMyDsl.g:849:3: (otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:850:4: otherlv_6= 'sistemaOperativo' ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_4_0());
                    			
                    // InternalMyDsl.g:854:4: ( (lv_sistemaOperativo_7_0= ruleSistemaOperativo ) )
                    // InternalMyDsl.g:855:5: (lv_sistemaOperativo_7_0= ruleSistemaOperativo )
                    {
                    // InternalMyDsl.g:855:5: (lv_sistemaOperativo_7_0= ruleSistemaOperativo )
                    // InternalMyDsl.g:856:6: lv_sistemaOperativo_7_0= ruleSistemaOperativo
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoSistemaOperativoEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalMyDsl.g:874:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:875:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getServidorAplicacionesAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:883:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:884:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:884:5: ( ruleEString )
                    // InternalMyDsl.g:885:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:899:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:900:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:904:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:905:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:905:6: ( ruleEString )
                    	    // InternalMyDsl.g:906:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_14, grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:930:3: ( (otherlv_15= RULE_ID ) )
            // InternalMyDsl.g:931:4: (otherlv_15= RULE_ID )
            {
            // InternalMyDsl.g:931:4: (otherlv_15= RULE_ID )
            // InternalMyDsl.g:932:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAplicacionesRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_15, grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_7_0());
            				

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
    // InternalMyDsl.g:951:1: entryRuleServidorAlmacenamiento returns [EObject current=null] : iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF ;
    public final EObject entryRuleServidorAlmacenamiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAlmacenamiento = null;


        try {
            // InternalMyDsl.g:951:63: (iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF )
            // InternalMyDsl.g:952:2: iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF
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
    // InternalMyDsl.g:958:1: ruleServidorAlmacenamiento returns [EObject current=null] : (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) ;
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
            // InternalMyDsl.g:964:2: ( (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:965:2: (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:965:2: (otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            // InternalMyDsl.g:966:3: otherlv_0= 'ServidorAlmacenamiento' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorAlmacenamientoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:974:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:975:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServidorAlmacenamientoAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:979:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:980:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:980:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:981:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalMyDsl.g:999:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1000:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getServidorAlmacenamientoAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:1004:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:1005:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:1005:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:1006:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

            // InternalMyDsl.g:1024:3: (otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1025:4: otherlv_6= 'tamanioInicial' ( (lv_tamanioInicial_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialKeyword_4_0());
                    			
                    // InternalMyDsl.g:1029:4: ( (lv_tamanioInicial_7_0= ruleEInt ) )
                    // InternalMyDsl.g:1030:5: (lv_tamanioInicial_7_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1030:5: (lv_tamanioInicial_7_0= ruleEInt )
                    // InternalMyDsl.g:1031:6: lv_tamanioInicial_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getTamanioInicialEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalMyDsl.g:1049:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1050:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getServidorAlmacenamientoAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorAlmacenamientoAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1058:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1059:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1059:5: ( ruleEString )
                    // InternalMyDsl.g:1060:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1074:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:1075:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getServidorAlmacenamientoAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1079:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1080:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1080:6: ( ruleEString )
                    	    // InternalMyDsl.g:1081:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorAlmacenamientoAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:1105:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1106:4: ( ruleEString )
            {
            // InternalMyDsl.g:1106:4: ( ruleEString )
            // InternalMyDsl.g:1107:5: ruleEString
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
    // InternalMyDsl.g:1129:1: entryRuleBaseDatosSQL returns [EObject current=null] : iv_ruleBaseDatosSQL= ruleBaseDatosSQL EOF ;
    public final EObject entryRuleBaseDatosSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDatosSQL = null;


        try {
            // InternalMyDsl.g:1129:53: (iv_ruleBaseDatosSQL= ruleBaseDatosSQL EOF )
            // InternalMyDsl.g:1130:2: iv_ruleBaseDatosSQL= ruleBaseDatosSQL EOF
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
    // InternalMyDsl.g:1136:1: ruleBaseDatosSQL returns [EObject current=null] : (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) ;
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
            // InternalMyDsl.g:1142:2: ( (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:1143:2: (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:1143:2: (otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            // InternalMyDsl.g:1144:3: otherlv_0= 'BaseDatosSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseDatosSQLAccess().getBaseDatosSQLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseDatosSQLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1152:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1153:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBaseDatosSQLAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1157:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1158:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1158:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1159:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalMyDsl.g:1177:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1178:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseDatosSQLAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:1182:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:1183:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:1183:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:1184:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalMyDsl.g:1202:3: (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1203:4: otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorSQL ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseDatosSQLAccess().getManejadorKeyword_4_0());
                    			
                    // InternalMyDsl.g:1207:4: ( (lv_manejador_7_0= ruleManejadorSQL ) )
                    // InternalMyDsl.g:1208:5: (lv_manejador_7_0= ruleManejadorSQL )
                    {
                    // InternalMyDsl.g:1208:5: (lv_manejador_7_0= ruleManejadorSQL )
                    // InternalMyDsl.g:1209:6: lv_manejador_7_0= ruleManejadorSQL
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getManejadorManejadorSQLEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalMyDsl.g:1227:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1228:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseDatosSQLAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBaseDatosSQLAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1236:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1237:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1237:5: ( ruleEString )
                    // InternalMyDsl.g:1238:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseDatosSQLRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1252:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==19) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:1253:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBaseDatosSQLAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1257:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1258:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1258:6: ( ruleEString )
                    	    // InternalMyDsl.g:1259:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBaseDatosSQLRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBaseDatosSQLAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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

                    otherlv_13=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getBaseDatosSQLAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getBaseDatosSQLAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:1283:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1284:4: ( ruleEString )
            {
            // InternalMyDsl.g:1284:4: ( ruleEString )
            // InternalMyDsl.g:1285:5: ruleEString
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
    // InternalMyDsl.g:1307:1: entryRuleBaseDatosNoSQL returns [EObject current=null] : iv_ruleBaseDatosNoSQL= ruleBaseDatosNoSQL EOF ;
    public final EObject entryRuleBaseDatosNoSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseDatosNoSQL = null;


        try {
            // InternalMyDsl.g:1307:55: (iv_ruleBaseDatosNoSQL= ruleBaseDatosNoSQL EOF )
            // InternalMyDsl.g:1308:2: iv_ruleBaseDatosNoSQL= ruleBaseDatosNoSQL EOF
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
    // InternalMyDsl.g:1314:1: ruleBaseDatosNoSQL returns [EObject current=null] : (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) ;
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
            // InternalMyDsl.g:1320:2: ( (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // InternalMyDsl.g:1321:2: (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // InternalMyDsl.g:1321:2: (otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}' )
            // InternalMyDsl.g:1322:3: otherlv_0= 'BaseDatosNoSQL' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )? (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )? (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'vpc' ( ( ruleEString ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseDatosNoSQLAccess().getBaseDatosNoSQLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseDatosNoSQLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1330:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1331:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBaseDatosNoSQLAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1335:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1336:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1336:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1337:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalMyDsl.g:1355:3: (otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1356:4: otherlv_4= 'tamanio' ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseDatosNoSQLAccess().getTamanioKeyword_3_0());
                    			
                    // InternalMyDsl.g:1360:4: ( (lv_tamanio_5_0= ruleTamanioServidor ) )
                    // InternalMyDsl.g:1361:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    {
                    // InternalMyDsl.g:1361:5: (lv_tamanio_5_0= ruleTamanioServidor )
                    // InternalMyDsl.g:1362:6: lv_tamanio_5_0= ruleTamanioServidor
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getTamanioTamanioServidorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalMyDsl.g:1380:3: (otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1381:4: otherlv_6= 'manejador' ( (lv_manejador_7_0= ruleManejadorNoSQL ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseDatosNoSQLAccess().getManejadorKeyword_4_0());
                    			
                    // InternalMyDsl.g:1385:4: ( (lv_manejador_7_0= ruleManejadorNoSQL ) )
                    // InternalMyDsl.g:1386:5: (lv_manejador_7_0= ruleManejadorNoSQL )
                    {
                    // InternalMyDsl.g:1386:5: (lv_manejador_7_0= ruleManejadorNoSQL )
                    // InternalMyDsl.g:1387:6: lv_manejador_7_0= ruleManejadorNoSQL
                    {

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getManejadorManejadorNoSQLEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalMyDsl.g:1405:3: (otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1406:4: otherlv_8= 'conexiones' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseDatosNoSQLAccess().getConexionesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBaseDatosNoSQLAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1414:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1415:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1415:5: ( ruleEString )
                    // InternalMyDsl.g:1416:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseDatosNoSQLRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1430:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==19) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDsl.g:1431:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBaseDatosNoSQLAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1435:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1436:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1436:6: ( ruleEString )
                    	    // InternalMyDsl.g:1437:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBaseDatosNoSQLRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBaseDatosNoSQLAccess().getConexionesConexionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getBaseDatosNoSQLAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getBaseDatosNoSQLAccess().getVpcKeyword_6());
            		
            // InternalMyDsl.g:1461:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1462:4: ( ruleEString )
            {
            // InternalMyDsl.g:1462:4: ( ruleEString )
            // InternalMyDsl.g:1463:5: ruleEString
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
    // InternalMyDsl.g:1485:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1485:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1486:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:1492:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1498:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1499:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1499:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1500:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1500:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1501:4: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_41); 

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
    // InternalMyDsl.g:1518:1: entryRuleInternetGateway returns [EObject current=null] : iv_ruleInternetGateway= ruleInternetGateway EOF ;
    public final EObject entryRuleInternetGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternetGateway = null;


        try {
            // InternalMyDsl.g:1518:56: (iv_ruleInternetGateway= ruleInternetGateway EOF )
            // InternalMyDsl.g:1519:2: iv_ruleInternetGateway= ruleInternetGateway EOF
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
    // InternalMyDsl.g:1525:1: ruleInternetGateway returns [EObject current=null] : (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1531:2: ( (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1532:2: (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1532:2: (otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1533:3: otherlv_0= 'InternetGateway' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'vpc' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1541:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1542:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInternetGatewayAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1546:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1547:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1547:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1548:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getInternetGatewayAccess().getVpcKeyword_3());
            		
            // InternalMyDsl.g:1570:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1571:4: ( ruleEString )
            {
            // InternalMyDsl.g:1571:4: ( ruleEString )
            // InternalMyDsl.g:1572:5: ruleEString
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
    // InternalMyDsl.g:1594:1: entryRuleSubred returns [EObject current=null] : iv_ruleSubred= ruleSubred EOF ;
    public final EObject entryRuleSubred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubred = null;


        try {
            // InternalMyDsl.g:1594:47: (iv_ruleSubred= ruleSubred EOF )
            // InternalMyDsl.g:1595:2: iv_ruleSubred= ruleSubred EOF
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
    // InternalMyDsl.g:1601:1: ruleSubred returns [EObject current=null] : (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:1607:2: ( (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1608:2: (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1608:2: (otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1609:3: otherlv_0= 'Subred' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? otherlv_8= 'vpc' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubredAccess().getSubredKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1617:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1618:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubredAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1622:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1623:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1623:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1624:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalMyDsl.g:1642:3: (otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1643:4: otherlv_4= 'CIDR' ( (lv_CIDR_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubredAccess().getCIDRKeyword_3_0());
                    			
                    // InternalMyDsl.g:1647:4: ( (lv_CIDR_5_0= ruleEString ) )
                    // InternalMyDsl.g:1648:5: (lv_CIDR_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1648:5: (lv_CIDR_5_0= ruleEString )
                    // InternalMyDsl.g:1649:6: lv_CIDR_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getCIDREStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalMyDsl.g:1667:3: (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1668:4: otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalMyDsl.g:1672:4: ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    // InternalMyDsl.g:1673:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:1673:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    // InternalMyDsl.g:1674:6: lv_zonaDisponibilidad_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_8=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSubredAccess().getVpcKeyword_5());
            		
            // InternalMyDsl.g:1696:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1697:4: ( ruleEString )
            {
            // InternalMyDsl.g:1697:4: ( ruleEString )
            // InternalMyDsl.g:1698:5: ruleEString
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
    // InternalMyDsl.g:1720:1: entryRuleGrupoSeguridad returns [EObject current=null] : iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF ;
    public final EObject entryRuleGrupoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrupoSeguridad = null;


        try {
            // InternalMyDsl.g:1720:55: (iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF )
            // InternalMyDsl.g:1721:2: iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF
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
    // InternalMyDsl.g:1727:1: ruleGrupoSeguridad returns [EObject current=null] : (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
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
            // InternalMyDsl.g:1733:2: ( (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalMyDsl.g:1734:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalMyDsl.g:1734:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalMyDsl.g:1735:3: otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )? otherlv_6= 'vpc' ( ( ruleEString ) ) (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )? (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1743:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1744:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0());
                    			
                    // InternalMyDsl.g:1748:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalMyDsl.g:1749:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1749:5: (lv_nombre_3_0= ruleEString )
                    // InternalMyDsl.g:1750:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalMyDsl.g:1768:3: (otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1769:4: otherlv_4= 'descripcion' ( (lv_descripcion_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_3_0());
                    			
                    // InternalMyDsl.g:1773:4: ( (lv_descripcion_5_0= ruleEString ) )
                    // InternalMyDsl.g:1774:5: (lv_descripcion_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1774:5: (lv_descripcion_5_0= ruleEString )
                    // InternalMyDsl.g:1775:6: lv_descripcion_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_6=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_4());
            		
            // InternalMyDsl.g:1797:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1798:4: ( ruleEString )
            {
            // InternalMyDsl.g:1798:4: ( ruleEString )
            // InternalMyDsl.g:1799:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_5_0());
            				
            pushFollow(FOLLOW_48);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1813:3: (otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1814:4: otherlv_8= 'reglasEntrada' otherlv_9= '{' ( (lv_reglasEntrada_10_0= ruleRegla ) ) (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_9, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:1822:4: ( (lv_reglasEntrada_10_0= ruleRegla ) )
                    // InternalMyDsl.g:1823:5: (lv_reglasEntrada_10_0= ruleRegla )
                    {
                    // InternalMyDsl.g:1823:5: (lv_reglasEntrada_10_0= ruleRegla )
                    // InternalMyDsl.g:1824:6: lv_reglasEntrada_10_0= ruleRegla
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_50);
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

                    // InternalMyDsl.g:1841:4: (otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==19) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:1842:5: otherlv_11= ',' ( (lv_reglasEntrada_12_0= ruleRegla ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_49); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:1846:5: ( (lv_reglasEntrada_12_0= ruleRegla ) )
                    	    // InternalMyDsl.g:1847:6: (lv_reglasEntrada_12_0= ruleRegla )
                    	    {
                    	    // InternalMyDsl.g:1847:6: (lv_reglasEntrada_12_0= ruleRegla )
                    	    // InternalMyDsl.g:1848:7: lv_reglasEntrada_12_0= ruleRegla
                    	    {

                    	    							newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_51); 

                    				newLeafNode(otherlv_13, grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1871:3: (otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1872:4: otherlv_14= 'reglasSalida' otherlv_15= '{' ( (lv_reglasSalida_16_0= ruleRegla ) ) (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_15, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:1880:4: ( (lv_reglasSalida_16_0= ruleRegla ) )
                    // InternalMyDsl.g:1881:5: (lv_reglasSalida_16_0= ruleRegla )
                    {
                    // InternalMyDsl.g:1881:5: (lv_reglasSalida_16_0= ruleRegla )
                    // InternalMyDsl.g:1882:6: lv_reglasSalida_16_0= ruleRegla
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_50);
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

                    // InternalMyDsl.g:1899:4: (otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==19) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMyDsl.g:1900:5: otherlv_17= ',' ( (lv_reglasSalida_18_0= ruleRegla ) )
                    	    {
                    	    otherlv_17=(Token)match(input,19,FOLLOW_49); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:1904:5: ( (lv_reglasSalida_18_0= ruleRegla ) )
                    	    // InternalMyDsl.g:1905:6: (lv_reglasSalida_18_0= ruleRegla )
                    	    {
                    	    // InternalMyDsl.g:1905:6: (lv_reglasSalida_18_0= ruleRegla )
                    	    // InternalMyDsl.g:1906:7: lv_reglasSalida_18_0= ruleRegla
                    	    {

                    	    							newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    break loop36;
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
    // InternalMyDsl.g:1937:1: entryRuleRegla returns [EObject current=null] : iv_ruleRegla= ruleRegla EOF ;
    public final EObject entryRuleRegla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegla = null;


        try {
            // InternalMyDsl.g:1937:46: (iv_ruleRegla= ruleRegla EOF )
            // InternalMyDsl.g:1938:2: iv_ruleRegla= ruleRegla EOF
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
    // InternalMyDsl.g:1944:1: ruleRegla returns [EObject current=null] : ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
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
            // InternalMyDsl.g:1950:2: ( ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalMyDsl.g:1951:2: ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalMyDsl.g:1951:2: ( () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // InternalMyDsl.g:1952:3: () otherlv_1= 'Regla' otherlv_2= '{' (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )? (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )? (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )? (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )? (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalMyDsl.g:1952:3: ()
            // InternalMyDsl.g:1953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReglaAccess().getReglaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReglaAccess().getReglaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getReglaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1967:3: (otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1968:4: otherlv_3= 'tipo' ( (lv_tipo_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getReglaAccess().getTipoKeyword_3_0());
                    			
                    // InternalMyDsl.g:1972:4: ( (lv_tipo_4_0= ruleEString ) )
                    // InternalMyDsl.g:1973:5: (lv_tipo_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1973:5: (lv_tipo_4_0= ruleEString )
                    // InternalMyDsl.g:1974:6: lv_tipo_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getTipoEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalMyDsl.g:1992:3: (otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==52) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1993:4: otherlv_5= 'protocolo' ( (lv_protocolo_6_0= ruleProtocolo ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getReglaAccess().getProtocoloKeyword_4_0());
                    			
                    // InternalMyDsl.g:1997:4: ( (lv_protocolo_6_0= ruleProtocolo ) )
                    // InternalMyDsl.g:1998:5: (lv_protocolo_6_0= ruleProtocolo )
                    {
                    // InternalMyDsl.g:1998:5: (lv_protocolo_6_0= ruleProtocolo )
                    // InternalMyDsl.g:1999:6: lv_protocolo_6_0= ruleProtocolo
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getProtocoloProtocoloEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            // InternalMyDsl.g:2017:3: (otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2018:4: otherlv_7= 'puerto' ( (lv_puerto_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_35); 

                    				newLeafNode(otherlv_7, grammarAccess.getReglaAccess().getPuertoKeyword_5_0());
                    			
                    // InternalMyDsl.g:2022:4: ( (lv_puerto_8_0= ruleEInt ) )
                    // InternalMyDsl.g:2023:5: (lv_puerto_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2023:5: (lv_puerto_8_0= ruleEInt )
                    // InternalMyDsl.g:2024:6: lv_puerto_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getPuertoEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_56);
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

            // InternalMyDsl.g:2042:3: (otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2043:4: otherlv_9= 'origen' ( (lv_origen_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReglaAccess().getOrigenKeyword_6_0());
                    			
                    // InternalMyDsl.g:2047:4: ( (lv_origen_10_0= ruleEString ) )
                    // InternalMyDsl.g:2048:5: (lv_origen_10_0= ruleEString )
                    {
                    // InternalMyDsl.g:2048:5: (lv_origen_10_0= ruleEString )
                    // InternalMyDsl.g:2049:6: lv_origen_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReglaAccess().getOrigenEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

            // InternalMyDsl.g:2067:3: (otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2068:4: otherlv_11= 'descripcion' ( (lv_descripcion_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getReglaAccess().getDescripcionKeyword_7_0());
                    			
                    // InternalMyDsl.g:2072:4: ( (lv_descripcion_12_0= ruleEString ) )
                    // InternalMyDsl.g:2073:5: (lv_descripcion_12_0= ruleEString )
                    {
                    // InternalMyDsl.g:2073:5: (lv_descripcion_12_0= ruleEString )
                    // InternalMyDsl.g:2074:6: lv_descripcion_12_0= ruleEString
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
    // InternalMyDsl.g:2100:1: ruleNombreAmbiente returns [Enumerator current=null] : ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) ) ;
    public final Enumerator ruleNombreAmbiente() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2106:2: ( ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) ) )
            // InternalMyDsl.g:2107:2: ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) )
            {
            // InternalMyDsl.g:2107:2: ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt43=1;
                }
                break;
            case 56:
                {
                alt43=2;
                }
                break;
            case 57:
                {
                alt43=3;
                }
                break;
            case 58:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2108:3: (enumLiteral_0= 'DESARROLLO' )
                    {
                    // InternalMyDsl.g:2108:3: (enumLiteral_0= 'DESARROLLO' )
                    // InternalMyDsl.g:2109:4: enumLiteral_0= 'DESARROLLO'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNombreAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2116:3: (enumLiteral_1= 'PRUEBAS' )
                    {
                    // InternalMyDsl.g:2116:3: (enumLiteral_1= 'PRUEBAS' )
                    // InternalMyDsl.g:2117:4: enumLiteral_1= 'PRUEBAS'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNombreAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2124:3: (enumLiteral_2= 'QA' )
                    {
                    // InternalMyDsl.g:2124:3: (enumLiteral_2= 'QA' )
                    // InternalMyDsl.g:2125:4: enumLiteral_2= 'QA'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNombreAmbienteAccess().getQAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2132:3: (enumLiteral_3= 'PRODUCCION' )
                    {
                    // InternalMyDsl.g:2132:3: (enumLiteral_3= 'PRODUCCION' )
                    // InternalMyDsl.g:2133:4: enumLiteral_3= 'PRODUCCION'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

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
    // InternalMyDsl.g:2143:1: ruleTamanioServidor returns [Enumerator current=null] : ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) ) ;
    public final Enumerator ruleTamanioServidor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2149:2: ( ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) ) )
            // InternalMyDsl.g:2150:2: ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) )
            {
            // InternalMyDsl.g:2150:2: ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt44=1;
                }
                break;
            case 60:
                {
                alt44=2;
                }
                break;
            case 61:
                {
                alt44=3;
                }
                break;
            case 62:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2151:3: (enumLiteral_0= 'MICRO' )
                    {
                    // InternalMyDsl.g:2151:3: (enumLiteral_0= 'MICRO' )
                    // InternalMyDsl.g:2152:4: enumLiteral_0= 'MICRO'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTamanioServidorAccess().getMICROEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2159:3: (enumLiteral_1= 'SMALL' )
                    {
                    // InternalMyDsl.g:2159:3: (enumLiteral_1= 'SMALL' )
                    // InternalMyDsl.g:2160:4: enumLiteral_1= 'SMALL'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTamanioServidorAccess().getSMALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2167:3: (enumLiteral_2= 'MEDIUM' )
                    {
                    // InternalMyDsl.g:2167:3: (enumLiteral_2= 'MEDIUM' )
                    // InternalMyDsl.g:2168:4: enumLiteral_2= 'MEDIUM'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTamanioServidorAccess().getMEDIUMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2175:3: (enumLiteral_3= 'LARGE' )
                    {
                    // InternalMyDsl.g:2175:3: (enumLiteral_3= 'LARGE' )
                    // InternalMyDsl.g:2176:4: enumLiteral_3= 'LARGE'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

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
    // InternalMyDsl.g:2186:1: ruleSistemaOperativo returns [Enumerator current=null] : ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) ) ;
    public final Enumerator ruleSistemaOperativo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2192:2: ( ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) ) )
            // InternalMyDsl.g:2193:2: ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) )
            {
            // InternalMyDsl.g:2193:2: ( (enumLiteral_0= 'Windows' ) | (enumLiteral_1= 'Ubuntu1804' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==63) ) {
                alt45=1;
            }
            else if ( (LA45_0==64) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2194:3: (enumLiteral_0= 'Windows' )
                    {
                    // InternalMyDsl.g:2194:3: (enumLiteral_0= 'Windows' )
                    // InternalMyDsl.g:2195:4: enumLiteral_0= 'Windows'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSistemaOperativoAccess().getWindowsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2202:3: (enumLiteral_1= 'Ubuntu1804' )
                    {
                    // InternalMyDsl.g:2202:3: (enumLiteral_1= 'Ubuntu1804' )
                    // InternalMyDsl.g:2203:4: enumLiteral_1= 'Ubuntu1804'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalMyDsl.g:2213:1: ruleManejadorSQL returns [Enumerator current=null] : ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) ) ;
    public final Enumerator ruleManejadorSQL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2219:2: ( ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) ) )
            // InternalMyDsl.g:2220:2: ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) )
            {
            // InternalMyDsl.g:2220:2: ( (enumLiteral_0= 'POSTGRESQL' ) | (enumLiteral_1= 'MYSQL' ) | (enumLiteral_2= 'ORACLE' ) | (enumLiteral_3= 'SQLSERVER' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt46=1;
                }
                break;
            case 66:
                {
                alt46=2;
                }
                break;
            case 67:
                {
                alt46=3;
                }
                break;
            case 68:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2221:3: (enumLiteral_0= 'POSTGRESQL' )
                    {
                    // InternalMyDsl.g:2221:3: (enumLiteral_0= 'POSTGRESQL' )
                    // InternalMyDsl.g:2222:4: enumLiteral_0= 'POSTGRESQL'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getManejadorSQLAccess().getPOSTGRESQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2229:3: (enumLiteral_1= 'MYSQL' )
                    {
                    // InternalMyDsl.g:2229:3: (enumLiteral_1= 'MYSQL' )
                    // InternalMyDsl.g:2230:4: enumLiteral_1= 'MYSQL'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getManejadorSQLAccess().getMYSQLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2237:3: (enumLiteral_2= 'ORACLE' )
                    {
                    // InternalMyDsl.g:2237:3: (enumLiteral_2= 'ORACLE' )
                    // InternalMyDsl.g:2238:4: enumLiteral_2= 'ORACLE'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getManejadorSQLAccess().getORACLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2245:3: (enumLiteral_3= 'SQLSERVER' )
                    {
                    // InternalMyDsl.g:2245:3: (enumLiteral_3= 'SQLSERVER' )
                    // InternalMyDsl.g:2246:4: enumLiteral_3= 'SQLSERVER'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

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
    // InternalMyDsl.g:2256:1: ruleManejadorNoSQL returns [Enumerator current=null] : ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) ) ;
    public final Enumerator ruleManejadorNoSQL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2262:2: ( ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) ) )
            // InternalMyDsl.g:2263:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) )
            {
            // InternalMyDsl.g:2263:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'CASSANDRA' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==69) ) {
                alt47=1;
            }
            else if ( (LA47_0==70) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2264:3: (enumLiteral_0= 'MONGODB' )
                    {
                    // InternalMyDsl.g:2264:3: (enumLiteral_0= 'MONGODB' )
                    // InternalMyDsl.g:2265:4: enumLiteral_0= 'MONGODB'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getManejadorNoSQLAccess().getMONGODBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2272:3: (enumLiteral_1= 'CASSANDRA' )
                    {
                    // InternalMyDsl.g:2272:3: (enumLiteral_1= 'CASSANDRA' )
                    // InternalMyDsl.g:2273:4: enumLiteral_1= 'CASSANDRA'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

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
    // InternalMyDsl.g:2283:1: ruleProtocolo returns [Enumerator current=null] : ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) ;
    public final Enumerator ruleProtocolo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2289:2: ( ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) )
            // InternalMyDsl.g:2290:2: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            {
            // InternalMyDsl.g:2290:2: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            else if ( (LA48_0==72) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2291:3: (enumLiteral_0= 'TCP' )
                    {
                    // InternalMyDsl.g:2291:3: (enumLiteral_0= 'TCP' )
                    // InternalMyDsl.g:2292:4: enumLiteral_0= 'TCP'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocoloAccess().getTCPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2299:3: (enumLiteral_1= 'UDP' )
                    {
                    // InternalMyDsl.g:2299:3: (enumLiteral_1= 'UDP' )
                    // InternalMyDsl.g:2300:4: enumLiteral_1= 'UDP'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000002A040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001380200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001380000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000005280200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000005280000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000005200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000011280200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000011280000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000011200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000601000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000601000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001001000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0006000000002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0071000008002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0071000000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0061000000002000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0041000000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000002000L});

}