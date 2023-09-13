package sc.ppt1;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		// try 구문을 벗어날 때 알아서 scanner 객체를 닫아줌
		try(Scanner scan = new Scanner(System.in)){
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		System.out.printf("이름은 %s, 나이는 %d세 입니다.\n", name, age);
		
				}
		}
}
