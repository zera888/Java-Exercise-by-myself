class Ex63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticException f= new ArithmeticException("DIY Message");
		//���ͤ������O����ArithmeticException���ͤ@�ӷs�ҥ~�B�z����f,�]�w�s�T��DIY Message
		//���T���N���z�Z,�����N�줺�����O����ArithmeticException���T��
		
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
