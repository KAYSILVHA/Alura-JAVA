
public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.setNumero(1337);
		
		
		System.out.println(conta.getNumero());
		
		
		
		
		Cliente kay = new Cliente();
		
		kay.setNome("Kay Silva");
		conta.setTitular(kay);
		
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programadora");
		
		
		
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programadora");
		
		
		System.out.println(titularDaConta);
		System.out.println(kay);
		System.out.println(conta.getTitular());
	
	}

}
