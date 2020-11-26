package synchronization.examples.lock;

public class ThreadSecond extends Thread {

	IncrementerDecrementer inc;

	public void run() {

		System.out.println("*******************************" + inc.getValue());

		 inc.decrement();

		/*
		 * synchronized (inc) {
		 * 
		 * IncrementerDecrementer.decrementS(); }
		 */
		// System.out.println("decrement");

	}

	public ThreadSecond(IncrementerDecrementer inc) {
		this.inc = inc;
	}
}
