package package3;
public class SeguroObserver extends AlarmeObserver {

	public SeguroObserver(Alarme alarme) {
		super(alarme);
	}

	@Override
	public void update() {

		System.out.println("Seguro - Endereco da casa:  " + alarme.getState().getEndereco());

	}

}
