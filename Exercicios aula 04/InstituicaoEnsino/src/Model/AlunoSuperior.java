package Model;

public class AlunoSuperior  extends Aluno {

	
	
	private String instituicaoSegundoGrau ;
	private int anoConclusaoSegundoGrau; 
	
	
	
	
	public String getInstituicao() {
		
		
		return instituicaoSegundoGrau ;
		
		
	}
	
	
	public void setInstituicao(String iinstituicaoSegundoGrau) {
		
		
		this.instituicaoSegundoGrau = iinstituicaoSegundoGrau ;
		
	}
	
	
	public int getAnoConclusao() {
		
		
		return anoConclusaoSegundoGrau ;
		
	}
	

	public void setAnoConclusao(int anoConclusaoSegundoGrau) {
		
		
		this.anoConclusaoSegundoGrau  = anoConclusaoSegundoGrau ;
		
	}


	@Override
	public double  percentualRendimento(Aluno alu) {
		
		
		double res = Double.parseDouble(alu.getQtdAprovacoes()) / 6; 
		
		
		
		return res;
	}


	@Override
	public double percentualProgressao(Aluno alu) {
		
		
		double res ;
		
		res = alu.getMediaNotas() * Double.parseDouble(alu.getQtdAprovacoes())  * 0.972;
		
		
		return res ;
		
		
	}
	
	
	
}
