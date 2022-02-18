class MyThread implements Runnable {
	int x;
	
	MyThread(int x){
		this.x=x;
	}
	
	public void run() {
			for (int i = 1; i<=x; i++) {
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}
}
public class ExampleThreadC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread T1=new Thread(new MyThread(10));
		Thread T2=new Thread(new MyThread(5));
		T1.start();
		T2.start();
	}

}

