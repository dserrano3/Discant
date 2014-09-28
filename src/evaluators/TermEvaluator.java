package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluates the value of a variable and returns it.
 * 
 */
public class TermEvaluator implements Evaluator {

	String var;

	public Object evaluate(ArrayList<Context1> pila) throws Exception {

		int i;
		for (i = pila.size() - 1; i >= 0; i--) {
			if (pila.get(i).get(var) != null) {
				return pila.get(i).get(var).evaluate(pila);
			}
		}
		// If the variable is not found, it creates the variable and fills it
		// with a 0.
		pila.get(pila.size() - 1).put(var, new DoubleEvaluator(0));
		return pila.get(pila.size() - 1).get(var).evaluate(pila);
		// throw new Exception("Name of variable not declared before");
	}

	public TermEvaluator(String a) {
		var = a;
	}

}
