package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class PrintEvaluator implements Evaluator { 

	
	public Evaluator ev;
	
	
	
	public PrintEvaluator(Evaluator ev) {
		this.ev = ev;
	//	System.out.println("entre a ev"+ev);
	}



	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		
		System.out.println("imprimiendo.." +  ev.evaluate(pila));
		return null;
	}

}
