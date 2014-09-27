grammar Lenguaje;

options {
  language = Java;
}

@header {
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
}

@rulecatch {

catch (RecognitionException er) {
    throw er; 
} 

}

@lexer::header {
package interpreter.antlr;
}

@members {
Context1 contexto = new Context1(); 
boolean bandera = true;
ArrayList<Context1> pila = new ArrayList<Context1>();
public HashMap<String, Evaluator> funciones = new HashMap<String, Evaluator>();

} 




programa returns [StringBuilder output] throws Exception 
  :
  
  { 
   pila.add(new Context1()); 
   output = new StringBuilder();
  }
  PC*
  ( 
     
      print1           {$output.append((String)$print1.e.evaluate(pila));}
    | println          {$output.append((String)$println.e.evaluate(pila));}
    | asignacion       {$asignacion.e.evaluate(pila);}
    | ifstatement      {$output.append((String)$ifstatement.e.evaluate(pila));}
    | lectura          {$lectura.e.evaluate(pila);}
    | comentario
    | whilestatemet    {$output.append((String)$whilestatemet.e.evaluate(pila));}
    | funcion
    | llamadofuncion   {$output.append((String)$llamadofuncion.e.evaluate(pila));}
    | declaracion      {$declaracion.e.evaluate(pila);}
    //| declaracion2     {$declaracion2.e.evaluate(pila);}
    | declaracion_lista{$declaracion_lista.e.evaluate(pila);}
    | push             {$push.e.evaluate(pila);}
    | forstatemet      {$output.append((String)$forstatemet.e.evaluate(pila));}
    | asignacion_lista {$asignacion_lista.e.evaluate(pila);}
    | lista_texto      {$lista_texto.e.evaluate(pila);}
    | size      {$size.e.evaluate(pila);}
    | unincremento      {$unincremento.e.evaluate(pila);}
    | menosunincremento      {$menosunincremento.e.evaluate(pila);}
    | incremento      {$incremento.e.evaluate(pila);}
    | decremento      {$decremento.e.evaluate(pila);}
  )+ 
  ;
  
  

  
  return1 returns[Evaluator e] throws Exception
  :
    RETURN te = evaluator {
      $e = new ReturnEvaluator($te.e); 
    }
   PC
  
  ;
  
  
  funcion returns[Evaluator e] throws Exception
  :
  {$e = new FuncionEvaluator();}  
  FUNCTION nom = NOMBRE parentesis_i 
	
	( (
	  VARIABLE nom1 = NOMBRE
	  {
	     ((FuncionEvaluator) $e).aregarParametro($nom1.text);   
	  }
	)
	(
    ',' VARIABLE nom1 = NOMBRE
    {
       ((FuncionEvaluator) $e).aregarParametro($nom1.text);   
    }
  )*)?
	 
	parentesis_d PC?
	'{' PC?
	  
	  (wh = whilestatements{
 
     ((FuncionEvaluator) $e).add($wh.e);   
     } 
    )*
	'}' PC?
	{funciones.put($nom.text, $e);}    
;
 
 
 



