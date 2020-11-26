package com.mindstix.interthreadcommunication;

import java.util.Queue;
import java.util.Random;

public class ProducerThread extends Thread {

	Queue<Integer> q;

	public ProducerThread(Queue<Integer> q,String name) {
		super(name);
		this.q = q;
	}

	public void run() {

		while (true) {
			synchronized (q) {

				while (q.size() == 3) {
					System.out.println(Thread.currentThread().getName() +"queue is full waiting for consumer to consume");
					try {
						q.wait();
					} catch (InterruptedException e) {
						System.out.println("exception ala re");
						e.printStackTrace();
					}
				}
System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
System.out.println("****************"+q.size());
				Random r = new Random();
				int x = r.nextInt();
				q.add(x);
				System.out.println(Thread.currentThread().getName() +"Item produced is " + x);
				q.notify();
			}
		}

	}
}
