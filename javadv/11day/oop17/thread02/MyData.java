package oop17.thread02;

public class MyData {
	int data = 3;
	
	public void plusData() {
		synchronized (this) {
			int mydata = data;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			data = mydata + 1; // 값을 1 증가	
		}
	}	
}
