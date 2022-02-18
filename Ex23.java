class Mynumber {
	private int n;
	public Mynumber(int i) { this.n=i;}
	//this是類別程序Mynumber之代名詞
	
	public Mynumber(int j, String s) { this(j);}
	//this為重載建構子(line 03)之代名詞
		
	public int getnumber() { return n;}
}
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mynumber M = new Mynumber(15, "abcde");
		System.out.println("M.getnumber: "+M.getnumber());
	}

}
