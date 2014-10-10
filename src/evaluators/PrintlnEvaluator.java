package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class prints to the user what is after the clause println followed by an enter, for example:
 * print a.
 * 
 */
public class PrintlnEvaluator implements Evaluator {

	private ArrayList<Evaluator> evaluators;

	public PrintlnEvaluator() {
		this.evaluators = new ArrayList<Evaluator>();
	}

	public void addEvaluator(Evaluator ev)
	{
		evaluators.add(ev);
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception{

		
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < evaluators.size(); i++)
		{
			System.out.println("evaluadno en print");
			Object objeto = evaluators.get(i).evaluate(pila);
			String aux  = objeto.toString();
			if(objeto instanceof Double )
			{
				double num = (Double) objeto;
				if(num - (int)(num) == 0)
				{
					aux = String.valueOf((int)num);
				}
			}
			s.append(aux);
		}
		s.append("\n");
		System.out.println("imprimiendo.." +  s);
		
		return s.toString();
	}

}
