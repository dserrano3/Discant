package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

/**
 * This class creates a new list, for examle: list a;
 * 
 */
public class ListEvaluator implements Evaluator {

	private List<Object> lista;

	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		return lista;
	}

	public ListEvaluator() {
		lista = new ArrayList<Object>();
	}

	public List<Object> getLista() {
		return lista;
	}

	public void setLista(List<Object> lista) {
		this.lista = lista;
	}
	
	
}