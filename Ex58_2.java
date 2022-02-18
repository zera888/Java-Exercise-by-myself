class Ex58_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		try {
			x=10/0;
			System.out.println("x= "+x);
		}
		
		finally {
			System.out.println("in finally");
			//只有try區段但沒有catch區段,只要有finally區段仍然可以編譯成功
		}
	}

}
