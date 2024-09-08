package com.nt.java;

class MyThread11 extends Thread {
	 @Override
	 public void run() {
		 System.out.println("run start");
		 System.out.println("In run #3:"+ this.isAlive());
		 
		 try {
			 Thread.sleep(5000);
		 }
		 catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 System.out.println("run end");
	 }
}

public class Test11 {
	public static void main(String[] args) throws InterruptedException {
		MyThread11 mt = new MyThread11();
		 System.out.println("In main #1: "+mt.isAlive());
		 
		 mt.start();
		 System.out.println("In main #2: "+mt.isAlive());
		 
		 Thread.sleep(2000);
		 System.out.println("In main #4: "+mt.isAlive());
		 
		 Thread.sleep(8000);
		 System.out.println("In main #5: "+mt.isAlive());
		 
	 }
}

