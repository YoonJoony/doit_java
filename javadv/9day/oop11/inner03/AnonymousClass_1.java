package oop11.inner03;

class A437 {
	C437 c = new B437();
	void abc() {
		c.bcd();
	}
	
	class B437 implements C437 {
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
}
interface C437 {
	public abstract void bcd();
}


public class AnonymousClass_1 {
	public static void main(String[] args) {
		A437 a437 = new A437();
		a437.abc();
	}
}
