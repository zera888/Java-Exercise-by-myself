class myException extends Exception{
	//繼承內建立外處理類別Exception,
	//同時將myException加入例外處理資料庫(Exception Lib)
	myException(){   //建構子myException
		super("myException Message");
		//自訂預定訊息例外處理類別,用super將訊息myException Message傳給父類別Exception
	}
}

class Ex64 {

	public static void main(String[] args) {
		int x,y;
		
		try {
			x=10;
			y=0;
			if(y==0) throw new myException();
			//設條件y==0成立十，以自訂物件類別myException產生新例外處理物件
			//並且以預定訊息myException Message
			x=10/0;
			System.out.println("x= "+x);
		}

		catch(myException e){
			System.out.println(" In myException :"+e.getMessage());
		}
	}

}
