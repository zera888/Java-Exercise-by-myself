class MyNumber{
	private int number;
	public void setNumber(int i) {
		number=i;
	}
	
	public int getNumber() {
		return number;
	}
	
}

class E extends MyNumber{
	private String string;
	public void setString(String s) {
		string= s;
	}
	
	public String getString() {
		return string;
	}
}

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber(5);
		a.setString("I am in the subclass");
		
		System.out.println("The number of a is: "+a.getNumber());
		System.out.println("The string of a is: "+a.getString());
	}

}
