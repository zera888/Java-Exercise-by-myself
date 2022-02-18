abstract class myNumber{
	public int number=5;
	public abstract int getNumber();
}
		

class E extends myNumber{
	public int getNumber() {
		return number;
		//因為父類別的方法程序abstract不能有程式碼，所以在繼承的子類別以程式碼回傳
	}
}
public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number of a is :"+a.getNumber());
	}

}
