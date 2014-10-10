package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;


public class DeclaracionMultipleEvaluator implements Evaluator {
	
	private List<Evaluator> declaraciones;

	
	public DeclaracionMultipleEvaluator() {
		declaraciones = new ArrayList<Evaluator>();
	}
	
	public void addDeclaracion(String nombre, Evaluator e){
		DeclaracionEvaluator nuevo = new DeclaracionEvaluator(nombre, e);
		declaraciones.add(nuevo);
		System.out.println("agregue");
	}

	public void addAsigancion(Evaluator e){
		((DeclaracionEvaluator) declaraciones.
				get(declaraciones.size()-1)).asignar(e);
	}
	
	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		for(Evaluator e : declaraciones){
			e.evaluate(pila);
		}
		return null;
	}
	
	
}
