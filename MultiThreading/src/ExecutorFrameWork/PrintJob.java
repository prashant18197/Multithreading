package ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob implements Runnable {

	public String name;
	
	public PrintJob(String name)
	{
		this.name=name;
	}
	
	@Override
	public void run() {

		System.out.println(name +" : "+"The job started by thread :"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name +" : "+"The job completed by thread :"+Thread.currentThread().getName());

	}
public static void main(String[] args) {
	
	ExecutorService es=Executors.newFixedThreadPool(4);
	
	PrintJob job[]= {new PrintJob("prashant"),new PrintJob("Ravi"),new PrintJob("Datta"),new PrintJob("Abbas"),new PrintJob("Aasif"),new PrintJob("Simran")};
	
	for(PrintJob jobs:job)
	{
		es.submit(jobs);
	}
	
	es.shutdown();
}
	
}
