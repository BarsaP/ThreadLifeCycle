//Multithreaded_programing.java

class newthread implements Runnable {
	Thread t;
	newthread(){
		t = new Thread(this,"Hyd");
		//t=new Thread();
		t.start();
		//System.out.println(t);
	}

  public void run() {
	  System.out.println(t.getThreadGroup());
  }
}
public class Multithreaded_programing {

	public static void main(String[] args) {
		//System.out.println(t);
		 new newthread();
		//System.out.println(n);

	}

   }

