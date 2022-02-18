import java.io.*;

public class Ex93 {

	public static void main(String[] args) throws Exception {
		int i;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Input data in the keyboard:");
		while(true) {
			i= br.read();
			System.out.print((char)i);
		}
	}

}
