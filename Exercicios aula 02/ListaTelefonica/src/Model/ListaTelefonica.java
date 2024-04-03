package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTelefonica {

	private String  nome ;
	private String email;
	private int numero;
	private List <ListaTelefonica> agenda ;
	private Scanner scan = new Scanner(System.in);
	
	
	
public ListaTelefonica() {
	
	this.nome = nome ;
	this.email  = email;
	this.numero = numero;
	this.agenda = new ArrayList<ListaTelefonica>();
	
}	
	
	
public String getNome() {
	
	
	
	return nome ;
}	



public void setNome(String nome ) {
	
	this.nome = nome ;	
	
}


public String getEmail() {
	
	
	return email;
}
	

public void setEmail(String email) {
	
	this.email = email ;
}


public int getNumero() {
	
	
	
	return numero;
	
}

public void setNumero(int numero ) {
	
    this.numero = numero;	
	
}


  public void adicionarLista(ListaTelefonica lista) {
	  
	  
	agenda.add(lista);  
	  
  }

 public String toString () {
	 
	 
	 
	 return "Nome : "+ nome + " Email : "+email+" Telefone : " + numero;
 }
  
  
  public ListaTelefonica localizarCadastro(String nome ) {
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println(" Para Localizar o contato Digite o nome : ");
	  
	  nome = scan.nextLine();
	
	     for (ListaTelefonica lista : agenda) {
	    	 
	    	  if (lista.getNome().equals(nome)) {
	
	    		  System.out.println(lista); 
	    		  return lista;
	    	  }
	    	 
	    	 
	     }
		  
	     return null;
	  }
	  
	  
  public void  ExcluirCadastro() {
	
	  
	  
	  ListaTelefonica l = new ListaTelefonica();
	   
	  ListaTelefonica a = l.localizarCadastro(nome);
	  
	  ListaTelefonica remove = null ;
	  
	         if (a != null ) {
		  
		     a = remove;
		     System.out.println("Contato retirado  ");
	     }else {
	    	 
	    	 
	    	 System.out.println("Contato  ja retirado ou não existente ");
	    	 
	    	 
	     }
	  
	  
  }
  
  
  
  }


