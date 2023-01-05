package bytebank_interface;

public class sistemaInterno {
	private int senha = 2222;

	public void autentica(autenticavel fa) {
		boolean autenticou = fa.autentica (this.senha);
		if(autenticou) {
			System.out.println("voce pode entrar no systema");
		}else {
			System.out.println("voce nao pode entrar no systema");
		}
	}
}
