package Controller;

import java.util.Scanner;

import model.CalcularImposto;

public class ControlImposto {

	
	public void calcularImposto(CalcularImposto tipo ) {
		Scanner scan  = new Scanner(System.in);
		
		
		
		if(tipo.getTipo().equals("sao paulo ")) {
			
			
			System.out.println("Digite a area total : ");
			double areaTotal = Double.parseDouble(scan.nextLine());
			
			
			System.out.println(" ====================================");		
			
			System.out.println("Digite o numero de comodos  : ");
			int  numeroComodos = Integer.parseInt(scan.nextLine());
			
			
			double imposto;
			
			 imposto = (areaTotal * 10)+(numeroComodos * 2 ); 
			
			System.out.println("Imposto de SP é : "+imposto  );
			
		}else if (tipo.getTipo().equals("belo horizonte ")) {
			
			
			System.out.println("Digite a area total : ");
			double areaTotal = Double.parseDouble(scan.nextLine());
			
			System.out.println(" ====================================");	
			
			
			System.out.println("Digite o numero de quartos  : ");
			int  numeroQuartos = Integer.parseInt(scan.nextLine());
			
			
			double imposto;
			
			imposto = (areaTotal * 7)+(numeroQuartos * 4 ); 
			
			System.out.println("Imposto de belo horizonte é : "+imposto  );
				
		}else if (tipo.getTipo().equals("porto alegre ")) {
			
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
			
		}else if (tipo.getTipo().equals("curitiba")) {
			
			
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
	
   }
