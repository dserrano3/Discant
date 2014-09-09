// $ANTLR 3.4 C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g 2014-09-08 22:51:09

package interpreter.antlr; 
import interpreter.*;
import evaluators.*;  


import conte.Context1; 
import conte.IntegerStatement;
import conte.Statement1;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.HashMap; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LenguajeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "BOOLEAN", "COMENTARIO", "COMILLASD", "COMILLASS", "DOBLE", "ELSE", "ELSEIF", "FOR", "FUNCTION", "IF", "LIST", "LLAVE_D", "LLAVE_I", "NEWLINE", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", "PC", "PRINT", "PRINTLN", "PUSH", "READ", "RETURN", "SET", "SIZE", "TEXTO", "TOKEN", "VARIABLE", "WHILE", "WS", "'!='", "'%'", "'&&'", "'()'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'.get('", "'.size'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'['", "']'", "'||'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LenguajeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LenguajeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LenguajeParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g"; }


    Context1 contexto = new Context1(); 
    boolean bandera = true;
    ArrayList<Context1> pila = new ArrayList<Context1>();
    public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();




    // $ANTLR start "programa"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:46:1: programa returns [StringBuilder output] : ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+ ;
    public final StringBuilder programa() throws Exception, RecognitionException {
        StringBuilder output = null;


        Evaluator print11 =null;

        Evaluator println2 =null;

        Evaluator asignacion3 =null;

        Evaluator ifstatement4 =null;

        Evaluator lectura5 =null;

        Evaluator whilestatemet6 =null;

        Evaluator llamadofuncion7 =null;

        Evaluator declaracion8 =null;

        Evaluator declaracion_lista9 =null;

        Evaluator push10 =null;

        Evaluator forstatemet11 =null;

        Evaluator asignacion_lista12 =null;

        Evaluator lista_texto13 =null;

        Evaluator size14 =null;

        Evaluator unincremento15 =null;

        Evaluator menosunincremento16 =null;

        Evaluator incremento17 =null;

        Evaluator decremento18 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:47:3: ( ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:49:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+
            {
             
               pila.add(new Context1()); 
               output = new StringBuilder();
              

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:53:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+
            int cnt1=0;
            loop1:
            do {
                int alt1=21;
                switch ( input.LA(1) ) {
                case PRINT:
                    {
                    alt1=1;
                    }
                    break;
                case PRINTLN:
                    {
                    alt1=2;
                    }
                    break;
                case NOMBRE:
                    {
                    switch ( input.LA(2) ) {
                    case ASIGNACION:
                        {
                        alt1=3;
                        }
                        break;
                    case 48:
                        {
                        int LA1_14 = input.LA(3);

                        if ( (LA1_14==PUSH) ) {
                            alt1=12;
                        }
                        else if ( (LA1_14==SIZE) ) {
                            alt1=16;
                        }


                        }
                        break;
                    case 42:
                        {
                        alt1=17;
                        }
                        break;
                    case 46:
                        {
                        alt1=18;
                        }
                        break;
                    case 43:
                        {
                        alt1=19;
                        }
                        break;
                    case 47:
                        {
                        alt1=20;
                        }
                        break;
                    case PARENTESIS_I:
                        {
                        alt1=9;
                        }
                        break;
                    case SET:
                    case 57:
                        {
                        alt1=14;
                        }
                        break;

                    }

                    }
                    break;
                case IF:
                    {
                    alt1=4;
                    }
                    break;
                case READ:
                    {
                    alt1=5;
                    }
                    break;
                case COMENTARIO:
                    {
                    alt1=6;
                    }
                    break;
                case WHILE:
                    {
                    alt1=7;
                    }
                    break;
                case FUNCTION:
                    {
                    alt1=8;
                    }
                    break;
                case VARIABLE:
                    {
                    alt1=10;
                    }
                    break;
                case LIST:
                    {
                    int LA1_11 = input.LA(2);

                    if ( (LA1_11==NOMBRE) ) {
                        int LA1_21 = input.LA(3);

                        if ( (LA1_21==ASIGNACION) ) {
                            alt1=15;
                        }
                        else if ( (LA1_21==PC) ) {
                            alt1=11;
                        }


                    }


                    }
                    break;
                case FOR:
                    {
                    alt1=13;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:54:7: print1
            	    {
            	    pushFollow(FOLLOW_print1_in_programa84);
            	    print11=print1();

            	    state._fsp--;


            	    output.append((String)print11.evaluate(pila));

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:55:7: println
            	    {
            	    pushFollow(FOLLOW_println_in_programa104);
            	    println2=println();

            	    state._fsp--;


            	    output.append((String)println2.evaluate(pila));

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:56:7: asignacion
            	    {
            	    pushFollow(FOLLOW_asignacion_in_programa123);
            	    asignacion3=asignacion();

            	    state._fsp--;


            	    asignacion3.evaluate(pila);

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:57:7: ifstatement
            	    {
            	    pushFollow(FOLLOW_ifstatement_in_programa139);
            	    ifstatement4=ifstatement();

            	    state._fsp--;


            	    output.append((String)ifstatement4.evaluate(pila));

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:58:7: lectura
            	    {
            	    pushFollow(FOLLOW_lectura_in_programa154);
            	    lectura5=lectura();

            	    state._fsp--;


            	    lectura5.evaluate(pila);

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:59:7: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_programa173);
            	    comentario();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:60:7: whilestatemet
            	    {
            	    pushFollow(FOLLOW_whilestatemet_in_programa181);
            	    whilestatemet6=whilestatemet();

            	    state._fsp--;


            	    output.append((String)whilestatemet6.evaluate(pila));

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:61:7: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_programa194);
            	    funcion();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:62:7: llamadofuncion
            	    {
            	    pushFollow(FOLLOW_llamadofuncion_in_programa202);
            	    llamadofuncion7=llamadofuncion();

            	    state._fsp--;


            	    output.append((String)llamadofuncion7.evaluate(pila));

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:63:7: declaracion
            	    {
            	    pushFollow(FOLLOW_declaracion_in_programa214);
            	    declaracion8=declaracion();

            	    state._fsp--;


            	    declaracion8.evaluate(pila);

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:65:7: declaracion_lista
            	    {
            	    pushFollow(FOLLOW_declaracion_lista_in_programa234);
            	    declaracion_lista9=declaracion_lista();

            	    state._fsp--;


            	    declaracion_lista9.evaluate(pila);

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:66:7: push
            	    {
            	    pushFollow(FOLLOW_push_in_programa243);
            	    push10=push();

            	    state._fsp--;


            	    push10.evaluate(pila);

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:67:7: forstatemet
            	    {
            	    pushFollow(FOLLOW_forstatemet_in_programa265);
            	    forstatemet11=forstatemet();

            	    state._fsp--;


            	    output.append((String)forstatemet11.evaluate(pila));

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:68:7: asignacion_lista
            	    {
            	    pushFollow(FOLLOW_asignacion_lista_in_programa280);
            	    asignacion_lista12=asignacion_lista();

            	    state._fsp--;


            	    asignacion_lista12.evaluate(pila);

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:69:7: lista_texto
            	    {
            	    pushFollow(FOLLOW_lista_texto_in_programa290);
            	    lista_texto13=lista_texto();

            	    state._fsp--;


            	    lista_texto13.evaluate(pila);

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:70:7: size
            	    {
            	    pushFollow(FOLLOW_size_in_programa305);
            	    size14=size();

            	    state._fsp--;


            	    size14.evaluate(pila);

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:71:7: unincremento
            	    {
            	    pushFollow(FOLLOW_unincremento_in_programa320);
            	    unincremento15=unincremento();

            	    state._fsp--;


            	    unincremento15.evaluate(pila);

            	    }
            	    break;
            	case 18 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:72:7: menosunincremento
            	    {
            	    pushFollow(FOLLOW_menosunincremento_in_programa335);
            	    menosunincremento16=menosunincremento();

            	    state._fsp--;


            	    menosunincremento16.evaluate(pila);

            	    }
            	    break;
            	case 19 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:73:7: incremento
            	    {
            	    pushFollow(FOLLOW_incremento_in_programa350);
            	    incremento17=incremento();

            	    state._fsp--;


            	    incremento17.evaluate(pila);

            	    }
            	    break;
            	case 20 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:74:7: decremento
            	    {
            	    pushFollow(FOLLOW_decremento_in_programa365);
            	    decremento18=decremento();

            	    state._fsp--;


            	    decremento18.evaluate(pila);

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


            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return output;
    }
    // $ANTLR end "programa"



    // $ANTLR start "return1"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:81:3: return1 returns [Evaluator e] : RETURN te= evaluator PC ;
    public final Evaluator return1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator te =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:82:3: ( RETURN te= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:83:5: RETURN te= evaluator PC
            {
            match(input,RETURN,FOLLOW_RETURN_in_return1413); 

            pushFollow(FOLLOW_evaluator_in_return1419);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1426); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "return1"



    // $ANTLR start "funcion"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:91:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE '(' ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' ;
    public final Evaluator funcion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom1=null;
        Evaluator wh =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:92:3: ( FUNCTION nom= NOMBRE '(' ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:93:3: FUNCTION nom= NOMBRE '(' ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}'
            {
            e = new FuncionEvaluator();

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion464); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion470); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_funcion472); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:96:2: ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VARIABLE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:96:3: ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )*
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:96:3: ( VARIABLE nom1= NOMBRE )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:97:4: VARIABLE nom1= NOMBRE
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion484); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion490); 


                    	     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	  

                    }


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:102:2: ( ',' VARIABLE nom1= NOMBRE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==44) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:103:5: ',' VARIABLE nom1= NOMBRE
                    	    {
                    	    match(input,44,FOLLOW_44_in_funcion507); 

                    	    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion509); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion515); 


                    	           ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_funcion533); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion536); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:112:4: (wh= whilestatements )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMENTARIO||LA4_0==FOR||(LA4_0 >= IF && LA4_0 <= LIST)||LA4_0==NOMBRE||(LA4_0 >= PRINT && LA4_0 <= PRINTLN)||(LA4_0 >= READ && LA4_0 <= RETURN)||(LA4_0 >= VARIABLE && LA4_0 <= WHILE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:112:5: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_funcion550);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion562); 

            funciones.put((nom!=null?nom.getText():null), e);

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "funcion"



    // $ANTLR start "declaracion"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:126:1: declaracion returns [Evaluator e] : VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC ;
    public final Evaluator declaracion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:127:3: ( VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:128:3: VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_declaracion598); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion602); 

             
                 if(bandera)
                  e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(0));   
              

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:132:3: ( ASIGNACION ev= evaluator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ASIGNACION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:132:4: ASIGNACION ev= evaluator
                    {
                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion609); 

                    pushFollow(FOLLOW_evaluator_in_declaracion615);
                    ev=evaluator();

                    state._fsp--;



                    	     if(bandera)
                    	      {
                    	     		  e = new DeclaracionEvaluator((nom!=null?nom.getText():null),ev);    	
                    	     	}
                    	 

                    }
                    break;

            }


            match(input,PC,FOLLOW_PC_in_declaracion636); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "declaracion"



    // $ANTLR start "unincremento"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:143:3: unincremento returns [Evaluator e] : nom= NOMBRE '++' PC ;
    public final Evaluator unincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:144:3: (nom= NOMBRE '++' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:145:3: nom= NOMBRE '++' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_unincremento667); 

            match(input,42,FOLLOW_42_in_unincremento669); 

             
                 if(bandera){
                    e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(1));
                  }   
              

            match(input,PC,FOLLOW_PC_in_unincremento674); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "unincremento"



    // $ANTLR start "menosunincremento"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:153:4: menosunincremento returns [Evaluator e] : nom= NOMBRE '--' PC ;
    public final Evaluator menosunincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:154:3: (nom= NOMBRE '--' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:155:3: nom= NOMBRE '--' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_menosunincremento706); 

            match(input,46,FOLLOW_46_in_menosunincremento708); 

             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(-1));   
              

            match(input,PC,FOLLOW_PC_in_menosunincremento717); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "menosunincremento"



    // $ANTLR start "incremento"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:163:3: incremento returns [Evaluator e] : nom= NOMBRE '+=' ev= evaluator PC ;
    public final Evaluator incremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:164:3: (nom= NOMBRE '+=' ev= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:165:3: nom= NOMBRE '+=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_incremento748); 

            match(input,43,FOLLOW_43_in_incremento750); 

            pushFollow(FOLLOW_evaluator_in_incremento755);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev);   
              

            match(input,PC,FOLLOW_PC_in_incremento766); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "incremento"



    // $ANTLR start "decremento"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:173:3: decremento returns [Evaluator e] : nom= NOMBRE '-=' ev= evaluator PC ;
    public final Evaluator decremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:174:3: (nom= NOMBRE '-=' ev= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:175:3: nom= NOMBRE '-=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_decremento796); 

            match(input,47,FOLLOW_47_in_decremento798); 

            pushFollow(FOLLOW_evaluator_in_decremento803);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev, true);   
              

            match(input,PC,FOLLOW_PC_in_decremento814); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "decremento"



    // $ANTLR start "declaracion_lista"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:185:3: declaracion_lista returns [Evaluator e] : LIST nom= NOMBRE PC ;
    public final Evaluator declaracion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:186:3: ( LIST nom= NOMBRE PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:188:3: LIST nom= NOMBRE PC
            {
            match(input,LIST,FOLLOW_LIST_in_declaracion_lista848); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista852); 


                                              if(bandera)
                                                {
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new ListEvaluator());   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion_lista925); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "declaracion_lista"



    // $ANTLR start "lista_texto"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:199:5: lista_texto returns [Evaluator e] : LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC ;
    public final Evaluator lista_texto() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token tex=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:200:3: ( LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:201:3: LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC
            {
            match(input,LIST,FOLLOW_LIST_in_lista_texto955); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lista_texto959); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_lista_texto961); 

            match(input,READ,FOLLOW_READ_in_lista_texto963); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_lista_texto965); 

            tex=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_lista_texto969); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_lista_texto971); 


                                              if(bandera)
                                                {
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),(new ListFromTextEvaluator((tex!=null?tex.getText():null))).evaluate(pila));   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_lista_texto1044); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "lista_texto"



    // $ANTLR start "push"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:212:3: push returns [Evaluator e] : nom= NOMBRE '.' PUSH '(' exp= expression ')' PC ;
    public final Evaluator push() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:213:3: (nom= NOMBRE '.' PUSH '(' exp= expression ')' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:214:3: nom= NOMBRE '.' PUSH '(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push1074); 

            match(input,48,FOLLOW_48_in_push1076); 

            match(input,PUSH,FOLLOW_PUSH_in_push1078); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_push1080); 

            pushFollow(FOLLOW_expression_in_push1086);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push1088); 


                                              if(bandera)
                                                {
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push1158); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "push"



    // $ANTLR start "size"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:224:3: size returns [Evaluator e] : nom= NOMBRE '.' SIZE ( '()' )* PC ;
    public final Evaluator size() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:225:3: (nom= NOMBRE '.' SIZE ( '()' )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:226:3: nom= NOMBRE '.' SIZE ( '()' )* PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_size1188); 

            match(input,48,FOLLOW_48_in_size1190); 

            match(input,SIZE,FOLLOW_SIZE_in_size1192); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:226:23: ( '()' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:226:24: '()'
            	    {
            	    match(input,39,FOLLOW_39_in_size1195); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



                                              if(bandera)
                                                {
                                                    e = new SizeEvaluator((nom!=null?nom.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_size1267); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "size"



    // $ANTLR start "asignacion"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:238:3: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:239:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:240:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion1304); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion1306); 

            pushFollow(FOLLOW_evaluator_in_asignacion1312);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);       
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion1352); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "asignacion"



    // $ANTLR start "asignacion_lista"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:252:3: asignacion_lista returns [Evaluator e] : nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC ;
    public final Evaluator asignacion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token num=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:253:3: (nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:254:4: nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion_lista1382); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:255:4: ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==57) ) {
                alt7=1;
            }
            else if ( (LA7_0==SET) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:255:7: '[' num= NUMERO ']' ASIGNACION ev= evaluator
                    {
                    match(input,57,FOLLOW_57_in_asignacion_lista1391); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1395); 

                    match(input,58,FOLLOW_58_in_asignacion_lista1397); 

                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion_lista1399); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1405);
                    ev=evaluator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:256:7: SET '(' num= NUMERO ',' ev= evaluator ')'
                    {
                    match(input,SET,FOLLOW_SET_in_asignacion_lista1413); 

                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_asignacion_lista1415); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1419); 

                    match(input,44,FOLLOW_44_in_asignacion_lista1421); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1427);
                    ev=evaluator();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_asignacion_lista1429); 

                    }
                    break;

            }



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionListaEvaluator((nom!=null?nom.getText():null),ev, (num!=null?num.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion_lista1475); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "asignacion_lista"



    // $ANTLR start "comentario"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:270:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:271:3: ( COMENTARIO )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:272:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario1493); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "comentario"



    // $ANTLR start "lectura"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:275:1: lectura returns [Evaluator e] : r= READ n= NOMBRE PC ;
    public final Evaluator lectura() throws Exception, RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:276:3: (r= READ n= NOMBRE PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:277:3: r= READ n= NOMBRE PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura1518); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura1522); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            match(input,PC,FOLLOW_PC_in_lectura1569); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "lectura"



    // $ANTLR start "print1"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:289:1: print1 returns [Evaluator e] : PRINT (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator print1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:290:3: ( PRINT (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:291:3: PRINT (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintEvaluator(); 

            match(input,PRINT,FOLLOW_PRINT_in_print11598); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:293:3: (exp= expression )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:293:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_print11609);
            exp=expression();

            state._fsp--;


             ((PrintEvaluator)e).addEvaluator(exp); 

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:295:3: ( ',' exp= expression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==44) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:295:5: ',' exp= expression
            	    {
            	    match(input,44,FOLLOW_44_in_print11621); 

            	    pushFollow(FOLLOW_expression_in_print11631);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_print11642); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "print1"



    // $ANTLR start "println"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:301:1: println returns [Evaluator e] : PRINTLN (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator println() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:302:3: ( PRINTLN (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:303:3: PRINTLN (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintlnEvaluator(); 

            match(input,PRINTLN,FOLLOW_PRINTLN_in_println1671); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:305:3: (exp= expression )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:305:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_println1681);
            exp=expression();

            state._fsp--;


             ((PrintlnEvaluator)e).addEvaluator(exp); 

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:307:3: ( ',' exp= expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==44) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:307:5: ',' exp= expression
            	    {
            	    match(input,44,FOLLOW_44_in_println1693); 

            	    pushFollow(FOLLOW_expression_in_println1703);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintlnEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_println1714); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "println"



    // $ANTLR start "evaluator"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:313:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico19 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:314:3: ( logico )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:315:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator1739);
            logico19=logico();

            state._fsp--;



                     e = logico19;
                    

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "evaluator"



    // $ANTLR start "term"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:321:1: term returns [Evaluator e] : (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE '.size' ( '()' )* );
    public final Evaluator term() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token BOOLEAN20=null;
        Token NOMBRE21=null;
        Token NUMERO22=null;
        Token DOBLE23=null;
        Token TEXTO24=null;
        Evaluator lla =null;

        Evaluator num =null;

        Evaluator add25 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:322:3: (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE '.size' ( '()' )* )
            int alt12=9;
            switch ( input.LA(1) ) {
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    alt12=9;
                    }
                    break;
                case PARENTESIS_I:
                    {
                    alt12=1;
                    }
                    break;
                case PARENTESIS_D:
                case PC:
                case 36:
                case 37:
                case 38:
                case 40:
                case 41:
                case 44:
                case 45:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 58:
                case 59:
                    {
                    alt12=3;
                    }
                    break;
                case 49:
                case 57:
                    {
                    alt12=8;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }

                }
                break;
            case BOOLEAN:
                {
                alt12=2;
                }
                break;
            case NUMERO:
                {
                alt12=4;
                }
                break;
            case DOBLE:
                {
                alt12=5;
                }
                break;
            case TEXTO:
                {
                alt12=6;
                }
                break;
            case PARENTESIS_I:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:324:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term1785);
                    lla=llamadofuncion();

                    state._fsp--;



                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:331:5: BOOLEAN
                    {
                    BOOLEAN20=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_term1801); 


                               System.out.println("entiendo que es un boolean");
                               e = new BooleanEvaluator(((BOOLEAN20!=null?BOOLEAN20.getText():null))); 
                              

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:336:5: NOMBRE
                    {
                    NOMBRE21=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1820); 

                       
                            System.out.println("entiendo que es un llamado");
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE21!=null?NOMBRE21.getText():null)));//((pila.peek().get((NOMBRE21!=null?NOMBRE21.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:343:5: NUMERO
                    {
                    NUMERO22=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term1838); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO22!=null?NUMERO22.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:347:5: DOBLE
                    {
                    DOBLE23=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term1857); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE23!=null?DOBLE23.getText():null)));
                              

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:352:5: TEXTO
                    {
                    TEXTO24=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term1891); 


                              e = new StringEvaluator(((TEXTO24!=null?TEXTO24.getText():null)));
                             

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:357:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term1912); 

                    pushFollow(FOLLOW_add_in_term1914);
                    add25=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1916); 


                                           e = add25;
                                          

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:361:5: nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' )
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1949); 

                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:362:5: ( '.get(' num= add ')' | '[' num= add ']' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==49) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==57) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:362:7: '.get(' num= add ')'
                            {
                            match(input,49,FOLLOW_49_in_term1958); 

                            pushFollow(FOLLOW_add_in_term1964);
                            num=add();

                            state._fsp--;


                            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1966); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:363:7: '[' num= add ']'
                            {
                            match(input,57,FOLLOW_57_in_term1974); 

                            pushFollow(FOLLOW_add_in_term1984);
                            num=add();

                            state._fsp--;


                            match(input,58,FOLLOW_58_in_term1986); 

                            }
                            break;

                    }



                                    e = new GetEvaluator((nom!=null?nom.getText():null),num);     
                             

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:368:5: nom= NOMBRE '.size' ( '()' )*
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2011); 

                    match(input,50,FOLLOW_50_in_term2013); 

                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:368:24: ( '()' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==39) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:368:25: '()'
                    	    {
                    	    match(input,39,FOLLOW_39_in_term2016); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);



                                      e = new SizeEvaluator((nom!=null?nom.getText():null));
                                

                    }
                    break;

            }
        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "term"



    // $ANTLR start "unary"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:374:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator term26 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:375:3: ( ( '+' | '-' )* term )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:377:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:380:3: ( '+' | '-' )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }
                else if ( (LA13_0==45) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:381:7: '+'
            	    {
            	    match(input,41,FOLLOW_41_in_unary2070); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:382:7: '-'
            	    {
            	    match(input,45,FOLLOW_45_in_unary2078); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary2099);
            term26=term();

            state._fsp--;



                   e = term26; 
                     if(!positive)
                        e = new NegationEvaluator(e);
                  

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "unary"



    // $ANTLR start "mult"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:395:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* ;
    public final Evaluator mult() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:396:3: (op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:397:3: op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult2133);
            op1=unary();

            state._fsp--;



                        e = op1;
                       

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:401:3: ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    alt14=1;
                    }
                    break;
                case 51:
                    {
                    alt14=2;
                    }
                    break;
                case 37:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:402:5: '*' op2= unary
            	    {
            	    match(input,40,FOLLOW_40_in_mult2157); 

            	    pushFollow(FOLLOW_unary_in_mult2161);
            	    op2=unary();

            	    state._fsp--;



            	                      e = new TimesEvaluator(e,op2);
            	                     

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:406:7: '/' op2= unary
            	    {
            	    match(input,51,FOLLOW_51_in_mult2189); 

            	    pushFollow(FOLLOW_unary_in_mult2193);
            	    op2=unary();

            	    state._fsp--;



            	                        e = new DivideEvaluator(e,op2);
            	                       

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:410:7: '%' op2= unary
            	    {
            	    match(input,37,FOLLOW_37_in_mult2223); 

            	    pushFollow(FOLLOW_unary_in_mult2227);
            	    op2=unary();

            	    state._fsp--;



            	                        e = new ModEvaluator(e,op2);
            	                       

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "mult"



    // $ANTLR start "add"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:417:1: add returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
    public final Evaluator add() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:418:3: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:419:3: op1= mult ( '+' op2= mult | '-' op2= mult )*
            {
            pushFollow(FOLLOW_mult_in_add2279);
            op1=mult();

            state._fsp--;



                       e = op1;
                      

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:423:3: ( '+' op2= mult | '-' op2= mult )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }
                else if ( (LA15_0==45) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:424:5: '+' op2= mult
            	    {
            	    match(input,41,FOLLOW_41_in_add2302); 

            	    pushFollow(FOLLOW_mult_in_add2306);
            	    op2=mult();

            	    state._fsp--;


            	      
            	                     e = new PlusEvaluator(e, op2);
            	                    

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:428:7: '-' op2= mult
            	    {
            	    match(input,45,FOLLOW_45_in_add2333); 

            	    pushFollow(FOLLOW_mult_in_add2337);
            	    op2=mult();

            	    state._fsp--;



            	                       e = new MinusEvaluator(e, op2);
            	                      

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "add"



    // $ANTLR start "relation"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:435:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:436:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:437:3: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation2388);
            ex1=add();

            state._fsp--;



                             e = ex1;
                            

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:441:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36||(LA17_0 >= 52 && LA17_0 <= 56)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:442:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:442:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt16=6;
            	    switch ( input.LA(1) ) {
            	    case 54:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt16=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:443:7: '==' ex2= add
            	            {
            	            match(input,54,FOLLOW_54_in_relation2425); 

            	            pushFollow(FOLLOW_add_in_relation2429);
            	            ex2=add();

            	            state._fsp--;



            	                                      e = new IgualIgualEvaluator(e,ex2);
            	                                     

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:447:9: '>' ex2= add
            	            {
            	            match(input,55,FOLLOW_55_in_relation2467); 

            	            pushFollow(FOLLOW_add_in_relation2471);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MayorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:451:9: '<' ex2= add
            	            {
            	            match(input,52,FOLLOW_52_in_relation2510); 

            	            pushFollow(FOLLOW_add_in_relation2514);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MenorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:455:9: '!=' ex2= add
            	            {
            	            match(input,36,FOLLOW_36_in_relation2553); 

            	            pushFollow(FOLLOW_add_in_relation2557);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new DiferenteEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:459:9: '<=' ex2= add
            	            {
            	            match(input,53,FOLLOW_53_in_relation2597); 

            	            pushFollow(FOLLOW_add_in_relation2601);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MenorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:463:9: '>=' ex2= add
            	            {
            	            match(input,56,FOLLOW_56_in_relation2641); 

            	            pushFollow(FOLLOW_add_in_relation2645);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MayorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "relation"



    // $ANTLR start "logico"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:471:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:472:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:473:3: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico2711);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:477:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }
                else if ( (LA18_0==59) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:478:5: '&&' rel2= relation
            	    {
            	    match(input,38,FOLLOW_38_in_logico2739); 

            	    pushFollow(FOLLOW_relation_in_logico2743);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:482:7: '||' rel2= relation
            	    {
            	    match(input,59,FOLLOW_59_in_logico2776); 

            	    pushFollow(FOLLOW_relation_in_logico2780);
            	    rel2=relation();

            	    state._fsp--;



            	                             e = new OrEvaluator(e,rel2);
            	                            

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "logico"



    // $ANTLR start "expression"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:489:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico27 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:490:5: ( logico )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:490:9: logico
            {
            pushFollow(FOLLOW_logico_in_expression2839);
            logico27=logico();

            state._fsp--;


             e = logico27; 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "expression"



    // $ANTLR start "llamadofuncion"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:494:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC ;
    public final Evaluator llamadofuncion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:495:4: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:496:9: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2877); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2882); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:498:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BOOLEAN||LA20_0==DOBLE||(LA20_0 >= NOMBRE && LA20_0 <= NUMERO)||LA20_0==PARENTESIS_I||LA20_0==TEXTO) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:498:9: (ev= term ) ( ',' ev= term )*
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:498:9: (ev= term )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:498:10: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2897);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev); 

                    }


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:500:4: ( ',' ev= term )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==44) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:500:5: ',' ev= term
                    	    {
                    	    match(input,44,FOLLOW_44_in_llamadofuncion2909); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2916);
                    	    ev=term();

                    	    state._fsp--;


                    	    ((FuncionEvaluator) e).llenarParametro(ev); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2929); 

            match(input,PC,FOLLOW_PC_in_llamadofuncion2940); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "llamadofuncion"



    // $ANTLR start "ifstatements"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:510:1: ifstatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento );
    public final Evaluator ifstatements() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator print128 =null;

        Evaluator println29 =null;

        Evaluator asignacion30 =null;

        Evaluator lectura31 =null;

        Evaluator return132 =null;

        Evaluator whilestatemet33 =null;

        Evaluator ifstatement34 =null;

        Evaluator declaracion35 =null;

        Evaluator declaracion_lista36 =null;

        Evaluator push37 =null;

        Evaluator forstatemet38 =null;

        Evaluator asignacion_lista39 =null;

        Evaluator lista_texto40 =null;

        Evaluator size41 =null;

        Evaluator unincremento42 =null;

        Evaluator menosunincremento43 =null;

        Evaluator incremento44 =null;

        Evaluator decremento45 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:510:52: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )
            int alt21=19;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt21=1;
                }
                break;
            case PRINTLN:
                {
                alt21=2;
                }
                break;
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case ASIGNACION:
                    {
                    alt21=3;
                    }
                    break;
                case 48:
                    {
                    int LA21_13 = input.LA(3);

                    if ( (LA21_13==PUSH) ) {
                        alt21=11;
                    }
                    else if ( (LA21_13==SIZE) ) {
                        alt21=15;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case 42:
                    {
                    alt21=16;
                    }
                    break;
                case 46:
                    {
                    alt21=17;
                    }
                    break;
                case 43:
                    {
                    alt21=18;
                    }
                    break;
                case 47:
                    {
                    alt21=19;
                    }
                    break;
                case SET:
                case 57:
                    {
                    alt21=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;

                }

                }
                break;
            case READ:
                {
                alt21=4;
                }
                break;
            case COMENTARIO:
                {
                alt21=5;
                }
                break;
            case RETURN:
                {
                alt21=6;
                }
                break;
            case WHILE:
                {
                alt21=7;
                }
                break;
            case IF:
                {
                alt21=8;
                }
                break;
            case VARIABLE:
                {
                alt21=9;
                }
                break;
            case LIST:
                {
                int LA21_10 = input.LA(2);

                if ( (LA21_10==NOMBRE) ) {
                    int LA21_19 = input.LA(3);

                    if ( (LA21_19==ASIGNACION) ) {
                        alt21=14;
                    }
                    else if ( (LA21_19==PC) ) {
                        alt21=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 19, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 10, input);

                    throw nvae;

                }
                }
                break;
            case FOR:
                {
                alt21=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:512:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_ifstatements2971);
                    print128=print1();

                    state._fsp--;


                    e = print128;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:513:5: println
                    {
                    pushFollow(FOLLOW_println_in_ifstatements2979);
                    println29=println();

                    state._fsp--;


                    e = println29;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:514:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_ifstatements2990);
                    asignacion30=asignacion();

                    state._fsp--;


                    e = asignacion30;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:515:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_ifstatements2997);
                    lectura31=lectura();

                    state._fsp--;


                    e = lectura31;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:516:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_ifstatements3005);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:517:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_ifstatements3013);
                    return132=return1();

                    state._fsp--;


                    e = return132;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:518:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_ifstatements3021);
                    whilestatemet33=whilestatemet();

                    state._fsp--;


                    e = whilestatemet33;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:519:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_ifstatements3029);
                    ifstatement34=ifstatement();

                    state._fsp--;


                    e = ifstatement34;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:520:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_ifstatements3038);
                    declaracion35=declaracion();

                    state._fsp--;


                    e = declaracion35;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:522:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_ifstatements3048);
                    declaracion_lista36=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista36;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:523:5: push
                    {
                    pushFollow(FOLLOW_push_in_ifstatements3055);
                    push37=push();

                    state._fsp--;


                     e = push37; 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:524:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_ifstatements3062);
                    forstatemet38=forstatemet();

                    state._fsp--;


                    e = forstatemet38;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:525:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_ifstatements3069);
                    asignacion_lista39=asignacion_lista();

                    state._fsp--;


                    e = asignacion_lista39;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:526:5: lista_texto
                    {
                    pushFollow(FOLLOW_lista_texto_in_ifstatements3077);
                    lista_texto40=lista_texto();

                    state._fsp--;


                    e = lista_texto40;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:527:5: size
                    {
                    pushFollow(FOLLOW_size_in_ifstatements3090);
                    size41=size();

                    state._fsp--;


                    e = size41;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:528:5: unincremento
                    {
                    pushFollow(FOLLOW_unincremento_in_ifstatements3103);
                    unincremento42=unincremento();

                    state._fsp--;


                    e = unincremento42;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:529:5: menosunincremento
                    {
                    pushFollow(FOLLOW_menosunincremento_in_ifstatements3116);
                    menosunincremento43=menosunincremento();

                    state._fsp--;


                    e = menosunincremento43;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:530:5: incremento
                    {
                    pushFollow(FOLLOW_incremento_in_ifstatements3124);
                    incremento44=incremento();

                    state._fsp--;


                    e = incremento44;

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:531:5: decremento
                    {
                    pushFollow(FOLLOW_decremento_in_ifstatements3137);
                    decremento45=decremento();

                    state._fsp--;


                    e = decremento45;

                    }
                    break;

            }
        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "ifstatements"



    // $ANTLR start "elsestataments"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:536:1: elsestataments returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento );
    public final Evaluator elsestataments() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator print146 =null;

        Evaluator println47 =null;

        Evaluator asignacion48 =null;

        Evaluator lectura49 =null;

        Evaluator return150 =null;

        Evaluator whilestatemet51 =null;

        Evaluator ifstatement52 =null;

        Evaluator declaracion53 =null;

        Evaluator declaracion_lista54 =null;

        Evaluator push55 =null;

        Evaluator forstatemet56 =null;

        Evaluator asignacion_lista57 =null;

        Evaluator lista_texto58 =null;

        Evaluator size59 =null;

        Evaluator unincremento60 =null;

        Evaluator menosunincremento61 =null;

        Evaluator incremento62 =null;

        Evaluator decremento63 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:536:54: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )
            int alt22=19;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt22=1;
                }
                break;
            case PRINTLN:
                {
                alt22=2;
                }
                break;
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case ASIGNACION:
                    {
                    alt22=3;
                    }
                    break;
                case 48:
                    {
                    int LA22_13 = input.LA(3);

                    if ( (LA22_13==PUSH) ) {
                        alt22=11;
                    }
                    else if ( (LA22_13==SIZE) ) {
                        alt22=15;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case 42:
                    {
                    alt22=16;
                    }
                    break;
                case 46:
                    {
                    alt22=17;
                    }
                    break;
                case 43:
                    {
                    alt22=18;
                    }
                    break;
                case 47:
                    {
                    alt22=19;
                    }
                    break;
                case SET:
                case 57:
                    {
                    alt22=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;

                }

                }
                break;
            case READ:
                {
                alt22=4;
                }
                break;
            case COMENTARIO:
                {
                alt22=5;
                }
                break;
            case RETURN:
                {
                alt22=6;
                }
                break;
            case WHILE:
                {
                alt22=7;
                }
                break;
            case IF:
                {
                alt22=8;
                }
                break;
            case VARIABLE:
                {
                alt22=9;
                }
                break;
            case LIST:
                {
                int LA22_10 = input.LA(2);

                if ( (LA22_10==NOMBRE) ) {
                    int LA22_19 = input.LA(3);

                    if ( (LA22_19==ASIGNACION) ) {
                        alt22=14;
                    }
                    else if ( (LA22_19==PC) ) {
                        alt22=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 19, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 10, input);

                    throw nvae;

                }
                }
                break;
            case FOR:
                {
                alt22=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:538:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_elsestataments3175);
                    print146=print1();

                    state._fsp--;


                    e = print146;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:539:5: println
                    {
                    pushFollow(FOLLOW_println_in_elsestataments3183);
                    println47=println();

                    state._fsp--;


                    e = println47;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:540:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_elsestataments3192);
                    asignacion48=asignacion();

                    state._fsp--;


                    e = asignacion48;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:541:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_elsestataments3199);
                    lectura49=lectura();

                    state._fsp--;


                    e = lectura49;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:542:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_elsestataments3207);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:543:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_elsestataments3215);
                    return150=return1();

                    state._fsp--;


                    e = return150;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:544:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_elsestataments3223);
                    whilestatemet51=whilestatemet();

                    state._fsp--;


                    e = whilestatemet51;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:545:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_elsestataments3231);
                    ifstatement52=ifstatement();

                    state._fsp--;


                    e = ifstatement52;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:546:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_elsestataments3240);
                    declaracion53=declaracion();

                    state._fsp--;


                    e = declaracion53;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:548:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_elsestataments3250);
                    declaracion_lista54=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista54;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:549:5: push
                    {
                    pushFollow(FOLLOW_push_in_elsestataments3257);
                    push55=push();

                    state._fsp--;


                     e = push55; 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:550:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_elsestataments3264);
                    forstatemet56=forstatemet();

                    state._fsp--;


                    e = forstatemet56;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:551:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_elsestataments3271);
                    asignacion_lista57=asignacion_lista();

                    state._fsp--;


                    e = asignacion_lista57;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:552:5: lista_texto
                    {
                    pushFollow(FOLLOW_lista_texto_in_elsestataments3279);
                    lista_texto58=lista_texto();

                    state._fsp--;


                    e = lista_texto58;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:553:5: size
                    {
                    pushFollow(FOLLOW_size_in_elsestataments3292);
                    size59=size();

                    state._fsp--;


                    e = size59;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:554:5: unincremento
                    {
                    pushFollow(FOLLOW_unincremento_in_elsestataments3305);
                    unincremento60=unincremento();

                    state._fsp--;


                    e = unincremento60;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:555:5: menosunincremento
                    {
                    pushFollow(FOLLOW_menosunincremento_in_elsestataments3318);
                    menosunincremento61=menosunincremento();

                    state._fsp--;


                    e = menosunincremento61;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:556:5: incremento
                    {
                    pushFollow(FOLLOW_incremento_in_elsestataments3326);
                    incremento62=incremento();

                    state._fsp--;


                    e = incremento62;

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:557:5: decremento
                    {
                    pushFollow(FOLLOW_decremento_in_elsestataments3339);
                    decremento63=decremento();

                    state._fsp--;


                    e = decremento63;

                    }
                    break;

            }
        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "elsestataments"



    // $ANTLR start "ifstatement"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:563:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* ;
    public final Evaluator ifstatement() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:563:51: ( IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:565:1: IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement3367); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3369); 

            pushFollow(FOLLOW_logico_in_ifstatement3375);
            rel=logico();

            state._fsp--;



              e = new IfEvaluator ();   
              ((IfEvaluator) e).agregarCondicion(rel);


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3381); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3383); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:571:2: (ifs= ifstatements )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMENTARIO||LA23_0==FOR||(LA23_0 >= IF && LA23_0 <= LIST)||LA23_0==NOMBRE||(LA23_0 >= PRINT && LA23_0 <= PRINTLN)||(LA23_0 >= READ && LA23_0 <= RETURN)||(LA23_0 >= VARIABLE && LA23_0 <= WHILE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:571:3: ifs= ifstatements
            	    {
            	    pushFollow(FOLLOW_ifstatements_in_ifstatement3391);
            	    ifs=ifstatements();

            	    state._fsp--;



            	       ((IfEvaluator) e).agregarCoso(ifs);   
            	      
            	     

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3401); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:579:2: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ELSEIF) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:579:3: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D
            	    {
            	    match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement3410); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3412); 

            	    pushFollow(FOLLOW_logico_in_ifstatement3416);
            	    rel1=logico();

            	    state._fsp--;



            	     ((IfEvaluator) e).nuevoSegmento();
            	     ((IfEvaluator) e).agregarCondicion(rel1); 


            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3422); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3424); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:585:2: (ifs= ifstatements )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==COMENTARIO||LA24_0==FOR||(LA24_0 >= IF && LA24_0 <= LIST)||LA24_0==NOMBRE||(LA24_0 >= PRINT && LA24_0 <= PRINTLN)||(LA24_0 >= READ && LA24_0 <= RETURN)||(LA24_0 >= VARIABLE && LA24_0 <= WHILE)) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:585:3: ifs= ifstatements
            	    	    {
            	    	    pushFollow(FOLLOW_ifstatements_in_ifstatement3431);
            	    	    ifs=ifstatements();

            	    	    state._fsp--;



            	    	       ((IfEvaluator) e).agregarCoso(ifs);   
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3441); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:595:3: ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ELSE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:595:3: ELSE LLAVE_I (elses= elsestataments )* LLAVE_D
            	    {
            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement3458); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3461); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:596:9: (elses= elsestataments )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==COMENTARIO||LA26_0==FOR||(LA26_0 >= IF && LA26_0 <= LIST)||LA26_0==NOMBRE||(LA26_0 >= PRINT && LA26_0 <= PRINTLN)||(LA26_0 >= READ && LA26_0 <= RETURN)||(LA26_0 >= VARIABLE && LA26_0 <= WHILE)) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:597:5: elses= elsestataments
            	    	    {
            	    	    pushFollow(FOLLOW_elsestataments_in_ifstatement3472);
            	    	    elses=elsestataments();

            	    	    state._fsp--;


            	    	        
            	    	       ((IfEvaluator)e).agregarCosoElse(elses);
            	    	     
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3480); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "ifstatement"



    // $ANTLR start "whilestatements"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:611:1: whilestatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento );
    public final Evaluator whilestatements() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator print164 =null;

        Evaluator println65 =null;

        Evaluator asignacion66 =null;

        Evaluator lectura67 =null;

        Evaluator return168 =null;

        Evaluator whilestatemet69 =null;

        Evaluator ifstatement70 =null;

        Evaluator declaracion71 =null;

        Evaluator declaracion_lista72 =null;

        Evaluator push73 =null;

        Evaluator forstatemet74 =null;

        Evaluator asignacion_lista75 =null;

        Evaluator lista_texto76 =null;

        Evaluator size77 =null;

        Evaluator unincremento78 =null;

        Evaluator menosunincremento79 =null;

        Evaluator incremento80 =null;

        Evaluator decremento81 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:611:55: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )
            int alt28=19;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt28=1;
                }
                break;
            case PRINTLN:
                {
                alt28=2;
                }
                break;
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case ASIGNACION:
                    {
                    alt28=3;
                    }
                    break;
                case 48:
                    {
                    int LA28_13 = input.LA(3);

                    if ( (LA28_13==PUSH) ) {
                        alt28=11;
                    }
                    else if ( (LA28_13==SIZE) ) {
                        alt28=15;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case 42:
                    {
                    alt28=16;
                    }
                    break;
                case 46:
                    {
                    alt28=17;
                    }
                    break;
                case 43:
                    {
                    alt28=18;
                    }
                    break;
                case 47:
                    {
                    alt28=19;
                    }
                    break;
                case SET:
                case 57:
                    {
                    alt28=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;

                }

                }
                break;
            case READ:
                {
                alt28=4;
                }
                break;
            case COMENTARIO:
                {
                alt28=5;
                }
                break;
            case RETURN:
                {
                alt28=6;
                }
                break;
            case WHILE:
                {
                alt28=7;
                }
                break;
            case IF:
                {
                alt28=8;
                }
                break;
            case VARIABLE:
                {
                alt28=9;
                }
                break;
            case LIST:
                {
                int LA28_10 = input.LA(2);

                if ( (LA28_10==NOMBRE) ) {
                    int LA28_19 = input.LA(3);

                    if ( (LA28_19==ASIGNACION) ) {
                        alt28=14;
                    }
                    else if ( (LA28_19==PC) ) {
                        alt28=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 19, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 10, input);

                    throw nvae;

                }
                }
                break;
            case FOR:
                {
                alt28=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:614:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_whilestatements3517);
                    print164=print1();

                    state._fsp--;


                    e = print164;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:615:5: println
                    {
                    pushFollow(FOLLOW_println_in_whilestatements3525);
                    println65=println();

                    state._fsp--;


                    e = println65;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:616:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_whilestatements3534);
                    asignacion66=asignacion();

                    state._fsp--;


                    e = asignacion66;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:617:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_whilestatements3541);
                    lectura67=lectura();

                    state._fsp--;


                    e = lectura67;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:618:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_whilestatements3549);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:619:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_whilestatements3557);
                    return168=return1();

                    state._fsp--;


                    e = return168;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:620:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_whilestatements3565);
                    whilestatemet69=whilestatemet();

                    state._fsp--;


                    e = whilestatemet69;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:621:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_whilestatements3574);
                    ifstatement70=ifstatement();

                    state._fsp--;


                    e = ifstatement70;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:622:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_whilestatements3583);
                    declaracion71=declaracion();

                    state._fsp--;


                    e = declaracion71;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:624:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_whilestatements3595);
                    declaracion_lista72=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista72;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:625:5: push
                    {
                    pushFollow(FOLLOW_push_in_whilestatements3602);
                    push73=push();

                    state._fsp--;


                     e = push73; 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:626:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_whilestatements3609);
                    forstatemet74=forstatemet();

                    state._fsp--;


                    e = forstatemet74;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:627:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_whilestatements3616);
                    asignacion_lista75=asignacion_lista();

                    state._fsp--;


                    e = asignacion_lista75;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:628:5: lista_texto
                    {
                    pushFollow(FOLLOW_lista_texto_in_whilestatements3624);
                    lista_texto76=lista_texto();

                    state._fsp--;


                    e = lista_texto76;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:629:5: size
                    {
                    pushFollow(FOLLOW_size_in_whilestatements3637);
                    size77=size();

                    state._fsp--;


                    e = size77;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:630:5: unincremento
                    {
                    pushFollow(FOLLOW_unincremento_in_whilestatements3650);
                    unincremento78=unincremento();

                    state._fsp--;


                    e = unincremento78;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:631:5: menosunincremento
                    {
                    pushFollow(FOLLOW_menosunincremento_in_whilestatements3663);
                    menosunincremento79=menosunincremento();

                    state._fsp--;


                    e = menosunincremento79;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:632:5: incremento
                    {
                    pushFollow(FOLLOW_incremento_in_whilestatements3671);
                    incremento80=incremento();

                    state._fsp--;


                    e = incremento80;

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:633:5: decremento
                    {
                    pushFollow(FOLLOW_decremento_in_whilestatements3684);
                    decremento81=decremento();

                    state._fsp--;


                    e = decremento81;

                    }
                    break;

            }
        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "whilestatements"



    // $ANTLR start "whilestatemet"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:638:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator whilestatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:638:53: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:641:1: WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet3719); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet3721); 

            pushFollow(FOLLOW_logico_in_whilestatemet3725);
            rel=logico();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)rel.evaluate(pila));  
               e = new WhileEvaluator(rel); 
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet3728); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet3730); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:647:2: (wh= whilestatements )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMENTARIO||LA29_0==FOR||(LA29_0 >= IF && LA29_0 <= LIST)||LA29_0==NOMBRE||(LA29_0 >= PRINT && LA29_0 <= PRINTLN)||(LA29_0 >= READ && LA29_0 <= RETURN)||(LA29_0 >= VARIABLE && LA29_0 <= WHILE)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:647:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_whilestatemet3738);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((WhileEvaluator) e).add(wh);   
            	         //System.out.println("coso evaluador while: "+wh);
            	     

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet3749); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "whilestatemet"



    // $ANTLR start "forstatemet"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:659:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator forstatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator decl =null;

        Evaluator logi =null;

        Evaluator aumento =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:659:51: ( FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:662:1: FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,FOR,FOLLOW_FOR_in_forstatemet3769); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet3771); 

            pushFollow(FOLLOW_declaracion_in_forstatemet3775);
            decl=declaracion();

            state._fsp--;


            pushFollow(FOLLOW_logico_in_forstatemet3779);
            logi=logico();

            state._fsp--;


            match(input,PC,FOLLOW_PC_in_forstatemet3781); 

            pushFollow(FOLLOW_add_in_forstatemet3785);
            aumento=add();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)$rel.e.evaluate(pila));  
               e = new ForEvaluator(decl, logi, aumento);  
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet3790); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet3792); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:668:2: (wh= whilestatements )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMENTARIO||LA30_0==FOR||(LA30_0 >= IF && LA30_0 <= LIST)||LA30_0==NOMBRE||(LA30_0 >= PRINT && LA30_0 <= PRINTLN)||(LA30_0 >= READ && LA30_0 <= RETURN)||(LA30_0 >= VARIABLE && LA30_0 <= WHILE)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\fucnionando_funciones\\funcionando\\Extendedprojectocoso\\ExtendedProjectcoso\\src\\Lenguaje.g:668:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_forstatemet3800);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((ForEvaluator) e).add(wh);   
            	         //System.out.println("coso evaluador while: "+wh);
            	     

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet3811); 

            }

        }


        catch (RecognitionException er) {
            throw er; 
        } 


        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "forstatemet"

    // Delegated rules


 

    public static final BitSet FOLLOW_print1_in_programa84 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_println_in_programa104 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_asignacion_in_programa123 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_ifstatement_in_programa139 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_lectura_in_programa154 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_comentario_in_programa173 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_whilestatemet_in_programa181 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_funcion_in_programa194 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_llamadofuncion_in_programa202 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_declaracion_in_programa214 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_declaracion_lista_in_programa234 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_push_in_programa243 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_forstatemet_in_programa265 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_asignacion_lista_in_programa280 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_lista_texto_in_programa290 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_size_in_programa305 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_unincremento_in_programa320 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_menosunincremento_in_programa335 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_incremento_in_programa350 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_decremento_in_programa365 = new BitSet(new long[]{0x000000060B08F042L});
    public static final BitSet FOLLOW_RETURN_in_return1413 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_evaluator_in_return1419 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_return1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion470 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_funcion472 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion490 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_funcion507 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion509 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion515 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_funcion533 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion536 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_whilestatements_in_funcion550 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_declaracion598 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion602 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion609 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion615 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_declaracion636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_unincremento667 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_unincremento669 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_unincremento674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_menosunincremento706 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_menosunincremento708 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_menosunincremento717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_incremento748 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_incremento750 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_evaluator_in_incremento755 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_incremento766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_decremento796 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_decremento798 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_evaluator_in_decremento803 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_decremento814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_declaracion_lista848 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista852 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_lista_texto955 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NOMBRE_in_lista_texto959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_lista_texto961 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_READ_in_lista_texto963 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_lista_texto965 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_TEXTO_in_lista_texto969 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_lista_texto971 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_lista_texto1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push1074 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_push1076 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PUSH_in_push1078 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_push1080 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_expression_in_push1086 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push1088 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_push1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_size1188 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_size1190 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SIZE_in_size1192 = new BitSet(new long[]{0x0000008000800000L});
    public static final BitSet FOLLOW_39_in_size1195 = new BitSet(new long[]{0x0000008000800000L});
    public static final BitSet FOLLOW_PC_in_size1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion1304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion1306 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion1312 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_asignacion1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion_lista1382 = new BitSet(new long[]{0x0200000020000000L});
    public static final BitSet FOLLOW_57_in_asignacion_lista1391 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1395 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_asignacion_lista1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion_lista1399 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1405 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SET_in_asignacion_lista1413 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_asignacion_lista1415 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1419 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_asignacion_lista1421 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1427 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_asignacion_lista1429 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_asignacion_lista1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura1518 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura1522 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_lectura1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print11598 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_expression_in_print11609 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_44_in_print11621 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_expression_in_print11631 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_PC_in_print11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println1671 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_expression_in_println1681 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_44_in_println1693 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_expression_in_println1703 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_PC_in_println1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_term1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term1912 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_term1914 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1949 = new BitSet(new long[]{0x0202000000000000L});
    public static final BitSet FOLLOW_49_in_term1958 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_term1964 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_term1974 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_term1984 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_term1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2011 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_term2013 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_term2016 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41_in_unary2070 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_45_in_unary2078 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_term_in_unary2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult2133 = new BitSet(new long[]{0x0008012000000002L});
    public static final BitSet FOLLOW_40_in_mult2157 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_unary_in_mult2161 = new BitSet(new long[]{0x0008012000000002L});
    public static final BitSet FOLLOW_51_in_mult2189 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_unary_in_mult2193 = new BitSet(new long[]{0x0008012000000002L});
    public static final BitSet FOLLOW_37_in_mult2223 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_unary_in_mult2227 = new BitSet(new long[]{0x0008012000000002L});
    public static final BitSet FOLLOW_mult_in_add2279 = new BitSet(new long[]{0x0000220000000002L});
    public static final BitSet FOLLOW_41_in_add2302 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_mult_in_add2306 = new BitSet(new long[]{0x0000220000000002L});
    public static final BitSet FOLLOW_45_in_add2333 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_mult_in_add2337 = new BitSet(new long[]{0x0000220000000002L});
    public static final BitSet FOLLOW_add_in_relation2388 = new BitSet(new long[]{0x01F0001000000002L});
    public static final BitSet FOLLOW_54_in_relation2425 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_relation2429 = new BitSet(new long[]{0x01F0001000000002L});
    public static final BitSet FOLLOW_55_in_relation2467 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_relation2471 = new BitSet(new long[]{0x01F0001000000002L});
    public static final BitSet FOLLOW_52_in_relation2510 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_relation2514 = new BitSet(new long[]{0x01F0001000000002L});
    public static final BitSet FOLLOW_36_in_relation2553 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_relation2557 = new BitSet(new long[]{0x01F0001000000002L});
    public static final BitSet FOLLOW_53_in_relation2597 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_relation2601 = new BitSet(new long[]{0x01F0001000000002L});
    public static final BitSet FOLLOW_56_in_relation2641 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_relation2645 = new BitSet(new long[]{0x01F0001000000002L});
    public static final BitSet FOLLOW_relation_in_logico2711 = new BitSet(new long[]{0x0800004000000002L});
    public static final BitSet FOLLOW_38_in_logico2739 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_relation_in_logico2743 = new BitSet(new long[]{0x0800004000000002L});
    public static final BitSet FOLLOW_59_in_logico2776 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_relation_in_logico2780 = new BitSet(new long[]{0x0800004000000002L});
    public static final BitSet FOLLOW_logico_in_expression2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2877 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2882 = new BitSet(new long[]{0x0000000080780220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2897 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_llamadofuncion2909 = new BitSet(new long[]{0x0000000080580220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2916 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2929 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_llamadofuncion2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_ifstatements2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_ifstatements2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_ifstatements2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_ifstatements2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_ifstatements3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_ifstatements3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_ifstatements3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_ifstatements3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_ifstatements3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_ifstatements3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_ifstatements3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_ifstatements3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_ifstatements3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lista_texto_in_ifstatements3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_in_ifstatements3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unincremento_in_ifstatements3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_menosunincremento_in_ifstatements3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_ifstatements3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decremento_in_ifstatements3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_elsestataments3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_elsestataments3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_elsestataments3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_elsestataments3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_elsestataments3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_elsestataments3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_elsestataments3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_elsestataments3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_elsestataments3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_elsestataments3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_elsestataments3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_elsestataments3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_elsestataments3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lista_texto_in_elsestataments3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_in_elsestataments3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unincremento_in_elsestataments3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_menosunincremento_in_elsestataments3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_elsestataments3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decremento_in_elsestataments3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement3367 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3369 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3375 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3381 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3383 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement3391 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3401 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ELSEIF_in_ifstatement3410 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3412 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3416 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3422 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3424 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement3431 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3441 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement3458 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3461 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_elsestataments_in_ifstatement3472 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3480 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_print1_in_whilestatements3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_whilestatements3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_whilestatements3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_whilestatements3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_whilestatements3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_whilestatements3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_whilestatements3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_whilestatements3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_whilestatements3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_whilestatements3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_whilestatements3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_whilestatements3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_whilestatements3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lista_texto_in_whilestatements3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_in_whilestatements3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unincremento_in_whilestatements3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_menosunincremento_in_whilestatements3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_whilestatements3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decremento_in_whilestatements3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet3719 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet3721 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_logico_in_whilestatemet3725 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet3728 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet3730 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_whilestatements_in_whilestatemet3738 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatemet3769 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet3771 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_declaracion_in_forstatemet3775 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_logico_in_forstatemet3779 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3781 = new BitSet(new long[]{0x0000220080580220L});
    public static final BitSet FOLLOW_add_in_forstatemet3785 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet3790 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_forstatemet3792 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_whilestatements_in_forstatemet3800 = new BitSet(new long[]{0x000000061B09D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_forstatemet3811 = new BitSet(new long[]{0x0000000000000002L});

}