// $ANTLR 3.4 C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g 2014-10-04 19:36:52

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
            	    pushFollow(FOLLOW_menosunincremento_in_programa344);
            	    menosunincremento16=menosunincremento();

            	    state._fsp--;


            	    menosunincremento16.evaluate(pila);

            	    }
            	    break;
            	case 19 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:74:7: incremento
            	    {
            	    pushFollow(FOLLOW_incremento_in_programa359);
            	    incremento17=incremento();

            	    state._fsp--;


            	    incremento17.evaluate(pila);

            	    }
            	    break;
            	case 20 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:75:7: decremento
            	    {
            	    pushFollow(FOLLOW_decremento_in_programa374);
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
            match(input,RETURN,FOLLOW_RETURN_in_return1427); 

            pushFollow(FOLLOW_evaluator_in_return1433);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1440); 

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

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion478); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion484); 

            pushFollow(FOLLOW_parentesis_i_in_funcion486);
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
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion499); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion505); 


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
                    	    match(input,42,FOLLOW_42_in_funcion522); 

                    	    match(input,VARIABLE,FOLLOW_VARIABLE_in_funcion524); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion530); 


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


            pushFollow(FOLLOW_parentesis_d_in_funcion549);
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
                    match(input,PC,FOLLOW_PC_in_funcion551); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion555); 

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
                    match(input,PC,FOLLOW_PC_in_funcion557); 

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
            	    pushFollow(FOLLOW_statements_in_funcion572);
            	    wh=statements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion584); 

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
                    match(input,PC,FOLLOW_PC_in_funcion586); 

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

            match(input,VARIABLE,FOLLOW_VARIABLE_in_declaracion_mult622); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_mult628); 

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
                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion_mult644); 

                    pushFollow(FOLLOW_evaluator_in_declaracion_mult650);
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
            	    match(input,42,FOLLOW_42_in_declaracion_mult678); 

            	    nom2=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_mult690); 

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
            	            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion_mult708); 

            	            pushFollow(FOLLOW_evaluator_in_declaracion_mult714);
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


            match(input,PC,FOLLOW_PC_in_declaracion_mult744); 

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



    // $ANTLR start "unincremento"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:146:1: unincremento returns [Evaluator e] : nom= NOMBRE '++' PC ;
    public final Evaluator unincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:147:3: (nom= NOMBRE '++' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:148:3: nom= NOMBRE '++' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_unincremento772); 

            match(input,40,FOLLOW_40_in_unincremento774); 

             
                 if(bandera){
                    e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(1));
                  }   
              

            match(input,PC,FOLLOW_PC_in_unincremento779); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:156:4: menosunincremento returns [Evaluator e] : nom= NOMBRE '--' PC ;
    public final Evaluator menosunincremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:157:3: (nom= NOMBRE '--' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:158:3: nom= NOMBRE '--' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_menosunincremento811); 

            match(input,44,FOLLOW_44_in_menosunincremento813); 

             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),new DoubleEvaluator(-1));   
              

            match(input,PC,FOLLOW_PC_in_menosunincremento822); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:166:3: incremento returns [Evaluator e] : nom= NOMBRE '+=' ev= evaluator PC ;
    public final Evaluator incremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:167:3: (nom= NOMBRE '+=' ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:168:3: nom= NOMBRE '+=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_incremento853); 

            match(input,41,FOLLOW_41_in_incremento855); 

            pushFollow(FOLLOW_evaluator_in_incremento860);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev);   
              

            match(input,PC,FOLLOW_PC_in_incremento871); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:176:3: decremento returns [Evaluator e] : nom= NOMBRE '-=' ev= evaluator PC ;
    public final Evaluator decremento() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:177:3: (nom= NOMBRE '-=' ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:178:3: nom= NOMBRE '-=' ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_decremento901); 

            match(input,45,FOLLOW_45_in_decremento903); 

            pushFollow(FOLLOW_evaluator_in_decremento908);
            ev=evaluator();

            state._fsp--;


             
                 if(bandera)
                  e = new IncrementoEvaluator((nom!=null?nom.getText():null),ev, true);   
              

            match(input,PC,FOLLOW_PC_in_decremento919); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:188:3: declaracion_lista returns [Evaluator e] : LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC ;
    public final Evaluator declaracion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom2=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:189:3: ( LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:191:3: LIST nom= NOMBRE ( ',' nom2= NOMBRE )* PC
            {
             e = new DeclaracionMultipleEvaluator(); 

            match(input,LIST,FOLLOW_LIST_in_declaracion_lista961); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista965); 


                                              if(bandera)
                                                {
                                                    ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom!=null?nom.getText():null), new ListEvaluator());   
                                                }
                                             

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:199:3: ( ',' nom2= NOMBRE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:199:7: ',' nom2= NOMBRE
            	    {
            	    match(input,42,FOLLOW_42_in_declaracion_lista1008); 

            	    nom2=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista1020); 


            	                                      if(bandera)
            	                                        {
            	                                            ((DeclaracionMultipleEvaluator)e).addDeclaracion((nom2!=null?nom2.getText():null), new ListEvaluator());      
            	                                        }
            	                                     

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_declaracion_lista1097); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:212:1: lista_texto returns [Evaluator e] : LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC ;
    public final Evaluator lista_texto() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token tex=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:213:3: ( LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:214:3: LIST nom= NOMBRE ASIGNACION READ '(' tex= TEXTO ')' PC
            {
            match(input,LIST,FOLLOW_LIST_in_lista_texto1123); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lista_texto1127); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_lista_texto1129); 

            match(input,READ,FOLLOW_READ_in_lista_texto1131); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_lista_texto1133); 

            tex=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_lista_texto1137); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_lista_texto1139); 


                                              if(bandera)
                                                {
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),(new ListFromTextEvaluator((tex!=null?tex.getText():null))).evaluate(pila));   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_lista_texto1212); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:225:1: push returns [Evaluator e] : nom= NOMBRE '.' PUSH '(' exp= expression ')' PC ;
    public final Evaluator push() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:226:3: (nom= NOMBRE '.' PUSH '(' exp= expression ')' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:227:3: nom= NOMBRE '.' PUSH '(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push1240); 

            match(input,46,FOLLOW_46_in_push1242); 

            match(input,PUSH,FOLLOW_PUSH_in_push1244); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_push1246); 

            pushFollow(FOLLOW_expression_in_push1252);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push1254); 


                                              if(bandera)
                                                {
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push1324); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:237:1: size returns [Evaluator e] : nom= NOMBRE size1 ( '()' )* PC ;
    public final Evaluator size() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:238:3: (nom= NOMBRE size1 ( '()' )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:239:3: nom= NOMBRE size1 ( '()' )* PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_size1352); 

            pushFollow(FOLLOW_size1_in_size1355);
            size1();

            state._fsp--;


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:239:21: ( '()' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:239:22: '()'
            	    {
            	    match(input,37,FOLLOW_37_in_size1358); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



                                              if(bandera)
                                                {
                                                    e = new SizeEvaluator((nom!=null?nom.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_size1430); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:251:1: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:252:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:253:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion1465); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion1467); 

            pushFollow(FOLLOW_evaluator_in_asignacion1473);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);       
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion1513); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:265:1: asignacion_lista returns [Evaluator e] : nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC ;
    public final Evaluator asignacion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token num=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:266:3: (nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:267:4: nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' ) PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion_lista1541); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:268:4: ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | SET '(' num= NUMERO ',' ev= evaluator ')' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==56) ) {
                alt14=1;
            }
            else if ( (LA14_0==SET) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:268:7: '[' num= NUMERO ']' ASIGNACION ev= evaluator
                    {
                    match(input,56,FOLLOW_56_in_asignacion_lista1550); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1554); 

                    match(input,57,FOLLOW_57_in_asignacion_lista1556); 

                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion_lista1558); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1564);
                    ev=evaluator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:269:7: SET '(' num= NUMERO ',' ev= evaluator ')'
                    {
                    match(input,SET,FOLLOW_SET_in_asignacion_lista1572); 

                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_asignacion_lista1574); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1578); 

                    match(input,42,FOLLOW_42_in_asignacion_lista1580); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1586);
                    ev=evaluator();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_asignacion_lista1588); 

                    }
                    break;

            }



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionListaEvaluator((nom!=null?nom.getText():null),ev, (num!=null?num.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion_lista1634); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:283:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:284:3: ( COMENTARIO )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:285:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario1652); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:288:1: lectura returns [Evaluator e] : r= READ n= NOMBRE ( ',' exp= expression )? PC ;
    public final Evaluator lectura() throws Exception, RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:289:3: (r= READ n= NOMBRE ( ',' exp= expression )? PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:290:3: r= READ n= NOMBRE ( ',' exp= expression )? PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura1678); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura1682); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:298:3: ( ',' exp= expression )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:299:7: ',' exp= expression
                    {
                    match(input,42,FOLLOW_42_in_lectura1714); 

                    pushFollow(FOLLOW_expression_in_lectura1720);
                    exp=expression();

                    state._fsp--;


                     
                                  if(bandera)
                                        { 
                                            ((ReadEvaluator)e).addText(exp);
                                        }
                                 
                                 

                    }
                    break;

            }


            match(input,PC,FOLLOW_PC_in_lectura1754); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:311:1: print1 returns [Evaluator e] : PRINT (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator print1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:312:3: ( PRINT (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:313:3: PRINT (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintEvaluator(); 

            match(input,PRINT,FOLLOW_PRINT_in_print11783); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:315:3: (exp= expression )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:315:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_print11794);
            exp=expression();

            state._fsp--;


             ((PrintEvaluator)e).addEvaluator(exp); 

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:317:3: ( ',' exp= expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:317:5: ',' exp= expression
            	    {
            	    match(input,42,FOLLOW_42_in_print11806); 

            	    pushFollow(FOLLOW_expression_in_print11816);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_print11827); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:323:1: println returns [Evaluator e] : PRINTLN (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator println() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:324:3: ( PRINTLN (exp= expression ) ( ',' exp= expression )* PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:325:3: PRINTLN (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintlnEvaluator(); 

            match(input,PRINTLN,FOLLOW_PRINTLN_in_println1856); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:327:3: (exp= expression )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:327:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_println1866);
            exp=expression();

            state._fsp--;


             ((PrintlnEvaluator)e).addEvaluator(exp); 

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
            	    match(input,42,FOLLOW_42_in_println1878); 

            	    pushFollow(FOLLOW_expression_in_println1888);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintlnEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_println1899); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:335:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico19 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:336:3: ( logico )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:337:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator1924);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:343:1: term returns [Evaluator e] : (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE size1 ( '()' )* );
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
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:344:3: (lla= llamadofuncion | BOOLEAN | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE size1 ( '()' )* )
            int alt20=9;
            switch ( input.LA(1) ) {
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case PARENTESIS_I:
                    {
                    alt20=1;
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
                    alt20=3;
                    }
                    break;
                case 47:
                case 56:
                    {
                    alt20=8;
                    }
                    break;
                case 48:
                case 49:
                    {
                    alt20=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }

                }
                break;
            case BOOLEAN:
                {
                alt20=2;
                }
                break;
            case NUMERO:
                {
                alt20=4;
                }
                break;
            case DOBLE:
                {
                alt20=5;
                }
                break;
            case TEXTO:
                {
                alt20=6;
                }
                break;
            case PARENTESIS_I:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:346:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term1970);
                    lla=llamadofuncion();

                    state._fsp--;



                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:353:5: BOOLEAN
                    {
                    BOOLEAN20=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_term1986); 


                               System.out.println("entiendo que es un boolean");
                               e = new BooleanEvaluator(((BOOLEAN20!=null?BOOLEAN20.getText():null))); 
                              

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:358:5: NOMBRE
                    {
                    NOMBRE21=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2005); 

                       
                            System.out.println("entiendo que es un llamado");
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE21!=null?NOMBRE21.getText():null)));//((pila.peek().get((NOMBRE21!=null?NOMBRE21.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:365:5: NUMERO
                    {
                    NUMERO22=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term2023); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO22!=null?NUMERO22.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:369:5: DOBLE
                    {
                    DOBLE23=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term2042); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE23!=null?DOBLE23.getText():null)));
                              

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:374:5: TEXTO
                    {
                    TEXTO24=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term2076); 


                              e = new StringEvaluator(((TEXTO24!=null?TEXTO24.getText():null)));
                             

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:379:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term2097); 

                    pushFollow(FOLLOW_add_in_term2099);
                    add25=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term2101); 


                                           e = add25;
                                          

                    }
                    break;
                case 8 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:383:5: nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' )
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2134); 

                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:384:5: ( '.get(' num= add ')' | '[' num= add ']' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==47) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==56) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:384:7: '.get(' num= add ')'
                            {
                            match(input,47,FOLLOW_47_in_term2143); 

                            pushFollow(FOLLOW_add_in_term2149);
                            num=add();

                            state._fsp--;


                            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term2151); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:385:7: '[' num= add ']'
                            {
                            match(input,56,FOLLOW_56_in_term2159); 

                            pushFollow(FOLLOW_add_in_term2169);
                            num=add();

                            state._fsp--;


                            match(input,57,FOLLOW_57_in_term2171); 

                            }
                            break;

                    }



                                    e = new GetEvaluator((nom!=null?nom.getText():null),num);     
                             

                    }
                    break;
                case 9 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:390:5: nom= NOMBRE size1 ( '()' )*
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term2196); 

                    pushFollow(FOLLOW_size1_in_term2199);
                    size1();

                    state._fsp--;


                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:390:23: ( '()' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==37) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:390:24: '()'
                    	    {
                    	    match(input,37,FOLLOW_37_in_term2202); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:396:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator term26 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:397:3: ( ( '+' | '-' )* term )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:399:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:402:3: ( '+' | '-' )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }
                else if ( (LA21_0==43) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:403:7: '+'
            	    {
            	    match(input,39,FOLLOW_39_in_unary2256); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:404:7: '-'
            	    {
            	    match(input,43,FOLLOW_43_in_unary2264); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary2285);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:417:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* ;
    public final Evaluator mult() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:418:3: (op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:419:6: op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult2322);
            op1=unary();

            state._fsp--;


            e = op1;

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:420:3: ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            loop22:
            do {
                int alt22=4;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt22=1;
                    }
                    break;
                case 50:
                    {
                    alt22=2;
                    }
                    break;
                case 35:
                    {
                    alt22=3;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:420:6: '*' op2= unary
            	    {
            	    match(input,38,FOLLOW_38_in_mult2331); 

            	    pushFollow(FOLLOW_unary_in_mult2335);
            	    op2=unary();

            	    state._fsp--;


            	    e = new TimesEvaluator(e,op2);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:421:6: '/' op2= unary
            	    {
            	    match(input,50,FOLLOW_50_in_mult2343); 

            	    pushFollow(FOLLOW_unary_in_mult2347);
            	    op2=unary();

            	    state._fsp--;


            	    e = new DivideEvaluator(e,op2);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:422:6: '%' op2= unary
            	    {
            	    match(input,35,FOLLOW_35_in_mult2356); 

            	    pushFollow(FOLLOW_unary_in_mult2360);
            	    op2=unary();

            	    state._fsp--;


            	    e = new ModEvaluator(e,op2); 

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
    // $ANTLR end "mult"



    // $ANTLR start "add"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:426:1: add returns [Evaluator e] : op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )* ;
    public final Evaluator add() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:427:3: (op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:428:5: op1= mult ( ( '+' op2= mult ) | ( minus op2= mult ) )*
            {
            pushFollow(FOLLOW_mult_in_add2394);
            op1=mult();

            state._fsp--;


            e = op1;

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:429:3: ( ( '+' op2= mult ) | ( minus op2= mult ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    alt23=1;
                }
                else if ( (LA23_0==43) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:430:3: ( '+' op2= mult )
            	    {
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:430:3: ( '+' op2= mult )
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:430:5: '+' op2= mult
            	    {
            	    match(input,39,FOLLOW_39_in_add2406); 

            	    pushFollow(FOLLOW_mult_in_add2410);
            	    op2=mult();

            	    state._fsp--;


            	    e = new PlusEvaluator(e, op2);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:432:5: ( minus op2= mult )
            	    {
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:432:5: ( minus op2= mult )
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:432:6: minus op2= mult
            	    {
            	    pushFollow(FOLLOW_minus_in_add2423);
            	    minus();

            	    state._fsp--;


            	    pushFollow(FOLLOW_mult_in_add2427);
            	    op2=mult();

            	    state._fsp--;


            	    e = new MinusEvaluator(e, op2);

            	    }


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
    // $ANTLR end "add"



    // $ANTLR start "relation"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:437:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:438:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:439:5: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation2465);
            ex1=add();

            state._fsp--;


            e = ex1;

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:440:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34||(LA25_0 >= 51 && LA25_0 <= 55)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:441:3: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:441:3: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt24=6;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt24=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:442:5: '==' ex2= add
            	            {
            	            match(input,53,FOLLOW_53_in_relation2481); 

            	            pushFollow(FOLLOW_add_in_relation2485);
            	            ex2=add();

            	            state._fsp--;


            	            e = new IgualIgualEvaluator(e,ex2);

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:443:5: '>' ex2= add
            	            {
            	            match(input,54,FOLLOW_54_in_relation2493); 

            	            pushFollow(FOLLOW_add_in_relation2497);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MayorEvaluator(e,ex2);

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:444:5: '<' ex2= add
            	            {
            	            match(input,51,FOLLOW_51_in_relation2508); 

            	            pushFollow(FOLLOW_add_in_relation2512);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MenorEvaluator(e,ex2);

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:445:5: '!=' ex2= add
            	            {
            	            match(input,34,FOLLOW_34_in_relation2523); 

            	            pushFollow(FOLLOW_add_in_relation2527);
            	            ex2=add();

            	            state._fsp--;


            	            e = new DiferenteEvaluator(e,ex2);

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:446:5: '<=' ex2= add
            	            {
            	            match(input,52,FOLLOW_52_in_relation2537); 

            	            pushFollow(FOLLOW_add_in_relation2541);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MenorIgualEvaluator(e,ex2);

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:447:5: '>=' ex2= add
            	            {
            	            match(input,55,FOLLOW_55_in_relation2551); 

            	            pushFollow(FOLLOW_add_in_relation2555);
            	            ex2=add();

            	            state._fsp--;


            	            e = new MayorIgualEvaluator(e,ex2);

            	            }
            	            break;

            	    }


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
    // $ANTLR end "relation"



    // $ANTLR start "logico"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:452:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:453:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:454:5: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico2595);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:458:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==36) ) {
                    alt26=1;
                }
                else if ( (LA26_0==58) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:459:5: '&&' rel2= relation
            	    {
            	    match(input,36,FOLLOW_36_in_logico2623); 

            	    pushFollow(FOLLOW_relation_in_logico2627);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:463:6: '||' rel2= relation
            	    {
            	    match(input,58,FOLLOW_58_in_logico2659); 

            	    pushFollow(FOLLOW_relation_in_logico2663);
            	    rel2=relation();

            	    state._fsp--;



            	                             e = new OrEvaluator(e,rel2);
            	                            

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
    // $ANTLR end "logico"



    // $ANTLR start "expression"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:470:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico27 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:471:2: ( logico )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:471:6: logico
            {
            pushFollow(FOLLOW_logico_in_expression2719);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:475:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC ;
    public final Evaluator llamadofuncion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:476:4: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:477:9: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2754); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2759); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:479:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==BOOLEAN||LA28_0==DOBLE||(LA28_0 >= NOMBRE && LA28_0 <= NUMERO)||LA28_0==PARENTESIS_I||LA28_0==TEXTO) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:479:9: (ev= term ) ( ',' ev= term )*
                    {
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:479:9: (ev= term )
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:479:10: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2774);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev); 

                    }


                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:481:4: ( ',' ev= term )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==42) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:481:5: ',' ev= term
                    	    {
                    	    match(input,42,FOLLOW_42_in_llamadofuncion2786); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2793);
                    	    ev=term();

                    	    state._fsp--;


                    	    ((FuncionEvaluator) e).llenarParametro(ev); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2806); 

            match(input,PC,FOLLOW_PC_in_llamadofuncion2817); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:487:1: statements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | ifstatement | whilestatemet | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento );
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
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:488:3: ( print1 | println | asignacion | lectura | comentario | return1 | ifstatement | whilestatemet | llamadofuncion | declaracion_mult | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size | unincremento | menosunincremento | incremento | decremento )
            int alt29=20;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt29=1;
                }
                break;
            case PRINTLN:
                {
                alt29=2;
                }
                break;
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case ASIGNACION:
                    {
                    alt29=3;
                    }
                    break;
                case 46:
                    {
                    alt29=12;
                    }
                    break;
                case 40:
                    {
                    alt29=17;
                    }
                    break;
                case 44:
                    {
                    alt29=18;
                    }
                    break;
                case 41:
                    {
                    alt29=19;
                    }
                    break;
                case 45:
                    {
                    alt29=20;
                    }
                    break;
                case PARENTESIS_I:
                    {
                    alt29=9;
                    }
                    break;
                case SET:
                case 56:
                    {
                    alt29=14;
                    }
                    break;
                case 48:
                case 49:
                    {
                    alt29=16;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 3, input);

                    throw nvae;

                }

                }
                break;
            case READ:
                {
                alt29=4;
                }
                break;
            case COMENTARIO:
                {
                alt29=5;
                }
                break;
            case RETURN:
                {
                alt29=6;
                }
                break;
            case IF:
                {
                alt29=7;
                }
                break;
            case WHILE:
                {
                alt29=8;
                }
                break;
            case VARIABLE:
                {
                alt29=10;
                }
                break;
            case LIST:
                {
                int LA29_10 = input.LA(2);

                if ( (LA29_10==NOMBRE) ) {
                    int LA29_21 = input.LA(3);

                    if ( (LA29_21==ASIGNACION) ) {
                        alt29=15;
                    }
                    else if ( (LA29_21==PC||LA29_21==42) ) {
                        alt29=11;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 21, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 10, input);

                    throw nvae;

                }
                }
                break;
            case FOR:
                {
                alt29=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:489:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_statements2851);
                    print128=print1();

                    state._fsp--;


                    e = print128;

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:490:5: println
                    {
                    pushFollow(FOLLOW_println_in_statements2871);
                    println29=println();

                    state._fsp--;


                    e = println29;

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:491:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_statements2890);
                    asignacion30=asignacion();

                    state._fsp--;


                    e = asignacion30;

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:492:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_statements2905);
                    lectura31=lectura();

                    state._fsp--;


                    e = lectura31;

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:493:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_statements2924);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:494:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_statements2939);
                    return132=return1();

                    state._fsp--;


                    e = return132;

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:495:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statements2957);
                    ifstatement33=ifstatement();

                    state._fsp--;


                    e = ifstatement33;

                    }
                    break;
                case 8 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:496:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_statements2972);
                    whilestatemet34=whilestatemet();

                    state._fsp--;


                    e = whilestatemet34;

                    }
                    break;
                case 9 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:497:5: llamadofuncion
                    {
                    pushFollow(FOLLOW_llamadofuncion_in_statements2984);
                    llamadofuncion35=llamadofuncion();

                    state._fsp--;


                    e = llamadofuncion35;

                    }
                    break;
                case 10 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:498:5: declaracion_mult
                    {
                    pushFollow(FOLLOW_declaracion_mult_in_statements2996);
                    declaracion_mult36=declaracion_mult();

                    state._fsp--;


                    e = declaracion_mult36;

                    }
                    break;
                case 11 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:499:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_statements3005);
                    declaracion_lista37=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista37;

                    }
                    break;
                case 12 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:500:5: push
                    {
                    pushFollow(FOLLOW_push_in_statements3013);
                    push38=push();

                    state._fsp--;


                    e = push38;

                    }
                    break;
                case 13 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:501:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_statements3034);
                    forstatemet39=forstatemet();

                    state._fsp--;


                    e = forstatemet39;

                    }
                    break;
                case 14 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:502:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_statements3048);
                    asignacion_lista40=asignacion_lista();

                    state._fsp--;


                    e = asignacion_lista40;

                    }
                    break;
                case 15 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:503:5: lista_texto
                    {
                    pushFollow(FOLLOW_lista_texto_in_statements3057);
                    lista_texto41=lista_texto();

                    state._fsp--;


                    e = lista_texto41;

                    }
                    break;
                case 16 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:504:5: size
                    {
                    pushFollow(FOLLOW_size_in_statements3071);
                    size42=size();

                    state._fsp--;


                    e = size42;

                    }
                    break;
                case 17 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:505:5: unincremento
                    {
                    pushFollow(FOLLOW_unincremento_in_statements3092);
                    unincremento43=unincremento();

                    state._fsp--;


                    e = unincremento43;

                    }
                    break;
                case 18 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:506:5: menosunincremento
                    {
                    pushFollow(FOLLOW_menosunincremento_in_statements3105);
                    menosunincremento44=menosunincremento();

                    state._fsp--;


                    e = menosunincremento44;

                    }
                    break;
                case 19 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:507:5: incremento
                    {
                    pushFollow(FOLLOW_incremento_in_statements3113);
                    incremento45=incremento();

                    state._fsp--;


                    e = incremento45;

                    }
                    break;
                case 20 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:508:5: decremento
                    {
                    pushFollow(FOLLOW_decremento_in_statements3128);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:511:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )* ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )* ;
    public final Evaluator ifstatement() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:512:3: ( IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )* ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:513:3: IF PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )* ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement3160); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3162); 

            pushFollow(FOLLOW_logico_in_ifstatement3168);
            rel=logico();

            state._fsp--;



            			  e = new IfEvaluator ();   
            			  ((IfEvaluator) e).agregarCondicion(rel);
            			

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3176); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:518:15: ( PC )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==PC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:518:15: PC
                    {
                    match(input,PC,FOLLOW_PC_in_ifstatement3178); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3181); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:518:27: ( PC )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:518:27: PC
                    {
                    match(input,PC,FOLLOW_PC_in_ifstatement3183); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:519:3: (ifs= statements )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMENTARIO||LA32_0==FOR||(LA32_0 >= IF && LA32_0 <= LIST)||LA32_0==NOMBRE||(LA32_0 >= PRINT && LA32_0 <= PRINTLN)||(LA32_0 >= READ && LA32_0 <= RETURN)||(LA32_0 >= VARIABLE && LA32_0 <= WHILE)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:519:4: ifs= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_ifstatement3194);
            	    ifs=statements();

            	    state._fsp--;



            	    		   ((IfEvaluator) e).agregarCoso(ifs);   
            	    		  
            	    		 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3212); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:525:13: ( PC )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==PC) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:525:13: PC
                    {
                    match(input,PC,FOLLOW_PC_in_ifstatement3214); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:528:3: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ELSEIF) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:528:4: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (ifs= statements )* LLAVE_D ( PC )?
            	    {
            	    match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement3224); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3226); 

            	    pushFollow(FOLLOW_logico_in_ifstatement3230);
            	    rel1=logico();

            	    state._fsp--;



            	    			 ((IfEvaluator) e).nuevoSegmento();
            	    			 ((IfEvaluator) e).agregarCondicion(rel1); 
            	    			

            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3238); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:533:15: ( PC )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==PC) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:533:15: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3240); 

            	            }
            	            break;

            	    }


            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3243); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:533:27: ( PC )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==PC) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:533:27: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3245); 

            	            }
            	            break;

            	    }


            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:534:3: (ifs= statements )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==COMENTARIO||LA36_0==FOR||(LA36_0 >= IF && LA36_0 <= LIST)||LA36_0==NOMBRE||(LA36_0 >= PRINT && LA36_0 <= PRINTLN)||(LA36_0 >= READ && LA36_0 <= RETURN)||(LA36_0 >= VARIABLE && LA36_0 <= WHILE)) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:535:5: ifs= statements
            	    	    {
            	    	    pushFollow(FOLLOW_statements_in_ifstatement3259);
            	    	    ifs=statements();

            	    	    state._fsp--;



            	    	    		   ((IfEvaluator) e).agregarCoso(ifs);   
            	    	    		 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3275); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:540:11: ( PC )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==PC) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:540:11: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3277); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:542:3: ( ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ELSE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:542:5: ELSE ( PC )? LLAVE_I ( PC )? (elses= statements )* LLAVE_D ( PC )?
            	    {
            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement3289); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:542:10: ( PC )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==PC) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:542:10: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3291); 

            	            }
            	            break;

            	    }


            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3296); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:543:11: ( PC )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==PC) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:543:11: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3298); 

            	            }
            	            break;

            	    }


            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:543:14: (elses= statements )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==COMENTARIO||LA41_0==FOR||(LA41_0 >= IF && LA41_0 <= LIST)||LA41_0==NOMBRE||(LA41_0 >= PRINT && LA41_0 <= PRINTLN)||(LA41_0 >= READ && LA41_0 <= RETURN)||(LA41_0 >= VARIABLE && LA41_0 <= WHILE)) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:544:5: elses= statements
            	    	    {
            	    	    pushFollow(FOLLOW_statements_in_ifstatement3310);
            	    	    elses=statements();

            	    	    state._fsp--;


            	    	     ((IfEvaluator)e).agregarCosoElse(elses); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3324); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:547:11: ( PC )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==PC) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:547:11: PC
            	            {
            	            match(input,PC,FOLLOW_PC_in_ifstatement3326); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:551:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? ;
    public final Evaluator whilestatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:552:4: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:553:4: WHILE PARENTESIS_I rel= logico PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )?
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet3365); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet3367); 

            pushFollow(FOLLOW_logico_in_whilestatemet3371);
            rel=logico();

            state._fsp--;


             e = new WhileEvaluator(rel); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet3383); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:16: ( PC )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PC) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:16: PC
                    {
                    match(input,PC,FOLLOW_PC_in_whilestatemet3385); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet3388); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:28: ( PC )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==PC) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:28: PC
                    {
                    match(input,PC,FOLLOW_PC_in_whilestatemet3390); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:556:3: (wh= statements )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMENTARIO||LA46_0==FOR||(LA46_0 >= IF && LA46_0 <= LIST)||LA46_0==NOMBRE||(LA46_0 >= PRINT && LA46_0 <= PRINTLN)||(LA46_0 >= READ && LA46_0 <= RETURN)||(LA46_0 >= VARIABLE && LA46_0 <= WHILE)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:556:4: wh= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_whilestatemet3400);
            	    wh=statements();

            	    state._fsp--;


            	     ((WhileEvaluator) e).add(wh); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet3419); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:560:11: ( PC )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==PC) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:560:11: PC
                    {
                    match(input,PC,FOLLOW_PC_in_whilestatemet3421); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:564:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion_mult logi= logico PC aumento= add PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? ;
    public final Evaluator forstatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator decl =null;

        Evaluator logi =null;

        Evaluator aumento =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:565:3: ( FOR PARENTESIS_I decl= declaracion_mult logi= logico PC aumento= add PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )? )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:566:3: FOR PARENTESIS_I decl= declaracion_mult logi= logico PC aumento= add PARENTESIS_D ( PC )? LLAVE_I ( PC )? (wh= statements )* LLAVE_D ( PC )?
            {
            match(input,FOR,FOLLOW_FOR_in_forstatemet3446); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet3448); 

            pushFollow(FOLLOW_declaracion_mult_in_forstatemet3452);
            decl=declaracion_mult();

            state._fsp--;


            pushFollow(FOLLOW_logico_in_forstatemet3456);
            logi=logico();

            state._fsp--;


            match(input,PC,FOLLOW_PC_in_forstatemet3458); 

            pushFollow(FOLLOW_add_in_forstatemet3462);
            aumento=add();

            state._fsp--;


             e = new ForEvaluator(decl, logi, aumento); 

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet3476); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:568:16: ( PC )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==PC) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:568:16: PC
                    {
                    match(input,PC,FOLLOW_PC_in_forstatemet3478); 

                    }
                    break;

            }


            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet3481); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:568:28: ( PC )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==PC) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:568:28: PC
                    {
                    match(input,PC,FOLLOW_PC_in_forstatemet3483); 

                    }
                    break;

            }


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:569:3: (wh= statements )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMENTARIO||LA50_0==FOR||(LA50_0 >= IF && LA50_0 <= LIST)||LA50_0==NOMBRE||(LA50_0 >= PRINT && LA50_0 <= PRINTLN)||(LA50_0 >= READ && LA50_0 <= RETURN)||(LA50_0 >= VARIABLE && LA50_0 <= WHILE)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:569:4: wh= statements
            	    {
            	    pushFollow(FOLLOW_statements_in_forstatemet3494);
            	    wh=statements();

            	    state._fsp--;


            	     ((ForEvaluator) e).add(wh); 

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet3511); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:572:11: ( PC )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==PC) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:572:11: PC
                    {
                    match(input,PC,FOLLOW_PC_in_forstatemet3513); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:645:1: minus : '-' ;
    public final void minus() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:646:4: ( '-' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:647:4: '-'
            {
            match(input,43,FOLLOW_43_in_minus3888); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:655:3: parentesis_d : ')' ;
    public final void parentesis_d() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:656:3: ( ')' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:657:3: ')'
            {
            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_parentesis_d3923); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:665:3: parentesis_i : '(' ;
    public final void parentesis_i() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:666:3: ( '(' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:667:3: '('
            {
            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_parentesis_i3957); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:708:1: size1 : ( '.tamano' | '.size' ) ;
    public final void size1() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:708:6: ( ( '.tamano' | '.size' ) )
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
    public static final BitSet FOLLOW_menosunincremento_in_programa344 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_incremento_in_programa359 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_decremento_in_programa374 = new BitSet(new long[]{0x00000000C584F042L});
    public static final BitSet FOLLOW_RETURN_in_return1427 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_return1433 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_return1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion478 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion484 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parentesis_i_in_funcion486 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion505 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_42_in_funcion522 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VARIABLE_in_funcion524 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion530 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_parentesis_d_in_funcion549 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_funcion551 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion555 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_funcion557 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_funcion572 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion584 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PC_in_funcion586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_declaracion_mult622 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_mult628 = new BitSet(new long[]{0x0000040000400010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion_mult644 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion_mult650 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_declaracion_mult678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_mult690 = new BitSet(new long[]{0x0000040000400010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion_mult708 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_declaracion_mult714 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_declaracion_mult744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_unincremento772 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_unincremento774 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_unincremento779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_menosunincremento811 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_menosunincremento813 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_menosunincremento822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_incremento853 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_incremento855 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_incremento860 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_incremento871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_decremento901 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_decremento903 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_decremento908 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_decremento919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_declaracion_lista961 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista965 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_declaracion_lista1008 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista1020 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_lista_texto1123 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_lista_texto1127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_lista_texto1129 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_READ_in_lista_texto1131 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_lista_texto1133 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_TEXTO_in_lista_texto1137 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_lista_texto1139 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_lista_texto1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push1240 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_push1242 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PUSH_in_push1244 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_push1246 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_push1252 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push1254 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_push1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_size1352 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_size1_in_size1355 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_37_in_size1358 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_PC_in_size1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion1465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion1467 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion1473 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_asignacion1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion_lista1541 = new BitSet(new long[]{0x0100000010000000L});
    public static final BitSet FOLLOW_56_in_asignacion_lista1550 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1554 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_asignacion_lista1556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion_lista1558 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1564 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SET_in_asignacion_lista1572 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_asignacion_lista1574 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1578 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_asignacion_lista1580 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1586 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_asignacion_lista1588 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_asignacion_lista1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura1678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura1682 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_lectura1714 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_lectura1720 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_lectura1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print11783 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_print11794 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_print11806 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_print11816 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_print11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println1856 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_println1866 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_42_in_println1878 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_expression_in_println1888 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_PC_in_println1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_term1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term2097 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_term2099 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2134 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_47_in_term2143 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_term2149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_term2159 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_term2169 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_term2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term2196 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_size1_in_term2199 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_term2202 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_39_in_unary2256 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_43_in_unary2264 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_term_in_unary2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult2322 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_38_in_mult2331 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_unary_in_mult2335 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_50_in_mult2343 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_unary_in_mult2347 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_35_in_mult2356 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_unary_in_mult2360 = new BitSet(new long[]{0x0004004800000002L});
    public static final BitSet FOLLOW_mult_in_add2394 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_39_in_add2406 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_mult_in_add2410 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_minus_in_add2423 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_mult_in_add2427 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_add_in_relation2465 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_53_in_relation2481 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2485 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_54_in_relation2493 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2497 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_51_in_relation2508 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2512 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_34_in_relation2523 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2527 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_52_in_relation2537 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2541 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_55_in_relation2551 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_relation2555 = new BitSet(new long[]{0x00F8000400000002L});
    public static final BitSet FOLLOW_relation_in_logico2595 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_36_in_logico2623 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_relation_in_logico2627 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_58_in_logico2659 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_relation_in_logico2663 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_logico_in_expression2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2754 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2759 = new BitSet(new long[]{0x00000000203C0220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2774 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_42_in_llamadofuncion2786 = new BitSet(new long[]{0x00000000202C0220L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2793 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2806 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_llamadofuncion2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_statements2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_statements2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_statements2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_statements2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_statements2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_statements2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statements2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_statements2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_statements2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_mult_in_statements2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_statements3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_statements3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_statements3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_statements3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lista_texto_in_statements3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_in_statements3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unincremento_in_statements3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_menosunincremento_in_statements3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incremento_in_statements3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decremento_in_statements3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement3160 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3162 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3168 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3176 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3178 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3181 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_ifstatement3183 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_ifstatement3194 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3212 = new BitSet(new long[]{0x0000000000400C02L});
    public static final BitSet FOLLOW_PC_in_ifstatement3214 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ELSEIF_in_ifstatement3224 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3226 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_ifstatement3230 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3238 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3240 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3243 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_ifstatement3245 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_ifstatement3259 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3275 = new BitSet(new long[]{0x0000000000400C02L});
    public static final BitSet FOLLOW_PC_in_ifstatement3277 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement3289 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_ifstatement3291 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3296 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_ifstatement3298 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_ifstatement3310 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3324 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_PC_in_ifstatement3326 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet3365 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet3367 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_whilestatemet3371 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet3383 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3385 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet3388 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3390 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_whilestatemet3400 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet3419 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PC_in_whilestatemet3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatemet3446 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet3448 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_declaracion_mult_in_forstatemet3452 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_logico_in_forstatemet3456 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3458 = new BitSet(new long[]{0x00000880202C0220L});
    public static final BitSet FOLLOW_add_in_forstatemet3462 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet3476 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3478 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LLAVE_I_in_forstatemet3481 = new BitSet(new long[]{0x00000000CDC5D040L});
    public static final BitSet FOLLOW_PC_in_forstatemet3483 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_statements_in_forstatemet3494 = new BitSet(new long[]{0x00000000CD85D040L});
    public static final BitSet FOLLOW_LLAVE_D_in_forstatemet3511 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_PC_in_forstatemet3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_minus3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_parentesis_d3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_parentesis_i3957 = new BitSet(new long[]{0x0000000000000002L});

}