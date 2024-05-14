package model;

public class Parcial extends Funcionario{

	private int horaEntrada;
	private int horaSaida;
	
	
	public Parcial() {
		super();
	}


	public int getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}


	public int getHoraSaida() {
		return horaSaida;
	}


	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}


	@Override
	public String toString() {
		return "Funcionario Parcial  : hora de entrada  : " + horaEntrada + ", hora de saida  : " + horaSaida + " , nome do funcionario : " + nome + ", id do funcionario : " + id
				+ ", salario : " + salario ;
	}
	
}
