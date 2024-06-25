package sec01_lambdaexpression.EX03_RefOfIntanceMethod_Type1_1;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("메소드");
	}
}

public class RefOfIntanceMethod_Type1_1 {
	public static void main(String[] args) {
		// 1. 인스턴스 메소드 참조 type1 익명이너클래스
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			};
		};
		
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		B b = new B();
		A a3 = b::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
