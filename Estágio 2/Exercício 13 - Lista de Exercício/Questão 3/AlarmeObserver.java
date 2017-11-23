package package3;

public abstract class AlarmeObserver {

	protected Alarme alarme;
	
	public AlarmeObserver(Alarme alarme){
		this.alarme = alarme;
	}
	
	public abstract void update();
	
}
