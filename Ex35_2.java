class myNumber{
	private int number;
	
	myNumber(int number){
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
}

class E extends myNumber{
	E(){
		super(5);
		System.out.println("This is Constructor");
		//呼叫父類別的建構子super放在繼承的子類別第一列.解決無法執行的問題
	}
}


public class Ex35_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number = "+a.getNumber());
	}

}
