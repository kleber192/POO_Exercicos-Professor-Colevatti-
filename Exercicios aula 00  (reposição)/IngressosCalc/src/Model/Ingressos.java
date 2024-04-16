package Model;

public abstract class Ingressos {

	
	private String codigoVer;
	private float valor ;
	
	
	public String getCodigoVer() {
		return codigoVer;
	}
	public void setCodigoVer(String codigoVer) {
		this.codigoVer = codigoVer;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public abstract float valorFinal(float valorTaxa ) ;
		
}
