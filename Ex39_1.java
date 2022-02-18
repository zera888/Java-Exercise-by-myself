
class Ex39_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i=5;
		final int j;
		
		i=10;   //i已經設為fianl,不可做第二次設定
		j=20;
		
		j=30;
		//j已經設為final,不可第二次設定
		
		System.out.println("i= "+i);
		System.out.println("j= "+j);
	}

}
