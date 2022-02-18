class MyNumber{
	private int number = 5;
	public void setNumber(int i) {
		number = i;
	}
	
	public int getNumber() {
		return number;
	}
}

class E1 extends MyNumber{}
//子類別E1繼承Mynumber一切特性和功能

class E2 extends MyNumber{}
//子類別E2繼承Mynumber一切特性和功能

class Ex26 {

	public static void main(String[] args) {
		E1 a1 = new E1();
		E2 a2 = new E2();
		
		a1.setNumber(10);
		
		System.out.println("The number of a1 is: "+ a1.getNumber());
		System.out.println("Ths number of a2 is: "+ a2.getNumber());
		//雖然E1和E2分別繼承MyNumber的特性,但是分別不相干涉，僅有E1的物件a1數值改變
	}

}
