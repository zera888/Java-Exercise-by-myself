class MyNumber{
	private int number = 5;
	public void setNumber(int i) {
		number = i;
	}
	
	public int getNumber() {
		return number;
	}
}

class E1 extends MyNumber{}
//�l���OE1�~��Mynumber�@���S�ʩM�\��

class E2 extends MyNumber{}
//�l���OE2�~��Mynumber�@���S�ʩM�\��

class Ex26 {

	public static void main(String[] args) {
		E1 a1 = new E1();
		E2 a2 = new E2();
		
		a1.setNumber(10);
		
		System.out.println("The number of a1 is: "+ a1.getNumber());
		System.out.println("Ths number of a2 is: "+ a2.getNumber());
		//���ME1�ME2���O�~��MyNumber���S��,���O���O���ۤz�A�A�Ȧ�E1������a1�ƭȧ���
	}

}
