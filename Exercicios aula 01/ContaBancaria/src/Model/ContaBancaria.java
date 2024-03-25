package Model;

public class ContaBancaria {

	
	String nome;
	int numeroConta ;
	double saldo ;
	
	
	public ContaBancaria(String nome,double saldo,int conta) {
		
		
	this.nome = nome;
	this.saldo = saldo;
	this.numeroConta = conta; 
	
		
		
	}
	
	
	public void realizarDeposito(double valor) {
		
	
	saldo = saldo + valor;
	
	System.out.println("Deposito feito com Susseso ! seu novo valor é : "+saldo);
		
	}
	
   public void realizarSaque(double valor) {
		
		
	   saldo = saldo - valor;
	   System.out.println("Saque feito com Susseso ! seu novo valor é : "+saldo);
		
	}
	
}
