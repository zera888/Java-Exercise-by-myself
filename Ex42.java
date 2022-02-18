abstract class myNumber{
	public int number=5;
	public abstract int getNumber() {
		//abstract抽象方法不得有內容碼，但是本程序有{return number}.造成編譯問題
		return number;
	}
}

class E extends myNumber{}

public class Ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number of a is :"+a.getNumber());
	}

}
