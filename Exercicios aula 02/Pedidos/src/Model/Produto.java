package Model;

public class Produto {

	private int codigo ;
	private double valor;
	private String descricao;
	
	
	public Produto(){
		
		
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		
		
	}
	
	
	public int getCodigo(){
			
		return codigo ;
	}
	
	
	public void setCodigo(int codigo) {
			
		
		this.codigo = codigo ;
	}
	
	
	public double getValor() {
			
		return valor ;
	}
	
	
	public void setValor(double valor) {
			
		this.valor = valor;
		
	}
	
	
	public String getDescricao() {
		
		return descricao ; 
	}
	
	public void setDescricao(String descicao) {
				
		this.descricao = descricao;
	}
	
	
	
	
}
