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
		System.out.println("This is Constructor");
		super(5);
		//�I�s�����O���غc�lsuper����b�~�Ӫ��l���O�Ĥ@�C.�y���L�k���檺���D
	}
}
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The number = "+a.getNumber());
	}

}
