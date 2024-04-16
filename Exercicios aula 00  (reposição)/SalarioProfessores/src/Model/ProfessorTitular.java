package Model;

public class ProfessorTitular extends Professor{

	
	private int anosDeinstituicao; 
	private double salario;
	
	
	
public ProfessorTitular() {
	
	this.anosDeinstituicao = anosDeinstituicao;
	this.salario = salario;
	
}
	
	public int getAnosDeinstituicao() {
		return anosDeinstituicao;
	}



	public void setAnosDeinstituicao(int anosDeinstituicao) {
		this.anosDeinstituicao = anosDeinstituicao;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public double calcSalario() {
	
		
	double somaPor = (salario * 5.00 / 100) * ( anosDeinstituicao / 5 ) ;
		
	   salario = salario += somaPor ;
	
		
		return salario;
	}

	
	

}
