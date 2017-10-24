
public class Main {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario(Cargo.DESENVOLVEDOR, 2100, 1);
		System.out.println(funcionario1.cargo.calcularGratificacao(funcionario1));

		Funcionario funcionario2 = new Funcionario(Cargo.GERENTE, 4200, 2);
		System.out.println(funcionario2.cargo.calcularGratificacao(funcionario2));

	}
}