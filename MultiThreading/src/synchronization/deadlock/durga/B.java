package synchronization.deadlock.durga;

public class B {

	 synchronized void m2(A a) {
		try {
			//Thread.sleep(5000);
		} catch (Exception ex) {

		}

		a.last();
	}

	 synchronized void last() {
		System.out.println("Inside B, last method");
	}
}
