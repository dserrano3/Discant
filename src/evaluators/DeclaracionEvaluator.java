package evaluators;

import java.util.ArrayList;
import java.util.List;

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
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		Object temp = e.evaluate(pila);
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
			ListEvaluator a = new ListEvaluator();
			a.setLista((List)temp);
			nuevo = a;
		}
		pila.get(pila.size() - 1).put(nombre, nuevo);
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
