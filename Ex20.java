class Study{
	private int credit=0;
	
	public void addercredit (int i) {credit += i;}
	public int totalcredit() { return credit; }
}

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Study joe = new Study();
		Study lulu = new Study();
		
		joe.addercredit(12);
		lulu.addercredit(9);
		
		joe.addercredit(6);
		lulu.addercredit(3);
		
		System.out.println("joe studied "+joe.totalcredit()+" credits");
		System.out.println("lulu studied "+lulu.totalcredit()+" creties");
		
	}

}
