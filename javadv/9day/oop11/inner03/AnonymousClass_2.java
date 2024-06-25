package oop11.inner03;

import oop05.modifire01Test.C;

class A438 {
	C438 c = new C438() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	void abc() {
		c.bcd();
	}
}
interface C438 {
	public abstract void bcd();
}
public class AnonymousClass_2 {
	public static void main(String[] args) {
		A438 a438 = new A438();
		a438.abc();
	}
}
