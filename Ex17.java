class adder{
	int c;
	double k;
	
	adder(int a,int b){
		c=a+b;
		System.out.println("c="+c);
	}
	
	adder(double i, double j){
		k=i+j;
		System.out.println("k="+k);
	}
	
}
public class Ex17 {

	public static void main(String[] args) {
		// 建構子重載之應用
		adder add_int= new adder(7,8);
		adder add_double= new adder(1.5,6.3);
	}

}
