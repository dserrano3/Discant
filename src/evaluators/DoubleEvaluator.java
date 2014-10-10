package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluate all the numbers, for example: 3 or 2.3.
 * 
 */
public class DoubleEvaluator implements Evaluator {

	double numero;

	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return numero;
	}

	public DoubleEvaluator(double a) {
		//System.out.println("entre a doble");
		numero = a;
	}
}
