package oop11.inner03;

interface A443 {
	public abstract void abc();
}

class C443 {
	void cde(A443 a) {
		a.abc();
	}
}

public class AnonymousClass_4 {
	public static void main(String[] args) {
		C443 c = new C443();
		A443 a = new A443() {
			
			@Override
			public void abc() {
				// TODO Auto-gepunerated method stub
				System.out.println("입력매개변수 전달");
			}
		};
		c.cde(a);
//		c.cde(new A() {
//			
//		});
	}
}
