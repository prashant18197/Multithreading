package com.mindstix.interthreadcommunication;

import java.util.Queue;

public class ConsumerThread extends Thread {

	Queue<Integer> q;

	public ConsumerThread(Queue<Integer> q) {
		super();
		this.q = q;
	}

	public void run() {
		while (true) {
			synchronized (q) {
				if (q.isEmpty()) {
					try {
						System.out.println("Queue is empty waiting for producer to produce");
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Item consumed is :" + q.remove());
				q.notifyAll();
			}

		}
	}

}
