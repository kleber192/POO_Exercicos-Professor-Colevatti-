package view;

import model.ContaModel;

public class Principal {

	public static void main(String[] args) {
		
		
		ContaModel c = new ContaModel();
		
		System.out.println("deposito feito ! valor : "+c.depositaConta(500));
		
		try {
			
			 c.sacaConta(77700);
			 
		} catch (ArithmeticException e) {
			
			System.out.println("Saque não feito valor maior que saldo! /"
					+ " saldo disponivel : "+c.getSaldo());
			System.out.println(" ");
			
		}
		
		
		System.out.println("deposito feito ! valor : "+c.depositaConta(700)); 
		
		
		try {
			 c.sacaConta(700);
			 
		} catch (ArithmeticException e) {
			
			System.out.println("Saque não feito valor maior que saldo! /"
					+ " saldo disponivel : "+c.getSaldo());
			System.out.println(" ");
			
		}
		
		
	}

}
