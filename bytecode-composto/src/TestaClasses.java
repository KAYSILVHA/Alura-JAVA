
public class TestaClasses {
	public static void main(String[] args) {
		Cliente kay = new Cliente();
		kay.nome = "Kayra da Silva";
		kay.cpf = "123.321.231-13";
		kay.profissao = "FullStack Developer";
		
		
		
		
		Conta contaDaKay = new Conta();
		contaDaKay.deposita(200);
		
		
		
		contaDaKay.titular = kay;
		System.out.println(contaDaKay.titular.nome);
		}
}
