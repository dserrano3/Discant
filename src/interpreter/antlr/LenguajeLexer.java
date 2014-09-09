// $ANTLR 3.4 C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g 2014-09-08 19:31:12

package interpreter.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LenguajeLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int ASIGNACION=4;
    public static final int BOOLEAN=5;
    public static final int COMENTARIO=6;
    public static final int COMILLASD=7;
    public static final int COMILLASS=8;
    public static final int DOBLE=9;
    public static final int ELSE=10;
    public static final int ELSEIF=11;
    public static final int FOR=12;
    public static final int FUNCTION=13;
    public static final int IF=14;
    public static final int LIST=15;
    public static final int LLAVE_D=16;
    public static final int LLAVE_I=17;
    public static final int NEWLINE=18;
    public static final int NOMBRE=19;
    public static final int NUMERO=20;
    public static final int PARENTESIS_D=21;
    public static final int PARENTESIS_I=22;
    public static final int PC=23;
    public static final int PRINT=24;
    public static final int PRINTLN=25;
    public static final int PUSH=26;
    public static final int READ=27;
    public static final int RETURN=28;
    public static final int SET=29;
    public static final int SIZE=30;
    public static final int TEXTO=31;
    public static final int TOKEN=32;
    public static final int VARIABLE=33;
    public static final int WHILE=34;
    public static final int WS=35;

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
    public String getGrammarFileName() { return "C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:11:7: ( '!=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:11:9: '!='
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:12:7: ( '%' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:12:9: '%'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:13:7: ( '&&' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:13:9: '&&'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:14:7: ( '()' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:14:9: '()'
            {
            match("()"); 



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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:15:7: ( '*' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:15:9: '*'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:16:7: ( '+' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:16:9: '+'
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:17:7: ( '++' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:17:9: '++'
            {
            match("++"); 



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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:18:7: ( '+=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:18:9: '+='
            {
            match("+="); 



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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:19:7: ( ',' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:19:9: ','
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:20:7: ( '-' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:20:9: '-'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:21:7: ( '--' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:21:9: '--'
            {
            match("--"); 



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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:22:7: ( '-=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:22:9: '-='
            {
            match("-="); 



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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:23:7: ( '.' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:23:9: '.'
            {
            match('.'); 

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:24:7: ( '.get(' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:24:9: '.get('
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:25:7: ( '.size' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:25:9: '.size'
            {
            match(".size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:26:7: ( '/' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:26:9: '/'
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:27:7: ( '<' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:27:9: '<'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:28:7: ( '<=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:28:9: '<='
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:29:7: ( '==' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:29:9: '=='
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:30:7: ( '>' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:30:9: '>'
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:31:7: ( '>=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:31:9: '>='
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:32:7: ( '[' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:32:9: '['
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:33:7: ( ']' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:33:9: ']'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:34:7: ( '||' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:34:9: '||'
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
    // $ANTLR end "T__59"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:691:3: ( 'hola' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:692:3: 'hola'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:696:3: ( 'if' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:697:3: 'if'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:701:3: ( ';' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:702:3: ';'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:722:3: ( '=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:723:3: '='
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:727:3: ( 'while' | 'mientras' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='w') ) {
                alt1=1;
            }
            else if ( (LA1_0=='m') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:728:3: 'while'
                    {
                    match("while"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:728:13: 'mientras'
                    {
                    match("mientras"); 



                    }
                    break;

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:732:3: ( 'for' | 'para' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='f') ) {
                alt2=1;
            }
            else if ( (LA2_0=='p') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:733:3: 'for'
                    {
                    match("for"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:733:11: 'para'
                    {
                    match("para"); 



                    }
                    break;

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:737:3: ( 'else' | 'si_no' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='e') ) {
                alt3=1;
            }
            else if ( (LA3_0=='s') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:738:3: 'else'
                    {
                    match("else"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:738:12: 'si_no'
                    {
                    match("si_no"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:740:9: ( 'var' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:741:3: 'var'
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
    // $ANTLR end "VARIABLE"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:743:5: ( 'list' | 'lista' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='l') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='i') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='s') ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3=='t') ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4=='a') ) {
                                alt4=2;
                            }
                            else {
                                alt4=1;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:744:4: 'list'
                    {
                    match("list"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:744:13: 'lista'
                    {
                    match("lista"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:747:3: ( 'function' | 'funcion' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='f') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='u') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='n') ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3=='c') ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4=='t') ) {
                                alt5=1;
                            }
                            else if ( (LA5_4=='i') ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:748:3: 'function'
                    {
                    match("function"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:748:16: 'funcion'
                    {
                    match("funcion"); 



                    }
                    break;

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:752:3: ( 'else if' | 'si_no si' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='e') ) {
                alt6=1;
            }
            else if ( (LA6_0=='s') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:753:3: 'else if'
                    {
                    match("else if"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:753:15: 'si_no si'
                    {
                    match("si_no si"); 



                    }
                    break;

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:757:3: ( ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:5: ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:5: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:16: ( '.' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:17: '.'
            {
            match('.'); 

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:22: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:764:3: ( ( ( '0' .. '9' )+ ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:765:3: ( ( '0' .. '9' )+ )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:765:3: ( ( '0' .. '9' )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:765:5: ( '0' .. '9' )+
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:765:5: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:769:3: ( 'true' | 'false' | 'FALSE' | 'TRUE' | 'True' | 'False' | 'verdadero' | 'falso' | 'FALSO' | 'VERDADERO' | 'Verdadero' | 'Falso' )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt10=1;
                }
                break;
            case 'f':
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='a') ) {
                    int LA10_7 = input.LA(3);

                    if ( (LA10_7=='l') ) {
                        int LA10_14 = input.LA(4);

                        if ( (LA10_14=='s') ) {
                            int LA10_17 = input.LA(5);

                            if ( (LA10_17=='e') ) {
                                alt10=2;
                            }
                            else if ( (LA10_17=='o') ) {
                                alt10=8;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 17, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'F':
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3=='A') ) {
                    int LA10_8 = input.LA(3);

                    if ( (LA10_8=='L') ) {
                        int LA10_15 = input.LA(4);

                        if ( (LA10_15=='S') ) {
                            int LA10_18 = input.LA(5);

                            if ( (LA10_18=='E') ) {
                                alt10=3;
                            }
                            else if ( (LA10_18=='O') ) {
                                alt10=9;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 18, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 15, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 8, input);

                        throw nvae;

                    }
                }
                else if ( (LA10_3=='a') ) {
                    int LA10_9 = input.LA(3);

                    if ( (LA10_9=='l') ) {
                        int LA10_16 = input.LA(4);

                        if ( (LA10_16=='s') ) {
                            int LA10_19 = input.LA(5);

                            if ( (LA10_19=='e') ) {
                                alt10=6;
                            }
                            else if ( (LA10_19=='o') ) {
                                alt10=12;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'T':
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4=='R') ) {
                    alt10=4;
                }
                else if ( (LA10_4=='r') ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'v':
                {
                alt10=7;
                }
                break;
            case 'V':
                {
                int LA10_6 = input.LA(2);

                if ( (LA10_6=='E') ) {
                    alt10=10;
                }
                else if ( (LA10_6=='e') ) {
                    alt10=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:770:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:770:13: 'false'
                    {
                    match("false"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:770:23: 'FALSE'
                    {
                    match("FALSE"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:770:33: 'TRUE'
                    {
                    match("TRUE"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:770:42: 'True'
                    {
                    match("True"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:770:51: 'False'
                    {
                    match("False"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:771:4: 'verdadero'
                    {
                    match("verdadero"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:771:18: 'falso'
                    {
                    match("falso"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:771:28: 'FALSO'
                    {
                    match("FALSO"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:771:38: 'VERDADERO'
                    {
                    match("VERDADERO"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:771:52: 'Verdadero'
                    {
                    match("Verdadero"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:771:66: 'Falso'
                    {
                    match("Falso"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "PARENTESIS_D"
    public final void mPARENTESIS_D() throws RecognitionException {
        try {
            int _type = PARENTESIS_D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:777:3: ( ')' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:778:3: ')'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:782:3: ( '(' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:783:3: '('
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:787:3: ( '}' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:788:3: '}'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:792:3: ( '{' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:793:3: '{'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:797:3: ( '\\\"' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:798:3: '\\\"'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:802:3: ( '\\'' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:803:3: '\\''
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:807:3: ( ( 'print' | 'imprimir' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:808:3: ( 'print' | 'imprimir' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:808:3: ( 'print' | 'imprimir' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='p') ) {
                alt11=1;
            }
            else if ( (LA11_0=='i') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:808:4: 'print'
                    {
                    match("print"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:808:14: 'imprimir'
                    {
                    match("imprimir"); 



                    }
                    break;

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:812:3: ( ( 'println' | 'imprimirln' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:813:3: ( 'println' | 'imprimirln' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:813:3: ( 'println' | 'imprimirln' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='p') ) {
                alt12=1;
            }
            else if ( (LA12_0=='i') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:813:4: 'println'
                    {
                    match("println"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:813:16: 'imprimirln'
                    {
                    match("imprimirln"); 



                    }
                    break;

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:817:3: ( ( 'read' | 'leer' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:818:3: ( 'read' | 'leer' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:818:3: ( 'read' | 'leer' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='r') ) {
                alt13=1;
            }
            else if ( (LA13_0=='l') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:818:4: 'read'
                    {
                    match("read"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:818:13: 'leer'
                    {
                    match("leer"); 



                    }
                    break;

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

    // $ANTLR start "PUSH"
    public final void mPUSH() throws RecognitionException {
        try {
            int _type = PUSH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:820:5: ( ( 'push' | 'insertar' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:821:3: ( 'push' | 'insertar' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:821:3: ( 'push' | 'insertar' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='p') ) {
                alt14=1;
            }
            else if ( (LA14_0=='i') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:821:4: 'push'
                    {
                    match("push"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:821:13: 'insertar'
                    {
                    match("insertar"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUSH"

    // $ANTLR start "SIZE"
    public final void mSIZE() throws RecognitionException {
        try {
            int _type = SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:824:5: ( ( 'size' | 'tamano' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:825:3: ( 'size' | 'tamano' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:825:3: ( 'size' | 'tamano' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='s') ) {
                alt15=1;
            }
            else if ( (LA15_0=='t') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:825:4: 'size'
                    {
                    match("size"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:825:13: 'tamano'
                    {
                    match("tamano"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZE"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:827:4: ( ( 'set' | 'fijar' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:828:3: ( 'set' | 'fijar' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:828:3: ( 'set' | 'fijar' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='s') ) {
                alt16=1;
            }
            else if ( (LA16_0=='f') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:828:4: 'set'
                    {
                    match("set"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:828:12: 'fijar'
                    {
                    match("fijar"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:830:7: ( ( 'return' | 'devolver' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:831:3: ( 'return' | 'devolver' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:831:3: ( 'return' | 'devolver' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='r') ) {
                alt17=1;
            }
            else if ( (LA17_0=='d') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:831:4: 'return'
                    {
                    match("return"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:831:15: 'devolver'
                    {
                    match("devolver"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "NOMBRE"
    public final void mNOMBRE() throws RecognitionException {
        try {
            int _type = NOMBRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:835:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:836:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:836:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:837:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:841:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '1' .. '9' ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '1' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:
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
            	    break loop18;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:853:3: ( COMILLASD ( . )* COMILLASD )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:854:3: COMILLASD ( . )* COMILLASD
            {
            mCOMILLASD(); 


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:854:13: ( . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\"') ) {
                    alt19=2;
                }
                else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '!')||(LA19_0 >= '#' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:854:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:859:3: ( '/*' ( . )+ '*/' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:860:3: '/*' ( . )+ '*/'
            {
            match("/*"); 



            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:860:8: ( . )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1 >= '\u0000' && LA20_1 <= '.')||(LA20_1 >= '0' && LA20_1 <= '\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0 >= '\u0000' && LA20_0 <= ')')||(LA20_0 >= '+' && LA20_0 <= '\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:860:9: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:868:4: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:868:6: ( ' ' | '\\t' )+
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:868:6: ( ' ' | '\\t' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\t'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:871:8: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:871:10: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:871:10: ( '\\r' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:871:10: '\\r'
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
        // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | TOKEN | IF | PC | ASIGNACION | WHILE | FOR | ELSE | VARIABLE | LIST | FUNCTION | ELSEIF | DOBLE | NUMERO | BOOLEAN | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | PUSH | SIZE | SET | RETURN | NOMBRE | TEXTO | COMENTARIO | WS | NEWLINE )
        int alt23=56;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:10: T__36
                {
                mT__36(); 


                }
                break;
            case 2 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:16: T__37
                {
                mT__37(); 


                }
                break;
            case 3 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:22: T__38
                {
                mT__38(); 


                }
                break;
            case 4 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:28: T__39
                {
                mT__39(); 


                }
                break;
            case 5 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:34: T__40
                {
                mT__40(); 


                }
                break;
            case 6 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:40: T__41
                {
                mT__41(); 


                }
                break;
            case 7 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:46: T__42
                {
                mT__42(); 


                }
                break;
            case 8 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:52: T__43
                {
                mT__43(); 


                }
                break;
            case 9 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:58: T__44
                {
                mT__44(); 


                }
                break;
            case 10 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:64: T__45
                {
                mT__45(); 


                }
                break;
            case 11 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:70: T__46
                {
                mT__46(); 


                }
                break;
            case 12 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:76: T__47
                {
                mT__47(); 


                }
                break;
            case 13 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:82: T__48
                {
                mT__48(); 


                }
                break;
            case 14 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:88: T__49
                {
                mT__49(); 


                }
                break;
            case 15 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:94: T__50
                {
                mT__50(); 


                }
                break;
            case 16 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:100: T__51
                {
                mT__51(); 


                }
                break;
            case 17 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:106: T__52
                {
                mT__52(); 


                }
                break;
            case 18 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:112: T__53
                {
                mT__53(); 


                }
                break;
            case 19 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:118: T__54
                {
                mT__54(); 


                }
                break;
            case 20 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:124: T__55
                {
                mT__55(); 


                }
                break;
            case 21 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:130: T__56
                {
                mT__56(); 


                }
                break;
            case 22 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:136: T__57
                {
                mT__57(); 


                }
                break;
            case 23 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:142: T__58
                {
                mT__58(); 


                }
                break;
            case 24 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:148: T__59
                {
                mT__59(); 


                }
                break;
            case 25 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:154: TOKEN
                {
                mTOKEN(); 


                }
                break;
            case 26 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:160: IF
                {
                mIF(); 


                }
                break;
            case 27 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:163: PC
                {
                mPC(); 


                }
                break;
            case 28 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:166: ASIGNACION
                {
                mASIGNACION(); 


                }
                break;
            case 29 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:177: WHILE
                {
                mWHILE(); 


                }
                break;
            case 30 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:183: FOR
                {
                mFOR(); 


                }
                break;
            case 31 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:187: ELSE
                {
                mELSE(); 


                }
                break;
            case 32 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:192: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 33 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:201: LIST
                {
                mLIST(); 


                }
                break;
            case 34 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:206: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 35 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:215: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 36 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:222: DOBLE
                {
                mDOBLE(); 


                }
                break;
            case 37 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:228: NUMERO
                {
                mNUMERO(); 


                }
                break;
            case 38 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:235: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 39 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:243: PARENTESIS_D
                {
                mPARENTESIS_D(); 


                }
                break;
            case 40 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:256: PARENTESIS_I
                {
                mPARENTESIS_I(); 


                }
                break;
            case 41 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:269: LLAVE_D
                {
                mLLAVE_D(); 


                }
                break;
            case 42 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:277: LLAVE_I
                {
                mLLAVE_I(); 


                }
                break;
            case 43 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:285: COMILLASD
                {
                mCOMILLASD(); 


                }
                break;
            case 44 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:295: COMILLASS
                {
                mCOMILLASS(); 


                }
                break;
            case 45 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:305: PRINT
                {
                mPRINT(); 


                }
                break;
            case 46 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:311: PRINTLN
                {
                mPRINTLN(); 


                }
                break;
            case 47 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:319: READ
                {
                mREAD(); 


                }
                break;
            case 48 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:324: PUSH
                {
                mPUSH(); 


                }
                break;
            case 49 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:329: SIZE
                {
                mSIZE(); 


                }
                break;
            case 50 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:334: SET
                {
                mSET(); 


                }
                break;
            case 51 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:338: RETURN
                {
                mRETURN(); 


                }
                break;
            case 52 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:345: NOMBRE
                {
                mNOMBRE(); 


                }
                break;
            case 53 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:352: TEXTO
                {
                mTEXTO(); 


                }
                break;
            case 54 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:358: COMENTARIO
                {
                mCOMENTARIO(); 


                }
                break;
            case 55 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:369: WS
                {
                mWS(); 


                }
                break;
            case 56 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:372: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\4\uffff\1\54\1\uffff\1\57\1\uffff\1\62\1\65\1\67\1\71\1\73\1\75"+
        "\3\uffff\2\50\1\uffff\10\50\1\123\4\50\3\uffff\1\134\1\uffff\2\50"+
        "\26\uffff\1\50\1\141\22\50\2\uffff\10\50\2\uffff\3\50\1\uffff\4"+
        "\50\1\u0085\7\50\1\uffff\1\50\1\u008f\1\u0090\16\50\1\u009f\4\50"+
        "\1\uffff\3\50\1\u0085\1\50\1\u00aa\1\u00ac\1\uffff\1\u00ae\2\uffff"+
        "\1\50\1\u00b1\1\u00b2\1\u00b3\3\50\2\u00b3\2\50\1\u00b2\2\50\1\uffff"+
        "\2\50\1\u00bf\3\50\2\u00b3\1\u008f\1\u00c4\3\uffff\1\u00ac\1\uffff"+
        "\1\50\1\u00b1\3\uffff\1\50\4\u00b3\6\50\1\uffff\4\50\1\uffff\1\50"+
        "\1\u00ae\2\50\1\u00d4\5\50\1\u00da\1\u00db\3\50\1\uffff\1\50\1\u00c4"+
        "\1\u00aa\1\u00bf\1\u00da\2\uffff\3\50\1\u00d4\1\50\3\u00b3\1\u00db";
    static final String DFA23_eofS =
        "\u00e5\uffff";
    static final String DFA23_minS =
        "\1\11\3\uffff\1\51\1\uffff\1\53\1\uffff\1\55\1\147\1\52\3\75\3\uffff"+
        "\1\157\1\146\1\uffff\1\150\1\151\2\141\1\154\1\145\1\141\1\145\1"+
        "\56\1\141\1\101\1\122\1\105\3\uffff\1\0\1\uffff\2\145\26\uffff\1"+
        "\154\1\61\1\160\1\163\1\151\1\145\1\162\1\156\1\154\1\152\1\162"+
        "\1\151\2\163\1\137\1\164\2\162\1\163\1\145\2\uffff\1\165\1\155\1"+
        "\114\1\154\1\125\1\165\1\122\1\162\2\uffff\1\141\1\166\1\141\1\uffff"+
        "\1\162\1\145\1\154\1\156\1\61\1\143\1\163\2\141\1\156\1\150\1\145"+
        "\1\156\1\145\2\61\1\144\1\164\1\162\1\145\1\141\1\123\1\163\1\105"+
        "\1\145\1\104\2\144\1\165\1\157\1\61\1\151\1\162\1\145\1\164\1\uffff"+
        "\1\151\1\145\1\162\1\61\1\164\1\61\1\40\1\157\1\61\2\uffff\1\141"+
        "\3\61\1\156\1\105\1\145\2\61\1\101\1\141\1\61\1\162\1\154\1\uffff"+
        "\1\155\1\164\1\61\1\162\1\151\1\157\4\61\3\uffff\1\40\1\uffff\1"+
        "\144\1\61\3\uffff\1\157\4\61\1\104\1\144\1\156\1\166\1\151\1\141"+
        "\1\uffff\1\141\1\157\2\156\1\uffff\1\145\1\61\1\105\1\145\1\61\1"+
        "\145\2\162\1\163\1\156\2\61\1\162\1\122\1\162\1\uffff\1\162\4\61"+
        "\2\uffff\1\157\1\117\1\157\1\61\1\156\4\61";
    static final String DFA23_maxS =
        "\1\175\3\uffff\1\51\1\uffff\1\75\1\uffff\1\75\1\163\1\52\3\75\3"+
        "\uffff\1\157\1\156\1\uffff\1\150\1\151\2\165\1\154\1\151\1\145\1"+
        "\151\1\71\1\162\1\141\1\162\1\145\3\uffff\1\uffff\1\uffff\2\145"+
        "\26\uffff\1\154\1\172\1\160\1\163\1\151\1\145\1\162\1\156\1\154"+
        "\1\152\1\162\1\151\2\163\1\172\1\164\2\162\1\163\1\145\2\uffff\1"+
        "\165\1\155\1\114\1\154\1\125\1\165\1\122\1\162\2\uffff\1\164\1\166"+
        "\1\141\1\uffff\1\162\1\145\1\154\1\156\1\172\1\143\1\163\2\141\1"+
        "\156\1\150\1\145\1\156\1\145\2\172\1\144\1\164\1\162\1\145\1\141"+
        "\1\123\1\163\1\105\1\145\1\104\2\144\1\165\1\157\1\172\1\151\1\162"+
        "\1\145\1\164\1\uffff\1\164\1\157\1\162\1\172\1\164\2\172\1\157\1"+
        "\172\2\uffff\1\141\3\172\1\156\1\117\1\157\2\172\1\101\1\141\1\172"+
        "\1\162\1\154\1\uffff\1\155\1\164\1\172\1\162\1\151\1\157\4\172\3"+
        "\uffff\1\40\1\uffff\1\144\1\172\3\uffff\1\157\4\172\1\104\1\144"+
        "\1\156\1\166\1\151\1\141\1\uffff\1\141\1\157\2\156\1\uffff\1\145"+
        "\1\172\1\105\1\145\1\172\1\145\2\162\1\163\1\156\2\172\1\162\1\122"+
        "\1\162\1\uffff\1\162\4\172\2\uffff\1\157\1\117\1\157\1\172\1\156"+
        "\4\172";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\11\6\uffff\1\26\1\27"+
        "\1\30\2\uffff\1\33\15\uffff\1\47\1\51\1\52\1\uffff\1\54\2\uffff"+
        "\1\64\1\67\1\70\1\4\1\50\1\7\1\10\1\6\1\13\1\14\1\12\1\16\1\17\1"+
        "\15\1\66\1\20\1\22\1\21\1\23\1\34\1\25\1\24\24\uffff\1\44\1\45\10"+
        "\uffff\1\53\1\65\3\uffff\1\32\43\uffff\1\36\11\uffff\1\62\1\40\16"+
        "\uffff\1\31\12\uffff\1\60\1\43\1\37\1\uffff\1\61\2\uffff\1\41\1"+
        "\57\1\46\13\uffff\1\35\4\uffff\1\55\17\uffff\1\63\5\uffff\1\42\1"+
        "\56\11\uffff";
    static final String DFA23_specialS =
        "\44\uffff\1\0\u00c0\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\51\1\52\2\uffff\1\52\22\uffff\1\51\1\1\1\44\2\uffff\1\2\1"+
            "\3\1\45\1\4\1\41\1\5\1\6\1\7\1\10\1\11\1\12\12\34\1\uffff\1"+
            "\23\1\13\1\14\1\15\2\uffff\5\50\1\36\15\50\1\37\1\50\1\40\4"+
            "\50\1\16\1\uffff\1\17\3\uffff\3\50\1\47\1\30\1\26\1\50\1\21"+
            "\1\22\2\50\1\33\1\25\2\50\1\27\1\50\1\46\1\31\1\35\1\50\1\32"+
            "\1\24\3\50\1\43\1\20\1\42",
            "",
            "",
            "",
            "\1\53",
            "",
            "\1\55\21\uffff\1\56",
            "",
            "\1\60\17\uffff\1\61",
            "\1\63\13\uffff\1\64",
            "\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "",
            "",
            "",
            "\1\76",
            "\1\77\6\uffff\1\100\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\106\7\uffff\1\107\5\uffff\1\104\5\uffff\1\105",
            "\1\110\20\uffff\1\111\2\uffff\1\112",
            "\1\113",
            "\1\115\3\uffff\1\114",
            "\1\116\3\uffff\1\117",
            "\1\121\3\uffff\1\120",
            "\1\122\1\uffff\12\34",
            "\1\125\20\uffff\1\124",
            "\1\126\37\uffff\1\127",
            "\1\130\37\uffff\1\131",
            "\1\132\37\uffff\1\133",
            "",
            "",
            "",
            "\0\135",
            "",
            "\1\136",
            "\1\137",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\140",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156\32\uffff\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\175\22\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a5\12\uffff\1\u00a4",
            "\1\u00a6\11\uffff\1\u00a7",
            "\1\u00a8",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00a9",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00ab\20\uffff\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00ad",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "",
            "",
            "\1\u00af",
            "\11\50\7\uffff\32\50\6\uffff\1\u00b0\31\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00b4",
            "\1\u00b5\11\uffff\1\u00b6",
            "\1\u00b7\11\uffff\1\u00b8",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00b9",
            "\1\u00ba",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\13\50\1\u00c3\16\50",
            "",
            "",
            "",
            "\1\u00ab",
            "",
            "\1\u00c5",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "",
            "",
            "",
            "\1\u00c6",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00d2",
            "\1\u00d3",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\11\50\7\uffff\32\50\6\uffff\13\50\1\u00e0\16\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\1\u00e4",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50",
            "\11\50\7\uffff\32\50\6\uffff\32\50"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | TOKEN | IF | PC | ASIGNACION | WHILE | FOR | ELSE | VARIABLE | LIST | FUNCTION | ELSEIF | DOBLE | NUMERO | BOOLEAN | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | PUSH | SIZE | SET | RETURN | NOMBRE | TEXTO | COMENTARIO | WS | NEWLINE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_36 = input.LA(1);

                        s = -1;
                        if ( ((LA23_36 >= '\u0000' && LA23_36 <= '\uFFFF')) ) {s = 93;}

                        else s = 92;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}