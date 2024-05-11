package model;

public class Carga extends Veiculo {

	
	private int cargMaxima;
	private int taxa ;
	
	
	
	
	
	
	public final int getCargMaxima() {
		return cargMaxima;
	}






	public final void setCargMaxima(int cargMaxima) {
		this.cargMaxima = cargMaxima;
	}






	public final int getTaxa() {
		return taxa;
	}






	public final void setTaxa(int taxa) {
		
		this.taxa = taxa;
	}




	@Override
	public String toString() {
		return "Carga [cargMaxima=" + cargMaxima + ", taxa=" + taxa + ", getPlaca()=" + getPlaca() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getCor()=" + getCor() + ", getRodas()=" + getRodas()
				+ ", getVelMaxima()=" + getVelMaxima() + ", getMotor()=" + getMotor() + "]";
	}






	@Override
	public double valcVelocidade(float VelMaxima) {
		
		
		 VelMaxima  = VelMaxima / 100000  ;	
			
			return VelMaxima;
	}
	
	
	
	
	
	
	
	
}
