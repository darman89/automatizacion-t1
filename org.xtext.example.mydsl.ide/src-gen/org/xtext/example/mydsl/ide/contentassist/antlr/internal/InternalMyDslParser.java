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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Infraestructura'", "'{'", "'}'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
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
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:102:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:106:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:107:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:107:2: ( RULE_STRING )
                    // InternalMyDsl.g:108:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:113:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:113:2: ( RULE_ID )
                    // InternalMyDsl.g:114:3: RULE_ID
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


    // $ANTLR start "rule__Infraestructura__Group__0"
    // InternalMyDsl.g:123:1: rule__Infraestructura__Group__0 : rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 ;
    public final void rule__Infraestructura__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:127:1: ( rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 )
            // InternalMyDsl.g:128:2: rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1
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
    // InternalMyDsl.g:135:1: rule__Infraestructura__Group__0__Impl : ( 'Infraestructura' ) ;
    public final void rule__Infraestructura__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:139:1: ( ( 'Infraestructura' ) )
            // InternalMyDsl.g:140:1: ( 'Infraestructura' )
            {
            // InternalMyDsl.g:140:1: ( 'Infraestructura' )
            // InternalMyDsl.g:141:2: 'Infraestructura'
            {
             before(grammarAccess.getInfraestructuraAccess().getInfraestructuraKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMyDsl.g:150:1: rule__Infraestructura__Group__1 : rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 ;
    public final void rule__Infraestructura__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:154:1: ( rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 )
            // InternalMyDsl.g:155:2: rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2
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
    // InternalMyDsl.g:162:1: rule__Infraestructura__Group__1__Impl : ( ( rule__Infraestructura__NombreAssignment_1 ) ) ;
    public final void rule__Infraestructura__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:1: ( ( ( rule__Infraestructura__NombreAssignment_1 ) ) )
            // InternalMyDsl.g:167:1: ( ( rule__Infraestructura__NombreAssignment_1 ) )
            {
            // InternalMyDsl.g:167:1: ( ( rule__Infraestructura__NombreAssignment_1 ) )
            // InternalMyDsl.g:168:2: ( rule__Infraestructura__NombreAssignment_1 )
            {
             before(grammarAccess.getInfraestructuraAccess().getNombreAssignment_1()); 
            // InternalMyDsl.g:169:2: ( rule__Infraestructura__NombreAssignment_1 )
            // InternalMyDsl.g:169:3: rule__Infraestructura__NombreAssignment_1
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
    // InternalMyDsl.g:177:1: rule__Infraestructura__Group__2 : rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 ;
    public final void rule__Infraestructura__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 )
            // InternalMyDsl.g:182:2: rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3
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
    // InternalMyDsl.g:189:1: rule__Infraestructura__Group__2__Impl : ( '{' ) ;
    public final void rule__Infraestructura__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:193:1: ( ( '{' ) )
            // InternalMyDsl.g:194:1: ( '{' )
            {
            // InternalMyDsl.g:194:1: ( '{' )
            // InternalMyDsl.g:195:2: '{'
            {
             before(grammarAccess.getInfraestructuraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:204:1: rule__Infraestructura__Group__3 : rule__Infraestructura__Group__3__Impl ;
    public final void rule__Infraestructura__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:1: ( rule__Infraestructura__Group__3__Impl )
            // InternalMyDsl.g:209:2: rule__Infraestructura__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:215:1: rule__Infraestructura__Group__3__Impl : ( '}' ) ;
    public final void rule__Infraestructura__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:219:1: ( ( '}' ) )
            // InternalMyDsl.g:220:1: ( '}' )
            {
            // InternalMyDsl.g:220:1: ( '}' )
            // InternalMyDsl.g:221:2: '}'
            {
             before(grammarAccess.getInfraestructuraAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Infraestructura__NombreAssignment_1"
    // InternalMyDsl.g:231:1: rule__Infraestructura__NombreAssignment_1 : ( ruleEString ) ;
    public final void rule__Infraestructura__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:235:1: ( ( ruleEString ) )
            // InternalMyDsl.g:236:2: ( ruleEString )
            {
            // InternalMyDsl.g:236:2: ( ruleEString )
            // InternalMyDsl.g:237:3: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});

}