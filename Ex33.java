class myNumber{
	int number = 5;
}

class E extends myNumber{
	int number = 10;
	public int getsuperNumber() {
		return super.number;
		//super�������O���N�W��.�^�Ǥ����O��super.number��number�ƭ�
	}
	
	public int gerthisNumber() {
		return this.number;
		//this���ۤv�������O���N�W��.�^��this.number��number�ƭ�
	}
}


public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The myNumber_number of a is : "+a.getsuperNumber());
		System.out.println("The E_number of a is: "+a.gerthisNumber());
		
	}

}
