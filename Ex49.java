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
		//�H���OmyClass1����ƫ��A�A�H���OmyClass2�����髬�A�A���ͷs����a
		a.f();
	}

}
