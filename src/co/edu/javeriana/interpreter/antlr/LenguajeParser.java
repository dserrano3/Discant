// $ANTLR 3.4 /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g 2014-07-19 23:33:24

package co.edu.javeriana.interpreter.antlr;
import co.edu.javeriana.interpreter.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "COMENTARIO", "COMILLASD", "COMILLASS", "DOBLE", "ELSE", "ELSEIF", "FOR", "FUNCTION", "IF", "LLAVE_D", "LLAVE_I", "NEWLINE", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", "PC", "PRINT", "READ", "TEXTO", "TOKEN", "WHILE", "WS", "'!='", "'&&'", "'*'", "'+'", "','", "'-'", "'.get('", "'.push('", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'list'", "'return'", "'var'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__28=28;
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
    public static final int READ=23;
    public static final int TEXTO=24;
    public static final int TOKEN=25;
    public static final int WHILE=26;
    public static final int WS=27;

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
    public String getGrammarFileName() { return "/home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g"; }


    Context1 contexto = new Context1(); 
    boolean bandera = true;
    ArrayList<Context1> pila = new ArrayList<Context1>();
    public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();




    // $ANTLR start "programa"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:37:1: programa returns [StringBuilder output] : ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push | forstatemet )+ ;
    public final StringBuilder programa() throws RecognitionException {
        StringBuilder output = null;


        Evaluator print11 =null;

        Evaluator asignacion2 =null;

        Evaluator ifstatement3 =null;

        Evaluator lectura4 =null;

        Evaluator whilestatemet5 =null;

        Evaluator llamadofuncion6 =null;

        Evaluator declaracion7 =null;

        Evaluator declaracion28 =null;

        Evaluator declaracion_lista9 =null;

        Evaluator push10 =null;

        Evaluator forstatemet11 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:38:3: ( ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push | forstatemet )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:40:3: ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push | forstatemet )+
            {

               pila.add(new Context1()); 
               output = new StringBuilder();
              

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:44:3: ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push | forstatemet )+
            int cnt1=0;
            loop1:
            do {
                int alt1=14;
                switch ( input.LA(1) ) {
                case PRINT:
                    {
                    alt1=1;
                    }
                    break;
                case NOMBRE:
                    {
                    switch ( input.LA(2) ) {
                    case ASIGNACION:
                        {
                        alt1=2;
                        }
                        break;
                    case 35:
                        {
                        alt1=12;
                        }
                        break;
                    case PARENTESIS_I:
                        {
                        alt1=8;
                        }
                        break;

                    }

                    }
                    break;
                case IF:
                    {
                    alt1=3;
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
                case WHILE:
                    {
                    alt1=6;
                    }
                    break;
                case FUNCTION:
                    {
                    alt1=7;
                    }
                    break;
                case 44:
                    {
                    int LA1_9 = input.LA(2);

                    if ( (LA1_9==NOMBRE) ) {
                        int LA1_15 = input.LA(3);

                        if ( (LA1_15==ASIGNACION) ) {
                            alt1=9;
                        }
                        else if ( (LA1_15==PC) ) {
                            alt1=10;
                        }


                    }


                    }
                    break;
                case 42:
                    {
                    alt1=11;
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
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:45:5: print1
            	    {
            	    pushFollow(FOLLOW_print1_in_programa71);
            	    print11=print1();

            	    state._fsp--;


            	    output.append((String)print11.evaluate(pila));

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:46:7: asignacion
            	    {
            	    pushFollow(FOLLOW_asignacion_in_programa93);
            	    asignacion2=asignacion();

            	    state._fsp--;


            	    asignacion2.evaluate(pila);

            	    }
            	    break;
            	case 3 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:47:7: ifstatement
            	    {
            	    pushFollow(FOLLOW_ifstatement_in_programa109);
            	    ifstatement3=ifstatement();

            	    state._fsp--;


            	    ifstatement3.evaluate(pila);

            	    }
            	    break;
            	case 4 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:48:7: lectura
            	    {
            	    pushFollow(FOLLOW_lectura_in_programa124);
            	    lectura4=lectura();

            	    state._fsp--;


            	    lectura4.evaluate(pila);

            	    }
            	    break;
            	case 5 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:49:7: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_programa143);
            	    comentario();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:50:7: whilestatemet
            	    {
            	    pushFollow(FOLLOW_whilestatemet_in_programa151);
            	    whilestatemet5=whilestatemet();

            	    state._fsp--;


            	    output.append((String)whilestatemet5.evaluate(pila));

            	    }
            	    break;
            	case 7 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:51:7: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_programa164);
            	    funcion();

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:52:7: llamadofuncion PC
            	    {
            	    pushFollow(FOLLOW_llamadofuncion_in_programa172);
            	    llamadofuncion6=llamadofuncion();

            	    state._fsp--;


            	    llamadofuncion6.evaluate(pila);

            	    match(input,PC,FOLLOW_PC_in_programa178); 

            	    }
            	    break;
            	case 9 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:53:7: declaracion
            	    {
            	    pushFollow(FOLLOW_declaracion_in_programa186);
            	    declaracion7=declaracion();

            	    state._fsp--;


            	    declaracion7.evaluate(pila);

            	    }
            	    break;
            	case 10 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:54:7: declaracion2
            	    {
            	    pushFollow(FOLLOW_declaracion2_in_programa201);
            	    declaracion28=declaracion2();

            	    state._fsp--;


            	    declaracion28.evaluate(pila);

            	    }
            	    break;
            	case 11 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:55:7: declaracion_lista
            	    {
            	    pushFollow(FOLLOW_declaracion_lista_in_programa215);
            	    declaracion_lista9=declaracion_lista();

            	    state._fsp--;


            	    declaracion_lista9.evaluate(pila);

            	    }
            	    break;
            	case 12 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:56:7: push
            	    {
            	    pushFollow(FOLLOW_push_in_programa224);
            	    push10=push();

            	    state._fsp--;


            	    push10.evaluate(pila);

            	    }
            	    break;
            	case 13 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:57:7: forstatemet
            	    {
            	    pushFollow(FOLLOW_forstatemet_in_programa246);
            	    forstatemet11=forstatemet();

            	    state._fsp--;


            	    output.append((String)forstatemet11.evaluate(pila));

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return output;
    }
    // $ANTLR end "programa"



    // $ANTLR start "return1"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:66:3: return1 returns [Evaluator e] : 'return' te= evaluator PC ;
    public final Evaluator return1() throws RecognitionException {
        Evaluator e = null;


        Evaluator te =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:67:3: ( 'return' te= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:68:5: 'return' te= evaluator PC
            {
            match(input,43,FOLLOW_43_in_return1301); 

            pushFollow(FOLLOW_evaluator_in_return1307);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1314); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "return1"



    // $ANTLR start "funcion"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:76:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' ;
    public final Evaluator funcion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom1=null;
        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:77:3: ( FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:78:3: FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}'
            {
            e = new FuncionEvaluator();

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion348); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion354); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_funcion356); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:81:2: ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:81:3: ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )*
                    {
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:81:3: ( 'var' nom1= NOMBRE )
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:82:4: 'var' nom1= NOMBRE
                    {
                    match(input,44,FOLLOW_44_in_funcion368); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion374); 


                    	     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	  

                    }


                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:87:2: ( ',' 'var' nom1= NOMBRE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==32) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:88:5: ',' 'var' nom1= NOMBRE
                    	    {
                    	    match(input,32,FOLLOW_32_in_funcion391); 

                    	    match(input,44,FOLLOW_44_in_funcion393); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion399); 


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


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_funcion417); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion420); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:97:4: (wh= whilestatements )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMENTARIO||LA4_0==FOR||LA4_0==IF||LA4_0==NOMBRE||(LA4_0 >= PRINT && LA4_0 <= READ)||LA4_0==WHILE||(LA4_0 >= 42 && LA4_0 <= 44)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:97:5: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_funcion434);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion446); 

            funciones.put((nom!=null?nom.getText():null), e);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "funcion"



    // $ANTLR start "declaracion"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:111:1: declaracion returns [Evaluator e] : 'var' nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator declaracion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:112:3: ( 'var' nom= NOMBRE ASIGNACION ev= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:113:3: 'var' nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            match(input,44,FOLLOW_44_in_declaracion478); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion482); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion484); 

            pushFollow(FOLLOW_evaluator_in_declaracion490);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                              		  //System.out.println("intento salvar");
                                              		  e = new DeclaracionEvaluator((nom!=null?nom.getText():null),ev);   
                                          			
                                              			
                                              	}
                                             

            match(input,PC,FOLLOW_PC_in_declaracion561); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "declaracion"



    // $ANTLR start "declaracion2"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:126:3: declaracion2 returns [Evaluator e] : 'var' nom= NOMBRE PC ;
    public final Evaluator declaracion2() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:127:3: ( 'var' nom= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:128:3: 'var' nom= NOMBRE PC
            {
            match(input,44,FOLLOW_44_in_declaracion2585); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion2589); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new IntEvaluator(0));   
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion2662); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "declaracion2"



    // $ANTLR start "declaracion_lista"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:143:3: declaracion_lista returns [Evaluator e] : 'list' nom= NOMBRE PC ;
    public final Evaluator declaracion_lista() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:144:3: ( 'list' nom= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:146:3: 'list' nom= NOMBRE PC
            {
            match(input,42,FOLLOW_42_in_declaracion_lista688); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista692); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new ListEvaluator());   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion_lista765); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "declaracion_lista"



    // $ANTLR start "push"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:158:3: push returns [Evaluator e] : nom= NOMBRE '.push(' exp= expression ')' PC ;
    public final Evaluator push() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:159:3: (nom= NOMBRE '.push(' exp= expression ')' PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:160:3: nom= NOMBRE '.push(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push792); 

            match(input,35,FOLLOW_35_in_push794); 

            pushFollow(FOLLOW_expression_in_push800);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push802); 


                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar");
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push872); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "push"



    // $ANTLR start "asignacion"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:173:3: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:174:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:175:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion906); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion908); 

            pushFollow(FOLLOW_evaluator_in_asignacion914);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);    
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion954); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "asignacion"



    // $ANTLR start "comentario"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:188:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:189:3: ( COMENTARIO )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:190:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "comentario"



    // $ANTLR start "lectura"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:193:1: lectura returns [Evaluator e] : r= READ n= NOMBRE PC ;
    public final Evaluator lectura() throws RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:194:3: (r= READ n= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:195:3: r= READ n= NOMBRE PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura991); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura995); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            match(input,PC,FOLLOW_PC_in_lectura1042); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "lectura"



    // $ANTLR start "print1"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:207:1: print1 returns [Evaluator e] : PRINT evaluator PC ;
    public final Evaluator print1() throws RecognitionException {
        Evaluator e = null;


        Evaluator evaluator12 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:208:3: ( PRINT evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:209:3: PRINT evaluator PC
            {
            match(input,PRINT,FOLLOW_PRINT_in_print11061); 

            pushFollow(FOLLOW_evaluator_in_print11063);
            evaluator12=evaluator();

            state._fsp--;



                              if(bandera)
                              	{
                              	  
                              	  //aca esta el problema del while pasa el evaluator cuando no existe en el mapa todabia
                              		e = new PrintEvaluator(evaluator12); 
                              		//System.out.println("Paso "+e);
                              	}
                             

            match(input,PC,FOLLOW_PC_in_print11091); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "print1"



    // $ANTLR start "evaluator"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:223:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws RecognitionException {
        Evaluator e = null;


        Evaluator logico13 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:224:3: ( logico )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:225:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator1110);
            logico13=logico();

            state._fsp--;



                     e = logico13;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "evaluator"



    // $ANTLR start "term"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:231:1: term returns [Evaluator e] : (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE '.get(' num= add ')' );
    public final Evaluator term() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token NOMBRE14=null;
        Token NUMERO15=null;
        Token DOBLE16=null;
        Token TEXTO17=null;
        Evaluator lla =null;

        Evaluator num =null;

        Evaluator add18 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:232:3: (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE '.get(' num= add ')' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt5=7;
                    }
                    break;
                case PARENTESIS_I:
                    {
                    alt5=1;
                    }
                    break;
                case PARENTESIS_D:
                case PC:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 45:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

                }
                break;
            case NUMERO:
                {
                alt5=3;
                }
                break;
            case DOBLE:
                {
                alt5=4;
                }
                break;
            case TEXTO:
                {
                alt5=5;
                }
                break;
            case PARENTESIS_I:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:234:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term1152);
                    lla=llamadofuncion();

                    state._fsp--;



                             //System.out.println("entiendo que es un llamado"); 
                              //e = lla;
                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:243:5: NOMBRE
                    {
                    NOMBRE14=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1168); 

                      
                           // System.out.println("entiendo que es un llamado");
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE14!=null?NOMBRE14.getText():null)));//((pila.peek().get((NOMBRE14!=null?NOMBRE14.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:250:5: NUMERO
                    {
                    NUMERO15=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term1186); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO15!=null?NUMERO15.getText():null)));
                              

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:254:6: DOBLE
                    {
                    DOBLE16=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term1206); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE16!=null?DOBLE16.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:259:5: TEXTO
                    {
                    TEXTO17=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term1240); 


                              e = new StringEvaluator(((TEXTO17!=null?TEXTO17.getText():null)));
                             

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:264:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term1261); 

                    pushFollow(FOLLOW_add_in_term1263);
                    add18=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1265); 


                                           e = add18;
                                          

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:268:6: nom= NOMBRE '.get(' num= add ')'
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1299); 

                    match(input,34,FOLLOW_34_in_term1301); 

                    pushFollow(FOLLOW_add_in_term1307);
                    num=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1309); 


                                    e = new GetEvaluator((nom!=null?nom.getText():null),num);     
                             

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "term"



    // $ANTLR start "unary"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:274:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws RecognitionException {
        Evaluator e = null;


        Evaluator term19 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:275:3: ( ( '+' | '-' )* term )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:277:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:280:3: ( '+' | '-' )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }
                else if ( (LA6_0==33) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:281:5: '+'
            	    {
            	    match(input,31,FOLLOW_31_in_unary1353); 

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:282:7: '-'
            	    {
            	    match(input,33,FOLLOW_33_in_unary1361); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary1382);
            term19=term();

            state._fsp--;



                   e = term19; 
                     if(!positive)
                        e = new NegationEvaluator(e);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "unary"



    // $ANTLR start "mult"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:295:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary )* ;
    public final Evaluator mult() throws RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:296:3: (op1= unary ( '*' op2= unary | '/' op2= unary )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:297:3: op1= unary ( '*' op2= unary | '/' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult1412);
            op1=unary();

            state._fsp--;



                        e = op1;
                       

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:301:3: ( '*' op2= unary | '/' op2= unary )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }
                else if ( (LA7_0==36) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:302:5: '*' op2= unary
            	    {
            	    match(input,30,FOLLOW_30_in_mult1436); 

            	    pushFollow(FOLLOW_unary_in_mult1440);
            	    op2=unary();

            	    state._fsp--;



            	                      e = new TimesEvaluator(e,op2);
            	                     

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:306:7: '/' op2= unary
            	    {
            	    match(input,36,FOLLOW_36_in_mult1468); 

            	    pushFollow(FOLLOW_unary_in_mult1472);
            	    op2=unary();

            	    state._fsp--;



            	                        e = new DivideEvaluator(e,op2);
            	                       

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "mult"



    // $ANTLR start "add"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:313:1: add returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
    public final Evaluator add() throws RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:314:3: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:315:3: op1= mult ( '+' op2= mult | '-' op2= mult )*
            {
            pushFollow(FOLLOW_mult_in_add1520);
            op1=mult();

            state._fsp--;



                       e = op1;
                      

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:319:3: ( '+' op2= mult | '-' op2= mult )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }
                else if ( (LA8_0==33) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:320:5: '+' op2= mult
            	    {
            	    match(input,31,FOLLOW_31_in_add1543); 

            	    pushFollow(FOLLOW_mult_in_add1547);
            	    op2=mult();

            	    state._fsp--;


            	      
            	                     e = new PlusEvaluator(e, op2);
            	                    

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:324:7: '-' op2= mult
            	    {
            	    match(input,33,FOLLOW_33_in_add1574); 

            	    pushFollow(FOLLOW_mult_in_add1578);
            	    op2=mult();

            	    state._fsp--;



            	                       e = new MinusEvaluator(e, op2);
            	                      

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "add"



    // $ANTLR start "relation"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:331:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:332:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:333:3: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation1627);
            ex1=add();

            state._fsp--;



                             e = ex1;
                            

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:337:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28||(LA10_0 >= 37 && LA10_0 <= 41)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:338:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:338:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt9=6;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt9=5;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt9=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:339:7: '==' ex2= add
            	            {
            	            match(input,39,FOLLOW_39_in_relation1664); 

            	            pushFollow(FOLLOW_add_in_relation1668);
            	            ex2=add();

            	            state._fsp--;



            	                                      e = new IgualIgualEvaluator(e,ex2);
            	                                     

            	            }
            	            break;
            	        case 2 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:343:9: '>' ex2= add
            	            {
            	            match(input,40,FOLLOW_40_in_relation1706); 

            	            pushFollow(FOLLOW_add_in_relation1710);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MayorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 3 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:347:9: '<' ex2= add
            	            {
            	            match(input,37,FOLLOW_37_in_relation1749); 

            	            pushFollow(FOLLOW_add_in_relation1753);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MenorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 4 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:351:9: '!=' ex2= add
            	            {
            	            match(input,28,FOLLOW_28_in_relation1792); 

            	            pushFollow(FOLLOW_add_in_relation1796);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new DiferenteEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 5 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:355:9: '<=' ex2= add
            	            {
            	            match(input,38,FOLLOW_38_in_relation1836); 

            	            pushFollow(FOLLOW_add_in_relation1840);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MenorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 6 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:359:9: '>=' ex2= add
            	            {
            	            match(input,41,FOLLOW_41_in_relation1880); 

            	            pushFollow(FOLLOW_add_in_relation1884);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MayorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "relation"



    // $ANTLR start "logico"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:367:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:368:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:369:3: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico1947);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:373:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }
                else if ( (LA11_0==45) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:374:5: '&&' rel2= relation
            	    {
            	    match(input,29,FOLLOW_29_in_logico1975); 

            	    pushFollow(FOLLOW_relation_in_logico1979);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:378:7: '||' rel2= relation
            	    {
            	    match(input,45,FOLLOW_45_in_logico2012); 

            	    pushFollow(FOLLOW_relation_in_logico2016);
            	    rel2=relation();

            	    state._fsp--;



            	                             e = new OrEvaluator(e,rel2);
            	                            

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "logico"



    // $ANTLR start "expression"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:385:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws RecognitionException {
        Evaluator e = null;


        Evaluator logico20 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:386:5: ( logico )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:386:9: logico
            {
            pushFollow(FOLLOW_logico_in_expression2071);
            logico20=logico();

            state._fsp--;


             e = logico20; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "expression"



    // $ANTLR start "llamadofuncion"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:390:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' ;
    public final Evaluator llamadofuncion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:390:36: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:391:3: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')'
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2095); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2100); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:393:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DOBLE||(LA13_0 >= NOMBRE && LA13_0 <= NUMERO)||LA13_0==PARENTESIS_I||LA13_0==TEXTO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:393:6: (ev= term ) ( ',' ev= term )*
                    {
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:393:6: (ev= term )
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:393:7: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2112);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev);  

                    }


                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:395:6: ( ',' ev= term )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==32) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:395:7: ',' ev= term
                    	    {
                    	    match(input,32,FOLLOW_32_in_llamadofuncion2127); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2132);
                    	    ev=term();

                    	    state._fsp--;


                    	    ((FuncionEvaluator) e).llenarParametro(ev);  

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2146); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "llamadofuncion"



    // $ANTLR start "ifstatements"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:406:1: ifstatements returns [Evaluator e] : ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet );
    public final Evaluator ifstatements() throws RecognitionException {
        Evaluator e = null;


        Evaluator print121 =null;

        Evaluator asignacion22 =null;

        Evaluator lectura23 =null;

        Evaluator return124 =null;

        Evaluator whilestatemet25 =null;

        Evaluator ifstatement26 =null;

        Evaluator declaracion27 =null;

        Evaluator declaracion228 =null;

        Evaluator declaracion_lista29 =null;

        Evaluator push30 =null;

        Evaluator forstatemet31 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:406:35: ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet )
            int alt14=12;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt14=1;
                }
                break;
            case NOMBRE:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==ASIGNACION) ) {
                    alt14=2;
                }
                else if ( (LA14_2==35) ) {
                    alt14=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt14=3;
                }
                break;
            case COMENTARIO:
                {
                alt14=4;
                }
                break;
            case 43:
                {
                alt14=5;
                }
                break;
            case WHILE:
                {
                alt14=6;
                }
                break;
            case IF:
                {
                alt14=7;
                }
                break;
            case 44:
                {
                int LA14_8 = input.LA(2);

                if ( (LA14_8==NOMBRE) ) {
                    int LA14_13 = input.LA(3);

                    if ( (LA14_13==ASIGNACION) ) {
                        alt14=8;
                    }
                    else if ( (LA14_13==PC) ) {
                        alt14=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 13, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 8, input);

                    throw nvae;

                }
                }
                break;
            case 42:
                {
                alt14=10;
                }
                break;
            case FOR:
                {
                alt14=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:408:3: print1
                    {
                    pushFollow(FOLLOW_print1_in_ifstatements2170);
                    print121=print1();

                    state._fsp--;


                    e = print121;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:409:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_ifstatements2178);
                    asignacion22=asignacion();

                    state._fsp--;


                    e = asignacion22;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:410:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_ifstatements2185);
                    lectura23=lectura();

                    state._fsp--;


                    e = lectura23;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:411:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_ifstatements2193);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:412:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_ifstatements2201);
                    return124=return1();

                    state._fsp--;


                    e = return124;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:413:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_ifstatements2209);
                    whilestatemet25=whilestatemet();

                    state._fsp--;


                    e = whilestatemet25;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:414:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_ifstatements2217);
                    ifstatement26=ifstatement();

                    state._fsp--;


                    e = ifstatement26;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:415:4: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_ifstatements2225);
                    declaracion27=declaracion();

                    state._fsp--;


                    e = declaracion27;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:416:4: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_ifstatements2231);
                    declaracion228=declaracion2();

                    state._fsp--;


                    e = declaracion228;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:417:4: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_ifstatements2239);
                    declaracion_lista29=declaracion_lista();

                    state._fsp--;


                    declaracion_lista29.evaluate(pila);

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:418:4: push
                    {
                    pushFollow(FOLLOW_push_in_ifstatements2245);
                    push30=push();

                    state._fsp--;


                     e = push30; 

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:419:4: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_ifstatements2251);
                    forstatemet31=forstatemet();

                    state._fsp--;


                    forstatemet31.evaluate(pila);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "ifstatements"



    // $ANTLR start "elsestataments"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:425:1: elsestataments returns [Evaluator e] : ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet );
    public final Evaluator elsestataments() throws RecognitionException {
        Evaluator e = null;


        Evaluator print132 =null;

        Evaluator asignacion33 =null;

        Evaluator lectura34 =null;

        Evaluator return135 =null;

        Evaluator whilestatemet36 =null;

        Evaluator ifstatement37 =null;

        Evaluator declaracion38 =null;

        Evaluator declaracion239 =null;

        Evaluator declaracion_lista40 =null;

        Evaluator push41 =null;

        Evaluator forstatemet42 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:425:37: ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet )
            int alt15=12;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt15=1;
                }
                break;
            case NOMBRE:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==ASIGNACION) ) {
                    alt15=2;
                }
                else if ( (LA15_2==35) ) {
                    alt15=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt15=3;
                }
                break;
            case COMENTARIO:
                {
                alt15=4;
                }
                break;
            case 43:
                {
                alt15=5;
                }
                break;
            case WHILE:
                {
                alt15=6;
                }
                break;
            case IF:
                {
                alt15=7;
                }
                break;
            case 44:
                {
                int LA15_8 = input.LA(2);

                if ( (LA15_8==NOMBRE) ) {
                    int LA15_13 = input.LA(3);

                    if ( (LA15_13==ASIGNACION) ) {
                        alt15=8;
                    }
                    else if ( (LA15_13==PC) ) {
                        alt15=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 13, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 8, input);

                    throw nvae;

                }
                }
                break;
            case 42:
                {
                alt15=10;
                }
                break;
            case FOR:
                {
                alt15=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:427:1: print1
                    {
                    pushFollow(FOLLOW_print1_in_elsestataments2277);
                    print132=print1();

                    state._fsp--;


                    e = print132;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:428:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_elsestataments2285);
                    asignacion33=asignacion();

                    state._fsp--;


                    e = asignacion33;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:429:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_elsestataments2292);
                    lectura34=lectura();

                    state._fsp--;


                    e = lectura34;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:430:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_elsestataments2300);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:431:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_elsestataments2308);
                    return135=return1();

                    state._fsp--;


                    e = return135;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:432:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_elsestataments2316);
                    whilestatemet36=whilestatemet();

                    state._fsp--;


                    e = whilestatemet36;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:433:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_elsestataments2324);
                    ifstatement37=ifstatement();

                    state._fsp--;


                    e = ifstatement37;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:434:4: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_elsestataments2332);
                    declaracion38=declaracion();

                    state._fsp--;


                    e = declaracion38;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:435:4: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_elsestataments2338);
                    declaracion239=declaracion2();

                    state._fsp--;


                    e = declaracion239;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:436:4: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_elsestataments2346);
                    declaracion_lista40=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista40; /*declaracion_lista40.evaluate(pila);*/

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:437:4: push
                    {
                    pushFollow(FOLLOW_push_in_elsestataments2352);
                    push41=push();

                    state._fsp--;


                     e = push41; 

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:438:4: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_elsestataments2358);
                    forstatemet42=forstatemet();

                    state._fsp--;


                    forstatemet42.evaluate(pila);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "elsestataments"



    // $ANTLR start "ifstatement"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:444:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* ;
    public final Evaluator ifstatement() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:444:34: ( IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:446:1: IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement2376); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2378); 

            pushFollow(FOLLOW_logico_in_ifstatement2384);
            rel=logico();

            state._fsp--;



              e = new IfEvaluator ();   
              ((IfEvaluator) e).agregarCondicion(rel);


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2390); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2392); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:452:2: (ifs= ifstatements )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMENTARIO||LA16_0==FOR||LA16_0==IF||LA16_0==NOMBRE||(LA16_0 >= PRINT && LA16_0 <= READ)||LA16_0==WHILE||(LA16_0 >= 42 && LA16_0 <= 44)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:452:3: ifs= ifstatements
            	    {
            	    pushFollow(FOLLOW_ifstatements_in_ifstatement2400);
            	    ifs=ifstatements();

            	    state._fsp--;



            	       ((IfEvaluator) e).agregarCoso(ifs);   
            	      
            	     

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2410); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:460:2: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ELSEIF) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:460:3: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D
            	    {
            	    match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement2419); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2421); 

            	    pushFollow(FOLLOW_logico_in_ifstatement2425);
            	    rel1=logico();

            	    state._fsp--;



            	     ((IfEvaluator) e).nuevoSegmento();
            	     ((IfEvaluator) e).agregarCondicion(rel1); 


            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2431); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2433); 

            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:466:2: (ifs= ifstatements )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==COMENTARIO||LA17_0==FOR||LA17_0==IF||LA17_0==NOMBRE||(LA17_0 >= PRINT && LA17_0 <= READ)||LA17_0==WHILE||(LA17_0 >= 42 && LA17_0 <= 44)) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:466:3: ifs= ifstatements
            	    	    {
            	    	    pushFollow(FOLLOW_ifstatements_in_ifstatement2440);
            	    	    ifs=ifstatements();

            	    	    state._fsp--;



            	    	       ((IfEvaluator) e).agregarCoso(ifs);   
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2450); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:476:3: ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ELSE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:476:3: ELSE LLAVE_I (elses= elsestataments )* LLAVE_D
            	    {
            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement2467); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2470); 

            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:477:9: (elses= elsestataments )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==COMENTARIO||LA19_0==FOR||LA19_0==IF||LA19_0==NOMBRE||(LA19_0 >= PRINT && LA19_0 <= READ)||LA19_0==WHILE||(LA19_0 >= 42 && LA19_0 <= 44)) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:478:5: elses= elsestataments
            	    	    {
            	    	    pushFollow(FOLLOW_elsestataments_in_ifstatement2481);
            	    	    elses=elsestataments();

            	    	    state._fsp--;


            	    	        
            	    	       ((IfEvaluator)e).agregarCosoElse(elses);
            	    	     
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2489); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "ifstatement"



    // $ANTLR start "whilestatements"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:492:1: whilestatements returns [Evaluator e] : ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet );
    public final Evaluator whilestatements() throws RecognitionException {
        Evaluator e = null;


        Evaluator print143 =null;

        Evaluator asignacion44 =null;

        Evaluator lectura45 =null;

        Evaluator return146 =null;

        Evaluator whilestatemet47 =null;

        Evaluator ifstatement48 =null;

        Evaluator declaracion49 =null;

        Evaluator declaracion250 =null;

        Evaluator declaracion_lista51 =null;

        Evaluator push52 =null;

        Evaluator forstatemet53 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:492:38: ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet )
            int alt21=12;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt21=1;
                }
                break;
            case NOMBRE:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==ASIGNACION) ) {
                    alt21=2;
                }
                else if ( (LA21_2==35) ) {
                    alt21=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt21=3;
                }
                break;
            case COMENTARIO:
                {
                alt21=4;
                }
                break;
            case 43:
                {
                alt21=5;
                }
                break;
            case WHILE:
                {
                alt21=6;
                }
                break;
            case IF:
                {
                alt21=7;
                }
                break;
            case 44:
                {
                int LA21_8 = input.LA(2);

                if ( (LA21_8==NOMBRE) ) {
                    int LA21_13 = input.LA(3);

                    if ( (LA21_13==ASIGNACION) ) {
                        alt21=8;
                    }
                    else if ( (LA21_13==PC) ) {
                        alt21=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 13, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 8, input);

                    throw nvae;

                }
                }
                break;
            case 42:
                {
                alt21=10;
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
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:495:3: print1
                    {
                    pushFollow(FOLLOW_print1_in_whilestatements2519);
                    print143=print1();

                    state._fsp--;


                    e = print143;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:496:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_whilestatements2527);
                    asignacion44=asignacion();

                    state._fsp--;


                    e = asignacion44;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:497:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_whilestatements2534);
                    lectura45=lectura();

                    state._fsp--;


                    e = lectura45;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:498:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_whilestatements2542);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:499:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_whilestatements2550);
                    return146=return1();

                    state._fsp--;


                    e = return146;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:500:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_whilestatements2558);
                    whilestatemet47=whilestatemet();

                    state._fsp--;


                    e = whilestatemet47;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:501:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_whilestatements2566);
                    ifstatement48=ifstatement();

                    state._fsp--;


                    e = ifstatement48;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:502:4: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_whilestatements2574);
                    declaracion49=declaracion();

                    state._fsp--;


                    e = declaracion49;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:503:4: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_whilestatements2582);
                    declaracion250=declaracion2();

                    state._fsp--;


                    e = declaracion250;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:504:4: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_whilestatements2588);
                    declaracion_lista51=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista51; /*declaracion_lista51.evaluate(pila);*/

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:505:4: push
                    {
                    pushFollow(FOLLOW_push_in_whilestatements2594);
                    push52=push();

                    state._fsp--;


                     e = push52; 

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:506:4: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_whilestatements2600);
                    forstatemet53=forstatemet();

                    state._fsp--;


                    forstatemet53.evaluate(pila);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "whilestatements"



    // $ANTLR start "whilestatemet"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:511:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator whilestatemet() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:511:36: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:514:1: WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet2625); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet2627); 

            pushFollow(FOLLOW_logico_in_whilestatemet2631);
            rel=logico();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)rel.evaluate(pila));  
               e = new WhileEvaluator(rel); 
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet2634); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet2636); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:520:2: (wh= whilestatements )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMENTARIO||LA22_0==FOR||LA22_0==IF||LA22_0==NOMBRE||(LA22_0 >= PRINT && LA22_0 <= READ)||LA22_0==WHILE||(LA22_0 >= 42 && LA22_0 <= 44)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:520:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_whilestatemet2644);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((WhileEvaluator) e).add(wh);   
            	         //System.out.println("coso evaluador while: "+wh);
            	     

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet2655); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "whilestatemet"



    // $ANTLR start "forstatemet"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:532:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator forstatemet() throws RecognitionException {
        Evaluator e = null;


        Evaluator decl =null;

        Evaluator logi =null;

        Evaluator aumento =null;

        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:532:34: ( FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:535:1: FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,FOR,FOLLOW_FOR_in_forstatemet2671); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet2673); 

            pushFollow(FOLLOW_declaracion_in_forstatemet2677);
            decl=declaracion();

            state._fsp--;


            pushFollow(FOLLOW_logico_in_forstatemet2681);
            logi=logico();

            state._fsp--;


            match(input,PC,FOLLOW_PC_in_forstatemet2683); 

            pushFollow(FOLLOW_add_in_forstatemet2687);
            aumento=add();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)$rel.e.evaluate(pila));  
               e = new ForEvaluator(decl, logi, aumento);  
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet2692); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet2694); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:541:2: (wh= whilestatements )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMENTARIO||LA23_0==FOR||LA23_0==IF||LA23_0==NOMBRE||(LA23_0 >= PRINT && LA23_0 <= READ)||LA23_0==WHILE||(LA23_0 >= 42 && LA23_0 <= 44)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:541:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_forstatemet2702);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((ForEvaluator) e).add(wh);   
            	         //System.out.println("coso evaluador while: "+wh);
            	     

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet2713); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "forstatemet"

    // Delegated rules


 

    public static final BitSet FOLLOW_print1_in_programa71 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_asignacion_in_programa93 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_ifstatement_in_programa109 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_lectura_in_programa124 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_comentario_in_programa143 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_whilestatemet_in_programa151 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_funcion_in_programa164 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_llamadofuncion_in_programa172 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_programa178 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_declaracion_in_programa186 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_declaracion2_in_programa201 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_declaracion_lista_in_programa215 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_push_in_programa224 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_forstatemet_in_programa246 = new BitSet(new long[]{0x0000140004C23822L});
    public static final BitSet FOLLOW_43_in_return1301 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_evaluator_in_return1307 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_return1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion348 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion354 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_funcion356 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_44_in_funcion368 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion374 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_32_in_funcion391 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_funcion393 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion399 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_funcion417 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion420 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_whilestatements_in_funcion434 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_declaracion478 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion484 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_evaluator_in_declaracion490 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_declaracion2585 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion2589 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_declaracion_lista688 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista692 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push792 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_push794 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_expression_in_push800 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push802 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_push872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion908 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion914 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_asignacion954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura991 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura995 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_lectura1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print11061 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_evaluator_in_print11063 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_print11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term1261 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_term1263 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1299 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_term1301 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_term1307 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_unary1353 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_33_in_unary1361 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_term_in_unary1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult1412 = new BitSet(new long[]{0x0000001040000002L});
    public static final BitSet FOLLOW_30_in_mult1436 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_unary_in_mult1440 = new BitSet(new long[]{0x0000001040000002L});
    public static final BitSet FOLLOW_36_in_mult1468 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_unary_in_mult1472 = new BitSet(new long[]{0x0000001040000002L});
    public static final BitSet FOLLOW_mult_in_add1520 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_add1543 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_mult_in_add1547 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_33_in_add1574 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_mult_in_add1578 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_add_in_relation1627 = new BitSet(new long[]{0x000003E010000002L});
    public static final BitSet FOLLOW_39_in_relation1664 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_relation1668 = new BitSet(new long[]{0x000003E010000002L});
    public static final BitSet FOLLOW_40_in_relation1706 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_relation1710 = new BitSet(new long[]{0x000003E010000002L});
    public static final BitSet FOLLOW_37_in_relation1749 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_relation1753 = new BitSet(new long[]{0x000003E010000002L});
    public static final BitSet FOLLOW_28_in_relation1792 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_relation1796 = new BitSet(new long[]{0x000003E010000002L});
    public static final BitSet FOLLOW_38_in_relation1836 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_relation1840 = new BitSet(new long[]{0x000003E010000002L});
    public static final BitSet FOLLOW_41_in_relation1880 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_relation1884 = new BitSet(new long[]{0x000003E010000002L});
    public static final BitSet FOLLOW_relation_in_logico1947 = new BitSet(new long[]{0x0000200020000002L});
    public static final BitSet FOLLOW_29_in_logico1975 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_relation_in_logico1979 = new BitSet(new long[]{0x0000200020000002L});
    public static final BitSet FOLLOW_45_in_logico2012 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_relation_in_logico2016 = new BitSet(new long[]{0x0000200020000002L});
    public static final BitSet FOLLOW_logico_in_expression2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2095 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2100 = new BitSet(new long[]{0x00000000011E0100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2112 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_32_in_llamadofuncion2127 = new BitSet(new long[]{0x0000000001160100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2132 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_ifstatements2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_ifstatements2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_ifstatements2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_ifstatements2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_ifstatements2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_ifstatements2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_ifstatements2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_ifstatements2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_ifstatements2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_ifstatements2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_ifstatements2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_ifstatements2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_elsestataments2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_elsestataments2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_elsestataments2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_elsestataments2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_elsestataments2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_elsestataments2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_elsestataments2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_elsestataments2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_elsestataments2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_elsestataments2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_elsestataments2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_elsestataments2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement2376 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2378 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2384 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2390 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2392 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2400 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2410 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSEIF_in_ifstatement2419 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2421 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2425 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2431 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2433 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2440 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2450 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement2467 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2470 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_elsestataments_in_ifstatement2481 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2489 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_print1_in_whilestatements2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_whilestatements2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_whilestatements2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_whilestatements2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_whilestatements2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_whilestatements2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_whilestatements2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_whilestatements2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_whilestatements2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_whilestatements2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_whilestatements2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_whilestatements2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet2625 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet2627 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_logico_in_whilestatemet2631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet2634 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet2636 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_whilestatements_in_whilestatemet2644 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatemet2671 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet2673 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_declaracion_in_forstatemet2677 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_logico_in_forstatemet2681 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_forstatemet2683 = new BitSet(new long[]{0x0000000281160100L});
    public static final BitSet FOLLOW_add_in_forstatemet2687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet2692 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_forstatemet2694 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_whilestatements_in_forstatemet2702 = new BitSet(new long[]{0x00001C0004C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_forstatemet2713 = new BitSet(new long[]{0x0000000000000002L});

}