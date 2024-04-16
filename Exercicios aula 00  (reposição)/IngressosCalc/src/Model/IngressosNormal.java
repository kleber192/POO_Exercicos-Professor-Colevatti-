package Model;

public class IngressosNormal extends Ingressos {

	
	
	
	@Override
	public float valorFinal(float valorTaxa) {
		
		return getValor() + valorTaxa;
			
	}
	
	

}
