class Mynumber {
	private int n;
	public void setnumber (int i) {this.n= i;} 
	//this���������O����Mynumber���N�W�� 
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
