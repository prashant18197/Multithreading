package com.mindstix.interthreadcommunication;

import java.util.LinkedList;
import java.util.Queue;

public class InthreadCommunication {

	public static void main(String[] args) throws InterruptedException {

		Queue<Integer> q = new LinkedList<>();

		ProducerThread producerThreadOne = new ProducerThread(q,"Thread-One");

		ProducerThread producerThreadTwo = new ProducerThread(q,"Thread-two");

		ConsumerThread consumerThread = new ConsumerThread(q);

		producerThreadOne.start();
		
		
		producerThreadTwo.start();

		consumerThread.start();
		

	}

}
