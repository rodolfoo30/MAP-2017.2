
public class ColchetesDecorator extends NumeroUmDecorator {
	
	
	public ColchetesDecorator(NumeroUm numeroUmDecorado) {
		super(numeroUmDecorado);
	}

	public void imprimir() {
		String retorno = decorarColchetos();
		numeroUmDecorado.imprimir(retorno);
	}

	private String decorarColchetos() {
		
		String abre = "[";
		String fecha = "]";
		
		return abre + 1 + fecha;
		
		
	}

}
