class A{
	A(){
		System.out.println("A's constructor");
		//���O�{��A
	}
}

class B extends A {
	B(){
		System.out.println("B's constructor");
		//���O�{��B,�~�Ӧ�A,�t�Φ۰ʦb�l���O���Ĥ@��[�@�C���ê�super,�Ұʤ����OA���غc�l
	}
}

class C extends B{
	C(){
		System.out.println("C's constructor");
		//���O�{��C,�~�Ӧ�B.�t�Φ۰ʰ���B���O���Ĥ@�C������super,������������OA���غc�l
	}
}

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
