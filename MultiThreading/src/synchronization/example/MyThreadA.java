package synchronization.example;

public class MyThreadA extends Thread {

	
	static Thread bv;
	
	
	public void run() {

		try {
			bv.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i <= 10; i++) {
			
			System.out.println("A is :" + i);
			
			
		}
	}

}
