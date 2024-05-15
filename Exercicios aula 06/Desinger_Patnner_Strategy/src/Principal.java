import java.util.Scanner;

import javax.swing.JOptionPane;

import Controller.ControlImposto;
import model.CalcularImposto;

public class Principal {

	

	public static void main(String[] args) {
		
		ControlImposto c = new ControlImposto();
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Sistema para Imposto !!!");
		 System.out.println("Escolha Opcao para uso !!!"
			  		+ "1  - São paulo "
			  		+ "2  - belo Horizonte "
			        + "3  - porto alegre  "
			  		+ "4  - curitiba "
			        + "5  - sair "); 
		 
               int opcao = scan.nextInt();
	while (true) {
	
	if (opcao == 1 ) {
		c.calcularImposto(CalcularImposto.SAOPAULO);
		break;
	}else if (opcao == 2 ) {
		c.calcularImposto(CalcularImposto.BELOHORIZONTE);
	}else if (opcao == 3 ) { 	
		c.calcularImposto(CalcularImposto.PORTOALEGRE);
	}else if (opcao == 4 ) {
		c.calcularImposto(CalcularImposto.CURITIBA);
	}else if (opcao == 5 ) {
	
		System.out.println("Sistema encerrado !");
		System.exit(0);	
	     }
	
	
	  }
	}
	
	
}
