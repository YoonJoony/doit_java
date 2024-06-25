package oop16.thread02;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(long i = 0; i < 1000_000_000; i++) { // 시간 지연용
			System.out.println(getName() + " 우선순위 : " + getPriority());
		}
	}
}
