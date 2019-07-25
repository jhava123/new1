package lti;

public class Demo3 {

	public static void main(String[] args) {
		MyTransaction1 r=new MyTransaction1();
		Thread t1=new Thread(r,"Ram");
		
		t1.start();	// start the thread
	
		System.out.println("Exiting main");
	

	}

}
