package sc.ppt3_2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택해 주세요 \n[1:원(넓이)  2:삼각형(넓이)  3:사각형(넓이)]");
		int select = sc.nextInt();
		
		MyInterface area = null;	
		switch(select) {
		case 1:
			area = new Circle();
			break;
		case 2:
			area = new Triangle();
			break;
		case 3:
			area = new Quadrilateral();
			break;
		}
							
		area.make();
		area.print();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("도형을 선택해 주세요 \n[4:원(길이)  5:삼각형(길이)  6:사각형(길이)]");
		int select1 = sc1.nextInt();
		
		MyInterface1 area1 = null;	
		switch(select1) {
		case 4:
			area1 = new Circle1();
			break;
		case 5:
			area1 = new Triangle1();
			break;
		case 6:
			area1 = new Quadrilateral1();
			break;
		}
		area1.make1();
		area1.print1();
	}

}
