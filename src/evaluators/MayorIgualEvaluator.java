package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class Evaluates the greater or equal than, for example: a >= 3.
 * 
 */
public class MayorIgualEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public MayorIgualEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		// TODO Make it work with Strings.
		try {
			if ((Double) op1.evaluate(pila) >= (Double) op2.evaluate(pila))
				return true;
			return false;
		} catch (Exception e) {
			throw new Exception(
					"There was a problem with the greater or equal than. " + e.getMessage());
		}
	}

}
