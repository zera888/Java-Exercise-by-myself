import java.io.*;

class NumberIssue {
	//���Oclass NumberIssue�A�\�ର��ȫȫ����ǰ⵹�������X
	int iniNumber, numberInterval;
	//class NumberIssue���غc�l�A�]�w����ѼơA���X��l�ȻP���X���j��
	
	public NumberIssue(int iniNumber, int numberInterval) {
		this.iniNumber = iniNumber;
		this.numberInterval = numberInterval;
	}
	
	//public synchronized int getNumber()
	//����class NumberIssue����k�{��getNumber�N���X�^�ǵ��n�D���X�����������
	//�]���׹��lsynchronized�A���ƭӰ�����n�D���X�ɡA�P�@�ɶ��u���\�@�Ӱ�����n�D���X
	public int getNumber()
	{
		int num = iniNumber;
		try {
			Thread.sleep(100);
			//��������𮧮ɶ�
		}
		catch(InterruptedException e) {};
		return(num);
		//��k�{��getNumber�N��ȥ[�W���j�ȨD�o���X��A�^�ǵ��n�D���X�����������
	}
}

class Passanger extends Thread {
	int number;
	NumberIssue NI;
	//���OPassanger���Ȩϥ�class NumberIssue���O�n�D�������X
	
	public Passanger(NumberIssue NI) {
		//���OPassanger�����檬�A�A�H���Oclass NumberIssue�]�w��ȰѼƻP���j�ѼơA���ͷs����NI
		this.NI = NI;
	}
	
	public void run() {
		number = NI.getNumber();
		//���OPassanger�����檬�A�A���o�������X
	}
}

public class Ex77 {

	public static void main(String[] args) {
		NumberIssue NI;
		Passanger p1,p2,p3,p4;
		
		NI = new NumberIssue(1,2);
		//�H���Oclass NumberIssue����ƫ��A�A�]�w��l�ȰѼƻP���j�ѼơA���ͷs����
		
		p1 = new Passanger(NI);  p1.start();
		p2 = new Passanger(NI);  p2.start();
		p3 = new Passanger(NI);  p3.start();
		p4 = new Passanger(NI);  p4.start();
		//�H���OPassanger����ƫ��A�ANI���ѼơA���ͦh�ӮȫȪ���ín�D�������X
			
		try {
			p1.join();p2.join();p3.join();p4.join();
			//���ݳX�Ȫ�����o�������X
		}
		catch (InterruptedException e) {};

		System.out.println("Passanger 1: Number : "+p1.number);
		System.out.println("Passanger 2: Number : "+p2.number);
		System.out.println("Passanger 3: Number : "+p3.number);
		System.out.println("Passanger 4: Number : "+p4.number);
		//�L�X�ӳX�ȦW�١A �Ψ���o���������X
	}

}
