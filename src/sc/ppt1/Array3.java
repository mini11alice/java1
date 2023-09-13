package sc.ppt1;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		
		String[] score1 = {"banana", "berry", "apple", "melon"}; 
		String[] Arr =Arrays.copyOf(score1, score1.length);
		
		
		test(Arr);
		
		
		System.out.println("====================");
		for(String elem : score1) {
			System.out.println(elem);
			
		}

	}
	//&
	public static void test(String[] args) {
		for(String elem:args) {
			System.out.println(elem);
		}
		args[1] = "blueberry";
	}
}