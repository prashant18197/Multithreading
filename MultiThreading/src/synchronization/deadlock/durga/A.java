package synchronization.deadlock.durga;

public class A {

	synchronized void m1(B b)
	{
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {
			
		}
		b.last();
	}
	
	synchronized void last() {
		System.out.println("Inside A, last method");
	}
	
}
