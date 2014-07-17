package evaluators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import conte.Context1;



public class ReturnEvaluator implements Evaluator {


	
    Evaluator ev;
	
	
	public ReturnEvaluator(Evaluator ev2) {
		ev = ev2;
	}


	
	
	
	
	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		Object oj;
		oj = ev.evaluate(pila);
		
		return oj;
	}
	
	
	

}
