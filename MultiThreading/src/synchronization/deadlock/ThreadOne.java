package synchronization.deadlock;

public class ThreadOne implements Runnable {

	Deadlock de;

	public ThreadOne(Deadlock de) {
		super();
		this.de = de;
	}

	@Override
	public void run() {

		de.m1();

	}

}
