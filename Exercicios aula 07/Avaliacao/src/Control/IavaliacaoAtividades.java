package Control;

import Model.Atividades;
import Model.Prova;

public interface IavaliacaoAtividades {

	void adicionarProva(Atividades Atividade);
	Atividades consultarProva(int posicao);
	void excluirProva(int posicao);
	
	
}
