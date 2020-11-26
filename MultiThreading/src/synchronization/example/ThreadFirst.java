package synchronization.example;

import java.util.List;

public class ThreadFirst extends Thread {

	IncrementerDecrementer inc;

	public ThreadFirst(IncrementerDecrementer inc) {
		this.inc = inc;
	}

	List<Integer> al;
	
	public ThreadFirst(List<Integer> alc) {
		this.al = alc;
	}
	
	public void run() {

		inc.increment();

		/*
		 * synchronized (inc) { IncrementerDecrementer.incrementS();
		 * 
		 * }
		 */
		
		// System.out.println(inc.getValue());
		/*
		 * for(Integer i=0;i<100;i++) { al.add(i);
		 * 
		 * }
		 */
	}
}
