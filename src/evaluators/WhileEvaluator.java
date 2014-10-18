package evaluators;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import conte.Context1;

/**
 * This class evaluates the while, it stores all the actions in a list and at
 * the end if the condition is true, it executes the actions until the condition
 * becomes false.
 * 
 */
public class WhileEvaluator implements Evaluator {

	private Evaluator condicion;
	ArrayList<Evaluator> lista;
	Object objeto;
	private boolean bandera;

	public Evaluator getCondicion() {
		return condicion;
	}

	public void setCondicion(Evaluator condicion) {
		this.condicion = condicion;
	}

	public WhileEvaluator(Evaluator condicion) {
		this.condicion = condicion;
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
	public boolean stopLoop(){
		String message = "Seems like the loop is kind of long, do you want to stop it";
		String title = "Posible problem";
		int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	          return true;
	        }
	        else {
	           return false;
	        }
	}
	
	
	
	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {

		StringBuilder output = new StringBuilder();
		int conta = 0;
		while ((Boolean) condicion.evaluate(pila) == true) {
			conta ++;
			//This is to avoid infinite loops.
			if(conta > 100000){
				conta = 0;
				if(stopLoop())
					break;
			}
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
		}
		return output.toString();
	}
}
