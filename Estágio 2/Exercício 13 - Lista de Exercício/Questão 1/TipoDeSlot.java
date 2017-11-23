
public enum TipoDeSlot {
	UM(0.01), CINCO(0.05), DEZ(0.10), VINTECINCO(0.25), CINQUENTA(0.50), UMREAL(1.00);

	private double valor;

	TipoDeSlot(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
