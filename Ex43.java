abstract class myNumber{
	public int number=5;
	public abstract int getNumber();
}
		

class E extends myNumber{
	public int getNumber() {
		return number;
		//�]�������O����k�{��abstract���঳�{���X�A�ҥH�b�~�Ӫ��l���O�H�{���X�^��
	}
}
public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number of a is :"+a.getNumber());
	}

}
