
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autentificador;

	
	@Override
	public double getBonificacao() {
		return 50;
	}
	


	
	public Administrador(){
		this.autentificador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);
		
	}

	@Override
	public boolean autentifica(int senha) {
		boolean autenticou = this.autentificador.autentifica(senha);
		return autenticou;
		}
	
}
		