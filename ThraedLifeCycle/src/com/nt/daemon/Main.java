package com.nt.daemon;
//Communication bten 2 threads
public class Main {

	public static void main(String[] args) {
	 DemonThread dtc = new DemonThread();
	 
     Producer p = new Producer(dtc);
     Consumer c = new Consumer(dtc);
     p.start();
     c.start();
	}

}
