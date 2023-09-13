package sc.ppt1;

public class Arrays1 {
	public static void main(String[] args) {
		
		// int size= 3;
		String[] score1 = {"banana", "berry", "apple", "melon"}; 
		//String[] test = new String[size];
		
		test(score1);
		
		
		
		/*
		 for(int i= 0; i < score1.length; i++) {
			System.out.println(score1[i]); 		  
		 */
		
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

