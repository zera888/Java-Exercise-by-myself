import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileWriter;

class Ex86 {

	public static void main(String[] args)  throws Exception {
		int i;
		String [][] data = new String [5][2];
		
		if (args.length < 2) {
			System.out.println("Usage : java Ex86 [infileName][outfileName]");
			System.exit(1);
		}

		String infileName = args[0];
		String outfileName = args[1];
		
		FileInputStream fis = new FileInputStream(infileName);
		FileOutputStream fos = new FileOutputStream(outfileName);
		
		while ((i = fis.read())!= -1) {
			fos.write(i);
		}
		
	}

}