declaracion returns [Evaluator e] throws Exception
  :
  VARIABLE nom=NOMBRE { 
     if(bandera)
      $e = new DeclaracionEvaluator($nom.text,new DoubleEvaluator(0));   
  }
  (ASIGNACION ev = evaluator     
	    {
	     if(bandera)
	      {
	     		  $e = new DeclaracionEvaluator($nom.text,$ev.e);    	
	     	}
	 })?
	 
  PC 
  ; 
  
  unincremento returns [Evaluator e] throws Exception
  :
  nom=NOMBRE '++'{ 
     if(bandera){
        $e = new IncrementoEvaluator($nom.text,new DoubleEvaluator(1));
      }   
  }
  PC 
  ; 
  
   menosunincremento returns [Evaluator e] throws Exception
  :
  nom=NOMBRE '--'{ 
     if(bandera)
      $e = new IncrementoEvaluator($nom.text,new DoubleEvaluator(-1));   
  }
   
  PC 
  ; 
  
  incremento returns [Evaluator e] throws Exception
  :
  nom=NOMBRE '+='ev = evaluator  { 
     if(bandera)
      $e = new IncrementoEvaluator($nom.text,$ev.e);   
  }
   
  PC 
  ;
  
  decremento returns [Evaluator e] throws Exception
  :
  nom=NOMBRE '-='ev = evaluator  { 
     if(bandera)
      $e = new IncrementoEvaluator($nom.text,$ev.e, true);   
  }
   
  PC 
  ; 
  


  declaracion_lista returns [Evaluator e] throws Exception
  :
  //TODO:(danielserrano) change the list constant for a regex variable.
  LIST nom=NOMBRE
                                 {
                                  if(bandera)
                                    {
                                        $e = new DeclaracionEvaluator($nom.text,new ListEvaluator());   
                                    }
                                 }
                                 
  PC
  ; 
  
    lista_texto returns [Evaluator e] throws Exception
  :
  LIST nom=NOMBRE ASIGNACION READ '(' tex=TEXTO ')'
                                 {
                                  if(bandera)
                                    {
                                        $e = new DeclaracionEvaluator($nom.text,(new ListFromTextEvaluator($tex.text)).evaluate(pila));   
                                    }
                                 }
                                 
  PC
  ; 
  
  push returns [Evaluator e] throws Exception
  :
  nom=NOMBRE '.' PUSH '(' exp = expression ')'
                                 {
                                  if(bandera)
                                    {
                                        $e = new PushEvaluator($nom.text,$exp.e);
                                    }
                                 }
                                 PC
  ; 
  
  size returns [Evaluator e] throws Exception
  :
  nom=NOMBRE  size1 ('()')*
                                 {
                                  if(bandera)
                                    {
                                        $e = new SizeEvaluator($nom.text);
                                    }
                                 }
                                 PC
  ; 
  
  
  
  asignacion returns [Evaluator e] throws Exception
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


  asignacion_lista returns [Evaluator e] throws Exception
  :
   nom=NOMBRE 
   (  '[' num=NUMERO ']' ASIGNACION ev = evaluator
   |  SET '(' num=NUMERO ',' ev = evaluator ')'
   )  
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

lectura returns [Evaluator e] throws Exception
  :
  r=READ n=NOMBRE 
                 {
                  if(bandera)
                    { 
                        //System.out.println("estoy leyendo");
                        $e = new ReadEvaluator(pila, $n.text);
                    }
                  }
  (
      ',' exp = expression { 
              if(bandera)
                    { 
                        ((ReadEvaluator)$e).addText($exp.e);
                    }
             
             }
  )?
                      
  PC
  ;

print1 returns [Evaluator e] throws Exception
  :
  { $e = new PrintEvaluator(); }
    PRINT 
  ( exp = expression { ((PrintEvaluator)$e).addEvaluator($exp.e); }
  )
  ( ','
    exp = expression { ((PrintEvaluator)$e).addEvaluator($exp.e); }
  )*
  PC
  ;

println returns [Evaluator e] throws Exception
  :
  { $e = new PrintlnEvaluator(); }
    PRINTLN
  ( exp = expression { ((PrintlnEvaluator)$e).addEvaluator($exp.e); }
  )
  ( ','
    exp = expression { ((PrintlnEvaluator)$e).addEvaluator($exp.e); }
  )*
  PC
  ;
  
evaluator returns [Evaluator e] throws Exception
  :
  logico 
        {
         $e = $logico.e;
        }
  ;

term returns [Evaluator e] throws Exception 
  :

  {
   $e = new IntEvaluator(0);
  }
    lla = llamadofuncion
        {
          $e = new RetornoFuncionEvaluator($lla.e);
        }
  | BOOLEAN 
          {
           System.out.println("entiendo que es un boolean");
           $e = new BooleanEvaluator(($BOOLEAN.text)); 
          }
  | NOMBRE  
        {   
        System.out.println("entiendo que es un llamado");
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
  | nom=NOMBRE 
    ( '.get(' num = add ')'
    | '['     num = add ']'
    )
         {
                $e = new GetEvaluator($nom.text,$num.e);     
         }
  | nom=NOMBRE  size1 ('()')*
            {
                  $e = new SizeEvaluator($nom.text);
            }
  ;

unary returns [Evaluator e] throws Exception
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

mult returns [Evaluator e] throws Exception
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
    | '%' op2=unary 
                   {
                    $e = new ModEvaluator($e,$op2.e);
                   }
  )*
  ;

add returns [Evaluator e] throws Exception
  :
  op1=mult 
          {
           $e = $op1.e;
          }
  (
    ('+' op2=mult 
                {  
                 $e = new PlusEvaluator($e, $op2.e);
                })
    | (minus op2=mult 
                  {
                   $e = new MinusEvaluator($e, $op2.e);
                  })
  )*
  ;

relation returns [Evaluator e] throws Exception
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

logico returns [Evaluator e] throws Exception
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

  expression returns [Evaluator e] throws Exception
		  :   logico { $e = $logico.e; }
		  ;


