package View;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import Model.Pessoa;


public class Principal {

	public static void main(String [] args ) {
		
	Scanner scan = new Scanner(System.in);
	DateTimeFormatter dfm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String sdata ;
	
	
	Pessoa p = new Pessoa();
	
	
	System.out.println("Digite o nome : ");
	p.setNome(scan.nextLine());
	
	System.out.println("Digite a Data de nascimento  : ");
	sdata = scan.nextLine();
	p.setLocalDate(sdata, dfm);
	
	
	System.out.println("Digite a sua Profissão : ");
	p.setProfissao(scan.nextLine());
	
	p.calcularData();
	
	System.out.println(p);
	
	}
	
	
	
}
