import java.net.*;
import java.io.*;

public class Ex53 {
	ServerSocket SS;
	
	public Ex53() {
		try {
			SS = new ServerSocket(1234);
			System.out.println("Server created");
			//try區段，容納執行程式
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
			//catch區段，當try區段發生錯誤時，例外處理資料庫內之類別IOException
			//將捕捉錯誤原因.同時執行停止執行.並顯現錯誤訊息
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex53 ServerStart = new Ex53();
	}	
}
	

	


