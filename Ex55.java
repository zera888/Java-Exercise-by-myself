class Ex55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		try {
			x=10/0;
			//故意設計數學問題在try區段
			System.out.println("x= "+x);
		}
		
		catch (ArithmeticException e) {
			//在catch區段用ArithmeticException捕捉錯誤數學式
			System.out.println("in AritheticException: "+e.getMessage());
			//列印出捕捉到的訊息
		}
	}

}
