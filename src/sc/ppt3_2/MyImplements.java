package sc.ppt3_2;

public class MyImplements implements MyInterface {

	private String result;
	
	@Override
	public void print() {
		System.out.println(MyInterface.PRINT + result);
	}

	@Override
	public void make() {}

	public void setResult(String result) {
		this.result = result;
	}
	
}
