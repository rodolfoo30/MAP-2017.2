package package3;
import java.util.ArrayList;

public class Alarme {

	protected ArrayList<AlarmeObserver> observers;
	protected Endereco endereco;
	
	public Alarme(){
		this.observers = new ArrayList<AlarmeObserver>();
	}
	
	public void attach(AlarmeObserver observer){
		this.observers.add(observer);
	}
	
	public void detach(AlarmeObserver observer){
		this.observers.remove(observer);
	}
	
	public void setState(Endereco endereco){
		this.endereco = enderco;
		notifyObservers();
	}
	
	public void notifyObservers(){
		for(AlarmeObserver observer: observers){
			observer.update();
		}
	}
	
	public Info getState(){
		return this.info;
	}
	
}
