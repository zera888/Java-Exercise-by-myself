class MyNumber{
	int unmber;
	final void setNumber() {
		number = 5;
		// 因為方法程序setNumber前置final,不得被覆寫
	}
}

class E extends MyNumber{
	public void setNumber() {
		number = 10;
		//因為父類別的方法程序前置final,所以覆寫失敗
		
	}
}
public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber();
		System.out.println("The number of a is : "+ a.getNumber());

	}

}
