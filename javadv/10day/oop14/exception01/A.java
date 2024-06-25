package oop14.exception01;

public class A {
	void abc() {
		bcd();
		
		System.out.println("종료");
	}

	private void bcd() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
