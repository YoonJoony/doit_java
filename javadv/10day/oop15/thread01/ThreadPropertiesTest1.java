package oop15.thread01;

public class ThreadPropertiesTest1 {
	public static void main(String[] args) {
		Thread cuThread = Thread.currentThread(); // 현재 current 얻어오기
		System.out.println("현재 스레드의 이름 : " + cuThread.getName());
		System.out.println("동작하는 스레드의 개수 : " + Thread.activeCount());
		
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + 1 + "번째 스레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		//스레드의 개수 얻어오기
		System.out.println("동작하는 스레드의 개수 : " + Thread.activeCount());
	}
}
