class myClass1{
	public void f() {
		System.out.println("in f of myClass1");
	}
}

class myClass2 extends myClass1{
	public void g() {
		System.out.println("in g of myClass2");
	}
}


public class Ex51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass1 a = new myClass2();
		a.f();
		//�]��a����ƫ��A��myClass1,����ɨt�Υ��j�MmyClas1�~�j�MmyClass2
		//�]��myClass1�Lg(),�ҥH�o�ͽsĶ���~
	}

}
