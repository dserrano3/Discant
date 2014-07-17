// $ANTLR 3.4 C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g 2014-07-17 21:21:56

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "COMENTARIO", "COMILLASD", "COMILLASS", "DOBLE", "ELSE", "ELSEIF", "FUNCTION", "IF", "LLAVE_D", "LLAVE_I", "NEWLINE", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", "PC", "PRINT", "READ", "TEXTO", "TOKEN", "WHILE", "WS", "'!='", "'&&'", "'*'", "'+'", "','", "'-'", "'.get('", "'.push('", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'list'", "'return'", "'var'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__27=27;
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
    public static final int ASIGNACION=4;
    public static final int COMENTARIO=5;
    public static final int COMILLASD=6;
    public static final int COMILLASS=7;
    public static final int DOBLE=8;
    public static final int ELSE=9;
    public static final int ELSEIF=10;
    public static final int FUNCTION=11;
    public static final int IF=12;
    public static final int LLAVE_D=13;
    public static final int LLAVE_I=14;
    public static final int NEWLINE=15;
    public static final int NOMBRE=16;
    public static final int NUMERO=17;
    public static final int PARENTESIS_D=18;
    public static final int PARENTESIS_I=19;
    public static final int PC=20;
    public static final int PRINT=21;
    public static final int READ=22;
    public static final int TEXTO=23;
    public static final int TOKEN=24;
    public static final int WHILE=25;
    public static final int WS=26;

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
    public String getGrammarFileName() { return "C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g"; }


    Context1 contexto = new Context1(); 
    boolean bandera = true;
    ArrayList<Context1> pila = new ArrayList<Context1>();
    public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();




    // $ANTLR start "programa"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:37:1: programa : ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push )+ ;
    public final void programa() throws RecognitionException {
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


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:38:3: ( ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push )+ )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:40:3: ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push )+
            {

               pila.add(new Context1()); 
              

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:43:3: ( print1 | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion PC | declaracion | declaracion2 | declaracion_lista | push )+
            int cnt1=0;
            loop1:
            do {
                int alt1=13;
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
                    case 34:
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
                case 43:
                    {
                    int LA1_9 = input.LA(2);

                    if ( (LA1_9==NOMBRE) ) {
                        int LA1_14 = input.LA(3);

                        if ( (LA1_14==ASIGNACION) ) {
                            alt1=9;
                        }
                        else if ( (LA1_14==PC) ) {
                            alt1=10;
                        }


                    }


                    }
                    break;
                case 41:
                    {
                    alt1=11;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:44:5: print1
            	    {
            	    pushFollow(FOLLOW_print1_in_programa67);
            	    print11=print1();

            	    state._fsp--;


            	    print11.evaluate(pila);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:45:7: asignacion
            	    {
            	    pushFollow(FOLLOW_asignacion_in_programa77);
            	    asignacion2=asignacion();

            	    state._fsp--;


            	    asignacion2.evaluate(pila);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:46:7: ifstatement
            	    {
            	    pushFollow(FOLLOW_ifstatement_in_programa86);
            	    ifstatement3=ifstatement();

            	    state._fsp--;


            	    ifstatement3.evaluate(pila);

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:47:7: lectura
            	    {
            	    pushFollow(FOLLOW_lectura_in_programa95);
            	    lectura4=lectura();

            	    state._fsp--;


            	    lectura4.evaluate(pila);

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:48:7: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_programa104);
            	    comentario();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:49:7: whilestatemet
            	    {
            	    pushFollow(FOLLOW_whilestatemet_in_programa112);
            	    whilestatemet5=whilestatemet();

            	    state._fsp--;


            	    whilestatemet5.evaluate(pila);

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:50:7: funcion
            	    {
            	    pushFollow(FOLLOW_funcion_in_programa121);
            	    funcion();

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:51:7: llamadofuncion PC
            	    {
            	    pushFollow(FOLLOW_llamadofuncion_in_programa129);
            	    llamadofuncion6=llamadofuncion();

            	    state._fsp--;


            	    llamadofuncion6.evaluate(pila);

            	    match(input,PC,FOLLOW_PC_in_programa132); 

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:52:6: declaracion
            	    {
            	    pushFollow(FOLLOW_declaracion_in_programa139);
            	    declaracion7=declaracion();

            	    state._fsp--;


            	    declaracion7.evaluate(pila);

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:53:7: declaracion2
            	    {
            	    pushFollow(FOLLOW_declaracion2_in_programa148);
            	    declaracion28=declaracion2();

            	    state._fsp--;


            	    declaracion28.evaluate(pila);

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:54:7: declaracion_lista
            	    {
            	    pushFollow(FOLLOW_declaracion_lista_in_programa157);
            	    declaracion_lista9=declaracion_lista();

            	    state._fsp--;


            	    declaracion_lista9.evaluate(pila);

            	    }
            	    break;
            	case 12 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:55:8: push
            	    {
            	    pushFollow(FOLLOW_push_in_programa167);
            	    push10=push();

            	    state._fsp--;


            	    push10.evaluate(pila);

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
        return ;
    }
    // $ANTLR end "programa"



    // $ANTLR start "return1"
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:65:3: return1 returns [Evaluator e] : 'return' te= evaluator PC ;
    public final Evaluator return1() throws RecognitionException {
        Evaluator e = null;


        Evaluator te =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:66:3: ( 'return' te= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:67:5: 'return' te= evaluator PC
            {
            match(input,42,FOLLOW_42_in_return1217); 

            pushFollow(FOLLOW_evaluator_in_return1223);
            te=evaluator();

            state._fsp--;



                  e = new ReturnEvaluator(te); 
                

            match(input,PC,FOLLOW_PC_in_return1230); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:75:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' ;
    public final Evaluator funcion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token nom1=null;
        Evaluator wh =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:76:3: ( FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:77:3: FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}'
            {
            e = new FuncionEvaluator();

            match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion264); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion270); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_funcion272); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:80:2: ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==43) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:80:3: ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )*
                    {
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:80:3: ( 'var' nom1= NOMBRE )
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:81:4: 'var' nom1= NOMBRE
                    {
                    match(input,43,FOLLOW_43_in_funcion284); 

                    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion290); 


                    	     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
                    	  

                    }


                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:86:2: ( ',' 'var' nom1= NOMBRE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==31) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:87:5: ',' 'var' nom1= NOMBRE
                    	    {
                    	    match(input,31,FOLLOW_31_in_funcion307); 

                    	    match(input,43,FOLLOW_43_in_funcion309); 

                    	    nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion315); 


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


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_funcion333); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion336); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:96:4: (wh= whilestatements )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMENTARIO||LA4_0==IF||LA4_0==NOMBRE||(LA4_0 >= PRINT && LA4_0 <= READ)||LA4_0==WHILE||(LA4_0 >= 41 && LA4_0 <= 43)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:96:5: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_funcion350);
            	    wh=whilestatements();

            	    state._fsp--;



            	     
            	         ((FuncionEvaluator) e).add(wh);   
            	         

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion362); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:110:1: declaracion returns [Evaluator e] : 'var' nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator declaracion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:111:3: ( 'var' nom= NOMBRE ASIGNACION ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:112:3: 'var' nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            match(input,43,FOLLOW_43_in_declaracion394); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion398); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion400); 

            pushFollow(FOLLOW_evaluator_in_declaracion406);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                              		  //System.out.println("intento salvar");
                                              		  e = new DeclaracionEvaluator((nom!=null?nom.getText():null),ev);   
                                          			
                                              			
                                              	}
                                             

            match(input,PC,FOLLOW_PC_in_declaracion477); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:125:3: declaracion2 returns [Evaluator e] : 'var' nom= NOMBRE PC ;
    public final Evaluator declaracion2() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:126:3: ( 'var' nom= NOMBRE PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:127:3: 'var' nom= NOMBRE PC
            {
            match(input,43,FOLLOW_43_in_declaracion2501); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion2505); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new IntEvaluator(0));   
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion2578); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:142:3: declaracion_lista returns [Evaluator e] : 'list' nom= NOMBRE PC ;
    public final Evaluator declaracion_lista() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:143:3: ( 'list' nom= NOMBRE PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:145:3: 'list' nom= NOMBRE PC
            {
            match(input,41,FOLLOW_41_in_declaracion_lista604); 

            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista608); 


                                              if(bandera)
                                                {
                                                   // System.out.println("intento salvar");
                                                    e = new DeclaracionEvaluator((nom!=null?nom.getText():null),new ListEvaluator());   
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_declaracion_lista681); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:157:3: push returns [Evaluator e] : nom= NOMBRE '.push(' exp= expression ')' PC ;
    public final Evaluator push() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator exp =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:158:3: (nom= NOMBRE '.push(' exp= expression ')' PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:159:3: nom= NOMBRE '.push(' exp= expression ')' PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push708); 

            match(input,34,FOLLOW_34_in_push710); 

            pushFollow(FOLLOW_expression_in_push716);
            exp=expression();

            state._fsp--;


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push718); 


                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar");
                                                    e = new PushEvaluator((nom!=null?nom.getText():null),exp);
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_push788); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:172:3: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
    public final Evaluator asignacion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:173:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:174:4: nom= NOMBRE ASIGNACION ev= evaluator PC
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion822); 

            match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion824); 

            pushFollow(FOLLOW_evaluator_in_asignacion830);
            ev=evaluator();

            state._fsp--;



                                              if(bandera)
                                                {
                                                    //System.out.println("intento salvar erradamente");
                                                    e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);    
                                                
                                                    
                                                }
                                             

            match(input,PC,FOLLOW_PC_in_asignacion870); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:187:1: comentario : COMENTARIO ;
    public final void comentario() throws RecognitionException {
        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:188:3: ( COMENTARIO )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:189:3: COMENTARIO
            {
            match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario886); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:192:1: lectura returns [Evaluator e] : r= READ n= NOMBRE PC ;
    public final Evaluator lectura() throws RecognitionException {
        Evaluator e = null;


        Token r=null;
        Token n=null;

        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:193:3: (r= READ n= NOMBRE PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:194:3: r= READ n= NOMBRE PC
            {
            r=(Token)match(input,READ,FOLLOW_READ_in_lectura907); 

            n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura911); 


                              if(bandera)
                                { 
                                    //System.out.println("estoy leyendo");
                                    e = new ReadEvaluator(pila, (n!=null?n.getText():null));
                                }
                              

            match(input,PC,FOLLOW_PC_in_lectura958); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:206:1: print1 returns [Evaluator e] : PRINT evaluator PC ;
    public final Evaluator print1() throws RecognitionException {
        Evaluator e = null;


        Evaluator evaluator11 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:207:3: ( PRINT evaluator PC )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:208:3: PRINT evaluator PC
            {
            match(input,PRINT,FOLLOW_PRINT_in_print1977); 

            pushFollow(FOLLOW_evaluator_in_print1979);
            evaluator11=evaluator();

            state._fsp--;



                              if(bandera)
                              	{
                              	  
                              	  //aca esta el problema del while pasa el evaluator cuando no existe en el mapa todabia
                              		e = new PrintEvaluator(evaluator11); 
                              		//System.out.println("Paso "+e);
                              	}
                             

            match(input,PC,FOLLOW_PC_in_print11007); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:222:1: evaluator returns [Evaluator e] : logico ;
    public final Evaluator evaluator() throws RecognitionException {
        Evaluator e = null;


        Evaluator logico12 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:223:3: ( logico )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:224:3: logico
            {
            pushFollow(FOLLOW_logico_in_evaluator1026);
            logico12=logico();

            state._fsp--;



                     e = logico12;
                    

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:230:1: term returns [Evaluator e] : (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE '.get(' num= add ')' );
    public final Evaluator term() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Token NOMBRE13=null;
        Token NUMERO14=null;
        Token DOBLE15=null;
        Token TEXTO16=null;
        Evaluator lla =null;

        Evaluator num =null;

        Evaluator add17 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:231:3: (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE '.get(' num= add ')' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case NOMBRE:
                {
                switch ( input.LA(2) ) {
                case 33:
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
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 44:
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
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:233:3: lla= llamadofuncion
                    {

                       e = new IntEvaluator(0);
                      

                    pushFollow(FOLLOW_llamadofuncion_in_term1068);
                    lla=llamadofuncion();

                    state._fsp--;



                             //System.out.println("entiendo que es un llamado"); 
                              //e = lla;
                              e = new RetornoFuncionEvaluator(lla);
                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:242:5: NOMBRE
                    {
                    NOMBRE13=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1084); 

                      
                           // System.out.println("entiendo que es un llamado");
                             if(bandera){  
                             	  e = new TermEvaluator(((NOMBRE13!=null?NOMBRE13.getText():null)));//((pila.peek().get((NOMBRE13!=null?NOMBRE13.getText():null)))); 
                             	}
                            

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:249:5: NUMERO
                    {
                    NUMERO14=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term1102); 


                               e = new DoubleEvaluator(Double.parseDouble((NUMERO14!=null?NUMERO14.getText():null)));
                              

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:253:6: DOBLE
                    {
                    DOBLE15=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term1122); 


                               e = new DoubleEvaluator(Double.parseDouble((DOBLE15!=null?DOBLE15.getText():null)));
                              

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:258:5: TEXTO
                    {
                    TEXTO16=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term1156); 


                              e = new StringEvaluator(((TEXTO16!=null?TEXTO16.getText():null)));
                             

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:263:5: '(' add ')'
                    {
                    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term1177); 

                    pushFollow(FOLLOW_add_in_term1179);
                    add17=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1181); 


                                           e = add17;
                                          

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:267:6: nom= NOMBRE '.get(' num= add ')'
                    {
                    nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1215); 

                    match(input,33,FOLLOW_33_in_term1217); 

                    pushFollow(FOLLOW_add_in_term1223);
                    num=add();

                    state._fsp--;


                    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1225); 


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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:273:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws RecognitionException {
        Evaluator e = null;


        Evaluator term18 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:274:3: ( ( '+' | '-' )* term )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:276:3: ( '+' | '-' )* term
            {

               boolean positive = true;
              

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:279:3: ( '+' | '-' )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30) ) {
                    alt6=1;
                }
                else if ( (LA6_0==32) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:280:5: '+'
            	    {
            	    match(input,30,FOLLOW_30_in_unary1269); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:281:7: '-'
            	    {
            	    match(input,32,FOLLOW_32_in_unary1277); 


            	              positive = !positive;
            	             

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unary1298);
            term18=term();

            state._fsp--;



                   e = term18; 
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:294:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary )* ;
    public final Evaluator mult() throws RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:295:3: (op1= unary ( '*' op2= unary | '/' op2= unary )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:296:3: op1= unary ( '*' op2= unary | '/' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult1328);
            op1=unary();

            state._fsp--;



                        e = op1;
                       

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:300:3: ( '*' op2= unary | '/' op2= unary )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }
                else if ( (LA7_0==35) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:301:5: '*' op2= unary
            	    {
            	    match(input,29,FOLLOW_29_in_mult1352); 

            	    pushFollow(FOLLOW_unary_in_mult1356);
            	    op2=unary();

            	    state._fsp--;



            	                      e = new TimesEvaluator(e,op2);
            	                     

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:305:7: '/' op2= unary
            	    {
            	    match(input,35,FOLLOW_35_in_mult1384); 

            	    pushFollow(FOLLOW_unary_in_mult1388);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:312:1: add returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
    public final Evaluator add() throws RecognitionException {
        Evaluator e = null;


        Evaluator op1 =null;

        Evaluator op2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:313:3: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:314:3: op1= mult ( '+' op2= mult | '-' op2= mult )*
            {
            pushFollow(FOLLOW_mult_in_add1436);
            op1=mult();

            state._fsp--;



                       e = op1;
                      

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:318:3: ( '+' op2= mult | '-' op2= mult )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }
                else if ( (LA8_0==32) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:319:5: '+' op2= mult
            	    {
            	    match(input,30,FOLLOW_30_in_add1459); 

            	    pushFollow(FOLLOW_mult_in_add1463);
            	    op2=mult();

            	    state._fsp--;


            	      
            	                     e = new PlusEvaluator(e, op2);
            	                    

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:323:7: '-' op2= mult
            	    {
            	    match(input,32,FOLLOW_32_in_add1490); 

            	    pushFollow(FOLLOW_mult_in_add1494);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:330:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
    public final Evaluator relation() throws RecognitionException {
        Evaluator e = null;


        Evaluator ex1 =null;

        Evaluator ex2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:331:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:332:3: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            {
            pushFollow(FOLLOW_add_in_relation1543);
            ex1=add();

            state._fsp--;



                             e = ex1;
                            

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:336:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27||(LA10_0 >= 36 && LA10_0 <= 40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:337:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    {
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:337:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
            	    int alt9=6;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt9=5;
            	        }
            	        break;
            	    case 40:
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
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:338:7: '==' ex2= add
            	            {
            	            match(input,38,FOLLOW_38_in_relation1580); 

            	            pushFollow(FOLLOW_add_in_relation1584);
            	            ex2=add();

            	            state._fsp--;



            	                                      e = new IgualIgualEvaluator(e,ex2);
            	                                     

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:342:9: '>' ex2= add
            	            {
            	            match(input,39,FOLLOW_39_in_relation1622); 

            	            pushFollow(FOLLOW_add_in_relation1626);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MayorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:346:9: '<' ex2= add
            	            {
            	            match(input,36,FOLLOW_36_in_relation1665); 

            	            pushFollow(FOLLOW_add_in_relation1669);
            	            ex2=add();

            	            state._fsp--;



            	                                       e = new MenorEvaluator(e,ex2);
            	                                      

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:350:9: '!=' ex2= add
            	            {
            	            match(input,27,FOLLOW_27_in_relation1708); 

            	            pushFollow(FOLLOW_add_in_relation1712);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new DiferenteEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:354:9: '<=' ex2= add
            	            {
            	            match(input,37,FOLLOW_37_in_relation1752); 

            	            pushFollow(FOLLOW_add_in_relation1756);
            	            ex2=add();

            	            state._fsp--;



            	                                        e = new MenorIgualEvaluator(e,ex2);
            	                                       

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:358:9: '>=' ex2= add
            	            {
            	            match(input,40,FOLLOW_40_in_relation1796); 

            	            pushFollow(FOLLOW_add_in_relation1800);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:366:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
    public final Evaluator logico() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel1 =null;

        Evaluator rel2 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:367:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:368:3: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
            {
            pushFollow(FOLLOW_relation_in_logico1863);
            rel1=relation();

            state._fsp--;



                            e = rel1;
                           

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:372:3: ( '&&' rel2= relation | '||' rel2= relation )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }
                else if ( (LA11_0==44) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:373:5: '&&' rel2= relation
            	    {
            	    match(input,28,FOLLOW_28_in_logico1891); 

            	    pushFollow(FOLLOW_relation_in_logico1895);
            	    rel2=relation();

            	    state._fsp--;



            	                           e = new AndEvaluator(e,rel2);
            	                          

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:377:7: '||' rel2= relation
            	    {
            	    match(input,44,FOLLOW_44_in_logico1928); 

            	    pushFollow(FOLLOW_relation_in_logico1932);
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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:384:3: expression returns [Evaluator e] : logico ;
    public final Evaluator expression() throws RecognitionException {
        Evaluator e = null;


        Evaluator logico19 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:385:5: ( logico )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:385:9: logico
            {
            pushFollow(FOLLOW_logico_in_expression1987);
            logico19=logico();

            state._fsp--;


             e = logico19; 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:389:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' ;
    public final Evaluator llamadofuncion() throws RecognitionException {
        Evaluator e = null;


        Token nom=null;
        Evaluator ev =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:389:36: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:390:3: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')'
            {
            nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2011); 

            e = funciones.get((nom!=null?nom.getText():null));

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2016); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:392:4: ( (ev= term ) ( ',' ev= term )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DOBLE||(LA13_0 >= NOMBRE && LA13_0 <= NUMERO)||LA13_0==PARENTESIS_I||LA13_0==TEXTO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:392:6: (ev= term ) ( ',' ev= term )*
                    {
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:392:6: (ev= term )
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:392:7: ev= term
                    {
                    pushFollow(FOLLOW_term_in_llamadofuncion2028);
                    ev=term();

                    state._fsp--;


                    ((FuncionEvaluator) e).llenarParametro(ev);  

                    }


                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:394:6: ( ',' ev= term )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==31) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:394:7: ',' ev= term
                    	    {
                    	    match(input,31,FOLLOW_31_in_llamadofuncion2043); 

                    	    pushFollow(FOLLOW_term_in_llamadofuncion2048);
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


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2062); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:405:1: ifstatements returns [Evaluator e] : ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push );
    public final Evaluator ifstatements() throws RecognitionException {
        Evaluator e = null;


        Evaluator print120 =null;

        Evaluator asignacion21 =null;

        Evaluator lectura22 =null;

        Evaluator return123 =null;

        Evaluator whilestatemet24 =null;

        Evaluator ifstatement25 =null;

        Evaluator declaracion26 =null;

        Evaluator declaracion227 =null;

        Evaluator declaracion_lista28 =null;

        Evaluator push29 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:405:35: ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push )
            int alt14=11;
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
                else if ( (LA14_2==34) ) {
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
            case 42:
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
            case 43:
                {
                int LA14_8 = input.LA(2);

                if ( (LA14_8==NOMBRE) ) {
                    int LA14_12 = input.LA(3);

                    if ( (LA14_12==ASIGNACION) ) {
                        alt14=8;
                    }
                    else if ( (LA14_12==PC) ) {
                        alt14=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 12, input);

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
            case 41:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:407:3: print1
                    {
                    pushFollow(FOLLOW_print1_in_ifstatements2086);
                    print120=print1();

                    state._fsp--;


                    e = print120;

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:408:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_ifstatements2094);
                    asignacion21=asignacion();

                    state._fsp--;


                    e = asignacion21;

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:409:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_ifstatements2101);
                    lectura22=lectura();

                    state._fsp--;


                    e = lectura22;

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:410:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_ifstatements2109);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:411:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_ifstatements2117);
                    return123=return1();

                    state._fsp--;


                    e = return123;

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:412:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_ifstatements2125);
                    whilestatemet24=whilestatemet();

                    state._fsp--;


                    e = whilestatemet24;

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:413:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_ifstatements2133);
                    ifstatement25=ifstatement();

                    state._fsp--;


                    e = ifstatement25;

                    }
                    break;
                case 8 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:414:4: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_ifstatements2141);
                    declaracion26=declaracion();

                    state._fsp--;


                    e = declaracion26;

                    }
                    break;
                case 9 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:415:4: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_ifstatements2147);
                    declaracion227=declaracion2();

                    state._fsp--;


                    e = declaracion227;

                    }
                    break;
                case 10 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:416:4: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_ifstatements2155);
                    declaracion_lista28=declaracion_lista();

                    state._fsp--;


                    declaracion_lista28.evaluate(pila);

                    }
                    break;
                case 11 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:417:4: push
                    {
                    pushFollow(FOLLOW_push_in_ifstatements2161);
                    push29=push();

                    state._fsp--;


                     e = push29; 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:423:1: elsestataments returns [Evaluator e] : ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push );
    public final Evaluator elsestataments() throws RecognitionException {
        Evaluator e = null;


        Evaluator print130 =null;

        Evaluator asignacion31 =null;

        Evaluator lectura32 =null;

        Evaluator return133 =null;

        Evaluator whilestatemet34 =null;

        Evaluator ifstatement35 =null;

        Evaluator declaracion36 =null;

        Evaluator declaracion237 =null;

        Evaluator declaracion_lista38 =null;

        Evaluator push39 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:423:37: ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push )
            int alt15=11;
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
                else if ( (LA15_2==34) ) {
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
            case 42:
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
            case 43:
                {
                int LA15_8 = input.LA(2);

                if ( (LA15_8==NOMBRE) ) {
                    int LA15_12 = input.LA(3);

                    if ( (LA15_12==ASIGNACION) ) {
                        alt15=8;
                    }
                    else if ( (LA15_12==PC) ) {
                        alt15=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 12, input);

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
            case 41:
                {
                alt15=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:425:1: print1
                    {
                    pushFollow(FOLLOW_print1_in_elsestataments2187);
                    print130=print1();

                    state._fsp--;


                    e = print130;

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:426:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_elsestataments2195);
                    asignacion31=asignacion();

                    state._fsp--;


                    e = asignacion31;

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:427:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_elsestataments2202);
                    lectura32=lectura();

                    state._fsp--;


                    e = lectura32;

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:428:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_elsestataments2210);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:429:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_elsestataments2218);
                    return133=return1();

                    state._fsp--;


                    e = return133;

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:430:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_elsestataments2226);
                    whilestatemet34=whilestatemet();

                    state._fsp--;


                    e = whilestatemet34;

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:431:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_elsestataments2234);
                    ifstatement35=ifstatement();

                    state._fsp--;


                    e = ifstatement35;

                    }
                    break;
                case 8 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:432:4: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_elsestataments2242);
                    declaracion36=declaracion();

                    state._fsp--;


                    e = declaracion36;

                    }
                    break;
                case 9 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:433:4: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_elsestataments2248);
                    declaracion237=declaracion2();

                    state._fsp--;


                    e = declaracion237;

                    }
                    break;
                case 10 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:434:4: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_elsestataments2256);
                    declaracion_lista38=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista38; /*declaracion_lista38.evaluate(pila);*/

                    }
                    break;
                case 11 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:435:4: push
                    {
                    pushFollow(FOLLOW_push_in_elsestataments2262);
                    push39=push();

                    state._fsp--;


                     e = push39; 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:441:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* ;
    public final Evaluator ifstatement() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator ifs =null;

        Evaluator rel1 =null;

        Evaluator elses =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:441:34: ( IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:443:1: IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            {
            match(input,IF,FOLLOW_IF_in_ifstatement2280); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2282); 

            pushFollow(FOLLOW_logico_in_ifstatement2288);
            rel=logico();

            state._fsp--;



              e = new IfEvaluator ();   
              ((IfEvaluator) e).agregarCondicion(rel);


            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2294); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2296); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:449:2: (ifs= ifstatements )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMENTARIO||LA16_0==IF||LA16_0==NOMBRE||(LA16_0 >= PRINT && LA16_0 <= READ)||LA16_0==WHILE||(LA16_0 >= 41 && LA16_0 <= 43)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:449:3: ifs= ifstatements
            	    {
            	    pushFollow(FOLLOW_ifstatements_in_ifstatement2304);
            	    ifs=ifstatements();

            	    state._fsp--;



            	       ((IfEvaluator) e).agregarCoso(ifs);   
            	      
            	     

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2314); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:457:2: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ELSEIF) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:457:3: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D
            	    {
            	    match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement2323); 

            	    match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement2325); 

            	    pushFollow(FOLLOW_logico_in_ifstatement2329);
            	    rel1=logico();

            	    state._fsp--;



            	     ((IfEvaluator) e).nuevoSegmento();
            	     ((IfEvaluator) e).agregarCondicion(rel1); 


            	    match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement2335); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2337); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:463:2: (ifs= ifstatements )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==COMENTARIO||LA17_0==IF||LA17_0==NOMBRE||(LA17_0 >= PRINT && LA17_0 <= READ)||LA17_0==WHILE||(LA17_0 >= 41 && LA17_0 <= 43)) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:463:3: ifs= ifstatements
            	    	    {
            	    	    pushFollow(FOLLOW_ifstatements_in_ifstatement2344);
            	    	    ifs=ifstatements();

            	    	    state._fsp--;



            	    	       ((IfEvaluator) e).agregarCoso(ifs);   
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2354); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:473:3: ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ELSE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:473:3: ELSE LLAVE_I (elses= elsestataments )* LLAVE_D
            	    {
            	    match(input,ELSE,FOLLOW_ELSE_in_ifstatement2371); 

            	    match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement2374); 

            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:474:9: (elses= elsestataments )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==COMENTARIO||LA19_0==IF||LA19_0==NOMBRE||(LA19_0 >= PRINT && LA19_0 <= READ)||LA19_0==WHILE||(LA19_0 >= 41 && LA19_0 <= 43)) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:475:5: elses= elsestataments
            	    	    {
            	    	    pushFollow(FOLLOW_elsestataments_in_ifstatement2385);
            	    	    elses=elsestataments();

            	    	    state._fsp--;


            	    	        
            	    	       ((IfEvaluator)e).agregarCosoElse(elses);
            	    	     
            	    	     

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);


            	    match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement2393); 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:489:1: whilestatements returns [Evaluator e] : ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push );
    public final Evaluator whilestatements() throws RecognitionException {
        Evaluator e = null;


        Evaluator print140 =null;

        Evaluator asignacion41 =null;

        Evaluator lectura42 =null;

        Evaluator return143 =null;

        Evaluator whilestatemet44 =null;

        Evaluator ifstatement45 =null;

        Evaluator declaracion46 =null;

        Evaluator declaracion247 =null;

        Evaluator declaracion_lista48 =null;

        Evaluator push49 =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:489:38: ( print1 | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push )
            int alt21=11;
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
                else if ( (LA21_2==34) ) {
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
            case 42:
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
            case 43:
                {
                int LA21_8 = input.LA(2);

                if ( (LA21_8==NOMBRE) ) {
                    int LA21_12 = input.LA(3);

                    if ( (LA21_12==ASIGNACION) ) {
                        alt21=8;
                    }
                    else if ( (LA21_12==PC) ) {
                        alt21=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 12, input);

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
            case 41:
                {
                alt21=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:492:3: print1
                    {
                    pushFollow(FOLLOW_print1_in_whilestatements2423);
                    print140=print1();

                    state._fsp--;


                    e = print140;

                    }
                    break;
                case 2 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:493:5: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_whilestatements2431);
                    asignacion41=asignacion();

                    state._fsp--;


                    e = asignacion41;

                    }
                    break;
                case 3 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:494:5: lectura
                    {
                    pushFollow(FOLLOW_lectura_in_whilestatements2438);
                    lectura42=lectura();

                    state._fsp--;


                    e = lectura42;

                    }
                    break;
                case 4 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:495:5: comentario
                    {
                    pushFollow(FOLLOW_comentario_in_whilestatements2446);
                    comentario();

                    state._fsp--;


                    e =null;

                    }
                    break;
                case 5 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:496:5: return1
                    {
                    pushFollow(FOLLOW_return1_in_whilestatements2454);
                    return143=return1();

                    state._fsp--;


                    e = return143;

                    }
                    break;
                case 6 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:497:5: whilestatemet
                    {
                    pushFollow(FOLLOW_whilestatemet_in_whilestatements2462);
                    whilestatemet44=whilestatemet();

                    state._fsp--;


                    e = whilestatemet44;

                    }
                    break;
                case 7 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:498:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_whilestatements2470);
                    ifstatement45=ifstatement();

                    state._fsp--;


                    e = ifstatement45;

                    }
                    break;
                case 8 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:499:4: declaracion
                    {
                    pushFollow(FOLLOW_declaracion_in_whilestatements2478);
                    declaracion46=declaracion();

                    state._fsp--;


                    e = declaracion46;

                    }
                    break;
                case 9 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:500:4: declaracion2
                    {
                    pushFollow(FOLLOW_declaracion2_in_whilestatements2486);
                    declaracion247=declaracion2();

                    state._fsp--;


                    e = declaracion247;

                    }
                    break;
                case 10 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:501:4: declaracion_lista
                    {
                    pushFollow(FOLLOW_declaracion_lista_in_whilestatements2492);
                    declaracion_lista48=declaracion_lista();

                    state._fsp--;


                    e = declaracion_lista48; /*declaracion_lista48.evaluate(pila);*/

                    }
                    break;
                case 11 :
                    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:502:4: push
                    {
                    pushFollow(FOLLOW_push_in_whilestatements2498);
                    push49=push();

                    state._fsp--;


                     e = push49; 

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
    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:507:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
    public final Evaluator whilestatemet() throws RecognitionException {
        Evaluator e = null;


        Evaluator rel =null;

        Evaluator wh =null;


        try {
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:507:36: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:510:1: WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatemet2523); 

            match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet2525); 

            pushFollow(FOLLOW_logico_in_whilestatemet2529);
            rel=logico();

            state._fsp--;



              
              //((WhileEvaluator) e).setCondicion((Boolean)rel.evaluate(pila));  
               e = new WhileEvaluator(rel); 
              
             

            match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet2532); 

            match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet2534); 

            // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:516:2: (wh= whilestatements )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMENTARIO||LA22_0==IF||LA22_0==NOMBRE||(LA22_0 >= PRINT && LA22_0 <= READ)||LA22_0==WHILE||(LA22_0 >= 41 && LA22_0 <= 43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\src\\Lenguaje.g:516:3: wh= whilestatements
            	    {
            	    pushFollow(FOLLOW_whilestatements_in_whilestatemet2542);
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


            match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet2553); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_print1_in_programa67 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_asignacion_in_programa77 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_ifstatement_in_programa86 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_lectura_in_programa95 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_comentario_in_programa104 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_whilestatemet_in_programa112 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_funcion_in_programa121 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_llamadofuncion_in_programa129 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_programa132 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_declaracion_in_programa139 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_declaracion2_in_programa148 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_declaracion_lista_in_programa157 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_push_in_programa167 = new BitSet(new long[]{0x00000A0002611822L});
    public static final BitSet FOLLOW_42_in_return1217 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_evaluator_in_return1223 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_return1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcion264 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion270 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_funcion272 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_43_in_funcion284 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion290 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_funcion307 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_funcion309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOMBRE_in_funcion315 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_funcion333 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LLAVE_I_in_funcion336 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_whilestatements_in_funcion350 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_LLAVE_D_in_funcion362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_declaracion394 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_declaracion400 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_evaluator_in_declaracion406 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_declaracion477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_declaracion2501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion2505 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_declaracion2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_declaracion_lista604 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista608 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_declaracion_lista681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_push708 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_push710 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_expression_in_push716 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_push718 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_push788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_asignacion822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASIGNACION_in_asignacion824 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_evaluator_in_asignacion830 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_asignacion870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_in_comentario886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_lectura907 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOMBRE_in_lectura911 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_lectura958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print1977 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_evaluator_in_print1979 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PC_in_print11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logico_in_evaluator1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_llamadofuncion_in_term1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERO_in_term1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOBLE_in_term1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTO_in_term1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_term1177 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_term1179 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_term1215 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_term1217 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_term1223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_term1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_unary1269 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_32_in_unary1277 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_term_in_unary1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult1328 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_29_in_mult1352 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_unary_in_mult1356 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_35_in_mult1384 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_unary_in_mult1388 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_mult_in_add1436 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_30_in_add1459 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_mult_in_add1463 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_32_in_add1490 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_mult_in_add1494 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_add_in_relation1543 = new BitSet(new long[]{0x000001F008000002L});
    public static final BitSet FOLLOW_38_in_relation1580 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_relation1584 = new BitSet(new long[]{0x000001F008000002L});
    public static final BitSet FOLLOW_39_in_relation1622 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_relation1626 = new BitSet(new long[]{0x000001F008000002L});
    public static final BitSet FOLLOW_36_in_relation1665 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_relation1669 = new BitSet(new long[]{0x000001F008000002L});
    public static final BitSet FOLLOW_27_in_relation1708 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_relation1712 = new BitSet(new long[]{0x000001F008000002L});
    public static final BitSet FOLLOW_37_in_relation1752 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_relation1756 = new BitSet(new long[]{0x000001F008000002L});
    public static final BitSet FOLLOW_40_in_relation1796 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_add_in_relation1800 = new BitSet(new long[]{0x000001F008000002L});
    public static final BitSet FOLLOW_relation_in_logico1863 = new BitSet(new long[]{0x0000100010000002L});
    public static final BitSet FOLLOW_28_in_logico1891 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_relation_in_logico1895 = new BitSet(new long[]{0x0000100010000002L});
    public static final BitSet FOLLOW_44_in_logico1928 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_relation_in_logico1932 = new BitSet(new long[]{0x0000100010000002L});
    public static final BitSet FOLLOW_logico_in_expression1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2011 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2016 = new BitSet(new long[]{0x00000000008F0100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2028 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_llamadofuncion2043 = new BitSet(new long[]{0x00000000008B0100L});
    public static final BitSet FOLLOW_term_in_llamadofuncion2048 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_ifstatements2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_ifstatements2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_ifstatements2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_ifstatements2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_ifstatements2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_ifstatements2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_ifstatements2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_ifstatements2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_ifstatements2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_ifstatements2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_ifstatements2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print1_in_elsestataments2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_elsestataments2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_elsestataments2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_elsestataments2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_elsestataments2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_elsestataments2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_elsestataments2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_elsestataments2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_elsestataments2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_elsestataments2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_elsestataments2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement2280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2282 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2288 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2294 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2296 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2304 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2314 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSEIF_in_ifstatement2323 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement2325 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_logico_in_ifstatement2329 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement2335 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2337 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_ifstatements_in_ifstatement2344 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2354 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement2371 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LLAVE_I_in_ifstatement2374 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_elsestataments_in_ifstatement2385 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_LLAVE_D_in_ifstatement2393 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_print1_in_whilestatements2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asignacion_in_whilestatements2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lectura_in_whilestatements2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_whilestatements2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return1_in_whilestatements2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatemet_in_whilestatements2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_whilestatements2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_in_whilestatements2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion2_in_whilestatements2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracion_lista_in_whilestatements2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_push_in_whilestatements2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestatemet2523 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet2525 = new BitSet(new long[]{0x00000001408B0100L});
    public static final BitSet FOLLOW_logico_in_whilestatemet2529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet2532 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet2534 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_whilestatements_in_whilestatemet2542 = new BitSet(new long[]{0x00000E0002613020L});
    public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet2553 = new BitSet(new long[]{0x0000000000000002L});

}