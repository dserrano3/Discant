package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class IgualIgualEvaluator implements Evaluator {
	private final Evaluator op1,op2;
	
	
	
	public IgualIgualEvaluator(Evaluator op1, Evaluator op2) {
			this.op1 = op1;
		    this.op2 = op2;
	}



	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		// TODO Auto-generated method stub
		//System.out.println((Double)op1.evaluate(pila)+ " "+ (Double)op2.evaluate(pila));
		if( (double)((Double)op1.evaluate(pila)) == (double)((Double)op2.evaluate(pila)))
		{
			return true;
		}
		return false;
	}

}
