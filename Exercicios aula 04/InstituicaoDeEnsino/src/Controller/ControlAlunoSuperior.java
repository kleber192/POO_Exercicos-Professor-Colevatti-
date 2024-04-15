package Controller;

import Model.Aluno;
import Model.AlunoSuperior;
import Model.AlunoTecnico;

public class ControlAlunoSuperior implements IAlunoControl{


	   AlunoSuperior a = new AlunoSuperior();    
    
	@Override
	public double percentualRendimento(Aluno alu ) {
		
		return a.percentualRendimento(alu);
	}

	@Override
	public double percentualProgressao(Aluno alu ) {

		
		return a.percentualProgressao(alu);
	}

	
}
