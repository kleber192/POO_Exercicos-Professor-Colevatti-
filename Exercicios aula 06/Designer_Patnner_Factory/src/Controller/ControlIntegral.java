package Controller;

import java.util.Scanner;

import model.Funcionario;
import model.Integral;

public class ControlIntegral extends FuncionarioFactory {

	@Override
	public Funcionario contratarFuncionario() {
		
		Integral i = new Integral();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Cadastro de Funcionario Integral !!!");
		System.out.println(" ");
		
		System.out.println("Digite o nome : ");
		i.setNome(scan.nextLine());
		
		System.out.println("Digite o ID do funcionario  : ");
		i.setId(scan.nextLine());
		
		System.out.println("Digite o Banco de horas do funcionario  : ");
		i.setBancoHoras(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Digite o Salario do funcionario  : ");
		i.setSalario(Double.parseDouble(scan.nextLine()));
		
		return i;
	}

  
}
