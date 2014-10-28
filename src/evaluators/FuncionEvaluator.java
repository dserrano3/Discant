package evaluators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
	ArrayList<Context1> pila_main;
	boolean bandera;

	public FuncionEvaluator(ArrayList<Context1> pila_main) {
		lista = new ArrayList<Evaluator>();
		listaParametros = new LinkedList<String>();
		pila = new ArrayList<Context1>();
		pila.add(new Context1());
		bandera = false;
		this.pila_main = pila_main;
	}

	public void add(Evaluator a) {
		lista.add(a);
	}

	public void aregarParametro(String nombre) {
		listaParametros.add(nombre);
	}

	public void llenarParametro(Evaluator nombre) throws Exception {
		String valor = listaParametros.remove();
		Object temp = nombre.evaluate(pila_main);
		Evaluator nuevo = null;
		if(temp instanceof Double){
			nuevo = new DoubleEvaluator((Double)temp);
		}
		if(temp instanceof String){
			nuevo = new StringEvaluator((String)temp);
		}
		if(temp instanceof Boolean){
			nuevo = new BooleanEvaluator(String.valueOf(temp));
		}
		if(temp instanceof List){
			nuevo = new ListEvaluator();
		}
		System.out.println("estoy en funcion y el valor es: " + temp);
		pila.get(pila.size() - 1).put(valor, nuevo);
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila_basura) throws Exception {
		try{
		StringBuilder output = new StringBuilder();

		for (Evaluator e : lista) {
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
		}finally{
			//pila.remove(pila.size() - 1);
		}
	}
}
