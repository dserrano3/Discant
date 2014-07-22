package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class ModEvaluator implements Evaluator {

	private final Evaluator op1,op2;

	public ModEvaluator(Evaluator op1, Evaluator op2) {
			this.op1 = op1;
		this.op2 = op2;
	}
	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return (Double)op1.evaluate(pila) % (Double)op2.evaluate(pila);
	}

}
