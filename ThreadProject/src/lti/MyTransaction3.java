package lti;

public class MyTransaction3 implements Runnable
{
	double balance=2000.00;
	@Override
	public void run() {
	
		System.out.println("Thread started is :"+Thread.currentThread().getName());
		synchronized(this)
		{
			deposit(1000.00);
		}
		
		System.out.println("Thread ended is :"+Thread.currentThread().getName());
	}
	//public synchronized void deposit(double amount)
	public  void deposit(double amount)
	{
		System.out.println("Balance before deposit :"+balance);
		balance=balance+amount;
		System.out.println("Balance after deposit :"+balance);
	}
}
