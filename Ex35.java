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
		System.out.println("This is Constructor");
		super(5);
		//呼叫父類別的建構子super未放在繼承的子類別第一列.造成無法執行的問題
	}
}
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number = "+a.getNumber());
	}

}
