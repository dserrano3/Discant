package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

/**
 * This class evaluates the get method of the list, for example: a.get(3);
 * 
 */
public class GetEvaluator implements Evaluator {
	String nombre;
	Evaluator exp;

	public GetEvaluator(String nombre, Evaluator exp) {
		this.nombre = nombre;
		this.exp = exp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		int i;
		for (i = pila.size() - 1; i >= 0; i--) {
			if (pila.get(i).get(nombre) != null) {
				Object lis =  pila.get(i).get(nombre)
						.evaluate(pila);

				double index = (Double) exp.evaluate(pila);
				if(lis instanceof List)
					return ((List<Evaluator>) (lis)).get((int) index);
				else if(lis instanceof String)
					return ((String) (lis)).charAt((int) index);
			}
		}

		System.out.println("error variable no declarada anteriormente");
		throw new Exception("The list was not declared before.");
	}
}
