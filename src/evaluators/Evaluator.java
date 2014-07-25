package evaluators;

import java.util.ArrayList;

import conte.Context1;

/**
 * This is the interface all the Evaluators implement. All the children have the
 * method evaluate which performs the main action, and s a constructor that
 * receives the parameters to perform the action.
 * All the objects will be treated as Evaluator and casted if necessary.
 */
public interface Evaluator {
	Object evaluate(ArrayList<Context1> pila) throws Exception;
}
