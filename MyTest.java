class Test {
	private int a=10;
	public int getInt() {
		return a;
	}
}
public class MyTest {

	public static void main(String args[]) 
	{
		// TODO Auto-generated method stub
		Test t=new Test();
		System.out.println("a="+t.getInt());
	}

}
