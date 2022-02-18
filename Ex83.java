import java.io.File;
import java.util.Date;
import java.lang.*;

class Ex83 {
	
	private Object prey;

	public static void main(String args[]) throws java.io.IOException{
		
		if (args.length <1) {
			System.out.println("Usage : java Ex83[fileName]");
			System.exit(1);
		}

		
		String fileName =args[0];
		File f = new File(fileName);
		
		System.out.println("The File is:"+f.getName());
		System.out.println(" File Name: "+f.getName());
		System.out.println(" File Name: "+f.getName());
		System.out.println(" Canonical File Name:"+f.getCanonicalFile());
		System.out.println(" canWritable:"+f.canWrite());
		System.out.println(" Length:"+f.length());
		System.out.println(" Hidden:"+f.isHidden());
		System.out.println(" isFile:"+f.isFile());
		System.out.println(" isDirectory:"+f.isDirectory());
		System.out.println("LastModified: "+new Date(f.lastModified()));
		
		
	}

}
