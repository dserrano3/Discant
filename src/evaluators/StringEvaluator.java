package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluate the strings, for example: "a".
 * 
 */
public class StringEvaluator implements Evaluator {

	private String value = "";

	public Object evaluate(ArrayList<Context1> pila) {
		return value;
	}

	public StringEvaluator(String a) {
		value = a;
	}
}
