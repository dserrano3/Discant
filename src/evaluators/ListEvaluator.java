package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

public class ListEvaluator implements Evaluator {

	private List<Evaluator> lista;

	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return lista;
	}

	public ListEvaluator()
	{
		lista = new ArrayList<Evaluator>();
	}
}
