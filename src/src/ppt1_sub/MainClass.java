package src.ppt1_sub;

import sc.ppt1.MainClass1;

public class MainClass extends MainClass1 {

	public MainClass() {
		super();
	}
	
	public static void main(String[] args) {
		MainClass1 test = new MainClass1();          //public everywhere
	  //MainClass1 test2 = new MainClass1(10);       //protected mine/child
	  //MainClass1 test3 = new MainClass1("String"); //default   only mine
			
		test.publicFn();
		//test.protectedFn(); 외부로판단 되어 안됨.
		
		//protected : 상속받은 클래스에서 부모의 객체를 통해 
	    //            protected 메서드를 사용하는 것은 불가능.	             
		
		//protected : 상속받은 클래스의 객체를 생성해서 그 클래스를 통해 
		//            protected 메서드를 사용하는 것은 가능.
	}

	public void subFn() {
		publicFn();
		protectedFn();
		// default 와 private은 호출사용안됨
	}
}
