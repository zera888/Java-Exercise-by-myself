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
			//�u��try�Ϭq���S��catch�Ϭq,�u�n��finally�Ϭq���M�i�H�sĶ���\
		}
	}

}
