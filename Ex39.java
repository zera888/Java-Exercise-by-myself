class MyNumber{
	int number;
	final void setNumber() {
		number=5;
	}
	
	public int getNumber() {
		return number;
	}
}

class E extends MyNumber{
	public void setNumber() {
		number=10;
		//�b�����O���׹��lfinal�]�w��k�{��setNumber,�ҥH�l���O����A�ϥ�
	}
}
public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber();
		System.out.println("The number of a is : "+a.getNumber());

	}

}
