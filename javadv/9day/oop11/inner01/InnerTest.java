package oop11.inner01;

import oop11.inner01.*;

public class InnerTest {
	public static void main(String[] args) {
		Inner_A a = new Inner_A();
		a.abc();
		Inner_A.Inner_B a_b = a.new Inner_B();
		a_b.bcd();
	}
}
