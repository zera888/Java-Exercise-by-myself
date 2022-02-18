class Mynumber {
	private int n;
	public void setnumber (int i) {this.n= i;} 
	//this為所屬類別物件Mynumber之代名詞 
	public int getnumber() { return n;}
}

class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mynumber M = new Mynumber();
		M.setnumber(28);
		System.out.println("M.getnumber:"+M.getnumber());
	}

}
