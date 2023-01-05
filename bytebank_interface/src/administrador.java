
public class administrador extends funcionario implements autenticavel {

	private int senha;
	
		public double bonificacao(int senha) {
			return 50;
		}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}
}
