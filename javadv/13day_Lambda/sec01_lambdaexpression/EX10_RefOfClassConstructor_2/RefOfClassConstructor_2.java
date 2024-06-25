package sec01_lambdaexpression.EX10_RefOfClassConstructor_2;

interface A {
	B abc(int k);
}

class B {
	B() {
		System.out.println("기본 생성자");
	}
	
	B(int k) {
		System.out.println("매개변수 생성자");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {
		A a1 = new A() {
			public B abc(int k) {
				return new B();
			};
		};
		
		A a2 = (int b) -> new B(b);
		A a3 = B::new;
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
	}
}
