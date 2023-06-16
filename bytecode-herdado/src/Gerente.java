
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autentificador;
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente ");
			return super.getSalario();
		}
	

	
	public Gerente() {
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
	
