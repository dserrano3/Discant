package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluates the if, it stores all the actions in a list and at the
 * end if the condition is true, it executes the actions.
 * 
 */
public class IfEvaluator implements Evaluator {

	private ArrayList<Evaluator> condicion;
	private boolean bandera;

	public void agregarCondicion(Evaluator ev) {
		condicion.add(ev);
	}

	ArrayList<ArrayList<Evaluator>> lista;
	ArrayList<Evaluator> lista_else;

	public IfEvaluator() {
		this.condicion = new ArrayList<Evaluator>();
		lista = new ArrayList<ArrayList<Evaluator>>();
		bandera = false;
		lista.add(new ArrayList<Evaluator>());
		lista_else = new ArrayList<Evaluator>();
	}

	public boolean getBandera() {
		return bandera;
	}

	public void nuevoSegmento() {
		lista.add(new ArrayList<Evaluator>());
	}

	public void agregarCoso(Evaluator ev) {
		lista.get(lista.size() - 1).add(ev);
	}

	public void agregarCosoElse(Evaluator ev) {
		lista_else.add(ev);
	}

	public Object evaluate(ArrayList<Context1> pila) throws Exception {

		StringBuilder output = new StringBuilder();
		Context1 auxcon = new Context1();

		pila.add(auxcon);

		int indice = -1;
		int conta = 0;
		for (Evaluator condi : condicion) {
			if ((Boolean) condi.evaluate(pila) == true) {
				indice = conta;
				break;
			}
			conta++;
		}
		ArrayList<Evaluator> auxi = null;
		if (indice != -1) {
			auxi = lista.get(indice);
		}
		if (indice == -1 && lista_else.size() != 0) {
			auxi = lista_else;
		}

		if (auxi != null) {
			for (Evaluator e : auxi) {

				if (e != null) {
					if (e instanceof ReturnEvaluator) {

						bandera = true;
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

					if (e instanceof IfEvaluator) {
						if (((IfEvaluator) e).getBandera()) {
							bandera = true;
							return ob;
						}
					}
					if (e instanceof WhileEvaluator) {
						if (((WhileEvaluator) e).getBandera()) {
							bandera = true;
							return ob;
						}
					}
				}
			}
		}

		pila.remove(pila.size() - 1);

		return output.toString();
	}

}
