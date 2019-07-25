package lti;

public class MyThread extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executing run from sub class MyThread ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThread Exiting");
	}
	
}
