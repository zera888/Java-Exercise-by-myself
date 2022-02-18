interface myNumber{
	public int number=5;
	public void setprint();
	public int getNumber();
}

class E implements myNumber{
	public void setprint() {
		System.out.println("in E");
	}
	
	public int getNumber() {
		return number;
	}
}
public class Ex48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setprint();
		System.out.println("The number of a is : "+a.getNumber());
	}

}
