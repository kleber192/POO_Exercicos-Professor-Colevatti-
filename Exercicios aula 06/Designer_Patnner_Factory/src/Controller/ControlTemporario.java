package Controller;

import java.util.Scanner;

import model.Funcionario;
import model.Temporario;

public class ControlTemporario extends FuncionarioFactory {

	@Override
	public Funcionario contratarFuncionario() {
		
		
		Temporario t = new Temporario();
		
		 Scanner scan = new Scanner(System.in);
			
			
			System.out.println("Cadastro de Funcionario Parcial !!!");
			System.out.println(" ");
			
			System.out.println("Digite o nome do funcionario : ");
			t.setNome(scan.nextLine());
			
			System.out.println("Digite o ID do funcionario  : ");
			t.setId(scan.nextLine());
			
			System.out.println("Digite o ano de saida  funcionario  : ");
			t.setAno(Integer.parseInt(scan.nextLine()));
			
			System.out.println("Digite o mes de saida  funcionario  : ");
			t.setMes(Integer.parseInt(scan.nextLine()));
			
			System.out.println("Digite o dia de saida  funcionario  : ");
			t.setDia(Integer.parseInt(scan.nextLine()));
			
			System.out.println("Digite o Salario do funcionario  : ");
			t.setSalario(Double.parseDouble(scan.nextLine()));
		
		return t;
	}

}
