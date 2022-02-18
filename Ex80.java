import java.lang.*;

public class Ex80 {
	static int num;
	
	Ex80(){
		num = num +1 ;
		System.out.println("Ex80 num = "+num);
	}
	
		
	public static void main(String[] args) {
		num = Integer.parseInt(args[0]);
		
		System.out.println("this num ="+num);
		Ex80  a = new Ex80();
				
	}

}
