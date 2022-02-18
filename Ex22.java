class Mynumber{    //this在建構子之內也是所屬物件Mynumber之代名詞
	private int n;
	public Mynumber(int i) { this.n=i;}
	//this是所屬類別物件Mynumber之代名詞
	
	public int getnumber() { return n;}
}
public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mynumber M = new Mynumber(10);
		System.out.println("M.getnumber: "+M.getnumber());
	}

}
