class Ex55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		try {
			x=10/0;
			//�G�N�]�p�ƾǰ��D�btry�Ϭq
			System.out.println("x= "+x);
		}
		
		catch (ArithmeticException e) {
			//�bcatch�Ϭq��ArithmeticException�������~�ƾǦ�
			System.out.println("in AritheticException: "+e.getMessage());
			//�C�L�X�����쪺�T��
		}
	}

}
