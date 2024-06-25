package oop17.thread01;

public class SyncTest {
	public static void main(String[] args) throws InterruptedException {
		MyData myData = new MyData();
		
		Thread plusThread1 = new PlusThread();
		plusThread1.setName("plusThread");
		plusThread1.start();
		
		Thread.sleep(1000);
		
		Thread plusThread2 = new PlusThread();
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
		Thread.sleep(1000);
	}
}
