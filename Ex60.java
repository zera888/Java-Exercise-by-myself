import java.net.*;
import java.io.*;


public class Ex60 {
	ServerSocket SS;
	
	public Ex60() throws IOException{
		//於建構子宣告throws IOException
		SS= new ServerSocket(1234);
		System.out.println("Server created");
	}
	public static void main(String[] args) throws IOException {
		//於起始方法程序main()宣告throws IOException
		Ex60 ServerStart = new Ex60();
	}

}
