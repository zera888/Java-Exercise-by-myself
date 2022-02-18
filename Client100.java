import java.net.*;
import java.io.*;

public class Client100 {
	static String iaddr;
	static int port;
	
	public Client100() {
		try {
			
			Socket socket = new Socket(InetAddress.getByName(iaddr),1234);
			socket.close();
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		if (args.length<2) {
			System.out.println("Usage : java Client100[iaddr][1234]");
			System.exit(1);
		}
		
		iaddr=args[0];
		port=Integer.parseInt(args[1]);
		Client100 ClientStart = new Client100();

	}

}
