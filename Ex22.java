class Mynumber{    //this�b�غc�l�����]�O���ݪ���Mynumber���N�W��
	private int n;
	public Mynumber(int i) { this.n=i;}
	//this�O�������O����Mynumber���N�W��
	
	public int getnumber() { return n;}
}
public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mynumber M = new Mynumber(10);
		System.out.println("M.getnumber: "+M.getnumber());
	}

}
