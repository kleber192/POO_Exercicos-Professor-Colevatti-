package Model;

public class ProfessorReserva extends Professor{

	private int horaAula;
	private double valorAula;
	
	
	
	
public int getHoraAula() {
		return horaAula;
	}




	public void setHoraAula(int horaAula) {
		this.horaAula = horaAula;
	}




	public double getValorAula() {
		return valorAula;
	}




	public void setValorAula(double valorAula) {
		this.valorAula = valorAula;
	}




public ProfessorReserva(){
	
	this.horaAula = horaAula ; 
	this.valorAula = valorAula ; 
	
	
}




@Override
public double calcSalario() {
	
	
	double salTotal = horaAula * valorAula ;
	
	return salTotal;
	
	
}
	




	
	
}
