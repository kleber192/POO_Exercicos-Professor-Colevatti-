package model;

import java.util.Scanner;

public class ImpostoPortoAlegre implements CalcularImpostoStrategy {

	
	
	

	@Override
	public void calcular() {
		
		    Scanner scan = new Scanner(System.in);
		    
			System.out.println("Digite a area total : ");
			double areaTotal = Double.parseDouble(scan.nextLine());
			
			System.out.println(" ====================================");	
			
			System.out.println("Digite a area da garagem  : ");
			int  areaGaragem = Integer.parseInt(scan.nextLine());
			
			
			double imposto ;
			
			if (areaGaragem > 0 ) {
			
			imposto = (areaTotal * 7.5)+(areaGaragem * 2.5 ); 
			
			System.out.println("Imposto de Porto alegre é : "+imposto  );
			
			}else {
				
			imposto = (areaTotal * 8) ; 
			
			System.out.println("Imposto de Porto alegre é : "+imposto  );
				
			}
		
		
	}
	
	
	
	
	
	
	
	
}
