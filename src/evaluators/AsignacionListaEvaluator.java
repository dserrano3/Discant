package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

public class AsignacionListaEvaluator implements Evaluator {

	
	String nombre;
	Evaluator e;
	int indice;
	
	
	public AsignacionListaEvaluator(String nombre, Evaluator e, String indice) {
		this.nombre = nombre;
		this.e = e;
		this.indice = Integer.valueOf(indice);
	}
	
	
	
	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		int i ;
		//System.out.println("entreeeeeeeee");
		for(i = pila.size()-1; i >= 0; i--)
		{		
			
			if(pila.get(i).get(nombre) != null)
			 {
				@SuppressWarnings("unchecked")
				List<Object> lis = (List<Object>) pila.get(i).get(nombre).evaluate(pila);
				lis.add(indice, e.evaluate(pila));
				return null;
			 }
		}
		
		System.out.println("error lista no declarada anteriormente");
		
		//System.out.println((Integer)pila.peek().get(nombre).evaluate(null));
		return null;
	}

}
