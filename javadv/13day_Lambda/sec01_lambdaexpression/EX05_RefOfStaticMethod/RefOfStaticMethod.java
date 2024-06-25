package sec01_lambdaexpression.EX05_RefOfStaticMethod;

interface A {
	void abc();
}

class B{
	static void bcd() {
		System.out.println("메서드");
	}
}

public class RefOfStaticMethod {
	public static void main(String[] args) {
		// 1. 정적메서드 참조
		// 1. 익명이너클래스 방법
		A a1 = new A() {
			public void abc() {
				B.bcd();
			};
		};
		
		A a2 = () -> {B.bcd();};
		A a3 = B::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
