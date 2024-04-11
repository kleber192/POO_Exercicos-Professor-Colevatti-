package View;

import Model.ContaModel;

import java.util.Scanner;

import Model.ContaEspecial;
import Model.ContaPoupanca;


public class Principal {

	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);		
		
	ContaEspecial e = new ContaEspecial();
	ContaPoupanca p = new ContaPoupanca();
	
	         System.out.println("Sistema Conta Especial ");
	
	System.out.println("=================================================");
	
	       System.out.println("Digite o nome do usuario :");
	e.setNome(s.nextLine());	
		
	    System.out.println("Digite o numero de Conta do usuario  :");	
	e.setNumConta(Integer.parseInt(s.nextLine()));	
	
	
	          System.out.println("Digite Saldo inicial  :");
	e.setSaldo(Double.parseDouble(s.nextLine()));		
	
	
	e.setDepositar();
	e.getSaque();
	
	e.getSaque();
		
	System.out.println("=================================================");
	
	System.out.println("=================================================");
	
                  System.out.println("Sistema Conta Poupança ");
	
	System.out.println("=================================================");
	
	       System.out.println("Digite o nome do usuario :");
	p.setNome(s.nextLine());	
		
	    System.out.println("Digite o numero de Conta do usuario  :");	
	p.setNumConta(Integer.parseInt(s.nextLine()));	
	
	
	          System.out.println("Digite Saldo inicial  :");
	p.setSaldo(Double.parseDouble(s.nextLine()));		
	
	
	p.setDepositar();
	p.getSaque();
	
	p.calculadorNovoSaldo();
	
// ============================================================================//		
		
/*  	ContaPoupanca p = new ContaPoupanca() ; 
    	ContaEspecial e = new ContaEspecial() ;
		char op ;
		
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Sitema de uso de Contas :  ");
			
			System.out.println(" ========================================");
			
			System.out.println("Digite opção para uso  :  ");
			System.out.println(" Digite (A) para Cadastrar Poupanca ");
			System.out.println(" Digite (B) para Cadastrar Especial ");
			System.out.println(" Digite (E) para Sair ");
			
			op = s.nextLine().toUpperCase().charAt(0);
			
			if (op == 'A') {
				
				System.out.println("Sistema Cadastro de conta Poupanca !");	
				cadastrarContaPoupanca(p, s);
				
				
			}else if (op == 'C') {
				
				
				System.out.println("Sistema Cadastro de conta Especial !");
				cadastrarContaEspecial(e, s);
				
			}else if (op == 'E') {
				
				
				
				System.out.println("Sistema encerrando !");
				System.exit(0);
				
			}
			
			 System.out.println("Sistema Encerrado !");
		}
			
    
	}
	
	
	
	
	
private static void cadastrarContaEspecial(ContaEspecial e, Scanner s) {
		
	
	  System.out.println("Digite o nome :");
	  e.setNome(s.nextLine());
	  
	  System.out.println("Digite o numero da conta :");
	  e.setNumConta(s.nextInt());
	  
	  System.out.println("Digite o saldo inicial :");
	  e.setSaldo(s.nextDouble());
	
	  e.setDepositar(1500);
	  
	  e.getSaque(300);
	  
	  
	  e.getSaque(5000);
	  
	
	
		
	}





private static void cadastrarContaPoupanca(ContaPoupanca p, Scanner s) {
		
	  System.out.println("Digite o nome :");
	  p.setNome(s.nextLine());
	  
	  System.out.println("Digite o numero da conta :");
	  p.setNumConta(s.nextInt());
	  
	  System.out.println("Digite o saldo inicial :");
	  p.setSaldo(s.nextDouble());
	
	
	  p.setDepositar(3000);
	  
	  p.getSaque(150);
	  
	  p.calculadorNovoSaldo();
	  
	  
	}*/




    }
	
}
