import java.io.*;
import java.lang.Math.*;
//�]�p������job1.job2�U����4���A�[���Ӱ�����v�mcpu���{�H


class JOB extends Thread {
	//�إ����OJOB�~��Thread.�إߦh�u��������.���Ѧh�Ӱ�����P�ɶi�����
	private String jobName;
	private int loopLmt;
	
	public JOB(int loopLmt, String jobName) {
		//�إ����OJOB���غc�l.�Ѽ�int loopLmt���Y��������\������j���
		//�Ѽ�String jobName���Ӱ�������W��
		this.loopLmt = loopLmt;
		this.jobName = jobName;
	}
	
	private void PAUSE(double sec) {
		//��k�{��PAUSE.��i��Y�����.�����槹���@�^��ɡA�𮧵��ݤ@�q�ɶ�
		//�A�~��i�����U�@�Ӱj��C�b���ݮɡA�t�αN�w�ƨ�L������i�J���檬�A
		try {
			Thread.sleep(Math.round(1000.0*sec));
			//����Ӱ�������𮧵���
			}
		catch(InterruptedException ie) {}; //�ҥ~�B�z
	}
	
	public void run() {
		//��k�{��run,�b������t�C��.���{���X*.start()�������k�{��
		for (int i=1; i<=loopLmt; i++) {
			//�HloopLmt����Y��������j��
			System.out.println(jobName +"work"+i);
			PAUSE(Math.random());
		}
	}
}


public class Ex68 {

	public static void main(String[] args) {
		//���D�{�����O.���Ͱ��������job1,job2�ð��椧
		JOB job1 = new JOB(4,"job1");
		//�Hnew�����OThread�������ͷs���������job1
		JOB job2 = new JOB(4,"job2");
		//�Hnew�����OThread�������ͷs���������job2
		job1.start();
		//�H��k�{��start().�N�����ݱƵ{�i�Jcpu����
		job2.start();
		//�H��k�{��start()�A�N�����ݱƵ{�i�Jcpu����

	}

}
