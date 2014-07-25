package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This evaluate the logical operator or (||), it needs to booleans to compare,
 * for example true || false.
 * 
 */
public class OrEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public OrEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		try {
			if ((Boolean) op1.evaluate(pila) == true
					|| (Boolean) op2.evaluate(pila) == true)
				return true;
			return false;
		} catch (Exception e) {
			throw new Exception("There was a problem with the or clause"
					+ e.getMessage());
		}
	}
}
