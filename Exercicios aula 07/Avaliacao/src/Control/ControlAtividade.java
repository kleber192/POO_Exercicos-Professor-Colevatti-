package Control;

import java.util.ArrayList;
import java.util.List;

import Model.Atividades;
import Model.Prova;

public class ControlAtividade implements IavaliacaoAtividades{

	List<Atividades> at = new ArrayList<>();

	@Override
	public void adicionarProva(Atividades Atividade) {
		
		at.add(Atividade);
	}

	@Override
	public Atividades consultarProva(int posicao) throws ArrayIndexOutOfBoundsException {
		if (at.get(posicao)== null ) {
			
		throw new ArrayIndexOutOfBoundsException (" posicao inexistente ou ja exluida ");		
		
		}
		
		Atividades aaa = at.get(posicao);
		
		return aaa;
	}

	@Override
	public void excluirProva(int posicao) {
		
		
	Atividades atv = consultarProva(posicao) ; 
	
	atv = null ;
		
	System.out.println(" Atividade exluida ");
	}
	
	
	
	
}
