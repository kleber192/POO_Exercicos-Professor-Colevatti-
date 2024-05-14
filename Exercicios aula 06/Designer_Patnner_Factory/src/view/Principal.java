package view;

import java.util.Scanner;

import Controller.ControlIntegral;
import Controller.ControlParcial;
import Controller.ControlTemporario;
import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	
	Funcionario f = null ;
	
	
	System.out.println("Sisitema de criar funcionario !!!!");
	
	
	
	
	while (true) {
		
		System.out.println("Digite Opcao desejada para cadastrar !!!!");
		System.out.println(" 1 - para Integral ");
		System.out.println(" 2 - para Parcial ");
		System.out.println(" 3 - para Temporario ");
		System.out.println(" 0 - para Sair ");
		
		int opcao = Integer.parseInt(scan.nextLine());	
		
	switch(opcao) {
	
	
	case 1 : 
		
		ControlIntegral i = new ControlIntegral();
	    f = i.contratarFuncionario() ;
	    
	  break;
	
		
	case 2 : 
		
		
		ControlParcial  p = new ControlParcial();
		f = p.contratarFuncionario();
		
		break;
	case 3 : 
		
		ControlTemporario t = new ControlTemporario();
		f = t.contratarFuncionario();
		
		break;
	   	
	case 0 :
		System.out.println("Sistema encerrado !!!");
		
		System.exit(0);
	default :
		
		System.out.println("Opcao inexistente  !!!");
	 }

	System.out.println(f);
	
   }

 }
	
}