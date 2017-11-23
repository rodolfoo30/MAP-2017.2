
public enum ProdutosEnum {
	
	COCA("COCA", 4.0),FANTA("FANTA", 3.0),SPRIT("SPRIT", 3.5);

	private double valor;
	private String nome;

	ProdutosEnum(String nome, double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
