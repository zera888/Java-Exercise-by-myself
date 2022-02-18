import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner  keyin = new Scanner(System.in);
		
		System.out.printf("請輸入一個整數a :");
		a = keyin.nextInt();
		
		System.out.printf("請輸入一個整數b :");
		b = keyin.nextInt();
		
		System.out.println(a+"/"+b+" 的商數是 "+(a/b));
		System.out.println(a+"/"+b+" 的餘數是 "+(a%b));	
		
		keyin.close();

	}

}
