package oop14.exception01;

public class ThreadTest01 {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		a.abc();
		
		B b = new B();
		b.abc();
	}
}
