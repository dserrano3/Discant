package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This class evaluates the plus operator, for example: a + 3.
 * 
 */
public class PlusEvaluator implements Evaluator {
	private final Evaluator op1, op2;

	public PlusEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public Object evaluate(ArrayList<Context1> pila) throws Exception {
		// TODO Make it work with strings too, to concatenate them.
		try {
			Object ob1 =  op1.evaluate(pila);
			Object ob2 =  op2.evaluate(pila);
			
			if(ob1 instanceof Double && ob2 instanceof Double){
				return (double) ((Double) ob1)
					+ (double) ((Double) ob2);
			}
			if(ob1 instanceof String && ob2 instanceof String){
				return ((String)ob1).concat((String)ob2);
			}
			throw new Exception("There was a problem with the plus operation, probably the types ");
		} catch (Exception e) {
			throw new Exception("There was a problem with the plus operation "
					+ e.getMessage());
		}
	}

}
