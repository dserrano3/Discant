// $ANTLR 3.4 C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g 2014-09-26 21:47:35

package interpreter.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LenguajeLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int NOMBRE=18;
    public static final int NUMERO=19;
    public static final int PARENTESIS_D=20;
    public static final int PARENTESIS_I=21;
    public static final int PC=22;
    public static final int PRINT=23;
    public static final int PRINTLN=24;
    public static final int PUSH=25;
    public static final int READ=26;
    public static final int RETURN=27;
    public static final int SET=28;
    public static final int TEXTO=29;
    public static final int TOKEN=30;
    public static final int VARIABLE=31;
    public static final int WHILE=32;
    public static final int WS=33;
    public static final int WSOPT=34;

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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:26:7: ( '.tamano' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:26:9: '.tamano'
            {
            match(".tamano"); 



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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:27:7: ( '/' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:27:9: '/'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:28:7: ( '<' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:28:9: '<'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:29:7: ( '<=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:29:9: '<='
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:30:7: ( '==' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:30:9: '=='
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:31:7: ( '>' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:31:9: '>'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:32:7: ( '>=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:32:9: '>='
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:33:7: ( '[' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:33:9: '['
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:34:7: ( ']' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:34:9: ']'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:35:7: ( '||' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:35:9: '||'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:700:3: ( 'hola' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:701:3: 'hola'
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

    // $ANTLR start "PC"
    public final void mPC() throws RecognitionException {
        try {
            int _type = PC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:710:3: ( ( ( ';' )? ( '\\r' )? ( '\\n' )+ ) | ';' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==';') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\n'||LA4_1=='\r') ) {
                    alt4=1;
                }
                else {
                    alt4=2;
                }
            }
            else if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:3: ( ( ';' )? ( '\\r' )? ( '\\n' )+ )
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:3: ( ( ';' )? ( '\\r' )? ( '\\n' )+ )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:4: ( ';' )? ( '\\r' )? ( '\\n' )+
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:4: ( ';' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==';') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:4: ';'
                            {
                            match(';'); 

                            }
                            break;

                    }


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:9: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:9: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:15: ( '\\n' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\n') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:16: '\\n'
                    	    {
                    	    match('\n'); 

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
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:711:26: ';'
                    {
                    match(';'); 

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
    // $ANTLR end "PC"

    // $ANTLR start "COMENTARIO"
    public final void mCOMENTARIO() throws RecognitionException {
        try {
            int _type = COMENTARIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:717:3: ( ( ( '/*' ( . )* '*/' ) ( PC )? ) | ( ( '//' ( . )* ) PC ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='*') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='/') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:3: ( ( '/*' ( . )* '*/' ) ( PC )? )
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:3: ( ( '/*' ( . )* '*/' ) ( PC )? )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:4: ( '/*' ( . )* '*/' ) ( PC )?
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:4: ( '/*' ( . )* '*/' )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:5: '/*' ( . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:10: ( . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:11: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    }


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:21: ( PC )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\n'||LA6_0=='\r'||LA6_0==';') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:21: PC
                            {
                            mPC(); 


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:28: ( ( '//' ( . )* ) PC )
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:28: ( ( '//' ( . )* ) PC )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:29: ( '//' ( . )* ) PC
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:29: ( '//' ( . )* )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:30: '//' ( . )*
                    {
                    match("//"); 



                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:35: ( . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==';') ) {
                            alt7=2;
                        }
                        else if ( (LA7_0=='\r') ) {
                            alt7=2;
                        }
                        else if ( (LA7_0=='\n') ) {
                            alt7=2;
                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= ':')||(LA7_0 >= '<' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:718:36: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    mPC(); 


                    }


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
    // $ANTLR end "COMENTARIO"

    // $ANTLR start "ASIGNACION"
    public final void mASIGNACION() throws RecognitionException {
        try {
            int _type = ASIGNACION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:737:3: ( '=' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:738:3: '='
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:742:3: ( 'while' | 'mientras' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='w') ) {
                alt9=1;
            }
            else if ( (LA9_0=='m') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:743:3: 'while'
                    {
                    match("while"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:743:13: 'mientras'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:747:3: ( 'for' | 'para' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='f') ) {
                alt10=1;
            }
            else if ( (LA10_0=='p') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:748:3: 'for'
                    {
                    match("for"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:748:11: 'para'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:752:3: ( 'else' | 'si_no' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='e') ) {
                alt11=1;
            }
            else if ( (LA11_0=='s') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:753:3: 'else'
                    {
                    match("else"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:753:12: 'si_no'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:755:9: ( 'var' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:756:3: 'var'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:758:5: ( 'list' | 'lista' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='l') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='i') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='s') ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3=='t') ) {
                            int LA12_4 = input.LA(5);

                            if ( (LA12_4=='a') ) {
                                alt12=2;
                            }
                            else {
                                alt12=1;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:759:4: 'list'
                    {
                    match("list"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:759:13: 'lista'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:762:3: ( 'function' | 'funcion' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='f') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='u') ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2=='n') ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3=='c') ) {
                            int LA13_4 = input.LA(5);

                            if ( (LA13_4=='t') ) {
                                alt13=1;
                            }
                            else if ( (LA13_4=='i') ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:763:3: 'function'
                    {
                    match("function"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:763:16: 'funcion'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:767:3: ( 'else if' | 'si_no si' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='e') ) {
                alt14=1;
            }
            else if ( (LA14_0=='s') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:768:3: 'else if'
                    {
                    match("else if"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:768:15: 'si_no si'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:772:3: ( ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:773:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:773:3: ( ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:773:5: ( '0' .. '9' )+ ( '.' ) ( '0' .. '9' )+
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:773:5: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:773:16: ( '.' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:773:17: '.'
            {
            match('.'); 

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:773:22: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:779:3: ( ( ( '0' .. '9' )+ ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:780:3: ( ( '0' .. '9' )+ )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:780:3: ( ( '0' .. '9' )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:780:5: ( '0' .. '9' )+
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:780:5: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:784:3: ( 'true' | 'false' | 'FALSE' | 'TRUE' | 'True' | 'False' | 'verdadero' | 'falso' | 'FALSO' | 'VERDADERO' | 'Verdadero' | 'Falso' )
            int alt18=12;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt18=1;
                }
                break;
            case 'f':
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2=='a') ) {
                    int LA18_7 = input.LA(3);

                    if ( (LA18_7=='l') ) {
                        int LA18_14 = input.LA(4);

                        if ( (LA18_14=='s') ) {
                            int LA18_17 = input.LA(5);

                            if ( (LA18_17=='e') ) {
                                alt18=2;
                            }
                            else if ( (LA18_17=='o') ) {
                                alt18=8;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 17, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'F':
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3=='A') ) {
                    int LA18_8 = input.LA(3);

                    if ( (LA18_8=='L') ) {
                        int LA18_15 = input.LA(4);

                        if ( (LA18_15=='S') ) {
                            int LA18_18 = input.LA(5);

                            if ( (LA18_18=='E') ) {
                                alt18=3;
                            }
                            else if ( (LA18_18=='O') ) {
                                alt18=9;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 18, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 15, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 8, input);

                        throw nvae;

                    }
                }
                else if ( (LA18_3=='a') ) {
                    int LA18_9 = input.LA(3);

                    if ( (LA18_9=='l') ) {
                        int LA18_16 = input.LA(4);

                        if ( (LA18_16=='s') ) {
                            int LA18_19 = input.LA(5);

                            if ( (LA18_19=='e') ) {
                                alt18=6;
                            }
                            else if ( (LA18_19=='o') ) {
                                alt18=12;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'T':
                {
                int LA18_4 = input.LA(2);

                if ( (LA18_4=='R') ) {
                    alt18=4;
                }
                else if ( (LA18_4=='r') ) {
                    alt18=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'v':
                {
                alt18=7;
                }
                break;
            case 'V':
                {
                int LA18_6 = input.LA(2);

                if ( (LA18_6=='E') ) {
                    alt18=10;
                }
                else if ( (LA18_6=='e') ) {
                    alt18=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:785:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:785:13: 'false'
                    {
                    match("false"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:785:23: 'FALSE'
                    {
                    match("FALSE"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:785:33: 'TRUE'
                    {
                    match("TRUE"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:785:42: 'True'
                    {
                    match("True"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:785:51: 'False'
                    {
                    match("False"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:786:4: 'verdadero'
                    {
                    match("verdadero"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:786:18: 'falso'
                    {
                    match("falso"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:786:28: 'FALSO'
                    {
                    match("FALSO"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:786:38: 'VERDADERO'
                    {
                    match("VERDADERO"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:786:52: 'Verdadero'
                    {
                    match("Verdadero"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:786:66: 'Falso'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:795:3: ( ')' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:796:3: ')'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:805:3: ( '(' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:806:3: '('
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:815:3: ( '}' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:816:3: '}'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:820:3: ( '{' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:821:3: '{'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:825:3: ( '\\\"' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:826:3: '\\\"'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:830:3: ( '\\'' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:831:3: '\\''
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:835:3: ( ( 'print' | 'imprimir' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:836:3: ( 'print' | 'imprimir' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:836:3: ( 'print' | 'imprimir' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='p') ) {
                alt19=1;
            }
            else if ( (LA19_0=='i') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:836:4: 'print'
                    {
                    match("print"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:836:14: 'imprimir'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:840:3: ( ( 'println' | 'imprimirln' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:841:3: ( 'println' | 'imprimirln' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:841:3: ( 'println' | 'imprimirln' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='p') ) {
                alt20=1;
            }
            else if ( (LA20_0=='i') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:841:4: 'println'
                    {
                    match("println"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:841:16: 'imprimirln'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:845:3: ( ( 'read' | 'leer' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:846:3: ( 'read' | 'leer' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:846:3: ( 'read' | 'leer' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='r') ) {
                alt21=1;
            }
            else if ( (LA21_0=='l') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:846:4: 'read'
                    {
                    match("read"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:846:13: 'leer'
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:848:5: ( ( 'push' | 'insertar' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:849:3: ( 'push' | 'insertar' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:849:3: ( 'push' | 'insertar' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='p') ) {
                alt22=1;
            }
            else if ( (LA22_0=='i') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:849:4: 'push'
                    {
                    match("push"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:849:13: 'insertar'
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

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:855:4: ( ( '.set' | '.fijar' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:856:3: ( '.set' | '.fijar' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:856:3: ( '.set' | '.fijar' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='.') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='s') ) {
                    alt23=1;
                }
                else if ( (LA23_1=='f') ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:856:4: '.set'
                    {
                    match(".set"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:856:13: '.fijar'
                    {
                    match(".fijar"); 



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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:858:7: ( ( 'return' | 'devolver' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:859:3: ( 'return' | 'devolver' )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:859:3: ( 'return' | 'devolver' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='r') ) {
                alt24=1;
            }
            else if ( (LA24_0=='d') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:859:4: 'return'
                    {
                    match("return"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:859:15: 'devolver'
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

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:861:3: ( 'if' | 'si' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='i') ) {
                alt25=1;
            }
            else if ( (LA25_0=='s') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:862:3: 'if'
                    {
                    match("if"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:862:10: 'si'
                    {
                    match("si"); 



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
    // $ANTLR end "IF"

    // $ANTLR start "NOMBRE"
    public final void mNOMBRE() throws RecognitionException {
        try {
            int _type = NOMBRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:866:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | ( '1' .. '9' ) )* ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:867:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | ( '1' .. '9' ) )* )
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:867:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | ( '1' .. '9' ) )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:868:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | ( '1' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:872:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | ( '1' .. '9' ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= '1' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:
            	    {
            	    if ( (input.LA(1) >= '1' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop26;
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:884:3: ( COMILLASD ( . )* COMILLASD )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:885:3: COMILLASD ( . )* COMILLASD
            {
            mCOMILLASD(); 


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:885:13: ( . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\"') ) {
                    alt27=2;
                }
                else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '!')||(LA27_0 >= '#' && LA27_0 <= '\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:885:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:897:4: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:897:6: ( ' ' | '\\t' )+
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:897:6: ( ' ' | '\\t' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='\t'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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

    // $ANTLR start "WSOPT"
    public final void mWSOPT() throws RecognitionException {
        try {
            int _type = WSOPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:898:9: ( ( ' ' )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:898:17: ( ' ' )*
            {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:898:17: ( ' ' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==' ') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:898:18: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WSOPT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | TOKEN | PC | COMENTARIO | ASIGNACION | WHILE | FOR | ELSE | VARIABLE | LIST | FUNCTION | ELSEIF | DOBLE | NUMERO | BOOLEAN | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | PUSH | SET | RETURN | IF | NOMBRE | TEXTO | WS | WSOPT )
        int alt30=56;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:10: T__35
                {
                mT__35(); 


                }
                break;
            case 2 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:16: T__36
                {
                mT__36(); 


                }
                break;
            case 3 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:22: T__37
                {
                mT__37(); 


                }
                break;
            case 4 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:28: T__38
                {
                mT__38(); 


                }
                break;
            case 5 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:34: T__39
                {
                mT__39(); 


                }
                break;
            case 6 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:40: T__40
                {
                mT__40(); 


                }
                break;
            case 7 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:46: T__41
                {
                mT__41(); 


                }
                break;
            case 8 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:52: T__42
                {
                mT__42(); 


                }
                break;
            case 9 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:58: T__43
                {
                mT__43(); 


                }
                break;
            case 10 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:64: T__44
                {
                mT__44(); 


                }
                break;
            case 11 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:70: T__45
                {
                mT__45(); 


                }
                break;
            case 12 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:76: T__46
                {
                mT__46(); 


                }
                break;
            case 13 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:82: T__47
                {
                mT__47(); 


                }
                break;
            case 14 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:88: T__48
                {
                mT__48(); 


                }
                break;
            case 15 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:94: T__49
                {
                mT__49(); 


                }
                break;
            case 16 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:100: T__50
                {
                mT__50(); 


                }
                break;
            case 17 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:106: T__51
                {
                mT__51(); 


                }
                break;
            case 18 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:112: T__52
                {
                mT__52(); 


                }
                break;
            case 19 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:118: T__53
                {
                mT__53(); 


                }
                break;
            case 20 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:124: T__54
                {
                mT__54(); 


                }
                break;
            case 21 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:130: T__55
                {
                mT__55(); 


                }
                break;
            case 22 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:136: T__56
                {
                mT__56(); 


                }
                break;
            case 23 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:142: T__57
                {
                mT__57(); 


                }
                break;
            case 24 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:148: T__58
                {
                mT__58(); 


                }
                break;
            case 25 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:154: T__59
                {
                mT__59(); 


                }
                break;
            case 26 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:160: TOKEN
                {
                mTOKEN(); 


                }
                break;
            case 27 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:166: PC
                {
                mPC(); 


                }
                break;
            case 28 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:169: COMENTARIO
                {
                mCOMENTARIO(); 


                }
                break;
            case 29 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:180: ASIGNACION
                {
                mASIGNACION(); 


                }
                break;
            case 30 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:191: WHILE
                {
                mWHILE(); 


                }
                break;
            case 31 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:197: FOR
                {
                mFOR(); 


                }
                break;
            case 32 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:201: ELSE
                {
                mELSE(); 


                }
                break;
            case 33 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:206: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 34 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:215: LIST
                {
                mLIST(); 


                }
                break;
            case 35 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:220: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 36 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:229: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 37 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:236: DOBLE
                {
                mDOBLE(); 


                }
                break;
            case 38 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:242: NUMERO
                {
                mNUMERO(); 


                }
                break;
            case 39 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:249: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 40 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:257: PARENTESIS_D
                {
                mPARENTESIS_D(); 


                }
                break;
            case 41 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:270: PARENTESIS_I
                {
                mPARENTESIS_I(); 


                }
                break;
            case 42 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:283: LLAVE_D
                {
                mLLAVE_D(); 


                }
                break;
            case 43 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:291: LLAVE_I
                {
                mLLAVE_I(); 


                }
                break;
            case 44 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:299: COMILLASD
                {
                mCOMILLASD(); 


                }
                break;
            case 45 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:309: COMILLASS
                {
                mCOMILLASS(); 


                }
                break;
            case 46 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:319: PRINT
                {
                mPRINT(); 


                }
                break;
            case 47 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:325: PRINTLN
                {
                mPRINTLN(); 


                }
                break;
            case 48 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:333: READ
                {
                mREAD(); 


                }
                break;
            case 49 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:338: PUSH
                {
                mPUSH(); 


                }
                break;
            case 50 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:343: SET
                {
                mSET(); 


                }
                break;
            case 51 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:347: RETURN
                {
                mRETURN(); 


                }
                break;
            case 52 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:354: IF
                {
                mIF(); 


                }
                break;
            case 53 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:357: NOMBRE
                {
                mNOMBRE(); 


                }
                break;
            case 54 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:364: TEXTO
                {
                mTEXTO(); 


                }
                break;
            case 55 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:370: WS
                {
                mWS(); 


                }
                break;
            case 56 :
                // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\target\\classes\\Lenguaje.g:1:373: WSOPT
                {
                mWSOPT(); 


                }
                break;

        }

    }


    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA30_eotS =
        "\1\53\3\uffff\1\55\1\uffff\1\60\1\uffff\1\63\1\70\1\72\1\74\1\76"+
        "\1\100\3\uffff\1\50\1\uffff\10\50\1\121\4\50\3\uffff\1\131\1\uffff"+
        "\3\50\1\uffff\1\52\27\uffff\12\50\1\154\4\50\2\uffff\7\50\2\uffff"+
        "\2\50\1\154\2\50\1\uffff\3\50\1\u0080\7\50\1\uffff\1\u0088\17\50"+
        "\1\u0098\2\50\1\uffff\2\50\1\u0080\1\50\1\u00a0\1\u00a2\1\50\1\uffff"+
        "\1\50\1\u00a6\1\u00a7\1\u00a8\2\50\2\u00a8\4\50\1\u00a7\2\50\1\uffff"+
        "\1\u00b3\3\50\2\u00a8\1\u00b8\3\uffff\1\u00a2\1\50\1\u00a6\3\uffff"+
        "\4\u00a8\6\50\1\uffff\4\50\1\uffff\5\50\1\u00c9\3\50\1\u00cd\1\u00ce"+
        "\5\50\1\uffff\1\50\1\u00b3\1\u00cd\2\uffff\3\50\1\u00b8\1\u00a0"+
        "\1\u00c9\3\u00a8\1\50\1\u00ce";
    static final String DFA30_eofS =
        "\u00da\uffff";
    static final String DFA30_minS =
        "\1\11\3\uffff\1\51\1\uffff\1\53\1\uffff\1\55\1\146\1\52\3\75\3\uffff"+
        "\1\157\1\uffff\1\150\1\151\2\141\1\154\1\151\1\141\1\145\1\56\1"+
        "\162\1\101\1\122\1\105\3\uffff\1\0\1\uffff\1\146\2\145\1\uffff\1"+
        "\40\13\uffff\1\145\13\uffff\1\154\1\151\1\145\1\162\1\156\1\154"+
        "\1\162\1\151\2\163\1\61\2\162\1\163\1\145\2\uffff\1\165\1\114\1"+
        "\154\1\125\1\165\1\122\1\162\2\uffff\1\160\1\163\1\61\1\141\1\166"+
        "\1\uffff\1\141\1\154\1\156\1\61\1\143\1\163\1\141\1\156\1\150\1"+
        "\145\1\156\1\uffff\1\61\1\144\1\164\1\162\1\145\1\123\1\163\1\105"+
        "\1\145\1\104\1\144\1\162\1\145\1\144\1\165\1\157\1\61\1\145\1\164"+
        "\1\uffff\1\151\1\145\1\61\1\164\1\61\1\40\1\157\1\uffff\1\141\3"+
        "\61\1\105\1\145\2\61\1\101\1\141\1\151\1\162\1\61\1\162\1\154\1"+
        "\uffff\1\61\1\162\1\151\1\157\3\61\3\uffff\1\40\1\144\1\61\3\uffff"+
        "\4\61\1\104\1\144\1\155\1\164\1\156\1\166\1\uffff\1\141\1\157\2"+
        "\156\1\uffff\1\145\1\105\1\145\1\151\1\141\1\61\1\145\1\163\1\156"+
        "\2\61\1\162\1\122\3\162\1\uffff\1\162\2\61\2\uffff\1\157\1\117\1"+
        "\157\6\61\1\156\1\61";
    static final String DFA30_maxS =
        "\1\175\3\uffff\1\51\1\uffff\1\75\1\uffff\1\75\1\164\1\57\3\75\3"+
        "\uffff\1\157\1\uffff\1\150\1\151\2\165\1\154\1\151\1\145\1\151\1"+
        "\71\1\162\1\141\1\162\1\145\3\uffff\1\uffff\1\uffff\1\156\2\145"+
        "\1\uffff\1\40\13\uffff\1\151\13\uffff\1\154\1\151\1\145\1\162\1"+
        "\156\1\154\1\162\1\151\2\163\1\172\2\162\1\163\1\145\2\uffff\1\165"+
        "\1\114\1\154\1\125\1\165\1\122\1\162\2\uffff\1\160\1\163\1\172\1"+
        "\164\1\166\1\uffff\1\141\1\154\1\156\1\172\1\143\1\163\1\141\1\156"+
        "\1\150\1\145\1\156\1\uffff\1\172\1\144\1\164\1\162\1\145\1\123\1"+
        "\163\1\105\1\145\1\104\1\144\1\162\1\145\1\144\1\165\1\157\1\172"+
        "\1\145\1\164\1\uffff\1\164\1\157\1\172\1\164\2\172\1\157\1\uffff"+
        "\1\141\3\172\1\117\1\157\2\172\1\101\1\141\1\151\1\162\1\172\1\162"+
        "\1\154\1\uffff\1\172\1\162\1\151\1\157\3\172\3\uffff\1\172\1\144"+
        "\1\172\3\uffff\4\172\1\104\1\144\1\155\1\164\1\156\1\166\1\uffff"+
        "\1\141\1\157\2\156\1\uffff\1\145\1\105\1\145\1\151\1\141\1\172\1"+
        "\145\1\163\1\156\2\172\1\162\1\122\3\162\1\uffff\1\162\2\172\2\uffff"+
        "\1\157\1\117\1\157\6\172\1\156\1\172";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\11\6\uffff\1\27\1\30"+
        "\1\31\1\uffff\1\33\15\uffff\1\50\1\52\1\53\1\uffff\1\55\3\uffff"+
        "\1\65\1\uffff\1\67\1\70\1\4\1\51\1\7\1\10\1\6\1\13\1\14\1\12\1\16"+
        "\1\uffff\1\20\1\62\1\15\1\34\1\21\1\23\1\22\1\24\1\35\1\26\1\25"+
        "\17\uffff\1\45\1\46\7\uffff\1\54\1\66\5\uffff\1\17\13\uffff\1\64"+
        "\23\uffff\1\37\7\uffff\1\41\17\uffff\1\32\7\uffff\1\61\1\44\1\40"+
        "\3\uffff\1\42\1\60\1\47\12\uffff\1\36\4\uffff\1\56\20\uffff\1\63"+
        "\3\uffff\1\43\1\57\13\uffff";
    static final String DFA30_specialS =
        "\43\uffff\1\0\u00b6\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\52\1\22\2\uffff\1\22\22\uffff\1\51\1\1\1\43\2\uffff\1\2\1"+
            "\3\1\44\1\4\1\40\1\5\1\6\1\7\1\10\1\11\1\12\12\33\1\uffff\1"+
            "\22\1\13\1\14\1\15\2\uffff\5\50\1\35\15\50\1\36\1\50\1\37\4"+
            "\50\1\16\1\uffff\1\17\1\uffff\1\50\1\uffff\3\50\1\47\1\27\1"+
            "\25\1\50\1\21\1\45\2\50\1\32\1\24\2\50\1\26\1\50\1\46\1\30\1"+
            "\34\1\50\1\31\1\23\3\50\1\42\1\20\1\41",
            "",
            "",
            "",
            "\1\54",
            "",
            "\1\56\21\uffff\1\57",
            "",
            "\1\61\17\uffff\1\62",
            "\1\67\1\64\13\uffff\1\65\1\66",
            "\1\71\4\uffff\1\71",
            "\1\73",
            "\1\75",
            "\1\77",
            "",
            "",
            "",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\106\15\uffff\1\104\5\uffff\1\105",
            "\1\107\20\uffff\1\110\2\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\114\3\uffff\1\115",
            "\1\117\3\uffff\1\116",
            "\1\120\1\uffff\12\33",
            "\1\122",
            "\1\123\37\uffff\1\124",
            "\1\125\37\uffff\1\126",
            "\1\127\37\uffff\1\130",
            "",
            "",
            "",
            "\0\132",
            "",
            "\1\135\6\uffff\1\133\1\134",
            "\1\136",
            "\1\137",
            "",
            "\1\51",
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
            "\1\67\3\uffff\1\140",
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
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\11\50\7\uffff\32\50\4\uffff\1\153\1\uffff\32\50",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\170",
            "\1\171",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\172\22\uffff\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009c\12\uffff\1\u009b",
            "\1\u009d\11\uffff\1\u009e",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009f",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a1\20\uffff\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff"+
            "\32\50",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\u00a5\31\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a9\11\uffff\1\u00aa",
            "\1\u00ab\11\uffff\1\u00ac",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u00b7\16"+
            "\50",
            "",
            "",
            "",
            "\1\u00a1\20\uffff\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff"+
            "\32\50",
            "\1\u00b9",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u00d8\16"+
            "\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d9",
            "\11\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | TOKEN | PC | COMENTARIO | ASIGNACION | WHILE | FOR | ELSE | VARIABLE | LIST | FUNCTION | ELSEIF | DOBLE | NUMERO | BOOLEAN | PARENTESIS_D | PARENTESIS_I | LLAVE_D | LLAVE_I | COMILLASD | COMILLASS | PRINT | PRINTLN | READ | PUSH | SET | RETURN | IF | NOMBRE | TEXTO | WS | WSOPT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_35 = input.LA(1);

                        s = -1;
                        if ( ((LA30_35 >= '\u0000' && LA30_35 <= '\uFFFF')) ) {s = 90;}

                        else s = 89;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}