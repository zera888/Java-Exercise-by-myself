interface myITF{
	public void f();
}

class myNumber{
	public void g() {
		System.out.println("in myNumber");
	}
}


class A extends myNumber implements myITF{
	//���O�{��A�P���~��(extends)���OmyNumber,�P�ӧ@(implements)����myITF
	public void f() {
		System.out.println("in myITF");
	}
}

public class Ex46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.f();
		a.g();
	}

}
