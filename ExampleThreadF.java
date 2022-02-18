public class ExampleThreadF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		t.setName("Top Thread");
		t.setPriority(2);
		
		System.out.println("Thread="+t);
		
		int count=Thread.activeCount();
		System.out.println("currently active thread="+count);
	}

}