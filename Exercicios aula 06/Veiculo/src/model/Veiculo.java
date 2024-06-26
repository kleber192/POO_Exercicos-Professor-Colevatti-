package model;

public abstract class Veiculo {

	
	private String  placa ;
	private String  marca ;
	private String  modelo ;
	private String  cor ;
	private int  rodas ;
	private float  velMaxima ;
    private Motor motor;
    
    
    
	public Veiculo() {
		super();
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public float getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(float velMaxima) {
		this.velMaxima = velMaxima;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor ;
	}	
	
    
    
	public abstract double valcVelocidade(float VelMaxima);
    
    
}
