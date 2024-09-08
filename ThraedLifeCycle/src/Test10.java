 //Test10.java
 class MyThread10 extends Thread {
	 @Override
	 public void run() {
		 System.out.println("run start");
		 System.out.println("In run #3:"+ this.getState());
		 
		 try {
			 Thread.sleep(5000);
		 }
		 catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 System.out.println("run end");
	 }
 }
 public class Test10 {
	 public static void main(String[] args) throws InterruptedException{
		 
		 MyThread10 mt = new MyThread10();
		 System.out.println("In main #1: "+mt.getState());
		 
		 mt.start();
		 System.out.println("In main #2: "+mt.getState());
		 
		 Thread.sleep(2000);
		 System.out.println("In main #4: "+mt.getState());
		 
		 Thread.sleep(8000);
		 System.out.println("In main #5: "+mt.getState());
		 
	 }
 }
