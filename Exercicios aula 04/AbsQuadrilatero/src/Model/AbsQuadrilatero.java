package Model;

public  abstract class AbsQuadrilatero {

	
	protected double altura ;
	protected double base;
	
	
	
	
	public double getAltura() {
		
		
	 return altura;
		
	}
	
    public void setAltura(double altura) {
    	
    	
    	this.altura = altura;
    	
    } 
	
	public double getBase() {
		
		
		
		return base;
		
		
	}
	
	
	public void setBase(double base ) {
		
		
		
		this.base = base ;
		
		
	}
	

	public double calPerimetro() {
		
		
	    double area = 2*(getBase()+getAltura());	
			
		    return area;
		
	}
	
	public abstract double calcArea();
	
	
}
