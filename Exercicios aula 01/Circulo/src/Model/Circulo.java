package Model;

public class Circulo {

	private double raio ;
	
	
	public Circulo(double raio) {
		
	this.raio = raio ;
	
	
	}
	
	
	public double getArea() {
			
	double 	area = raio * Math.PI; 
		
	
	  System.out.println(area);
	  
		return area;
		
	}
	
   public double getPerimetro() {
			
		
	 double  perimetro  = raio*Math.PI*getArea() ;
	 
	 System.out.println(perimetro);
	 
		return perimetro;
	}
   
   
   
   
	
}
