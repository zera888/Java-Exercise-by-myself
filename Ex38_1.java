class MyNumber{
	int unmber=5;
}

class E extends MyNumber{
	int	unmber = 10;	
	
	public int getsuperNumber() {
		return super.unmber;
	}
	
	public int getthisNumber() {
		return 	this.unmber;
	}
}
public class Ex38_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number of a is : "+ a.getthisNumber());
	}

}
