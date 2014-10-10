package evaluators;

import java.util.ArrayList;
import java.util.List;

import conte.Context1;

/**
 * This class is called if the user wants to assign a variable to a value, for
 * example a = 3; or a = b.
 * 
 */
public class AsignacionEvaluator implements Evaluator {

	String nombre;
	Evaluator e;

	public AsignacionEvaluator(String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		int i;
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
			nuevo = new ListEvaluator();
		}
		for (i = pila.size() - 1; i >= 0; i--) {

			if (pila.get(i).get(nombre) != null) {
				
				pila.get(i).put(nombre, nuevo);
				return null;
			}
		}
        try {
        	pila.get(pila.size() - 1).put(nombre, nuevo);
        }catch (Exception e) {
        	throw new Exception("There was a problem declaring the variable");
        }
        return null;
	}
}