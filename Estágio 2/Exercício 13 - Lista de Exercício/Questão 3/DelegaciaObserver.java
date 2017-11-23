package package3;

public class DelegaciaObserver extends AlarmeObserver {

	public DelegaciaObserver(Alarme alarme) {
		super(alarme);
	}

	@Override
	public void update() {
		
		System.out.println("Delegacia - Endereco da casa:  " + alarme.getState().getEndereco());
		
	}

}
