package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

/**
 * This class evaluates the get method of the list, for example: a.get(3);
 * 
 */
public class SizeEvaluator implements Evaluator {
	String nombre;

	public SizeEvaluator(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		int i;
		for (i = pila.size() - 1; i >= 0; i--) {
			if (pila.get(i).get(nombre) != null) {
				@SuppressWarnings("unchecked")
				List<Evaluator> lis = (List<Evaluator>) pila.get(i).get(nombre)
						.evaluate(pila);

				return Double.valueOf(lis.size());
			}
		}

		System.out.println("error variable no declarada anteriormente");
		throw new Exception("The list was not declared before.");
	}
}
