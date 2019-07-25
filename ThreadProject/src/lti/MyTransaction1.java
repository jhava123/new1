package lti;

public class MyTransaction1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executing run from class MyTransaction ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyTransaction Exiting");
	}
	
}
