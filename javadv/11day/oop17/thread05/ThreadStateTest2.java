package oop17.thread05;

public class ThreadStateTest2 {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.setName("m1");
		m1.yieldFlag = false;
		m1.setDaemon(false);
		m1.start();
		
		MyThread m2 = new MyThread();
		m2.setName("m2");
		m2.yieldFlag = false;
		m2.setDaemon(true);
		m2.start();
	}
}
