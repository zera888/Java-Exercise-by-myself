import java.net.*;
import java.io.*;

public class Ex59 {
	ServerSocket SS;
	
	public Ex59() {
		try {
			SS= new ServerSocket(1234);
			System.out.println("Server created");
		}
		
		finally {
			System.out.println("in finally");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex59 ServerStart = new Ex59();
		//�u�]�mtry�Ϭq�o�S��catch�Ϭq�A�Y�Ϧ�finally�Ϭq�]�|�sĶ�����\
	}

}
