package Model;

public class Atividades {

	private String assunto ;
	private int paginas;
	
	
	
	
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "Atividades [assunto=" + assunto + ", paginas=" + paginas + "]";
	}
	
	
	
	
	
	
}
