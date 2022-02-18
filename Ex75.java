import java.io.*;
import java.lang.Math.*;

class JOB extends Thread{
	private String jobName;
	private int loopLmt;
	
	public JOB(int loopLmt, String jobName) {
		this.loopLmt = loopLmt;
		this.jobName = jobName;
	}
	
	private void PAUSE(double sec) {
		try {
			Thread.sleep(Math.round(1000.0*sec));
		}
		catch(InterruptedException ie) {};
	}
	
	public void run() {
		for(int i=1; i<=loopLmt; i++) {
			System.out.println(jobName + " : work "+i+" priority = : "+getPriority());
			PAUSE(Math.random());
		}
	}
}
public class Ex75 {

	public static void main(String[] args) {
		JOB job1 = new JOB(4,"job1");
		JOB job2 = new JOB(4,"job2");
		JOB job3 = new JOB(4,"job3");
		job1.setPriority(Thread.MAX_PRIORITY);
		job2.setPriority(Thread.NORM_PRIORITY+2);
		job3.setPriority(Thread.MIN_PRIORITY);
		job1.start();
		job2.start();
		job3.start();

	}

}
