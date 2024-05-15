package model;

import java.util.Scanner;

public class ImpostoCuritiba implements CalcularImpostoStrategy{

		@Override
		public void calcular() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a area total : ");
			double areaTotal = Double.parseDouble(scan.nextLine());
			
			System.out.println(" ====================================");
			
			System.out.println("Digite a idade do imovel  : ");
			int  imovel  = Integer.parseInt(scan.nextLine());
			
			
			double imposto ;
			
			
			 imposto = (areaTotal * 5 );
			
			if (imovel > 50 ) {
			
			  imposto = imposto + (imovel *3); 
			
			System.out.println("Imposto de curitiba  é : "+imposto  );
			
			}else if (imovel < 20 ){
				
				imposto = imposto + (imovel *2);  
			
				System.out.println("Imposto de curitiba  é : "+imposto  );
			
		    }else if (imovel > 20 && imovel < 50) {
		    	
		    	imposto = imposto + (imovel *2.5); 
		    	
		    	
		    	System.out.println("Imposto de curitiba  é : "+imposto  );
		    
		        }else {
		        	
		        	System.out.println("Erro " );	
		        	
		        }	
			
			
		}
	   
    }

 

