grammar Lenguaje;

options {
  language = Java;
}

@header {
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
}

@lexer::header {
package co.edu.javeriana.interpreter.antlr;
}

@members {
Context1 contexto = new Context1(); 
boolean bandera = true;
ArrayList<Context1> pila = new ArrayList<Context1>();
public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();

}

// Esta es una regla gramatical. No la utilizaremos todav�a, sino hasta haber visto la materia de gram�ticas
  
programa returns [StringBuilder output]
  :
  
  {
   pila.add(new Context1()); 
   output = new StringBuilder();
  }
  ( 
    print1             {$output.append((String)$print1.e.evaluate(pila));}
    | asignacion       {$asignacion.e.evaluate(pila);}
    | ifstatement      {$output.append((String)$ifstatement.e.evaluate(pila));}
    | lectura          {$lectura.e.evaluate(pila);}
    | comentario
    | whilestatemet    {$output.append((String)$whilestatemet.e.evaluate(pila));}
    | funcion
    | llamadofuncion   {$output.append((String)$llamadofuncion.e.evaluate(pila));} PC
    | declaracion      {$declaracion.e.evaluate(pila);}
    | declaracion2     {$declaracion2.e.evaluate(pila);}
    | declaracion_lista{$declaracion_lista.e.evaluate(pila);}
    | push             {$push.e.evaluate(pila);}
    | forstatemet      {$output.append((String)$forstatemet.e.evaluate(pila));}
    | asignacion_lista {$asignacion_lista.e.evaluate(pila);}

    
  )+ 
  ;
  
  

  
  return1 returns[Evaluator e]    
  :
    'return' te = evaluator {
      $e = new ReturnEvaluator($te.e); 
    }
   PC
  
  ;
  
  
  funcion returns[Evaluator e]
  :
  {$e = new FuncionEvaluator();}  
  FUNCTION nom = NOMBRE '(' 
	
	((
	  'var' nom1 = NOMBRE
	  {
	     ((FuncionEvaluator) $e).aregarParametro($nom1.text);   
	  }
	)
	(
    ',' 'var' nom1 = NOMBRE
    {
       ((FuncionEvaluator) $e).aregarParametro($nom1.text);   
    }
  )*)?
	
	')'
	'{'
	  
	  (wh = whilestatements{
 
     ((FuncionEvaluator) $e).add($wh.e);   
     } 
    )*
	'}'
	{funciones.put($nom.text, $e);}   
;
 
 
 



declaracion returns [Evaluator e] 
  :
  'var' nom=NOMBRE ASIGNACION ev = evaluator 
                                 {
                                  if(bandera)
                                    {
                                  		  //System.out.println("intento salvar");
                                  		  $e = new DeclaracionEvaluator($nom.text,$ev.e);   
                              			
                                  			
                                  	}
                                 }
                                 PC
  ; 
  
  declaracion2 returns [Evaluator e]
  :
  'var' nom=NOMBRE
                                 {
                                  if(bandera)
                                    {
                                       // System.out.println("intento salvar");
                                        $e = new DeclaracionEvaluator($nom.text,new IntEvaluator(0));   
                                    
                                        
                                    }
                                 }
                                 
  PC
  ; 


  declaracion_lista returns [Evaluator e]
  :
  //TODO:(danielserrano) change the list constant for a regex variable.
  'list' nom=NOMBRE
                                 {
                                  if(bandera)
                                    {
                                       // System.out.println("intento salvar");
                                        $e = new DeclaracionEvaluator($nom.text,new ListEvaluator());   
                                    }
                                 }
                                 
  PC
  ; 
  
  push returns [Evaluator e] 
  :
  nom=NOMBRE '.push(' exp = expression ')'
                                 {
                                  if(bandera)
                                    {
                                        //System.out.println("intento salvar");
                                        $e = new PushEvaluator($nom.text,$exp.e);
                                    }
                                 }
                                 PC
  ; 
  
  
  
  asignacion returns [Evaluator e] 
  :
   nom=NOMBRE ASIGNACION ev = evaluator 
                                 {
                                  if(bandera)
                                    {
                                        //System.out.println("intento salvar erradamente");
                                        $e = new AsignacionEvaluator($nom.text,$ev.e);    
                                    
                                        
                                    }
                                 }
  PC
  ; 


  asignacion_lista returns [Evaluator e] 
  :
   nom=NOMBRE '[' num=NUMERO ']' ASIGNACION ev = evaluator 
                                 {
                                  if(bandera)
                                    {
                                        //System.out.println("intento salvar erradamente");
                                        $e = new AsignacionListaEvaluator($nom.text,$ev.e, $num.text);    
                                    
                                        
                                    }
                                 }
  PC
  ; 



