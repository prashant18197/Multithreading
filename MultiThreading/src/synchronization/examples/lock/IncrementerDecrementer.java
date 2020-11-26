package synchronization.examples.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IncrementerDecrementer {

	int i = 0;

	static int x = 0;

	Lock l = new ReentrantLock(true);

	 public void increment() {
		for (int icnt = 0; icnt < 100; icnt++) {

	
			//l.lock();
			if(l.tryLock()) {
			System.out.println("increment111111111111111111111111111");
			i++;

			}
			else
			{
				System.out.println("........>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			}
			//l.unlock();
		}
	}

	public synchronized static void incrementS() {
		for (int icnt = 0; icnt < 30; icnt++) {

			x++;

			System.out.println("static-incremen----------------------------------------t");
		}
	}

	public synchronized static void decrementS() {
		for (int icntl = 0; icntl < 1000; icntl++) {
			System.out.println("static-decrement**************************************************");
			x--;

		}
	}

	public void decrement() {
		for (int icntl = 0; icntl < 100; icntl++) {
			//l.lock();
			if(l.tryLock()){
			i--;
			System.out.println("decrement2222222222222222222222222222222");
			}
			else
			{
				System.out.println("decrement2222222222222222222222222222222");
				i--;
			}
			//l.unlock();

		}
	}

	public int getValue() {
		return i;
	}

	public static int getValueS() {
		return x;
	}
}
