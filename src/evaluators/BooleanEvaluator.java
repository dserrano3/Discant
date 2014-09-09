package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluate the booleans; true or false.
 * 
 */
public class BooleanEvaluator implements Evaluator {

	boolean valor;

	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return valor;
	}

	public BooleanEvaluator(String a) {
		//This is in case the user writes the bool with capital letter.
		System.out.println("entre a boolean");
		a = a.toLowerCase();
		valor = Boolean.valueOf(a);
	}
}
