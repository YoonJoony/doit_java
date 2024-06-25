package oop11.inner02;

import basic.A;

public class InnerTest {
	public static void main(String[] args) {
		Inner_A a = new Inner_A();
		Inner_A.Inner_B b = a.new Inner_B();
		b.bcd();
	}
}
