import java.net.*;
import java.io.*;

public class Ex53 {
	ServerSocket SS;
	
	public Ex53() {
		try {
			SS = new ServerSocket(1234);
			System.out.println("Server created");
			//try�Ϭq�A�e�ǰ���{��
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
			//catch�Ϭq�A��try�Ϭq�o�Ϳ��~�ɡA�ҥ~�B�z��Ʈw�������OIOException
			//�N�������~��].�P�ɰ��氱�����.����{���~�T��
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex53 ServerStart = new Ex53();
	}	
}
	

	


