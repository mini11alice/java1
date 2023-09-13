package sc.ppt1;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		
		int num, num1, num2, result, result2;
		
		try(Scanner scan = new Scanner(System.in)){
		
		System.out.println("숫자를 입력하세요.");
		
			num = scan.nextInt();
			num1 = scan.nextInt();
			num2 = scan.nextInt();
		
		System.out.printf("입력한 숫자는 %d, %d, %d 입니다.\n", num, num1, num2);
	 			}
		
		    result = (num > num1)? num: num1;        
            result2 = num2 > result? num2: result;
            System.out.printf("가장큰 수는 :\n");
            System.out.println(result2);          
			}
		}