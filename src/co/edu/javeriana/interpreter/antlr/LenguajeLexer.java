// $ANTLR 3.4 /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g 2014-07-20 11:28:57

package co.edu.javeriana.interpreter.antlr;


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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:12:7: ( '&&' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:12:9: '&&'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:13:7: ( '*' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:13:9: '*'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:14:7: ( '+' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:14:9: '+'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:15:7: ( ',' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:15:9: ','
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:16:7: ( '-' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:16:9: '-'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:17:7: ( '.get(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:17:9: '.get('
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:18:7: ( '.push(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:18:9: '.push('
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:19:7: ( '.set(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:19:9: '.set('
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:20:7: ( '/' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:20:9: '/'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:21:7: ( '<' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:21:9: '<'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:22:7: ( '<=' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:22:9: '<='
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:23:7: ( '==' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:23:9: '=='
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:24:7: ( '>' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:24:9: '>'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:25:7: ( '>=' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:25:9: '>='
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:26:7: ( '[' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:26:9: '['
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:27:7: ( ']' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:27:9: ']'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:28:7: ( 'list' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:28:9: 'list'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:29:7: ( 'return' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:29:9: 'return'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:30:7: ( 'var' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:30:9: 'var'
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:31:7: ( '||' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:31:9: '||'
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
    // $ANTLR end "T__49"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:597:3: ( 'hola' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:598:3: 'hola'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:602:3: ( 'if' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:603:3: 'if'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:607:3: ( ';' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:608:3: ';'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:628:3: ( '=' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:629:3: '='
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:633:3: ( 'while' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:634:3: 'while'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:638:3: ( 'for' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:639:3: 'for'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:643:3: ( 'else' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:644:3: 'else'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:648:3: ( 'function' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:649:3: 'function'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:653:3: ( 'else if' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:654:3: 'else if'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:658:3: ( ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:5: ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:5: ( '0' .. '9' )+
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


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:16: ( '.' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:17: '.'
            {
            match('.'); 

            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:659:22: ( '0' .. '9' )+
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:665:3: ( ( ( '0' .. '9' )+ ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:666:3: ( ( '0' .. '9' )+ )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:666:3: ( ( '0' .. '9' )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:666:5: ( '0' .. '9' )+
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:666:5: ( '0' .. '9' )+
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:672:3: ( ')' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:673:3: ')'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:677:3: ( '(' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:678:3: '('
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:682:3: ( '}' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:683:3: '}'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:687:3: ( '{' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:688:3: '{'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:692:3: ( '\\\"' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:693:3: '\\\"'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:697:3: ( '\\'' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:698:3: '\\''
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:702:3: ( ( 'print' ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:703:3: ( 'print' )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:703:3: ( 'print' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:703:4: 'print'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:707:3: ( ( 'println' ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:708:3: ( 'println' )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:708:3: ( 'println' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:708:4: 'println'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:712:3: ( ( 'read' ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:713:3: ( 'read' )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:713:3: ( 'read' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:713:4: 'read'
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:717:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* ) )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:718:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* )
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:718:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:719:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:723:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )*
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:735:3: ( COMILLASD ( . )* COMILLASD )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:736:3: COMILLASD ( . )* COMILLASD
            {
            mCOMILLASD(); 


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:736:13: ( . )*
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
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:736:14: .
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:741:3: ( '/*' ( . )+ '*/' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:742:3: '/*' ( . )+ '*/'
            {
            match("/*"); 



            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:742:8: ( . )+
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
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:742:9: .
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:750:4: ( ( ' ' | '\\t' )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:750:6: ( ' ' | '\\t' )+
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:750:6: ( ' ' | '\\t' )+
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:753:8: ( ( '\\r' )? '\\n' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:753:10: ( '\\r' )? '\\n'
            {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:753:10: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:753:10: '\\r'
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
        // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TOKEN | IF | PC | ASIGNACION | WHILE | FOR | ELSE | FUNCTION | ELSEIF | DOBLE | NUMERO | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | NOMBRE | TEXTO | COMENTARIO | WS | NEWLINE )
        int alt9=46;
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
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:136: TOKEN
                {
                mTOKEN(); 


                }
                break;
            case 23 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:142: IF
                {
                mIF(); 


                }
                break;
            case 24 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:145: PC
                {
                mPC(); 


                }
                break;
            case 25 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:148: ASIGNACION
                {
                mASIGNACION(); 


                }
                break;
            case 26 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:159: WHILE
                {
                mWHILE(); 


                }
                break;
            case 27 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:165: FOR
                {
                mFOR(); 


                }
                break;
            case 28 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:169: ELSE
                {
                mELSE(); 


                }
                break;
            case 29 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:174: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 30 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:183: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 31 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:190: DOBLE
                {
                mDOBLE(); 


                }
                break;
            case 32 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:196: NUMERO
                {
                mNUMERO(); 


                }
                break;
            case 33 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:203: PARENTESIS_D
                {
                mPARENTESIS_D(); 


                }
                break;
            case 34 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:216: PARENTESIS_I
                {
                mPARENTESIS_I(); 


                }
                break;
            case 35 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:229: LLAVE_D
                {
                mLLAVE_D(); 


                }
                break;
            case 36 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:237: LLAVE_I
                {
                mLLAVE_I(); 


                }
                break;
            case 37 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:245: COMILLASD
                {
                mCOMILLASD(); 


                }
                break;
            case 38 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:255: COMILLASS
                {
                mCOMILLASS(); 


                }
                break;
            case 39 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:265: PRINT
                {
                mPRINT(); 


                }
                break;
            case 40 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:271: PRINTLN
                {
                mPRINTLN(); 


                }
                break;
            case 41 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:279: READ
                {
                mREAD(); 


                }
                break;
            case 42 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:284: NOMBRE
                {
                mNOMBRE(); 


                }
                break;
            case 43 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:291: TEXTO
                {
                mTEXTO(); 


                }
                break;
            case 44 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:297: COMENTARIO
                {
                mCOMENTARIO(); 


                }
                break;
            case 45 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:308: WS
                {
                mWS(); 


                }
                break;
            case 46 :
                // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:1:311: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\10\uffff\1\47\1\51\1\53\1\55\2\uffff\3\40\1\uffff\2\40\1\uffff"+
        "\3\40\1\70\4\uffff\1\71\1\uffff\1\40\16\uffff\4\40\1\101\4\40\4"+
        "\uffff\4\40\1\112\1\40\1\uffff\1\40\1\115\3\40\1\121\1\40\1\123"+
        "\1\uffff\1\124\1\40\1\uffff\1\40\1\130\1\40\1\uffff\1\40\2\uffff"+
        "\1\133\1\40\2\uffff\1\136\1\137\1\uffff\2\40\2\uffff\1\40\1\143"+
        "\1\144\2\uffff";
    static final String DFA9_eofS =
        "\145\uffff";
    static final String DFA9_minS =
        "\1\11\6\uffff\1\147\1\52\3\75\2\uffff\1\151\1\145\1\141\1\uffff"+
        "\1\157\1\146\1\uffff\1\150\1\157\1\154\1\56\4\uffff\1\0\1\uffff"+
        "\1\162\16\uffff\1\163\1\141\1\162\1\154\1\61\1\151\1\162\1\156\1"+
        "\163\4\uffff\1\151\1\164\1\165\1\144\1\61\1\141\1\uffff\1\154\1"+
        "\61\1\143\1\145\1\156\1\61\1\162\1\61\1\uffff\1\61\1\145\1\uffff"+
        "\1\164\1\40\1\164\1\uffff\1\156\2\uffff\1\61\1\151\2\uffff\2\61"+
        "\1\uffff\1\157\1\156\2\uffff\1\156\2\61\2\uffff";
    static final String DFA9_maxS =
        "\1\175\6\uffff\1\163\1\52\3\75\2\uffff\1\151\1\145\1\141\1\uffff"+
        "\1\157\1\146\1\uffff\1\150\1\165\1\154\1\71\4\uffff\1\uffff\1\uffff"+
        "\1\162\16\uffff\1\163\1\164\1\162\1\154\1\172\1\151\1\162\1\156"+
        "\1\163\4\uffff\1\151\1\164\1\165\1\144\1\172\1\141\1\uffff\1\154"+
        "\1\172\1\143\1\145\1\156\1\172\1\162\1\172\1\uffff\1\172\1\145\1"+
        "\uffff\1\164\1\172\1\164\1\uffff\1\156\2\uffff\1\172\1\151\2\uffff"+
        "\2\172\1\uffff\1\157\1\156\2\uffff\1\156\2\172\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\5\uffff\1\20\1\21\3\uffff\1\25"+
        "\2\uffff\1\30\4\uffff\1\41\1\42\1\43\1\44\1\uffff\1\46\1\uffff\1"+
        "\52\1\55\1\56\1\7\1\10\1\11\1\54\1\12\1\14\1\13\1\15\1\31\1\17\1"+
        "\16\11\uffff\1\37\1\40\1\45\1\53\6\uffff\1\27\10\uffff\1\24\2\uffff"+
        "\1\33\3\uffff\1\22\1\uffff\1\51\1\26\2\uffff\1\36\1\34\2\uffff\1"+
        "\32\2\uffff\1\47\1\23\3\uffff\1\50\1\35";
    static final String DFA9_specialS =
        "\35\uffff\1\0\107\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\41\1\42\2\uffff\1\42\22\uffff\1\41\1\1\1\35\3\uffff\1\2\1"+
            "\36\1\32\1\31\1\3\1\4\1\5\1\6\1\7\1\10\12\30\1\uffff\1\24\1"+
            "\11\1\12\1\13\2\uffff\32\40\1\14\1\uffff\1\15\3\uffff\4\40\1"+
            "\27\1\26\1\40\1\22\1\23\2\40\1\16\3\40\1\37\1\40\1\17\3\40\1"+
            "\20\1\25\3\40\1\34\1\21\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\10\uffff\1\44\2\uffff\1\45",
            "\1\46",
            "\1\50",
            "\1\52",
            "\1\54",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64\5\uffff\1\65",
            "\1\66",
            "\1\67\1\uffff\12\30",
            "",
            "",
            "",
            "",
            "\0\72",
            "",
            "\1\73",
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
            "\1\74",
            "\1\76\22\uffff\1\75",
            "\1\77",
            "\1\100",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "\1\113",
            "",
            "\1\114",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "\1\116",
            "\1\117",
            "\1\120",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "\1\122",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "\1\125",
            "",
            "\1\126",
            "\1\127\20\uffff\11\40\7\uffff\32\40\6\uffff\32\40",
            "\1\131",
            "",
            "\1\132",
            "",
            "",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "\1\134",
            "",
            "",
            "\11\40\7\uffff\32\40\6\uffff\13\40\1\135\16\40",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
            "\11\40\7\uffff\32\40\6\uffff\32\40",
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
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | TOKEN | IF | PC | ASIGNACION | WHILE | FOR | ELSE | FUNCTION | ELSEIF | DOBLE | NUMERO | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | NOMBRE | TEXTO | COMENTARIO | WS | NEWLINE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_29 = input.LA(1);

                        s = -1;
                        if ( ((LA9_29 >= '\u0000' && LA9_29 <= '\uFFFF')) ) {s = 58;}

                        else s = 57;

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