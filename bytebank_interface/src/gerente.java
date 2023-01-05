import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class gerente extends funcionario implements autenticavel {

	public double getbonificacao() {
		System.out.println("Chamando o metado bonificacao do Gerente");
		return super.getSalario();
	}

	private int senha;

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
