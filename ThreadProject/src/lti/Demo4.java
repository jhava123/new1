package lti;

public class Demo4 {

	public static void main(String[] args) {
		MyTransaction2 r=new MyTransaction2();
		Thread t1=new Thread(r,"Ram");
		Thread t2=new Thread(r,"Sham");
		Thread t3=new Thread(r,"Krishna");
		
		t1.start();	// start the thread
		t2.start();
		t3.start();
		try {
			t1.join();				// tell t1 to complete the task and come back...till then main is waiting
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting main");
	}

}
