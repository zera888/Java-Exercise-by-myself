class Ex57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		try {
			x=10/0;
			System.out.println("x= "+x);
		}
		
		catch(Exception e){
			System.out.println("in Exception :"+e.getMessage());
			//catch區段用來捕捉try區段的錯誤
		}
		
		finally {
			System.out.println("in finally");
			//finally區段一定會執行
		}
	}

}
