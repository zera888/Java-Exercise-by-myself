interface myITF {
	//�������Ointerface�����e�m���O��interface,�åBinterface�L�{���X
	public void f();
	
	
}

class A implements myITF{
	//���O�{��A,�Himplements�Ӱ�myITF
	public void f() {
		//implement A�H�{���Xf(),�л\interface��f()�����e�{���X
		System.out.println("myITF");
	}
} 

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		//�H�{��A�����O�{�ǲ��ͷs����
		a.f();
		
	}

}
