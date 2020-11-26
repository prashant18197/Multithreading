package synchronization.deadlock;

public class Deadlock {

	Resource r1 = new Resource();

	Resource r2 = new Resource();

	public void m1() {
		synchronized (r1) {
			System.out.println("r1 synchronization with thread in m1: " + Thread.currentThread());
		
			synchronized (r2) {
				System.out.println("r2 synchronization with thread in m1: " + Thread.currentThread());
			}
		}
		
	}

	public void m2() {

		synchronized (r2) {
			System.out.println("r2 synchronization with thread in m2: " + Thread.currentThread());
		

		synchronized (r1) {
			System.out.println("r1 synchronization with thread in m2: " + Thread.currentThread());

		}
		}
	}
}
