package oop17.thread04;

public class ThreadStateTest1 {
	public static void main(String[] args) {
		Thread.State state;
		
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000000000; i++) {
					
				}
			}
		};
		
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}
}