llamadofuncion returns[Evaluator e] throws Exception
   :
        nom = NOMBRE{$e = funciones.get($nom.text);}
  '('
   (    (ev = term{((FuncionEvaluator) $e).llenarParametro($ev.e); }
   )
   (','  ev = term{((FuncionEvaluator) $e).llenarParametro($ev.e); }
   )*)?
  ')'
         PC
   ; 





ifstatements returns [Evaluator e] throws Exception:  

    print1 {$e = $print1.e;}//{$print1.e.evaluate(pila);;}  
  | println {$e = $println.e;}   
  | asignacion{$e = $asignacion.e;}//{$asignacion.e.evaluate(pila);}
  | lectura{$e = $lectura.e;} 
  | comentario {$e =null;}
  | return1 {$e = $return1.e;}
  | whilestatemet{$e = $whilestatemet.e;} 
  | ifstatement{$e = $ifstatement.e;}  
  | declaracion{$e = $declaracion.e;}
  //| declaracion2{$e = $declaracion2.e;}  
  | declaracion_lista{$e = $declaracion_lista.e;}
  | push{ $e = $push.e; }
  | forstatemet{$e = $forstatemet.e;}
  | asignacion_lista {$e = $asignacion_lista.e;}
  | lista_texto      {$e  = $lista_texto.e;}
  | size      {$e = $size.e;}
  | unincremento      {$e = $unincremento.e;}
  | menosunincremento {$e = $menosunincremento.e;}
  | incremento      {$e = $incremento.e;}
  | decremento      {$e = $decremento.e;}
   
;  

  
elsestataments returns [Evaluator e] throws Exception: 

    print1 {$e = $print1.e;}//{$print1.e.evaluate(pila);;}    
  | println {$e = $println.e;} 
  | asignacion{$e = $asignacion.e;}//{$asignacion.e.evaluate(pila);}
  | lectura{$e = $lectura.e;} 
  | comentario {$e =null;}
  | return1 {$e = $return1.e;}
  | whilestatemet{$e = $whilestatemet.e;} 
  | ifstatement{$e = $ifstatement.e;}  
  | declaracion{$e = $declaracion.e;}
  //| declaracion2{$e = $declaracion2.e;}  
  | declaracion_lista{$e = $declaracion_lista.e;}
  | push{ $e = $push.e; }
  | forstatemet{$e = $forstatemet.e;}
  | asignacion_lista {$e = $asignacion_lista.e;}
  | lista_texto      {$e  = $lista_texto.e;}
  | size      {$e = $size.e;}
  | unincremento      {$e = $unincremento.e;}
  | menosunincremento {$e = $menosunincremento.e;}
  | incremento      {$e = $incremento.e;}
  | decremento      {$e = $decremento.e;}


;

 
ifstatement returns [Evaluator e] throws Exception:

IF PARENTESIS_I rel = logico
{
  $e = new IfEvaluator ();   
  ((IfEvaluator) $e).agregarCondicion($rel.e);
}
  PARENTESIS_D PC? LLAVE_I PC? //El PC es para admitir espacios, si ponen ; lo admitiria.
 (ifs = ifstatements  
 {
   ((IfEvaluator) $e).agregarCoso($ifs.e);   
  
 })*
 LLAVE_D PC?
 //--------------empieza el elseif----------------------------------
 
 (ELSEIF PARENTESIS_I rel1=logico
{
 ((IfEvaluator) $e).nuevoSegmento();
 ((IfEvaluator) $e).agregarCondicion($rel1.e); 
}
  PARENTESIS_D PC? LLAVE_I PC?
 (ifs= ifstatements  
 {
   ((IfEvaluator) $e).agregarCoso($ifs.e);   
 })*
 LLAVE_D PC?)* 
 
  
 
 
//-----------------Empieza el else----------------------------------------------- 
( ELSE PC?
 LLAVE_I PC?(
    elses = elsestataments
 {    
   ((IfEvaluator)$e).agregarCosoElse($elses.e);
 
 })*
 LLAVE_D PC?
)*  
 

;  




