package synchronization.deadlock;

public class ThreadTwo implements Runnable{

	Deadlock de;

	public ThreadTwo(Deadlock de) {
		super();
		this.de = de;
	}

	@Override
	public void run() {

		de.m2();

	}
}
