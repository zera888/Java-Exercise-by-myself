abstract class myNumber{
	private int number=5;
	public int getNumber() {
		return number;
	}
	
}

class E extends myNumber{}

public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a= new E();
		//因為myNumber前置abstract為抽象程序,禁止產生新物件.所以由子類別產生
		System.out.println(a.getNumber());
	}

}
