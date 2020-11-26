package synchronization.examples.lock;

public class test {

	public static void main(String[] args) throws InterruptedException {

		IncrementerDecrementer inc = new IncrementerDecrementer();
		
		ThreadFirst ft = new ThreadFirst(inc);

		ThreadSecond ts = new ThreadSecond(inc);

		ft.start();

		ts.start();

		ft.join();
		
		ts.join();
		
		System.out.println("final value is :" + inc.getValue());
		
		System.out.println("final static value is :" + IncrementerDecrementer.getValueS());


	}
}
