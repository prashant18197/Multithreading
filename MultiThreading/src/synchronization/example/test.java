package synchronization.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

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
		  
		  System.out.println("final static value is :" +
		  IncrementerDecrementer.getValueS());
		 
	

		
	}
}
