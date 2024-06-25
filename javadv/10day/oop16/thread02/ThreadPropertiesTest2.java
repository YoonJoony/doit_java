package oop16.thread02;

public class ThreadPropertiesTest2{
	public static void main(String[] args) {
		// CPU 코어 수
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		
		for(int i = 0; i < 5; i++) {
			Thread thread = new MyThread();
			thread.setName(i + " 번쨰 스레드1");
		}
	}
}
