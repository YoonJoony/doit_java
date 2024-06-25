interface A418{
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B418 implements A418 {
	public void abc() {
		A418.super.abc();
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod_2 {
	public static void main(String[] args) {
		A418 a1 = new B418();
		
		a1.abc();
	}
}
