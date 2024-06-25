package oop17.thread03;

public class MyData {
	synchronized void abc() throws InterruptedException {
		for(int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			Thread.sleep(1000);
		}
	}
}
