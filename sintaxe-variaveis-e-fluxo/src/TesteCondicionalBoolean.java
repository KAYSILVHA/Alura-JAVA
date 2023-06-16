public class TesteCondicionalBoolean {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo!");
		}else {
			System.out.println("infelizmente, voce nao pode entrar");
		}
	}
}