comentario
  :
  COMENTARIO
  ;

lectura returns [Evaluator e]
  :
  r=READ n=NOMBRE 
                 {
                  if(bandera)
                    { 
                        //System.out.println("estoy leyendo");
                        $e = new ReadEvaluator(pila, $n.text);
                    }
                  }
                      
  PC
  ;

print1 returns [Evaluator e]
  :
  PRINT evaluator 
                 {
                  if(bandera)
                  	{
                  	  
                  	  //aca esta el problema del while pasa el evaluator cuando no existe en el mapa todabia
                  		$e = new PrintEvaluator($evaluator.e); 
                  		//System.out.println("Paso "+e);
                  	}
                 }
  /*TEXTO{$e = new StringEvaluator($TEXTO.text);} */
  PC
  ;

evaluator returns [Evaluator e]
  :
  logico 
        {
         $e = $logico.e;
        }
  ;

term returns [Evaluator e]
  :
  
  {
   $e = new IntEvaluator(0);
  }
   lla = llamadofuncion
        {
         //System.out.println("entiendo que es un llamado"); 
          //$e = $lla.e;
          $e = new RetornoFuncionEvaluator($lla.e);
        }
  | NOMBRE  
        {  
       // System.out.println("entiendo que es un llamado");
         if(bandera){  
         	  $e = new TermEvaluator(($NOMBRE.text));//((pila.peek().get($NOMBRE.text))); 
         	}
        }
  | NUMERO 
          {
           $e = new DoubleEvaluator(Double.parseDouble($NUMERO.text));
          }
   | DOBLE 
          {
           $e = new DoubleEvaluator(Double.parseDouble($DOBLE.text));
          }    
          
  | TEXTO 
         {
          $e = new StringEvaluator(($TEXTO.text));
         }
  
  | '(' add ')' 
                      {
                       $e = $add.e;
                      }
   | nom=NOMBRE '.get(' num = add ')' 
         {
                $e = new GetEvaluator($nom.text,$num.e);     
         }
  ;

unary returns [Evaluator e]
  :
  
  {
   boolean positive = true;
  }
  (
    '+'
    | '-' 
         {
          positive = !positive;
         }
  )*
  term 
      {
       $e = $term.e; 
         if(!positive)
            $e = new NegationEvaluator($e);
      }
  ;

mult returns [Evaluator e]
  :
  op1=unary 
           {
            $e = $op1.e;
           }
  (
    '*' op2=unary 
                 {
                  $e = new TimesEvaluator($e,$op2.e);
                 }
    | '/' op2=unary 
                   {
                    $e = new DivideEvaluator($e,$op2.e);
                   }
  )*
  ;

add returns [Evaluator e]
  :
  op1=mult 
          {
           $e = $op1.e;
          }
  (
    '+' op2=mult 
                {  
                 $e = new PlusEvaluator($e, $op2.e);
                }
    | '-' op2=mult 
                  {
                   $e = new MinusEvaluator($e, $op2.e);
                  }
  )*
  ;

relation returns [Evaluator e]  
  :
  ex1=add 
                {
                 $e = $ex1.e;
                }
  (
    (
      '==' ex2=add 
                         {
                          $e = new IgualIgualEvaluator($e,$ex2.e);
                         }
      | '>' ex2=add 
                          {
                           $e = new MayorEvaluator($e,$ex2.e);
                          }
      | '<' ex2=add 
                          {
                           $e = new MenorEvaluator($e,$ex2.e);
                          }
      | '!=' ex2=add 
                           {
                            $e = new DiferenteEvaluator($e,$ex2.e);
                           }
      | '<=' ex2=add 
                           {
                            $e = new MenorIgualEvaluator($e,$ex2.e);
                           }
      | '>=' ex2=add 
                           {
                            $e = new MayorIgualEvaluator($e,$ex2.e);
                           }
    )
  )*
  ;

