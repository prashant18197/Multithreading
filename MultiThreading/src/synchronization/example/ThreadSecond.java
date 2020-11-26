package synchronization.example;

import java.util.List;

public class ThreadSecond extends Thread {

	IncrementerDecrementer inc;
	
	List<Integer> al;
	
	public ThreadSecond(List<Integer> alc) {
		this.al = alc;
	}

	public void run() {

		//System.out.println("*******************************" + inc.getValue());

		 inc.decrement();

		/*
		 * synchronized (inc) {
		 * 
		 * IncrementerDecrementer.decrementS(); }
		 */
		// System.out.println("decrement");
		
		/*
		 * for(Integer i=100;i<10000;i++) {
		 * 
		 * al.add(i); }
		 */
		
	}

	public ThreadSecond(IncrementerDecrementer inc) {
		this.inc = inc;
	}
}
