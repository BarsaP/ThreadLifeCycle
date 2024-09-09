package com.nt.daemon;

public class Producer extends Thread{
	
   DemonThread dt;
   
   Producer(DemonThread dt){
	   this.dt = dt;
   }
   
   public void run() {
	   int i =1;
	   while(true) {
		   this.dt.producer_item(i);
		   try{Thread.sleep(1000);}catch(Exception e) {}
		   i++;
	   }
   }
   
}
