class Number {
	static int n=0;
	
	static void addN(int i) { n = i ;}
	static int getN() { return n; }
}
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number.addN(10);
		System.out.println("Number.getN:"+Number.getN());
		
		Number.n=20;
		System.out.println("Number.n:"+Number.n);
	}

}
