package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class implements the negation of a number, for example !a.
 * 
 */
public class NegationEvaluator implements Evaluator {
	private final Evaluator op1;

	public NegationEvaluator(Evaluator op1) {
		this.op1 = op1;

	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		try {
			return -1 * (Double) op1.evaluate(pila);
		} catch (Exception e) {
			throw new Exception(
					"There was a problem with the module operation "
							+ e.getMessage());
		}
	}
}
