package sc.ppt1;

public class MainClass {

	public static void main(String[] args) {
		char ch1_1 = '가';
		char ch1_2 = 0xAC00;  // 16진수
		char ch1_3 = 44032;   // 10진수

		char ch2_1 = '걱';
		char ch2_2 = 0xAC71;
		char ch2_3 = 44145;
		
		System.out.println(ch1_1 + " " + ch1_2 + " " + ch1_3);
		System.out.println(ch2_1 + " " + ch2_2 + " " + ch2_3);
	}

}
