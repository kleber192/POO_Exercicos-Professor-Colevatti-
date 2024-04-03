package View;

import java.util.Scanner;

import Model.Musicas;
import Model.PlayList;

public class PrincipalMusic {

	public static void main(String[] args) {
		
		
		PlayList play = new PlayList();
		Musicas m = new Musicas();
		Musicas m1 = new Musicas();
		Musicas m2 = new Musicas();
		
		
		 play.addMusica(m);
		
		 play.addMusica(m1);
		 
		 play.addMusica(m2);
		 
		 
		 play.randonMusica();	
		

	}

}
