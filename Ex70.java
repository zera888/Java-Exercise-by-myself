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
		//�ϥ�alive()����job1�O�_�ͦs	
		try {
			job1.join();
			//�ϥ�join()����job1���Ҧ�������O�_��������.job2�~�����	
		}
		
		catch(InterruptedException ie) {}
		//����job1�Ҧ����������������.job2�~�����
		
		System.out.println("job1 is alive :"+job1.isAlive());

	}

}
