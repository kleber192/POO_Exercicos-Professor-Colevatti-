package View;

import java.util.Scanner;

import Model.ListaTelefonica;

public class Principal {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		ListaTelefonica l = new ListaTelefonica();
		
		System.out.println("Digite o nome :");
		l.setNome(scan.nextLine());
		
		System.out.println("Digite o email :");
		l.setEmail(scan.nextLine());
		
		System.out.println("Digite o numero :");
		l.setNumero(Integer.parseInt(scan.nextLine()));
		
		l.adicionarLista(l);
		
		
		l.localizarCadastro(l.getNome());
		
		
		l.ExcluirCadastro();


		
		
		

	}

}
