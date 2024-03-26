package Model;

public class Produto {

	String nome ;
	double preco;
	int qtdEstoque;
	
 public Produto(double preco,int qtdEstoque ){	 
		 
	if (qtdEstoque > 0 &&  preco > 0 ) { 
	 
		 this.nome = nome;
		 this.preco = preco;
		 this.qtdEstoque = qtdEstoque;
	}else {
	
			
	} 
 }
	

public String getNome() {
	
	return nome ;
} 
 

public void setNome(String nome ) {
	
	
	this.nome = nome ;
	
	
}


public double getPreco() {
	
	return preco;
}



public void setPreco(double preco) {
	
        if (preco > 0 ) {
        	
        	
	    this.preco = preco;
	
        }else {
        	
    System.out.println("Digite numeros positivos ");    	
        	
        }
}


public int getQtdEstoque() {
		
	return qtdEstoque ; 
}


public void setQtdEstoque(int qtdEstoque) {
	
	   if (qtdEstoque> 0 ) {
	this.qtdEstoque  = qtdEstoque; 
	   }else {
		   
		   System.out.println("Digite numeros positivos ");
	   }		
}


public boolean getVerificaProduto(String produto) {
	
	
	
	if (qtdEstoque > 0 && produto.equals(nome)) {
	
		
	System.out.println(" Possui o produto : ");
	
	return true ;
	
	
      }else {
	
    	  System.out.println(" Não possui o  produto : "); 	  
   return false ;

       }
	
   }



public double valorEstoque() {
	
	double valorTotal  = 0 ;
	
	valorTotal = qtdEstoque *  preco 	;
	
	
	return valorTotal ;
}


}






