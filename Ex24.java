class Mynumber{
	private int n;
	public Mynumber(int i) { this.n=i;}
	//this是類別程序Mynumber之代名詞
	
	public Mynumber(int j, String s) {
		this(j);
		//this為重載建構子(line 03)之代名詞.必須置於建構子的第一列
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
