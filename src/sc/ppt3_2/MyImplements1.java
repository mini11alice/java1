package sc.ppt3_2;

public class MyImplements1 implements MyInterface1 {

	private String result;
	
	@Override
	public void print1() {
		System.out.println(MyInterface1.PRINT + result);
	}

	@Override
	public void make1() {}
	
	public void setResult(String result) {
		this.result = result;
	}

}
