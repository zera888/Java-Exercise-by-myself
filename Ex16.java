class adder{
	int add(int a, int b) {
		return a+b;
	}
	
	double add (double i, double j) {
		return i+j;
	}
	
	int add (int p, int q , int r) {
		return p+q+r;
	}
}
public class Ex16 {

	public static void main(String[] args) {
		// 建構子之應用
		
		int c;
		double k;
		int s;
		
		adder ad = new adder();
		
		c=ad.add(1, 2);
		System.out.println("int c="+c);
		
		k=ad.add(3.3, 4.4);
		System.out.println("double k = "+ k);
		
		s= ad.add(8,9,7);
		System.out.println("int s="+s);
	}

}
