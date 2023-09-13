package sc.ppt1;

import java.util.Scanner; 
import java.util.Random;


class Dice {
    public static int roll() {
    	final int size= 6;
        Random r = new Random();
        int value = r.nextInt(size); 
        return value + 1;
    }
}


public class Matter {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		System.out.println("숫자를 입력하세요.");
		
		int num = 0;
		
		int[] arr = new int[7];
		
		while( num >=0 && num <= 100) {  
		  if(num == 101) {break;}
			   num = scan.nextInt();
			
			}
			
			for(int i = 0; i <= num ; i++) {
				int a = Dice.roll();
				arr[a]++;
			}
            			
		    for(int i = 1; i < arr.length; i++){
		       System.out.printf("%d : ", i);
		          for(int j = 0; j < arr[i]; j++){
		        	  System.out.println(arr[i]);
		          }
		          System.out.println(" ");
		    }
		}
	}

}



