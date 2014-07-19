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

		String s = ev.evaluate(pila).toString();
		System.out.println("imprimiendo.." +  s);
		
		return s;
	}

}
