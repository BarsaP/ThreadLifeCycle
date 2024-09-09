package com.nt.daemon;

public class Consumer extends Thread{
   DemonThread dt;
   Consumer(DemonThread dt){
	   this.dt =dt;
   }
   public void run() {
	   while(true) {
		   this.dt.consumer_item();
		   try {Thread.sleep(2000);}catch(Exception e) {}
	   }
   }
}
