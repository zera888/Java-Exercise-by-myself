import java.net.*;
import java.io.*;


public class Ex52 {
	ServerSocket SS;
	
	public Ex52() {
		SS = new ServerSocket(1234);
		//�إߺ������x�{���p�G���Htry/catcg����.�N�o�ͽsĶ���~
		System.out.println("Server created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex52 ServerStart = new Ex52();
	}

}
