class myException extends Exception{
	//�~�Ӥ��إߥ~�B�z���OException,
	//�P�ɱNmyException�[�J�ҥ~�B�z��Ʈw(Exception Lib)
	myException(){   //�غc�lmyException
		super("myException Message");
		//�ۭq�w�w�T���ҥ~�B�z���O,��super�N�T��myException Message�ǵ������OException
	}
}

class Ex64 {

	public static void main(String[] args) {
		int x,y;
		
		try {
			x=10;
			y=0;
			if(y==0) throw new myException();
			//�]����y==0���ߤQ�A�H�ۭq�������OmyException���ͷs�ҥ~�B�z����
			//�åB�H�w�w�T��myException Message
			x=10/0;
			System.out.println("x= "+x);
		}

		catch(myException e){
			System.out.println(" In myException :"+e.getMessage());
		}
	}

}
