package mythread;

public class DeamonTest2 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new MyThread();
		thread1.setDaemon(false); // 일반 스레드
		thread1.setName("thread1");
		thread1.start();

		Thread thread2 = new MyThread();
		thread2.setDaemon(true); // 데몬 스레드
		thread2.setName("thread2");
		thread2.start();
		
		Thread.sleep(3500);
	}
}
