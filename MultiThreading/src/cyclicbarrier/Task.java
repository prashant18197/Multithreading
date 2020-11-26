package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Task implements Runnable {

	CyclicBarrier cyclicBarrier;

	public Task(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " : I have completed my task ");
		try {
			int x=cyclicBarrier.await(1,TimeUnit.MILLISECONDS);
			System.out.println(x);
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * System.out.println(Thread.currentThread().getName() +
		 * " : I have done completed my task ");
		 * 
		 * try { cyclicBarrier.await(); } catch (InterruptedException e) {
		 * e.printStackTrace(); } catch (BrokenBarrierException e) {
		 * e.printStackTrace(); }
		 */
	}

}
