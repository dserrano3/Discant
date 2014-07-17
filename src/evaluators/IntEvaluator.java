package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class IntEvaluator implements Evaluator {

	int numero;
	
	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return numero;
	}
	
	public IntEvaluator(int a)
	{
		numero = a;
		//System.out.println("numero: "+numero);
	}
	

}
