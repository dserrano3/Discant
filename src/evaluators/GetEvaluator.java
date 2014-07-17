package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

public class GetEvaluator implements Evaluator {
	String nombre;
	int numero;
	public GetEvaluator(String nombre, String numero) {
		this.nombre = nombre;
		this.numero = Integer.valueOf(numero);
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		// TODO Auto-generated method stub
		int i ;
		//System.out.println("entreeeeeeeee");
		for(i = pila.size()-1; i >= 0; i--)
		{		
			
			if(pila.get(i).get(nombre) != null)
			 {
				@SuppressWarnings("unchecked")
				List<Evaluator> lis = (List<Evaluator>) pila.get(i).get(nombre).evaluate(pila);
				return lis.get(numero).evaluate(pila);
			 }
		}
		
		System.out.println("error variable no declarada anteriormente");
		
		//System.out.println((Integer)pila.peek().get(nombre).evaluate(null));
		return null;
	}

}
