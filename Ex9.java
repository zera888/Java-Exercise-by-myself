import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner  keyin = new Scanner(System.in);
		
		System.out.printf("�п�J�@�Ӿ��a :");
		a = keyin.nextInt();
		
		System.out.printf("�п�J�@�Ӿ��b :");
		b = keyin.nextInt();
		
		System.out.println(a+"/"+b+" ���ӼƬO "+(a/b));
		System.out.println(a+"/"+b+" ���l�ƬO "+(a%b));	
		
		keyin.close();

	}

}
