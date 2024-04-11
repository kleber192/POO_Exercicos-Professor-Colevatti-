package Model;

import java.io.InputStream;
import java.util.Scanner;

public class ContaModel {

	
	protected String nome ;
	protected int num_conta;
	protected double saldo;
	
	
public ContaModel(){
	
	
	this.nome = nome;
	this.num_conta = num_conta;
	this.saldo = saldo ;
		
}
	


public String getNome() {
	
	
	return nome ;
}



public void setNome(String nome ) {
	
  this.nome = nome ;
  	
}



public int  getNumConta() {
	
	return num_conta ;
}



public void setNumConta(int num_conta ) {
	
  this.num_conta = num_conta ;
	
}




public double getSaldo() {
	
	
	return saldo ;
}



public void setSaldo(double saldo ) {
	
	
  this.saldo = saldo ;
  
	
	
}



public double getSaque() {
	
	System.out.println("Opção para saque ");
	System.out.println("=============================");
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("Digite o valor para saque  ! ");
	double saque  = Double.parseDouble(s.nextLine());
	
	  if (saldo < saque ) {
		  
		  
	   saldo = saldo - saque ;	  
		  
	      return saque ;
	      
	  }else {
		  
		  
		System.out.println("Saldo em conta insuficiente saldo : "+getSaldo());  
		  
		  
		  
	  }
	  
	return saldo;
}
	



public void setDepositar() {
	
	System.out.println("Opção para deposito ");
	System.out.println("=============================");
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("Digite o valor do deposito ! ");
	double deposito  = Double.parseDouble(s.nextLine());
	
	saldo = saldo + deposito;
	
	System.out.println("Saldo depositado com susseso! , novo saldo é : "+getSaldo());
	
	
}



@Override
public String toString() {
	
	return "Nome do usuario : "+nome+" Numero da conta : "+num_conta+"saldo : "+saldo;
}

}
