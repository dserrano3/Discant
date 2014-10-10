// $ANTLR 3.4 C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g 2014-10-09 21:08:15

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "BOOLEAN", "COMENTARIO", "COMILLASD", "COMILLASS", "DOBLE", "ELSE", "FOR", "FUNCTION", "IF", "LIST", "LLAVE_D", "LLAVE_I", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", "PC", "PRINT", "PRINTLN", "PUSH", "READ", "RETURN", "SET", "TEXTO", "VARIABLE", "WHILE", "WS", "WSOPT", "'!='", "'%'", "'&&'", "'()'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'.get('", "'.size'", "'.tamano'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'['", "']'", "'||'"
    };

    public static final int EOF=-1;
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int ASIGNACION=4;
    public static final int BOOLEAN=5;
    public static final int COMENTARIO=6;
    public static final int COMILLASD=7;
    public static final int COMILLASS=8;
    public static final int DOBLE=9;
    public static final int ELSE=10;
    public static final int FOR=11;
    public static final int FUNCTION=12;
    public static final int IF=13;
    public static final int LIST=14;
    public static final int LLAVE_D=15;
    public static final int LLAVE_I=16;
    public static final int NOMBRE=17;
    public static final int NUMERO=18;
    public static final int PARENTESIS_D=19;
    public static final int PARENTESIS_I=20;
    public static final int PC=21;
    public static final int PRINT=22;
    public static final int PRINTLN=23;
    public static final int PUSH=24;
    public static final int READ=25;
    public static final int RETURN=26;
    public static final int SET=27;
    public static final int TEXTO=28;
    public static final int VARIABLE=29;
    public static final int WHILE=30;
    public static final int WS=31;
    public static final int WSOPT=32;

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
    public String getGrammarFileName() { return "C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g"; }


    Context1 contexto = new Context1(); 
    boolean bandera = true;
    ArrayList<Context1> pila = new ArrayList<Context1>();
    public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();




    // $ANTLR start "programa"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:46:1: programa returns [StringBuilder output] : ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento | PC )+ ;
    public final StringBuilder programa() throws Exception, RecognitionException {
        StringBuilder output = null;


        Evaluator print11 =null;

        Evaluator println2 =null;

        Evaluator asignacion3 =null;

        Evaluator lectura4 =null;

        Evaluator ifstatement5 =null;

        Evaluator whilestatemet6 =null;

        Evaluator llamadofuncion7 =null;

        Evaluator declaracion_mult8 =null;

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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:47:3: ( ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento | PC )+ )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:49:3: ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento | PC )+
            {
             
               pila.add(new Context1()); 
               output = new StringBuilder();
              

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:54:3: ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento | PC )+
            int cnt1=0;
            loop1:
            do {
                int alt1=22;
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
                    case 45:
                        {
                        alt1=12;
                        }
                        break;
                    case 39:
                        {
                        alt1=17;
                        }
                        break;
                    case 43:
                        {
                        alt1=18;
                        }
                        break;
                    case 40:
                        {
                        alt1=19;
                        }
                        break;
                    case 44:
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
                    case 55:
                        {
                        alt1=14;
                        }
                        break;
                    case 47:
                    case 48:
                        {
                        alt1=16;
                        }
                        break;

                    }

                    }
                    break;
                case READ:
                    {
                    alt1=4;
                    }
                    break;
                case COMENTARIO:
                    {
                    alt1=5;
                    }
                    break;
                case IF:
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
                        int LA1_23 = input.LA(3);

                        if ( (LA1_23==ASIGNACION) ) {
                            alt1=15;
                        }
                        else if ( (LA1_23==PC||LA1_23==41) ) {
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
                case PC:
                    {
                    alt1=21;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:56:7: print1
            	    {
            	    pushFollow(FOLLOW_print1_in_programa94);
            	    print11=print1();

            	    state._fsp--;


            	    output.append((String)print11.evaluate(pila));

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:57:7: println
            	    {
            	    pushFollow(FOLLOW_println_in_programa114);
            	    println2=println();

            	    state._fsp--;


            	    output.append((String)println2.evaluate(pila));

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:58:7: asignacion
            	    {
            	    pushFollow(FOLLOW_asignacion_in_programa133);
            	    asignacion3=asignacion();

            	    state._fsp--;


            	    asignacion3.evaluate(pila);

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:59:7: lectura
            	    {
            	    pushFollow(FOLLOW_lectura_in_programa149);
            	    lectura4=lectura();

            	    state._fsp--;


            	    lectura4.evaluate(pila);

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:60:7: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_programa168);
            	    comentario();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:61:7: ifstatement
            	    {
            	    pushFollow(FOLLOW_ifstatement_in_programa176);
            	    ifstatement5=ifstatement();

            	    state._fsp--;


            	    output.append((String)ifstatement5.evaluate(pila));

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:62:7: whilestatemet
            	    {
            	    pushFollow(FOLLOW_whilestatemet_in_programa191);
            	    whilestatemet6=whilestatemet();

            	    state._fsp--;


            	    output.append((String)whilestatemet6.evaluate(pila));

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:63:7: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_programa204);
            	    funcion();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:64:7: llamadofuncion
            	    {
            	    pushFollow(FOLLOW_llamadofuncion_in_programa212);
            	    llamadofuncion7=llamadofuncion();

            	    state._fsp--;


            	    output.append((String)llamadofuncion7.evaluate(pila));

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:65:7: declaracion_mult
            	    {
            	    pushFollow(FOLLOW_declaracion_mult_in_programa225);
            	    declaracion_mult8=declaracion_mult();

            	    state._fsp--;


            	    declaracion_mult8.evaluate(pila);

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:66:7: declaracion_lista
            	    {
            	    pushFollow(FOLLOW_declaracion_lista_in_programa235);
            	    declaracion_lista9=declaracion_lista();

            	    state._fsp--;


            	    declaracion_lista9.evaluate(pila);

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:67:7: push
            	    {
            	    pushFollow(FOLLOW_push_in_programa244);
            	    push10=push();

            	    state._fsp--;


            	    push10.evaluate(pila);

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:68:7: forstatemet
            	    {
            	    pushFollow(FOLLOW_forstatemet_in_programa266);
            	    forstatemet11=forstatemet();

            	    state._fsp--;


            	    output.append((String)forstatemet11.evaluate(pila));

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:69:7: asignacion_lista
            	    {
            	    pushFollow(FOLLOW_asignacion_lista_in_programa281);
            	    asignacion_lista12=asignacion_lista();

            	    state._fsp--;


            	    asignacion_lista12.evaluate(pila);

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:70:7: lista_texto
            	    {
            	    pushFollow(FOLLOW_lista_texto_in_programa291);
            	    lista_texto13=lista_texto();

            	    state._fsp--;


            	    lista_texto13.evaluate(pila);

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:71:7: size
            	    {
            	    pushFollow(FOLLOW_size_in_programa306);
            	    size14=size();

            	    state._fsp--;


            	    size14.evaluate(pila);

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:72:7: unincremento
            	    {
            	    pushFollow(FOLLOW_unincremento_in_programa328);
            	    unincremento15=unincremento();

            	    state._fsp--;


            	    unincremento15.evaluate(pila);

            	    }
            	    break;
            	case 18 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:73:7: menosunincremento
            	    {
            	    pushFollow(FOLLOW_menosunincremento_in_programa343);
            	    menosunincremento16=menosunincremento();

            	    state._fsp--;


            	    menosunincremento16.evaluate(pila);

            	    }
            	    break;
            	case 19 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:74:7: incremento
            	    {
            	    pushFollow(FOLLOW_incremento_in_programa358);
            	    incremento17=incremento();

            	    state._fsp--;


            	    incremento17.evaluate(pila);

            	    }
            	    break;
            	case 20 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:75:7: decremento
            	    {
            	    pushFollow(FOLLOW_decremento_in_programa373);
            	    decremento18=decremento();

            	    state._fsp--;


            	    decremento18.evaluate(pila);

            	    }
            	    break;
            	case 21 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:76:7: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_programa388); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:84:3: return1 returns [Evaluator e] : RETURN te= evaluator PC ;
    public final Evaluator return1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator te =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:85:3: ( RETURN te= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:86:5: RETURN te= evaluator PC
            {
            match(input,RETURN,FOLLOW_RETURN_in_return1434); 

            pushFollow(FOLLOW_evaluator_in_return1440);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1447); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:94:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE parentesis_i ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? parentesis_d ( PC )? '{' ( PC )? (wh= statements )* '}' ;
    public final Evaluator funcion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom1=null;
        Evaluator wh =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:95:3: ( FUNCTION nom= NOMBRE parentesis_i ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? parentesis_d ( PC )? '{' ( PC )? (wh= statements )* '}' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:96:3: FUNCTION nom= NOMBRE parentesis_i ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? parentesis_d ( PC )? '{' ( PC )? (wh= statements )* '}'
            {
            e = new FuncionEvaluator();

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion485); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion491); 

            pushFollow(FOLLOW_parentesis_i_in_funcion493);
            parentesis_i();

            state._fsp--;


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:99:2: ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VARIABLE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:99:4: ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )*
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:99:4: ( VARIABLE nom1= NOMBRE )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:100:4: VARIABLE nom1= NOMBRE
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion506); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion512); 


                    	     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	  

                    }


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:105:2: ( ',' VARIABLE nom1= NOMBRE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==41) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:106:5: ',' VARIABLE nom1= NOMBRE
                    	    {
                    	    match(input,41,FOLLOW_41_in_funcion529); 

                    	    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion531); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion537); 


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


            pushFollow(FOLLOW_parentesis_d_in_funcion556);
            parentesis_d();

            state._fsp--;


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:112:15: ( PC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:112:15: PC
                    {
                    match(input,PC,FOLLOW_PC_in_funcion558); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion562); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:113:6: ( PC )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PC) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:113:6: PC
                    {
                    match(input,PC,FOLLOW_PC_in_funcion564); 

                    }
                    break;

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:115:4: (wh= statements )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMENTARIO||LA6_0==FOR||(LA6_0 >= IF && LA6_0 <= LIST)||LA6_0==NOMBRE||(LA6_0 >= PRINT && LA6_0 <= PRINTLN)||(LA6_0 >= READ && LA6_0 <= RETURN)||(LA6_0 >= VARIABLE && LA6_0 <= WHILE)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:115:5: wh= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_funcion579);
            	    wh=statements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion591); 

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



    // $ANTLR start "declaracion_mult"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:125:1: declaracion_mult returns [Evaluator e] : VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )* PC ;
    public final Evaluator declaracion_mult() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom2=null;
        Evaluator ev =null;

        Evaluator ev2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:126:3: ( VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:127:3: VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )* PC
            {
             e = new DeclaracionMultipleEvaluator(); 

            match(input,VARIABLE,FOLLOW_VARIABLE_in_declaracion_mult627); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_mult633); 

              if(bandera)
            			      ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom!=null?nom.getText():null), new DoubleEvaluator(0)); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:131:3: ( ASIGNACION ev= evaluator )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ASIGNACION) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:131:7: ASIGNACION ev= evaluator
                    {
                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion_mult649); 

                    pushFollow(FOLLOW_evaluator_in_declaracion_mult655);
                    ev=evaluator();

                    state._fsp--;


                     if(bandera)
                              { ((DeclaracionMultipleEvaluator)e).addAsigancion(ev); } 

                    }
                    break;

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:135:3: ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:135:7: ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )?
            	    {
            	    match(input,41,FOLLOW_41_in_declaracion_mult683); 

            	    nom2=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_mult695); 

            	      if(bandera)
            	              ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom2!=null?nom2.getText():null), new DoubleEvaluator(0)); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:139:4: ( ASIGNACION ev2= evaluator )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==ASIGNACION) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:139:8: ASIGNACION ev2= evaluator
            	            {
            	            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion_mult713); 

            	            pushFollow(FOLLOW_evaluator_in_declaracion_mult719);
            	            ev2=evaluator();

            	            state._fsp--;


            	             if(bandera)
            	            		        { ((DeclaracionMultipleEvaluator)e).addAsigancion(ev2); } 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_declaracion_mult749); 

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
    // $ANTLR end "declaracion_mult"



    // $ANTLR start "declaracion"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:147:1: declaracion returns [Evaluator e] : VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC ;
    public final Evaluator declaracion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:148:3: ( VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:149:3: VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_declaracion774); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion780); 

              if(bandera)
                        e = new DeclaracionEvaluator((nom!=null?nom.getText():null), new DoubleEvaluator(0)); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:152:3: ( ASIGNACION ev= evaluator )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASIGNACION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:152:7: ASIGNACION ev= evaluator
                    {
                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion799); 

                    pushFollow(FOLLOW_evaluator_in_declaracion805);
                    ev=evaluator();

                    state._fsp--;


                     if(bandera)
                              { ((DeclaracionEvaluator)e).asignar(ev); } 

                    }
                    break;

            }


            match(input,PC,FOLLOW_PC_in_declaracion829); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:159:1: unincremento returns [Evaluator e] : nom= NOMBRE '++' PC ;
    public final Evaluator unincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:160:3: (nom= NOMBRE '++' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:161:3: nom= NOMBRE '++' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_unincremento857); 

            match(input,39,FOLLOW_39_in_unincremento859); 

             
                 if(bandera){
                    e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(1));
                  }   
              

            match(input,PC,FOLLOW_PC_in_unincremento864); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:169:4: menosunincremento returns [Evaluator e] : nom= NOMBRE '--' PC ;
    public final Evaluator menosunincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:170:3: (nom= NOMBRE '--' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:171:3: nom= NOMBRE '--' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_menosunincremento896); 

            match(input,43,FOLLOW_43_in_menosunincremento898); 

             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(-1));   
              

            match(input,PC,FOLLOW_PC_in_menosunincremento907); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:179:3: incremento returns [Evaluator e] : nom= NOMBRE '+=' ev= evaluator PC ;
    public final Evaluator incremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:180:3: (nom= NOMBRE '+=' ev= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:181:3: nom= NOMBRE '+=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_incremento938); 

            match(input,40,FOLLOW_40_in_incremento940); 

            pushFollow(FOLLOW_evaluator_in_incremento945);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev);   
              

            match(input,PC,FOLLOW_PC_in_incremento956); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:189:3: decremento returns [Evaluator e] : nom= NOMBRE '-=' ev= evaluator PC ;
    public final Evaluator decremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:190:3: (nom= NOMBRE '-=' ev= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:191:3: nom= NOMBRE '-=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_decremento986); 

            match(input,44,FOLLOW_44_in_decremento988); 

            pushFollow(FOLLOW_evaluator_in_decremento993);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev, true);   
              

            match(input,PC,FOLLOW_PC_in_decremento1004); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:201:3: declaracion_lista returns [Evaluator e] : LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC ;
    public final Evaluator declaracion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom2=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:202:3: ( LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:203:3: LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC
            {
             e = new DeclaracionMultipleEvaluator(); 

            match(input,LIST,FOLLOW_LIST_in_declaracion_lista1043); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista1047); 


                                              if(bandera)
                                                {
                                                    ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom!=null?nom.getText():null), new ListEvaluator());   
                                                }
                                             

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:211:3: ( ',' nom2= NOMBRE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:211:7: ',' nom2= NOMBRE
            	    {
            	    match(input,41,FOLLOW_41_in_declaracion_lista1090); 

            	    nom2=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista1102); 


            	                                      if(bandera)
            	                                        {
            	                                            ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom2!=null?nom2.getText():null), new ListEvaluator());      
            	                                        }
            	                                     

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_declaracion_lista1179); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:224:1: lista_texto returns [Evaluator e] : LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC ;
    public final Evaluator lista_texto() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token tex=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:225:3: ( LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:226:3: LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC
            {
            match(input,LIST,FOLLOW_LIST_in_lista_texto1205); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lista_texto1209); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_lista_texto1211); 

            match(input,READ,FOLLOW_READ_in_lista_texto1213); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_lista_texto1215); 

            tex=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_lista_texto1219); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_lista_texto1221); 


                                              if(bandera)
                                                {
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),(new ListFromTextEvaluator((tex!=null?tex.getText():null))).evaluate(pila));   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_lista_texto1294); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:237:1: push returns [Evaluator e] : nom= NOMBRE '.' PUSH '(' exp= expression ')' PC ;
    public final Evaluator push() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:238:3: (nom= NOMBRE '.' PUSH '(' exp= expression ')' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:239:3: nom= NOMBRE '.' PUSH '(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push1322); 

            match(input,45,FOLLOW_45_in_push1324); 

            match(input,PUSH,FOLLOW_PUSH_in_push1326); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_push1328); 

            pushFollow(FOLLOW_expression_in_push1334);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push1336); 


                                              if(bandera)
                                                {
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push1406); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:249:1: size returns [Evaluator e] : nom= NOMBRE size1 ( '()' )* PC ;
    public final Evaluator size() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:250:3: (nom= NOMBRE size1 ( '()' )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:251:3: nom= NOMBRE size1 ( '()' )* PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_size1434); 

            pushFollow(FOLLOW_size1_in_size1437);
            size1();

            state._fsp--;


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:251:21: ( '()' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:251:22: '()'
            	    {
            	    match(input,36,FOLLOW_36_in_size1440); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



                                              if(bandera)
                                                {
                                                    e = new SizeEvaluator((nom!=null?nom.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_size1512); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:263:1: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:264:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:265:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion1547); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion1549); 

            pushFollow(FOLLOW_evaluator_in_asignacion1555);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);       
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion1595); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:277:1: asignacion_lista returns [Evaluator e] : nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC ;
    public final Evaluator asignacion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token num=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:278:3: (nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:279:4: nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion_lista1623); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:280:4: ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==55) ) {
                alt13=1;
            }
            else if ( (LA13_0==SET) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:280:7: '[' num= NUMERO ']' ASIGNACION ev= evaluator
                    {
                    match(input,55,FOLLOW_55_in_asignacion_lista1632); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1636); 

                    match(input,56,FOLLOW_56_in_asignacion_lista1638); 

                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion_lista1640); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1646);
                    ev=evaluator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:281:7: SET '(' num= NUMERO ',' ev= evaluator ')'
                    {
                    match(input,SET,FOLLOW_SET_in_asignacion_lista1654); 

                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_asignacion_lista1656); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1660); 

                    match(input,41,FOLLOW_41_in_asignacion_lista1662); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1668);
                    ev=evaluator();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_asignacion_lista1670); 

                    }
                    break;

            }



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionListaEvaluator((nom!=null?nom.getText():null),ev, (num!=null?num.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion_lista1716); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:295:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:296:3: ( COMENTARIO )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:297:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario1734); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:300:1: lectura returns [Evaluator e] : r= READ n= NOMBRE ( ',' exp= expression )? PC ;
    public final Evaluator lectura() throws Exception, RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:301:3: (r= READ n= NOMBRE ( ',' exp= expression )? PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:302:3: r= READ n= NOMBRE ( ',' exp= expression )? PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura1760); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura1764); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:310:3: ( ',' exp= expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:311:7: ',' exp= expression
                    {
                    match(input,41,FOLLOW_41_in_lectura1796); 

                    pushFollow(FOLLOW_expression_in_lectura1802);
                    exp=expression();

                    state._fsp--;


                     
                                  if(bandera)
                                        { 
                                            ((ReadEvaluator)e).addText(exp);
                                        }
                                 
                                 

                    }
                    break;

            }


            match(input,PC,FOLLOW_PC_in_lectura1836); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:323:1: print1 returns [Evaluator e] : PRINT (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator print1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:324:3: ( PRINT (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:325:3: PRINT (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintEvaluator(); 

            match(input,PRINT,FOLLOW_PRINT_in_print11865); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:327:3: (exp= expression )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:327:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_print11876);
            exp=expression();

            state._fsp--;


             ((PrintEvaluator)e).addEvaluator(exp); 

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:329:3: ( ',' exp= expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:329:5: ',' exp= expression
            	    {
            	    match(input,41,FOLLOW_41_in_print11888); 

            	    pushFollow(FOLLOW_expression_in_print11898);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_print11909); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:335:1: println returns [Evaluator e] : PRINTLN (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator println() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:336:3: ( PRINTLN (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:337:3: PRINTLN (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintlnEvaluator(); 

            match(input,PRINTLN,FOLLOW_PRINTLN_in_println1938); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:339:3: (exp= expression )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:339:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_println1948);
            exp=expression();

            state._fsp--;


             ((PrintlnEvaluator)e).addEvaluator(exp); 

            }


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:341:3: ( ',' exp= expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:341:5: ',' exp= expression
            	    {
            	    match(input,41,FOLLOW_41_in_println1960); 

            	    pushFollow(FOLLOW_expression_in_println1970);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintlnEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_println1981); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:347:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico19 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:348:3: ( logico )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:349:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator2006);
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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:355:1: term returns [Evaluator e] : (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE size1 ( '()' )* |nom= NOMBRE '++' |nom= NOMBRE '--' );
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
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:356:3: (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE size1 ( '()' )* |nom= NOMBRE '++' |nom= NOMBRE '--' )
            int alt19=11;
            switch ( input.LA(1) ) {
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt19=10;
                    }
                    break;
                case 43:
                    {
                    alt19=11;
                    }
                    break;
                case PARENTESIS_I:
                    {
                    alt19=1;
                    }
                    break;
                case PARENTESIS_D:
                case PC:
                case 33:
                case 34:
                case 35:
                case 37:
                case 38:
                case 41:
                case 42:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 56:
                case 57:
                    {
                    alt19=3;
                    }
                    break;
                case 46:
                case 55:
                    {
                    alt19=8;
                    }
                    break;
                case 47:
                case 48:
                    {
                    alt19=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

                }
                break;
            case BOOLEAN:
                {
                alt19=2;
                }
                break;
            case NUMERO:
                {
                alt19=4;
                }
                break;
            case DOBLE:
                {
                alt19=5;
                }
                break;
            case TEXTO:
                {
                alt19=6;
                }
                break;
            case PARENTESIS_I:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:358:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term2052);
                    lla=llamadofuncion();

                    state._fsp--;



                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:366:5: BOOLEAN
                    {
                    BOOLEAN20=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_term2072); 


                               e = new BooleanEvaluator(((BOOLEAN20!=null?BOOLEAN20.getText():null))); 
                              

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:370:5: NOMBRE
                    {
                    NOMBRE21=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2091); 

                       
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE21!=null?NOMBRE21.getText():null)));//((pila.peek().get((NOMBRE21!=null?NOMBRE21.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:376:5: NUMERO
                    {
                    NUMERO22=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term2109); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO22!=null?NUMERO22.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:380:5: DOBLE
                    {
                    DOBLE23=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term2128); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE23!=null?DOBLE23.getText():null)));
                              

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:385:5: TEXTO
                    {
                    TEXTO24=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term2162); 


                              e = new StringEvaluator(((TEXTO24!=null?TEXTO24.getText():null)));
                             

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:390:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term2183); 

                    pushFollow(FOLLOW_add_in_term2185);
                    add25=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term2187); 


                                           e = add25;
                                          

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:394:5: nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' )
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2220); 

                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:395:5: ( '.get(' num= add ')' | '[' num= add ']' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==46) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==55) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:395:7: '.get(' num= add ')'
                            {
                            match(input,46,FOLLOW_46_in_term2229); 

                            pushFollow(FOLLOW_add_in_term2235);
                            num=add();

                            state._fsp--;


                            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term2237); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:396:7: '[' num= add ']'
                            {
                            match(input,55,FOLLOW_55_in_term2245); 

                            pushFollow(FOLLOW_add_in_term2255);
                            num=add();

                            state._fsp--;


                            match(input,56,FOLLOW_56_in_term2257); 

                            }
                            break;

                    }



                                    e = new GetEvaluator((nom!=null?nom.getText():null),num);     
                             

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:401:5: nom= NOMBRE size1 ( '()' )*
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2282); 

                    pushFollow(FOLLOW_size1_in_term2285);
                    size1();

                    state._fsp--;


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:401:23: ( '()' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==36) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:401:24: '()'
                    	    {
                    	    match(input,36,FOLLOW_36_in_term2288); 

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);



                                      e = new SizeEvaluator((nom!=null?nom.getText():null));
                                

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:405:5: nom= NOMBRE '++'
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2312); 

                    match(input,39,FOLLOW_39_in_term2314); 

                     
                            e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(1));
                          

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:409:5: nom= NOMBRE '--'
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2331); 

                    match(input,43,FOLLOW_43_in_term2333); 

                     
                            e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(-1));
                          

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:417:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator term26 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:418:3: ( ( '+' | '-' )* term )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:420:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:423:3: ( '+' | '-' )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }
                else if ( (LA20_0==42) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:424:7: '+'
            	    {
            	    match(input,38,FOLLOW_38_in_unary2386); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:425:7: '-'
            	    {
            	    match(input,42,FOLLOW_42_in_unary2394); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary2415);
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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:438:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* ;
    public final Evaluator mult() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:439:3: (op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:440:6: op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult2452);
            op1=unary();

            state._fsp--;


            e = op1;

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:441:3: ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            loop21:
            do {
                int alt21=4;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt21=1;
                    }
                    break;
                case 49:
                    {
                    alt21=2;
                    }
                    break;
                case 34:
                    {
                    alt21=3;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:441:6: '*' op2= unary
            	    {
            	    match(input,37,FOLLOW_37_in_mult2461); 

            	    pushFollow(FOLLOW_unary_in_mult2465);
            	    op2=unary();

            	    state._fsp--;


            	    e = new TimesEvaluator(e,op2);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:442:6: '/' op2= unary
            	    {
            	    match(input,49,FOLLOW_49_in_mult2473); 

            	    pushFollow(FOLLOW_unary_in_mult2477);
            	    op2=unary();

            	    state._fsp--;


            	    e = new DivideEvaluator(e,op2);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:443:6: '%' op2= unary
            	    {
            	    match(input,34,FOLLOW_34_in_mult2486); 

            	    pushFollow(FOLLOW_unary_in_mult2490);
            	    op2=unary();

            	    state._fsp--;


            	    e = new ModEvaluator(e,op2); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:447:1: add returns [Evaluator e] : op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )* ;
    public final Evaluator add() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:448:3: (op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:449:5: op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )*
            {
            pushFollow(FOLLOW_mult_in_add2524);
            op1=mult();

            state._fsp--;


            e = op1;

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:450:3: ( ( '+' op2= mult ) | ( minus op2= mult ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }
                else if ( (LA22_0==42) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:451:3: ( '+' op2= mult )
            	    {
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:451:3: ( '+' op2= mult )
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:451:5: '+' op2= mult
            	    {
            	    match(input,38,FOLLOW_38_in_add2536); 

            	    pushFollow(FOLLOW_mult_in_add2540);
            	    op2=mult();

            	    state._fsp--;


            	    e = new PlusEvaluator(e, op2);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:453:5: ( minus op2= mult )
            	    {
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:453:5: ( minus op2= mult )
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:453:6: minus op2= mult
            	    {
            	    pushFollow(FOLLOW_minus_in_add2553);
            	    minus();

            	    state._fsp--;


            	    pushFollow(FOLLOW_mult_in_add2557);
            	    op2=mult();

            	    state._fsp--;


            	    e = new MinusEvaluator(e, op2);

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:458:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:459:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:460:5: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation2595);
            ex1=add();

            state._fsp--;


            e = ex1;

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:461:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33||(LA24_0 >= 50 && LA24_0 <= 54)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:462:3: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:462:3: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt23=6;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt23=5;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt23=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:463:5: '==' ex2= add
            	            {
            	            match(input,52,FOLLOW_52_in_relation2611); 

            	            pushFollow(FOLLOW_add_in_relation2615);
            	            ex2=add();

            	            state._fsp--;


            	            e = new IgualIgualEvaluator(e,ex2);

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:464:5: '>' ex2= add
            	            {
            	            match(input,53,FOLLOW_53_in_relation2623); 

            	            pushFollow(FOLLOW_add_in_relation2627);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MayorEvaluator(e,ex2);

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:465:5: '<' ex2= add
            	            {
            	            match(input,50,FOLLOW_50_in_relation2638); 

            	            pushFollow(FOLLOW_add_in_relation2642);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MenorEvaluator(e,ex2);

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:466:5: '!=' ex2= add
            	            {
            	            match(input,33,FOLLOW_33_in_relation2653); 

            	            pushFollow(FOLLOW_add_in_relation2657);
            	            ex2=add();

            	            state._fsp--;


            	            e = new DiferenteEvaluator(e,ex2);

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:467:5: '<=' ex2= add
            	            {
            	            match(input,51,FOLLOW_51_in_relation2667); 

            	            pushFollow(FOLLOW_add_in_relation2671);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MenorIgualEvaluator(e,ex2);

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:468:5: '>=' ex2= add
            	            {
            	            match(input,54,FOLLOW_54_in_relation2681); 

            	            pushFollow(FOLLOW_add_in_relation2685);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MayorIgualEvaluator(e,ex2);

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:473:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:474:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:475:5: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico2725);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:479:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }
                else if ( (LA25_0==57) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:480:5: '&&' rel2= relation
            	    {
            	    match(input,35,FOLLOW_35_in_logico2753); 

            	    pushFollow(FOLLOW_relation_in_logico2757);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:484:6: '||' rel2= relation
            	    {
            	    match(input,57,FOLLOW_57_in_logico2789); 

            	    pushFollow(FOLLOW_relation_in_logico2793);
            	    rel2=relation();

            	    state._fsp--;



            	                             e = new OrEvaluator(e,rel2);
            	                            

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:491:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico27 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:492:2: ( logico )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:492:6: logico
            {
            pushFollow(FOLLOW_logico_in_expression2849);
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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:496:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC ;
    public final Evaluator llamadofuncion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:497:4: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:498:9: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2884); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2889); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:500:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==BOOLEAN||LA27_0==DOBLE||(LA27_0 >= NOMBRE && LA27_0 <= NUMERO)||LA27_0==PARENTESIS_I||LA27_0==TEXTO) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:500:9: (ev= term ) ( ',' ev= term )*
                    {
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:500:9: (ev= term )
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:500:10: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2904);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev); 

                    }


                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:502:4: ( ',' ev= term )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==41) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:502:5: ',' ev= term
                    	    {
                    	    match(input,41,FOLLOW_41_in_llamadofuncion2916); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2923);
                    	    ev=term();

                    	    state._fsp--;


                    	    ((FuncionEvaluator) e).llenarParametro(ev); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2936); 

            match(input,PC,FOLLOW_PC_in_llamadofuncion2947); 

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



    // $ANTLR start "statements"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:508:1: statements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | ifstatement | whilestatemet | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento );
    public final Evaluator statements() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator print128 =null;

        Evaluator println29 =null;

        Evaluator asignacion30 =null;

        Evaluator lectura31 =null;

        Evaluator return132 =null;

        Evaluator ifstatement33 =null;

        Evaluator whilestatemet34 =null;

        Evaluator llamadofuncion35 =null;

        Evaluator declaracion_mult36 =null;

        Evaluator declaracion_lista37 =null;

        Evaluator push38 =null;

        Evaluator forstatemet39 =null;

        Evaluator asignacion_lista40 =null;

        Evaluator lista_texto41 =null;

        Evaluator size42 =null;

        Evaluator unincremento43 =null;

        Evaluator menosunincremento44 =null;

        Evaluator incremento45 =null;

        Evaluator decremento46 =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:509:3: ( print1 | println | asignacion | lectura | comentario | return1 | ifstatement | whilestatemet | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )
            int alt28=20;
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
                case 45:
                    {
                    alt28=12;
                    }
                    break;
                case 39:
                    {
                    alt28=17;
                    }
                    break;
                case 43:
                    {
                    alt28=18;
                    }
                    break;
                case 40:
                    {
                    alt28=19;
                    }
                    break;
                case 44:
                    {
                    alt28=20;
                    }
                    break;
                case PARENTESIS_I:
                    {
                    alt28=9;
                    }
                    break;
                case SET:
                case 55:
                    {
                    alt28=14;
                    }
                    break;
                case 47:
                case 48:
                    {
                    alt28=16;
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
            case IF:
                {
                alt28=7;
                }
                break;
            case WHILE:
                {
                alt28=8;
                }
                break;
            case VARIABLE:
                {
                alt28=10;
                }
                break;
            case LIST:
                {
                int LA28_10 = input.LA(2);

                if ( (LA28_10==NOMBRE) ) {
                    int LA28_21 = input.LA(3);

                    if ( (LA28_21==ASIGNACION) ) {
                        alt28=15;
                    }
                    else if ( (LA28_21==PC||LA28_21==41) ) {
                        alt28=11;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 21, input);

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
                alt28=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:510:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_statements2981);
                    print128=print1();

                    state._fsp--;


                    e = print128;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:511:5: println
                    {
                    pushFollow(FOLLOW_println_in_statements3001);
                    println29=println();

                    state._fsp--;


                    e = println29;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:512:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_statements3020);
                    asignacion30=asignacion();

                    state._fsp--;


                    e = asignacion30;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:513:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_statements3035);
                    lectura31=lectura();

                    state._fsp--;


                    e = lectura31;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:514:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_statements3054);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:515:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_statements3069);
                    return132=return1();

                    state._fsp--;


                    e = return132;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:516:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statements3087);
                    ifstatement33=ifstatement();

                    state._fsp--;


                    e = ifstatement33;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:517:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_statements3102);
                    whilestatemet34=whilestatemet();

                    state._fsp--;


                    e = whilestatemet34;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:518:5: llamadofuncion
                    {
                    pushFollow(FOLLOW_llamadofuncion_in_statements3114);
                    llamadofuncion35=llamadofuncion();

                    state._fsp--;


                    e = llamadofuncion35;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:519:5: declaracion_mult
                    {
                    pushFollow(FOLLOW_declaracion_mult_in_statements3126);
                    declaracion_mult36=declaracion_mult();

                    state._fsp--;


                    e = declaracion_mult36;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:520:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_statements3135);
                    declaracion_lista37=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista37;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:521:5: push
                    {
                    pushFollow(FOLLOW_push_in_statements3143);
                    push38=push();

                    state._fsp--;


                    e = push38;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:522:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_statements3164);
                    forstatemet39=forstatemet();

                    state._fsp--;


                    e = forstatemet39;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:523:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_statements3178);
                    asignacion_lista40=asignacion_lista();

                    state._fsp--;


                    e = asignacion_lista40;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:524:5: lista_texto
                    {
                    pushFollow(FOLLOW_lista_texto_in_statements3187);
                    lista_texto41=lista_texto();

                    state._fsp--;


                    e = lista_texto41;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:525:5: size
                    {
                    pushFollow(FOLLOW_size_in_statements3201);
                    size42=size();

                    state._fsp--;


                    e = size42;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:526:5: unincremento
                    {
                    pushFollow(FOLLOW_unincremento_in_statements3222);
                    unincremento43=unincremento();

                    state._fsp--;


                    e = unincremento43;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:527:5: menosunincremento
                    {
                    pushFollow(FOLLOW_menosunincremento_in_statements3235);
                    menosunincremento44=menosunincremento();

                    state._fsp--;


                    e = menosunincremento44;

                    }
                    break;
                case 19 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:528:5: incremento
                    {
                    pushFollow(FOLLOW_incremento_in_statements3243);
                    incremento45=incremento();

                    state._fsp--;


                    e = incremento45;

                    }
                    break;
                case 20 :
                    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:529:5: decremento
                    {
                    pushFollow(FOLLOW_decremento_in_statements3258);
                    decremento46=decremento();

                    state._fsp--;


                    e = decremento46;

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
    // $ANTLR end "statements"



    // $ANTLR start "ifstatement"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:532:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D ( ( PC )* ELSE IF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D )* ( ( PC )* ELSE ( PC )* LLAVE_I ( PC )* (elses= statements ( PC )* )* LLAVE_D )* ;
    public final Evaluator ifstatement() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:533:3: ( IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D ( ( PC )* ELSE IF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D )* ( ( PC )* ELSE ( PC )* LLAVE_I ( PC )* (elses= statements ( PC )* )* LLAVE_D )* )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:534:3: IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D ( ( PC )* ELSE IF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D )* ( ( PC )* ELSE ( PC )* LLAVE_I ( PC )* (elses= statements ( PC )* )* LLAVE_D )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement3290); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3292); 

            pushFollow(FOLLOW_logico_in_ifstatement3298);
            rel=logico();

            state._fsp--;



            			  e = new IfEvaluator ();   
            			  ((IfEvaluator) e).agregarCondicion(rel);
            			

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3306); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:539:15: ( PC )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==PC) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:539:15: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_ifstatement3308); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3311); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:539:27: ( PC )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==PC) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:539:27: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_ifstatement3313); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:540:3: (ifs= statements ( PC )* )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMENTARIO||LA32_0==FOR||(LA32_0 >= IF && LA32_0 <= LIST)||LA32_0==NOMBRE||(LA32_0 >= PRINT && LA32_0 <= PRINTLN)||(LA32_0 >= READ && LA32_0 <= RETURN)||(LA32_0 >= VARIABLE && LA32_0 <= WHILE)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:540:4: ifs= statements ( PC )*
            	    {
            	    pushFollow(FOLLOW_statements_in_ifstatement3324);
            	    ifs=statements();

            	    state._fsp--;



            	    		   ((IfEvaluator) e).agregarCoso(ifs);   
            	    		  
            	    		 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:545:4: ( PC )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==PC) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:545:4: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_ifstatement3336); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3348); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:550:3: ( ( PC )* ELSE IF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:550:4: ( PC )* ELSE IF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D
            	    {
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:550:4: ( PC )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==PC) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:550:4: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_ifstatement3358); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);


            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement3361); 

            	    match(input,IF,FOLLOW_IF_in_ifstatement3363); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3365); 

            	    pushFollow(FOLLOW_logico_in_ifstatement3369);
            	    rel1=logico();

            	    state._fsp--;



            	    			 ((IfEvaluator) e).nuevoSegmento();
            	    			 ((IfEvaluator) e).agregarCondicion(rel1); 
            	    			

            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3377); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:555:15: ( PC )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==PC) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:555:15: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_ifstatement3379); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);


            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3382); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:555:27: ( PC )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==PC) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:555:27: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_ifstatement3384); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);


            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:556:3: (ifs= statements ( PC )* )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==COMENTARIO||LA37_0==FOR||(LA37_0 >= IF && LA37_0 <= LIST)||LA37_0==NOMBRE||(LA37_0 >= PRINT && LA37_0 <= PRINTLN)||(LA37_0 >= READ && LA37_0 <= RETURN)||(LA37_0 >= VARIABLE && LA37_0 <= WHILE)) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:557:5: ifs= statements ( PC )*
            	    	    {
            	    	    pushFollow(FOLLOW_statements_in_ifstatement3398);
            	    	    ifs=statements();

            	    	    state._fsp--;



            	    	    		   ((IfEvaluator) e).agregarCoso(ifs);   
            	    	    		 

            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:561:4: ( PC )*
            	    	    loop36:
            	    	    do {
            	    	        int alt36=2;
            	    	        int LA36_0 = input.LA(1);

            	    	        if ( (LA36_0==PC) ) {
            	    	            alt36=1;
            	    	        }


            	    	        switch (alt36) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:561:4: PC
            	    	    	    {
            	    	    	    match(input,PC,FOLLOW_PC_in_ifstatement3410); 

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop36;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3420); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:565:3: ( ( PC )* ELSE ( PC )* LLAVE_I ( PC )* (elses= statements ( PC )* )* LLAVE_D )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:565:4: ( PC )* ELSE ( PC )* LLAVE_I ( PC )* (elses= statements ( PC )* )* LLAVE_D
            	    {
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:565:4: ( PC )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==PC) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:565:4: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_ifstatement3430); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);


            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement3433); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:565:13: ( PC )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==PC) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:565:13: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_ifstatement3435); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);


            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3440); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:566:11: ( PC )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==PC) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:566:11: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_ifstatement3442); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);


            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:566:14: (elses= statements ( PC )* )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==COMENTARIO||LA43_0==FOR||(LA43_0 >= IF && LA43_0 <= LIST)||LA43_0==NOMBRE||(LA43_0 >= PRINT && LA43_0 <= PRINTLN)||(LA43_0 >= READ && LA43_0 <= RETURN)||(LA43_0 >= VARIABLE && LA43_0 <= WHILE)) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:567:5: elses= statements ( PC )*
            	    	    {
            	    	    pushFollow(FOLLOW_statements_in_ifstatement3454);
            	    	    elses=statements();

            	    	    state._fsp--;


            	    	     ((IfEvaluator)e).agregarCosoElse(elses); 

            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:569:3: ( PC )*
            	    	    loop42:
            	    	    do {
            	    	        int alt42=2;
            	    	        int LA42_0 = input.LA(1);

            	    	        if ( (LA42_0==PC) ) {
            	    	            alt42=1;
            	    	        }


            	    	        switch (alt42) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:569:3: PC
            	    	    	    {
            	    	    	    match(input,PC,FOLLOW_PC_in_ifstatement3464); 

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop42;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3473); 

            	    }
            	    break;

            	default :
            	    break loop44;
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



    // $ANTLR start "whilestatemet"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:575:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (wh= statements ( PC )* )* LLAVE_D ;
    public final Evaluator whilestatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:576:4: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (wh= statements ( PC )* )* LLAVE_D )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:577:4: WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (wh= statements ( PC )* )* LLAVE_D
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet3512); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet3514); 

            pushFollow(FOLLOW_logico_in_whilestatemet3518);
            rel=logico();

            state._fsp--;


             e = new WhileEvaluator(rel); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet3530); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:579:16: ( PC )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==PC) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:579:16: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_whilestatemet3532); 

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet3535); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:579:28: ( PC )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==PC) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:579:28: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_whilestatemet3537); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:580:3: (wh= statements ( PC )* )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMENTARIO||LA48_0==FOR||(LA48_0 >= IF && LA48_0 <= LIST)||LA48_0==NOMBRE||(LA48_0 >= PRINT && LA48_0 <= PRINTLN)||(LA48_0 >= READ && LA48_0 <= RETURN)||(LA48_0 >= VARIABLE && LA48_0 <= WHILE)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:580:4: wh= statements ( PC )*
            	    {
            	    pushFollow(FOLLOW_statements_in_whilestatemet3547);
            	    wh=statements();

            	    state._fsp--;


            	     ((WhileEvaluator) e).add(wh); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:582:6: ( PC )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==PC) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:582:6: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_whilestatemet3561); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet3574); 

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
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:589:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D ( PC )* LLAVE_I ( PC )* (wh= statements ( PC )* )* LLAVE_D ;
    public final Evaluator forstatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator decl =null;

        Evaluator logi =null;

        Evaluator aumento =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:590:3: ( FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D ( PC )* LLAVE_I ( PC )* (wh= statements ( PC )* )* LLAVE_D )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:591:3: FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D ( PC )* LLAVE_I ( PC )* (wh= statements ( PC )* )* LLAVE_D
            {
            match(input,FOR,FOLLOW_FOR_in_forstatemet3599); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet3601); 

            pushFollow(FOLLOW_declaracion_in_forstatemet3605);
            decl=declaracion();

            state._fsp--;


            pushFollow(FOLLOW_logico_in_forstatemet3609);
            logi=logico();

            state._fsp--;


            match(input,PC,FOLLOW_PC_in_forstatemet3611); 

            pushFollow(FOLLOW_add_in_forstatemet3615);
            aumento=add();

            state._fsp--;


             e = new ForEvaluator(decl, logi, aumento); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet3629); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:593:16: ( PC )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==PC) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:593:16: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_forstatemet3631); 

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet3634); 

            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:593:28: ( PC )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==PC) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:593:28: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_forstatemet3636); 

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:594:3: (wh= statements ( PC )* )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMENTARIO||LA52_0==FOR||(LA52_0 >= IF && LA52_0 <= LIST)||LA52_0==NOMBRE||(LA52_0 >= PRINT && LA52_0 <= PRINTLN)||(LA52_0 >= READ && LA52_0 <= RETURN)||(LA52_0 >= VARIABLE && LA52_0 <= WHILE)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:594:4: wh= statements ( PC )*
            	    {
            	    pushFollow(FOLLOW_statements_in_forstatemet3646);
            	    wh=statements();

            	    state._fsp--;


            	     ((ForEvaluator) e).add(wh); 

            	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:596:7: ( PC )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==PC) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:596:7: PC
            	    	    {
            	    	    match(input,PC,FOLLOW_PC_in_forstatemet3662); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet3672); 

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



    // $ANTLR start "minus"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:668:1: minus : '-' ;
    public final void minus() throws RecognitionException {
        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:669:4: ( '-' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:670:4: '-'
            {
            match(input,42,FOLLOW_42_in_minus4035); 

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
    // $ANTLR end "minus"



    // $ANTLR start "parentesis_d"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:678:3: parentesis_d : ')' ;
    public final void parentesis_d() throws RecognitionException {
        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:679:3: ( ')' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:680:3: ')'
            {
            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_parentesis_d4070); 

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
    // $ANTLR end "parentesis_d"



    // $ANTLR start "parentesis_i"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:688:3: parentesis_i : '(' ;
    public final void parentesis_i() throws RecognitionException {
        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:689:3: ( '(' )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:690:3: '('
            {
            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_parentesis_i4104); 

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
    // $ANTLR end "parentesis_i"



    // $ANTLR start "size1"
    // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:731:1: size1 : ( '.tamano' | '.size' ) ;
    public final void size1() throws RecognitionException {
        try {
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:731:6: ( ( '.tamano' | '.size' ) )
            // C:\\Users\\Daniel\\Google Drive\\lenguaje\\virtual_judge\\Discant\\target\\classes\\Lenguaje.g:
            {
            if ( (input.LA(1) >= 47 && input.LA(1) <= 48) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "size1"

    // Delegated rules


    protected DFA38 dfa38 = new DFA38(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA38_eotS =
        "\5\uffff";
    static final String DFA38_eofS =
        "\2\3\3\uffff";
    static final String DFA38_minS =
        "\2\6\1\15\2\uffff";
    static final String DFA38_maxS =
        "\2\36\1\25\2\uffff";
    static final String DFA38_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA38_specialS =
        "\5\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\3\3\uffff\1\2\5\3\1\uffff\1\3\3\uffff\1\1\2\3\1\uffff\2\3"+
            "\2\uffff\2\3",
            "\1\3\3\uffff\1\2\5\3\1\uffff\1\3\3\uffff\1\1\2\3\1\uffff\2"+
            "\3\2\uffff\2\3",
            "\1\4\2\uffff\1\3\4\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 550:3: ( ( PC )* ELSE IF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )* LLAVE_I ( PC )* (ifs= statements ( PC )* )* LLAVE_D )*";
        }
    }
    static final String DFA44_eotS =
        "\4\uffff";
    static final String DFA44_eofS =
        "\1\1\1\uffff\1\1\1\uffff";
    static final String DFA44_minS =
        "\1\6\1\uffff\1\6\1\uffff";
    static final String DFA44_maxS =
        "\1\36\1\uffff\1\36\1\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA44_specialS =
        "\4\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\3\uffff\1\3\5\1\1\uffff\1\1\3\uffff\1\2\2\1\1\uffff\2\1"+
            "\2\uffff\2\1",
            "",
            "\1\1\3\uffff\1\3\5\1\1\uffff\1\1\3\uffff\1\2\2\1\1\uffff\2"+
            "\1\2\uffff\2\1",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "()* loopback of 565:3: ( ( PC )* ELSE ( PC )* LLAVE_I ( PC )* (elses= statements ( PC )* )* LLAVE_D )*";
        }
    }
 

    public static final BitSet FOLLOW_print1_in_programa94 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_println_in_programa114 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_asignacion_in_programa133 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_lectura_in_programa149 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_comentario_in_programa168 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_ifstatement_in_programa176 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_whilestatemet_in_programa191 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_funcion_in_programa204 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_llamadofuncion_in_programa212 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_declaracion_mult_in_programa225 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_declaracion_lista_in_programa235 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_push_in_programa244 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_forstatemet_in_programa266 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_asignacion_lista_in_programa281 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_lista_texto_in_programa291 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_size_in_programa306 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_unincremento_in_programa328 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_menosunincremento_in_programa343 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_incremento_in_programa358 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_decremento_in_programa373 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_PC_in_programa388 = new BitSet(new long[]{0x0000000062E27842L});
    public static final BitSet FOLLOW_RETURN_in_return1434 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_return1440 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_return1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion485 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion491 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parentesis_i_in_funcion493 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion506 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion512 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_41_in_funcion529 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion531 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion537 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_parentesis_d_in_funcion556 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_PC_in_funcion558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion562 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_funcion564 = new BitSet(new long[]{0x0000000066C2E840L});
    public static final BitSet FOLLOW_statements_in_funcion579 = new BitSet(new long[]{0x0000000066C2E840L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_declaracion_mult627 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_mult633 = new BitSet(new long[]{0x0000020000200010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion_mult649 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion_mult655 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41_in_declaracion_mult683 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_mult695 = new BitSet(new long[]{0x0000020000200010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion_mult713 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion_mult719 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion_mult749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_declaracion774 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion780 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion799 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion805 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_unincremento857 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_unincremento859 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_unincremento864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_menosunincremento896 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_menosunincremento898 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_menosunincremento907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_incremento938 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_incremento940 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_incremento945 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_incremento956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_decremento986 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_decremento988 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_decremento993 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_decremento1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_declaracion_lista1043 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista1047 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41_in_declaracion_lista1090 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista1102 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_lista_texto1205 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_lista_texto1209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_lista_texto1211 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_READ_in_lista_texto1213 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_lista_texto1215 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_TEXTO_in_lista_texto1219 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_lista_texto1221 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_lista_texto1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push1322 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_push1324 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_PUSH_in_push1326 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_push1328 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_expression_in_push1334 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push1336 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_push1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_size1434 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_size1_in_size1437 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_36_in_size1440 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_PC_in_size1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion1547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion1549 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion1555 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_asignacion1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion_lista1623 = new BitSet(new long[]{0x0080000008000000L});
    public static final BitSet FOLLOW_55_in_asignacion_lista1632 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1636 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_asignacion_lista1638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion_lista1640 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1646 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SET_in_asignacion_lista1654 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_asignacion_lista1656 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1660 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_asignacion_lista1662 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1668 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_asignacion_lista1670 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_asignacion_lista1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura1760 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura1764 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41_in_lectura1796 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_expression_in_lectura1802 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_lectura1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print11865 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_expression_in_print11876 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41_in_print11888 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_expression_in_print11898 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_PC_in_print11909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println1938 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_expression_in_println1948 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41_in_println1960 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_expression_in_println1970 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_PC_in_println1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_term2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term2183 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_term2185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2220 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_46_in_term2229 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_term2235 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_term2245 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_term2255 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_term2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2282 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_size1_in_term2285 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_term2288 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2312 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_term2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2331 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_term2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_unary2386 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_42_in_unary2394 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_term_in_unary2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult2452 = new BitSet(new long[]{0x0002002400000002L});
    public static final BitSet FOLLOW_37_in_mult2461 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_unary_in_mult2465 = new BitSet(new long[]{0x0002002400000002L});
    public static final BitSet FOLLOW_49_in_mult2473 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_unary_in_mult2477 = new BitSet(new long[]{0x0002002400000002L});
    public static final BitSet FOLLOW_34_in_mult2486 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_unary_in_mult2490 = new BitSet(new long[]{0x0002002400000002L});
    public static final BitSet FOLLOW_mult_in_add2524 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_38_in_add2536 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_mult_in_add2540 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_minus_in_add2553 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_mult_in_add2557 = new BitSet(new long[]{0x0000044000000002L});
    public static final BitSet FOLLOW_add_in_relation2595 = new BitSet(new long[]{0x007C000200000002L});
    public static final BitSet FOLLOW_52_in_relation2611 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_relation2615 = new BitSet(new long[]{0x007C000200000002L});
    public static final BitSet FOLLOW_53_in_relation2623 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_relation2627 = new BitSet(new long[]{0x007C000200000002L});
    public static final BitSet FOLLOW_50_in_relation2638 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_relation2642 = new BitSet(new long[]{0x007C000200000002L});
    public static final BitSet FOLLOW_33_in_relation2653 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_relation2657 = new BitSet(new long[]{0x007C000200000002L});
    public static final BitSet FOLLOW_51_in_relation2667 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_relation2671 = new BitSet(new long[]{0x007C000200000002L});
    public static final BitSet FOLLOW_54_in_relation2681 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_relation2685 = new BitSet(new long[]{0x007C000200000002L});
    public static final BitSet FOLLOW_relation_in_logico2725 = new BitSet(new long[]{0x0200000800000002L});
    public static final BitSet FOLLOW_35_in_logico2753 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_relation_in_logico2757 = new BitSet(new long[]{0x0200000800000002L});
    public static final BitSet FOLLOW_57_in_logico2789 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_relation_in_logico2793 = new BitSet(new long[]{0x0200000800000002L});
    public static final BitSet FOLLOW_logico_in_expression2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2884 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2889 = new BitSet(new long[]{0x00000000101E0220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2904 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_41_in_llamadofuncion2916 = new BitSet(new long[]{0x0000000010160220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2923 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2936 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_llamadofuncion2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_statements2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_statements3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_statements3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_statements3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_statements3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_statements3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statements3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_statements3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_statements3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_mult_in_statements3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_statements3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_statements3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_statements3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_statements3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lista_texto_in_statements3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_in_statements3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unincremento_in_statements3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_menosunincremento_in_statements3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_statements3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decremento_in_statements3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement3290 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3292 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3298 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3306 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3308 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3311 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_ifstatement3313 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_statements_in_ifstatement3324 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_ifstatement3336 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3348 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_PC_in_ifstatement3358 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement3361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_IF_in_ifstatement3363 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3365 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3369 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3377 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3379 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3382 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_ifstatement3384 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_statements_in_ifstatement3398 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_ifstatement3410 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3420 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_PC_in_ifstatement3430 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement3433 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3435 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3440 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_ifstatement3442 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_statements_in_ifstatement3454 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_ifstatement3464 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3473 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet3512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet3514 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_logico_in_whilestatemet3518 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet3530 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3532 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet3535 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3537 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_statements_in_whilestatemet3547 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3561 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatemet3599 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet3601 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_declaracion_in_forstatemet3605 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_logico_in_forstatemet3609 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3611 = new BitSet(new long[]{0x0000044010160220L});
    public static final BitSet FOLLOW_add_in_forstatemet3615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet3629 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3631 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_LLAVE_I_in_forstatemet3634 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_forstatemet3636 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_statements_in_forstatemet3646 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_PC_in_forstatemet3662 = new BitSet(new long[]{0x0000000066E2E840L});
    public static final BitSet FOLLOW_LLAVE_D_in_forstatemet3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_minus4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_parentesis_d4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_parentesis_i4104 = new BitSet(new long[]{0x0000000000000002L});

}