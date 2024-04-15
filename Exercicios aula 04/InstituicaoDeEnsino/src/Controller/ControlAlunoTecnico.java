package Controller;

import Model.Aluno;
import Model.AlunoTecnico;

public class ControlAlunoTecnico implements IAlunoControl{

	

	   AlunoTecnico a = new AlunoTecnico();    
 
	@Override
	public double percentualRendimento(Aluno alu ) {
		
		return a.percentualRendimento(alu);
	}

	@Override
	public double percentualProgressao(Aluno alu ) {

		
		return a.percentualProgressao(alu);
	}

	
	
	
}
