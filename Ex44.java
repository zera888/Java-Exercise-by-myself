abstract class myNumber{
	//�Z�O�{��������H���O.�����b���O�e���e�mabstract
	public int number=5;
	public abstract int getNumber();
}

class E extends myNumber{
	public int getNumber() {
		return number;
	}
}
public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number of a is : "+a.getNumber());
	}

}
