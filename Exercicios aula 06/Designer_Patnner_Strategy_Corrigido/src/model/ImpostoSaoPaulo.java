package model;

import java.util.Scanner;

public class ImpostoSaoPaulo implements CalcularImpostoStrategy{

	@Override
	public void calcular() {
		
	       Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a area total : ");
		double areaTotal = Double.parseDouble(scan.nextLine());
		
		
		System.out.println(" ====================================");		
		
		System.out.println("Digite o numero de comodos  : ");
		int  numeroComodos = Integer.parseInt(scan.nextLine());
		
		
		double imposto;
		
		 imposto = (areaTotal * 10)+(numeroComodos * 2 ); 
		
		System.out.println("Imposto de SP é : "+imposto  );
		
		
	}

}
