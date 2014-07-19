package evaluators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;

import conte.Context1;



public class ReadEvaluator implements Evaluator {


	ArrayList<Context1> pila; //= new Stack<Context1>();
	String nombre;
	
	
	
	public ReadEvaluator(ArrayList<Context1> pila, String nombre) {
		this.pila = pila;
		this.nombre = nombre;
	}



	public Object evaluate(ArrayList<Context1> pila) {
		Evaluator e = null;
		System.out.println("entre a la lectura!!!!!!");

		String line = JOptionPane.showInputDialog("input dato "+nombre+": ");
		System.out.println("lei " + line);

		String pattern = "([a-z0-9])+";
		if ((line.matches(pattern))) {
			e = new StringEvaluator(line);
		}

		pattern = "(([0-9])+)";

		if ((line.matches(pattern))) {
			// System.out.println("Se esta asignando el valor "+
			// Integer.parseInt(line));
			e = new DoubleEvaluator(Double.parseDouble(line));

		}
		int i;
		for (i = pila.size() - 1; i >= 0; i--) {
			if (pila.get(i).get(nombre) != null) {
				pila.get(i).put(nombre, e);
				break;
			}
		}
  
    		return null;
	}

}
