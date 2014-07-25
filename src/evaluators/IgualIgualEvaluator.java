package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class compares if to values, for example: a == 3.
 * 
 */
public class IgualIgualEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public IgualIgualEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		// TODO: make it also work
		try {
			if ((double) ((Double) op1.evaluate(pila)) == (double) ((Double) op2
					.evaluate(pila))) {
				return true;
			}
			return false;
		} catch (Exception e) {
			throw new Exception("There was a problem with the comparasson " +e.getMessage());
		}
	}

}
