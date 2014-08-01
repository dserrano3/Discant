package evaluators;

import java.util.ArrayList;
import conte.Context1;

/**
 * This class evaluates the return statement of a function, for example: return
 * a.
 * 
 */
public class ReturnEvaluator implements Evaluator {

	Evaluator ev;

	public ReturnEvaluator(Evaluator ev2) {
		ev = ev2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		Object oj;
		oj = ev.evaluate(pila);

		return oj;
	}
}
