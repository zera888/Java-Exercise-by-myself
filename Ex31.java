class myNumber{
	private int number;
}

class E extends myNumber{
	public void setNumber(int i) {
		number = i; 
		// number是繼承自myNumber的private變數.子類別不得使用
	}
	public int getNumber() {
		return number;
		// number是繼承自myNumber的private變數.子類別不得使用
	}
}
public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber(5);
		System.out.println("The number of a is :"+a.getNumber());
	}

}
