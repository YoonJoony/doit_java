package oop14.exception01;

public class B {
	void abc() throws InterruptedException {
		bcd();
	}

	private void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
}
