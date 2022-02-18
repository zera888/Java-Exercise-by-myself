final class myNumber{
	int number = 5;
}

class E extends myNumber{
	int number = 10;
	public int getsuperNumber() {
		return super.number;
		//父類別的前置類別程序為final時,子類別不得繼承父類別的程序
	}
	
	public int getthisNumber() {
		return this.number;
	}
}

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The myNumber_number of a is: "+a.getsuperNumber());
		System.out.println("The myNumber_number of a is: "+a.getthisNumber());
	}

}
