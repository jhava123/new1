package lti;

public class Demo1 
{
	public static void main(String[] args)
	{
	Thread t1=Thread.currentThread();		// captures ongoing thread
	System.out.println(t1);
	System.out.println("ID  : "+t1.getId());
	System.out.println("NAME  : "+t1.getName());
	System.out.println("PRIORITY  :"+t1.getPriority());
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println();
	}

}
