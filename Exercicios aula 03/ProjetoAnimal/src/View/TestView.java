package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Animal;

public class TestView {

	public static void main(String[] args) {
		
	List <Animal> anima = new ArrayList<Animal>();	
		
	  
	 adicionarZoo(anima);
	 
	 adicionarZoo(anima);
	 
	 adicionarZoo(anima);
	 
	 adicionarZoo(anima);
	 
	for (Animal nimal : anima) {
		
	 System.out.println(nimal);	
		
	}
	
	
	

	}

	private static void  adicionarZoo(List<Animal> anima) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Sistema para Adicionar animal a Zoo ");
		Animal a = new Animal();
		
		System.out.println("==================================================");
		
		System.out.println("Digite as informações dos animais ");
		
		System.out.println("nome : ");
		a.setNome(s.nextLine());
		
		System.out.println("Ambiente : ");
		a.setAmbiente(s.nextLine());
		
		System.out.println("Comprimento: ");
		a.setComprimento(Integer.parseInt(s.nextLine()));
		
		System.out.println("Cor : ");
		a.setCor(s.nextLine());
		
		System.out.println("Patas : ");
		a.alteraPatas(Integer.parseInt(s.nextLine()));
		
		System.out.println("Velocidade por m/s : ");
		a.alteraVelocidade(Double.parseDouble(s.nextLine()));
		
	        anima.add(a);
			
		
		
	}

}
