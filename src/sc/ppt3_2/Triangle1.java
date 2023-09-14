package sc.ppt3_2;

import java.util.Scanner;

public class Triangle1 extends MyImplements1 {

Scanner sc = new Scanner(System.in);
	
	@Override
	public void make1() {
		System.out.print("밑변의 길이를 입력해 주세요 : ");
		int width = sc.nextInt();
		System.out.print("좌변의 길이를 입력해 주세요 : ");
		int height1 = sc.nextInt();
		System.out.print("우변의 길이를 입력해 주세요 : ");
		int height2 = sc.nextInt();
		
		double res1 = (double)(width + height1 + height2) ;
		setResult(res1 + "");
	}

	public void print() {
		
		System.out.print("삼각형의 ");
		super.print1();

	}
}
