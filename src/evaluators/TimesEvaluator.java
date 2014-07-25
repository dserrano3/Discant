package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluates the times operator, for example: a * 3.
 * 
 */
public class TimesEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public TimesEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		try {
			return (Double) op1.evaluate(pila) * (Double) op2.evaluate(pila);
		} catch (Exception e) {
			throw new Exception("There was a problem with the times operation "
					+ e.getMessage());
		}
	}

}
