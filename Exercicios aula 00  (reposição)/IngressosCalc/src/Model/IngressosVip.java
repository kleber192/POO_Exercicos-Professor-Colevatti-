package Model;

public class IngressosVip extends Ingressos {

	

	@Override
	public float valorFinal(float valorTaxa) {
		
	  	
	  float var = getValor();
	  valorTaxa = 18 ;
		
      float somaPor = (getValor() * valorTaxa / 100) ;
		
		var +=  somaPor ;
		
		return var ;	
	
	}

	
	
	
	
}
