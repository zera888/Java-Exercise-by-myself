class MyNumber{
	int unmber;
	final void setNumber() {
		number = 5;
		// �]����k�{��setNumber�e�mfinal,���o�Q�мg
	}
}

class E extends MyNumber{
	public void setNumber() {
		number = 10;
		//�]�������O����k�{�ǫe�mfinal,�ҥH�мg����
		
	}
}
public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber();
		System.out.println("The number of a is : "+ a.getNumber());

	}

}
