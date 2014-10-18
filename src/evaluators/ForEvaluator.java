package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This is the class for the for, it has the beginning which is a new variable,
 * the condition, and the increment which is a single integer. It also has a
 * list of actions to be performed.
 * 
 */
public class ForEvaluator implements Evaluator {

	private Evaluator inicio;
	private Evaluator condicion;
	private Evaluator incremento;
	ArrayList<Evaluator> lista;
	Object objeto;
	private boolean bandera;

	public Evaluator getCondicion() {
		return condicion;
	}

	public void setCondicion(Evaluator condicion) {
		this.condicion = condicion;
	}

	public ForEvaluator(Evaluator inicio, Evaluator condicion,
			Evaluator incremento) {
		this.inicio = inicio;
		this.condicion = condicion;
		this.incremento = incremento;
		lista = new ArrayList<Evaluator>();
		;
		bandera = false;
	}

	public boolean getBandera() {
		return bandera;
	}

	public void add(Evaluator a) {
		lista.add(a);
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		inicio.evaluate(pila);
		pila.add(new Context1());
		String variable = ((DeclaracionEvaluator) (inicio)).getNombre();
		TermEvaluator termino = new TermEvaluator(variable);
		StringBuilder output = new StringBuilder();
		while ((Boolean) condicion.evaluate(pila) == true) {
			pila.add(new Context1());
			for (Evaluator e : lista) {
				if (e != null) {
					Object retorno = e.evaluate(pila);

					if (retorno != null) {
						if (retorno instanceof Double)
							output.append(((Double) retorno).toString());
						else
							output.append(retorno.toString());
					}
				}
			}
			pila.remove(pila.size() - 1);
			if(incremento instanceof DoubleEvaluator){
				AsignacionEvaluator asignacion = new AsignacionEvaluator(variable,
						new DoubleEvaluator((Double) termino.evaluate(pila)
								+ (Double) incremento.evaluate(pila)));
				asignacion.evaluate(pila);
			}else{
				incremento.evaluate(pila);
			}
		}
		pila.remove(pila.size() - 1);
		return output.toString();


	}
}
