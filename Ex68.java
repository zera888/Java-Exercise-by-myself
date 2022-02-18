import java.io.*;
import java.lang.Math.*;
//設計執行續job1.job2各執行4次，觀察兩個執行緒競搶cpu的現象


class JOB extends Thread {
	//建立類別JOB繼承Thread.建立多工執行環境.提供多個執行緒同時進行執行
	private String jobName;
	private int loopLmt;
	
	public JOB(int loopLmt, String jobName) {
		//建立類別JOB之建構子.參數int loopLmt為某執行緒允許之執行迴圈數
		//參數String jobName為該執行緒之名稱
		this.loopLmt = loopLmt;
		this.jobName = jobName;
	}
	
	private void PAUSE(double sec) {
		//方法程序PAUSE.於進行某執行緒.美執行完畢一回圈時，休息等待一段時間
		//再繼續進行執行下一個迴圈。在等待時，系統將安排其他執行緒進入執行狀態
		try {
			Thread.sleep(Math.round(1000.0*sec));
			//執行該執行緒之休息等待
			}
		catch(InterruptedException ie) {}; //例外處理
	}
	
	public void run() {
		//方法程序run,在執行緒系列中.為程式碼*.start()之執行方法程序
		for (int i=1; i<=loopLmt; i++) {
			//以loopLmt執行某執行緒之迴圈
			System.out.println(jobName +"work"+i);
			PAUSE(Math.random());
		}
	}
}


public class Ex68 {

	public static void main(String[] args) {
		//為主程式類別.產生執行緒物件job1,job2並執行之
		JOB job1 = new JOB(4,"job1");
		//以new由類別Thread直接產生新執行緒物件job1
		JOB job2 = new JOB(4,"job2");
		//以new由類別Thread直接產生新執行緒物件job2
		job1.start();
		//以方法程序start().就緒等待排程進入cpu執行
		job2.start();
		//以方法程序start()，就緒等待排程進入cpu執行

	}

}
