// $ANTLR 3.4 C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g 2014-10-06 21:19:43

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "BOOLEAN", "COMENTARIO", "COMILLASD", "COMILLASS", "DOBLE", "ELSE", "ELSEIF", "FOR", "FUNCTION", "IF", "LIST", "LLAVE_D", "LLAVE_I", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", "PC", "PRINT", "PRINTLN", "PUSH", "READ", "RETURN", "SET", "TEXTO", "VARIABLE", "WHILE", "WS", "WSOPT", "'!='", "'%'", "'&&'", "'()'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'.get('", "'.size'", "'.tamano'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'['", "']'", "'||'"
    };

    public static final int EOF=-1;
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
    public static final int T__58=58;
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
    public static final int VARIABLE=30;
    public static final int WHILE=31;
    public static final int WS=32;
    public static final int WSOPT=33;

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
    public String getGrammarFileName() { return "C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g"; }


    Context1 contexto = new Context1(); 
    boolean bandera = true;
    ArrayList<Context1> pila = new ArrayList<Context1>();
    public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();




    // $ANTLR start "programa"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:46:1: programa returns [StringBuilder output] : ( PC )* ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+ ;
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
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:47:3: ( ( PC )* ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+ )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:49:3: ( PC )* ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+
            {
             
               pila.add(new Context1()); 
               output = new StringBuilder();
              

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:53:3: ( PC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:53:3: PC
            	    {
            	    match(input,PC,FOLLOW_PC_in_programa75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:54:3: ( print1 | println | asignacion | lectura | comentario | ifstatement | whilestatemet | funcion | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )+
            int cnt2=0;
            loop2:
            do {
                int alt2=21;
                switch ( input.LA(1) ) {
                case PRINT:
                    {
                    alt2=1;
                    }
                    break;
                case PRINTLN:
                    {
                    alt2=2;
                    }
                    break;
                case NOMBRE:
                    {
                    switch ( input.LA(2) ) {
                    case ASIGNACION:
                        {
                        alt2=3;
                        }
                        break;
                    case 46:
                        {
                        alt2=12;
                        }
                        break;
                    case 40:
                        {
                        alt2=17;
                        }
                        break;
                    case 44:
                        {
                        alt2=18;
                        }
                        break;
                    case 41:
                        {
                        alt2=19;
                        }
                        break;
                    case 45:
                        {
                        alt2=20;
                        }
                        break;
                    case PARENTESIS_I:
                        {
                        alt2=9;
                        }
                        break;
                    case SET:
                    case 56:
                        {
                        alt2=14;
                        }
                        break;
                    case 48:
                    case 49:
                        {
                        alt2=16;
                        }
                        break;

                    }

                    }
                    break;
                case READ:
                    {
                    alt2=4;
                    }
                    break;
                case COMENTARIO:
                    {
                    alt2=5;
                    }
                    break;
                case IF:
                    {
                    alt2=6;
                    }
                    break;
                case WHILE:
                    {
                    alt2=7;
                    }
                    break;
                case FUNCTION:
                    {
                    alt2=8;
                    }
                    break;
                case VARIABLE:
                    {
                    alt2=10;
                    }
                    break;
                case LIST:
                    {
                    int LA2_11 = input.LA(2);

                    if ( (LA2_11==NOMBRE) ) {
                        int LA2_22 = input.LA(3);

                        if ( (LA2_22==ASIGNACION) ) {
                            alt2=15;
                        }
                        else if ( (LA2_22==PC||LA2_22==42) ) {
                            alt2=11;
                        }


                    }


                    }
                    break;
                case FOR:
                    {
                    alt2=13;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:56:7: print1
            	    {
            	    pushFollow(FOLLOW_print1_in_programa95);
            	    print11=print1();

            	    state._fsp--;


            	    output.append((String)print11.evaluate(pila));

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:57:7: println
            	    {
            	    pushFollow(FOLLOW_println_in_programa115);
            	    println2=println();

            	    state._fsp--;


            	    output.append((String)println2.evaluate(pila));

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:58:7: asignacion
            	    {
            	    pushFollow(FOLLOW_asignacion_in_programa134);
            	    asignacion3=asignacion();

            	    state._fsp--;


            	    asignacion3.evaluate(pila);

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:59:7: lectura
            	    {
            	    pushFollow(FOLLOW_lectura_in_programa150);
            	    lectura4=lectura();

            	    state._fsp--;


            	    lectura4.evaluate(pila);

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:60:7: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_programa169);
            	    comentario();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:61:7: ifstatement
            	    {
            	    pushFollow(FOLLOW_ifstatement_in_programa177);
            	    ifstatement5=ifstatement();

            	    state._fsp--;


            	    output.append((String)ifstatement5.evaluate(pila));

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:62:7: whilestatemet
            	    {
            	    pushFollow(FOLLOW_whilestatemet_in_programa192);
            	    whilestatemet6=whilestatemet();

            	    state._fsp--;


            	    output.append((String)whilestatemet6.evaluate(pila));

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:63:7: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_programa205);
            	    funcion();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:64:7: llamadofuncion
            	    {
            	    pushFollow(FOLLOW_llamadofuncion_in_programa213);
            	    llamadofuncion7=llamadofuncion();

            	    state._fsp--;


            	    output.append((String)llamadofuncion7.evaluate(pila));

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:65:7: declaracion_mult
            	    {
            	    pushFollow(FOLLOW_declaracion_mult_in_programa226);
            	    declaracion_mult8=declaracion_mult();

            	    state._fsp--;


            	    declaracion_mult8.evaluate(pila);

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:66:7: declaracion_lista
            	    {
            	    pushFollow(FOLLOW_declaracion_lista_in_programa236);
            	    declaracion_lista9=declaracion_lista();

            	    state._fsp--;


            	    declaracion_lista9.evaluate(pila);

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:67:7: push
            	    {
            	    pushFollow(FOLLOW_push_in_programa245);
            	    push10=push();

            	    state._fsp--;


            	    push10.evaluate(pila);

            	    }
            	    break;
            	case 13 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:68:7: forstatemet
            	    {
            	    pushFollow(FOLLOW_forstatemet_in_programa267);
            	    forstatemet11=forstatemet();

            	    state._fsp--;


            	    output.append((String)forstatemet11.evaluate(pila));

            	    }
            	    break;
            	case 14 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:69:7: asignacion_lista
            	    {
            	    pushFollow(FOLLOW_asignacion_lista_in_programa282);
            	    asignacion_lista12=asignacion_lista();

            	    state._fsp--;


            	    asignacion_lista12.evaluate(pila);

            	    }
            	    break;
            	case 15 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:70:7: lista_texto
            	    {
            	    pushFollow(FOLLOW_lista_texto_in_programa292);
            	    lista_texto13=lista_texto();

            	    state._fsp--;


            	    lista_texto13.evaluate(pila);

            	    }
            	    break;
            	case 16 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:71:7: size
            	    {
            	    pushFollow(FOLLOW_size_in_programa307);
            	    size14=size();

            	    state._fsp--;


            	    size14.evaluate(pila);

            	    }
            	    break;
            	case 17 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:72:7: unincremento
            	    {
            	    pushFollow(FOLLOW_unincremento_in_programa329);
            	    unincremento15=unincremento();

            	    state._fsp--;


            	    unincremento15.evaluate(pila);

            	    }
            	    break;
            	case 18 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:73:7: menosunincremento
            	    {
            	    pushFollow(FOLLOW_menosunincremento_in_programa343);
            	    menosunincremento16=menosunincremento();

            	    state._fsp--;


            	    menosunincremento16.evaluate(pila);

            	    }
            	    break;
            	case 19 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:74:7: incremento
            	    {
            	    pushFollow(FOLLOW_incremento_in_programa352);
            	    incremento17=incremento();

            	    state._fsp--;


            	    incremento17.evaluate(pila);

            	    }
            	    break;
            	case 20 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:75:7: decremento
            	    {
            	    pushFollow(FOLLOW_decremento_in_programa368);
            	    decremento18=decremento();

            	    state._fsp--;


            	    decremento18.evaluate(pila);

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:83:3: return1 returns [Evaluator e] : RETURN te= evaluator PC ;
    public final Evaluator return1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator te =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:84:3: ( RETURN te= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:85:5: RETURN te= evaluator PC
            {
            match(input,RETURN,FOLLOW_RETURN_in_return1422); 

            pushFollow(FOLLOW_evaluator_in_return1428);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1435); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:93:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE parentesis_i ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? parentesis_d ( PC )? '{' ( PC )? (wh= statements )* '}' ( PC )? ;
    public final Evaluator funcion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom1=null;
        Evaluator wh =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:94:3: ( FUNCTION nom= NOMBRE parentesis_i ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? parentesis_d ( PC )? '{' ( PC )? (wh= statements )* '}' ( PC )? )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:95:3: FUNCTION nom= NOMBRE parentesis_i ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )? parentesis_d ( PC )? '{' ( PC )? (wh= statements )* '}' ( PC )?
            {
            e = new FuncionEvaluator();

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion473); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion479); 

            pushFollow(FOLLOW_parentesis_i_in_funcion481);
            parentesis_i();

            state._fsp--;


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:98:2: ( ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VARIABLE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:98:4: ( VARIABLE nom1= NOMBRE ) ( ',' VARIABLE nom1= NOMBRE )*
                    {
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:98:4: ( VARIABLE nom1= NOMBRE )
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:99:4: VARIABLE nom1= NOMBRE
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion494); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion500); 


                    	     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	  

                    }


                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:104:2: ( ',' VARIABLE nom1= NOMBRE )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==42) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:105:5: ',' VARIABLE nom1= NOMBRE
                    	    {
                    	    match(input,42,FOLLOW_42_in_funcion517); 

                    	    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion519); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion525); 


                    	           ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            pushFollow(FOLLOW_parentesis_d_in_funcion544);
            parentesis_d();

            state._fsp--;


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:111:15: ( PC )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PC) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:111:15: PC
                    {
                    match(input,PC,FOLLOW_PC_in_funcion546); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion550); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:112:6: ( PC )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:112:6: PC
                    {
                    match(input,PC,FOLLOW_PC_in_funcion552); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:114:4: (wh= statements )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMENTARIO||LA7_0==FOR||(LA7_0 >= IF && LA7_0 <= LIST)||LA7_0==NOMBRE||(LA7_0 >= PRINT && LA7_0 <= PRINTLN)||(LA7_0 >= READ && LA7_0 <= RETURN)||(LA7_0 >= VARIABLE && LA7_0 <= WHILE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:114:5: wh= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_funcion567);
            	    wh=statements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion579); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:119:6: ( PC )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==PC) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:119:6: PC
                    {
                    match(input,PC,FOLLOW_PC_in_funcion581); 

                    }
                    break;

            }


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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:124:1: declaracion_mult returns [Evaluator e] : VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )* PC ;
    public final Evaluator declaracion_mult() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom2=null;
        Evaluator ev =null;

        Evaluator ev2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:125:3: ( VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:126:3: VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )* PC
            {
             e = new DeclaracionMultipleEvaluator(); 

            match(input,VARIABLE,FOLLOW_VARIABLE_in_declaracion_mult617); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_mult623); 

              if(bandera)
            			      ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom!=null?nom.getText():null), new DoubleEvaluator(0)); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:130:3: ( ASIGNACION ev= evaluator )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ASIGNACION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:130:7: ASIGNACION ev= evaluator
                    {
                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion_mult639); 

                    pushFollow(FOLLOW_evaluator_in_declaracion_mult645);
                    ev=evaluator();

                    state._fsp--;


                     if(bandera)
                              { ((DeclaracionMultipleEvaluator)e).addAsigancion(ev); } 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:134:3: ( ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:134:7: ',' nom2= NOMBRE ( ASIGNACION ev2= evaluator )?
            	    {
            	    match(input,42,FOLLOW_42_in_declaracion_mult673); 

            	    nom2=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_mult685); 

            	      if(bandera)
            	              ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom2!=null?nom2.getText():null), new DoubleEvaluator(0)); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:138:4: ( ASIGNACION ev2= evaluator )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==ASIGNACION) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:138:8: ASIGNACION ev2= evaluator
            	            {
            	            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion_mult703); 

            	            pushFollow(FOLLOW_evaluator_in_declaracion_mult709);
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
            	    break loop11;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_declaracion_mult739); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:146:1: declaracion returns [Evaluator e] : VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC ;
    public final Evaluator declaracion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:147:3: ( VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:148:3: VARIABLE nom= NOMBRE ( ASIGNACION ev= evaluator )? PC
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_declaracion764); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion770); 

              if(bandera)
                        e = new DeclaracionEvaluator((nom!=null?nom.getText():null), new DoubleEvaluator(0)); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:151:3: ( ASIGNACION ev= evaluator )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ASIGNACION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:151:7: ASIGNACION ev= evaluator
                    {
                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion789); 

                    pushFollow(FOLLOW_evaluator_in_declaracion795);
                    ev=evaluator();

                    state._fsp--;


                     if(bandera)
                              { ((DeclaracionEvaluator)e).asignar(ev); } 

                    }
                    break;

            }


            match(input,PC,FOLLOW_PC_in_declaracion819); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:158:1: unincremento returns [Evaluator e] : nom= NOMBRE '++' PC ;
    public final Evaluator unincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:159:3: (nom= NOMBRE '++' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:160:3: nom= NOMBRE '++' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_unincremento847); 

            match(input,40,FOLLOW_40_in_unincremento849); 

             
                 if(bandera){
                    e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(1));
                  }   
              

            match(input,PC,FOLLOW_PC_in_unincremento854); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:168:4: menosunincremento returns [Evaluator e] : nom= NOMBRE '--' PC ;
    public final Evaluator menosunincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:169:3: (nom= NOMBRE '--' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:170:3: nom= NOMBRE '--' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_menosunincremento886); 

            match(input,44,FOLLOW_44_in_menosunincremento888); 

             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(-1));   
              

            match(input,PC,FOLLOW_PC_in_menosunincremento897); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:178:3: incremento returns [Evaluator e] : nom= NOMBRE '+=' ev= evaluator PC ;
    public final Evaluator incremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:179:3: (nom= NOMBRE '+=' ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:180:3: nom= NOMBRE '+=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_incremento928); 

            match(input,41,FOLLOW_41_in_incremento930); 

            pushFollow(FOLLOW_evaluator_in_incremento935);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev);   
              

            match(input,PC,FOLLOW_PC_in_incremento946); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:188:3: decremento returns [Evaluator e] : nom= NOMBRE '-=' ev= evaluator PC ;
    public final Evaluator decremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:189:3: (nom= NOMBRE '-=' ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:190:3: nom= NOMBRE '-=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_decremento976); 

            match(input,45,FOLLOW_45_in_decremento978); 

            pushFollow(FOLLOW_evaluator_in_decremento983);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev, true);   
              

            match(input,PC,FOLLOW_PC_in_decremento994); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:200:3: declaracion_lista returns [Evaluator e] : LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC ;
    public final Evaluator declaracion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom2=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:201:3: ( LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:203:3: LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC
            {
             e = new DeclaracionMultipleEvaluator(); 

            match(input,LIST,FOLLOW_LIST_in_declaracion_lista1036); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista1040); 


                                              if(bandera)
                                                {
                                                    ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom!=null?nom.getText():null), new ListEvaluator());   
                                                }
                                             

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:211:3: ( ',' nom2= NOMBRE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:211:7: ',' nom2= NOMBRE
            	    {
            	    match(input,42,FOLLOW_42_in_declaracion_lista1083); 

            	    nom2=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista1095); 


            	                                      if(bandera)
            	                                        {
            	                                            ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom2!=null?nom2.getText():null), new ListEvaluator());      
            	                                        }
            	                                     

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_declaracion_lista1172); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:224:1: lista_texto returns [Evaluator e] : LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC ;
    public final Evaluator lista_texto() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token tex=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:225:3: ( LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:226:3: LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC
            {
            match(input,LIST,FOLLOW_LIST_in_lista_texto1198); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lista_texto1202); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_lista_texto1204); 

            match(input,READ,FOLLOW_READ_in_lista_texto1206); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_lista_texto1208); 

            tex=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_lista_texto1212); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_lista_texto1214); 


                                              if(bandera)
                                                {
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),(new ListFromTextEvaluator((tex!=null?tex.getText():null))).evaluate(pila));   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_lista_texto1287); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:237:1: push returns [Evaluator e] : nom= NOMBRE '.' PUSH '(' exp= expression ')' PC ;
    public final Evaluator push() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:238:3: (nom= NOMBRE '.' PUSH '(' exp= expression ')' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:239:3: nom= NOMBRE '.' PUSH '(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push1315); 

            match(input,46,FOLLOW_46_in_push1317); 

            match(input,PUSH,FOLLOW_PUSH_in_push1319); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_push1321); 

            pushFollow(FOLLOW_expression_in_push1327);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push1329); 


                                              if(bandera)
                                                {
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push1399); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:249:1: size returns [Evaluator e] : nom= NOMBRE size1 ( '()' )* PC ;
    public final Evaluator size() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:250:3: (nom= NOMBRE size1 ( '()' )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:251:3: nom= NOMBRE size1 ( '()' )* PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_size1427); 

            pushFollow(FOLLOW_size1_in_size1430);
            size1();

            state._fsp--;


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:251:21: ( '()' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:251:22: '()'
            	    {
            	    match(input,37,FOLLOW_37_in_size1433); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);



                                              if(bandera)
                                                {
                                                    e = new SizeEvaluator((nom!=null?nom.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_size1505); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:263:1: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:264:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:265:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion1540); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion1542); 

            pushFollow(FOLLOW_evaluator_in_asignacion1548);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);       
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion1588); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:277:1: asignacion_lista returns [Evaluator e] : nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC ;
    public final Evaluator asignacion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token num=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:278:3: (nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:279:4: nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion_lista1616); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:280:4: ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==56) ) {
                alt15=1;
            }
            else if ( (LA15_0==SET) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:280:7: '[' num= NUMERO ']' ASIGNACION ev= evaluator
                    {
                    match(input,56,FOLLOW_56_in_asignacion_lista1625); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1629); 

                    match(input,57,FOLLOW_57_in_asignacion_lista1631); 

                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion_lista1633); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1639);
                    ev=evaluator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:281:7: SET '(' num= NUMERO ',' ev= evaluator ')'
                    {
                    match(input,SET,FOLLOW_SET_in_asignacion_lista1647); 

                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_asignacion_lista1649); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1653); 

                    match(input,42,FOLLOW_42_in_asignacion_lista1655); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1661);
                    ev=evaluator();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_asignacion_lista1663); 

                    }
                    break;

            }



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionListaEvaluator((nom!=null?nom.getText():null),ev, (num!=null?num.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion_lista1709); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:295:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:296:3: ( COMENTARIO )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:297:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario1727); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:300:1: lectura returns [Evaluator e] : r= READ n= NOMBRE ( ',' exp= expression )? PC ;
    public final Evaluator lectura() throws Exception, RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:301:3: (r= READ n= NOMBRE ( ',' exp= expression )? PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:302:3: r= READ n= NOMBRE ( ',' exp= expression )? PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura1753); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura1757); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:310:3: ( ',' exp= expression )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:311:7: ',' exp= expression
                    {
                    match(input,42,FOLLOW_42_in_lectura1789); 

                    pushFollow(FOLLOW_expression_in_lectura1795);
                    exp=expression();

                    state._fsp--;


                     
                                  if(bandera)
                                        { 
                                            ((ReadEvaluator)e).addText(exp);
                                        }
                                 
                                 

                    }
                    break;

            }


            match(input,PC,FOLLOW_PC_in_lectura1829); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:323:1: print1 returns [Evaluator e] : PRINT (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator print1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:324:3: ( PRINT (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:325:3: PRINT (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintEvaluator(); 

            match(input,PRINT,FOLLOW_PRINT_in_print11858); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:327:3: (exp= expression )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:327:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_print11869);
            exp=expression();

            state._fsp--;


             ((PrintEvaluator)e).addEvaluator(exp); 

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:329:3: ( ',' exp= expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:329:5: ',' exp= expression
            	    {
            	    match(input,42,FOLLOW_42_in_print11881); 

            	    pushFollow(FOLLOW_expression_in_print11891);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_print11902); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:335:1: println returns [Evaluator e] : PRINTLN (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator println() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:336:3: ( PRINTLN (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:337:3: PRINTLN (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintlnEvaluator(); 

            match(input,PRINTLN,FOLLOW_PRINTLN_in_println1931); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:339:3: (exp= expression )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:339:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_println1941);
            exp=expression();

            state._fsp--;


             ((PrintlnEvaluator)e).addEvaluator(exp); 

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:341:3: ( ',' exp= expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:341:5: ',' exp= expression
            	    {
            	    match(input,42,FOLLOW_42_in_println1953); 

            	    pushFollow(FOLLOW_expression_in_println1963);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintlnEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_println1974); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:347:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico19 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:348:3: ( logico )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:349:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator1999);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:355:1: term returns [Evaluator e] : (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE size1 ( '()' )* );
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
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:356:3: (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE size1 ( '()' )* )
            int alt21=9;
            switch ( input.LA(1) ) {
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case PARENTESIS_I:
                    {
                    alt21=1;
                    }
                    break;
                case PARENTESIS_D:
                case PC:
                case 34:
                case 35:
                case 36:
                case 38:
                case 39:
                case 42:
                case 43:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 57:
                case 58:
                    {
                    alt21=3;
                    }
                    break;
                case 47:
                case 56:
                    {
                    alt21=8;
                    }
                    break;
                case 48:
                case 49:
                    {
                    alt21=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

                }
                break;
            case BOOLEAN:
                {
                alt21=2;
                }
                break;
            case NUMERO:
                {
                alt21=4;
                }
                break;
            case DOBLE:
                {
                alt21=5;
                }
                break;
            case TEXTO:
                {
                alt21=6;
                }
                break;
            case PARENTESIS_I:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:358:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term2045);
                    lla=llamadofuncion();

                    state._fsp--;



                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:365:5: BOOLEAN
                    {
                    BOOLEAN20=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_term2061); 


                               System.out.println("entiendo que es un boolean");
                               e = new BooleanEvaluator(((BOOLEAN20!=null?BOOLEAN20.getText():null))); 
                              

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:370:5: NOMBRE
                    {
                    NOMBRE21=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2080); 

                       
                            System.out.println("entiendo que es un llamado");
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE21!=null?NOMBRE21.getText():null)));//((pila.peek().get((NOMBRE21!=null?NOMBRE21.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:377:5: NUMERO
                    {
                    NUMERO22=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term2098); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO22!=null?NUMERO22.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:381:5: DOBLE
                    {
                    DOBLE23=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term2117); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE23!=null?DOBLE23.getText():null)));
                              

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:386:5: TEXTO
                    {
                    TEXTO24=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term2151); 


                              e = new StringEvaluator(((TEXTO24!=null?TEXTO24.getText():null)));
                             

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:391:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term2172); 

                    pushFollow(FOLLOW_add_in_term2174);
                    add25=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term2176); 


                                           e = add25;
                                          

                    }
                    break;
                case 8 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:395:5: nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' )
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2209); 

                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:396:5: ( '.get(' num= add ')' | '[' num= add ']' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==47) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==56) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:396:7: '.get(' num= add ')'
                            {
                            match(input,47,FOLLOW_47_in_term2218); 

                            pushFollow(FOLLOW_add_in_term2224);
                            num=add();

                            state._fsp--;


                            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term2226); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:397:7: '[' num= add ']'
                            {
                            match(input,56,FOLLOW_56_in_term2234); 

                            pushFollow(FOLLOW_add_in_term2244);
                            num=add();

                            state._fsp--;


                            match(input,57,FOLLOW_57_in_term2246); 

                            }
                            break;

                    }



                                    e = new GetEvaluator((nom!=null?nom.getText():null),num);     
                             

                    }
                    break;
                case 9 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:402:5: nom= NOMBRE size1 ( '()' )*
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2271); 

                    pushFollow(FOLLOW_size1_in_term2274);
                    size1();

                    state._fsp--;


                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:402:23: ( '()' )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==37) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:402:24: '()'
                    	    {
                    	    match(input,37,FOLLOW_37_in_term2277); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:408:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator term26 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:409:3: ( ( '+' | '-' )* term )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:411:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:414:3: ( '+' | '-' )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }
                else if ( (LA22_0==43) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:415:7: '+'
            	    {
            	    match(input,39,FOLLOW_39_in_unary2331); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:416:7: '-'
            	    {
            	    match(input,43,FOLLOW_43_in_unary2339); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary2360);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:429:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* ;
    public final Evaluator mult() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:430:3: (op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:431:6: op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult2397);
            op1=unary();

            state._fsp--;


            e = op1;

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:432:3: ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            loop23:
            do {
                int alt23=4;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt23=1;
                    }
                    break;
                case 50:
                    {
                    alt23=2;
                    }
                    break;
                case 35:
                    {
                    alt23=3;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:432:6: '*' op2= unary
            	    {
            	    match(input,38,FOLLOW_38_in_mult2406); 

            	    pushFollow(FOLLOW_unary_in_mult2410);
            	    op2=unary();

            	    state._fsp--;


            	    e = new TimesEvaluator(e,op2);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:433:6: '/' op2= unary
            	    {
            	    match(input,50,FOLLOW_50_in_mult2418); 

            	    pushFollow(FOLLOW_unary_in_mult2422);
            	    op2=unary();

            	    state._fsp--;


            	    e = new DivideEvaluator(e,op2);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:434:6: '%' op2= unary
            	    {
            	    match(input,35,FOLLOW_35_in_mult2431); 

            	    pushFollow(FOLLOW_unary_in_mult2435);
            	    op2=unary();

            	    state._fsp--;


            	    e = new ModEvaluator(e,op2); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:438:1: add returns [Evaluator e] : op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )* ;
    public final Evaluator add() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:439:3: (op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:440:5: op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )*
            {
            pushFollow(FOLLOW_mult_in_add2469);
            op1=mult();

            state._fsp--;


            e = op1;

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:441:3: ( ( '+' op2= mult ) | ( minus op2= mult ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }
                else if ( (LA24_0==43) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:442:3: ( '+' op2= mult )
            	    {
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:442:3: ( '+' op2= mult )
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:442:5: '+' op2= mult
            	    {
            	    match(input,39,FOLLOW_39_in_add2481); 

            	    pushFollow(FOLLOW_mult_in_add2485);
            	    op2=mult();

            	    state._fsp--;


            	    e = new PlusEvaluator(e, op2);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:444:5: ( minus op2= mult )
            	    {
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:444:5: ( minus op2= mult )
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:444:6: minus op2= mult
            	    {
            	    pushFollow(FOLLOW_minus_in_add2498);
            	    minus();

            	    state._fsp--;


            	    pushFollow(FOLLOW_mult_in_add2502);
            	    op2=mult();

            	    state._fsp--;


            	    e = new MinusEvaluator(e, op2);

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
    // $ANTLR end "add"



    // $ANTLR start "relation"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:449:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:450:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:451:5: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation2540);
            ex1=add();

            state._fsp--;


            e = ex1;

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:452:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34||(LA26_0 >= 51 && LA26_0 <= 55)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:453:3: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:453:3: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt25=6;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt25=5;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt25=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:454:5: '==' ex2= add
            	            {
            	            match(input,53,FOLLOW_53_in_relation2556); 

            	            pushFollow(FOLLOW_add_in_relation2560);
            	            ex2=add();

            	            state._fsp--;


            	            e = new IgualIgualEvaluator(e,ex2);

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:455:5: '>' ex2= add
            	            {
            	            match(input,54,FOLLOW_54_in_relation2568); 

            	            pushFollow(FOLLOW_add_in_relation2572);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MayorEvaluator(e,ex2);

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:456:5: '<' ex2= add
            	            {
            	            match(input,51,FOLLOW_51_in_relation2583); 

            	            pushFollow(FOLLOW_add_in_relation2587);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MenorEvaluator(e,ex2);

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:457:5: '!=' ex2= add
            	            {
            	            match(input,34,FOLLOW_34_in_relation2598); 

            	            pushFollow(FOLLOW_add_in_relation2602);
            	            ex2=add();

            	            state._fsp--;


            	            e = new DiferenteEvaluator(e,ex2);

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:458:5: '<=' ex2= add
            	            {
            	            match(input,52,FOLLOW_52_in_relation2612); 

            	            pushFollow(FOLLOW_add_in_relation2616);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MenorIgualEvaluator(e,ex2);

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:459:5: '>=' ex2= add
            	            {
            	            match(input,55,FOLLOW_55_in_relation2626); 

            	            pushFollow(FOLLOW_add_in_relation2630);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MayorIgualEvaluator(e,ex2);

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:464:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:465:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:466:5: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico2670);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:470:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }
                else if ( (LA27_0==58) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:471:5: '&&' rel2= relation
            	    {
            	    match(input,36,FOLLOW_36_in_logico2698); 

            	    pushFollow(FOLLOW_relation_in_logico2702);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:475:6: '||' rel2= relation
            	    {
            	    match(input,58,FOLLOW_58_in_logico2734); 

            	    pushFollow(FOLLOW_relation_in_logico2738);
            	    rel2=relation();

            	    state._fsp--;



            	                             e = new OrEvaluator(e,rel2);
            	                            

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
    // $ANTLR end "logico"



    // $ANTLR start "expression"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:482:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico27 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:483:2: ( logico )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:483:6: logico
            {
            pushFollow(FOLLOW_logico_in_expression2794);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:487:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC ;
    public final Evaluator llamadofuncion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:488:4: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:489:9: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2829); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2834); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:491:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BOOLEAN||LA29_0==DOBLE||(LA29_0 >= NOMBRE && LA29_0 <= NUMERO)||LA29_0==PARENTESIS_I||LA29_0==TEXTO) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:491:9: (ev= term ) ( ',' ev= term )*
                    {
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:491:9: (ev= term )
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:491:10: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2849);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev); 

                    }


                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:493:4: ( ',' ev= term )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==42) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:493:5: ',' ev= term
                    	    {
                    	    match(input,42,FOLLOW_42_in_llamadofuncion2861); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2868);
                    	    ev=term();

                    	    state._fsp--;


                    	    ((FuncionEvaluator) e).llenarParametro(ev); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2881); 

            match(input,PC,FOLLOW_PC_in_llamadofuncion2892); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:499:1: statements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | ifstatement | whilestatemet | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento );
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
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:500:3: ( print1 | println | asignacion | lectura | comentario | return1 | ifstatement | whilestatemet | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )
            int alt30=20;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt30=1;
                }
                break;
            case PRINTLN:
                {
                alt30=2;
                }
                break;
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case ASIGNACION:
                    {
                    alt30=3;
                    }
                    break;
                case 46:
                    {
                    alt30=12;
                    }
                    break;
                case 40:
                    {
                    alt30=17;
                    }
                    break;
                case 44:
                    {
                    alt30=18;
                    }
                    break;
                case 41:
                    {
                    alt30=19;
                    }
                    break;
                case 45:
                    {
                    alt30=20;
                    }
                    break;
                case PARENTESIS_I:
                    {
                    alt30=9;
                    }
                    break;
                case SET:
                case 56:
                    {
                    alt30=14;
                    }
                    break;
                case 48:
                case 49:
                    {
                    alt30=16;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;

                }

                }
                break;
            case READ:
                {
                alt30=4;
                }
                break;
            case COMENTARIO:
                {
                alt30=5;
                }
                break;
            case RETURN:
                {
                alt30=6;
                }
                break;
            case IF:
                {
                alt30=7;
                }
                break;
            case WHILE:
                {
                alt30=8;
                }
                break;
            case VARIABLE:
                {
                alt30=10;
                }
                break;
            case LIST:
                {
                int LA30_10 = input.LA(2);

                if ( (LA30_10==NOMBRE) ) {
                    int LA30_21 = input.LA(3);

                    if ( (LA30_21==ASIGNACION) ) {
                        alt30=15;
                    }
                    else if ( (LA30_21==PC||LA30_21==42) ) {
                        alt30=11;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 21, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 10, input);

                    throw nvae;

                }
                }
                break;
            case FOR:
                {
                alt30=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:501:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_statements2926);
                    print128=print1();

                    state._fsp--;


                    e = print128;

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:502:5: println
                    {
                    pushFollow(FOLLOW_println_in_statements2946);
                    println29=println();

                    state._fsp--;


                    e = println29;

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:503:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_statements2965);
                    asignacion30=asignacion();

                    state._fsp--;


                    e = asignacion30;

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:504:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_statements2980);
                    lectura31=lectura();

                    state._fsp--;


                    e = lectura31;

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:505:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_statements2999);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:506:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_statements3014);
                    return132=return1();

                    state._fsp--;


                    e = return132;

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:507:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statements3032);
                    ifstatement33=ifstatement();

                    state._fsp--;


                    e = ifstatement33;

                    }
                    break;
                case 8 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:508:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_statements3047);
                    whilestatemet34=whilestatemet();

                    state._fsp--;


                    e = whilestatemet34;

                    }
                    break;
                case 9 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:509:5: llamadofuncion
                    {
                    pushFollow(FOLLOW_llamadofuncion_in_statements3059);
                    llamadofuncion35=llamadofuncion();

                    state._fsp--;


                    e = llamadofuncion35;

                    }
                    break;
                case 10 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:510:5: declaracion_mult
                    {
                    pushFollow(FOLLOW_declaracion_mult_in_statements3071);
                    declaracion_mult36=declaracion_mult();

                    state._fsp--;


                    e = declaracion_mult36;

                    }
                    break;
                case 11 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:511:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_statements3080);
                    declaracion_lista37=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista37;

                    }
                    break;
                case 12 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:512:5: push
                    {
                    pushFollow(FOLLOW_push_in_statements3088);
                    push38=push();

                    state._fsp--;


                    e = push38;

                    }
                    break;
                case 13 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:513:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_statements3109);
                    forstatemet39=forstatemet();

                    state._fsp--;


                    e = forstatemet39;

                    }
                    break;
                case 14 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:514:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_statements3123);
                    asignacion_lista40=asignacion_lista();

                    state._fsp--;


                    e = asignacion_lista40;

                    }
                    break;
                case 15 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:515:5: lista_texto
                    {
                    pushFollow(FOLLOW_lista_texto_in_statements3132);
                    lista_texto41=lista_texto();

                    state._fsp--;


                    e = lista_texto41;

                    }
                    break;
                case 16 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:516:5: size
                    {
                    pushFollow(FOLLOW_size_in_statements3146);
                    size42=size();

                    state._fsp--;


                    e = size42;

                    }
                    break;
                case 17 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:517:5: unincremento
                    {
                    pushFollow(FOLLOW_unincremento_in_statements3167);
                    unincremento43=unincremento();

                    state._fsp--;


                    e = unincremento43;

                    }
                    break;
                case 18 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:518:5: menosunincremento
                    {
                    pushFollow(FOLLOW_menosunincremento_in_statements3180);
                    menosunincremento44=menosunincremento();

                    state._fsp--;


                    e = menosunincremento44;

                    }
                    break;
                case 19 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:519:5: incremento
                    {
                    pushFollow(FOLLOW_incremento_in_statements3188);
                    incremento45=incremento();

                    state._fsp--;


                    e = incremento45;

                    }
                    break;
                case 20 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:520:5: decremento
                    {
                    pushFollow(FOLLOW_decremento_in_statements3203);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:523:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )* ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )* ;
    public final Evaluator ifstatement() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:524:3: ( IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )* ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:525:3: IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )* ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement3235); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3237); 

            pushFollow(FOLLOW_logico_in_ifstatement3243);
            rel=logico();

            state._fsp--;



            			  e = new IfEvaluator ();   
            			  ((IfEvaluator) e).agregarCondicion(rel);
            			

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3251); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:530:15: ( PC )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:530:15: PC
                    {
                    match(input,PC,FOLLOW_PC_in_ifstatement3253); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3256); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:530:27: ( PC )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==PC) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:530:27: PC
                    {
                    match(input,PC,FOLLOW_PC_in_ifstatement3258); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:531:3: (ifs= statements )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMENTARIO||LA33_0==FOR||(LA33_0 >= IF && LA33_0 <= LIST)||LA33_0==NOMBRE||(LA33_0 >= PRINT && LA33_0 <= PRINTLN)||(LA33_0 >= READ && LA33_0 <= RETURN)||(LA33_0 >= VARIABLE && LA33_0 <= WHILE)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:531:4: ifs= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_ifstatement3269);
            	    ifs=statements();

            	    state._fsp--;



            	    		   ((IfEvaluator) e).agregarCoso(ifs);   
            	    		  
            	    		 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3287); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:537:13: ( PC )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==PC) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:537:13: PC
                    {
                    match(input,PC,FOLLOW_PC_in_ifstatement3289); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:540:3: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ELSEIF) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:540:4: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )?
            	    {
            	    match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement3299); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3301); 

            	    pushFollow(FOLLOW_logico_in_ifstatement3305);
            	    rel1=logico();

            	    state._fsp--;



            	    			 ((IfEvaluator) e).nuevoSegmento();
            	    			 ((IfEvaluator) e).agregarCondicion(rel1); 
            	    			

            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3313); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:545:15: ( PC )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==PC) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:545:15: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3315); 

            	            }
            	            break;

            	    }


            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3318); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:545:27: ( PC )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==PC) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:545:27: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3320); 

            	            }
            	            break;

            	    }


            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:546:3: (ifs= statements )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==COMENTARIO||LA37_0==FOR||(LA37_0 >= IF && LA37_0 <= LIST)||LA37_0==NOMBRE||(LA37_0 >= PRINT && LA37_0 <= PRINTLN)||(LA37_0 >= READ && LA37_0 <= RETURN)||(LA37_0 >= VARIABLE && LA37_0 <= WHILE)) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:547:5: ifs= statements
            	    	    {
            	    	    pushFollow(FOLLOW_statements_in_ifstatement3334);
            	    	    ifs=statements();

            	    	    state._fsp--;



            	    	    		   ((IfEvaluator) e).agregarCoso(ifs);   
            	    	    		 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3350); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:552:11: ( PC )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==PC) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:552:11: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3352); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:554:3: ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==ELSE) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:554:5: ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )?
            	    {
            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement3364); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:554:10: ( PC )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==PC) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:554:10: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3366); 

            	            }
            	            break;

            	    }


            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3371); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:11: ( PC )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==PC) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:11: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3373); 

            	            }
            	            break;

            	    }


            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:14: (elses= statements )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==COMENTARIO||LA42_0==FOR||(LA42_0 >= IF && LA42_0 <= LIST)||LA42_0==NOMBRE||(LA42_0 >= PRINT && LA42_0 <= PRINTLN)||(LA42_0 >= READ && LA42_0 <= RETURN)||(LA42_0 >= VARIABLE && LA42_0 <= WHILE)) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:556:5: elses= statements
            	    	    {
            	    	    pushFollow(FOLLOW_statements_in_ifstatement3385);
            	    	    elses=statements();

            	    	    state._fsp--;


            	    	     ((IfEvaluator)e).agregarCosoElse(elses); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3399); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:559:11: ( PC )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==PC) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:559:11: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3401); 

            	            }
            	            break;

            	    }


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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:563:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? ;
    public final Evaluator whilestatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:564:4: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:565:4: WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )?
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet3440); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet3442); 

            pushFollow(FOLLOW_logico_in_whilestatemet3446);
            rel=logico();

            state._fsp--;


             e = new WhileEvaluator(rel); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet3458); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:567:16: ( PC )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==PC) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:567:16: PC
                    {
                    match(input,PC,FOLLOW_PC_in_whilestatemet3460); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet3463); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:567:28: ( PC )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==PC) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:567:28: PC
                    {
                    match(input,PC,FOLLOW_PC_in_whilestatemet3465); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:568:3: (wh= statements )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMENTARIO||LA47_0==FOR||(LA47_0 >= IF && LA47_0 <= LIST)||LA47_0==NOMBRE||(LA47_0 >= PRINT && LA47_0 <= PRINTLN)||(LA47_0 >= READ && LA47_0 <= RETURN)||(LA47_0 >= VARIABLE && LA47_0 <= WHILE)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:568:4: wh= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_whilestatemet3475);
            	    wh=statements();

            	    state._fsp--;


            	     ((WhileEvaluator) e).add(wh); 

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet3494); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:572:11: ( PC )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==PC) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:572:11: PC
                    {
                    match(input,PC,FOLLOW_PC_in_whilestatemet3496); 

                    }
                    break;

            }


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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:576:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? ;
    public final Evaluator forstatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator decl =null;

        Evaluator logi =null;

        Evaluator aumento =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:577:3: ( FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:578:3: FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )?
            {
            match(input,FOR,FOLLOW_FOR_in_forstatemet3521); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet3523); 

            pushFollow(FOLLOW_declaracion_in_forstatemet3527);
            decl=declaracion();

            state._fsp--;


            pushFollow(FOLLOW_logico_in_forstatemet3531);
            logi=logico();

            state._fsp--;


            match(input,PC,FOLLOW_PC_in_forstatemet3533); 

            pushFollow(FOLLOW_add_in_forstatemet3537);
            aumento=add();

            state._fsp--;


             e = new ForEvaluator(decl, logi, aumento); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet3551); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:580:16: ( PC )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==PC) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:580:16: PC
                    {
                    match(input,PC,FOLLOW_PC_in_forstatemet3553); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet3556); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:580:28: ( PC )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==PC) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:580:28: PC
                    {
                    match(input,PC,FOLLOW_PC_in_forstatemet3558); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:581:3: (wh= statements )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMENTARIO||LA51_0==FOR||(LA51_0 >= IF && LA51_0 <= LIST)||LA51_0==NOMBRE||(LA51_0 >= PRINT && LA51_0 <= PRINTLN)||(LA51_0 >= READ && LA51_0 <= RETURN)||(LA51_0 >= VARIABLE && LA51_0 <= WHILE)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:581:4: wh= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_forstatemet3569);
            	    wh=statements();

            	    state._fsp--;


            	     ((ForEvaluator) e).add(wh); 

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet3586); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:584:11: ( PC )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==PC) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:584:11: PC
                    {
                    match(input,PC,FOLLOW_PC_in_forstatemet3588); 

                    }
                    break;

            }


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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:657:1: minus : '-' ;
    public final void minus() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:658:4: ( '-' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:659:4: '-'
            {
            match(input,43,FOLLOW_43_in_minus3963); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:667:3: parentesis_d : ')' ;
    public final void parentesis_d() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:668:3: ( ')' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:669:3: ')'
            {
            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_parentesis_d3998); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:677:3: parentesis_i : '(' ;
    public final void parentesis_i() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:678:3: ( '(' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:679:3: '('
            {
            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_parentesis_i4032); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:720:1: size1 : ( '.tamano' | '.size' ) ;
    public final void size1() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:720:6: ( ( '.tamano' | '.size' ) )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:
            {
            if ( (input.LA(1) >= 48 && input.LA(1) <= 49) ) {
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


 

    public static final BitSet FOLLOW_PC_in_programa75 = new BitSet(new long[]{0x00000000C5C4F040L});
    public static final BitSet FOLLOW_print1_in_programa95 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_println_in_programa115 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_asignacion_in_programa134 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_lectura_in_programa150 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_comentario_in_programa169 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_ifstatement_in_programa177 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_whilestatemet_in_programa192 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_funcion_in_programa205 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_llamadofuncion_in_programa213 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_declaracion_mult_in_programa226 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_declaracion_lista_in_programa236 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_push_in_programa245 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_forstatemet_in_programa267 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_asignacion_lista_in_programa282 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_lista_texto_in_programa292 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_size_in_programa307 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_unincremento_in_programa329 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_menosunincremento_in_programa343 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_incremento_in_programa352 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_decremento_in_programa368 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_RETURN_in_return1422 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_return1428 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_return1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion473 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion479 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parentesis_i_in_funcion481 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion494 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion500 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_42_in_funcion517 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion519 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion525 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_parentesis_d_in_funcion544 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_funcion546 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion550 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_funcion552 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_funcion567 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion579 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PC_in_funcion581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_declaracion_mult617 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_mult623 = new BitSet(new long[]{0x0000040000400010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion_mult639 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion_mult645 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_declaracion_mult673 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_mult685 = new BitSet(new long[]{0x0000040000400010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion_mult703 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion_mult709 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_declaracion_mult739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_declaracion764 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion770 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion789 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion795 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_declaracion819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_unincremento847 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_unincremento849 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_unincremento854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_menosunincremento886 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_menosunincremento888 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_menosunincremento897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_incremento928 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_incremento930 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_incremento935 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_incremento946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_decremento976 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_decremento978 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_decremento983 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_decremento994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_declaracion_lista1036 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista1040 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_declaracion_lista1083 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista1095 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_lista_texto1198 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_lista_texto1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_lista_texto1204 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_READ_in_lista_texto1206 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_lista_texto1208 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TEXTO_in_lista_texto1212 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_lista_texto1214 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_lista_texto1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push1315 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_push1317 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PUSH_in_push1319 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_push1321 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_push1327 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push1329 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_push1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_size1427 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_size1_in_size1430 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_37_in_size1433 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_PC_in_size1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion1540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion1542 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion1548 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_asignacion1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion_lista1616 = new BitSet(new long[]{0x0100000010000000L});
    public static final BitSet FOLLOW_56_in_asignacion_lista1625 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1629 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_asignacion_lista1631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion_lista1633 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1639 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SET_in_asignacion_lista1647 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_asignacion_lista1649 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1653 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_asignacion_lista1655 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1661 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_asignacion_lista1663 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_asignacion_lista1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura1753 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura1757 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_lectura1789 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_lectura1795 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_lectura1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print11858 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_print11869 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_print11881 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_print11891 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_print11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println1931 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_println1941 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_println1953 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_println1963 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_println1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_term2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term2172 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_term2174 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2209 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_47_in_term2218 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_term2224 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_term2234 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_term2244 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_term2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2271 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_size1_in_term2274 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_term2277 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_39_in_unary2331 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_43_in_unary2339 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_term_in_unary2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult2397 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_38_in_mult2406 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_unary_in_mult2410 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_50_in_mult2418 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_unary_in_mult2422 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_35_in_mult2431 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_unary_in_mult2435 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_mult_in_add2469 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_39_in_add2481 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_mult_in_add2485 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_minus_in_add2498 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_mult_in_add2502 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_add_in_relation2540 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_53_in_relation2556 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2560 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_54_in_relation2568 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2572 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_51_in_relation2583 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2587 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_34_in_relation2598 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2602 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_52_in_relation2612 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2616 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_55_in_relation2626 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2630 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_relation_in_logico2670 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_36_in_logico2698 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_relation_in_logico2702 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_58_in_logico2734 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_relation_in_logico2738 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_logico_in_expression2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2829 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2834 = new BitSet(new long[]{0x00000000203C0220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2849 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_42_in_llamadofuncion2861 = new BitSet(new long[]{0x00000000202C0220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2868 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2881 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_llamadofuncion2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_statements2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_statements2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_statements2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_statements2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_statements2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_statements3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statements3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_statements3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_statements3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_mult_in_statements3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_statements3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_statements3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_statements3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_statements3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lista_texto_in_statements3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_in_statements3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unincremento_in_statements3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_menosunincremento_in_statements3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_statements3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decremento_in_statements3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement3235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3237 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3243 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3251 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3253 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3256 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_ifstatement3258 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_ifstatement3269 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3287 = new BitSet(new long[]{0x0000000000400C02L});
    public static final BitSet FOLLOW_PC_in_ifstatement3289 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ELSEIF_in_ifstatement3299 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3301 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3305 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3313 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3315 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3318 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_ifstatement3320 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_ifstatement3334 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3350 = new BitSet(new long[]{0x0000000000400C02L});
    public static final BitSet FOLLOW_PC_in_ifstatement3352 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement3364 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3366 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3371 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_ifstatement3373 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_ifstatement3385 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3399 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_PC_in_ifstatement3401 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet3440 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet3442 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_whilestatemet3446 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet3458 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3460 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet3463 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3465 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_whilestatemet3475 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet3494 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatemet3521 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet3523 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_declaracion_in_forstatemet3527 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_forstatemet3531 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3533 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_forstatemet3537 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet3551 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3553 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_forstatemet3556 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_forstatemet3558 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_forstatemet3569 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_forstatemet3586 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PC_in_forstatemet3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_minus3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_parentesis_d3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_parentesis_i4032 = new BitSet(new long[]{0x0000000000000002L});

}