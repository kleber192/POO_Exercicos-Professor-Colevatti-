package Model;

import java.util.Scanner;

public class ContaEspecial extends ContaModel {

	
	
	private float limite ; 
	
	
	public float getLimite() {
		
		return limite ;
	}
	
	
	
	public void setLimite() {
		
		
		
		this.limite = limite ;
	}
	
	
	
	@Override
	public double getSaque(double saque) {
		
		
		System.out.println("passo para saque do dinheiro :  ");
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Digite o valor para saque ! ");
		saque  = Double.parseDouble(s.nextLine());	
		
	    double limite = -300 ;
	    double var2 = getSaldo();	
	
	
		 if (saque < limite ) {
			 
			System.out.println("Limite não disponivel ,permitido valor até : "+limite); 
		 }
		
	    var2 = getSaldo() - saldo ;
	    
	       System.out.println("valor sacado é  : "+saque+" valor restante : "+var2);
		 
		return super.getSaque(saque);
	}
	
	
	
	
	
}
