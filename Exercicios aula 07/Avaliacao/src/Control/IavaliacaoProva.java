package Control;

import Model.Prova;

public interface IavaliacaoProva {
	
  	
	void adicionarProva(Prova Prova);
	Prova consultarProva(int posicao);
	void excluirProva(int posicao);
	
	
}
