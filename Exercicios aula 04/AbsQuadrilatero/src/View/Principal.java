package View;

import java.util.Scanner;

import Model.Paralelogramo;
import Model.Trapezio;

public class Principal {

	public static void main(String[] args) {
		
		
	    Paralelogramo p = new Paralelogramo();	
		Scanner scan = new Scanner(System.in);
               System.out.println("Sistema de Calcculos geometircos (Paralelogramo) ");
		
		System.out.println("==================================================");
		
		
		System.out.println("Digite o valor da altura : ");
		p.setAltura(Double.parseDouble(scan.nextLine()));
		
		System.out.println("Digite o valor da  base  : ");
		p.setBase(Double.parseDouble(scan.nextLine()));
		
		
		double a = p.calPerimetro();
		
		double b = p.calcArea();
		
		    System.out.println("Resultado perimetro (Paralelogramo) :"+a);
			
			System.out.println("Resultado area (Paralelogramo) :"+b);
			
			System.out.println("==================================================");
			
			System.out.println("==================================================");
			
			
		        System.out.println("Sistema de Calcculos geometircos (Trapezio) ");
			
			System.out.println("==================================================");
			 
			 Trapezio t = new Trapezio();
		
			System.out.println("Digite o valor da altura : ");
			t.setAltura(Double.parseDouble(scan.nextLine()));
			
			System.out.println("Digite o valor da  base Maior : ");
			t.setBase(Double.parseDouble(scan.nextLine()));
			
			
			System.out.println("Digite o valor da base Menor  : ");
			t.setBaseMenor(Double.parseDouble(scan.nextLine()));
			
			
			
			double a1 = t.calPerimetro();
			
			double b1 = t.calcArea();
			
			
            System.out.println("Resultado perimetro (Trapezio) :"+a1);
			
			System.out.println("Resultado area (Trapezio) :"+b1);
			
			
			

	}

}
