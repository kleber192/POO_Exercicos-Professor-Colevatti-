package Model;

public class Musicas {

	

	private String nome ;
	private String descricao; 
	private String autor ; 
	
	
	public Musicas() {
		
		
	this.nome = nome;
	this.descricao = descricao;
	this.autor = autor;
		
		
	}
	
	
	
	public String getNome () {
		
		return nome ;
	}
	
	
	public void setNome(String nome) {
		
			
		this.nome = nome ;
		
	}
	
	
	
    public String getDescricao () {
		
		return nome ;
	}
	
	
	public void setDescricao(String descricao ) {
		
			
		this.descricao = descricao ;
		
	}
	
	 public String getAutor () {
			
			return autor ;
		}
		
		
		public void setAutor(String autor ) {
			
				
			this.autor = autor ;
			
		}
	
	
	public String toString() {
		
		return " Nome : " +nome+ "  Autor : " +autor+ " descrição : "+descricao  ;
		
		
	}
	
	
	
}
