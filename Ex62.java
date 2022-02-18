class Ex62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		try {
			x=10;
			y=0;
			if (y==0) throw new ArithmeticException("DIY Message");
			//設定條件如果y==0時,寄生於內建類別物件ArithmeticException產生匿名之新例外處理物件
			//設定新訊息"DIY Message",此匿名新例外處理物件之訊息將取代內建類別物件ArithmeticException
			x=10/0;
			System.out.println("x="+x);
		}
		
		catch (ArithmeticException e) {
			System.out.println("In ArithmeticException : "+e.getMessage());
			
		}
	}

}
