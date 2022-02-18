class myNumber{
	protected int number;
}

class E extends myNumber{
	public void setNumber(int i) {
		number = i; 
		// number是繼承自myNumber的protected變數.子類別得使用
	}
	public int getNumber() {
		return number;
		// number是繼承自myNumber的protected變數.子類別得使用
	}
}
public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber(5);
		System.out.println("The number of a is :"+a.getNumber());

	}

}
