package view;

import model.ModelTeste;

public class Principal {

	public static void main(String[] args) {
	
		
		ModelTeste t =new ModelTeste();
		
	    try {
			
		       System.out.println("Inicio do main");
		         t.metodo1();
		        System.out.println("Fim do main");
			
		} catch (Exception e) {
			
		     //	e.printStackTrace();
			
			System.out.println(" divisão por zero não pode ! ");
		}
		
		try {
			t.metodo2();
		} catch (Exception e) {
			
			
			System.out.println(" divisão por zero não pode ! ");
			
		}

	}

}
