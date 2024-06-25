package oop11.inner02;

public class Inner_A {
	int a = 3;
	int b = 4;
	
	void abc() {
		System.out.println("A 클래스 메서드");
	}
	
	class Inner_B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		void bcd() {
			// 이너 클래스 멤버 및 메서드 사용
			System.out.println(b);
			abc();
			// 아우터 클래스 멤버 및 메서드 사용
			System.out.println(Inner_A.this.a);
			System.out.println(Inner_A.this.b);
			Inner_A.this.abc();
		}
	}
}
