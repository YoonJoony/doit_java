package oop09.interface04;

public class InterTest {
	public static void main(String[] args) {
		InterImpl impl = new InterImpl();
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
	}
}
