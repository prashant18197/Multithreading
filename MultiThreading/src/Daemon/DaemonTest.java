package Daemon;

public class DaemonTest extends Thread{
	
	public void run()
	{
		System.out.println("isDaemeon of Test:"+Thread.currentThread().isDaemon());

		
		for(int i=0;i<10;i++)
		{
			/*
			 * try { //Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			System.out.println("Hello");
		}
	}
public static void main(String[] args) throws InterruptedException {
	
	DaemonTest dt=new DaemonTest();
	
	dt.setDaemon(true);
	dt.start();
	D d=new D();
	d.start();
	System.out.println("isDaemeon of main:"+Thread.currentThread().isDaemon());

	System.out.println("hello////////////////////////////////////////////");
	Thread.sleep(2000);
}
}

class D extends Thread{
	
	public void run()
	{
		System.out.println("I am d");
		
		System.out.println("isDaemeon:"+Thread.currentThread().isDaemon());
	}
}
