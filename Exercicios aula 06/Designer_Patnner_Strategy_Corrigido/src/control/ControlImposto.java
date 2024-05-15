package control;

import java.util.Scanner;

import model.ImpostoBeloHorizonte;
import model.ImpostoCuritiba;
import model.ImpostoPortoAlegre;
import model.ImpostoSaoPaulo;

public class ControlImposto {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
	
	while(true) {
		
	System.out.println("Sistema de Imposto Strategy ");
	System.out.println("Clique para continuar   ");
	
	System.out.println("1 - belo horizonte ");
	System.out.println("2 - sao paulo ");
	System.out.println("3 - porto alegre   ");
	System.out.println("4 - curitiba ");
	System.out.println("5 - sair  ");
	System.out.println("Digite a opcao para calcular  ");
	int opcao = scan.nextInt();
	
	if (opcao == 1 ) {
		
		ImpostoBeloHorizonte b = new ImpostoBeloHorizonte();
		b.calcular();
		
	}else if (opcao == 2 ) {
		
		ImpostoSaoPaulo s = new ImpostoSaoPaulo();
		s.calcular();
	}else if(opcao == 3 ) {
		
		ImpostoPortoAlegre p = new ImpostoPortoAlegre();
		p.calcular();
		
	}else if (opcao == 4) {
		
		ImpostoCuritiba c = new ImpostoCuritiba();
		c.calcular();
		
	}else if (opcao == 5 ) {
		
		System.exit(0);
		
	}
		
		
		
		
		
	  }	
		
	
	}
	
	
}
