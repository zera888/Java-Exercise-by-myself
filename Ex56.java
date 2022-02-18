class Ex56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		try{
			x=10/0;
			System.out.println(" x = "+x);
		}
		
		catch (Exception e ) {
			System.out.println("in Exception :"+e.getMessage());
		}
		
	}

}
