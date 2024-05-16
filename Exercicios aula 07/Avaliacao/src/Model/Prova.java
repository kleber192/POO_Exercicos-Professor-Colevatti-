package Model;

public class Prova {

	private int questoes;
	private double MediaNotas;
	
	
	public int getQuestoes() {
		
		return questoes;
		
	}
	
	
	public void setQuestoes(int questoes) {
		
		this.questoes = questoes;
	}
	
	public double getMediaNotas() {

	return MediaNotas;	
   }
	
	
   public void setMediaNotas(double MediaNotas) {
	   
	   this.MediaNotas = MediaNotas;
   }


@Override
public String toString() {
	return "Prova [questoes=" + questoes + ", MediaNotas=" + MediaNotas + "]";
}	
   
   
}