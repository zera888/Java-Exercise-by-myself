
public class Ex8 {

	public static void main(String[] args) {
		float a = 1.2345678901234567890f;
		System.out.printf("a=%.20f\n",a);
		//1.23456788063049320000
		
		a = 12.345678901234567890f;
		System.out.printf("a=%.20f\n",a);
		//12.3456792831420900000
		
		double b;
		b = 1.2345678901234567890;
		System.out.printf("b=%.20f\n",b);
		//1.23456789012345670000
		
		b = 123.45678901234567890;
		System.out.printf("b=%.20f\n",b);
		//123.45678901234568000000
	}

}
