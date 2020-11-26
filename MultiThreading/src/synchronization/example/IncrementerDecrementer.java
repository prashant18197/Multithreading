package synchronization.example;

public class IncrementerDecrementer {

	int i = 0;

	static int x = 0;

	synchronized public void increment() {
		for (int icnt = 0; icnt < 1000; icnt++) {

			synchronized (this) {
				i++;
			}
			System.out.println("increment111111111111111111111111111");
		}
	}

	public synchronized static void incrementS() {
		for (int icnt = 0; icnt < 1000; icnt++) {
			
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
		for (int icntl = 0; icntl < 1000; icntl++) {
			System.out.println("decrement2222222222222222222222222222222");

			synchronized (this) {
				i--;
			}
		}
	}

	public int getValue() {
		return i;
	}

	public static int getValueS() {
		return x;
	}
}
