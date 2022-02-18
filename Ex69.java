import java.io.*;
import java.lang.Math.*;

class JOB implements Runnable {
	private String jobName;
	private int loopLmt;
	
	public JOB (int loopLmt, String jobName) {
		this.loopLmt = loopLmt;
		this.jobName = jobName;
	}
	
	private void PAUSE(double sec) {
		try {
			Thread.sleep(Math.round(1000.0*sec));
		}
		
		catch(InterruptedException ie){};
	}
	
	public void run() {
		for (int i=1; i<=loopLmt; i++) {
			System.out.println(jobName+"work"+i);
			PAUSE(Math.random());
		}
	}
	
}
public class Ex69 {

	public static void main(String[] args) {
		Thread job1 = new Thread(new JOB(4,"job1"));
		//�H�����(Thread)����ƫ��A�������ͷs���������job1.�]�w�j��4.�ѼƦWjob1
		Thread job2 = new Thread(new JOB(4,"job2"));
		//�H�����(Thread)����ƫ��A�������ͷs���������job2.�]�w�j��4.�ѼƦWjob2
		job1.start();
		job2.start();

	}

}
