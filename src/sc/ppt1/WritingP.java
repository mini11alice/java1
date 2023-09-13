package sc.ppt1;

import java.util.Scanner;

public class WritingP {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String input = scanner.nextLine();
		System.out.printf("입력한 문장 : %s\n", input);
		scanner.close();
		
	}

}
