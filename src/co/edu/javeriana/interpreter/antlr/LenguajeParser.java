// $ANTLR 3.4 /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g 2014-07-20 11:28:56

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "COMENTARIO", "COMILLASD", "COMILLASS", "DOBLE", "ELSE", "ELSEIF", "FOR", "FUNCTION", "IF", "LLAVE_D", "LLAVE_I", "NEWLINE", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", "PC", "PRINT", "PRINTLN", "READ", "TEXTO", "TOKEN", "WHILE", "WS", "'!='", "'&&'", "'*'", "'+'", "','", "'-'", "'.get('", "'.push('", "'.set('", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'['", "']'", "'list'", "'return'", "'var'", "'||'"
    };

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:37:1: programa returns [StringBuilder output] : ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+ ;
    public final StringBuilder programa() throws RecognitionException {
        StringBuilder output = null;


        Evaluator print11 =null;

        Evaluator println2 =null;

        Evaluator asignacion3 =null;

        Evaluator ifstatement4 =null;

        Evaluator lectura5 =null;

        Evaluator whilestatemet6 =null;

        Evaluator llamadofuncion7 =null;

        Evaluator declaracion8 =null;

        Evaluator declaracion29 =null;

        Evaluator declaracion_lista10 =null;

        Evaluator push11 =null;

        Evaluator forstatemet12 =null;

        Evaluator asignacion_lista13 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:38:3: ( ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:40:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+
            {

               pila.add(new Context1()); 
               output = new StringBuilder();
              

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:44:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+
            int cnt1=0;
            loop1:
            do {
                int alt1=16;
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
                    case 36:
                        {
                        alt1=13;
                        }
                        break;
                    case PARENTESIS_I:
                        {
                        alt1=9;
                        }
                        break;
                    case 37:
                    case 44:
                        {
                        alt1=15;
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
                case 48:
                    {
                    int LA1_10 = input.LA(2);

                    if ( (LA1_10==NOMBRE) ) {
                        int LA1_17 = input.LA(3);

                        if ( (LA1_17==ASIGNACION) ) {
                            alt1=10;
                        }
                        else if ( (LA1_17==PC) ) {
                            alt1=11;
                        }


                    }


                    }
                    break;
                case 46:
                    {
                    alt1=12;
                    }
                    break;
                case FOR:
                    {
                    alt1=14;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:45:7: print1
            	    {
            	    pushFollow(FOLLOW_print1_in_programa73);
            	    print11=print1();

            	    state._fsp--;


            	    output.append((String)print11.evaluate(pila));

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:46:7: println
            	    {
            	    pushFollow(FOLLOW_println_in_programa93);
            	    println2=println();

            	    state._fsp--;


            	    output.append((String)println2.evaluate(pila));

            	    }
            	    break;
            	case 3 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:47:7: asignacion
            	    {
            	    pushFollow(FOLLOW_asignacion_in_programa112);
            	    asignacion3=asignacion();

            	    state._fsp--;


            	    asignacion3.evaluate(pila);

            	    }
            	    break;
            	case 4 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:48:7: ifstatement
            	    {
            	    pushFollow(FOLLOW_ifstatement_in_programa128);
            	    ifstatement4=ifstatement();

            	    state._fsp--;


            	    output.append((String)ifstatement4.evaluate(pila));

            	    }
            	    break;
            	case 5 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:49:7: lectura
            	    {
            	    pushFollow(FOLLOW_lectura_in_programa143);
            	    lectura5=lectura();

            	    state._fsp--;


            	    lectura5.evaluate(pila);

            	    }
            	    break;
            	case 6 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:50:7: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_programa162);
            	    comentario();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:51:7: whilestatemet
            	    {
            	    pushFollow(FOLLOW_whilestatemet_in_programa170);
            	    whilestatemet6=whilestatemet();

            	    state._fsp--;


            	    output.append((String)whilestatemet6.evaluate(pila));

            	    }
            	    break;
            	case 8 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:52:7: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_programa183);
            	    funcion();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:53:7: llamadofuncion
            	    {
            	    pushFollow(FOLLOW_llamadofuncion_in_programa191);
            	    llamadofuncion7=llamadofuncion();

            	    state._fsp--;


            	    output.append((String)llamadofuncion7.evaluate(pila));

            	    }
            	    break;
            	case 10 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:54:7: declaracion
            	    {
            	    pushFollow(FOLLOW_declaracion_in_programa203);
            	    declaracion8=declaracion();

            	    state._fsp--;


            	    declaracion8.evaluate(pila);

            	    }
            	    break;
            	case 11 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:55:7: declaracion2
            	    {
            	    pushFollow(FOLLOW_declaracion2_in_programa218);
            	    declaracion29=declaracion2();

            	    state._fsp--;


            	    declaracion29.evaluate(pila);

            	    }
            	    break;
            	case 12 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:56:7: declaracion_lista
            	    {
            	    pushFollow(FOLLOW_declaracion_lista_in_programa232);
            	    declaracion_lista10=declaracion_lista();

            	    state._fsp--;


            	    declaracion_lista10.evaluate(pila);

            	    }
            	    break;
            	case 13 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:57:7: push
            	    {
            	    pushFollow(FOLLOW_push_in_programa241);
            	    push11=push();

            	    state._fsp--;


            	    push11.evaluate(pila);

            	    }
            	    break;
            	case 14 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:58:7: forstatemet
            	    {
            	    pushFollow(FOLLOW_forstatemet_in_programa263);
            	    forstatemet12=forstatemet();

            	    state._fsp--;


            	    output.append((String)forstatemet12.evaluate(pila));

            	    }
            	    break;
            	case 15 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:59:7: asignacion_lista
            	    {
            	    pushFollow(FOLLOW_asignacion_lista_in_programa278);
            	    asignacion_lista13=asignacion_lista();

            	    state._fsp--;


            	    asignacion_lista13.evaluate(pila);

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:67:3: return1 returns [Evaluator e] : 'return' te= evaluator PC ;
    public final Evaluator return1() throws RecognitionException {
        Evaluator e = null;


        Evaluator te =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:68:3: ( 'return' te= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:69:5: 'return' te= evaluator PC
            {
            match(input,47,FOLLOW_47_in_return1322); 

            pushFollow(FOLLOW_evaluator_in_return1328);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1335); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:77:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' ;
    public final Evaluator funcion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom1=null;
        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:78:3: ( FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:79:3: FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}'
            {
            e = new FuncionEvaluator();

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion369); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion375); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_funcion377); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:82:2: ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==48) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:82:3: ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )*
                    {
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:82:3: ( 'var' nom1= NOMBRE )
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:83:4: 'var' nom1= NOMBRE
                    {
                    match(input,48,FOLLOW_48_in_funcion389); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion395); 


                    	     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	  

                    }


                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:88:2: ( ',' 'var' nom1= NOMBRE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==33) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:89:5: ',' 'var' nom1= NOMBRE
                    	    {
                    	    match(input,33,FOLLOW_33_in_funcion412); 

                    	    match(input,48,FOLLOW_48_in_funcion414); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion420); 


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


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_funcion438); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion441); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:98:4: (wh= whilestatements )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMENTARIO||LA4_0==FOR||LA4_0==IF||LA4_0==NOMBRE||(LA4_0 >= PRINT && LA4_0 <= READ)||LA4_0==WHILE||(LA4_0 >= 46 && LA4_0 <= 48)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:98:5: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_funcion455);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion467); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:112:1: declaracion returns [Evaluator e] : 'var' nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator declaracion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:113:3: ( 'var' nom= NOMBRE ASIGNACION ev= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:114:3: 'var' nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            match(input,48,FOLLOW_48_in_declaracion499); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion503); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion505); 

            pushFollow(FOLLOW_evaluator_in_declaracion511);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                              		  //System.out.println("intento salvar");
                                              		  e = new DeclaracionEvaluator((nom!=null?nom.getText():null),ev);   
                                          			
                                              			
                                              	}
                                             

            match(input,PC,FOLLOW_PC_in_declaracion582); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:127:3: declaracion2 returns [Evaluator e] : 'var' nom= NOMBRE PC ;
    public final Evaluator declaracion2() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:128:3: ( 'var' nom= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:129:3: 'var' nom= NOMBRE PC
            {
            match(input,48,FOLLOW_48_in_declaracion2606); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion2610); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new IntEvaluator(0));   
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion2683); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:144:3: declaracion_lista returns [Evaluator e] : 'list' nom= NOMBRE PC ;
    public final Evaluator declaracion_lista() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:145:3: ( 'list' nom= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:147:3: 'list' nom= NOMBRE PC
            {
            match(input,46,FOLLOW_46_in_declaracion_lista709); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista713); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new ListEvaluator());   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion_lista786); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:159:3: push returns [Evaluator e] : nom= NOMBRE '.push(' exp= expression ')' PC ;
    public final Evaluator push() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:160:3: (nom= NOMBRE '.push(' exp= expression ')' PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:161:3: nom= NOMBRE '.push(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push813); 

            match(input,36,FOLLOW_36_in_push815); 

            pushFollow(FOLLOW_expression_in_push821);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push823); 


                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar");
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push893); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:174:3: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:175:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:176:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion927); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion929); 

            pushFollow(FOLLOW_evaluator_in_asignacion935);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);    
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion975); 

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



    // $ANTLR start "asignacion_lista"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:190:3: asignacion_lista returns [Evaluator e] : nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC ;
    public final Evaluator asignacion_lista() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token num=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:191:3: (nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:192:4: nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion_lista1002); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:193:4: ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:193:7: '[' num= NUMERO ']' ASIGNACION ev= evaluator
                    {
                    match(input,44,FOLLOW_44_in_asignacion_lista1011); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1015); 

                    match(input,45,FOLLOW_45_in_asignacion_lista1017); 

                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion_lista1019); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1025);
                    ev=evaluator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:194:7: '.set(' num= NUMERO ',' ev= evaluator ')'
                    {
                    match(input,37,FOLLOW_37_in_asignacion_lista1033); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1037); 

                    match(input,33,FOLLOW_33_in_asignacion_lista1039); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1045);
                    ev=evaluator();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_asignacion_lista1047); 

                    }
                    break;

            }



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionListaEvaluator((nom!=null?nom.getText():null),ev, (num!=null?num.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion_lista1093); 

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
    // $ANTLR end "asignacion_lista"



    // $ANTLR start "comentario"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:208:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:209:3: ( COMENTARIO )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:210:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario1111); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:213:1: lectura returns [Evaluator e] : r= READ n= NOMBRE PC ;
    public final Evaluator lectura() throws RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:214:3: (r= READ n= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:215:3: r= READ n= NOMBRE PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura1132); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura1136); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            match(input,PC,FOLLOW_PC_in_lectura1183); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:227:1: print1 returns [Evaluator e] : PRINT (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator print1() throws RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:228:3: ( PRINT (exp= expression ) ( ',' exp= expression )* PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:229:3: PRINT (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintEvaluator(); 

            match(input,PRINT,FOLLOW_PRINT_in_print11208); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:231:3: (exp= expression )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:231:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_print11219);
            exp=expression();

            state._fsp--;


             ((PrintEvaluator)e).addEvaluator(exp); 

            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:233:3: ( ',' exp= expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:233:5: ',' exp= expression
            	    {
            	    match(input,33,FOLLOW_33_in_print11231); 

            	    pushFollow(FOLLOW_expression_in_print11241);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_print11252); 

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



    // $ANTLR start "println"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:239:1: println returns [Evaluator e] : PRINTLN (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator println() throws RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:240:3: ( PRINTLN (exp= expression ) ( ',' exp= expression )* PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:241:3: PRINTLN (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintlnEvaluator(); 

            match(input,PRINTLN,FOLLOW_PRINTLN_in_println1277); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:243:3: (exp= expression )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:243:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_println1287);
            exp=expression();

            state._fsp--;


             ((PrintlnEvaluator)e).addEvaluator(exp); 

            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:245:3: ( ',' exp= expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:245:5: ',' exp= expression
            	    {
            	    match(input,33,FOLLOW_33_in_println1299); 

            	    pushFollow(FOLLOW_expression_in_println1309);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintlnEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_println1320); 

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
    // $ANTLR end "println"



    // $ANTLR start "evaluator"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:251:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws RecognitionException {
        Evaluator e = null;


        Evaluator logico14 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:252:3: ( logico )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:253:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator1341);
            logico14=logico();

            state._fsp--;



                     e = logico14;
                    

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:259:1: term returns [Evaluator e] : (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) );
    public final Evaluator term() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token NOMBRE15=null;
        Token NUMERO16=null;
        Token DOBLE17=null;
        Token TEXTO18=null;
        Evaluator lla =null;

        Evaluator num =null;

        Evaluator add19 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:260:3: (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case PARENTESIS_I:
                    {
                    alt9=1;
                    }
                    break;
                case PARENTESIS_D:
                case PC:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 45:
                case 49:
                    {
                    alt9=2;
                    }
                    break;
                case 35:
                case 44:
                    {
                    alt9=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }

                }
                break;
            case NUMERO:
                {
                alt9=3;
                }
                break;
            case DOBLE:
                {
                alt9=4;
                }
                break;
            case TEXTO:
                {
                alt9=5;
                }
                break;
            case PARENTESIS_I:
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
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:262:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term1384);
                    lla=llamadofuncion();

                    state._fsp--;



                             //System.out.println("entiendo que es un llamado"); 
                              //e = lla;
                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:271:5: NOMBRE
                    {
                    NOMBRE15=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1400); 

                      
                           // System.out.println("entiendo que es un llamado");
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE15!=null?NOMBRE15.getText():null)));//((pila.peek().get((NOMBRE15!=null?NOMBRE15.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:278:5: NUMERO
                    {
                    NUMERO16=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term1418); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO16!=null?NUMERO16.getText():null)));
                              

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:282:5: DOBLE
                    {
                    DOBLE17=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term1437); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE17!=null?DOBLE17.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:287:5: TEXTO
                    {
                    TEXTO18=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term1471); 


                              e = new StringEvaluator(((TEXTO18!=null?TEXTO18.getText():null)));
                             

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:292:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term1492); 

                    pushFollow(FOLLOW_add_in_term1494);
                    add19=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1496); 


                                           e = add19;
                                          

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:296:5: nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' )
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1529); 

                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:297:5: ( '.get(' num= add ')' | '[' num= add ']' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==35) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==44) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }
                    switch (alt8) {
                        case 1 :
                            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:297:7: '.get(' num= add ')'
                            {
                            match(input,35,FOLLOW_35_in_term1538); 

                            pushFollow(FOLLOW_add_in_term1544);
                            num=add();

                            state._fsp--;


                            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1546); 

                            }
                            break;
                        case 2 :
                            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:298:7: '[' num= add ']'
                            {
                            match(input,44,FOLLOW_44_in_term1554); 

                            pushFollow(FOLLOW_add_in_term1564);
                            num=add();

                            state._fsp--;


                            match(input,45,FOLLOW_45_in_term1566); 

                            }
                            break;

                    }



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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:305:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws RecognitionException {
        Evaluator e = null;


        Evaluator term20 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:306:3: ( ( '+' | '-' )* term )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:308:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:311:3: ( '+' | '-' )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }
                else if ( (LA10_0==34) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:312:7: '+'
            	    {
            	    match(input,32,FOLLOW_32_in_unary1617); 

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:313:7: '-'
            	    {
            	    match(input,34,FOLLOW_34_in_unary1625); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary1646);
            term20=term();

            state._fsp--;



                   e = term20; 
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:326:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary )* ;
    public final Evaluator mult() throws RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:327:3: (op1= unary ( '*' op2= unary | '/' op2= unary )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:328:3: op1= unary ( '*' op2= unary | '/' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult1676);
            op1=unary();

            state._fsp--;



                        e = op1;
                       

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:332:3: ( '*' op2= unary | '/' op2= unary )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }
                else if ( (LA11_0==38) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:333:5: '*' op2= unary
            	    {
            	    match(input,31,FOLLOW_31_in_mult1700); 

            	    pushFollow(FOLLOW_unary_in_mult1704);
            	    op2=unary();

            	    state._fsp--;



            	                      e = new TimesEvaluator(e,op2);
            	                     

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:337:7: '/' op2= unary
            	    {
            	    match(input,38,FOLLOW_38_in_mult1732); 

            	    pushFollow(FOLLOW_unary_in_mult1736);
            	    op2=unary();

            	    state._fsp--;



            	                        e = new DivideEvaluator(e,op2);
            	                       

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
    // $ANTLR end "mult"



    // $ANTLR start "add"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:344:1: add returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
    public final Evaluator add() throws RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:345:3: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:346:3: op1= mult ( '+' op2= mult | '-' op2= mult )*
            {
            pushFollow(FOLLOW_mult_in_add1784);
            op1=mult();

            state._fsp--;



                       e = op1;
                      

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:350:3: ( '+' op2= mult | '-' op2= mult )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }
                else if ( (LA12_0==34) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:351:5: '+' op2= mult
            	    {
            	    match(input,32,FOLLOW_32_in_add1807); 

            	    pushFollow(FOLLOW_mult_in_add1811);
            	    op2=mult();

            	    state._fsp--;


            	      
            	                     e = new PlusEvaluator(e, op2);
            	                    

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:355:7: '-' op2= mult
            	    {
            	    match(input,34,FOLLOW_34_in_add1838); 

            	    pushFollow(FOLLOW_mult_in_add1842);
            	    op2=mult();

            	    state._fsp--;



            	                       e = new MinusEvaluator(e, op2);
            	                      

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:362:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:363:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:364:3: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation1891);
            ex1=add();

            state._fsp--;



                             e = ex1;
                            

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:368:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29||(LA14_0 >= 39 && LA14_0 <= 43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:369:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:369:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt13=6;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt13=5;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt13=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:370:7: '==' ex2= add
            	            {
            	            match(input,41,FOLLOW_41_in_relation1928); 

            	            pushFollow(FOLLOW_add_in_relation1932);
            	            ex2=add();

            	            state._fsp--;



            	                                      e = new IgualIgualEvaluator(e,ex2);
            	                                     

            	            }
            	            break;
            	        case 2 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:374:9: '>' ex2= add
            	            {
            	            match(input,42,FOLLOW_42_in_relation1970); 

            	            pushFollow(FOLLOW_add_in_relation1974);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MayorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 3 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:378:9: '<' ex2= add
            	            {
            	            match(input,39,FOLLOW_39_in_relation2013); 

            	            pushFollow(FOLLOW_add_in_relation2017);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MenorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 4 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:382:9: '!=' ex2= add
            	            {
            	            match(input,29,FOLLOW_29_in_relation2056); 

            	            pushFollow(FOLLOW_add_in_relation2060);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new DiferenteEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 5 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:386:9: '<=' ex2= add
            	            {
            	            match(input,40,FOLLOW_40_in_relation2100); 

            	            pushFollow(FOLLOW_add_in_relation2104);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MenorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 6 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:390:9: '>=' ex2= add
            	            {
            	            match(input,43,FOLLOW_43_in_relation2144); 

            	            pushFollow(FOLLOW_add_in_relation2148);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MayorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:398:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:399:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:400:3: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico2211);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:404:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }
                else if ( (LA15_0==49) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:405:5: '&&' rel2= relation
            	    {
            	    match(input,30,FOLLOW_30_in_logico2239); 

            	    pushFollow(FOLLOW_relation_in_logico2243);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:409:7: '||' rel2= relation
            	    {
            	    match(input,49,FOLLOW_49_in_logico2276); 

            	    pushFollow(FOLLOW_relation_in_logico2280);
            	    rel2=relation();

            	    state._fsp--;



            	                             e = new OrEvaluator(e,rel2);
            	                            

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:416:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws RecognitionException {
        Evaluator e = null;


        Evaluator logico21 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:417:5: ( logico )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:417:9: logico
            {
            pushFollow(FOLLOW_logico_in_expression2335);
            logico21=logico();

            state._fsp--;


             e = logico21; 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:421:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC ;
    public final Evaluator llamadofuncion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:422:4: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:423:9: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2369); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2374); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:425:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DOBLE||(LA17_0 >= NOMBRE && LA17_0 <= NUMERO)||LA17_0==PARENTESIS_I||LA17_0==TEXTO) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:425:9: (ev= term ) ( ',' ev= term )*
                    {
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:425:9: (ev= term )
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:425:10: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2389);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev); 

                    }


                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:427:4: ( ',' ev= term )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==33) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:427:5: ',' ev= term
                    	    {
                    	    match(input,33,FOLLOW_33_in_llamadofuncion2401); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2408);
                    	    ev=term();

                    	    state._fsp--;


                    	    ((FuncionEvaluator) e).llenarParametro(ev); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2421); 

            match(input,PC,FOLLOW_PC_in_llamadofuncion2432); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:437:1: ifstatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista );
    public final Evaluator ifstatements() throws RecognitionException {
        Evaluator e = null;


        Evaluator print122 =null;

        Evaluator println23 =null;

        Evaluator asignacion24 =null;

        Evaluator lectura25 =null;

        Evaluator return126 =null;

        Evaluator whilestatemet27 =null;

        Evaluator ifstatement28 =null;

        Evaluator declaracion29 =null;

        Evaluator declaracion230 =null;

        Evaluator declaracion_lista31 =null;

        Evaluator push32 =null;

        Evaluator forstatemet33 =null;

        Evaluator asignacion_lista34 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:437:35: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )
            int alt18=14;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt18=1;
                }
                break;
            case PRINTLN:
                {
                alt18=2;
                }
                break;
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case ASIGNACION:
                    {
                    alt18=3;
                    }
                    break;
                case 36:
                    {
                    alt18=12;
                    }
                    break;
                case 37:
                case 44:
                    {
                    alt18=14;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;

                }

                }
                break;
            case READ:
                {
                alt18=4;
                }
                break;
            case COMENTARIO:
                {
                alt18=5;
                }
                break;
            case 47:
                {
                alt18=6;
                }
                break;
            case WHILE:
                {
                alt18=7;
                }
                break;
            case IF:
                {
                alt18=8;
                }
                break;
            case 48:
                {
                int LA18_9 = input.LA(2);

                if ( (LA18_9==NOMBRE) ) {
                    int LA18_15 = input.LA(3);

                    if ( (LA18_15==ASIGNACION) ) {
                        alt18=9;
                    }
                    else if ( (LA18_15==PC) ) {
                        alt18=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 15, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 9, input);

                    throw nvae;

                }
                }
                break;
            case 46:
                {
                alt18=11;
                }
                break;
            case FOR:
                {
                alt18=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:439:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_ifstatements2459);
                    print122=print1();

                    state._fsp--;


                    e = print122;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:440:5: println
                    {
                    pushFollow(FOLLOW_println_in_ifstatements2467);
                    println23=println();

                    state._fsp--;


                    e = println23;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:441:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_ifstatements2478);
                    asignacion24=asignacion();

                    state._fsp--;


                    e = asignacion24;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:442:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_ifstatements2485);
                    lectura25=lectura();

                    state._fsp--;


                    e = lectura25;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:443:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_ifstatements2493);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:444:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_ifstatements2501);
                    return126=return1();

                    state._fsp--;


                    e = return126;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:445:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_ifstatements2509);
                    whilestatemet27=whilestatemet();

                    state._fsp--;


                    e = whilestatemet27;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:446:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_ifstatements2517);
                    ifstatement28=ifstatement();

                    state._fsp--;


                    e = ifstatement28;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:447:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_ifstatements2526);
                    declaracion29=declaracion();

                    state._fsp--;


                    e = declaracion29;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:448:5: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_ifstatements2533);
                    declaracion230=declaracion2();

                    state._fsp--;


                    e = declaracion230;

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:449:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_ifstatements2542);
                    declaracion_lista31=declaracion_lista();

                    state._fsp--;


                    declaracion_lista31.evaluate(pila);

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:450:5: push
                    {
                    pushFollow(FOLLOW_push_in_ifstatements2549);
                    push32=push();

                    state._fsp--;


                     e = push32; 

                    }
                    break;
                case 13 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:451:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_ifstatements2556);
                    forstatemet33=forstatemet();

                    state._fsp--;


                    forstatemet33.evaluate(pila);

                    }
                    break;
                case 14 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:452:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_ifstatements2563);
                    asignacion_lista34=asignacion_lista();

                    state._fsp--;


                    asignacion_lista34.evaluate(pila);

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:457:1: elsestataments returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista );
    public final Evaluator elsestataments() throws RecognitionException {
        Evaluator e = null;


        Evaluator print135 =null;

        Evaluator println36 =null;

        Evaluator asignacion37 =null;

        Evaluator lectura38 =null;

        Evaluator return139 =null;

        Evaluator whilestatemet40 =null;

        Evaluator ifstatement41 =null;

        Evaluator declaracion42 =null;

        Evaluator declaracion243 =null;

        Evaluator declaracion_lista44 =null;

        Evaluator push45 =null;

        Evaluator forstatemet46 =null;

        Evaluator asignacion_lista47 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:457:37: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )
            int alt19=14;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt19=1;
                }
                break;
            case PRINTLN:
                {
                alt19=2;
                }
                break;
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case ASIGNACION:
                    {
                    alt19=3;
                    }
                    break;
                case 36:
                    {
                    alt19=12;
                    }
                    break;
                case 37:
                case 44:
                    {
                    alt19=14;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;

                }

                }
                break;
            case READ:
                {
                alt19=4;
                }
                break;
            case COMENTARIO:
                {
                alt19=5;
                }
                break;
            case 47:
                {
                alt19=6;
                }
                break;
            case WHILE:
                {
                alt19=7;
                }
                break;
            case IF:
                {
                alt19=8;
                }
                break;
            case 48:
                {
                int LA19_9 = input.LA(2);

                if ( (LA19_9==NOMBRE) ) {
                    int LA19_15 = input.LA(3);

                    if ( (LA19_15==ASIGNACION) ) {
                        alt19=9;
                    }
                    else if ( (LA19_15==PC) ) {
                        alt19=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 15, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 9, input);

                    throw nvae;

                }
                }
                break;
            case 46:
                {
                alt19=11;
                }
                break;
            case FOR:
                {
                alt19=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:459:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_elsestataments2592);
                    print135=print1();

                    state._fsp--;


                    e = print135;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:460:5: println
                    {
                    pushFollow(FOLLOW_println_in_elsestataments2600);
                    println36=println();

                    state._fsp--;


                    e = println36;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:461:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_elsestataments2609);
                    asignacion37=asignacion();

                    state._fsp--;


                    e = asignacion37;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:462:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_elsestataments2616);
                    lectura38=lectura();

                    state._fsp--;


                    e = lectura38;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:463:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_elsestataments2624);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:464:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_elsestataments2632);
                    return139=return1();

                    state._fsp--;


                    e = return139;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:465:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_elsestataments2640);
                    whilestatemet40=whilestatemet();

                    state._fsp--;


                    e = whilestatemet40;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:466:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_elsestataments2648);
                    ifstatement41=ifstatement();

                    state._fsp--;


                    e = ifstatement41;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:467:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_elsestataments2657);
                    declaracion42=declaracion();

                    state._fsp--;


                    e = declaracion42;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:468:5: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_elsestataments2664);
                    declaracion243=declaracion2();

                    state._fsp--;


                    e = declaracion243;

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:469:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_elsestataments2673);
                    declaracion_lista44=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista44; /*declaracion_lista44.evaluate(pila);*/

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:470:5: push
                    {
                    pushFollow(FOLLOW_push_in_elsestataments2680);
                    push45=push();

                    state._fsp--;


                     e = push45; 

                    }
                    break;
                case 13 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:471:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_elsestataments2687);
                    forstatemet46=forstatemet();

                    state._fsp--;


                    forstatemet46.evaluate(pila);

                    }
                    break;
                case 14 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:472:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_elsestataments2694);
                    asignacion_lista47=asignacion_lista();

                    state._fsp--;


                    asignacion_lista47.evaluate(pila);

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:478:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* ;
    public final Evaluator ifstatement() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:478:34: ( IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:480:1: IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement2713); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2715); 

            pushFollow(FOLLOW_logico_in_ifstatement2721);
            rel=logico();

            state._fsp--;



              e = new IfEvaluator ();   
              ((IfEvaluator) e).agregarCondicion(rel);


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2727); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2729); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:486:2: (ifs= ifstatements )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMENTARIO||LA20_0==FOR||LA20_0==IF||LA20_0==NOMBRE||(LA20_0 >= PRINT && LA20_0 <= READ)||LA20_0==WHILE||(LA20_0 >= 46 && LA20_0 <= 48)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:486:3: ifs= ifstatements
            	    {
            	    pushFollow(FOLLOW_ifstatements_in_ifstatement2737);
            	    ifs=ifstatements();

            	    state._fsp--;



            	       ((IfEvaluator) e).agregarCoso(ifs);   
            	      
            	     

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2747); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:494:2: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELSEIF) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:494:3: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D
            	    {
            	    match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement2756); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2758); 

            	    pushFollow(FOLLOW_logico_in_ifstatement2762);
            	    rel1=logico();

            	    state._fsp--;



            	     ((IfEvaluator) e).nuevoSegmento();
            	     ((IfEvaluator) e).agregarCondicion(rel1); 


            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2768); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2770); 

            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:500:2: (ifs= ifstatements )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==COMENTARIO||LA21_0==FOR||LA21_0==IF||LA21_0==NOMBRE||(LA21_0 >= PRINT && LA21_0 <= READ)||LA21_0==WHILE||(LA21_0 >= 46 && LA21_0 <= 48)) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:500:3: ifs= ifstatements
            	    	    {
            	    	    pushFollow(FOLLOW_ifstatements_in_ifstatement2777);
            	    	    ifs=ifstatements();

            	    	    state._fsp--;



            	    	       ((IfEvaluator) e).agregarCoso(ifs);   
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2787); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:510:3: ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ELSE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:510:3: ELSE LLAVE_I (elses= elsestataments )* LLAVE_D
            	    {
            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement2804); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2807); 

            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:511:9: (elses= elsestataments )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==COMENTARIO||LA23_0==FOR||LA23_0==IF||LA23_0==NOMBRE||(LA23_0 >= PRINT && LA23_0 <= READ)||LA23_0==WHILE||(LA23_0 >= 46 && LA23_0 <= 48)) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:512:5: elses= elsestataments
            	    	    {
            	    	    pushFollow(FOLLOW_elsestataments_in_ifstatement2818);
            	    	    elses=elsestataments();

            	    	    state._fsp--;


            	    	        
            	    	       ((IfEvaluator)e).agregarCosoElse(elses);
            	    	     
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2826); 

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:526:1: whilestatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet );
    public final Evaluator whilestatements() throws RecognitionException {
        Evaluator e = null;


        Evaluator print148 =null;

        Evaluator println49 =null;

        Evaluator asignacion50 =null;

        Evaluator lectura51 =null;

        Evaluator return152 =null;

        Evaluator whilestatemet53 =null;

        Evaluator ifstatement54 =null;

        Evaluator declaracion55 =null;

        Evaluator declaracion256 =null;

        Evaluator declaracion_lista57 =null;

        Evaluator push58 =null;

        Evaluator forstatemet59 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:526:38: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet )
            int alt25=13;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt25=1;
                }
                break;
            case PRINTLN:
                {
                alt25=2;
                }
                break;
            case NOMBRE:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==ASIGNACION) ) {
                    alt25=3;
                }
                else if ( (LA25_3==36) ) {
                    alt25=12;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt25=4;
                }
                break;
            case COMENTARIO:
                {
                alt25=5;
                }
                break;
            case 47:
                {
                alt25=6;
                }
                break;
            case WHILE:
                {
                alt25=7;
                }
                break;
            case IF:
                {
                alt25=8;
                }
                break;
            case 48:
                {
                int LA25_9 = input.LA(2);

                if ( (LA25_9==NOMBRE) ) {
                    int LA25_14 = input.LA(3);

                    if ( (LA25_14==ASIGNACION) ) {
                        alt25=9;
                    }
                    else if ( (LA25_14==PC) ) {
                        alt25=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 14, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 9, input);

                    throw nvae;

                }
                }
                break;
            case 46:
                {
                alt25=11;
                }
                break;
            case FOR:
                {
                alt25=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:529:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_whilestatements2858);
                    print148=print1();

                    state._fsp--;


                    e = print148;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:530:5: println
                    {
                    pushFollow(FOLLOW_println_in_whilestatements2866);
                    println49=println();

                    state._fsp--;


                    e = println49;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:531:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_whilestatements2875);
                    asignacion50=asignacion();

                    state._fsp--;


                    e = asignacion50;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:532:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_whilestatements2882);
                    lectura51=lectura();

                    state._fsp--;


                    e = lectura51;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:533:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_whilestatements2890);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:534:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_whilestatements2898);
                    return152=return1();

                    state._fsp--;


                    e = return152;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:535:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_whilestatements2906);
                    whilestatemet53=whilestatemet();

                    state._fsp--;


                    e = whilestatemet53;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:536:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_whilestatements2914);
                    ifstatement54=ifstatement();

                    state._fsp--;


                    e = ifstatement54;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:537:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_whilestatements2923);
                    declaracion55=declaracion();

                    state._fsp--;


                    e = declaracion55;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:538:5: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_whilestatements2932);
                    declaracion256=declaracion2();

                    state._fsp--;


                    e = declaracion256;

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:539:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_whilestatements2939);
                    declaracion_lista57=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista57; /*declaracion_lista57.evaluate(pila);*/

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:540:5: push
                    {
                    pushFollow(FOLLOW_push_in_whilestatements2946);
                    push58=push();

                    state._fsp--;


                     e = push58; 

                    }
                    break;
                case 13 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:541:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_whilestatements2953);
                    forstatemet59=forstatemet();

                    state._fsp--;


                    forstatemet59.evaluate(pila);

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:546:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator whilestatemet() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:546:36: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:549:1: WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet2978); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet2980); 

            pushFollow(FOLLOW_logico_in_whilestatemet2984);
            rel=logico();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)rel.evaluate(pila));  
               e = new WhileEvaluator(rel); 
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet2987); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet2989); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:555:2: (wh= whilestatements )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMENTARIO||LA26_0==FOR||LA26_0==IF||LA26_0==NOMBRE||(LA26_0 >= PRINT && LA26_0 <= READ)||LA26_0==WHILE||(LA26_0 >= 46 && LA26_0 <= 48)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:555:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_whilestatemet2997);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((WhileEvaluator) e).add(wh);   
            	         //System.out.println("coso evaluador while: "+wh);
            	     

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet3008); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:567:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator forstatemet() throws RecognitionException {
        Evaluator e = null;


        Evaluator decl =null;

        Evaluator logi =null;

        Evaluator aumento =null;

        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:567:34: ( FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:570:1: FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,FOR,FOLLOW_FOR_in_forstatemet3024); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet3026); 

            pushFollow(FOLLOW_declaracion_in_forstatemet3030);
            decl=declaracion();

            state._fsp--;


            pushFollow(FOLLOW_logico_in_forstatemet3034);
            logi=logico();

            state._fsp--;


            match(input,PC,FOLLOW_PC_in_forstatemet3036); 

            pushFollow(FOLLOW_add_in_forstatemet3040);
            aumento=add();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)$rel.e.evaluate(pila));  
               e = new ForEvaluator(decl, logi, aumento);  
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet3045); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet3047); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:576:2: (wh= whilestatements )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMENTARIO||LA27_0==FOR||LA27_0==IF||LA27_0==NOMBRE||(LA27_0 >= PRINT && LA27_0 <= READ)||LA27_0==WHILE||(LA27_0 >= 46 && LA27_0 <= 48)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:576:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_forstatemet3055);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((ForEvaluator) e).add(wh);   
            	         //System.out.println("coso evaluador while: "+wh);
            	     

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet3066); 

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


 

    public static final BitSet FOLLOW_print1_in_programa73 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_println_in_programa93 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_asignacion_in_programa112 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_ifstatement_in_programa128 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_lectura_in_programa143 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_comentario_in_programa162 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_whilestatemet_in_programa170 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_funcion_in_programa183 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_llamadofuncion_in_programa191 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_declaracion_in_programa203 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_declaracion2_in_programa218 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_declaracion_lista_in_programa232 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_push_in_programa241 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_forstatemet_in_programa263 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_asignacion_lista_in_programa278 = new BitSet(new long[]{0x0001400009C23822L});
    public static final BitSet FOLLOW_47_in_return1322 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_evaluator_in_return1328 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_return1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion369 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion375 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_funcion377 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_48_in_funcion389 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion395 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_funcion412 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_funcion414 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion420 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_funcion438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion441 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_whilestatements_in_funcion455 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_declaracion499 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion505 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_evaluator_in_declaracion511 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_declaracion2606 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion2610 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_declaracion_lista709 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista713 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push813 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_push815 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_expression_in_push821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push823 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_push893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion929 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion935 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_asignacion975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion_lista1002 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_44_in_asignacion_lista1011 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1015 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_asignacion_lista1017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion_lista1019 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1025 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_37_in_asignacion_lista1033 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1037 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_asignacion_lista1039 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1045 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_asignacion_lista1047 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_asignacion_lista1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura1132 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura1136 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_lectura1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print11208 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_expression_in_print11219 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_33_in_print11231 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_expression_in_print11241 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_PC_in_print11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println1277 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_expression_in_println1287 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_33_in_println1299 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_expression_in_println1309 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_PC_in_println1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term1492 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_term1494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1529 = new BitSet(new long[]{0x0000100800000000L});
    public static final BitSet FOLLOW_35_in_term1538 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_term1544 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_term1554 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_term1564 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_term1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unary1617 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_34_in_unary1625 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_term_in_unary1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult1676 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_31_in_mult1700 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_unary_in_mult1704 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_38_in_mult1732 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_unary_in_mult1736 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_mult_in_add1784 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_32_in_add1807 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_mult_in_add1811 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_34_in_add1838 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_mult_in_add1842 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_add_in_relation1891 = new BitSet(new long[]{0x00000F8020000002L});
    public static final BitSet FOLLOW_41_in_relation1928 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_relation1932 = new BitSet(new long[]{0x00000F8020000002L});
    public static final BitSet FOLLOW_42_in_relation1970 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_relation1974 = new BitSet(new long[]{0x00000F8020000002L});
    public static final BitSet FOLLOW_39_in_relation2013 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_relation2017 = new BitSet(new long[]{0x00000F8020000002L});
    public static final BitSet FOLLOW_29_in_relation2056 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_relation2060 = new BitSet(new long[]{0x00000F8020000002L});
    public static final BitSet FOLLOW_40_in_relation2100 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_relation2104 = new BitSet(new long[]{0x00000F8020000002L});
    public static final BitSet FOLLOW_43_in_relation2144 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_relation2148 = new BitSet(new long[]{0x00000F8020000002L});
    public static final BitSet FOLLOW_relation_in_logico2211 = new BitSet(new long[]{0x0002000040000002L});
    public static final BitSet FOLLOW_30_in_logico2239 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_relation_in_logico2243 = new BitSet(new long[]{0x0002000040000002L});
    public static final BitSet FOLLOW_49_in_logico2276 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_relation_in_logico2280 = new BitSet(new long[]{0x0002000040000002L});
    public static final BitSet FOLLOW_logico_in_expression2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2369 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2374 = new BitSet(new long[]{0x00000000021E0100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2389 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_llamadofuncion2401 = new BitSet(new long[]{0x0000000002160100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2408 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2421 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_llamadofuncion2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_ifstatements2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_ifstatements2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_ifstatements2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_ifstatements2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_ifstatements2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_ifstatements2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_ifstatements2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_ifstatements2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_ifstatements2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_ifstatements2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_ifstatements2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_ifstatements2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_ifstatements2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_ifstatements2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_elsestataments2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_elsestataments2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_elsestataments2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_elsestataments2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_elsestataments2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_elsestataments2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_elsestataments2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_elsestataments2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_elsestataments2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_elsestataments2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_elsestataments2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_elsestataments2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_elsestataments2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_elsestataments2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement2713 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2715 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2721 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2727 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2729 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2737 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2747 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSEIF_in_ifstatement2756 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2758 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2768 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2770 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2777 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2787 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement2804 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2807 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_elsestataments_in_ifstatement2818 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2826 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_print1_in_whilestatements2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_whilestatements2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_whilestatements2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_whilestatements2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_whilestatements2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_whilestatements2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_whilestatements2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_whilestatements2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_whilestatements2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_whilestatements2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_whilestatements2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_whilestatements2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_whilestatements2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet2978 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet2980 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_logico_in_whilestatemet2984 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet2987 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet2989 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_whilestatements_in_whilestatemet2997 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatemet3024 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet3026 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_declaracion_in_forstatemet3030 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_logico_in_forstatemet3034 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3036 = new BitSet(new long[]{0x0000000502160100L});
    public static final BitSet FOLLOW_add_in_forstatemet3040 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet3045 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_forstatemet3047 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_whilestatements_in_forstatemet3055 = new BitSet(new long[]{0x0001C00009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_forstatemet3066 = new BitSet(new long[]{0x0000000000000002L});

}