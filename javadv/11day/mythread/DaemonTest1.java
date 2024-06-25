package mythread;

public class DaemonTest1 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
		thread.setDaemon(false);
		thread.setName("thread1");
		thread.start();
		
		Thread.sleep(3500);
	}
}
