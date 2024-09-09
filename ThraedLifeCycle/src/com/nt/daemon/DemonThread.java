package com.nt.daemon;
/*Daemon thread in java is a service provider thread that provides service
 * to the user thread.
 * -> setDaemon(Boolean)
 * -> public Boolean isDaemon()
 * -> Garbage collector is best example of Daemon thread.
 *Producer Consumer Problem.....
 *Synchronized, Inter-thread communication
 * */
public class DemonThread {
	int n;
	boolean f = false;
	//f = false: chance: producer
	//f = true: chance: consumer
   synchronized public void producer_item(int n) {
	   if(f) {
		   try{wait();}catch(Exception e) {}
	   }
	   this.n = n;
	   System.out.println("Produced : "+this.n);
	   f = true;
	   notify();
   } 
   
   synchronized public int consumer_item() {
	   if(!f) {
		   try{wait();}catch(Exception e) {}
	   }
	   System.out.println("Consumed : "+this.n);
	   f = false;
	   notify();
	   return this.n;
   }
}
