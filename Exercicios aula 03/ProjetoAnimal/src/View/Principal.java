package View;

import java.util.Scanner;

import Model.Animal;
import Model.Mamifero;
import Model.Peixe;

public class Principal {

	public static void main(String[] args) {
		
		
	Scanner s = new Scanner(System.in);
	
	Peixe p = new Peixe();
	
    Mamifero m = new Mamifero();
	
    System.out.println("Sistema de dados dos animais Mamiferos !");
    
    System.out.println("===============================================");
    
    System.out.println("Digite os dados do animal : !");
    
    System.out.println("nome  :");
	m.alteraNome(s.nextLine());	
	
	System.out.println("Alimento  :");
	m.alteraAlimento(s.nextLine());
	
	System.out.println("Cor  :");
	m.alteraCor(s.nextLine());	
	
	System.out.println("Ambiente  :");
	m.alteraAmbiente(s.nextLine());
	
	System.out.println(" Comprimento : ");
	m.alteraComprimento(Integer.parseInt(s.nextLine()));
	
	m.dados();
	
	System.out.println("===============================================");
	
	       System.out.println("================================");
	       
     System.out.println("===============================================");
     
         System.out.println("Sistema de dados dos animais vertebrados !");
     
     System.out.println("===============================================");
     
     System.out.println("Digite os dados do animal : !");
     
     System.out.println("nome  :");
 	p.alteraNome(s.nextLine());	
 	
 	System.out.println("quantidades de patas  :");
 	p.alteraPatas(Integer.parseInt(s.nextLine()));
 	
 	System.out.println("Cor  :");
 	p.alteraCor(s.nextLine());	
 	
 	System.out.println("Ambiente  :");
 	p.alteraAmbiente(s.nextLine());
 	
 	System.out.println(" Caracteristicas : ");
 	p.alteraCaracteristica(s.nextLine());
 	
 	p.dados();
 	
 	System.out.println("===============================================");
 	
 	       System.out.println("================================");
 	       
      System.out.println("===============================================");
 		
	     } 
		
	}


