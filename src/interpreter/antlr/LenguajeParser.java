// $ANTLR 3.5 C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g 2014-08-20 16:26:58

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

@SuppressWarnings("all")
public class LenguajeParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASIGNACION", "COMENTARIO", "COMILLASD", 
		"COMILLASS", "DOBLE", "ELSE", "ELSEIF", "FOR", "FUNCTION", "IF", "LLAVE_D", 
		"LLAVE_I", "NEWLINE", "NOMBRE", "NUMERO", "PARENTESIS_D", "PARENTESIS_I", 
		"PC", "PRINT", "PRINTLN", "READ", "TEXTO", "TOKEN", "WHILE", "WS", "'!='", 
		"'%'", "'&&'", "'()'", "'*'", "'+'", "','", "'-'", "'.get('", "'.push('", 
		"'.set('", "'.size'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'['", 
		"']'", "'list'", "'read('", "'return'", "'var'", "'||'"
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
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
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

	@Override public String[] getTokenNames() { return LenguajeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g"; }


	Context1 contexto = new Context1(); 
	boolean bandera = true;
	ArrayList<Context1> pila = new ArrayList<Context1>();
	public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();




	// $ANTLR start "programa"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:46:1: programa returns [StringBuilder output] : ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size )+ ;
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
		Evaluator lista_texto14 =null;
		Evaluator size15 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:47:3: ( ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size )+ )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:49:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size )+
			{

			   pila.add(new Context1()); 
			   output = new StringBuilder();
			  
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:53:3: ( print1 | println | asignacion | ifstatement | lectura | comentario | whilestatemet | funcion | llamadofuncion | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=18;
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
					case 38:
						{
						alt1=13;
						}
						break;
					case 40:
						{
						alt1=17;
						}
						break;
					case PARENTESIS_I:
						{
						alt1=9;
						}
						break;
					case 39:
					case 47:
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
				case 52:
					{
					int LA1_10 = input.LA(2);
					if ( (LA1_10==NOMBRE) ) {
						int LA1_18 = input.LA(3);
						if ( (LA1_18==ASIGNACION) ) {
							alt1=10;
						}
						else if ( (LA1_18==PC) ) {
							alt1=11;
						}

					}

					}
					break;
				case 49:
					{
					int LA1_11 = input.LA(2);
					if ( (LA1_11==NOMBRE) ) {
						int LA1_19 = input.LA(3);
						if ( (LA1_19==ASIGNACION) ) {
							alt1=16;
						}
						else if ( (LA1_19==PC) ) {
							alt1=12;
						}

					}

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
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:54:7: print1
					{
					pushFollow(FOLLOW_print1_in_programa84);
					print11=print1();
					state._fsp--;

					output.append((String)print11.evaluate(pila));
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:55:7: println
					{
					pushFollow(FOLLOW_println_in_programa104);
					println2=println();
					state._fsp--;

					output.append((String)println2.evaluate(pila));
					}
					break;
				case 3 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:56:7: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_programa123);
					asignacion3=asignacion();
					state._fsp--;

					asignacion3.evaluate(pila);
					}
					break;
				case 4 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:57:7: ifstatement
					{
					pushFollow(FOLLOW_ifstatement_in_programa139);
					ifstatement4=ifstatement();
					state._fsp--;

					output.append((String)ifstatement4.evaluate(pila));
					}
					break;
				case 5 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:58:7: lectura
					{
					pushFollow(FOLLOW_lectura_in_programa154);
					lectura5=lectura();
					state._fsp--;

					lectura5.evaluate(pila);
					}
					break;
				case 6 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:59:7: comentario
					{
					pushFollow(FOLLOW_comentario_in_programa173);
					comentario();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:60:7: whilestatemet
					{
					pushFollow(FOLLOW_whilestatemet_in_programa181);
					whilestatemet6=whilestatemet();
					state._fsp--;

					output.append((String)whilestatemet6.evaluate(pila));
					}
					break;
				case 8 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:61:7: funcion
					{
					pushFollow(FOLLOW_funcion_in_programa194);
					funcion();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:62:7: llamadofuncion
					{
					pushFollow(FOLLOW_llamadofuncion_in_programa202);
					llamadofuncion7=llamadofuncion();
					state._fsp--;

					output.append((String)llamadofuncion7.evaluate(pila));
					}
					break;
				case 10 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:63:7: declaracion
					{
					pushFollow(FOLLOW_declaracion_in_programa214);
					declaracion8=declaracion();
					state._fsp--;

					declaracion8.evaluate(pila);
					}
					break;
				case 11 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:64:7: declaracion2
					{
					pushFollow(FOLLOW_declaracion2_in_programa229);
					declaracion29=declaracion2();
					state._fsp--;

					declaracion29.evaluate(pila);
					}
					break;
				case 12 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:65:7: declaracion_lista
					{
					pushFollow(FOLLOW_declaracion_lista_in_programa243);
					declaracion_lista10=declaracion_lista();
					state._fsp--;

					declaracion_lista10.evaluate(pila);
					}
					break;
				case 13 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:66:7: push
					{
					pushFollow(FOLLOW_push_in_programa252);
					push11=push();
					state._fsp--;

					push11.evaluate(pila);
					}
					break;
				case 14 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:67:7: forstatemet
					{
					pushFollow(FOLLOW_forstatemet_in_programa274);
					forstatemet12=forstatemet();
					state._fsp--;

					output.append((String)forstatemet12.evaluate(pila));
					}
					break;
				case 15 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:68:7: asignacion_lista
					{
					pushFollow(FOLLOW_asignacion_lista_in_programa289);
					asignacion_lista13=asignacion_lista();
					state._fsp--;

					asignacion_lista13.evaluate(pila);
					}
					break;
				case 16 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:69:7: lista_texto
					{
					pushFollow(FOLLOW_lista_texto_in_programa299);
					lista_texto14=lista_texto();
					state._fsp--;

					lista_texto14.evaluate(pila);
					}
					break;
				case 17 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:70:7: size
					{
					pushFollow(FOLLOW_size_in_programa314);
					size15=size();
					state._fsp--;

					size15.evaluate(pila);
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:77:3: return1 returns [Evaluator e] : 'return' te= evaluator PC ;
	public final Evaluator return1() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator te =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:78:3: ( 'return' te= evaluator PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:79:5: 'return' te= evaluator PC
			{
			match(input,51,FOLLOW_51_in_return1362); 
			pushFollow(FOLLOW_evaluator_in_return1368);
			te=evaluator();
			state._fsp--;


			      e = new ReturnEvaluator(te); 
			    
			match(input,PC,FOLLOW_PC_in_return1375); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:87:3: funcion returns [Evaluator e] : FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' ;
	public final Evaluator funcion() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Token nom1=null;
		Evaluator wh =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:88:3: ( FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}' )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:89:3: FUNCTION nom= NOMBRE '(' ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )? ')' '{' (wh= whilestatements )* '}'
			{
			e = new FuncionEvaluator();
			match(input,FUNCTION,FOLLOW_FUNCTION_in_funcion413); 
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion419); 
			match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_funcion421); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:92:2: ( ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==52) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:92:3: ( 'var' nom1= NOMBRE ) ( ',' 'var' nom1= NOMBRE )*
					{
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:92:3: ( 'var' nom1= NOMBRE )
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:93:4: 'var' nom1= NOMBRE
					{
					match(input,52,FOLLOW_52_in_funcion433); 
					nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion439); 

						     ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
						  
					}

					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:98:2: ( ',' 'var' nom1= NOMBRE )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==35) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:99:5: ',' 'var' nom1= NOMBRE
							{
							match(input,35,FOLLOW_35_in_funcion456); 
							match(input,52,FOLLOW_52_in_funcion458); 
							nom1=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_funcion464); 

							       ((FuncionEvaluator) e).aregarParametro((nom1!=null?nom1.getText():null));   
							    
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_funcion482); 
			match(input,LLAVE_I,FOLLOW_LLAVE_I_in_funcion485); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:108:4: (wh= whilestatements )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMENTARIO||LA4_0==FOR||LA4_0==IF||LA4_0==NOMBRE||(LA4_0 >= PRINT && LA4_0 <= READ)||LA4_0==WHILE||LA4_0==49||(LA4_0 >= 51 && LA4_0 <= 52)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:108:5: wh= whilestatements
					{
					pushFollow(FOLLOW_whilestatements_in_funcion499);
					wh=whilestatements();
					state._fsp--;


					 
					     ((FuncionEvaluator) e).add(wh);   
					     
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,LLAVE_D,FOLLOW_LLAVE_D_in_funcion511); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:122:1: declaracion returns [Evaluator e] : 'var' nom= NOMBRE ASIGNACION ev= evaluator PC ;
	public final Evaluator declaracion() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Evaluator ev =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:123:3: ( 'var' nom= NOMBRE ASIGNACION ev= evaluator PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:124:3: 'var' nom= NOMBRE ASIGNACION ev= evaluator PC
			{
			match(input,52,FOLLOW_52_in_declaracion547); 
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion551); 
			match(input,ASIGNACION,FOLLOW_ASIGNACION_in_declaracion553); 
			pushFollow(FOLLOW_evaluator_in_declaracion559);
			ev=evaluator();
			state._fsp--;


			                                  if(bandera)
			                                    {
			                                  		  //System.out.println("intento salvar");
			                                  		  e = new DeclaracionEvaluator((nom!=null?nom.getText():null),ev);   
			                              			
			                                  			
			                                  	}
			                                 
			match(input,PC,FOLLOW_PC_in_declaracion599); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:137:3: declaracion2 returns [Evaluator e] : 'var' nom= NOMBRE PC ;
	public final Evaluator declaracion2() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:138:3: ( 'var' nom= NOMBRE PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:139:3: 'var' nom= NOMBRE PC
			{
			match(input,52,FOLLOW_52_in_declaracion2628); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:154:3: declaracion_lista returns [Evaluator e] : 'list' nom= NOMBRE PC ;
	public final Evaluator declaracion_lista() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:155:3: ( 'list' nom= NOMBRE PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:157:3: 'list' nom= NOMBRE PC
			{
			match(input,49,FOLLOW_49_in_declaracion_lista735); 
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_declaracion_lista739); 

			                                  if(bandera)
			                                    {
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



	// $ANTLR start "lista_texto"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:168:5: lista_texto returns [Evaluator e] : 'list' nom= NOMBRE ASIGNACION 'read(' tex= TEXTO ')' PC ;
	public final Evaluator lista_texto() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Token tex=null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:169:3: ( 'list' nom= NOMBRE ASIGNACION 'read(' tex= TEXTO ')' PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:171:3: 'list' nom= NOMBRE ASIGNACION 'read(' tex= TEXTO ')' PC
			{
			match(input,49,FOLLOW_49_in_lista_texto845); 
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lista_texto849); 
			match(input,ASIGNACION,FOLLOW_ASIGNACION_in_lista_texto851); 
			match(input,50,FOLLOW_50_in_lista_texto853); 
			tex=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_lista_texto857); 
			match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_lista_texto859); 

			                                  if(bandera)
			                                    {
			                                        e = new DeclaracionEvaluator((nom!=null?nom.getText():null),(new ListFromTextEvaluator((tex!=null?tex.getText():null))).evaluate(pila));   
			                                    }
			                                 
			match(input,PC,FOLLOW_PC_in_lista_texto932); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:182:3: push returns [Evaluator e] : nom= NOMBRE '.push(' exp= expression ')' PC ;
	public final Evaluator push() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Evaluator exp =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:183:3: (nom= NOMBRE '.push(' exp= expression ')' PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:184:3: nom= NOMBRE '.push(' exp= expression ')' PC
			{
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_push962); 
			match(input,38,FOLLOW_38_in_push964); 
			pushFollow(FOLLOW_expression_in_push970);
			exp=expression();
			state._fsp--;

			match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_push972); 

			                                  if(bandera)
			                                    {
			                                        e = new PushEvaluator((nom!=null?nom.getText():null),exp);
			                                    }
			                                 
			match(input,PC,FOLLOW_PC_in_push1042); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:194:3: size returns [Evaluator e] : nom= NOMBRE '.size' ( '()' )* PC ;
	public final Evaluator size() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:195:3: (nom= NOMBRE '.size' ( '()' )* PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:196:3: nom= NOMBRE '.size' ( '()' )* PC
			{
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_size1072); 
			match(input,40,FOLLOW_40_in_size1074); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:196:22: ( '()' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==32) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:196:23: '()'
					{
					match(input,32,FOLLOW_32_in_size1077); 
					}
					break;

				default :
					break loop5;
				}
			}


			                                  if(bandera)
			                                    {
			                                        e = new SizeEvaluator((nom!=null?nom.getText():null));
			                                    }
			                                 
			match(input,PC,FOLLOW_PC_in_size1149); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:208:3: asignacion returns [Evaluator e] : nom= NOMBRE ASIGNACION ev= evaluator PC ;
	public final Evaluator asignacion() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Evaluator ev =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:209:3: (nom= NOMBRE ASIGNACION ev= evaluator PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:210:4: nom= NOMBRE ASIGNACION ev= evaluator PC
			{
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion1186); 
			match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion1188); 
			pushFollow(FOLLOW_evaluator_in_asignacion1194);
			ev=evaluator();
			state._fsp--;


			                                  if(bandera)
			                                    {
			                                        //System.out.println("intento salvar erradamente");
			                                        e = new AsignacionEvaluator((nom!=null?nom.getText():null),ev);    
			                                    
			                                        
			                                    }
			                                 
			match(input,PC,FOLLOW_PC_in_asignacion1234); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:224:3: asignacion_lista returns [Evaluator e] : nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC ;
	public final Evaluator asignacion_lista() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Token num=null;
		Evaluator ev =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:225:3: (nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:226:4: nom= NOMBRE ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' ) PC
			{
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_asignacion_lista1264); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:227:4: ( '[' num= NUMERO ']' ASIGNACION ev= evaluator | '.set(' num= NUMERO ',' ev= evaluator ')' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==47) ) {
				alt6=1;
			}
			else if ( (LA6_0==39) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:227:7: '[' num= NUMERO ']' ASIGNACION ev= evaluator
					{
					match(input,47,FOLLOW_47_in_asignacion_lista1273); 
					num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1277); 
					match(input,48,FOLLOW_48_in_asignacion_lista1279); 
					match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion_lista1281); 
					pushFollow(FOLLOW_evaluator_in_asignacion_lista1287);
					ev=evaluator();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:228:7: '.set(' num= NUMERO ',' ev= evaluator ')'
					{
					match(input,39,FOLLOW_39_in_asignacion_lista1295); 
					num=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_asignacion_lista1299); 
					match(input,35,FOLLOW_35_in_asignacion_lista1301); 
					pushFollow(FOLLOW_evaluator_in_asignacion_lista1307);
					ev=evaluator();
					state._fsp--;

					match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_asignacion_lista1309); 
					}
					break;

			}


			                                  if(bandera)
			                                    {
			                                        //System.out.println("intento salvar erradamente");
			                                        e = new AsignacionListaEvaluator((nom!=null?nom.getText():null),ev, (num!=null?num.getText():null));
			                                    }
			                                 
			match(input,PC,FOLLOW_PC_in_asignacion_lista1355); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:242:1: comentario : COMENTARIO ;
	public final void comentario() throws RecognitionException {
		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:243:3: ( COMENTARIO )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:244:3: COMENTARIO
			{
			match(input,COMENTARIO,FOLLOW_COMENTARIO_in_comentario1373); 
			}

		}


		catch (RecognitionException er) {
		    throw er; 
		} 


		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comentario"



	// $ANTLR start "lectura"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:247:1: lectura returns [Evaluator e] : r= READ n= NOMBRE PC ;
	public final Evaluator lectura() throws Exception, RecognitionException {
		Evaluator e = null;


		Token r=null;
		Token n=null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:248:3: (r= READ n= NOMBRE PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:249:3: r= READ n= NOMBRE PC
			{
			r=(Token)match(input,READ,FOLLOW_READ_in_lectura1398); 
			n=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_lectura1402); 

			                  if(bandera)
			                    { 
			                        //System.out.println("estoy leyendo");
			                        e = new ReadEvaluator(pila, (n!=null?n.getText():null));
			                    }
			                  
			match(input,PC,FOLLOW_PC_in_lectura1449); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:261:1: print1 returns [Evaluator e] : PRINT (exp= expression ) ( ',' exp= expression )* PC ;
	public final Evaluator print1() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator exp =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:262:3: ( PRINT (exp= expression ) ( ',' exp= expression )* PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:263:3: PRINT (exp= expression ) ( ',' exp= expression )* PC
			{
			 e = new PrintEvaluator(); 
			match(input,PRINT,FOLLOW_PRINT_in_print11478); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:265:3: (exp= expression )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:265:5: exp= expression
			{
			pushFollow(FOLLOW_expression_in_print11489);
			exp=expression();
			state._fsp--;

			 ((PrintEvaluator)e).addEvaluator(exp); 
			}

			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:267:3: ( ',' exp= expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==35) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:267:5: ',' exp= expression
					{
					match(input,35,FOLLOW_35_in_print11501); 
					pushFollow(FOLLOW_expression_in_print11511);
					exp=expression();
					state._fsp--;

					 ((PrintEvaluator)e).addEvaluator(exp); 
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,PC,FOLLOW_PC_in_print11522); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:273:1: println returns [Evaluator e] : PRINTLN (exp= expression ) ( ',' exp= expression )* PC ;
	public final Evaluator println() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator exp =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:274:3: ( PRINTLN (exp= expression ) ( ',' exp= expression )* PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:275:3: PRINTLN (exp= expression ) ( ',' exp= expression )* PC
			{
			 e = new PrintlnEvaluator(); 
			match(input,PRINTLN,FOLLOW_PRINTLN_in_println1551); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:277:3: (exp= expression )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:277:5: exp= expression
			{
			pushFollow(FOLLOW_expression_in_println1561);
			exp=expression();
			state._fsp--;

			 ((PrintlnEvaluator)e).addEvaluator(exp); 
			}

			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:279:3: ( ',' exp= expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==35) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:279:5: ',' exp= expression
					{
					match(input,35,FOLLOW_35_in_println1573); 
					pushFollow(FOLLOW_expression_in_println1583);
					exp=expression();
					state._fsp--;

					 ((PrintlnEvaluator)e).addEvaluator(exp); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,PC,FOLLOW_PC_in_println1594); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:285:1: evaluator returns [Evaluator e] : logico ;
	public final Evaluator evaluator() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator logico16 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:286:3: ( logico )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:287:3: logico
			{
			pushFollow(FOLLOW_logico_in_evaluator1619);
			logico16=logico();
			state._fsp--;


			         e = logico16;
			        
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:293:1: term returns [Evaluator e] : (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE '.size' ( '()' )* );
	public final Evaluator term() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Token NOMBRE17=null;
		Token NUMERO18=null;
		Token DOBLE19=null;
		Token TEXTO20=null;
		Evaluator lla =null;
		Evaluator num =null;
		Evaluator add21 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:294:3: (lla= llamadofuncion | NOMBRE | NUMERO | DOBLE | TEXTO | '(' add ')' |nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' ) |nom= NOMBRE '.size' ( '()' )* )
			int alt11=8;
			switch ( input.LA(1) ) {
			case NOMBRE:
				{
				switch ( input.LA(2) ) {
				case 40:
					{
					alt11=8;
					}
					break;
				case PARENTESIS_I:
					{
					alt11=1;
					}
					break;
				case PARENTESIS_D:
				case PC:
				case 29:
				case 30:
				case 31:
				case 33:
				case 34:
				case 35:
				case 36:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 48:
				case 53:
					{
					alt11=2;
					}
					break;
				case 37:
				case 47:
					{
					alt11=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NUMERO:
				{
				alt11=3;
				}
				break;
			case DOBLE:
				{
				alt11=4;
				}
				break;
			case TEXTO:
				{
				alt11=5;
				}
				break;
			case PARENTESIS_I:
				{
				alt11=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:296:3: lla= llamadofuncion
					{

					   e = new IntEvaluator(0);
					  
					pushFollow(FOLLOW_llamadofuncion_in_term1667);
					lla=llamadofuncion();
					state._fsp--;


					          e = new RetornoFuncionEvaluator(lla);
					        
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:303:5: NOMBRE
					{
					NOMBRE17=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1683); 
					  
					       // System.out.println("entiendo que es un llamado");
					         if(bandera){  
					         	  e = new TermEvaluator(((NOMBRE17!=null?NOMBRE17.getText():null)));//((pila.peek().get((NOMBRE17!=null?NOMBRE17.getText():null)))); 
					         	}
					        
					}
					break;
				case 3 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:310:5: NUMERO
					{
					NUMERO18=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_term1701); 

					           e = new DoubleEvaluator(Double.parseDouble((NUMERO18!=null?NUMERO18.getText():null)));
					          
					}
					break;
				case 4 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:314:5: DOBLE
					{
					DOBLE19=(Token)match(input,DOBLE,FOLLOW_DOBLE_in_term1720); 

					           e = new DoubleEvaluator(Double.parseDouble((DOBLE19!=null?DOBLE19.getText():null)));
					          
					}
					break;
				case 5 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:319:5: TEXTO
					{
					TEXTO20=(Token)match(input,TEXTO,FOLLOW_TEXTO_in_term1754); 

					          e = new StringEvaluator(((TEXTO20!=null?TEXTO20.getText():null)));
					         
					}
					break;
				case 6 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:324:5: '(' add ')'
					{
					match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_term1775); 
					pushFollow(FOLLOW_add_in_term1777);
					add21=add();
					state._fsp--;

					match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1779); 

					                       e = add21;
					                      
					}
					break;
				case 7 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:328:5: nom= NOMBRE ( '.get(' num= add ')' | '[' num= add ']' )
					{
					nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1812); 
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:329:5: ( '.get(' num= add ')' | '[' num= add ']' )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==37) ) {
						alt9=1;
					}
					else if ( (LA9_0==47) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:329:7: '.get(' num= add ')'
							{
							match(input,37,FOLLOW_37_in_term1821); 
							pushFollow(FOLLOW_add_in_term1827);
							num=add();
							state._fsp--;

							match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_term1829); 
							}
							break;
						case 2 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:330:7: '[' num= add ']'
							{
							match(input,47,FOLLOW_47_in_term1837); 
							pushFollow(FOLLOW_add_in_term1847);
							num=add();
							state._fsp--;

							match(input,48,FOLLOW_48_in_term1849); 
							}
							break;

					}


					                e = new GetEvaluator((nom!=null?nom.getText():null),num);     
					         
					}
					break;
				case 8 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:335:5: nom= NOMBRE '.size' ( '()' )*
					{
					nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_term1874); 
					match(input,40,FOLLOW_40_in_term1876); 
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:335:24: ( '()' )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==32) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:335:25: '()'
							{
							match(input,32,FOLLOW_32_in_term1879); 
							}
							break;

						default :
							break loop10;
						}
					}


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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:341:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
	public final Evaluator unary() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator term22 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:342:3: ( ( '+' | '-' )* term )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:344:3: ( '+' | '-' )* term
			{

			   boolean positive = true;
			  
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:347:3: ( '+' | '-' )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==34) ) {
					alt12=1;
				}
				else if ( (LA12_0==36) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:348:7: '+'
					{
					match(input,34,FOLLOW_34_in_unary1933); 
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:349:7: '-'
					{
					match(input,36,FOLLOW_36_in_unary1941); 

					          positive = !positive;
					         
					}
					break;

				default :
					break loop12;
				}
			}

			pushFollow(FOLLOW_term_in_unary1962);
			term22=term();
			state._fsp--;


			       e = term22; 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:362:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* ;
	public final Evaluator mult() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:363:3: (op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )* )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:364:3: op1= unary ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
			{
			pushFollow(FOLLOW_unary_in_mult1996);
			op1=unary();
			state._fsp--;


			            e = op1;
			           
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:368:3: ( '*' op2= unary | '/' op2= unary | '%' op2= unary )*
			loop13:
			while (true) {
				int alt13=4;
				switch ( input.LA(1) ) {
				case 33:
					{
					alt13=1;
					}
					break;
				case 41:
					{
					alt13=2;
					}
					break;
				case 30:
					{
					alt13=3;
					}
					break;
				}
				switch (alt13) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:369:5: '*' op2= unary
					{
					match(input,33,FOLLOW_33_in_mult2020); 
					pushFollow(FOLLOW_unary_in_mult2024);
					op2=unary();
					state._fsp--;


					                  e = new TimesEvaluator(e,op2);
					                 
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:373:7: '/' op2= unary
					{
					match(input,41,FOLLOW_41_in_mult2052); 
					pushFollow(FOLLOW_unary_in_mult2056);
					op2=unary();
					state._fsp--;


					                    e = new DivideEvaluator(e,op2);
					                   
					}
					break;
				case 3 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:377:7: '%' op2= unary
					{
					match(input,30,FOLLOW_30_in_mult2086); 
					pushFollow(FOLLOW_unary_in_mult2090);
					op2=unary();
					state._fsp--;


					                    e = new ModEvaluator(e,op2);
					                   
					}
					break;

				default :
					break loop13;
				}
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
	// $ANTLR end "mult"



	// $ANTLR start "add"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:384:1: add returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
	public final Evaluator add() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator op1 =null;
		Evaluator op2 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:385:3: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:386:3: op1= mult ( '+' op2= mult | '-' op2= mult )*
			{
			pushFollow(FOLLOW_mult_in_add2142);
			op1=mult();
			state._fsp--;


			           e = op1;
			          
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:390:3: ( '+' op2= mult | '-' op2= mult )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==34) ) {
					alt14=1;
				}
				else if ( (LA14_0==36) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:391:5: '+' op2= mult
					{
					match(input,34,FOLLOW_34_in_add2165); 
					pushFollow(FOLLOW_mult_in_add2169);
					op2=mult();
					state._fsp--;

					  
					                 e = new PlusEvaluator(e, op2);
					                
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:395:7: '-' op2= mult
					{
					match(input,36,FOLLOW_36_in_add2196); 
					pushFollow(FOLLOW_mult_in_add2200);
					op2=mult();
					state._fsp--;


					                   e = new MinusEvaluator(e, op2);
					                  
					}
					break;

				default :
					break loop14;
				}
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
	// $ANTLR end "add"



	// $ANTLR start "relation"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:402:1: relation returns [Evaluator e] : ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* ;
	public final Evaluator relation() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator ex1 =null;
		Evaluator ex2 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:403:3: (ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )* )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:404:3: ex1= add ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
			{
			pushFollow(FOLLOW_add_in_relation2251);
			ex1=add();
			state._fsp--;


			                 e = ex1;
			                
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:408:3: ( ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==29||(LA16_0 >= 42 && LA16_0 <= 46)) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:409:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
					{
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:409:5: ( '==' ex2= add | '>' ex2= add | '<' ex2= add | '!=' ex2= add | '<=' ex2= add | '>=' ex2= add )
					int alt15=6;
					switch ( input.LA(1) ) {
					case 44:
						{
						alt15=1;
						}
						break;
					case 45:
						{
						alt15=2;
						}
						break;
					case 42:
						{
						alt15=3;
						}
						break;
					case 29:
						{
						alt15=4;
						}
						break;
					case 43:
						{
						alt15=5;
						}
						break;
					case 46:
						{
						alt15=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:410:7: '==' ex2= add
							{
							match(input,44,FOLLOW_44_in_relation2288); 
							pushFollow(FOLLOW_add_in_relation2292);
							ex2=add();
							state._fsp--;


							                          e = new IgualIgualEvaluator(e,ex2);
							                         
							}
							break;
						case 2 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:414:9: '>' ex2= add
							{
							match(input,45,FOLLOW_45_in_relation2330); 
							pushFollow(FOLLOW_add_in_relation2334);
							ex2=add();
							state._fsp--;


							                           e = new MayorEvaluator(e,ex2);
							                          
							}
							break;
						case 3 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:418:9: '<' ex2= add
							{
							match(input,42,FOLLOW_42_in_relation2373); 
							pushFollow(FOLLOW_add_in_relation2377);
							ex2=add();
							state._fsp--;


							                           e = new MenorEvaluator(e,ex2);
							                          
							}
							break;
						case 4 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:422:9: '!=' ex2= add
							{
							match(input,29,FOLLOW_29_in_relation2416); 
							pushFollow(FOLLOW_add_in_relation2420);
							ex2=add();
							state._fsp--;


							                            e = new DiferenteEvaluator(e,ex2);
							                           
							}
							break;
						case 5 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:426:9: '<=' ex2= add
							{
							match(input,43,FOLLOW_43_in_relation2460); 
							pushFollow(FOLLOW_add_in_relation2464);
							ex2=add();
							state._fsp--;


							                            e = new MenorIgualEvaluator(e,ex2);
							                           
							}
							break;
						case 6 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:430:9: '>=' ex2= add
							{
							match(input,46,FOLLOW_46_in_relation2504); 
							pushFollow(FOLLOW_add_in_relation2508);
							ex2=add();
							state._fsp--;


							                            e = new MayorIgualEvaluator(e,ex2);
							                           
							}
							break;

					}

					}
					break;

				default :
					break loop16;
				}
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
	// $ANTLR end "relation"



	// $ANTLR start "logico"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:438:1: logico returns [Evaluator e] : rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* ;
	public final Evaluator logico() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator rel1 =null;
		Evaluator rel2 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:439:3: (rel1= relation ( '&&' rel2= relation | '||' rel2= relation )* )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:440:3: rel1= relation ( '&&' rel2= relation | '||' rel2= relation )*
			{
			pushFollow(FOLLOW_relation_in_logico2574);
			rel1=relation();
			state._fsp--;


			                e = rel1;
			               
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:444:3: ( '&&' rel2= relation | '||' rel2= relation )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==31) ) {
					alt17=1;
				}
				else if ( (LA17_0==53) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:445:5: '&&' rel2= relation
					{
					match(input,31,FOLLOW_31_in_logico2602); 
					pushFollow(FOLLOW_relation_in_logico2606);
					rel2=relation();
					state._fsp--;


					                       e = new AndEvaluator(e,rel2);
					                      
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:449:7: '||' rel2= relation
					{
					match(input,53,FOLLOW_53_in_logico2639); 
					pushFollow(FOLLOW_relation_in_logico2643);
					rel2=relation();
					state._fsp--;


					                         e = new OrEvaluator(e,rel2);
					                        
					}
					break;

				default :
					break loop17;
				}
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
	// $ANTLR end "logico"



	// $ANTLR start "expression"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:456:3: expression returns [Evaluator e] : logico ;
	public final Evaluator expression() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator logico23 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:457:5: ( logico )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:457:9: logico
			{
			pushFollow(FOLLOW_logico_in_expression2702);
			logico23=logico();
			state._fsp--;

			 e = logico23; 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:461:1: llamadofuncion returns [Evaluator e] : nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC ;
	public final Evaluator llamadofuncion() throws Exception, RecognitionException {
		Evaluator e = null;


		Token nom=null;
		Evaluator ev =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:462:4: (nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:463:9: nom= NOMBRE '(' ( (ev= term ) ( ',' ev= term )* )? ')' PC
			{
			nom=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_llamadofuncion2740); 
			e = funciones.get((nom!=null?nom.getText():null));
			match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_llamadofuncion2745); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:465:4: ( (ev= term ) ( ',' ev= term )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DOBLE||(LA19_0 >= NOMBRE && LA19_0 <= NUMERO)||LA19_0==PARENTESIS_I||LA19_0==TEXTO) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:465:9: (ev= term ) ( ',' ev= term )*
					{
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:465:9: (ev= term )
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:465:10: ev= term
					{
					pushFollow(FOLLOW_term_in_llamadofuncion2760);
					ev=term();
					state._fsp--;

					((FuncionEvaluator) e).llenarParametro(ev); 
					}

					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:467:4: ( ',' ev= term )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==35) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:467:5: ',' ev= term
							{
							match(input,35,FOLLOW_35_in_llamadofuncion2772); 
							pushFollow(FOLLOW_term_in_llamadofuncion2779);
							ev=term();
							state._fsp--;

							((FuncionEvaluator) e).llenarParametro(ev); 
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_llamadofuncion2792); 
			match(input,PC,FOLLOW_PC_in_llamadofuncion2803); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:477:1: ifstatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size );
	public final Evaluator ifstatements() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator print124 =null;
		Evaluator println25 =null;
		Evaluator asignacion26 =null;
		Evaluator lectura27 =null;
		Evaluator return128 =null;
		Evaluator whilestatemet29 =null;
		Evaluator ifstatement30 =null;
		Evaluator declaracion31 =null;
		Evaluator declaracion232 =null;
		Evaluator declaracion_lista33 =null;
		Evaluator push34 =null;
		Evaluator forstatemet35 =null;
		Evaluator asignacion_lista36 =null;
		Evaluator lista_texto37 =null;
		Evaluator size38 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:477:52: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size )
			int alt20=16;
			switch ( input.LA(1) ) {
			case PRINT:
				{
				alt20=1;
				}
				break;
			case PRINTLN:
				{
				alt20=2;
				}
				break;
			case NOMBRE:
				{
				switch ( input.LA(2) ) {
				case ASIGNACION:
					{
					alt20=3;
					}
					break;
				case 38:
					{
					alt20=12;
					}
					break;
				case 40:
					{
					alt20=16;
					}
					break;
				case 39:
				case 47:
					{
					alt20=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case READ:
				{
				alt20=4;
				}
				break;
			case COMENTARIO:
				{
				alt20=5;
				}
				break;
			case 51:
				{
				alt20=6;
				}
				break;
			case WHILE:
				{
				alt20=7;
				}
				break;
			case IF:
				{
				alt20=8;
				}
				break;
			case 52:
				{
				int LA20_9 = input.LA(2);
				if ( (LA20_9==NOMBRE) ) {
					int LA20_16 = input.LA(3);
					if ( (LA20_16==ASIGNACION) ) {
						alt20=9;
					}
					else if ( (LA20_16==PC) ) {
						alt20=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 49:
				{
				int LA20_10 = input.LA(2);
				if ( (LA20_10==NOMBRE) ) {
					int LA20_17 = input.LA(3);
					if ( (LA20_17==ASIGNACION) ) {
						alt20=15;
					}
					else if ( (LA20_17==PC) ) {
						alt20=11;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FOR:
				{
				alt20=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:479:5: print1
					{
					pushFollow(FOLLOW_print1_in_ifstatements2834);
					print124=print1();
					state._fsp--;

					e = print124;
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:480:5: println
					{
					pushFollow(FOLLOW_println_in_ifstatements2842);
					println25=println();
					state._fsp--;

					e = println25;
					}
					break;
				case 3 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:481:5: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_ifstatements2853);
					asignacion26=asignacion();
					state._fsp--;

					e = asignacion26;
					}
					break;
				case 4 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:482:5: lectura
					{
					pushFollow(FOLLOW_lectura_in_ifstatements2860);
					lectura27=lectura();
					state._fsp--;

					e = lectura27;
					}
					break;
				case 5 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:483:5: comentario
					{
					pushFollow(FOLLOW_comentario_in_ifstatements2868);
					comentario();
					state._fsp--;

					e =null;
					}
					break;
				case 6 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:484:5: return1
					{
					pushFollow(FOLLOW_return1_in_ifstatements2876);
					return128=return1();
					state._fsp--;

					e = return128;
					}
					break;
				case 7 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:485:5: whilestatemet
					{
					pushFollow(FOLLOW_whilestatemet_in_ifstatements2884);
					whilestatemet29=whilestatemet();
					state._fsp--;

					e = whilestatemet29;
					}
					break;
				case 8 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:486:5: ifstatement
					{
					pushFollow(FOLLOW_ifstatement_in_ifstatements2892);
					ifstatement30=ifstatement();
					state._fsp--;

					e = ifstatement30;
					}
					break;
				case 9 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:487:5: declaracion
					{
					pushFollow(FOLLOW_declaracion_in_ifstatements2901);
					declaracion31=declaracion();
					state._fsp--;

					e = declaracion31;
					}
					break;
				case 10 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:488:5: declaracion2
					{
					pushFollow(FOLLOW_declaracion2_in_ifstatements2908);
					declaracion232=declaracion2();
					state._fsp--;

					e = declaracion232;
					}
					break;
				case 11 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:489:5: declaracion_lista
					{
					pushFollow(FOLLOW_declaracion_lista_in_ifstatements2917);
					declaracion_lista33=declaracion_lista();
					state._fsp--;

					declaracion_lista33.evaluate(pila);
					}
					break;
				case 12 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:490:5: push
					{
					pushFollow(FOLLOW_push_in_ifstatements2924);
					push34=push();
					state._fsp--;

					 e = push34; 
					}
					break;
				case 13 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:491:5: forstatemet
					{
					pushFollow(FOLLOW_forstatemet_in_ifstatements2931);
					forstatemet35=forstatemet();
					state._fsp--;

					forstatemet35.evaluate(pila);
					}
					break;
				case 14 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:492:5: asignacion_lista
					{
					pushFollow(FOLLOW_asignacion_lista_in_ifstatements2938);
					asignacion_lista36=asignacion_lista();
					state._fsp--;

					asignacion_lista36.evaluate(pila);
					}
					break;
				case 15 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:493:5: lista_texto
					{
					pushFollow(FOLLOW_lista_texto_in_ifstatements2946);
					lista_texto37=lista_texto();
					state._fsp--;

					lista_texto37.evaluate(pila);
					}
					break;
				case 16 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:494:5: size
					{
					pushFollow(FOLLOW_size_in_ifstatements2959);
					size38=size();
					state._fsp--;

					size38.evaluate(pila);
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:499:1: elsestataments returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size );
	public final Evaluator elsestataments() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator print139 =null;
		Evaluator println40 =null;
		Evaluator asignacion41 =null;
		Evaluator lectura42 =null;
		Evaluator return143 =null;
		Evaluator whilestatemet44 =null;
		Evaluator ifstatement45 =null;
		Evaluator declaracion46 =null;
		Evaluator declaracion247 =null;
		Evaluator declaracion_lista48 =null;
		Evaluator push49 =null;
		Evaluator forstatemet50 =null;
		Evaluator asignacion_lista51 =null;
		Evaluator lista_texto52 =null;
		Evaluator size53 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:499:54: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size )
			int alt21=16;
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
				case 38:
					{
					alt21=12;
					}
					break;
				case 40:
					{
					alt21=16;
					}
					break;
				case 39:
				case 47:
					{
					alt21=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
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
			case 51:
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
			case 52:
				{
				int LA21_9 = input.LA(2);
				if ( (LA21_9==NOMBRE) ) {
					int LA21_16 = input.LA(3);
					if ( (LA21_16==ASIGNACION) ) {
						alt21=9;
					}
					else if ( (LA21_16==PC) ) {
						alt21=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 49:
				{
				int LA21_10 = input.LA(2);
				if ( (LA21_10==NOMBRE) ) {
					int LA21_17 = input.LA(3);
					if ( (LA21_17==ASIGNACION) ) {
						alt21=15;
					}
					else if ( (LA21_17==PC) ) {
						alt21=11;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FOR:
				{
				alt21=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:501:5: print1
					{
					pushFollow(FOLLOW_print1_in_elsestataments2997);
					print139=print1();
					state._fsp--;

					e = print139;
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:502:5: println
					{
					pushFollow(FOLLOW_println_in_elsestataments3005);
					println40=println();
					state._fsp--;

					e = println40;
					}
					break;
				case 3 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:503:5: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_elsestataments3014);
					asignacion41=asignacion();
					state._fsp--;

					e = asignacion41;
					}
					break;
				case 4 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:504:5: lectura
					{
					pushFollow(FOLLOW_lectura_in_elsestataments3021);
					lectura42=lectura();
					state._fsp--;

					e = lectura42;
					}
					break;
				case 5 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:505:5: comentario
					{
					pushFollow(FOLLOW_comentario_in_elsestataments3029);
					comentario();
					state._fsp--;

					e =null;
					}
					break;
				case 6 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:506:5: return1
					{
					pushFollow(FOLLOW_return1_in_elsestataments3037);
					return143=return1();
					state._fsp--;

					e = return143;
					}
					break;
				case 7 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:507:5: whilestatemet
					{
					pushFollow(FOLLOW_whilestatemet_in_elsestataments3045);
					whilestatemet44=whilestatemet();
					state._fsp--;

					e = whilestatemet44;
					}
					break;
				case 8 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:508:5: ifstatement
					{
					pushFollow(FOLLOW_ifstatement_in_elsestataments3053);
					ifstatement45=ifstatement();
					state._fsp--;

					e = ifstatement45;
					}
					break;
				case 9 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:509:5: declaracion
					{
					pushFollow(FOLLOW_declaracion_in_elsestataments3062);
					declaracion46=declaracion();
					state._fsp--;

					e = declaracion46;
					}
					break;
				case 10 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:510:5: declaracion2
					{
					pushFollow(FOLLOW_declaracion2_in_elsestataments3069);
					declaracion247=declaracion2();
					state._fsp--;

					e = declaracion247;
					}
					break;
				case 11 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:511:5: declaracion_lista
					{
					pushFollow(FOLLOW_declaracion_lista_in_elsestataments3078);
					declaracion_lista48=declaracion_lista();
					state._fsp--;

					e = declaracion_lista48; /*declaracion_lista48.evaluate(pila);*/
					}
					break;
				case 12 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:512:5: push
					{
					pushFollow(FOLLOW_push_in_elsestataments3085);
					push49=push();
					state._fsp--;

					 e = push49; 
					}
					break;
				case 13 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:513:5: forstatemet
					{
					pushFollow(FOLLOW_forstatemet_in_elsestataments3092);
					forstatemet50=forstatemet();
					state._fsp--;

					forstatemet50.evaluate(pila);
					}
					break;
				case 14 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:514:5: asignacion_lista
					{
					pushFollow(FOLLOW_asignacion_lista_in_elsestataments3099);
					asignacion_lista51=asignacion_lista();
					state._fsp--;

					asignacion_lista51.evaluate(pila);
					}
					break;
				case 15 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:515:5: lista_texto
					{
					pushFollow(FOLLOW_lista_texto_in_elsestataments3107);
					lista_texto52=lista_texto();
					state._fsp--;

					lista_texto52.evaluate(pila);
					}
					break;
				case 16 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:516:5: size
					{
					pushFollow(FOLLOW_size_in_elsestataments3120);
					size53=size();
					state._fsp--;

					size53.evaluate(pila);
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:522:1: ifstatement returns [Evaluator e] : IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* ;
	public final Evaluator ifstatement() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator rel =null;
		Evaluator ifs =null;
		Evaluator rel1 =null;
		Evaluator elses =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:522:51: ( IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )* )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:524:1: IF PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )* ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
			{
			match(input,IF,FOLLOW_IF_in_ifstatement3148); 
			match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3150); 
			pushFollow(FOLLOW_logico_in_ifstatement3156);
			rel=logico();
			state._fsp--;


			  e = new IfEvaluator ();   
			  ((IfEvaluator) e).agregarCondicion(rel);

			match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3162); 
			match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3164); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:530:2: (ifs= ifstatements )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMENTARIO||LA22_0==FOR||LA22_0==IF||LA22_0==NOMBRE||(LA22_0 >= PRINT && LA22_0 <= READ)||LA22_0==WHILE||LA22_0==49||(LA22_0 >= 51 && LA22_0 <= 52)) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:530:3: ifs= ifstatements
					{
					pushFollow(FOLLOW_ifstatements_in_ifstatement3172);
					ifs=ifstatements();
					state._fsp--;


					   ((IfEvaluator) e).agregarCoso(ifs);   
					  
					 
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3182); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:538:2: ( ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==ELSEIF) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:538:3: ELSEIF PARENTESIS_I rel1= logico PARENTESIS_D LLAVE_I (ifs= ifstatements )* LLAVE_D
					{
					match(input,ELSEIF,FOLLOW_ELSEIF_in_ifstatement3191); 
					match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_ifstatement3193); 
					pushFollow(FOLLOW_logico_in_ifstatement3197);
					rel1=logico();
					state._fsp--;


					 ((IfEvaluator) e).nuevoSegmento();
					 ((IfEvaluator) e).agregarCondicion(rel1); 

					match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_ifstatement3203); 
					match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3205); 
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:544:2: (ifs= ifstatements )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==COMENTARIO||LA23_0==FOR||LA23_0==IF||LA23_0==NOMBRE||(LA23_0 >= PRINT && LA23_0 <= READ)||LA23_0==WHILE||LA23_0==49||(LA23_0 >= 51 && LA23_0 <= 52)) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:544:3: ifs= ifstatements
							{
							pushFollow(FOLLOW_ifstatements_in_ifstatement3212);
							ifs=ifstatements();
							state._fsp--;


							   ((IfEvaluator) e).agregarCoso(ifs);   
							 
							}
							break;

						default :
							break loop23;
						}
					}

					match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3222); 
					}
					break;

				default :
					break loop24;
				}
			}

			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:554:3: ( ELSE LLAVE_I (elses= elsestataments )* LLAVE_D )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==ELSE) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:554:3: ELSE LLAVE_I (elses= elsestataments )* LLAVE_D
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifstatement3239); 
					match(input,LLAVE_I,FOLLOW_LLAVE_I_in_ifstatement3242); 
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:555:9: (elses= elsestataments )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COMENTARIO||LA25_0==FOR||LA25_0==IF||LA25_0==NOMBRE||(LA25_0 >= PRINT && LA25_0 <= READ)||LA25_0==WHILE||LA25_0==49||(LA25_0 >= 51 && LA25_0 <= 52)) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:556:5: elses= elsestataments
							{
							pushFollow(FOLLOW_elsestataments_in_ifstatement3253);
							elses=elsestataments();
							state._fsp--;

							    
							   ((IfEvaluator)e).agregarCosoElse(elses);
							 
							 
							}
							break;

						default :
							break loop25;
						}
					}

					match(input,LLAVE_D,FOLLOW_LLAVE_D_in_ifstatement3261); 
					}
					break;

				default :
					break loop26;
				}
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
	// $ANTLR end "ifstatement"



	// $ANTLR start "whilestatements"
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:570:1: whilestatements returns [Evaluator e] : ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size );
	public final Evaluator whilestatements() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator print154 =null;
		Evaluator println55 =null;
		Evaluator asignacion56 =null;
		Evaluator lectura57 =null;
		Evaluator return158 =null;
		Evaluator whilestatemet59 =null;
		Evaluator ifstatement60 =null;
		Evaluator declaracion61 =null;
		Evaluator declaracion262 =null;
		Evaluator declaracion_lista63 =null;
		Evaluator push64 =null;
		Evaluator forstatemet65 =null;
		Evaluator asignacion_lista66 =null;
		Evaluator lista_texto67 =null;
		Evaluator size68 =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:570:55: ( print1 | println | asignacion | lectura | comentario | return1 | whilestatemet | ifstatement | declaracion | declaracion2 | declaracion_lista | push | forstatemet | asignacion_lista | lista_texto | size )
			int alt27=16;
			switch ( input.LA(1) ) {
			case PRINT:
				{
				alt27=1;
				}
				break;
			case PRINTLN:
				{
				alt27=2;
				}
				break;
			case NOMBRE:
				{
				switch ( input.LA(2) ) {
				case ASIGNACION:
					{
					alt27=3;
					}
					break;
				case 38:
					{
					alt27=12;
					}
					break;
				case 40:
					{
					alt27=16;
					}
					break;
				case 39:
				case 47:
					{
					alt27=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case READ:
				{
				alt27=4;
				}
				break;
			case COMENTARIO:
				{
				alt27=5;
				}
				break;
			case 51:
				{
				alt27=6;
				}
				break;
			case WHILE:
				{
				alt27=7;
				}
				break;
			case IF:
				{
				alt27=8;
				}
				break;
			case 52:
				{
				int LA27_9 = input.LA(2);
				if ( (LA27_9==NOMBRE) ) {
					int LA27_16 = input.LA(3);
					if ( (LA27_16==ASIGNACION) ) {
						alt27=9;
					}
					else if ( (LA27_16==PC) ) {
						alt27=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 49:
				{
				int LA27_10 = input.LA(2);
				if ( (LA27_10==NOMBRE) ) {
					int LA27_17 = input.LA(3);
					if ( (LA27_17==ASIGNACION) ) {
						alt27=15;
					}
					else if ( (LA27_17==PC) ) {
						alt27=11;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FOR:
				{
				alt27=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:573:5: print1
					{
					pushFollow(FOLLOW_print1_in_whilestatements3297);
					print154=print1();
					state._fsp--;

					e = print154;
					}
					break;
				case 2 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:574:5: println
					{
					pushFollow(FOLLOW_println_in_whilestatements3305);
					println55=println();
					state._fsp--;

					e = println55;
					}
					break;
				case 3 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:575:5: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_whilestatements3314);
					asignacion56=asignacion();
					state._fsp--;

					e = asignacion56;
					}
					break;
				case 4 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:576:5: lectura
					{
					pushFollow(FOLLOW_lectura_in_whilestatements3321);
					lectura57=lectura();
					state._fsp--;

					e = lectura57;
					}
					break;
				case 5 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:577:5: comentario
					{
					pushFollow(FOLLOW_comentario_in_whilestatements3329);
					comentario();
					state._fsp--;

					e =null;
					}
					break;
				case 6 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:578:5: return1
					{
					pushFollow(FOLLOW_return1_in_whilestatements3337);
					return158=return1();
					state._fsp--;

					e = return158;
					}
					break;
				case 7 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:579:5: whilestatemet
					{
					pushFollow(FOLLOW_whilestatemet_in_whilestatements3345);
					whilestatemet59=whilestatemet();
					state._fsp--;

					e = whilestatemet59;
					}
					break;
				case 8 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:580:5: ifstatement
					{
					pushFollow(FOLLOW_ifstatement_in_whilestatements3353);
					ifstatement60=ifstatement();
					state._fsp--;

					e = ifstatement60;
					}
					break;
				case 9 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:581:5: declaracion
					{
					pushFollow(FOLLOW_declaracion_in_whilestatements3362);
					declaracion61=declaracion();
					state._fsp--;

					e = declaracion61;
					}
					break;
				case 10 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:582:5: declaracion2
					{
					pushFollow(FOLLOW_declaracion2_in_whilestatements3371);
					declaracion262=declaracion2();
					state._fsp--;

					e = declaracion262;
					}
					break;
				case 11 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:583:5: declaracion_lista
					{
					pushFollow(FOLLOW_declaracion_lista_in_whilestatements3378);
					declaracion_lista63=declaracion_lista();
					state._fsp--;

					e = declaracion_lista63; /*declaracion_lista63.evaluate(pila);*/
					}
					break;
				case 12 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:584:5: push
					{
					pushFollow(FOLLOW_push_in_whilestatements3385);
					push64=push();
					state._fsp--;

					 e = push64; 
					}
					break;
				case 13 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:585:5: forstatemet
					{
					pushFollow(FOLLOW_forstatemet_in_whilestatements3392);
					forstatemet65=forstatemet();
					state._fsp--;

					forstatemet65.evaluate(pila);
					}
					break;
				case 14 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:586:5: asignacion_lista
					{
					pushFollow(FOLLOW_asignacion_lista_in_whilestatements3399);
					asignacion_lista66=asignacion_lista();
					state._fsp--;

					asignacion_lista66.evaluate(pila);
					}
					break;
				case 15 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:587:5: lista_texto
					{
					pushFollow(FOLLOW_lista_texto_in_whilestatements3407);
					lista_texto67=lista_texto();
					state._fsp--;

					lista_texto67.evaluate(pila);
					}
					break;
				case 16 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:588:5: size
					{
					pushFollow(FOLLOW_size_in_whilestatements3420);
					size68=size();
					state._fsp--;

					size68.evaluate(pila);
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:593:1: whilestatemet returns [Evaluator e] : WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
	public final Evaluator whilestatemet() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator rel =null;
		Evaluator wh =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:593:53: ( WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:596:1: WHILE PARENTESIS_I rel= logico PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
			{
			match(input,WHILE,FOLLOW_WHILE_in_whilestatemet3455); 
			match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_whilestatemet3457); 
			pushFollow(FOLLOW_logico_in_whilestatemet3461);
			rel=logico();
			state._fsp--;


			  
			  //((WhileEvaluator) e).setCondicion((Boolean)rel.evaluate(pila));  
			   e = new WhileEvaluator(rel); 
			  
			 
			match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_whilestatemet3464); 
			match(input,LLAVE_I,FOLLOW_LLAVE_I_in_whilestatemet3466); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:602:2: (wh= whilestatements )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==COMENTARIO||LA28_0==FOR||LA28_0==IF||LA28_0==NOMBRE||(LA28_0 >= PRINT && LA28_0 <= READ)||LA28_0==WHILE||LA28_0==49||(LA28_0 >= 51 && LA28_0 <= 52)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:602:3: wh= whilestatements
					{
					pushFollow(FOLLOW_whilestatements_in_whilestatemet3474);
					wh=whilestatements();
					state._fsp--;


					 
					     ((WhileEvaluator) e).add(wh);   
					     //System.out.println("coso evaluador while: "+wh);
					 
					}
					break;

				default :
					break loop28;
				}
			}

			match(input,LLAVE_D,FOLLOW_LLAVE_D_in_whilestatemet3485); 
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
	// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:614:1: forstatemet returns [Evaluator e] : FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D ;
	public final Evaluator forstatemet() throws Exception, RecognitionException {
		Evaluator e = null;


		Evaluator decl =null;
		Evaluator logi =null;
		Evaluator aumento =null;
		Evaluator wh =null;

		try {
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:614:51: ( FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D )
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:617:1: FOR PARENTESIS_I decl= declaracion logi= logico PC aumento= add PARENTESIS_D LLAVE_I (wh= whilestatements )* LLAVE_D
			{
			match(input,FOR,FOLLOW_FOR_in_forstatemet3505); 
			match(input,PARENTESIS_I,FOLLOW_PARENTESIS_I_in_forstatemet3507); 
			pushFollow(FOLLOW_declaracion_in_forstatemet3511);
			decl=declaracion();
			state._fsp--;

			pushFollow(FOLLOW_logico_in_forstatemet3515);
			logi=logico();
			state._fsp--;

			match(input,PC,FOLLOW_PC_in_forstatemet3517); 
			pushFollow(FOLLOW_add_in_forstatemet3521);
			aumento=add();
			state._fsp--;


			  
			  //((WhileEvaluator) e).setCondicion((Boolean)$rel.e.evaluate(pila));  
			   e = new ForEvaluator(decl, logi, aumento);  
			  
			 
			match(input,PARENTESIS_D,FOLLOW_PARENTESIS_D_in_forstatemet3526); 
			match(input,LLAVE_I,FOLLOW_LLAVE_I_in_forstatemet3528); 
			// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:623:2: (wh= whilestatements )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMENTARIO||LA29_0==FOR||LA29_0==IF||LA29_0==NOMBRE||(LA29_0 >= PRINT && LA29_0 <= READ)||LA29_0==WHILE||LA29_0==49||(LA29_0 >= 51 && LA29_0 <= 52)) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\alfredo\\Documents\\GitHub\\spanish_programming_language\\target\\classes\\Lenguaje.g:623:3: wh= whilestatements
					{
					pushFollow(FOLLOW_whilestatements_in_forstatemet3536);
					wh=whilestatements();
					state._fsp--;


					 
					     ((ForEvaluator) e).add(wh);   
					     //System.out.println("coso evaluador while: "+wh);
					 
					}
					break;

				default :
					break loop29;
				}
			}

			match(input,LLAVE_D,FOLLOW_LLAVE_D_in_forstatemet3547); 
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



	public static final BitSet FOLLOW_print1_in_programa84 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_println_in_programa104 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_asignacion_in_programa123 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_ifstatement_in_programa139 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_lectura_in_programa154 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_comentario_in_programa173 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_whilestatemet_in_programa181 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_funcion_in_programa194 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_llamadofuncion_in_programa202 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_declaracion_in_programa214 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_declaracion2_in_programa229 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_declaracion_lista_in_programa243 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_push_in_programa252 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_forstatemet_in_programa274 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_asignacion_lista_in_programa289 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_lista_texto_in_programa299 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_size_in_programa314 = new BitSet(new long[]{0x0012000009C23822L});
	public static final BitSet FOLLOW_51_in_return1362 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_evaluator_in_return1368 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_return1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_funcion413 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_funcion419 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARENTESIS_I_in_funcion421 = new BitSet(new long[]{0x0010000000080000L});
	public static final BitSet FOLLOW_52_in_funcion433 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_funcion439 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_35_in_funcion456 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_funcion458 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_funcion464 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_funcion482 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LLAVE_I_in_funcion485 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_whilestatements_in_funcion499 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_LLAVE_D_in_funcion511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_declaracion547 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_declaracion551 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASIGNACION_in_declaracion553 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_evaluator_in_declaracion559 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_declaracion599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_declaracion2628 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_declaracion2632 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_declaracion2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_declaracion_lista735 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_declaracion_lista739 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_declaracion_lista812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_lista_texto845 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_lista_texto849 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASIGNACION_in_lista_texto851 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_lista_texto853 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_TEXTO_in_lista_texto857 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_lista_texto859 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_lista_texto932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_push962 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_push964 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_expression_in_push970 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_push972 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_push1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_size1072 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_size1074 = new BitSet(new long[]{0x0000000100200000L});
	public static final BitSet FOLLOW_32_in_size1077 = new BitSet(new long[]{0x0000000100200000L});
	public static final BitSet FOLLOW_PC_in_size1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_asignacion1186 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASIGNACION_in_asignacion1188 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_evaluator_in_asignacion1194 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_asignacion1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_asignacion_lista1264 = new BitSet(new long[]{0x0000808000000000L});
	public static final BitSet FOLLOW_47_in_asignacion_lista1273 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1277 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_asignacion_lista1279 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASIGNACION_in_asignacion_lista1281 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_evaluator_in_asignacion_lista1287 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_39_in_asignacion_lista1295 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_NUMERO_in_asignacion_lista1299 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_asignacion_lista1301 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_evaluator_in_asignacion_lista1307 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_asignacion_lista1309 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_asignacion_lista1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMENTARIO_in_comentario1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_lectura1398 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_lectura1402 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_lectura1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print11478 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_expression_in_print11489 = new BitSet(new long[]{0x0000000800200000L});
	public static final BitSet FOLLOW_35_in_print11501 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_expression_in_print11511 = new BitSet(new long[]{0x0000000800200000L});
	public static final BitSet FOLLOW_PC_in_print11522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_println1551 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_expression_in_println1561 = new BitSet(new long[]{0x0000000800200000L});
	public static final BitSet FOLLOW_35_in_println1573 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_expression_in_println1583 = new BitSet(new long[]{0x0000000800200000L});
	public static final BitSet FOLLOW_PC_in_println1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logico_in_evaluator1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_llamadofuncion_in_term1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_term1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_term1701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOBLE_in_term1720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTO_in_term1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTESIS_I_in_term1775 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_term1777 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_term1779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_term1812 = new BitSet(new long[]{0x0000802000000000L});
	public static final BitSet FOLLOW_37_in_term1821 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_term1827 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_term1829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_term1837 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_term1847 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_term1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_term1874 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_term1876 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_term1879 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_34_in_unary1933 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_36_in_unary1941 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_term_in_unary1962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult1996 = new BitSet(new long[]{0x0000020240000002L});
	public static final BitSet FOLLOW_33_in_mult2020 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_unary_in_mult2024 = new BitSet(new long[]{0x0000020240000002L});
	public static final BitSet FOLLOW_41_in_mult2052 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_unary_in_mult2056 = new BitSet(new long[]{0x0000020240000002L});
	public static final BitSet FOLLOW_30_in_mult2086 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_unary_in_mult2090 = new BitSet(new long[]{0x0000020240000002L});
	public static final BitSet FOLLOW_mult_in_add2142 = new BitSet(new long[]{0x0000001400000002L});
	public static final BitSet FOLLOW_34_in_add2165 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_mult_in_add2169 = new BitSet(new long[]{0x0000001400000002L});
	public static final BitSet FOLLOW_36_in_add2196 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_mult_in_add2200 = new BitSet(new long[]{0x0000001400000002L});
	public static final BitSet FOLLOW_add_in_relation2251 = new BitSet(new long[]{0x00007C0020000002L});
	public static final BitSet FOLLOW_44_in_relation2288 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_relation2292 = new BitSet(new long[]{0x00007C0020000002L});
	public static final BitSet FOLLOW_45_in_relation2330 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_relation2334 = new BitSet(new long[]{0x00007C0020000002L});
	public static final BitSet FOLLOW_42_in_relation2373 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_relation2377 = new BitSet(new long[]{0x00007C0020000002L});
	public static final BitSet FOLLOW_29_in_relation2416 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_relation2420 = new BitSet(new long[]{0x00007C0020000002L});
	public static final BitSet FOLLOW_43_in_relation2460 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_relation2464 = new BitSet(new long[]{0x00007C0020000002L});
	public static final BitSet FOLLOW_46_in_relation2504 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_relation2508 = new BitSet(new long[]{0x00007C0020000002L});
	public static final BitSet FOLLOW_relation_in_logico2574 = new BitSet(new long[]{0x0020000080000002L});
	public static final BitSet FOLLOW_31_in_logico2602 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_relation_in_logico2606 = new BitSet(new long[]{0x0020000080000002L});
	public static final BitSet FOLLOW_53_in_logico2639 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_relation_in_logico2643 = new BitSet(new long[]{0x0020000080000002L});
	public static final BitSet FOLLOW_logico_in_expression2702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_llamadofuncion2740 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARENTESIS_I_in_llamadofuncion2745 = new BitSet(new long[]{0x00000000021E0100L});
	public static final BitSet FOLLOW_term_in_llamadofuncion2760 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_35_in_llamadofuncion2772 = new BitSet(new long[]{0x0000000002160100L});
	public static final BitSet FOLLOW_term_in_llamadofuncion2779 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_llamadofuncion2792 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_llamadofuncion2803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print1_in_ifstatements2834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_ifstatements2842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_in_ifstatements2853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lectura_in_ifstatements2860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentario_in_ifstatements2868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return1_in_ifstatements2876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestatemet_in_ifstatements2884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstatement_in_ifstatements2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion_in_ifstatements2901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion2_in_ifstatements2908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion_lista_in_ifstatements2917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_push_in_ifstatements2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstatemet_in_ifstatements2931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_lista_in_ifstatements2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lista_texto_in_ifstatements2946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_size_in_ifstatements2959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print1_in_elsestataments2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_elsestataments3005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_in_elsestataments3014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lectura_in_elsestataments3021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentario_in_elsestataments3029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return1_in_elsestataments3037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestatemet_in_elsestataments3045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstatement_in_elsestataments3053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion_in_elsestataments3062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion2_in_elsestataments3069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion_lista_in_elsestataments3078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_push_in_elsestataments3085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstatemet_in_elsestataments3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_lista_in_elsestataments3099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lista_texto_in_elsestataments3107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_size_in_elsestataments3120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifstatement3148 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3150 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_logico_in_ifstatement3156 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3162 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3164 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_ifstatements_in_ifstatement3172 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3182 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ELSEIF_in_ifstatement3191 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARENTESIS_I_in_ifstatement3193 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_logico_in_ifstatement3197 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_ifstatement3203 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3205 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_ifstatements_in_ifstatement3212 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3222 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ELSE_in_ifstatement3239 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LLAVE_I_in_ifstatement3242 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_elsestataments_in_ifstatement3253 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_LLAVE_D_in_ifstatement3261 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_print1_in_whilestatements3297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_whilestatements3305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_in_whilestatements3314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lectura_in_whilestatements3321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentario_in_whilestatements3329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return1_in_whilestatements3337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestatemet_in_whilestatements3345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstatement_in_whilestatements3353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion_in_whilestatements3362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion2_in_whilestatements3371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracion_lista_in_whilestatements3378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_push_in_whilestatements3385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstatemet_in_whilestatements3392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_lista_in_whilestatements3399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lista_texto_in_whilestatements3407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_size_in_whilestatements3420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whilestatemet3455 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARENTESIS_I_in_whilestatemet3457 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_logico_in_whilestatemet3461 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_whilestatemet3464 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LLAVE_I_in_whilestatemet3466 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_whilestatements_in_whilestatemet3474 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_LLAVE_D_in_whilestatemet3485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forstatemet3505 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARENTESIS_I_in_forstatemet3507 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_declaracion_in_forstatemet3511 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_logico_in_forstatemet3515 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_PC_in_forstatemet3517 = new BitSet(new long[]{0x0000001402160100L});
	public static final BitSet FOLLOW_add_in_forstatemet3521 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PARENTESIS_D_in_forstatemet3526 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LLAVE_I_in_forstatemet3528 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_whilestatements_in_forstatemet3536 = new BitSet(new long[]{0x001A000009C26820L});
	public static final BitSet FOLLOW_LLAVE_D_in_forstatemet3547 = new BitSet(new long[]{0x0000000000000002L});
}
