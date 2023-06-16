
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Yukiji");
		g1.setCpf("12301978835");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(12345);
		
		boolean autenticou = g1.autentifica(12345);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
	}

}
