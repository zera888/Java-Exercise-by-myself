import java.lang.*;

public class ExampleThreadE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		Thread t1=Thread.currentThread();
		t.setName("Top Thread");
		t1.setName("Second Thread");
		t.setPriority(2);
		t1.setPriority(10);
		
		System.out.println("Thread="+t);
		System.out.println("Thread="+t1);
		
		int count=Thread.activeCount();
		System.out.println("currently active thread="+count);
	}

}
