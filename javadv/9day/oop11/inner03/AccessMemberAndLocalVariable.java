package oop11.inner03;

class A434 {
	int a = 3;
	void abc() {
		int b = 5;
		
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				// b =  7; -> 지역 이너 클래스에서 사용하는 지역 변수는 자동 final 선언
			}
		}
		B bb = new B();
		bb.bcd();
	}
			
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A434 a = new A434();
		a.abc();
	}
}
