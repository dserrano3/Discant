package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class is used to declare a new variable, for example: var a = 3;
 * 
 */
public class DeclaracionEvaluator implements Evaluator {

	private String nombre;
	private Evaluator e;

	public DeclaracionEvaluator(String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
	}

	public void asignar(Evaluator e){
		this.e = e;
	}
	@Override
	public Object evaluate(ArrayList<Context1> pila) {

		pila.get(pila.size() - 1).put(nombre, e);
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
