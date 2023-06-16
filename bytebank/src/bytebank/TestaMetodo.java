package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conseguiuRetirar);
		System.out.println(conta.saldo);
		
		
		
	
		
		Conta contaYukiji = new Conta();
		contaYukiji.deposita(2000);
		contaYukiji.transfere(300, conta);
		if(contaYukiji.transfere(300, conta)) {
			System.out.println("Transferencia realizada com sucesso!");
		}else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println(contaYukiji.saldo);
		System.out.println(conta.saldo);
	}
}
