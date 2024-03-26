package View;

import java.util.Scanner;

import Model.Funcionario;

public class Principal {

	public static void main(String[] args) {
	
         Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite o nome : ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o cargo : ");
		String cargo = scan.nextLine();
		
		System.out.println("Digite o salario : ");
		double salario = Double.parseDouble(scan.nextLine());
		 
		
		Funcionario f = new Funcionario (nome,cargo,salario);
		
		System.out.println("Digite os descontos : ");
		double desconto = Double.parseDouble(scan.nextLine());
		
		System.out.println("Digite os beneficios : ");
		double beneficios = Double.parseDouble(scan.nextLine());
		
		f.getSalarioLiquido(desconto, beneficios);
		
		

	
		
		
		
		
	}

}
