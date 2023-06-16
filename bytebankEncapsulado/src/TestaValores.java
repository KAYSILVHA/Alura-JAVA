
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 1222);
	
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1234, 5678);
		
		
		System.out.println(Conta.getTotal());
		
		
	}
}
