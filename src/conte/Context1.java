package conte;

import java.util.HashMap;
import java.util.Set;

import evaluators.Evaluator;



public class Context1 {
	
	public HashMap<String, Evaluator> tabla;
	protected Context1 anterior = null;
	
	public Context1(Context1 ant)
	{
		tabla = new HashMap<String,Evaluator>();
		anterior = ant;
	}
	public Context1()
	{
		tabla = new HashMap<String,Evaluator>();
	}
	public void put(String simbolo, Evaluator statement)
	{
		tabla.put(simbolo, statement);
	}

	public Evaluator get(String palabra)
	{
		for(Context1 e = this; e != null; e = e.anterior)
		{
			Evaluator encontrado = (Evaluator)(e.tabla.get(palabra));
			if(encontrado != null)
				return encontrado;
		}
		return null;
		
	}
	
	public void Imprimir ()
	{
	Set<String>	llaves  = tabla.keySet();
		for (String llave : llaves)
		{
		 System.out.println("Nombre: " +llave+ " valor: " + tabla.get(llave));
		}
	
	}
	
	
	

}
