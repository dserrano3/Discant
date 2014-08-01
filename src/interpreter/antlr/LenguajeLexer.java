// $ANTLR 3.4 /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g 2014-07-31 18:21:25

package interpreter.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LenguajeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int ASIGNACION=4;
    public static final int COMENTARIO=5;
    public static final int COMILLASD=6;
    public static final int COMILLASS=7;
    public static final int DOBLE=8;
    public static final int ELSE=9;
    public static final int ELSEIF=10;
    public static final int FOR=11;
    public static final int FUNCTION=12;
    public static final int IF=13;
    public static final int LLAVE_D=14;
    public static final int LLAVE_I=15;
    public static final int NEWLINE=16;
    public static final int NOMBRE=17;
    public static final int NUMERO=18;
    public static final int PARENTESIS_D=19;
    public static final int PARENTESIS_I=20;
    public static final int PC=21;
    public static final int PRINT=22;
    public static final int PRINTLN=23;
    public static final int READ=24;
    public static final int TEXTO=25;
    public static final int TOKEN=26;
    public static final int WHILE=27;
    public static final int WS=28;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LenguajeLexer() {} 
    public LenguajeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LenguajeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g"; }

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:11:7: ( '!=' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:11:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:12:7: ( '%' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:12:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:13:7: ( '&&' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:13:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:14:7: ( '*' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:14:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:15:7: ( '+' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:15:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:16:7: ( ',' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:17:7: ( '-' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:17:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:18:7: ( '.get(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:18:9: '.get('
            {
            match(".get("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:19:7: ( '.push(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:19:9: '.push('
            {
            match(".push("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:20:7: ( '.set(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:20:9: '.set('
            {
            match(".set("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:21:7: ( '/' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:21:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:22:7: ( '<' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:22:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:23:7: ( '<=' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:23:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:24:7: ( '==' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:24:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:25:7: ( '>' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:25:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:26:7: ( '>=' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:26:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:27:7: ( '[' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:28:7: ( ']' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:29:7: ( 'list' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:29:9: 'list'
            {
            match("list"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:30:7: ( 'return' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:30:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:31:7: ( 'var' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:31:9: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:32:7: ( '||' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:32:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:608:3: ( 'hola' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:609:3: 'hola'
            {
            match("hola"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TOKEN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:613:3: ( 'if' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:614:3: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "PC"
    public final void mPC() throws RecognitionException {
        try {
            int _type = PC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:618:3: ( ';' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:619:3: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PC"

    // $ANTLR start "ASIGNACION"
    public final void mASIGNACION() throws RecognitionException {
        try {
            int _type = ASIGNACION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:639:3: ( '=' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:640:3: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASIGNACION"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:644:3: ( 'while' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:645:3: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:649:3: ( 'for' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:650:3: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:654:3: ( 'else' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:655:3: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:3: ( 'function' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:660:3: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:664:3: ( 'else if' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:665:3: 'else if'
            {
            match("else if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "DOBLE"
    public final void mDOBLE() throws RecognitionException {
        try {
            int _type = DOBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:669:3: ( ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:670:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:670:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:670:5: ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:670:5: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:670:16: ( '.' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:670:17: '.'
            {
            match('.'); 

            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:670:22: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOBLE"

    // $ANTLR start "NUMERO"
    public final void mNUMERO() throws RecognitionException {
        try {
            int _type = NUMERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:676:3: ( ( ( '0' .. '9' )+ ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:677:3: ( ( '0' .. '9' )+ )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:677:3: ( ( '0' .. '9' )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:677:5: ( '0' .. '9' )+
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:677:5: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMERO"

    // $ANTLR start "PARENTESIS_D"
    public final void mPARENTESIS_D() throws RecognitionException {
        try {
            int _type = PARENTESIS_D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:683:3: ( ')' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:684:3: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARENTESIS_D"

    // $ANTLR start "PARENTESIS_I"
    public final void mPARENTESIS_I() throws RecognitionException {
        try {
            int _type = PARENTESIS_I;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:688:3: ( '(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:689:3: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARENTESIS_I"

    // $ANTLR start "LLAVE_D"
    public final void mLLAVE_D() throws RecognitionException {
        try {
            int _type = LLAVE_D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:693:3: ( '}' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:694:3: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LLAVE_D"

    // $ANTLR start "LLAVE_I"
    public final void mLLAVE_I() throws RecognitionException {
        try {
            int _type = LLAVE_I;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:698:3: ( '{' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:699:3: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LLAVE_I"

    // $ANTLR start "COMILLASD"
    public final void mCOMILLASD() throws RecognitionException {
        try {
            int _type = COMILLASD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:703:3: ( '\\\"' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:704:3: '\\\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMILLASD"

    // $ANTLR start "COMILLASS"
    public final void mCOMILLASS() throws RecognitionException {
        try {
            int _type = COMILLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:708:3: ( '\\'' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:709:3: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMILLASS"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:713:3: ( ( 'print' ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:714:3: ( 'print' )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:714:3: ( 'print' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:714:4: 'print'
            {
            match("print"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "PRINTLN"
    public final void mPRINTLN() throws RecognitionException {
        try {
            int _type = PRINTLN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:718:3: ( ( 'println' ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:719:3: ( 'println' )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:719:3: ( 'println' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:719:4: 'println'
            {
            match("println"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINTLN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:723:3: ( ( 'read' ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:724:3: ( 'read' )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:724:3: ( 'read' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:724:4: 'read'
            {
            match("read"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "NOMBRE"
    public final void mNOMBRE() throws RecognitionException {
        try {
            int _type = NOMBRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:728:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:729:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:729:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:730:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:734:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '1' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:
            	    {
            	    if ( (input.LA(1) >= '1' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOMBRE"

    // $ANTLR start "TEXTO"
    public final void mTEXTO() throws RecognitionException {
        try {
            int _type = TEXTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:746:3: ( COMILLASD ( . )* COMILLASD )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:747:3: COMILLASD ( . )* COMILLASD
            {
            mCOMILLASD(); 


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:747:13: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    alt5=2;
                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:747:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            mCOMILLASD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXTO"

    // $ANTLR start "COMENTARIO"
    public final void mCOMENTARIO() throws RecognitionException {
        try {
            int _type = COMENTARIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:752:3: ( '/*' ( . )+ '*/' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:753:3: '/*' ( . )+ '*/'
            {
            match("/*"); 



            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:753:8: ( . )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:753:9: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match("*/"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMENTARIO"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:761:4: ( ( ' ' | '\\t' )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:761:6: ( ' ' | '\\t' )+
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:761:6: ( ' ' | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:764:8: ( ( '\\r' )? '\\n' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:764:10: ( '\\r' )? '\\n'
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:764:10: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:764:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | TOKEN | IF | PC | ASIGNACION | WHILE | FOR | ELSE | FUNCTION | ELSEIF | DOBLE | NUMERO | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | NOMBRE | TEXTO | COMENTARIO | WS | NEWLINE )
        int alt9=47;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:10: T__29
                {
                mT__29(); 


                }
                break;
            case 2 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:16: T__30
                {
                mT__30(); 


                }
                break;
            case 3 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:22: T__31
                {
                mT__31(); 


                }
                break;
            case 4 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:28: T__32
                {
                mT__32(); 


                }
                break;
            case 5 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:34: T__33
                {
                mT__33(); 


                }
                break;
            case 6 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:40: T__34
                {
                mT__34(); 


                }
                break;
            case 7 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:46: T__35
                {
                mT__35(); 


                }
                break;
            case 8 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:52: T__36
                {
                mT__36(); 


                }
                break;
            case 9 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:58: T__37
                {
                mT__37(); 


                }
                break;
            case 10 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:64: T__38
                {
                mT__38(); 


                }
                break;
            case 11 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:70: T__39
                {
                mT__39(); 


                }
                break;
            case 12 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:76: T__40
                {
                mT__40(); 


                }
                break;
            case 13 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:82: T__41
                {
                mT__41(); 


                }
                break;
            case 14 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:88: T__42
                {
                mT__42(); 


                }
                break;
            case 15 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:94: T__43
                {
                mT__43(); 


                }
                break;
            case 16 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:100: T__44
                {
                mT__44(); 


                }
                break;
            case 17 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:106: T__45
                {
                mT__45(); 


                }
                break;
            case 18 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:112: T__46
                {
                mT__46(); 


                }
                break;
            case 19 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:118: T__47
                {
                mT__47(); 


                }
                break;
            case 20 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:124: T__48
                {
                mT__48(); 


                }
                break;
            case 21 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:130: T__49
                {
                mT__49(); 


                }
                break;
            case 22 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:136: T__50
                {
                mT__50(); 


                }
                break;
            case 23 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:142: TOKEN
                {
                mTOKEN(); 


                }
                break;
            case 24 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:148: IF
                {
                mIF(); 


                }
                break;
            case 25 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:151: PC
                {
                mPC(); 


                }
                break;
            case 26 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:154: ASIGNACION
                {
                mASIGNACION(); 


                }
                break;
            case 27 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:165: WHILE
                {
                mWHILE(); 


                }
                break;
            case 28 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:171: FOR
                {
                mFOR(); 


                }
                break;
            case 29 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:175: ELSE
                {
                mELSE(); 


                }
                break;
            case 30 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:180: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 31 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:189: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 32 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:196: DOBLE
                {
                mDOBLE(); 


                }
                break;
            case 33 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:202: NUMERO
                {
                mNUMERO(); 


                }
                break;
            case 34 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:209: PARENTESIS_D
                {
                mPARENTESIS_D(); 


                }
                break;
            case 35 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:222: PARENTESIS_I
                {
                mPARENTESIS_I(); 


                }
                break;
            case 36 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:235: LLAVE_D
                {
                mLLAVE_D(); 


                }
                break;
            case 37 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:243: LLAVE_I
                {
                mLLAVE_I(); 


                }
                break;
            case 38 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:251: COMILLASD
                {
                mCOMILLASD(); 


                }
                break;
            case 39 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:261: COMILLASS
                {
                mCOMILLASS(); 


                }
                break;
            case 40 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:271: PRINT
                {
                mPRINT(); 


                }
                break;
            case 41 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:277: PRINTLN
                {
                mPRINTLN(); 


                }
                break;
            case 42 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:285: READ
                {
                mREAD(); 


                }
                break;
            case 43 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:290: NOMBRE
                {
                mNOMBRE(); 


                }
                break;
            case 44 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:297: TEXTO
                {
                mTEXTO(); 


                }
                break;
            case 45 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:303: COMENTARIO
                {
                mCOMENTARIO(); 


                }
                break;
            case 46 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:314: WS
                {
                mWS(); 


                }
                break;
            case 47 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:317: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\11\uffff\1\50\1\52\1\54\1\56\2\uffff\3\41\1\uffff\2\41\1\uffff"+
        "\3\41\1\71\4\uffff\1\72\1\uffff\1\41\16\uffff\4\41\1\102\4\41\4"+
        "\uffff\4\41\1\113\1\41\1\uffff\1\41\1\116\3\41\1\122\1\41\1\124"+
        "\1\uffff\1\125\1\41\1\uffff\1\41\1\131\1\41\1\uffff\1\41\2\uffff"+
        "\1\134\1\41\2\uffff\1\137\1\140\1\uffff\2\41\2\uffff\1\41\1\144"+
        "\1\145\2\uffff";
    static final String DFA9_eofS =
        "\146\uffff";
    static final String DFA9_minS =
        "\1\11\7\uffff\1\147\1\52\3\75\2\uffff\1\151\1\145\1\141\1\uffff"+
        "\1\157\1\146\1\uffff\1\150\1\157\1\154\1\56\4\uffff\1\0\1\uffff"+
        "\1\162\16\uffff\1\163\1\141\1\162\1\154\1\61\1\151\1\162\1\156\1"+
        "\163\4\uffff\1\151\1\164\1\165\1\144\1\61\1\141\1\uffff\1\154\1"+
        "\61\1\143\1\145\1\156\1\61\1\162\1\61\1\uffff\1\61\1\145\1\uffff"+
        "\1\164\1\40\1\164\1\uffff\1\156\2\uffff\1\61\1\151\2\uffff\2\61"+
        "\1\uffff\1\157\1\156\2\uffff\1\156\2\61\2\uffff";
    static final String DFA9_maxS =
        "\1\175\7\uffff\1\163\1\52\3\75\2\uffff\1\151\1\145\1\141\1\uffff"+
        "\1\157\1\146\1\uffff\1\150\1\165\1\154\1\71\4\uffff\1\uffff\1\uffff"+
        "\1\162\16\uffff\1\163\1\164\1\162\1\154\1\172\1\151\1\162\1\156"+
        "\1\163\4\uffff\1\151\1\164\1\165\1\144\1\172\1\141\1\uffff\1\154"+
        "\1\172\1\143\1\145\1\156\1\172\1\162\1\172\1\uffff\1\172\1\145\1"+
        "\uffff\1\164\1\172\1\164\1\uffff\1\156\2\uffff\1\172\1\151\2\uffff"+
        "\2\172\1\uffff\1\157\1\156\2\uffff\1\156\2\172\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff\1\21\1\22\3\uffff\1"+
        "\26\2\uffff\1\31\4\uffff\1\42\1\43\1\44\1\45\1\uffff\1\47\1\uffff"+
        "\1\53\1\56\1\57\1\10\1\11\1\12\1\55\1\13\1\15\1\14\1\16\1\32\1\20"+
        "\1\17\11\uffff\1\40\1\41\1\46\1\54\6\uffff\1\30\10\uffff\1\25\2"+
        "\uffff\1\34\3\uffff\1\23\1\uffff\1\52\1\27\2\uffff\1\37\1\35\2\uffff"+
        "\1\33\2\uffff\1\50\1\24\3\uffff\1\51\1\36";
    static final String DFA9_specialS =
        "\36\uffff\1\0\107\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\42\1\43\2\uffff\1\43\22\uffff\1\42\1\1\1\36\2\uffff\1\2\1"+
            "\3\1\37\1\33\1\32\1\4\1\5\1\6\1\7\1\10\1\11\12\31\1\uffff\1"+
            "\25\1\12\1\13\1\14\2\uffff\32\41\1\15\1\uffff\1\16\3\uffff\4"+
            "\41\1\30\1\27\1\41\1\23\1\24\2\41\1\17\3\41\1\40\1\41\1\20\3"+
            "\41\1\21\1\26\3\41\1\35\1\22\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\10\uffff\1\45\2\uffff\1\46",
            "\1\47",
            "\1\51",
            "\1\53",
            "\1\55",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65\5\uffff\1\66",
            "\1\67",
            "\1\70\1\uffff\12\31",
            "",
            "",
            "",
            "",
            "\0\73",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\77\22\uffff\1\76",
            "\1\100",
            "\1\101",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "\1\114",
            "",
            "\1\115",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "\1\117",
            "\1\120",
            "\1\121",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "\1\123",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "\1\126",
            "",
            "\1\127",
            "\1\130\20\uffff\11\41\7\uffff\32\41\6\uffff\32\41",
            "\1\132",
            "",
            "\1\133",
            "",
            "",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "\1\135",
            "",
            "",
            "\11\41\7\uffff\32\41\6\uffff\13\41\1\136\16\41",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "\11\41\7\uffff\32\41\6\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | TOKEN | IF | PC | ASIGNACION | WHILE | FOR | ELSE | FUNCTION | ELSEIF | DOBLE | NUMERO | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | NOMBRE | TEXTO | COMENTARIO | WS | NEWLINE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_30 = input.LA(1);

                        s = -1;
                        if ( ((LA9_30 >= '\u0000' && LA9_30 <= '\uFFFF')) ) {s = 59;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}