class myNumber{
	private int number;
	
	myNumber(int number){
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
}

class E extends myNumber{
	E(){
		super(5);
		System.out.println("This is Constructor");
		//�I�s�����O���غc�lsuper��b�~�Ӫ��l���O�Ĥ@�C.�ѨM�L�k���檺���D
	}
}


public class Ex35_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number = "+a.getNumber());
	}

}