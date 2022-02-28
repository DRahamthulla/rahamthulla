package Threading;

class MainExtends extends Thread {
 public static void main(String[] agrs) {
	 	MainExtends t=new MainExtends();
	 	System.out.println("this code is outside of the thread");
	 	t.start();
 }
 public void run() {
	 System.out.println("this code is running in a thread");
 }
}