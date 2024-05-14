package Controller;

import java.util.Scanner;

import model.Funcionario;
import model.Parcial;

public class ControlParcial extends FuncionarioFactory{

	@Override
	public Funcionario contratarFuncionario() {
		
		Parcial p = new Parcial();
		
         Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Cadastro de Funcionario Parcial !!!");
		System.out.println(" ");
		
		System.out.println("Digite o nome do funcionario : ");
		p.setNome(scan.nextLine());
		
		System.out.println("Digite o ID do funcionario  : ");
		p.setId(scan.nextLine());
		
		System.out.println("Digite o horario de entrada  funcionario  : ");
		p.setHoraEntrada(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Digite o horario de saida  funcionario  : ");
		p.setHoraEntrada(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Digite o Salario do funcionario  : ");
		p.setSalario(Double.parseDouble(scan.nextLine()));

		
		
		return p;
	}

	
	
	
	
	
	
}
