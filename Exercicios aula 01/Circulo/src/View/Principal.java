package View;
import java.util.Scanner;

import Model.Circulo;


public class Principal {

	public static void main(String[] args) {
	
		
	Scanner scan = new Scanner(System.in);
	double raio ;
	
	
	System.out.println("Digite a area desejada para calculo :");
	raio = Double.parseDouble(scan.nextLine());
	
	Circulo c = new Circulo(raio);	
		
	c.getArea();
	
	c.getPerimetro(); 
		

	}

}
