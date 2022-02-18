import java.net.*;
import java.io.*;

public class Client98 {
	public Client98() {
		try {
			Socket socket = new Socket("192.168.0.101",1234);
			socket.close();
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		Client98 ClientStart = new Client98();

	}

}
