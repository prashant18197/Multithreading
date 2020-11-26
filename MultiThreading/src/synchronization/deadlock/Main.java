package synchronization.deadlock;

public class Main {

	public static void main(String[] args) {
		
	
	Deadlock d1=new Deadlock();
	
	ThreadOne tOne=new ThreadOne(d1);
	
	ThreadTwo tTwo=new ThreadTwo(d1);
	
	Thread t1=new Thread(tOne);
	
	Thread t2=new Thread(tTwo);
	
	
	t1.start();
	
	t2.start();
	
	
	}
}
