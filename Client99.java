import java.net.*;
import java.io.*;

public class Client99 {
	public Client99() {
		try {
			InetAddress iaddr = InetAddress.getByName("192.168.0.101");
			Socket socket = new Socket("192.168.0.101",1234);
			System.out.println("Client Local Port = "+ socket.getLocalPort());
			System.out.println("Server Port = "+ socket.getPort());
			socket.close();
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		Client99 ClientStart = new Client99();

	}

}