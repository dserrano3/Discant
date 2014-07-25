package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class is used to divide to values, for example: a / 3;
 * 
 */
public class DivideEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public DivideEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		try {
			return (Double) op1.evaluate(pila) / (Double) op2.evaluate(pila);
		} catch (Exception e) {
			throw new Exception("trying to divide two non numbers." + e.getMessage());
		}
	}
}
