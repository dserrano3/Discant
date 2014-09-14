package evaluators;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conte.Context1;

public class ReadEvaluator implements Evaluator {

	ArrayList<Context1> pila; // = new Stack<Context1>();
	String nombre;
	boolean texto = false;
	String text;

	public ReadEvaluator(ArrayList<Context1> pila, String nombre) {
		this.pila = pila;
		this.nombre = nombre;
	}
	 /*
	  * Checks if the variable where the value will be stored exists, if it doesn't it will create it.
	  */
	public void comprobarVariable(){
		boolean existe = false;
		for (int i = pila.size() - 1; i >= 0; i--) {
			if (pila.get(i).get(nombre) != null) {
				existe = true;
				break;
			}
		}
		if(!existe)
			pila.get(pila.size() - 1).put(nombre, new DoubleEvaluator(0));
	}
	
	public void addText(Evaluator ev){
		try {
			text = String.valueOf(ev.evaluate(pila));
			texto = true;
		} catch (Exception e) {
			System.out.println("Problem in the reading " + e);
		}
	}
	
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		Evaluator e = null;
		System.out.println("entre a la lectura!!!!!!");
		String line;
		if(!texto){
		line = JOptionPane
				.showInputDialog("input dato " + nombre + ": ");
		}else{
			line = JOptionPane
					.showInputDialog(text);
		}
		System.out.println("lei " + line);
		comprobarVariable();
		int i;
		for (i = pila.size() - 1; i >= 0; i--) {
			if (pila.get(i).get(nombre) != null) {
				if (pila.get(i).get(nombre) instanceof ListEvaluator) {
					String[] datos = line.split(" ");

					for (String s : datos) {
						String pattern = "([a-z0-9])+";
						if ((s.matches(pattern)))
							e = new StringEvaluator(s);
						pattern = "(([0-9])+)";
						if ((line.matches(pattern)))
							e = new DoubleEvaluator(Double.parseDouble(s));
						System.out.println("objeto " + e);

						@SuppressWarnings("unchecked")
						List<Object> lis = (List<Object>) pila.get(i)
								.get(nombre).evaluate(pila);
						lis.add(e.evaluate(pila));
					}
				} else {

					String pattern = "(([0-9])+)";

					if ((line.matches(pattern))) {
						// System.out.println("Se esta asignando el valor "+
						// Integer.parseInt(line));
						e = new DoubleEvaluator(Double.parseDouble(line));

					} else if (line.equals("true") || line.equals("false")) {
						e = new BooleanEvaluator(line);
					} else if (line.matches("(.)*")) {
						e = new StringEvaluator(line);
					}

					for (i = pila.size() - 1; i >= 0; i--) {
						if (pila.get(i).get(nombre) != null) {
							pila.get(i).put(nombre, e);
							break;
						}
					}
				}
			}

		}
		return null;
	}

}
