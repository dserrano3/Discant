package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

public class GetEvaluator implements Evaluator {
	String nombre;
	Evaluator exp;
	public GetEvaluator(String nombre, Evaluator exp) {
		this.nombre = nombre;
		this.exp = exp;
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

				double index =  (Double) exp.evaluate(pila);
				return lis.get((int) index);
			 }
		}
		
		System.out.println("error variable no declarada anteriormente");
		
		//System.out.println((Integer)pila.peek().get(nombre).evaluate(null));
		return null;
	}

}
