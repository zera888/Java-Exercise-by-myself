class MyNumber{
	int number;
	final void setNumber() {
		number=5;
	}
	
	public int getNumber() {
		return number;
	}
}

class E extends MyNumber{
	public void setNumber() {
		number=10;
		//在父類別中修飾子final設定方法程序setNumber,所以子類別不能再使用
	}
}
public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber();
		System.out.println("The number of a is : "+a.getNumber());

	}

}
