package model;

public class Integral extends Funcionario{

	private int bancoHoras;
	
	
	
	
public Integral() {
	
	super();
}	
	


public int getBancoHoras() {
	
	return bancoHoras;
}


public void setBancoHoras(int bancoHoras) {
	
	
	this.bancoHoras = bancoHoras;
}



@Override
public String toString() {
	return "Funcionario Parcial  :  banco de horas  : " + bancoHoras + " , nome do funcionario : " + nome + ", id do funcionario : " + id
			+ ", salario : " + salario ;
}



}
