package model;

public class ModelTeste {


	   
	   
	 public static void metodo1() throws Exception{
		 
	    System.out.println("Inicio do m�todo 1");
	      metodo2();
	    System.out.println("Fim do m�todo 1");
	    
	}


	 public static void metodo2() throws ArithmeticException {
		 
		 
	     System.out.println("Inicio do m�todo 2");
	     int[] vetor = new int[10];
	  
	      for (int i = 0 ; i <= 15; i++){
	       vetor[i] = i;
	       System.out.println(i);
	            if (i == 9) {
	       int vlr = vetor[i] / vetor[0];
	         System.out.println(vlr);
	  }
	}
	    
	System.out.println("Fim do m�todo 2");
	
	   }
	
	

	
	
	
}
