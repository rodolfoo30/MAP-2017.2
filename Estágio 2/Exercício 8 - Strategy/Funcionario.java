
public class Funcionario {

	protected double salarioBase;
	protected int nivel;
	protected Gratificacao estrategiaDeGratificacao;
	protected Cargo cargo;

	public Funcionario(Cargo cargo, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		this.cargo = cargo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double calcularGratificacao() {
		return estrategiaDeGratificacao.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public int getNivel() {
		return nivel;
	}

}
