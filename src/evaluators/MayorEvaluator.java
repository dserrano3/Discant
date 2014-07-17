package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class MayorEvaluator implements Evaluator {
	private final Evaluator op1,op2;
	
	
	
	public MayorEvaluator(Evaluator op1, Evaluator op2) {
			this.op1 = op1;
		    this.op2 = op2;
	}



	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		// TODO Auto-generated method stub
		if( (Double)op1.evaluate(pila) > (Double)op2.evaluate(pila))
			return true;
		return false;
	}

}
