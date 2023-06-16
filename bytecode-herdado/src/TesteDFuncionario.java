
public class TesteDFuncionario {

	public static void main(String[] args) {
		Gerente kay = new Gerente();
		
		kay.setNome("Kay Silva");
		kay.setCpf("123.321.312-23");
		
		kay.setSalario(2600.00);
		
		
		System.out.println(kay.getNome());
		System.out.println(kay.getBonificacao());
	}

}
