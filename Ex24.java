class Mynumber{
	private int n;
	public Mynumber(int i) { this.n=i;}
	//this�O���O�{��Mynumber���N�W��
	
	public Mynumber(int j, String s) {
		this(j);
		//this�������غc�l(line 03)���N�W��.�����m��غc�l���Ĥ@�C
		System.out.println("Here is a Overload Constructor");
		
		}
	
	public int getnumber() { return n;}
}

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mynumber M = new Mynumber(10, "abcde");
		System.out.println("M.getnumber: "+M.getnumber());
	}

}
