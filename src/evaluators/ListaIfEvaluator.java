package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class ListaIfEvaluator implements Evaluator {

	private Evaluator condicion; 
	private boolean bandera;
	public Evaluator getCondicion() {
		return condicion;
	}



	public void setCondicion(Evaluator condicion) {
		this.condicion = condicion;
	}

	ArrayList<Evaluator> lista;
	
	
	public ListaIfEvaluator (Evaluator condicion)
	{
		this.condicion= condicion; 
		lista= new ArrayList<Evaluator>();
		bandera = false;
	}
	public boolean getBandera() {
		return bandera;
	}
	
	
	public Object evaluate(ArrayList<Context1> pila) throws Exception{
		
		
		
		if ((Boolean)condicion.evaluate(pila)==true)
		{
			System.out.println("Se cumple la condicion");
			for (Evaluator e: lista)
			{
				if (e!=null)
				{
					
					if(e instanceof ReturnEvaluator)
					{
						
						bandera = true;
						return e.evaluate(pila);
						
					}
					
					Object ob;
					ob = e.evaluate(pila);	
					if(e instanceof ListaIfEvaluator)
					{
						
						
						if(((ListaIfEvaluator)e).getBandera())
						{
							bandera = true;
							return ob;
						}
					}
					if(e instanceof WhileEvaluator)
					{
						if(((WhileEvaluator)e).getBandera())
						{
							bandera = true;
							return ob;
						}
					}
				}
				else 
				{
					System.out.println("Pila vacia");
				}
			}
		}
		
		
		return null;
	}
	
	public void add(Evaluator e)
	{
		lista.add(e);
	}
	
	

}
