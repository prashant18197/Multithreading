package ExecutorFrameWork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassJob implements Callable{

	private Integer intval;

	public ClassJob(Integer intval) {
		super();
		this.intval = intval;
	}

	@Override
	public Object call() throws Exception {

		int sum=0;
		System.out.println("*************************************");
		for(int i=0;i<=intval;i++)
		{
			sum=sum+i;
			
		}
		for(long l=0;l<3000000000.0;l++);
		return sum;

	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es=Executors.newFixedThreadPool(4);
		
		ClassJob job[]= {new ClassJob(2),new ClassJob(3),new ClassJob(4),new ClassJob(5)};
		
		for(ClassJob jobs:job)
		{
			es.submit(jobs);
			System.out.println("/////////////////////////////////////");
			
			
		}
		
		es.shutdown();
	}
	
	
}
