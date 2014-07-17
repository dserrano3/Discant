package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class TermEvaluator implements Evaluator {

	String var;
	
	
	
	
	
	public Object evaluate(ArrayList<Context1> pila) {
		
		int i;
		for(i = pila.size()-1;i >= 0; i --)
		{
			if(pila.get(i).get(var) != null )
			{
				//System.out.println(pila.get(i).get(var).evaluate(pila)+"llllllll");
				
				return pila.get(i).get(var).evaluate(pila);
				
			}
		}
		System.out.println("variable no existe");
		return null;
		
	}
	
	public TermEvaluator(String a)
	{
		var = a;
		//System.out.println("numero: "+numero);
	}
	

}
