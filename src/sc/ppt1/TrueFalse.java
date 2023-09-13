package sc.ppt1;

import java.util.Scanner;

public class TrueFalse {

	public static void main(String[] args) throws Exception { 
		boolean result = false;
		System.out.println("숫자를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
			  int input = scanner.nextInt();		
		String inputStr = scanner.nextLine();
		
		if(input > 10) {
			result = true;
		}
		
		System.out.println("result "+ result + ", " + input);
		System.out.println(inputStr);
		scanner.close();
	}

}
