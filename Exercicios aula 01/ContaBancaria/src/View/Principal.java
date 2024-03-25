package View;
import java.util.Scanner;

import Model.ContaBancaria;


public class Principal {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Digite o numero da conta : ");
	int conta = Integer.parseInt(scan.nextLine());
	
	System.out.println("Digite o saldo : ");
	double saldo = Double.parseDouble(scan.nextLine());
	
	System.out.println("Digite o nome do titular : ");
	String nome  = scan.nextLine();
	
	
	double valor;
	ContaBancaria contas = new ContaBancaria(nome,saldo,conta);	
	
	
	System.out.println("Digite o valor de Deposito ");
	
	valor = Double.parseDouble(scan.nextLine());
	contas.realizarDeposito(valor);
	
	
    
	System.out.println("Digite o valor de Saque ");
	valor = Double.parseDouble(scan.nextLine());
	contas.realizarSaque(valor);
	
	
	}

}
