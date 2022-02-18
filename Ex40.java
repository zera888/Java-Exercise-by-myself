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
		//因為myNumber前置abstract為抽象程序,所以禁止產生新物件
		System.out.println(a.getNumber());
	}

}
