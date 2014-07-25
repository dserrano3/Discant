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
		System.out.println("variable no existe");
		throw new Exception("Name of variable not declared before");
	}

	public TermEvaluator(String a) {
		var = a;
	}

}
