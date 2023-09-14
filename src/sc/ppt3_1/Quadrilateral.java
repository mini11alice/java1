package sc.ppt3_1;

public class Quadrilateral extends Shape {

	
	private double witdth;
	private double length;
	
	public Quadrilateral(double witdth, double length) {
		this.witdth = witdth;	
		this.length = length;	
	}
	
	@Override
	public double calculateArea() {
		
		return witdth * length;
	}

}
