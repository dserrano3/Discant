package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class NegationEvaluator implements Evaluator {
	private final Evaluator op1;
	
	
	
	public NegationEvaluator(Evaluator op1) {
			this.op1 = op1;
		
	}



	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		// TODO Auto-generated method stub
		return -1* (Double)op1.evaluate(pila) ;
	}

}
