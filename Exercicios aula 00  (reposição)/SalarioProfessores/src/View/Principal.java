package View;

import java.util.Scanner;

import Model.ProfessorReserva;
import Model.ProfessorTitular;

public class Principal {

	public static void main(String[] args) {
		
		
	ProfessorReserva r = new ProfessorReserva();
	ProfessorTitular t = new ProfessorTitular();
	Scanner s = new Scanner(System.in);
	
 System.out.println("Sistema para Calculo de Salario do professor Reserva! ");
	System.out.println("===============================================");
	System.out.println("===============================================");
	
	
	System.out.println(" Digite o Nome : ");
	r.setNome(s.nextLine());
	
	System.out.println("Digite a Idade : ");
	r.setIdade(Integer.parseInt(s.nextLine()));
	
	System.out.println("Digite a Matricula : ");
	r.setMatricula(s.nextLine());
	
	System.out.println("Digite a quantidade de horas trabalhadas : ");
	r.setHoraAula(Integer.parseInt(s.nextLine()));
	
	System.out.println("Digite o valor das horas trabalhadas : ");
	r.setValorAula(Double.parseDouble(s.nextLine()));
	
	System.out.println(" O salario do professor reserva é : "+r.calcSalario());
	
	
	System.out.println("===============================================");
	System.out.println("===============================================");
	
	
	 System.out.println("Sistema para Calculo de Salario do professor titular ! ");
		System.out.println("===============================================");
		System.out.println("===============================================");
		
		
		System.out.println(" Digite o Nome : ");
		t.setNome(s.nextLine());
		
		System.out.println("Digite a Idade : ");
		t.setIdade(Integer.parseInt(s.nextLine()));
		
		System.out.println("Digite a Matricula : ");
		t.setMatricula(s.nextLine());
		
		System.out.println("Digite a Quantidade de anos na instituição : ");
		t.setAnosDeinstituicao(Integer.parseInt(s.nextLine()));
		
		System.out.println("Digite o salario fixo : ");
		t.setSalario(Double.parseDouble(s.nextLine()));
		
		
		System.out.println(" O salario do professor tutular  é : "+t.calcSalario());
	

	}

}
