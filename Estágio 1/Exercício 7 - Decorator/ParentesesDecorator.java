
public class ParentesesDecorator extends NumeroUmDecorator {
	
	public ParentesesDecorator(NumeroUm numeroUmDecorado) {
		super(numeroUmDecorado);
	}

	public void imprimir() {
		String retorno = decorarParenteses();
		numeroUmDecorado.imprimir(retorno);
	}

	private String decorarParenteses() {
		
		String abre = "(";
		String fecha = ")";
		
		return abre + 1 + fecha;
		
	}

}
