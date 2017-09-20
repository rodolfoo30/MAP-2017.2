
public class Carro {
 
	
	public int numPortas;
	public String placa;
	public Carro(int numPortas, String placa) {
		MeiosDeTransportes meioDeTransporte = new MeiosDeTransportes( "modelo2", 5 , 2, 2010, "amarelo");

		this.numPortas = numPortas;
		this.placa = placa;
	}
 
 
}
