package Model;

public class AlunoTecnico extends Aluno{

	@Override
	public double percentualRendimento(Aluno alu) {
		
		return alu.mediaNotas * Double.parseDouble(alu.qtdAprovacoes)*0.931;
	}

	@Override
	public double percentualProgressao(Aluno alu) {
		
		return Double.parseDouble(alu.qtdAprovacoes) / 3 ;
		
		
	}

	
	
	
	
	
	
	
	
	
}
