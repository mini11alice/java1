package sc.ppt1;

public class Repeat2 {

	public static void main(String[] args) {
		for(int i = 1; i < 10 ; i++) {
			for (int j = 2; j< 10 ; j++) {
				System.out.print(j +"X"+ i +"="+(i*j)+ "\t");
				}
				System.out.println();
		}

	}
}