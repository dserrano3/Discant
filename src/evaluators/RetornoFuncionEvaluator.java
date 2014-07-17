package evaluators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import conte.Context1;



public class RetornoFuncionEvaluator implements Evaluator {


	
    Evaluator ev;
	
	Object oj;
	public RetornoFuncionEvaluator(Evaluator ev2) {
		ev = ev2;
		oj = ((FuncionEvaluator)ev2).evaluate(null);
	}


	
	
	
	
	@Override
	public Object evaluate(ArrayList<Context1> pila) {
				
		return oj;
	}
	
	
	

}