logico returns [Evaluator e] 
  :
  rel1=relation 
               {
                $e = $rel1.e;
               }
  (
    '&&' rel2=relation 
                      {
                       $e = new AndEvaluator($e,$rel2.e);
                      }
    | '||' rel2=relation 
                        {
                         $e = new OrEvaluator($e,$rel2.e);
                        }
  )*
  ;

  expression returns [Evaluator e]
		  :   logico { $e = $logico.e; }
		  ;


llamadofuncion returns[Evaluator e]:
  nom = NOMBRE{$e = funciones.get($nom.text);}
  '('
   ( (ev = term{((FuncionEvaluator) $e).llenarParametro($ev.e);  }
    )
     (','ev = term{((FuncionEvaluator) $e).llenarParametro($ev.e);  }
    )*)?
  ')'
 

; 





ifstatements returns [Evaluator e]:  

  print1 {$e = $print1.e;}//{$print1.e.evaluate(pila);;}     
  | asignacion{$e = $asignacion.e;}//{$asignacion.e.evaluate(pila);}
  | lectura{$e = $lectura.e;} 
  | comentario {$e =null;}
  | return1 {$e = $return1.e;}
  | whilestatemet{$e = $whilestatemet.e;} 
  | ifstatement{$e = $ifstatement.e;}  
  |declaracion{$e = $declaracion.e;}
  |declaracion2{$e = $declaracion2.e;}  
  |declaracion_lista{$declaracion_lista.e.evaluate(pila);}
  |push{ $e = $push.e; }
  |forstatemet{$forstatemet.e.evaluate(pila);}
  |asignacion_lista {$asignacion_lista.e.evaluate(pila);}
   
;  

  
elsestataments returns [Evaluator e]: 

print1 {$e = $print1.e;}//{$print1.e.evaluate(pila);;}     
  | asignacion{$e = $asignacion.e;}//{$asignacion.e.evaluate(pila);}
  | lectura{$e = $lectura.e;} 
  | comentario {$e =null;}
  | return1 {$e = $return1.e;}
  | whilestatemet{$e = $whilestatemet.e;} 
  | ifstatement{$e = $ifstatement.e;}  
  |declaracion{$e = $declaracion.e;}
  |declaracion2{$e = $declaracion2.e;}  
  |declaracion_lista{$e = $declaracion_lista.e; /*$declaracion_lista.e.evaluate(pila);*/}
  |push{ $e = $push.e; }
  |forstatemet{$forstatemet.e.evaluate(pila);}
  |asignacion_lista {$asignacion_lista.e.evaluate(pila);}


;

 
ifstatement returns [Evaluator e]:

IF PARENTESIS_I rel = logico
{
  $e = new IfEvaluator ();   
  ((IfEvaluator) $e).agregarCondicion($rel.e);
}
  PARENTESIS_D LLAVE_I
 (ifs = ifstatements  
 {
   ((IfEvaluator) $e).agregarCoso($ifs.e);   
  
 })*
 LLAVE_D 
 //--------------empieza el elseif----------------------------------
 
 (ELSEIF PARENTESIS_I rel1=logico
{
 ((IfEvaluator) $e).nuevoSegmento();
 ((IfEvaluator) $e).agregarCondicion($rel1.e); 
}
  PARENTESIS_D LLAVE_I
 (ifs= ifstatements  
 {
   ((IfEvaluator) $e).agregarCoso($ifs.e);   
 })*
 LLAVE_D)* 
 
  
 
 
//-----------------Empieza el else----------------------------------------------- 
( ELSE
 LLAVE_I(
    elses = elsestataments
 {    
   ((IfEvaluator)$e).agregarCosoElse($elses.e);
 
 })*
 LLAVE_D
)*  
 

; 




