package Model;

public abstract class Aluno {

	
	protected String nome ;
	protected String ra  ; 
	protected String email ;
    protected float mediaNotas ; 
    protected String qtdAprovacoes;
    
    
    
  public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMediaNotas() {
		return mediaNotas;
	}
	public void setMediaNotas(float mediaNotas) {
		this.mediaNotas = mediaNotas;
	}
	public String getQtdAprovacoes() {
		return qtdAprovacoes;
	}
	public void setQtdAprovacoes(String qtdAprovacoes) {
		this.qtdAprovacoes = qtdAprovacoes;
	}
	
	


	public abstract double percentualRendimento( Aluno alu );
	 
	 
	 public abstract double percentualProgressao(Aluno alu );
    
	
	
	
	
	
	
	
	
}
