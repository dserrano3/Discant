package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class is not used, since we treat all the numbers as doubles, but we
 * will leave it in case some one wants to have integers and modify the code.
 * 
 */
public class IntEvaluator implements Evaluator {

	int numero;

	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return numero;
	}

	public IntEvaluator(int a) {
		numero = a;
	}

}
