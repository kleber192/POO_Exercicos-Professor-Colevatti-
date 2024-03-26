package Model;

public class Funcionario {

	

	
	   String nome ;
	   String cargo ;
	   double salario ; 
	   
	   
	   
	   public Funcionario(String nome,String cargo,double salario) {
		  
		double sal = 1412.00;
		
		if (salario >= sal) {
		   
		   
		   this.nome = nome ;
		   this.cargo = cargo;
		   this.salario = salario ;
		   	   
		}else {
			
			
			System.out.println("  Salario abaixo do esperado Digite salario novamente ");
		}
		
		
	   }



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
		
		
	 
	public String getCargo() {
		
		
		return cargo;
	}
		


	public void setCargo(String cargo) {
		
		
		
		this.cargo = cargo ;
		
	}



	public double getSalario() {
		
		
		
		return salario ;
	}


	public void setSalario(double salario) {
		
		this.salario = salario;
	}



	public String toString() {
		
		
		
		return " Nome :"+ nome +" Cargo : "+ cargo +" Salario :"+salario;
	}


	public void getSalarioLiquido(double desconto ,double beneficios) {
		
		
		
		double salLiquido = salario + beneficios - desconto ; 
		
		
	   System.out.println(" o salario total é : "+salLiquido);	
		
		
		
	}

}
