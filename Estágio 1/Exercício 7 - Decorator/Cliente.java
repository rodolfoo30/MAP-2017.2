
public class Cliente {
	public static void main(String[] args) {
		

		ColchetesDecorator colchetesDecorar = new ColchetesDecorator(new NumeroUm());
		colchetesDecorar.imprimir();
		
		ChavesDecorator chavesDecorar = new ChavesDecorator(new NumeroUm());
		chavesDecorar.imprimir();
		
		ParentesesDecorator parentesesDecorar = new ParentesesDecorator(new NumeroUm());
		parentesesDecorar.imprimir();
		
		
		
	}

	

}
