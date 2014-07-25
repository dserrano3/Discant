package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class is used to know if to values are different, for example: a != 3;.
 * 
 */
public class DiferenteEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public DiferenteEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		// TODO also compare with Strings.
		try {
			if ((Double) op1.evaluate(pila) != (Double) op2.evaluate(pila))
				return true;
			return false;
		} catch (Exception e) {
			throw new Exception("Comparing for different values had a problem " + e.getMessage());
		}
	}
}
