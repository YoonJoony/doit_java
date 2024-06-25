package oop11.inner03;

public class A {
	int a = 3;
	static int b = 4;
	
	void method1() {
		System.out.println("A클래스 ");
	}
	
	static void method2() {
		System.out.println("Outer 클래스 A의 static method2() 수정");
	}
	
	static class B {
		void bcd() {
			//필드 사용
			System.out.println(b);
			
			//메서드 사용
			//method1
			method2();
		}
	}
}
