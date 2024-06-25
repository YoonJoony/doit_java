interface A416{
	void abc();
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	}
}

class B416 implements A416 {
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class C416 implements A416 {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}
public class DefaultMethod_1 {
	public static void main(String[] args) {
		A416 a1 = new B416();
		A416 a2 = new C416();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}
}
