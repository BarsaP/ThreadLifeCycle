
class MyThread30 extends Thread {
	public void run() {
		System.out.println("This is user defined thread");
	}
}
class ThreadOp
{
public class Test09 {

	public static void main(String[] args) {
		for(int i =0; i<5; i++) {
		MyThread30 mt = new MyThread30();
		System.out.println(mt.getState());
		System.out.println(mt.getName());
		
		System.out.println(mt.getId());

	   }
	}
	
	MyThread30 my = new MyThread30();
	
   }
}
