package bytebank;

public class Conta {
	
	public double saldo;
	public String agencia;
	public int numero;
	public String titular;
	
	
	
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	 public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo-= valor;
			return true;
		}else {
			return false;
		}
		
	}
	 
	 
	 public boolean transfere(double valor, Conta destino){
		 if(this.saldo>= valor) {
			 this.saldo -=valor;
			 destino.deposita(valor);
		 }
		 return false;
		 
	 }
}
