package sc.ppt3_1;

import sc.ppt3.Circle;

public class MainClass {

	public static void main(String[] args) {
		Circle circle = new Circle(7.0);
		System.out.println("Area of circle : " + circle.calculateArea());
		circle.print();
		
		Triangle triangle = new Triangle(5.0, 10.0);
		System.out.println("Area of Triangle : " + triangle.calculateArea());
		triangle.print();
		
		Quadrilateral quadrilateral = new Quadrilateral(10.0,10.0);
		System.out.println("Area of quadrilateral : " + quadrilateral.calculateArea());
		quadrilateral.print();
	}

}
