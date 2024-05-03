package controller;

public class ControlOpe {

	
	
	public int operacaoValor(int valor ) throws ArithmeticException {
		
		int res = 0;
		     if (valor > 0 ) {
		    	 
		         if(valor % 2 == 0) {
			
		             res =  (int) Math.pow(valor, 2);
			
		      }else {
			
		             res =  (int) Math.pow(valor, 3);
		 
		   }
		     }else {
		    	 
		    	 
		    	 throw new ArithmeticException();
		     }
		
		return res;
	} 
	
	
	
	
}
