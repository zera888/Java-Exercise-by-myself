class Mynumber {
	int n;
	
	Mynumber(){
		n=3;
		System.out.println("Here is Constructor and n="+n);
	}
	
	int getnumber() {
		return n;
	}
}
public class Ex14 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mynumber a = new Mynumber();
		System.out.println("Here is main and a.getnumber()="+a.getnumber());
		
	}

}
