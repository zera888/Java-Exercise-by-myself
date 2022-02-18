class myNumber{
	int number = 5;
}

class E extends myNumber{
	int number = 10;
	public int getsuperNumber() {
		return super.number;
		//super為父類別的代名詞.回傳父類別的super.number的number數值
	}
	
	public int gerthisNumber() {
		return this.number;
		//this為自己本身類別的代名詞.回傳this.number的number數值
	}
}


public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		System.out.println("The myNumber_number of a is : "+a.getsuperNumber());
		System.out.println("The E_number of a is: "+a.gerthisNumber());
		
	}

}
