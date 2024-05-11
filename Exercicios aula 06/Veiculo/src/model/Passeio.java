package model;

public final class Passeio extends Veiculo {

	
	private int qtdPassageiros;
	


	public final int getQtdPassageiros() {
		return qtdPassageiros;
	}





	public final void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	
	@Override
	public double valcVelocidade(float VelMaxima) {
		
	   VelMaxima  = VelMaxima / 1000  ;	
		
		return VelMaxima;
	}




}
