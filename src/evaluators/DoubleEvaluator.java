package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class DoubleEvaluator implements Evaluator {

	double numero;

	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return numero;
	}

	public DoubleEvaluator(double a)
	{
		numero = a;	
	}
}
