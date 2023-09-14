package sc.ppt3_2;

import java.util.Scanner;

public class Circle extends MyImplements {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void make() {
		System.out.print("반지름을 입력해 주세요 : ");

		double radius = sc.nextDouble();
		
		double res = radius * radius * Math.PI;
		setResult(res + "");
		
	}

	public void print() {
		
		System.out.print("원의 ");
		super.print();
	}
	
}
