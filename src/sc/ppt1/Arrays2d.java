package sc.ppt1;

public class Arrays2d {

	public static void main(String[] args) {
		
		//2차원배열 선언만.
		//String[][] arr;
		String arr2[][];
		//String[] arr3[];
		
		//arr = new String[2][3];
		
		//가변 배열(Variable Length Arrays)
		//불규칙 배열(Ragged Array)
		arr2 = new String[2][];
	 	arr2[0] = new String[] {"Linux", "mariaDB", "C", "C++", "Java"};
		arr2[1] = new String[] {"NetWork", "ProtoType","Project"};
		//arr2[2] = new String[4]; 메모리 침범
	
		
		/*
		// 확장 for문
		for(String[] elem : arr2) {
			for(String value: elem) {
				System.out.print(value + " ");
		
			}
			System.out.println();
		}
		*/
		test(arr2);
	}
	public static void test(String[][] args) {
		for(String[] elem:args) {
			for(String value : elem) {
			System.out.println(value + " ");
			}
			System.out.println();
		}
	}
}
