
public class ChavesDecorator extends NumeroUmDecorator {
	
	
	public ChavesDecorator(NumeroUm numeroUmDecorado) {
		super(numeroUmDecorado);
	}

	public void imprimir() {
		String retorno = decorarChaves();
		numeroUmDecorado.imprimir(retorno);
	}

	private String decorarChaves() {
		
		String abre = "{";
		String fecha = "}";
		
		return abre + 1 + fecha;
	}

}
