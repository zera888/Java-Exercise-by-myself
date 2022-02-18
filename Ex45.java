interface myITF {
	//介面類別interface必須前置類別為interface,並且interface無程式碼
	public void f();
	
	
}

class A implements myITF{
	//類別程序A,以implements承做myITF
	public void f() {
		//implement A以程式碼f(),覆蓋interface的f()的內容程式碼
		System.out.println("myITF");
	}
} 

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		//以程序A之類別程序產生新物件
		a.f();
		
	}

}
