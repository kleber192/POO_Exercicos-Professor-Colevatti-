package Model;

public abstract class Aluno {

	
	protected String ra ;
    protected String nome;
    protected String email ;
    protected double mediaNotas;
    protected String qtdAprovacoes;
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMediaNotas() {
		return mediaNotas;
	}
	public void setMediaNotas(double mediaNotas) {
		this.mediaNotas = mediaNotas;
	}
	public String getQtdAprovacoes() {
		return qtdAprovacoes;
	}
	public void setQtdAprovacoes(String qtdAprovacoes) {
		this.qtdAprovacoes = qtdAprovacoes;
	} 
	
	
	public abstract double percentualRendimento(Aluno alu) ;
	
	
	public abstract double percentualProgressao(Aluno alu) ;
	
	
	
	
}
