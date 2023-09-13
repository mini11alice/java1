package sc.ppt1;

public class Construct {

	public int a;
	public String name;
	
	public Construct() {
		this(10, "kim");
		System.out.println("매개변수가 없는 생성자");
	}
	
	public Construct(int a, String name) {
		System.out.println("매개변수가 하나 있는 생성자");
		if(a < 0) {
			this.a = 0;
		} else {
			this.a =a;
		}
		this.name = name;
	}
	
	public Construct(Construct other) {
		a = other.a; 
		name = other.name;
	}
	
	
	public static void main(String[] args) {
		Construct myConstruct = new Construct(40, "yang"); 
		Construct myConstruct2 = new Construct(myConstruct); 
		
		System.out.println(myConstruct == myConstruct2);
		
		System.out.println(myConstruct2.name);
		myConstruct2.name = "Lina";
		
		System.out.println(myConstruct.name);
		System.out.println(myConstruct2.name);
	}

	public void test() {
		
	}
}

