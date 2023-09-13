package sc.ppt1;

import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		
		
		try(Scanner scan = new Scanner(System.in)){
		
		System.out.println("년도를 입력하세요.");
		
			int num = scan.nextInt();
			
		if(num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
		System.out.printf("입력한 년도는 %d이고 윤년입니다.\n", num);
		}
		
		else if(num % 4 == 0 && num % 100 == 0 && num % 400 != 0 ) {
			System.out.printf("입력한 년도는 %d이고 윤년이 아닙니다.\n", num);
		}
		
		else {
		System.out.printf("입력한 년도는 %d이고 윤년이 아닙니다.\n", num);
		}
		       }		
		   }
		}