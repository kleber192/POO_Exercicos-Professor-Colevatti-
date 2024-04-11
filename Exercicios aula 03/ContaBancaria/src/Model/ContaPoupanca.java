package Model;

import java.util.Scanner;

public class ContaPoupanca extends ContaModel {


	private int diaRendimento ;
	
	public int getDiaRendimento() {
		
		
		return diaRendimento;
		
	}
	
	
	public void setDiaRendimento() {
		
		
   this.diaRendimento = diaRendimento ;
		
		
	}
	
	
	@Override
	public void setDepositar() {
		
		super.setDepositar();
	}
	
	
	
	@Override
	public double getSaque() {
		
		return super.getSaque();
	}
	
	    public double calculadorNovoSaldo() {
		
		
		System.out.println("Analise de saldo poupanca  ");
		System.out.println(" ========================================");
		 
		
		 
		 diaRendimento = 18 ;	
		 double var = getSaldo();
	     double taxa = 1.3 / 100 ; 
		
	     for(int i = 0 ; i < diaRendimento ; i++ ) {
	
	
	        var = var *= taxa;    
	        
	     }		
	     
	     
	     System.out.println("valor com juros de  "+diaRendimento+"Dias é : "+var);
		  return var;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
}
