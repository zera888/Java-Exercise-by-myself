import java.net.*;
import java.io.*;


public class Ex60 {
	ServerSocket SS;
	
	public Ex60() throws IOException{
		//��غc�l�ŧithrows IOException
		SS= new ServerSocket(1234);
		System.out.println("Server created");
	}
	public static void main(String[] args) throws IOException {
		//��_�l��k�{��main()�ŧithrows IOException
		Ex60 ServerStart = new Ex60();
	}

}
