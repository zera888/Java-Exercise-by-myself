import java.io.*;
import java.lang.Math.*;

class JOB extends Thread {
	private String jobName;
	private int loopLmt;
	
	public JOB(int loopLmt, String jobName) {
		this.loopLmt=loopLmt;
		this.jobName=jobName;
	}
	
	private void PAUSE(double sec) {
		try {
			Thread.sleep(Math.round(1000.0*sec));
		}
		
		catch(InterruptedException ie) {};
	}
	
	public void run() {
		for (int i=1; i<=loopLmt; i++) {
			System.out.println(jobName +" : work "+i);
			PAUSE(Math.random());
		}
	}
}

public class Ex70 {

	public static void main(String[] args) {
		JOB job1 = new JOB(4,"job1");
		JOB job2 = new JOB(8,"job2");
		job1.start();
		job2.start();
		System.out.println("job1 is alive :"+job1.isAlive());
		//使用alive()測試job1是否生存	
		try {
			job1.join();
			//使用join()測知job1之所有執行續是否完全結束.job2繼續執行	
		}
		
		catch(InterruptedException ie) {}
		//等待job1所有執行緒完全結束後.job2繼續執行
		
		System.out.println("job1 is alive :"+job1.isAlive());

	}

}
