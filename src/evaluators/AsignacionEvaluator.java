package evaluators;

import java.util.ArrayList;

import conte.Context1;

public class AsignacionEvaluator implements Evaluator {

	
	String nombre;
	Evaluator e;
	
	
	
	public AsignacionEvaluator(String nombre, Evaluator e) {
		this.nombre = nombre;
		this.e = e;
	}
	
	
	
	@Override
	public Object evaluate(ArrayList<Context1> pila) {
		int i ;
		//System.out.println("entreeeeeeeee");
		for(i = pila.size()-1; i >= 0; i--)
		{		
			
			if(pila.get(i).get(nombre) != null)
			 {
				Object asd = e.evaluate(pila);
				
				Evaluator coso = null;
				if(asd instanceof Double)
					coso = new DoubleEvaluator((Double)asd);
				if(asd instanceof String)
					coso = new StringEvaluator((String)asd);
				
				//pila.get(i).put(nombre,e);
				pila.get(i).put(nombre,coso);
				 return null;
			 }
		}
		
		System.out.println("error variable no declarada anteriormente");
		
		//System.out.println((Integer)pila.peek().get(nombre).evaluate(null));
		return null;
	}

}
