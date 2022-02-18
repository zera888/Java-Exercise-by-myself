import java.net.*;
import java.io.*;

public class Ex96 {

	public static void main(String args[]) {
		try {
			ServerSocket SS1 = new ServerSocket(1234);
			System.out.println("ServerSocket SS1 is cereated");
			SS1.close();
			System.out.println("SS1 is closed");
			
			ServerSocket SS2 = new ServerSocket(0,2);
			System.out.println("ServerSocket SS2 is created");
			System.out.println("SS2.getLocalPort()="+SS2.getLocalPort());
			SS2.close();
			System.out.println("SS2 is closed");
		}
		
		catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
