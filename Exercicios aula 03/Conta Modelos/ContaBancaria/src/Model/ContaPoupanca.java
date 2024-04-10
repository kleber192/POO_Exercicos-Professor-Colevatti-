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
	
	
	
	public double calculadorNovoSaldo() {
		
		
		System.out.println("Passo para deposito da poupanca ! ");
		
		System.out.println(" ========================================");
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do deposito ! ");
		double deposito  = Double.parseDouble(s.nextLine());
		
		
	   double taxa = 1.3  / 100 ; 
		
	   double saldoN = getSaldo();
	
	
	   saldoN = saldoN *= taxa;
			
		return saldoN;
		
	}
	
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
}
