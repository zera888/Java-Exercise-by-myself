class myClass1{
	public void f() {
		System.out.println("in myClass1");
	}
}

class myClass2 extends myClass1{
	public void f() {
		System.out.println("In myClass2");
	}
}

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass1 a = new myClass2();
		//以類別myClass1為資料型態，以類別myClass2為實體型態，產生新物件a
		a.f();
	}

}
