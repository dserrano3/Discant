package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class StringEvaluator implements Evaluator {

	private String value = "";
	public Object evaluate(ArrayList<Context1> pila) {
		//System.out.println(value);
		//System.out.println("imprimiendo.."+value);
		return value;
		
	}
	public StringEvaluator(String a) {
		value = a;
		
	}
	
	
	

}
