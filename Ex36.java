class A{
	A(){
		System.out.println("A's constructor");
		//類別程序A
	}
}

class B extends A {
	B(){
		System.out.println("B's constructor");
		//類別程序B,繼承自A,系統自動在子類別的第一行加一列隱藏的super,啟動父類別A的建構子
	}
}

class C extends B{
	C(){
		System.out.println("C's constructor");
		//類別程序C,繼承自B.系統自動執行B類別的第一列的隱藏super,跳往執行父類別A的建構子
	}
}

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
