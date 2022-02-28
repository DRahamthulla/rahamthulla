package Threading;

public class ImplementsMain implements Runnable {

	public static void main(String[] args) {
		ImplementsMain m=new ImplementsMain();
		Thread thread=new Thread(m);
		thread.start();
	 	System.out.println("this code is outside of the thread");


	}

	public void run() {
	 	System.out.println("this code is  running in a thread");
	}

}
