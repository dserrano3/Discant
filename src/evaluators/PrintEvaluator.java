package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class prints to the user what is after the clause print, for example:
 * print a.
 * 
 */
public class PrintEvaluator implements Evaluator {

	public ArrayList<Evaluator> evaluators;

	public PrintEvaluator() {
		this.evaluators = new ArrayList<Evaluator>();
	}

	public void addEvaluator(Evaluator ev) {
		evaluators.add(ev);
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < evaluators.size(); i++)
		{
			String aux  = evaluators.get(i).evaluate(pila).toString();
			if(evaluators.get(i).evaluate(pila) instanceof Double )
			{
				double num = (Double) evaluators.get(i).evaluate(pila);
				if(num - (int)(num) == 0)
				{
					aux = String.valueOf((int)num);
				}
			}
			s.append(aux);
		}
		System.out.print(s);

		return s.toString();
	}

}