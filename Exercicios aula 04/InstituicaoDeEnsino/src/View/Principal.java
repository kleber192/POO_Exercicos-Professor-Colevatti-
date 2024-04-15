package View;

import java.util.Scanner;

import Model.AlunoSuperior;
import Model.AlunoTecnico;

public class Principal {

	public static void main(String[] args) {
		
		
		AlunoTecnico a = new AlunoTecnico();
		
		AlunoSuperior s = new AlunoSuperior();
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Sistema Academico para analise Tecnica : ");
		
		System.out.println("==========================================");
		System.out.println("==========================================");
		
		
		System.out.println("======  digite o nome : =======");
		a.setNome(scan.nextLine());
		
		System.out.println("======  digite o email : =======");
		a.setEmail(scan.nextLine());
		
		System.out.println("======  digite o ra : =======");
		a.setRa(scan.nextLine());
		
		System.out.println("======  digite a quantidade de aprovações : =======");
		a.setQtdAprovacoes(scan.nextLine());
		
		System.out.println("======  digite a media de notas : =======");
		a.setMediaNotas(Float.parseFloat(scan.nextLine()));
		
		
		System.out.println("====== Resultado progresso : "+a.percentualProgressao(a));
		System.out.println("====== Resultado rendimento :"+a.percentualRendimento(a));
		
		
		
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("==========================================");
		
		
            System.out.println("Sistema Academico para analise Superior : ");
		
		System.out.println("==========================================");
		System.out.println("==========================================");
		
		
		System.out.println("======  digite o nome : =======");
		s.setNome(scan.nextLine());
		
		System.out.println("======  digite o email : =======");
		s.setEmail(scan.nextLine());
		
		System.out.println("======  digite o ra : =======");
		s.setRa(scan.nextLine());
		
		System.out.println("======  digite a quantidade de aprovações : =======");
		s.setQtdAprovacoes(scan.nextLine());
		
		System.out.println("======  digite a media de notas : =======");
		s.setMediaNotas(Float.parseFloat(scan.nextLine()));
		
		
		System.out.println("====== Resultado progresso : "+s.percentualProgressao(s));
		System.out.println("====== Resultado rendimento :"+s.percentualRendimento(s));
		
		

	}

}
