class myNumber{
	public int number;
}

class E extends myNumber{
	public void setNumber(int i) {
		number=i;
	}
	
	public int getNumber(){
		return number;
	}
}

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber(18);
		System.out.println("The number of a is :"+a.getNumber());
	}

}