whilestatements returns [Evaluator e] throws Exception:

  
    print1 {$e = $print1.e;}//{$print1.e.evaluate(pila);;}    
  | println {$e = $println.e;} 
  | asignacion{$e = $asignacion.e;}//{$asignacion.e.evaluate(pila);}
  | lectura{$e = $lectura.e;} 
  | comentario {$e =null;}
  | return1 {$e = $return1.e;}
  | whilestatemet{$e = $whilestatemet.e;}  
  | ifstatement{$e = $ifstatement.e;}  
  | declaracion{$e = $declaracion.e;}  
  //| declaracion2{$e = $declaracion2.e;} 
  | declaracion_lista{$e = $declaracion_lista.e;}
  | push{ $e = $push.e; }
  | forstatemet{$e = $forstatemet.e;}
  | asignacion_lista {$e = $asignacion_lista.e;}
  | lista_texto      {$e  = $lista_texto.e;}
  | size      {$e = $size.e;}
  | unincremento      {$e = $unincremento.e;}
  | menosunincremento {$e = $menosunincremento.e;}
  | incremento      {$e = $incremento.e;}
  | decremento      {$e = $decremento.e;}

;
       

whilestatemet returns [Evaluator e] throws Exception:

 
WHILE PARENTESIS_I rel=logico{
  
  //((WhileEvaluator) $e).setCondicion((Boolean)$rel.e.evaluate(pila));  
   $e = new WhileEvaluator($rel.e); 
  
 } PARENTESIS_D PC? LLAVE_I PC?
 (wh = whilestatements{
 
     ((WhileEvaluator) $e).add($wh.e);   
     //System.out.println("coso evaluador while: "+$wh.e);
 }
 
 )*
 
LLAVE_D PC?
;


forstatemet returns [Evaluator e] throws Exception:

 
FOR PARENTESIS_I decl=declaracion logi=logico PC aumento=add  {
  
  //((WhileEvaluator) $e).setCondicion((Boolean)$rel.e.evaluate(pila));  
   $e = new ForEvaluator($decl.e, $logi.e, $aumento.e);  
  
 } PARENTESIS_D PC? LLAVE_I PC? 
 (wh = whilestatements{
 
     ((ForEvaluator) $e).add($wh.e);   
     //System.out.println("coso evaluador while: "+$wh.e);
 }
 
 )*
 
LLAVE_D PC?
;






/*todo lo del if*************************************************/

// Este es un token de prueba. Debes reemplazarlo por todos los tokens del lenguaje

TOKEN
  :
  'hola'
  ;





//NEWLINE: '\r'? '\n' ;  
PC
  :
  (';'? '\r'? ('\n')+) | ';' 
  ;
//COMPARACION: ('==' | '>'|'<'|'!='|'<='|'>='); 


COMENTARIO
  :
  (('/*' (.)* '*/') PC?) | (('//' (.)*) PC)  
  ;

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
  'while' | 'mientras'
  ;
  
FOR
  :
  'for' | 'para'
  ;

ELSE
  :
  'else' | 'si_no'
  ;
VARIABLE:
  'var'
  ;
LIST:
   'list' | 'lista'
   ;
FUNCTION
  :
  'function' | 'funcion'
  ;

ELSEIF
  :
  'else if' | 'si_no si'
  ;

DOBLE
  :
  ( ('0'..'9')+('.') ('0'..'9')+)    
  ;



NUMERO
  :
  ( ('0'..'9')+)
  ;
  
BOOLEAN
  :
   'true' | 'false' | 'FALSE' | 'TRUE' | 'True' | 'False' |
   'verdadero' | 'falso' | 'FALSO' | 'VERDADERO' | 'Verdadero' | 'Falso' 
  ;

minus 
   :
   '-'
   ;

PARENTESIS_D
  :
  ')'
  ;
  
  parentesis_d
  :
  ')'
  ;

PARENTESIS_I
  :
  '('
  ;
  
  parentesis_i
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
  ('print' | 'imprimir')
  ;

PRINTLN
  :
  ('println' | 'imprimirln')
  ;

READ
  :
  ('read' | 'leer')
  ;
PUSH:
  ('push' | 'insertar')
  ;
  
size1:
  ('.tamano' | '.size' );
  
SET:
  ('.set' | '.fijar');

RETURN:
  ('return' | 'devolver');
IF
  :
  'if' | 'si'
  ;

NOMBRE
  :
  (
    (
      'a'..'z'
      | 'A'..'Z' | '_' 
    )
    (
      (
        'a'..'z'
      | 'A'..'Z' | '_'
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


 
  

//operaciones 
// Este token sirve para omitir todos los espacios y tabulaciones en el texto

// Este token sirve para omitir todos los espacios y tabulaciones en el texto
WS : (' '|'\t')+ {$channel = HIDDEN;};
WSOPT   :       (' ')* {skip();};

// Este token sirve para omitir todos los saltos de linea en el texto