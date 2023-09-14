package sc.ppt3_1;

public abstract class Shape {

	//field
		protected int cnt;
		
		public Shape() {
			
		}
				
		// 추상메서드
		public abstract double calculateArea();
		
		
		//일반메서드
		public void print() {
			System.out.println("Shape Class");
		}
}