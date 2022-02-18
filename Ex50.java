class myClass1{
	public void f() {
		System.out.println("in myClass1");
	}
}

class myClass2 extends myClass1{
	public void g() {
		System.out.println("in myClass2");
	}
}

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass1 a = new myClass2();
		a.f();
	}

}
