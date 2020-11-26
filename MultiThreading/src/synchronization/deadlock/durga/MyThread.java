package synchronization.deadlock.durga;

public class MyThread extends Thread{

	A a=new A();
	B b=new B();
	
	public void m1()
	{
		this.start();
		a.m1(b);
	}
	
	public void run()
	{
		b.m2(a);
	}
	public static void main(String[] args) {
		
		MyThread myThread=new MyThread();
		
		myThread.m1();
		
		
	}
}
