package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class is called if the user wants to assign a variable to a value, for
 * example a = 3; or a = b.
 * 
 */
public class AsignacionEvaluator implements Evaluator {

	String nombre;
	Evaluator e;

	public AsignacionEvaluator(String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		int i;
		for (i = pila.size() - 1; i >= 0; i--) {

			if (pila.get(i).get(nombre) != null) {
				Object asd = e.evaluate(pila);

				Evaluator coso = null;
				if (asd instanceof Double)
					coso = new DoubleEvaluator((Double) asd);
				if (asd instanceof String)
					coso = new StringEvaluator((String) asd);

				pila.get(i).put(nombre, coso);
				return null;
			}
		}
		System.out.println("error variable no declarada anteriormente");
		throw new Exception("The variable was not declared before");
	}
}
