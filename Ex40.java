abstract class myNumber{
	private int number=5;
	public int getNumber() {
		return number;
	}
	
}
public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myNumber a= new myNumber();
		//�]��myNumber�e�mabstract����H�{��,�ҥH�T��ͷs����
		System.out.println(a.getNumber());
	}

}
