package Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Prova;

public class ControleProva implements IavaliacaoProva{

	
	List<Prova> p = new ArrayList<>();
	
	
	@Override
	public void adicionarProva(Prova prova) {
		
		
		p.add(prova);
		System.out.println("prova adicionada");
		
	}

	@Override
	public Prova consultarProva(int posicao) throws ArrayIndexOutOfBoundsException{
		
		if(p.get(posicao) == null ) {
			
  throw new  ArrayIndexOutOfBoundsException (" posicao inexistente ou ja exluida ");
		
		}
		
        Prova ppp = p.get(posicao);
       
		return ppp;
	}

	@Override
	public void excluirProva(int posicao) {
		
		
		
	    Prova posExclu = consultarProva(posicao);
	
	    posExclu = null;
		
	    System.out.println("Posicao Excluida ");
	}

	
}