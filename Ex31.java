class myNumber{
	private int number;
}

class E extends myNumber{
	public void setNumber(int i) {
		number = i; 
		// number�O�~�Ӧ�myNumber��private�ܼ�.�l���O���o�ϥ�
	}
	public int getNumber() {
		return number;
		// number�O�~�Ӧ�myNumber��private�ܼ�.�l���O���o�ϥ�
	}
}
public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		a.setNumber(5);
		System.out.println("The number of a is :"+a.getNumber());
	}

}