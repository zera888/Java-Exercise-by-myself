class Ex63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticException f= new ArithmeticException("DIY Message");
		//產生內建類別物件ArithmeticException產生一個新例外處理物件f,設定新訊息DIY Message
		//此訊息將不干擾,不取代原內建類別物件ArithmeticException之訊息
		
		int x,y;
		
		try {
			x=10;
			y=0;
			x=10/0;
			System.out.println("x= "+x);
		}
		
		catch(ArithmeticException e) {
			System.out.println("In Built Message :"+e.getMessage());
			System.out.println("In DIY Message :"+e.getMessage());
		}
	}

}
