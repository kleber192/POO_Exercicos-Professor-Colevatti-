package model;

import java.util.Scanner;

public class ContaModel {

	
	private int agencia ;
	private int codigo; 
	private int saldo; 
	private float limite;
	
	public ContaModel() {
		super();
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	public float depositaConta(int valor ) {
		
		
		
		saldo = saldo + valor;
		
		return saldo ;
		
		
	}
	
	
   public float sacaConta( int valor ) throws ArithmeticException {
		
		
		        if (saldo > valor) {
		        	
		        saldo = saldo - valor;
		        
		        System.out.println("Saque feito !!");
		 
		        }else {		  
		         
		        	throw new  ArithmeticException();
		        	
		        }
		        
		      return saldo ;
		
		
	}
	
}
