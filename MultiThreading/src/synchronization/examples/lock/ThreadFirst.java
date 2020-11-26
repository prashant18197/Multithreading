package synchronization.examples.lock;

public class ThreadFirst extends Thread {

	IncrementerDecrementer inc;

	public ThreadFirst(IncrementerDecrementer inc) {
		this.inc = inc;
	}

	public void run() {

		inc.increment();

		/*
		 * synchronized (inc) { IncrementerDecrementer.incrementS();
		 * 
		 * }
		 */
		
		// System.out.println(inc.getValue());

	}
}
