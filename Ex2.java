public class Ex2 {

	public static void main(String[] args) {
		int a=3, b=5, c;
		c=a++ +b;  //先處理a+b,再處理a++
		System.out.println("a="+ a + ", c= "+ c);

	}

}
