package oop17.thread05;

public class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {
				Thread.yield();
			} else {
				System.out.println(getName() + " 실행");
				for(int i = 0; i < 1000000000; i++) {
					// 시간 지연
				}
			}
		}
	}
}
