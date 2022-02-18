import java.io.*;

class NumberIssue {
	//類別class NumberIssue，功能為對旅客按順序售給車票號碼
	int iniNumber, numberInterval;
	//class NumberIssue之建構子，設定物件參數，號碼初始值與號碼間隔值
	
	public NumberIssue(int iniNumber, int numberInterval) {
		this.iniNumber = iniNumber;
		this.numberInterval = numberInterval;
	}
	
	//public synchronized int getNumber()
	//執行class NumberIssue之方法程序getNumber將號碼回傳給要求號碼之執行緒物件
	//因有修飾子synchronized，當有數個執行緒要求號碼時，同一時間只允許一個執行緒要求號碼
	public int getNumber()
	{
		int num = iniNumber;
		try {
			Thread.sleep(100);
			//執行緒的休息時間
		}
		catch(InterruptedException e) {};
		return(num);
		//方法程序getNumber將初值加上間隔值求得號碼後，回傳給要求號碼的執行緒物件
	}
}

class Passanger extends Thread {
	int number;
	NumberIssue NI;
	//類別Passanger乘客使用class NumberIssue類別要求車票號碼
	
	public Passanger(NumberIssue NI) {
		//類別Passanger之執行狀態，以類別class NumberIssue設定初值參數與間隔參數，產生新物件NI
		this.NI = NI;
	}
	
	public void run() {
		number = NI.getNumber();
		//類別Passanger之執行狀態，取得車票號碼
	}
}

public class Ex77 {

	public static void main(String[] args) {
		NumberIssue NI;
		Passanger p1,p2,p3,p4;
		
		NI = new NumberIssue(1,2);
		//以類別class NumberIssue為資料型態，設定初始值參數與間隔參數，產生新物件
		
		p1 = new Passanger(NI);  p1.start();
		p2 = new Passanger(NI);  p2.start();
		p3 = new Passanger(NI);  p3.start();
		p4 = new Passanger(NI);  p4.start();
		//以類別Passanger為資料型態，NI為參數，產生多個旅客物件並要求車票號碼
			
		try {
			p1.join();p2.join();p3.join();p4.join();
			//等待訪客物件取得車票號碼
		}
		catch (InterruptedException e) {};

		System.out.println("Passanger 1: Number : "+p1.number);
		System.out.println("Passanger 2: Number : "+p2.number);
		System.out.println("Passanger 3: Number : "+p3.number);
		System.out.println("Passanger 4: Number : "+p4.number);
		//印出個訪客名稱， 及其取得之車票號碼
	}

}
