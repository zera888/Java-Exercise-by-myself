class Mynumber {
	private int number;
	public void setNumber(int i) {
		//方法程序setNumber將參數i以number-i,存給number
		number = i;
	}
	
	public int getnumber() {
		return number;
	}
}

class E extends Mynumber{}
//類別E為資料型態，產生物件a。因為類別E繼承自類別Mynumber，Mynumber的內容，類別E繼承而得
//E為子類別.繼承父類別Mynumber的一切特性和功能
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E a = new E();
		
		a.setNumber(5);
		//執行物件a之方法程序setNumber，回傳
		System.out.println("a= "+ a.getnumber());
		
	}

}
