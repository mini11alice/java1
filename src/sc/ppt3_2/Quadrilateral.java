package sc.ppt3_2;

import java.util.Scanner;

public class Quadrilateral extends MyImplements {

Scanner sc = new Scanner(System.in);
	
	@Override
	public void make() {
		System.out.print("가로 길이를 입력해 주세요 : ");
		int width = sc.nextInt();
		System.out.print("높이 길이를 입력해 주세요 : ");
		int height = sc.nextInt();
		
		double res = (double)(width * height);
		setResult(String.format("%.2f",  res));
	}

	public void print() {
		System.out.printf("사각형의 ");
		super.print();
	}
		
}
