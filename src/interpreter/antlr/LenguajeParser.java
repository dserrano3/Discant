// $ANTLR 3.4 /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g 2014-07-31 18:21:24

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "COMENTARIO", "COMILLASD", "COMILLASS", "DOBLE", "ELSE", "ELSEIF", "FOR", "FUNCTION", "IF", "LLAVE_D", "LLAVE_I", "NEWLINE", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", "PC", "PRINT", "PRINTLN", "READ", "TEXTO", "TOKEN", "WHILE", "WS", "'!='", "'%'", "'&&'", "'*'", "'+'", "','", "'-'", "'.get('", "'.push('", "'.set('", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'['", "']'", "'list'", "'return'", "'var'", "'||'"
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:46:1: programa returns [StringBuilder output] : ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+ ;
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

        Evaluator declaracion29 =null;

        Evaluator declaracion_lista10 =null;

        Evaluator push11 =null;

        Evaluator forstatemet12 =null;

        Evaluator asignacion_lista13 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:47:3: ( ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+ )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:49:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+
            {

               pila.add(new Context1()); 
               output = new StringBuilder();
              

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:53:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )+
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
                    case 37:
                        {
                        alt1=13;
                        }
                        break;
                    case PARENTESIS_I:
                        {
                        alt1=9;
                        }
                        break;
                    case 38:
                    case 45:
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
                case 49:
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
                case 47:
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
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:54:7: print1
            	    {
            	    pushFollow(FOLLOW_print1_in_programa84);
            	    print11=print1();

            	    state._fsp--;


            	    output.append((String)print11.evaluate(pila));

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:55:7: println
            	    {
            	    pushFollow(FOLLOW_println_in_programa104);
            	    println2=println();

            	    state._fsp--;


            	    output.append((String)println2.evaluate(pila));

            	    }
            	    break;
            	case 3 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:56:7: asignacion
            	    {
            	    pushFollow(FOLLOW_asignacion_in_programa123);
            	    asignacion3=asignacion();

            	    state._fsp--;


            	    asignacion3.evaluate(pila);

            	    }
            	    break;
            	case 4 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:57:7: ifstatement
            	    {
            	    pushFollow(FOLLOW_ifstatement_in_programa139);
            	    ifstatement4=ifstatement();

            	    state._fsp--;


            	    output.append((String)ifstatement4.evaluate(pila));

            	    }
            	    break;
            	case 5 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:58:7: lectura
            	    {
            	    pushFollow(FOLLOW_lectura_in_programa154);
            	    lectura5=lectura();

            	    state._fsp--;


            	    lectura5.evaluate(pila);

            	    }
            	    break;
            	case 6 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:59:7: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_programa173);
            	    comentario();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:60:7: whilestatemet
            	    {
            	    pushFollow(FOLLOW_whilestatemet_in_programa181);
            	    whilestatemet6=whilestatemet();

            	    state._fsp--;


            	    output.append((String)whilestatemet6.evaluate(pila));

            	    }
            	    break;
            	case 8 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:61:7: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_programa194);
            	    funcion();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:62:7: llamadofuncion
            	    {
            	    pushFollow(FOLLOW_llamadofuncion_in_programa202);
            	    llamadofuncion7=llamadofuncion();

            	    state._fsp--;


            	    output.append((String)llamadofuncion7.evaluate(pila));

            	    }
            	    break;
            	case 10 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:63:7: declaracion
            	    {
            	    pushFollow(FOLLOW_declaracion_in_programa214);
            	    declaracion8=declaracion();

            	    state._fsp--;


            	    declaracion8.evaluate(pila);

            	    }
            	    break;
            	case 11 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:64:7: declaracion2
            	    {
            	    pushFollow(FOLLOW_declaracion2_in_programa229);
            	    declaracion29=declaracion2();

            	    state._fsp--;


            	    declaracion29.evaluate(pila);

            	    }
            	    break;
            	case 12 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:65:7: declaracion_lista
            	    {
            	    pushFollow(FOLLOW_declaracion_lista_in_programa243);
            	    declaracion_lista10=declaracion_lista();

            	    state._fsp--;


            	    declaracion_lista10.evaluate(pila);

            	    }
            	    break;
            	case 13 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:66:7: push
            	    {
            	    pushFollow(FOLLOW_push_in_programa252);
            	    push11=push();

            	    state._fsp--;


            	    push11.evaluate(pila);

            	    }
            	    break;
            	case 14 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:67:7: forstatemet
            	    {
            	    pushFollow(FOLLOW_forstatemet_in_programa274);
            	    forstatemet12=forstatemet();

            	    state._fsp--;


            	    output.append((String)forstatemet12.evaluate(pila));

            	    }
            	    break;
            	case 15 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:68:7: asignacion_lista
            	    {
            	    pushFollow(FOLLOW_asignacion_lista_in_programa289);
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:76:3: return1 returns [Evaluator e] : 'return' te= evaluator PC ;
    public final Evaluator return1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator te =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:77:3: ( 'return' te= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:78:5: 'return' te= evaluator PC
            {
            match(input,48,FOLLOW_48_in_return1333); 

            pushFollow(FOLLOW_evaluator_in_return1339);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1346); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:86:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' ;
    public final Evaluator funcion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom1=null;
        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:87:3: ( FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:88:3: FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}'
            {
            e = new FuncionEvaluator();

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion384); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion390); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_funcion392); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:91:2: ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==49) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:91:3: ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )*
                    {
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:91:3: ( 'var' nom1= NOMBRE )
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:92:4: 'var' nom1= NOMBRE
                    {
                    match(input,49,FOLLOW_49_in_funcion404); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion410); 


                    	     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	  

                    }


                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:97:2: ( ',' 'var' nom1= NOMBRE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==34) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:98:5: ',' 'var' nom1= NOMBRE
                    	    {
                    	    match(input,34,FOLLOW_34_in_funcion427); 

                    	    match(input,49,FOLLOW_49_in_funcion429); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion435); 


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


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_funcion453); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion456); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:107:4: (wh= whilestatements )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMENTARIO||LA4_0==FOR||LA4_0==IF||LA4_0==NOMBRE||(LA4_0 >= PRINT && LA4_0 <= READ)||LA4_0==WHILE||(LA4_0 >= 47 && LA4_0 <= 49)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:107:5: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_funcion470);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion482); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:121:1: declaracion returns [Evaluator e] : 'var' nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator declaracion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:122:3: ( 'var' nom= NOMBRE ASIGNACION ev= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:123:3: 'var' nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            match(input,49,FOLLOW_49_in_declaracion517); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion521); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion523); 

            pushFollow(FOLLOW_evaluator_in_declaracion529);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                              		  //System.out.println("intento salvar");
                                              		  e = new DeclaracionEvaluator((nom!=null?nom.getText():null),ev);   
                                          			
                                              			
                                              	}
                                             

            match(input,PC,FOLLOW_PC_in_declaracion600); 

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



    // $ANTLR start "declaracion2"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:136:3: declaracion2 returns [Evaluator e] : 'var' nom= NOMBRE PC ;
    public final Evaluator declaracion2() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:137:3: ( 'var' nom= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:138:3: 'var' nom= NOMBRE PC
            {
            match(input,49,FOLLOW_49_in_declaracion2628); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion2632); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new IntEvaluator(0));   
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion2705); 

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
    // $ANTLR end "declaracion2"



    // $ANTLR start "declaracion_lista"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:153:3: declaracion_lista returns [Evaluator e] : 'list' nom= NOMBRE PC ;
    public final Evaluator declaracion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:154:3: ( 'list' nom= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:156:3: 'list' nom= NOMBRE PC
            {
            match(input,47,FOLLOW_47_in_declaracion_lista735); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista739); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new ListEvaluator());   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion_lista812); 

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



    // $ANTLR start "push"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:168:3: push returns [Evaluator e] : nom= NOMBRE '.push(' exp= expression ')' PC ;
    public final Evaluator push() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:169:3: (nom= NOMBRE '.push(' exp= expression ')' PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:170:3: nom= NOMBRE '.push(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push842); 

            match(input,37,FOLLOW_37_in_push844); 

            pushFollow(FOLLOW_expression_in_push850);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push852); 


                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar");
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push922); 

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



    // $ANTLR start "asignacion"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:183:3: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:184:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:185:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion959); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion961); 

            pushFollow(FOLLOW_evaluator_in_asignacion967);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);    
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion1007); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:199:3: asignacion_lista returns [Evaluator e] : nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC ;
    public final Evaluator asignacion_lista() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token num=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:200:3: (nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:201:4: nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion_lista1037); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:202:4: ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:202:7: '[' num= NUMERO ']' ASIGNACION ev= evaluator
                    {
                    match(input,45,FOLLOW_45_in_asignacion_lista1046); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1050); 

                    match(input,46,FOLLOW_46_in_asignacion_lista1052); 

                    match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion_lista1054); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1060);
                    ev=evaluator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:203:7: '.set(' num= NUMERO ',' ev= evaluator ')'
                    {
                    match(input,38,FOLLOW_38_in_asignacion_lista1068); 

                    num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1072); 

                    match(input,34,FOLLOW_34_in_asignacion_lista1074); 

                    pushFollow(FOLLOW_evaluator_in_asignacion_lista1080);
                    ev=evaluator();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_asignacion_lista1082); 

                    }
                    break;

            }



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionListaEvaluator((nom!=null?nom.getText():null),ev, (num!=null?num.getText():null));
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion_lista1128); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:217:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:218:3: ( COMENTARIO )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:219:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario1146); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:222:1: lectura returns [Evaluator e] : r= READ n= NOMBRE PC ;
    public final Evaluator lectura() throws Exception, RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;

        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:223:3: (r= READ n= NOMBRE PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:224:3: r= READ n= NOMBRE PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura1171); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura1175); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            match(input,PC,FOLLOW_PC_in_lectura1222); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:236:1: print1 returns [Evaluator e] : PRINT (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator print1() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:237:3: ( PRINT (exp= expression ) ( ',' exp= expression )* PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:238:3: PRINT (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintEvaluator(); 

            match(input,PRINT,FOLLOW_PRINT_in_print11251); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:240:3: (exp= expression )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:240:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_print11262);
            exp=expression();

            state._fsp--;


             ((PrintEvaluator)e).addEvaluator(exp); 

            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:242:3: ( ',' exp= expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:242:5: ',' exp= expression
            	    {
            	    match(input,34,FOLLOW_34_in_print11274); 

            	    pushFollow(FOLLOW_expression_in_print11284);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_print11295); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:248:1: println returns [Evaluator e] : PRINTLN (exp= expression ) ( ',' exp= expression )* PC ;
    public final Evaluator println() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator exp =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:249:3: ( PRINTLN (exp= expression ) ( ',' exp= expression )* PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:250:3: PRINTLN (exp= expression ) ( ',' exp= expression )* PC
            {
             e = new PrintlnEvaluator(); 

            match(input,PRINTLN,FOLLOW_PRINTLN_in_println1324); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:252:3: (exp= expression )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:252:5: exp= expression
            {
            pushFollow(FOLLOW_expression_in_println1334);
            exp=expression();

            state._fsp--;


             ((PrintlnEvaluator)e).addEvaluator(exp); 

            }


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:254:3: ( ',' exp= expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:254:5: ',' exp= expression
            	    {
            	    match(input,34,FOLLOW_34_in_println1346); 

            	    pushFollow(FOLLOW_expression_in_println1356);
            	    exp=expression();

            	    state._fsp--;


            	     ((PrintlnEvaluator)e).addEvaluator(exp); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,PC,FOLLOW_PC_in_println1367); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:260:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico14 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:261:3: ( logico )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:262:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator1392);
            logico14=logico();

            state._fsp--;



                     e = logico14;
                    

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:268:1: term returns [Evaluator e] : (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) );
    public final Evaluator term() throws Exception, RecognitionException {
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:269:3: (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) )
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
                case 35:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 46:
                case 50:
                    {
                    alt9=2;
                    }
                    break;
                case 36:
                case 45:
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
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:271:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term1440);
                    lla=llamadofuncion();

                    state._fsp--;



                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:278:5: NOMBRE
                    {
                    NOMBRE15=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1456); 

                      
                           // System.out.println("entiendo que es un llamado");
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE15!=null?NOMBRE15.getText():null)));//((pila.peek().get((NOMBRE15!=null?NOMBRE15.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:285:5: NUMERO
                    {
                    NUMERO16=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term1474); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO16!=null?NUMERO16.getText():null)));
                              

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:289:5: DOBLE
                    {
                    DOBLE17=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term1493); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE17!=null?DOBLE17.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:294:5: TEXTO
                    {
                    TEXTO18=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term1527); 


                              e = new StringEvaluator(((TEXTO18!=null?TEXTO18.getText():null)));
                             

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:299:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term1548); 

                    pushFollow(FOLLOW_add_in_term1550);
                    add19=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1552); 


                                           e = add19;
                                          

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:303:5: nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' )
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1585); 

                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:304:5: ( '.get(' num= add ')' | '[' num= add ']' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==36) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==45) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }
                    switch (alt8) {
                        case 1 :
                            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:304:7: '.get(' num= add ')'
                            {
                            match(input,36,FOLLOW_36_in_term1594); 

                            pushFollow(FOLLOW_add_in_term1600);
                            num=add();

                            state._fsp--;


                            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1602); 

                            }
                            break;
                        case 2 :
                            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:305:7: '[' num= add ']'
                            {
                            match(input,45,FOLLOW_45_in_term1610); 

                            pushFollow(FOLLOW_add_in_term1620);
                            num=add();

                            state._fsp--;


                            match(input,46,FOLLOW_46_in_term1622); 

                            }
                            break;

                    }



                                    e = new GetEvaluator((nom!=null?nom.getText():null),num);     
                             

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:312:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator term20 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:313:3: ( ( '+' | '-' )* term )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:315:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:318:3: ( '+' | '-' )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }
                else if ( (LA10_0==35) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:319:7: '+'
            	    {
            	    match(input,33,FOLLOW_33_in_unary1677); 

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:320:7: '-'
            	    {
            	    match(input,35,FOLLOW_35_in_unary1685); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary1706);
            term20=term();

            state._fsp--;



                   e = term20; 
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:333:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* ;
    public final Evaluator mult() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:334:3: (op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:335:3: op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult1740);
            op1=unary();

            state._fsp--;



                        e = op1;
                       

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:339:3: ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    alt11=1;
                    }
                    break;
                case 39:
                    {
                    alt11=2;
                    }
                    break;
                case 30:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:340:5: '*' op2= unary
            	    {
            	    match(input,32,FOLLOW_32_in_mult1764); 

            	    pushFollow(FOLLOW_unary_in_mult1768);
            	    op2=unary();

            	    state._fsp--;



            	                      e = new TimesEvaluator(e,op2);
            	                     

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:344:7: '/' op2= unary
            	    {
            	    match(input,39,FOLLOW_39_in_mult1796); 

            	    pushFollow(FOLLOW_unary_in_mult1800);
            	    op2=unary();

            	    state._fsp--;



            	                        e = new DivideEvaluator(e,op2);
            	                       

            	    }
            	    break;
            	case 3 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:348:7: '%' op2= unary
            	    {
            	    match(input,30,FOLLOW_30_in_mult1830); 

            	    pushFollow(FOLLOW_unary_in_mult1834);
            	    op2=unary();

            	    state._fsp--;



            	                        e = new ModEvaluator(e,op2);
            	                       

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:355:1: add returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
    public final Evaluator add() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:356:3: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:357:3: op1= mult ( '+' op2= mult | '-' op2= mult )*
            {
            pushFollow(FOLLOW_mult_in_add1886);
            op1=mult();

            state._fsp--;



                       e = op1;
                      

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:361:3: ( '+' op2= mult | '-' op2= mult )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }
                else if ( (LA12_0==35) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:362:5: '+' op2= mult
            	    {
            	    match(input,33,FOLLOW_33_in_add1909); 

            	    pushFollow(FOLLOW_mult_in_add1913);
            	    op2=mult();

            	    state._fsp--;


            	      
            	                     e = new PlusEvaluator(e, op2);
            	                    

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:366:7: '-' op2= mult
            	    {
            	    match(input,35,FOLLOW_35_in_add1940); 

            	    pushFollow(FOLLOW_mult_in_add1944);
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:373:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:374:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:375:3: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation1995);
            ex1=add();

            state._fsp--;



                             e = ex1;
                            

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:379:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29||(LA14_0 >= 40 && LA14_0 <= 44)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:380:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:380:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt13=6;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt13=5;
            	        }
            	        break;
            	    case 44:
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
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:381:7: '==' ex2= add
            	            {
            	            match(input,42,FOLLOW_42_in_relation2032); 

            	            pushFollow(FOLLOW_add_in_relation2036);
            	            ex2=add();

            	            state._fsp--;



            	                                      e = new IgualIgualEvaluator(e,ex2);
            	                                     

            	            }
            	            break;
            	        case 2 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:385:9: '>' ex2= add
            	            {
            	            match(input,43,FOLLOW_43_in_relation2074); 

            	            pushFollow(FOLLOW_add_in_relation2078);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MayorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 3 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:389:9: '<' ex2= add
            	            {
            	            match(input,40,FOLLOW_40_in_relation2117); 

            	            pushFollow(FOLLOW_add_in_relation2121);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MenorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 4 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:393:9: '!=' ex2= add
            	            {
            	            match(input,29,FOLLOW_29_in_relation2160); 

            	            pushFollow(FOLLOW_add_in_relation2164);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new DiferenteEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 5 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:397:9: '<=' ex2= add
            	            {
            	            match(input,41,FOLLOW_41_in_relation2204); 

            	            pushFollow(FOLLOW_add_in_relation2208);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MenorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 6 :
            	            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:401:9: '>=' ex2= add
            	            {
            	            match(input,44,FOLLOW_44_in_relation2248); 

            	            pushFollow(FOLLOW_add_in_relation2252);
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:409:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:410:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:411:3: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico2318);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:415:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }
                else if ( (LA15_0==50) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:416:5: '&&' rel2= relation
            	    {
            	    match(input,31,FOLLOW_31_in_logico2346); 

            	    pushFollow(FOLLOW_relation_in_logico2350);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:420:7: '||' rel2= relation
            	    {
            	    match(input,50,FOLLOW_50_in_logico2383); 

            	    pushFollow(FOLLOW_relation_in_logico2387);
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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:427:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator logico21 =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:428:5: ( logico )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:428:9: logico
            {
            pushFollow(FOLLOW_logico_in_expression2446);
            logico21=logico();

            state._fsp--;


             e = logico21; 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:432:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC ;
    public final Evaluator llamadofuncion() throws Exception, RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:433:4: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:434:9: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2484); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2489); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:436:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DOBLE||(LA17_0 >= NOMBRE && LA17_0 <= NUMERO)||LA17_0==PARENTESIS_I||LA17_0==TEXTO) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:436:9: (ev= term ) ( ',' ev= term )*
                    {
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:436:9: (ev= term )
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:436:10: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2504);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev); 

                    }


                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:438:4: ( ',' ev= term )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==34) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:438:5: ',' ev= term
                    	    {
                    	    match(input,34,FOLLOW_34_in_llamadofuncion2516); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2523);
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


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2536); 

            match(input,PC,FOLLOW_PC_in_llamadofuncion2547); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:448:1: ifstatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista );
    public final Evaluator ifstatements() throws Exception, RecognitionException {
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:448:52: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )
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
                case 37:
                    {
                    alt18=12;
                    }
                    break;
                case 38:
                case 45:
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
            case 48:
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
            case 49:
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
            case 47:
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
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:450:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_ifstatements2578);
                    print122=print1();

                    state._fsp--;


                    e = print122;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:451:5: println
                    {
                    pushFollow(FOLLOW_println_in_ifstatements2586);
                    println23=println();

                    state._fsp--;


                    e = println23;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:452:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_ifstatements2597);
                    asignacion24=asignacion();

                    state._fsp--;


                    e = asignacion24;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:453:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_ifstatements2604);
                    lectura25=lectura();

                    state._fsp--;


                    e = lectura25;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:454:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_ifstatements2612);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:455:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_ifstatements2620);
                    return126=return1();

                    state._fsp--;


                    e = return126;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:456:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_ifstatements2628);
                    whilestatemet27=whilestatemet();

                    state._fsp--;


                    e = whilestatemet27;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:457:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_ifstatements2636);
                    ifstatement28=ifstatement();

                    state._fsp--;


                    e = ifstatement28;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:458:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_ifstatements2645);
                    declaracion29=declaracion();

                    state._fsp--;


                    e = declaracion29;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:459:5: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_ifstatements2652);
                    declaracion230=declaracion2();

                    state._fsp--;


                    e = declaracion230;

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:460:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_ifstatements2661);
                    declaracion_lista31=declaracion_lista();

                    state._fsp--;


                    declaracion_lista31.evaluate(pila);

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:461:5: push
                    {
                    pushFollow(FOLLOW_push_in_ifstatements2668);
                    push32=push();

                    state._fsp--;


                     e = push32; 

                    }
                    break;
                case 13 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:462:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_ifstatements2675);
                    forstatemet33=forstatemet();

                    state._fsp--;


                    forstatemet33.evaluate(pila);

                    }
                    break;
                case 14 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:463:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_ifstatements2682);
                    asignacion_lista34=asignacion_lista();

                    state._fsp--;


                    asignacion_lista34.evaluate(pila);

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:468:1: elsestataments returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista );
    public final Evaluator elsestataments() throws Exception, RecognitionException {
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:468:54: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista )
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
                case 37:
                    {
                    alt19=12;
                    }
                    break;
                case 38:
                case 45:
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
            case 48:
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
            case 49:
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
            case 47:
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
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:470:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_elsestataments2715);
                    print135=print1();

                    state._fsp--;


                    e = print135;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:471:5: println
                    {
                    pushFollow(FOLLOW_println_in_elsestataments2723);
                    println36=println();

                    state._fsp--;


                    e = println36;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:472:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_elsestataments2732);
                    asignacion37=asignacion();

                    state._fsp--;


                    e = asignacion37;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:473:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_elsestataments2739);
                    lectura38=lectura();

                    state._fsp--;


                    e = lectura38;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:474:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_elsestataments2747);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:475:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_elsestataments2755);
                    return139=return1();

                    state._fsp--;


                    e = return139;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:476:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_elsestataments2763);
                    whilestatemet40=whilestatemet();

                    state._fsp--;


                    e = whilestatemet40;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:477:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_elsestataments2771);
                    ifstatement41=ifstatement();

                    state._fsp--;


                    e = ifstatement41;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:478:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_elsestataments2780);
                    declaracion42=declaracion();

                    state._fsp--;


                    e = declaracion42;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:479:5: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_elsestataments2787);
                    declaracion243=declaracion2();

                    state._fsp--;


                    e = declaracion243;

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:480:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_elsestataments2796);
                    declaracion_lista44=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista44; /*declaracion_lista44.evaluate(pila);*/

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:481:5: push
                    {
                    pushFollow(FOLLOW_push_in_elsestataments2803);
                    push45=push();

                    state._fsp--;


                     e = push45; 

                    }
                    break;
                case 13 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:482:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_elsestataments2810);
                    forstatemet46=forstatemet();

                    state._fsp--;


                    forstatemet46.evaluate(pila);

                    }
                    break;
                case 14 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:483:5: asignacion_lista
                    {
                    pushFollow(FOLLOW_asignacion_lista_in_elsestataments2817);
                    asignacion_lista47=asignacion_lista();

                    state._fsp--;


                    asignacion_lista47.evaluate(pila);

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:489:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* ;
    public final Evaluator ifstatement() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:489:51: ( IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:491:1: IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement2840); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2842); 

            pushFollow(FOLLOW_logico_in_ifstatement2848);
            rel=logico();

            state._fsp--;



              e = new IfEvaluator ();   
              ((IfEvaluator) e).agregarCondicion(rel);


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2854); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2856); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:497:2: (ifs= ifstatements )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMENTARIO||LA20_0==FOR||LA20_0==IF||LA20_0==NOMBRE||(LA20_0 >= PRINT && LA20_0 <= READ)||LA20_0==WHILE||(LA20_0 >= 47 && LA20_0 <= 49)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:497:3: ifs= ifstatements
            	    {
            	    pushFollow(FOLLOW_ifstatements_in_ifstatement2864);
            	    ifs=ifstatements();

            	    state._fsp--;



            	       ((IfEvaluator) e).agregarCoso(ifs);   
            	      
            	     

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2874); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:505:2: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELSEIF) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:505:3: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D
            	    {
            	    match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement2883); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2885); 

            	    pushFollow(FOLLOW_logico_in_ifstatement2889);
            	    rel1=logico();

            	    state._fsp--;



            	     ((IfEvaluator) e).nuevoSegmento();
            	     ((IfEvaluator) e).agregarCondicion(rel1); 


            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2895); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2897); 

            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:511:2: (ifs= ifstatements )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==COMENTARIO||LA21_0==FOR||LA21_0==IF||LA21_0==NOMBRE||(LA21_0 >= PRINT && LA21_0 <= READ)||LA21_0==WHILE||(LA21_0 >= 47 && LA21_0 <= 49)) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:511:3: ifs= ifstatements
            	    	    {
            	    	    pushFollow(FOLLOW_ifstatements_in_ifstatement2904);
            	    	    ifs=ifstatements();

            	    	    state._fsp--;



            	    	       ((IfEvaluator) e).agregarCoso(ifs);   
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2914); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:521:3: ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ELSE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:521:3: ELSE LLAVE_I (elses= elsestataments )* LLAVE_D
            	    {
            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement2931); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2934); 

            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:522:9: (elses= elsestataments )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==COMENTARIO||LA23_0==FOR||LA23_0==IF||LA23_0==NOMBRE||(LA23_0 >= PRINT && LA23_0 <= READ)||LA23_0==WHILE||(LA23_0 >= 47 && LA23_0 <= 49)) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:523:5: elses= elsestataments
            	    	    {
            	    	    pushFollow(FOLLOW_elsestataments_in_ifstatement2945);
            	    	    elses=elsestataments();

            	    	    state._fsp--;


            	    	        
            	    	       ((IfEvaluator)e).agregarCosoElse(elses);
            	    	     
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2953); 

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
    // $ANTLR end "ifstatement"



    // $ANTLR start "whilestatements"
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:537:1: whilestatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet );
    public final Evaluator whilestatements() throws Exception, RecognitionException {
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
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:537:55: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet )
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
                else if ( (LA25_3==37) ) {
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
            case 48:
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
            case 49:
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
            case 47:
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
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:540:5: print1
                    {
                    pushFollow(FOLLOW_print1_in_whilestatements2989);
                    print148=print1();

                    state._fsp--;


                    e = print148;

                    }
                    break;
                case 2 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:541:5: println
                    {
                    pushFollow(FOLLOW_println_in_whilestatements2997);
                    println49=println();

                    state._fsp--;


                    e = println49;

                    }
                    break;
                case 3 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:542:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_whilestatements3006);
                    asignacion50=asignacion();

                    state._fsp--;


                    e = asignacion50;

                    }
                    break;
                case 4 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:543:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_whilestatements3013);
                    lectura51=lectura();

                    state._fsp--;


                    e = lectura51;

                    }
                    break;
                case 5 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:544:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_whilestatements3021);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 6 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:545:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_whilestatements3029);
                    return152=return1();

                    state._fsp--;


                    e = return152;

                    }
                    break;
                case 7 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:546:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_whilestatements3037);
                    whilestatemet53=whilestatemet();

                    state._fsp--;


                    e = whilestatemet53;

                    }
                    break;
                case 8 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:547:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_whilestatements3045);
                    ifstatement54=ifstatement();

                    state._fsp--;


                    e = ifstatement54;

                    }
                    break;
                case 9 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:548:5: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_whilestatements3054);
                    declaracion55=declaracion();

                    state._fsp--;


                    e = declaracion55;

                    }
                    break;
                case 10 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:549:5: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_whilestatements3063);
                    declaracion256=declaracion2();

                    state._fsp--;


                    e = declaracion256;

                    }
                    break;
                case 11 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:550:5: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_whilestatements3070);
                    declaracion_lista57=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista57; /*declaracion_lista57.evaluate(pila);*/

                    }
                    break;
                case 12 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:551:5: push
                    {
                    pushFollow(FOLLOW_push_in_whilestatements3077);
                    push58=push();

                    state._fsp--;


                     e = push58; 

                    }
                    break;
                case 13 :
                    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:552:5: forstatemet
                    {
                    pushFollow(FOLLOW_forstatemet_in_whilestatements3084);
                    forstatemet59=forstatemet();

                    state._fsp--;


                    forstatemet59.evaluate(pila);

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:557:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator whilestatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:557:53: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:560:1: WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet3113); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet3115); 

            pushFollow(FOLLOW_logico_in_whilestatemet3119);
            rel=logico();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)rel.evaluate(pila));  
               e = new WhileEvaluator(rel); 
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet3122); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet3124); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:566:2: (wh= whilestatements )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMENTARIO||LA26_0==FOR||LA26_0==IF||LA26_0==NOMBRE||(LA26_0 >= PRINT && LA26_0 <= READ)||LA26_0==WHILE||(LA26_0 >= 47 && LA26_0 <= 49)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:566:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_whilestatemet3132);
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


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet3143); 

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
    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:578:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator forstatemet() throws Exception, RecognitionException {
        Evaluator e = null;


        Evaluator decl =null;

        Evaluator logi =null;

        Evaluator aumento =null;

        Evaluator wh =null;


        try {
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:578:51: ( FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:581:1: FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,FOR,FOLLOW_FOR_in_forstatemet3163); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet3165); 

            pushFollow(FOLLOW_declaracion_in_forstatemet3169);
            decl=declaracion();

            state._fsp--;


            pushFollow(FOLLOW_logico_in_forstatemet3173);
            logi=logico();

            state._fsp--;


            match(input,PC,FOLLOW_PC_in_forstatemet3175); 

            pushFollow(FOLLOW_add_in_forstatemet3179);
            aumento=add();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)$rel.e.evaluate(pila));  
               e = new ForEvaluator(decl, logi, aumento);  
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet3184); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet3186); 

            // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:587:2: (wh= whilestatements )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMENTARIO||LA27_0==FOR||LA27_0==IF||LA27_0==NOMBRE||(LA27_0 >= PRINT && LA27_0 <= READ)||LA27_0==WHILE||(LA27_0 >= 47 && LA27_0 <= 49)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/alfredo/Documents/github/spanish_programming_language/src/Lenguaje.g:587:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_forstatemet3194);
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


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet3205); 

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


 

    public static final BitSet FOLLOW_print1_in_programa84 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_println_in_programa104 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_asignacion_in_programa123 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_ifstatement_in_programa139 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_lectura_in_programa154 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_comentario_in_programa173 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_whilestatemet_in_programa181 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_funcion_in_programa194 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_llamadofuncion_in_programa202 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_declaracion_in_programa214 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_declaracion2_in_programa229 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_declaracion_lista_in_programa243 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_push_in_programa252 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_forstatemet_in_programa274 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_asignacion_lista_in_programa289 = new BitSet(new long[]{0x0002800009C23822L});
    public static final BitSet FOLLOW_48_in_return1333 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_evaluator_in_return1339 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_return1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion384 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion390 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_funcion392 = new BitSet(new long[]{0x0002000000080000L});
    public static final BitSet FOLLOW_49_in_funcion404 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion410 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_34_in_funcion427 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funcion429 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion435 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_funcion453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion456 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_whilestatements_in_funcion470 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_declaracion517 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion523 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_evaluator_in_declaracion529 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_declaracion2628 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion2632 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_declaracion_lista735 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista739 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push842 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_push844 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_expression_in_push850 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push852 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_push922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion961 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion967 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_asignacion1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion_lista1037 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_45_in_asignacion_lista1046 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1050 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_asignacion_lista1052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion_lista1054 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1060 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_38_in_asignacion_lista1068 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1072 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_asignacion_lista1074 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion_lista1080 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_asignacion_lista1082 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_asignacion_lista1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura1171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura1175 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_lectura1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print11251 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_expression_in_print11262 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_34_in_print11274 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_expression_in_print11284 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_PC_in_print11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_println1324 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_expression_in_println1334 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_34_in_println1346 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_expression_in_println1356 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_PC_in_println1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term1548 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_term1550 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1585 = new BitSet(new long[]{0x0000201000000000L});
    public static final BitSet FOLLOW_36_in_term1594 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_term1600 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_term1610 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_term1620 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_term1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_unary1677 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_35_in_unary1685 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_term_in_unary1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult1740 = new BitSet(new long[]{0x0000008140000002L});
    public static final BitSet FOLLOW_32_in_mult1764 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_unary_in_mult1768 = new BitSet(new long[]{0x0000008140000002L});
    public static final BitSet FOLLOW_39_in_mult1796 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_unary_in_mult1800 = new BitSet(new long[]{0x0000008140000002L});
    public static final BitSet FOLLOW_30_in_mult1830 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_unary_in_mult1834 = new BitSet(new long[]{0x0000008140000002L});
    public static final BitSet FOLLOW_mult_in_add1886 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_33_in_add1909 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_mult_in_add1913 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_35_in_add1940 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_mult_in_add1944 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_add_in_relation1995 = new BitSet(new long[]{0x00001F0020000002L});
    public static final BitSet FOLLOW_42_in_relation2032 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_relation2036 = new BitSet(new long[]{0x00001F0020000002L});
    public static final BitSet FOLLOW_43_in_relation2074 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_relation2078 = new BitSet(new long[]{0x00001F0020000002L});
    public static final BitSet FOLLOW_40_in_relation2117 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_relation2121 = new BitSet(new long[]{0x00001F0020000002L});
    public static final BitSet FOLLOW_29_in_relation2160 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_relation2164 = new BitSet(new long[]{0x00001F0020000002L});
    public static final BitSet FOLLOW_41_in_relation2204 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_relation2208 = new BitSet(new long[]{0x00001F0020000002L});
    public static final BitSet FOLLOW_44_in_relation2248 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_relation2252 = new BitSet(new long[]{0x00001F0020000002L});
    public static final BitSet FOLLOW_relation_in_logico2318 = new BitSet(new long[]{0x0004000080000002L});
    public static final BitSet FOLLOW_31_in_logico2346 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_relation_in_logico2350 = new BitSet(new long[]{0x0004000080000002L});
    public static final BitSet FOLLOW_50_in_logico2383 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_relation_in_logico2387 = new BitSet(new long[]{0x0004000080000002L});
    public static final BitSet FOLLOW_logico_in_expression2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2484 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2489 = new BitSet(new long[]{0x00000000021E0100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2504 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_34_in_llamadofuncion2516 = new BitSet(new long[]{0x0000000002160100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2523 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2536 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_llamadofuncion2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_ifstatements2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_ifstatements2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_ifstatements2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_ifstatements2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_ifstatements2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_ifstatements2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_ifstatements2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_ifstatements2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_ifstatements2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_ifstatements2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_ifstatements2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_ifstatements2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_ifstatements2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_ifstatements2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_elsestataments2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_elsestataments2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_elsestataments2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_elsestataments2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_elsestataments2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_elsestataments2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_elsestataments2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_elsestataments2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_elsestataments2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_elsestataments2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_elsestataments2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_elsestataments2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_elsestataments2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_lista_in_elsestataments2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement2840 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2842 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2848 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2854 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2856 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2864 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2874 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSEIF_in_ifstatement2883 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2885 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2889 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2895 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2897 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2904 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2914 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement2931 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2934 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_elsestataments_in_ifstatement2945 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2953 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_print1_in_whilestatements2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_whilestatements2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_whilestatements3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_whilestatements3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_whilestatements3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_whilestatements3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_whilestatements3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_whilestatements3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_whilestatements3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_whilestatements3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_whilestatements3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_whilestatements3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatemet_in_whilestatements3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet3113 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet3115 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_logico_in_whilestatemet3119 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet3122 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet3124 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_whilestatements_in_whilestatemet3132 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatemet3163 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet3165 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_declaracion_in_forstatemet3169 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_logico_in_forstatemet3173 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_PC_in_forstatemet3175 = new BitSet(new long[]{0x0000000A02160100L});
    public static final BitSet FOLLOW_add_in_forstatemet3179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet3184 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LLAVE_I_in_forstatemet3186 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_whilestatements_in_forstatemet3194 = new BitSet(new long[]{0x0003800009C26820L});
    public static final BitSet FOLLOW_LLAVE_D_in_forstatemet3205 = new BitSet(new long[]{0x0000000000000002L});

}