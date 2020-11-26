package cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Main {
public static void main(String[] args) {
	
	CyclicBarrier cb=new CyclicBarrier(3, new MainBarrier());
	

	Thread t1=new Thread(new Task(cb),"Thread-0");
	Thread t2=new Thread(new Task(cb),"Thread-1");
	
	Thread t3=new Thread(new Task(cb),"Thread-3");


	t1.start();
	t2.start();
	
	t3.start();
	
}
}
