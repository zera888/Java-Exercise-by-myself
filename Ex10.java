import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int amount;
		Scanner keyin = new Scanner(System.in);
		
		System.out.printf("�п�J�ʪ����B�� : ");
		amount = keyin.nextInt();
		
		if (amount > 2000) {
			System.out.println("�ʪ����B�i�H�I��2000��§��");
		}
		else if (amount > 1000) {
			System.out.println("�ʪ����B�i�H�I��1000��§��");
		}
		else {
			System.out.printf("�ʪ����B�����H�I��§��");
		}
		
		keyin.close();
	}

}
