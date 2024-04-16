package View;

import java.util.Scanner;

import Model.IngressosNormal;
import Model.IngressosVip;

public class Principal {

	public static void main(String[] args) {
		
		
		IngressosNormal n = new IngressosNormal();
		Scanner scan = new  Scanner(System.in);
		IngressosVip v = new IngressosVip();
		
		      System.out.println("Sistema para venda de Ingressos !");
		
		System.out.println("=============================================");
		System.out.println("=============================================");

		System.out.println(" Digite o Codigo verificador ");
		n.setCodigoVer(scan.nextLine());
		
		System.out.println(" Digite o valor do ingresso ");
		n.setValor(Float.parseFloat(scan.nextLine()));
		
		
		System.out.println(" O valor do Ingresso normal é : "+n.valorFinal(2));
		
		         
			
	     System.out.println("=============================================");
		 System.out.println("=============================================");

			System.out.println(" Digite o Codigo verificador ");
			v.setCodigoVer(scan.nextLine());
			
			System.out.println(" Digite o valor do ingresso ");
			v.setValor(Float.parseFloat(scan.nextLine()));
			
			
		System.out.println(" O valor do Ingresso vip é : "+v.valorFinal(18));
		
		
	}

}
