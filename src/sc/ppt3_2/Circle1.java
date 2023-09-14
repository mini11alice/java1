package sc.ppt3_2;

import java.util.Scanner;

public class Circle1 extends MyImplements1 {

Scanner sc = new Scanner(System.in);
	
	@Override
	public void make1() {
		System.out.print("반지름을 입력해 주세요 : ");

		double radius = sc.nextDouble();
		
		double res1 = 2 * radius * Math.PI;
		setResult(res1 + "");
		
	}

	public void print() {
		
		System.out.print("원의 ");
		super.print1();
	}
}
