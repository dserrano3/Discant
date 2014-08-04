package evaluators;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import conte.Context1;

/**
 * This class creates a new list, for examle: list a;
 * 
 */
public class ListFromTextEvaluator implements Evaluator {

	private List<Object> lista;
	private String nombre;
	private Evaluator le;

	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    @SuppressWarnings("unused")
		double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	
	@Override
	public Evaluator evaluate(ArrayList<Context1> pila) throws Exception{

		lista = new ArrayList<Object>();
		BufferedReader reader;
		//This is to trim the quotes.
		String newNombre = nombre.substring(1,nombre.length()-1);
		try {
			reader = new BufferedReader(new FileReader(newNombre));
		} catch (FileNotFoundException e) {
			throw new Exception("There was a problem reading the file "+newNombre+" " +e.getMessage());
		}
		String line = null;
		while ((line = reader.readLine()) != null) {
			if(isNumeric(line))
		    {
		    	lista.add(Double.valueOf(line));
		    }else {
		    	lista.add(line); 
		    }
		}
		le = new ListEvaluator();
		((ListEvaluator) le).setLista(lista);
		return le;
	}

	public ListFromTextEvaluator(String nombre){
		this.nombre = nombre;
	}
}