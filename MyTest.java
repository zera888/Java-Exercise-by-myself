class Test {
	private int a;
	
	public int getInt() {
		return a;
	}
}
class son extends Test {}

public class MyTest {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		son t= new son();
		System.out.println("a="+t.getInt());
	}

}
