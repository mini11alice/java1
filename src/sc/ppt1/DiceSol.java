package sc.ppt1;

import java.util.Random;
import java.util.Scanner;

public class DiceSol {

	public static void main(String[] args) {
		
	int[] dice = new int[6]; // index 0이 주사위 눈금1 (index5 주사위6)

	Random rand = new Random();
	
	int value = 0;
	int count = 0;
	
	System.out.println("주사위를 몇 번 돌릴까요?");
	
	try(Scanner scann = new Scanner(System.in)){
			count = scann.nextInt();
			if(count < 1 || count > 100) System.exit(0);
			
			for(int i = 0; i < count; i++) {
				value =rand.nextInt(6);
				System.out.print(value + 1);
				dice[value]++;
			}
			System.out.println("---------------------");
			for(int i = 0; i < 6; i++) {
				System.out.println("주사위 " + (i + 1) + " : " + dice[i] + "번");
			}
		}
	
	}
}
