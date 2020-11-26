package synchronization.examples.lock;

public class MyThreadB extends Thread {

	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("B is :" + i);
		}
	}
}
