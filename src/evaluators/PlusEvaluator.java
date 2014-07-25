package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluates the plus operator, for example: a + 3.
 * 
 */
public class PlusEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public PlusEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		// TODO Make it work with strings too, to concatenate them.
		try {
			return (double) ((Double) op1.evaluate(pila))
					+ (double) ((Double) op2.evaluate(pila));
		} catch (Exception e) {
			throw new Exception("There was a problem with the plus operation "
					+ e.getMessage());
		}
	}

}
