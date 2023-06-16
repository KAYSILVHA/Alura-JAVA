
public class SistemaInterno {
	private int senha = 12345;
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentifica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		}else {
			System.out.println("Nao pode entrar no sistema");
		}
	}
}
