package lti;

public class Demo2 {

	public static void main(String[] args) {
		Thread t2=Thread.currentThread();		// captures ongoing thread
		System.out.println(t2);
		System.out.println("ID  : "+t2.getId());
		MyThread t1 = new MyThread();
		
		t1.start();
	
		System.out.println("Exiting main");
		System.out.println("ID  : "+t1.getId());

	}

}
