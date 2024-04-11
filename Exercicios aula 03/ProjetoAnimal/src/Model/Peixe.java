package Model;

public class Peixe extends Animal{

	private String caracteristica ;
	
  public Peixe() {
	  
	  this.nome = nome ;
	  this.ambiente = ambiente;
	  this.cor = cor ;
	  this.caracteristica = caracteristica;
	  
  }
  
  
  public String getCaracteristica() {
	  
	  return caracteristica;
  }
  
  
  
  public void setCaracteristica(String caracteristica) {
	  
	  this.caracteristica = caracteristica;
	  
  }
  
  
	public void alteraCaracteristica(String caracteristica) {
		
		
		
		setCaracteristica(caracteristica);
		
		
	}
	
	

	
	
	@Override
	public void dados() {
		
		System.out.println("Dados relevantes do animal ");
		System.out.println(" ========================================== ");
		System.out.println("Nome : "+getNome());
		System.out.println("Ambiente : "+getAmbiente());
		System.out.println("cor : "+getCor());
		System.out.println("comprimento : "+getComprimento());
		System.out.println("caracteristica : "+getCaracteristica());
		System.out.println(" ========================================== ");
		
		
		
		
		
	}
	
	
	
	
	
}
