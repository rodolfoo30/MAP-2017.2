
public class Aviao {

	public String prefixo;
	public int numTurbinas;
	
	public Aviao(String prefixo, int numTurbinas) {
		this.prefixo = prefixo;
		MeiosDeTransportes meioDeTransporte = new MeiosDeTransportes( "modelo1", 140 , 50, 2000, "azul");
		this.numTurbinas = numTurbinas;
	}
	
}
