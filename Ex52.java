import java.net.*;
import java.io.*;


public class Ex52 {
	ServerSocket SS;
	
	public Ex52() {
		SS = new ServerSocket(1234);
		//建立網路平台程式如果不以try/catcg執行.將發生編譯錯誤
		System.out.println("Server created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex52 ServerStart = new Ex52();
	}

}
