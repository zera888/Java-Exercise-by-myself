interface myITF1{
	public void f();
}

interface myITF2{
	public void g();
}

class A implements myITF1, myITF2{
	//類別A.同時承作(implements)介面myITF1和myITF2
	public void f() {
		System.out.println("in myITF1");
	}
	
	public void g() {
		System.out.println("in myITF2");
	}
	
}

public class Ex47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.f();
		a.g();
	}

}
