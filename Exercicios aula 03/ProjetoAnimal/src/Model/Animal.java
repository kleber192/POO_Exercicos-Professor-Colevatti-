package Model;

public class Animal {

	
	protected String nome ;
	protected double comprimento ;
	protected int n_patas = 4 ;
	protected String cor;
	protected String ambiente ;
	protected double  velocidadeMS;
	
	
	
	public Animal() {
		
		
		
		this.nome = nome;
		this.comprimento = comprimento;
		this.n_patas = n_patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMS = velocidadeMS;
		

	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getComprimento() {
		return comprimento;
	}



	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}



	public int getN_patas() {
		return n_patas;
	}



	public void setN_patas(int n_patas) {
		this.n_patas = n_patas;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getAmbiente() {
		return ambiente;
	}



	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}



	public double getVelocidadeMS() {
		return velocidadeMS;
	}



	public void setVelocidadeMS(double velocidade) {
		this.velocidadeMS = velocidade;
	}
	
	
	public void alteraNome(String nome) {
		
		setNome(nome);
	}
	
	
	
	public void alteraComprimento(int comprimento){
		
		setComprimento(comprimento);
		
	}
	public void alteraPatas(int patas) {
		
		setN_patas(patas);
		
	}
	
	
	public void alteraCor(String cor) {
		
		setCor(cor);
	}
	public void alteraAmbiente(String ambiente){
		setAmbiente(ambiente);
	}
	
	public void alteraVelocidade(double velocidade) {
		
		setVelocidadeMS(velocidade);
	}
	
	
	public void dados() {
		
		
		System.out.println("Dados relevantes do animal : ");
		System.out.println(" ========================================== ");
		System.out.println("Nome : "+getNome());
		System.out.println("Ambiente : "+getAmbiente());
		System.out.println("Numero de patas  : "+getN_patas());
		System.out.println("cor : "+getCor());
		System.out.println("comprimento : "+getComprimento());
		System.out.println("velocidade  : "+getVelocidadeMS());
		System.out.println(" ========================================== ");
		

		
	}



	@Override
	public String toString() {
		return "Animal  nome : " + nome + ", comprimento : " + comprimento + ", n_patas :" + n_patas + ", cor=" + cor
				+ ", ambiente : " + ambiente + ", velocidadeMS : " + velocidadeMS + " ";
	}
	
	
	
	
	
	
}
