package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

/**
 * This class evaluates the push method of the list, for example: a.push(3);
 * 
 */
public class PushEvaluator implements Evaluator {
	String nombre;
	Evaluator e;

	public PushEvaluator(String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		int i;
		for (i = pila.size() - 1; i >= 0; i--) {
			if (pila.get(i).get(nombre) != null) {

				@SuppressWarnings("unchecked")
				List<Object> lis = (List<Object>) pila.get(i).get(nombre)
						.evaluate(pila);
				lis.add(e.evaluate(pila));
				return null;
			}
		}

		System.out.println("error variable no declarada anteriormente");
		throw new Exception("The list was not declared before.");
	}
}
