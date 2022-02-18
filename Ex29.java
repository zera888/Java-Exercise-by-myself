class MyNumber{
	int number;
	public void setNumber() {
		number = 3;
		System.out.println("Ths number of MyNumber is :"+ number);
	}
	
	public int getNumber() {
		return number;
	}
}

class E extends MyNumber{
	public void setNumber() {
		number=15;
		//子類別的內容被修改了	
	System.out.println("The number of E class is :"+number);	
	}
}
public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber();
		System.out.println("The number of a is : "+ a.getNumber());
		
	}

}
