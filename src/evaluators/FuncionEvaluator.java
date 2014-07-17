package evaluators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import conte.Context1;



public class FuncionEvaluator implements Evaluator {

	//private Evaluator condicion;
	ArrayList <Evaluator> lista;
	ArrayList<Context1> pila;
	Queue <String> listaParametros;
	boolean bandera;

	
    
	
	
	public FuncionEvaluator() {
		lista  =  new ArrayList<Evaluator>();
		listaParametros = new LinkedList<String>();
		pila = new ArrayList<Context1>();
		pila.add(new Context1());
		bandera = false;
	}


	public void add(Evaluator a)
	{
		lista.add(a);
	}
	public void aregarParametro(String nombre)
	{
		//pila.peek().put(nombre,e);
		listaParametros.add(nombre);
		
		
	}
	
	public void llenarParametro(Evaluator nombre)
	{
		String valor = listaParametros.remove();
		pila.get(pila.size()-1).put(valor, nombre);
		//System.out.println(nombre.evaluate(pila));
	}

	
	@Override
	public Object evaluate(ArrayList<Context1> pila_basura) {
		ArrayList<Context1> pila2;
		System.out.println("entre a evaluar funcion");
		//System.out.println(condicion);
			//System.out.println("entre al if"+lista.size());
			for(Evaluator e: lista)
			{
				pila2 = pila;
				//System.out.println(e);
				if (e != null)
				{
					//System.out.println(e);
					if(e.evaluate(pila) == null)
						System.out.println("es null");
					
					
					if(e instanceof ReturnEvaluator)
					{
						return e.evaluate(pila);
					}
					Object ob;
					ob = e.evaluate(pila);	
					if(e instanceof WhileEvaluator)
					{
						if(((WhileEvaluator)e).getBandera())
							return ob;
					}
					if(e instanceof IfEvaluator)
					{
						if(((IfEvaluator)e).getBandera())
							return ob;
					}
					
				}
				else 
					System.out.println("Pila vacia");
				
							
				
			}
			
		return null;
	}
	
	
	

}
