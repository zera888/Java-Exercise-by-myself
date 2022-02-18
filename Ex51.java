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
		//因為a的資料型態為myClass1,執行時系統先搜尋myClas1才搜尋myClass2
		//因為myClass1無g(),所以發生編譯錯誤
	}

}
