class myNumber{
	private int number;
	
	myNumber (int number){
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
}

class E extends myNumber{
	E() {super(5);}
		//super�O�����O���ܼ�.�ҥH�M�Τ����O��number�ܼƭ�
		}

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number = "+a.getNumber());
	}

}
