package Model;

public class AlunoSuperior extends Aluno{

	@Override
	public double percentualRendimento(Aluno alu) {
		
		return alu.mediaNotas * Double.parseDouble(alu.qtdAprovacoes)*0.972;
	}

	@Override
	public double percentualProgressao(Aluno alu) {
		
		return Double.parseDouble(alu.qtdAprovacoes) / 6 ;
	}

	
	
	
	
	
	
	
	
}
