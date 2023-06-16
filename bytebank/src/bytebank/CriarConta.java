package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		
		
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println(segundaConta.saldo);
		
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma conta");
		}else {
			System.out.println("Nao sao Iguais");
		}
		
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
