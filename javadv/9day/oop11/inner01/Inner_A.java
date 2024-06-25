package oop11.inner01;

public class Inner_A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 5;
	
	void abc() {
		System.out.println("Outer 크래스 A의 abc() 메서드");
	}
	
	class Inner_B {
		void bcd() {
			// Outer 클래스 필드 사용
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			abc();
		}
	}
}
