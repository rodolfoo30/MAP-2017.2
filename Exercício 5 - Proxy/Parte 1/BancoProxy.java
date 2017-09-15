
public class BancoProxy implements BancoUsuarios {

	private int quantidadeDeUsuarios;
	private int usuariosConectados;
	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public void bancoUsuarios() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}

	@Override
	public String getNumeroDeUsuarios() {
		return new String("Total de usuários: " + quantidadeDeUsuarios);
	}

	@Override
	public String getUsuariosConectados() {
		return new String("Usuários conectados: " + usuariosConectados);
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}

}
