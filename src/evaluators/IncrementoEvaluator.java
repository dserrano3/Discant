package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class is called if the user wants to increment a variable to a value, for
 * example a++ or a+= 3.
 * 
 */
public class IncrementoEvaluator implements Evaluator {

	String nombre;
	Evaluator e;
	double valor = 0;
	boolean decremento = false;
	boolean retorno = false;
	public IncrementoEvaluator(String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
	}
	public IncrementoEvaluator(boolean retorno, String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
		this.retorno = retorno;
	}
	public IncrementoEvaluator(String nombre, Evaluator e, boolean decremento) {
		this.nombre = nombre;
		this.e = e;
		this.decremento = decremento;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		System.out.println("estoy evaluando");
		if (e.evaluate(pila) instanceof Double) {
			valor = (Double) e.evaluate(pila);
		} else {
			System.out.println("In the increment the object is not double");
		}
		int i;

		for (i = pila.size() - 1; i >= 0; i--) {

			if (pila.get(i).get(nombre) != null) {
				Object asd = e.evaluate(pila);
				if (asd instanceof Double) {
					double antiguo = (Double)pila.get(i).get(nombre).evaluate(pila);
					
					if(decremento) valor *= -1;
					Evaluator nuevo = new DoubleEvaluator(antiguo
							+ valor);

					pila.get(i).put(nombre, nuevo);
					System.out.println("valor ++ " + nuevo.evaluate(pila));
					if(retorno)
					return nuevo.evaluate(pila);
					else return null;
				} else
					System.out.println("In the increment the object is not double");
				return null;
			}
		}
		try {
			pila.get(pila.size() - 1).put(nombre, new DoubleEvaluator(valor));
			if(retorno)
			return pila.get(pila.size() - 1).get(nombre).evaluate(pila);
			else return null;
		} catch (Exception e) {
			throw new Exception("There was a problem declaring the variable");
		}
	}
}
