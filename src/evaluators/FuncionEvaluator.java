package evaluators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import conte.Context1;

/**
 * This class evaluates the function, given that a function should not be
 * evaluated as soon as is red, this class store the actions in a list, and
 * execute them once the function is called.
 * 
 */
public class FuncionEvaluator implements Evaluator {

	ArrayList<Evaluator> lista;
	ArrayList<Context1> pila;
	Queue<String> listaParametros;
	boolean bandera;

	public FuncionEvaluator() {
		lista = new ArrayList<Evaluator>();
		listaParametros = new LinkedList<String>();
		pila = new ArrayList<Context1>();
		pila.add(new Context1());
		bandera = false;
	}

	public void add(Evaluator a) {
		lista.add(a);
	}

	public void aregarParametro(String nombre) {
		listaParametros.add(nombre);
	}

	public void llenarParametro(Evaluator nombre) {
		String valor = listaParametros.remove();
		pila.get(pila.size() - 1).put(valor, nombre);
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila_basura) throws Exception {
		StringBuilder output = new StringBuilder();
		ArrayList<Context1> pila2 ;

		for (Evaluator e : lista) {
			pila2 = pila;
			if (e != null) {
				if (e instanceof ReturnEvaluator) {
					return e.evaluate(pila);
				}
				Object ob;
				ob = e.evaluate(pila);
				if (ob != null) {
					if (ob instanceof Double)
						output.append(((Double) ob).toString());
					else
						output.append(ob.toString());
				}

				if (e instanceof WhileEvaluator) {
					if (((WhileEvaluator) e).getBandera())
						return ob;
				}
				if (e instanceof IfEvaluator) {
					if (((IfEvaluator) e).getBandera())
						return ob;
				}
			}
		}
		return output.toString();
	}
}
