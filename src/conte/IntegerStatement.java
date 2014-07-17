package conte;

public class IntegerStatement extends conte.Statement1 {


	public Object numero;
	
	
	public IntegerStatement(Object numero) {
		super();
		this.numero = numero;
	}


	public Object interpreter() {
		return numero;
	}

}
