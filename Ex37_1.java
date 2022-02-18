class myNumber{
	int number = 5;
}

class E extends myNumber{
	int number = 10;
	public int getsuperNumber() {
		return super.number;
		//移除掉父類別的final後，子類別的繼承不再有問題
	}
	
	public int getthisNumber() {
		return this.number;
	}
}
public class Ex37_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The myNumber_number of a is: "+a.getsuperNumber());
		System.out.println("The myNumber_number of a is: "+a.getthisNumber());
	}

}
