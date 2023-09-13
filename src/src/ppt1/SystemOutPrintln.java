package src.ppt1;


// 클래스의 접근제어자는 public/default
public class SystemOutPrintln {
	public int cnt = 0;

	//메서드의 접근제어자는 public/protected/default/private
	public void test1() {
		System.out.println("test1");
	}
	
	protected void test2() {
		cnt++;
		System.out.println(cnt);
	}
	
	void test3() {
		System.out.println("test3");
		
	}
	
	private void teset4() {
		System.out.println("test4");
	}
	
	class Class2 {
		
	}
}