whilestatements returns [Evaluator e]:

  
  print1 {$e = $print1.e;}//{$print1.e.evaluate(pila);;}     
  | asignacion{$e = $asignacion.e;}//{$asignacion.e.evaluate(pila);}
  | lectura{$e = $lectura.e;} 
  | comentario {$e =null;}
  | return1 {$e = $return1.e;}
  | whilestatemet{$e = $whilestatemet.e;} 
  | ifstatement{$e = $ifstatement.e;}  
  |declaracion{$e = $declaracion.e;}  
  |declaracion2{$e = $declaracion2.e;}
  |declaracion_lista{$e = $declaracion_lista.e; /*$declaracion_lista.e.evaluate(pila);*/}
  |push{ $e = $push.e; }
  |forstatemet{$forstatemet.e.evaluate(pila);}

;
       

whilestatemet returns [Evaluator e]:

 
WHILE PARENTESIS_I rel=logico{
  
  //((WhileEvaluator) $e).setCondicion((Boolean)$rel.e.evaluate(pila));  
   $e = new WhileEvaluator($rel.e); 
  
 } PARENTESIS_D LLAVE_I
 (wh = whilestatements{
 
     ((WhileEvaluator) $e).add($wh.e);   
     //System.out.println("coso evaluador while: "+$wh.e);
 }
 
 )*
 
LLAVE_D
;


forstatemet returns [Evaluator e]:

 
FOR PARENTESIS_I decl=declaracion logi=logico PC aumento=add  {
  
  //((WhileEvaluator) $e).setCondicion((Boolean)$rel.e.evaluate(pila));  
   $e = new ForEvaluator($decl.e, $logi.e, $aumento.e);  
  
 } PARENTESIS_D LLAVE_I
 (wh = whilestatements{
 
     ((ForEvaluator) $e).add($wh.e);   
     //System.out.println("coso evaluador while: "+$wh.e);
 }
 
 )*
 
LLAVE_D
;






/*todo lo del if*************************************************/

// Este es un token de prueba. Debes reemplazarlo por todos los tokens del lenguaje

TOKEN
  :
  'hola'
  ;

IF
  :
  'if'
  ;

PC
  :
  ';'
  ;
//COMPARACION: ('==' | '>'|'<'|'!='|'<='|'>=');

/*
FUNCION:
FUNCTION NOMBRE '('  
  
  (
  ('var' NOMBRE)
  (',' 'var' NOMBRE)*)?
  
  ')'
  
;
 */



ASIGNACION
  :
  '='
  ;

WHILE
  :
  'while'
  ;
  
FOR
  :
  'for'
  ;

ELSE
  :
  'else'
  ;

FUNCTION
  :
  'function'
  ;

ELSEIF
  :
  'else if'
  ;

DOBLE
  :
  ( ('0'..'9')+('.') ('0'..'9')+)    
  ;



NUMERO
  :
  ( ('0'..'9')+)
  ;



PARENTESIS_D
  :
  ')'
  ;

PARENTESIS_I
  :
  '('
  ;

LLAVE_D
  :
  '}'
  ;

LLAVE_I
  :
  '{'
  ;

COMILLASD
  :
  '\"'
  ;

COMILLASS
  :
  '\''
  ;

PRINT
  :
  ('print')
  ;

READ
  :
  ('read')
  ;

NOMBRE
  :
  (
    (
      'a'..'z'
      | 'A'..'Z'
    )
    (
      (
        'a'..'z'
        | 'A'..'Z'
      )
      | ('1'..'9')
    )*
  )
  ;
//TEXTO: COMILLASD('a'..'z'|'A'..'Z'|'1'..'9')*COMILLASD;

TEXTO
  :
  COMILLASD (.)* COMILLASD
  ;
//COMENTARIO: '/*'('a'..'z'|'A'..'Z'|'1'..'9'|' ')+'*/';

COMENTARIO
  :
  '/*' (.)+ '*/'
  ;
  

//operaciones
// Este token sirve para omitir todos los espacios y tabulaciones en el texto

// Este token sirve para omitir todos los espacios y tabulaciones en el texto
WS : (' '|'\t')+ {$channel = HIDDEN;};

// Este token sirve para omitir todos los saltos de l�nea en el texto
NEWLINE: '\r'? '\n' {$channel = HIDDEN;};