abstract class myNumber{
	public int number=5;
	public abstract int getNumber() {
		//abstract��H��k���o�����e�X�A���O���{�Ǧ�{return number}.�y���sĶ���D
		return number;
	}
}

class E extends myNumber{}

public class Ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number of a is :"+a.getNumber());
	}

}
