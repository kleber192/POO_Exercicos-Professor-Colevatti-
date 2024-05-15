package model;

public enum CalcularImposto {

	 SAOPAULO("sao paulo "),BELOHORIZONTE(" belo horizonte "),
	 PORTOALEGRE(" porto alegre "),CURITIBA("curitiba ");	
		
	  private String tipo ;
	  
	  
	  
	  
   CalcularImposto(String tipo){
		  
		 this.tipo = tipo ; 
		  
	  }
	  
	  public String getTipo() {
		  
		  return tipo;
		  
	  }
	
	
}
