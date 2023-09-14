package sc.ppt3_2;

import java.util.Scanner;

public class Quadrilateral1 extends MyImplements1 {

Scanner sc = new Scanner(System.in);
	
	@Override
	public void make1() {
		System.out.print("가로 길이를 입력해 주세요 : ");
		int width = sc.nextInt();
		System.out.print("높이 길이를 입력해 주세요 : ");
		int height = sc.nextInt();
		
		double res1 = (double)(2*(width + height));
		setResult(String.format("%.2f",  res1));
	}

	public void print() {
		System.out.printf("사각형의 ");
		super.print1();
	}
}
