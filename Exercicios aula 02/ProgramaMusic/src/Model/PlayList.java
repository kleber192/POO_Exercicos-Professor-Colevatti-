package Model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class PlayList {

	ArrayList<Musicas> bandas ; 
	String dono ; 
	
	
public PlayList() {
	
	this.bandas = new ArrayList<Musicas>();
	this.dono = dono;
	
	
	
}	
    	
     public void addMusica(Musicas m){
	    
    	 Scanner scan = new Scanner(System.in);
    	 
    	 System.out.println("Digite o nome da musica : ");
		 m.setNome(scan.nextLine());	
		    
		  System.out.println("Digite o Autor da musica : ");
		 m.setAutor(scan.nextLine());
		  
		  System.out.println("Digite a descriçao da musica : ");
		 m.setDescricao(scan.nextLine());	 
    	 
    	 
	      bandas.add(m);
	      
     }
    	
     
     public void randonMusica() {
    	 
    	 Random randon = new Random();
    	 int i = randon.nextInt(bandas.size());
    	   	 
    	 Musicas musicaE = bandas.get(i);
    	 
    	 System.out.println("Musica tocada é : "+musicaE.getNome()+" Autor:"+musicaE.getAutor());
    	  	   

      }
	
	
	
	
}
