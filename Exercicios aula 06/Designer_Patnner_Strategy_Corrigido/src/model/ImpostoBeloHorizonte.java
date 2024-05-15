package model;

import java.util.Scanner;

public class ImpostoBeloHorizonte implements CalcularImpostoStrategy {

	@Override
	public void calcular() {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a area total : ");
		double areaTotal = Double.parseDouble(scan.nextLine());
		
		System.out.println(" ====================================");	
		
		
		System.out.println("Digite o numero de quartos  : ");
		int  numeroQuartos = Integer.parseInt(scan.nextLine());
		
		
		double imposto;
		
		imposto = (areaTotal * 7)+(numeroQuartos * 4 ); 
		
		System.out.println("Imposto de belo horizonte é : "+imposto  );
		
	}

}
