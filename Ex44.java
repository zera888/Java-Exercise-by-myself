abstract class myNumber{
	//凡是程式中有抽象類別.必須在類別前面前置abstract
	public int number=5;
	public abstract int getNumber();
}

class E extends myNumber{
	public int getNumber() {
		return number;
	}
}
public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number of a is : "+a.getNumber());
	}

}
