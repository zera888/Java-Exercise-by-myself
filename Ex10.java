import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int amount;
		Scanner keyin = new Scanner(System.in);
		
		System.out.printf("請輸入購物金額為 : ");
		amount = keyin.nextInt();
		
		if (amount > 2000) {
			System.out.println("購物金額可以兌換2000元禮券");
		}
		else if (amount > 1000) {
			System.out.println("購物金額可以兌換1000元禮券");
		}
		else {
			System.out.printf("購物金額不足以兌換禮券");
		}
		
		keyin.close();
	}

}
