class Mynumber {
	private int number;
	public void setNumber(int i) {
		//��k�{��setNumber�N�Ѽ�i�Hnumber-i,�s��number
		number = i;
	}
	
	public int getnumber() {
		return number;
	}
}

class E extends Mynumber{}
//���OE����ƫ��A�A���ͪ���a�C�]�����OE�~�Ӧ����OMynumber�AMynumber�����e�A���OE�~�Ӧӱo
//E���l���O.�~�Ӥ����OMynumber���@���S�ʩM�\��
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		
		a.setNumber(5);
		//���檫��a����k�{��setNumber�A�^��
		System.out.println("a= "+ a.getnumber());
		
	}

}
