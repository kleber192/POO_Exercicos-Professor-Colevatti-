package Model;



public class Mamifero extends Animal{

	private String alimento ;
	
public String getAlimento() {
		return alimento;
	}


	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}


public Mamifero () {
	
	  this.nome = nome ;
	  this.n_patas = n_patas; 
	
	
	
}
		
		
		public void alteraAlimento(String alimento) {
			
			
			setAlimento(alimento);
			
			
		}
		
		
		
		@Override
		public void dados() {
			
			System.out.println("Dados relevantes do animal ");
			System.out.println(" ========================================== ");
			System.out.println("Nome : "+getNome());
			System.out.println("Ambiente : "+getAmbiente());
			System.out.println("cor : "+getCor());
			System.out.println("comprimento : "+getComprimento());
			System.out.println("alimento : "+getAlimento());
			System.out.println(" ========================================== ");
			
			
		}
	
	
	
	
	
}
