class Ex62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		try {
			x=10;
			y=0;
			if (y==0) throw new ArithmeticException("DIY Message");
			//�]�w����p�Gy==0��,�H�ͩ󤺫����O����ArithmeticException���ͰΦW���s�ҥ~�B�z����
			//�]�w�s�T��"DIY Message",���ΦW�s�ҥ~�B�z���󤧰T���N���N�������O����ArithmeticException
			x=10/0;
			System.out.println("x="+x);
		}
		
		catch (ArithmeticException e) {
			System.out.println("In ArithmeticException : "+e.getMessage());
			
		}
	}

}
