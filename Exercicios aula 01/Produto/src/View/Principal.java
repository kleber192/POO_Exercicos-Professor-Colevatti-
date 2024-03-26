package View;
import java.util.Scanner;

import Model.Produto;



public class Principal {

	public static void main(String[] args) {
	
	 Scanner s = new Scanner(System.in);
	 int  qtd = 0 ;
     double preco = 0 ;
	 
     Produto p = new Produto(preco,qtd);
     
     System.out.println("Digite o nome : ");
     p.setNome(s.nextLine());
		
   
     System.out.println("Digite o preço : ");
     preco = Double.parseDouble(s.nextLine());
     p.setPreco(preco);
     
     System.out.println("Digite a quantidade do produto : ");
     qtd = Integer.parseInt(s.nextLine());
     p.setQtdEstoque(qtd);
     
     System.out.println(" O Resultado é :  "+p.getVerificaProduto(p.getNome()));
     
     System.out.println(" O valor total do estoque é : "+p.valorEstoque());
     
     
	}

}
