
public class Cliente implements Autenticavel {
	private AutenticacaoUtil autentificador;
	
	public Cliente() {
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
	