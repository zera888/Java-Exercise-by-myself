class Ex58_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		try {
			x=10/0;
			System.out.println("x= "+x);
			//因為沒有catch區段捕捉try區段的錯誤.所以無法編譯下去
		}
	}

}
