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
	public double getSaque() {
		
		System.out.println("Op��o para saque da Conta Especial : ");
		System.out.println("=============================");
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Digite o valor para saque  ! : ");
		double saque  = Double.parseDouble(s.nextLine());
		
	    limite = -300 ;
	     
	    double var = getSaldo();
	
	
		 if (getSaldo() - saque >= limite  ) {
			 
			 var = var -= saque ;
			 System.out.println("valor sacado �  : "+saque+" valor restante : "+var);	 
			
		    }else {
		
		 System.out.println("Limite n�o disponivel ,permitido valor at� : "
		 +limite+"valor disponivel : "+getSaldo()+" Valor de pedido para sacar : "+saque); 
		 
	      }
	
	    return getSaldo();
	}
	
	
}
