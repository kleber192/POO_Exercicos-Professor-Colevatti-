package Model;

public class Trapezio extends AbsQuadrilatero {

	
	private double baseMenor;

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	
	 @Override
	public double calPerimetro() {
		// TODO Auto-generated method stub
		return super.calPerimetro();
	}
	
	
	@Override
	public double calcArea() {
		
		
		
	     double area = ( getBase() + getBaseMenor() * getAltura() / 2);	
		
		
		return area;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
