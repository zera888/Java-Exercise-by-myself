abstract class myNumber{
	private int number=5;
	public int getNumber() {
		return number;
	}
	
}

class E extends myNumber{}

public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a= new E();
		//�]��myNumber�e�mabstract����H�{��,�T��ͷs����.�ҥH�Ѥl���O����
		System.out.println(a.getNumber());
	}

}
