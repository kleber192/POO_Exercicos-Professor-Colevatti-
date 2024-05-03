package view;

import controller.ControlOpe;

public class Principal {

	public static void main(String[] args) {
		
		
		ControlOpe o = new ControlOpe();
		
      try {
	
    	  o.operacaoValor(5);	
    	  System.out.println(" Resultado :  " + o.operacaoValor(5));
    	  
       } catch (Exception e) {
	
    	 System.out.println(" parâmetro não pode ser negativo ");  
    	   
     }
		
		
		
      try {
    		
    	  System.out.println(" Resultado :  " + o.operacaoValor(-26));  
    	  
       } catch (Exception e) {
	
    	 System.out.println(" parâmetro não pode ser negativo ");  
    	   
     }
		
      try {
  		
    	  System.out.println(" Resultado :  " + o.operacaoValor(25));	  
    	  
       } catch (Exception e) {
	
    	 System.out.println(" parâmetro não pode ser negativo ");  
    	   
     }
      
		
	}

}
