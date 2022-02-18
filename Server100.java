import java.net.*;
import java.io.*;

public class Server100 {
	static int port;
	
	public Server100(){
		try {
			ServerSocket SS = new ServerSocket(1234);
			System.out.println("Server is create and waiting Client to connect...");
			
			Socket socket = SS.accept();
			System.out.println("connect from Client "+ socket.getInetAddress().getHostAddress());
						
			socket.close();
		}
		
		catch (IOException e ) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		if (args.length<1) {
			System.out.println("Usage java Server100[1234]");
			System.exit(1);
		}
		port =Integer.parseInt(args[0]);
		Server100 ServerStart = new Server100();

	}

}
